package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CartLine;
import com.shopify.checkout.models.CheckoutCompletedPayload;
import com.shopify.checkout.models.CheckoutStatePayload;
import com.shopify.checkout.models.Money;
import com.shopify.checkout.models.OrderDetails;
import com.shopify.checkout.models.ProgressButtonStage;
import com.shopify.checkout.models.ProgressButtonState;
import com.shopify.checkout.models.errors.CheckoutErrorPayload;
import com.shopify.checkout.models.errors.DefaultsErrorPayload;
import com.shopify.checkout.models.errors.InternalErrorPayload;
import com.shopify.checkout.models.errors.UnrecoverableErrorPayload;
import com.shopify.checkout.models.errors.VaultedPaymentErrorPayload;
import com.shopify.checkout.models.errors.violations.DeliveryErrorPayload;
import com.shopify.checkout.models.errors.violations.InventoryErrorPayload;
import com.ss.android.ugc.aweme.checkout.CheckoutBtnState;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054340dXk implements InterfaceC1054380dXo {
    public final WebView LIZ;
    public final C1054420dXs LIZIZ;
    public final Boolean LIZJ;
    public final InterfaceC1054310dXh LIZLLL;
    public final C1039800dAI LJ;
    public CartInfo LJFF;
    public boolean LJI;

    @Override // X.InterfaceC1054380dXo
    public final void LJ() {
    }

    @Override // X.InterfaceC1054380dXo
    public final void onInit() {
        this.LJI = true;
    }

    @Override // X.InterfaceC1054380dXo
    public final void LIZIZ(CheckoutCompletedPayload checkoutCompletedPayload) {
        String str;
        OrderDetails orderDetails = checkoutCompletedPayload.orderDetails;
        C1227904rF.LIZ.getClass();
        String json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), orderDetails);
        OrderDetails.PaymentMethod paymentMethod = (OrderDetails.PaymentMethod) C13LP.LJJJLL(checkoutCompletedPayload.orderDetails.paymentMethods);
        if (paymentMethod != null) {
            str = paymentMethod.paymentType;
        } else {
            str = null;
        }
        InterfaceC1054310dXh interfaceC1054310dXh = this.LIZLLL;
        if (interfaceC1054310dXh != null) {
            interfaceC1054310dXh.LJ(json, checkoutCompletedPayload.orderDetails.id, checkoutCompletedPayload.flowType, checkoutCompletedPayload.confirmationURL, str);
        }
    }

    @Override // X.InterfaceC1054380dXo
    public final void LIZJ(CheckoutStatePayload checkoutStatePayload) {
        CartInfo cartInfo = checkoutStatePayload.cart;
        this.LJFF = cartInfo;
        C1054420dXs c1054420dXs = this.LIZIZ;
        Iterator<CartLine> it2 = cartInfo.lines.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += it2.next().quantity;
        }
        c1054420dXs.setTotalQuantity(i);
        Money money = cartInfo.price.total;
        if (money != null) {
            C1054420dXs c1054420dXs2 = this.LIZIZ;
            Float fValueOf = Float.valueOf(money.amount);
            String str = money.currencyCode;
            c1054420dXs2.getClass();
            if (fValueOf != null && str != null) {
                C1041360dCo c1041360dCo = C1041360dCo.LIZ;
                float fFloatValue = fValueOf.floatValue();
                Currency currency = Currency.getInstance(str);
                Context context = c1054420dXs2.getContext();
                c1041360dCo.getClass();
                c1054420dXs2.LLJJ = C1041360dCo.LJI(fFloatValue, currency, C1041360dCo.LIZLLL(context));
            }
        }
        C1227904rF.LIZ.getClass();
        String json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), cartInfo);
        InterfaceC1054310dXh interfaceC1054310dXh = this.LIZLLL;
        if (interfaceC1054310dXh != null) {
            interfaceC1054310dXh.LJI(json, checkoutStatePayload.flowType, checkoutStatePayload.cart);
        }
    }

    @Override // X.InterfaceC1054380dXo
    public final void LIZLLL(List<? extends InterfaceC1054410dXr> list) {
        C443120HZe c443120HZe;
        int type;
        C1051130dSZ c1051130dSZ;
        WebResourceResponse response;
        Integer numValueOf;
        for (InterfaceC1054410dXr interfaceC1054410dXr : list) {
            boolean z = interfaceC1054410dXr instanceof InternalErrorPayload;
            int i = -1;
            if (z) {
                InternalErrorPayload internalErrorPayload = (InternalErrorPayload) interfaceC1054410dXr;
                int i2 = C1054360dXm.LIZ[internalErrorPayload.code.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            i = 2;
                        }
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                Exception exc = internalErrorPayload.underlyingError;
                if ((exc instanceof C1051130dSZ) && (c1051130dSZ = (C1051130dSZ) exc) != null && (response = c1051130dSZ.getResponse()) != null && (numValueOf = Integer.valueOf(response.getStatusCode())) != null && numValueOf.intValue() == 401) {
                    type = EnumC1054350dXl.AUTHENTICATION_ERROR.getType();
                } else {
                    type = EnumC1054350dXl.INTERNAL_ERROR.getType();
                }
                c443120HZe = new C443120HZe(Integer.valueOf(type), Integer.valueOf(i), internalErrorPayload.reason);
            } else if (!(interfaceC1054410dXr instanceof InventoryErrorPayload)) {
                if (interfaceC1054410dXr instanceof DeliveryErrorPayload) {
                    if (interfaceC1054410dXr instanceof DeliveryErrorPayload) {
                        c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.VIOLATION_ERROR.getType()), 1, ((DeliveryErrorPayload) interfaceC1054410dXr).reason);
                    } else {
                        c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.VIOLATION_ERROR.getType()), -1, "");
                    }
                } else if (interfaceC1054410dXr instanceof CheckoutErrorPayload) {
                    CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) interfaceC1054410dXr;
                    switch (C1054360dXm.LIZIZ[checkoutErrorPayload.type.ordinal()]) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            i = 1;
                            break;
                        case 3:
                            i = 2;
                            break;
                        case 4:
                            i = 3;
                            break;
                        case 5:
                            i = 4;
                            break;
                        case 6:
                            i = 5;
                            break;
                        case 7:
                            i = 100;
                            break;
                    }
                    c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.CHECKOUT_ERROR.getType()), Integer.valueOf(i), checkoutErrorPayload.reason);
                } else if (interfaceC1054410dXr instanceof VaultedPaymentErrorPayload) {
                    VaultedPaymentErrorPayload vaultedPaymentErrorPayload = (VaultedPaymentErrorPayload) interfaceC1054410dXr;
                    int i3 = C1054360dXm.LIZJ[vaultedPaymentErrorPayload.code.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            i = 1;
                        }
                    } else {
                        i = 0;
                    }
                    c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.VAULTED_PAYMENT_ERROR.getType()), Integer.valueOf(i), vaultedPaymentErrorPayload.reason);
                } else if (interfaceC1054410dXr instanceof DefaultsErrorPayload) {
                    DefaultsErrorPayload defaultsErrorPayload = (DefaultsErrorPayload) interfaceC1054410dXr;
                    int i4 = C1054360dXm.LIZLLL[defaultsErrorPayload.code.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i = 2;
                            }
                        } else {
                            i = 1;
                        }
                    } else {
                        i = 0;
                    }
                    c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.DEFAULTS_ERROR.getType()), Integer.valueOf(i), defaultsErrorPayload.reason);
                } else if (interfaceC1054410dXr instanceof UnrecoverableErrorPayload) {
                    UnrecoverableErrorPayload unrecoverableErrorPayload = (UnrecoverableErrorPayload) interfaceC1054410dXr;
                    int i5 = C1054360dXm.LJ[unrecoverableErrorPayload.code.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            i = 1;
                        }
                    } else {
                        i = 0;
                    }
                    c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.UNRECOVERABLE_ERROR.getType()), Integer.valueOf(i), unrecoverableErrorPayload.reason);
                } else {
                    c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.CUSTOM_ERROR.getType()), -1, "other reason");
                }
            } else {
                c443120HZe = new C443120HZe(Integer.valueOf(EnumC1054350dXl.VIOLATION_ERROR.getType()), 0, ((InventoryErrorPayload) interfaceC1054410dXr).reason);
            }
            int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
            int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
            String str = (String) c443120HZe.getThird();
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(interfaceC1054410dXr);
            InterfaceC1054310dXh interfaceC1054310dXh = this.LIZLLL;
            if (interfaceC1054310dXh != null) {
                interfaceC1054310dXh.LJFF(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str, strLJI);
            }
            if ((interfaceC1054410dXr instanceof UnrecoverableErrorPayload) || z) {
                InterfaceC1054310dXh interfaceC1054310dXh2 = this.LIZLLL;
                if (interfaceC1054310dXh2 != null) {
                    interfaceC1054310dXh2.LJII(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str);
                }
            }
        }
    }

    @Override // X.InterfaceC1054380dXo
    public final void LJFF(boolean z) {
        int i;
        C1054420dXs c1054420dXs = this.LIZIZ;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c1054420dXs);
    }

    @Override // X.InterfaceC1054380dXo
    public final void LJI(CheckoutStatePayload checkoutStatePayload) {
        C1041360dCo c1041360dCo = C1041360dCo.LIZ;
        WebView webView = this.LIZ;
        c1041360dCo.getClass();
        C1544770qIl.LIZ(webView, new C0X7O() { // from class: X.0X7n
            @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
            public final String LJFF(Uri uri, WebView webView2) throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("eventType", "continueCheckout");
                return C786410Ut5.J3(jSONObject);
            }
        });
        C1227904rF.LIZ.getClass();
        GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), checkoutStatePayload.cart);
        InterfaceC1054310dXh interfaceC1054310dXh = this.LIZLLL;
        if (interfaceC1054310dXh != null) {
            interfaceC1054310dXh.LIZJ();
        }
    }

    @Override // X.InterfaceC1054380dXo
    public final void LIZ(ProgressButtonState progressButtonState, ProgressButtonStage progressButtonStage) {
        CheckoutBtnState checkoutBtnState;
        if (Intrinsics.LJFF(this.LIZJ, Boolean.TRUE) && !this.LJI) {
            return;
        }
        int i = C1054370dXn.LIZ[progressButtonState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    checkoutBtnState = CheckoutBtnState.LOADING;
                } else {
                    throw new C1954807lC();
                }
            } else {
                checkoutBtnState = CheckoutBtnState.DISABLED;
            }
        } else {
            checkoutBtnState = CheckoutBtnState.ENABLED;
        }
        InterfaceC1054310dXh interfaceC1054310dXh = this.LIZLLL;
        if (interfaceC1054310dXh != null) {
            interfaceC1054310dXh.LIZLLL(checkoutBtnState, progressButtonStage);
        }
    }

    public C1054340dXk(WebView webView, C1054420dXs c1054420dXs, Boolean bool, C1041380dCq c1041380dCq) {
        this.LIZ = webView;
        this.LIZIZ = c1054420dXs;
        this.LIZJ = bool;
        this.LIZLLL = c1041380dCq;
        this.LJ = new C1039800dAI(webView, this);
        c1054420dXs.setPlaceOrderClickListener(new AwS595S0100000_16(this, 67));
    }
}
