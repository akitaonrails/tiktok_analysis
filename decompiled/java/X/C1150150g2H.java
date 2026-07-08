package X;

import Y.AfS186S0100000_17;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.wallet.data.api.IExchangeApi;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeUpdateAddressRequest;
import com.bytedance.android.live.wallet.data.model.exchange.UpdateBillingAddressData;
import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeTaxDialogVM;
import com.lynx.tasm.behavior.shadow.text.AbsoluteSizeSpan;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0g2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150150g2H extends FrameLayout {
    public final BillingAddressVM LL;

    public final BillingAddressVM getVm() {
        return this.LL;
    }

    public C1150150g2H(Context context, ExchangeTaxDialogVM exchangeTaxDialogVM) {
        super(context);
        this.LL = exchangeTaxDialogVM;
        addView(C786410Ut5.Sd(R.layout.hxc, C786410Ut5.ne(context), null));
    }

    public final void LIZ(String str, C1150170g2J c1150170g2J) {
        boolean z;
        String string;
        TextView textView = (TextView) findViewById(R.id.z8g);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (c1150170g2J != null) {
            spannableStringBuilder.append((CharSequence) "\n\n");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (c1150170g2J.LJFF) {
                string = c1150170g2J.LJI;
            } else {
                StringBuilder sb = new StringBuilder();
                if (c1150170g2J.LIZLLL.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb.append(c1150170g2J.LIZLLL);
                    sb.append(", ");
                }
                if (c1150170g2J.LIZJ.length() > 0) {
                    sb.append(c1150170g2J.LIZJ);
                    sb.append(", ");
                }
                if (c1150170g2J.LJ.length() > 0) {
                    sb.append(c1150170g2J.LJ);
                    sb.append(", ");
                }
                if (c1150170g2J.LIZIZ.length() > 0) {
                    sb.append(c1150170g2J.LIZIZ);
                    sb.append(", ");
                }
                if (c1150170g2J.LIZ.length() > 0) {
                    sb.append(c1150170g2J.LIZ);
                }
                string = sb.toString();
            }
            String strLJIJJ = C497740JfY.LJIJJ(2131841029, string);
            spannableStringBuilder2.append((CharSequence) strLJIJJ);
            int iLJJJ = a0.LJJJ(strLJIJJ, string, 0, false, 6);
            int length = iLJJJ + string.length();
            AbstractC1150140g2G abstractC1150140g2G = new AbstractC1150140g2G() { // from class: X.0g29
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [X.0g2F] */
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    String string2;
                    String str2;
                    C1150170g2J c1150170g2J2;
                    C1150170g2J c1150170g2J3;
                    final BillingAddressVM vm = this.LL.getVm();
                    vm.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_billing_address_change_click");
                    c474500IjALIZ.LJJII("live_gift", "request_page");
                    c474500IjALIZ.LJJII("anchor_income", "charge_reason");
                    c474500IjALIZ.LIZ();
                    C1149890g1r c1149890g1r = vm.LLJJIII;
                    if (c1149890g1r != null && (c1150170g2J3 = c1149890g1r.LIZ) != null) {
                        string2 = c1150170g2J3.toString();
                    } else {
                        string2 = null;
                    }
                    C1149890g1r c1149890g1r2 = vm.LLJJIII;
                    if (c1149890g1r2 == null || (c1150170g2J2 = c1149890g1r2.LIZ) == null || (str2 = c1150170g2J2.LIZ) == null) {
                        str2 = "";
                    }
                    ((ILocationPickerService) C1161920gLG.LIZJ(ILocationPickerService.class)).sH0(vm.LLJIJIL.context(), str2, string2, new InterfaceC21691419uq() { // from class: X.0g28
                        @Override // X.InterfaceC21691419uq
                        public final void LJIIJ(String str3) {
                            C1803440x1y.LIZIZ("ttlive_wallet_exchange_open_location_pick", new C1149180g0i(10002, str3));
                        }

                        @Override // X.InterfaceC21691419uq
                        public final void LIZ(boolean z2, LocationAddress locationAddress) {
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            String str8;
                            C1150170g2J c1150170g2J4;
                            String str9;
                            String str10;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            if (z2) {
                                BillingAddressVM billingAddressVM = vm;
                                C1149890g1r c1149890g1r3 = billingAddressVM.LLJJIII;
                                String str15 = "";
                                if (c1149890g1r3 != null) {
                                    LocationObject locationObject = locationAddress.state;
                                    if (locationObject == null || (str7 = locationObject.name) == null) {
                                        str7 = "";
                                    }
                                    if (str7.length() > 0) {
                                        LocationObject locationObject2 = locationAddress.region;
                                        if (locationObject2 == null || (str11 = locationObject2.name) == null) {
                                            str11 = "";
                                        }
                                        LocationObject locationObject3 = locationAddress.state;
                                        if (locationObject3 == null || (str12 = locationObject3.name) == null) {
                                            str12 = "";
                                        }
                                        LocationObject locationObject4 = locationAddress.county;
                                        if (locationObject4 == null || (str13 = locationObject4.name) == null) {
                                            str13 = "";
                                        }
                                        LocationObject locationObject5 = locationAddress.city;
                                        if (locationObject5 == null || (str14 = locationObject5.name) == null) {
                                            str14 = "";
                                        }
                                        c1150170g2J4 = new C1150170g2J(str11, str12, str13, str14, null, 16);
                                    } else {
                                        LocationObject locationObject6 = locationAddress.province;
                                        if (locationObject6 == null || (str8 = locationObject6.name) == null) {
                                            str8 = "";
                                        }
                                        if (str8.length() > 0) {
                                            LocationObject locationObject7 = locationAddress.region;
                                            if (locationObject7 == null || (str9 = locationObject7.name) == null) {
                                                str9 = "";
                                            }
                                            LocationObject locationObject8 = locationAddress.province;
                                            if (locationObject8 == null || (str10 = locationObject8.name) == null) {
                                                str10 = "";
                                            }
                                            c1150170g2J4 = new C1150170g2J(str9, null, null, null, str10, 14);
                                        } else {
                                            c1150170g2J4 = new C1150170g2J(null, null, null, null, null, 31);
                                        }
                                    }
                                    c1149890g1r3.LIZ = c1150170g2J4;
                                    billingAddressVM.LLJJIII = c1149890g1r3;
                                    billingAddressVM.LLJIJIL.LIZ(c1149890g1r3);
                                }
                                BillingAddressVM billingAddressVM2 = vm;
                                billingAddressVM2.getClass();
                                ExchangeUpdateAddressRequest exchangeUpdateAddressRequest = new ExchangeUpdateAddressRequest(null, null, null, null);
                                if (Intrinsics.LJFF(locationAddress.LIZ(), "CA")) {
                                    exchangeUpdateAddressRequest.countryCode = locationAddress.LIZ();
                                    LocationObject locationObject9 = locationAddress.province;
                                    if (locationObject9 != null && (str6 = locationObject9.asciName) != null) {
                                        str15 = str6;
                                    }
                                    exchangeUpdateAddressRequest.stateCode = str15;
                                } else if (Intrinsics.LJFF(locationAddress.LIZ(), "US")) {
                                    exchangeUpdateAddressRequest.countryCode = locationAddress.LIZ();
                                    LocationObject locationObject10 = locationAddress.state;
                                    if (locationObject10 == null || (str3 = locationObject10.code) == null) {
                                        str3 = "";
                                    }
                                    exchangeUpdateAddressRequest.stateCode = str3;
                                    LocationObject locationObject11 = locationAddress.county;
                                    if (locationObject11 == null || (str4 = locationObject11.asciName) == null) {
                                        str4 = "";
                                    }
                                    exchangeUpdateAddressRequest.county = str4;
                                    LocationObject locationObject12 = locationAddress.city;
                                    if (locationObject12 != null && (str5 = locationObject12.asciName) != null) {
                                        str15 = str5;
                                    }
                                    exchangeUpdateAddressRequest.city = str15;
                                }
                                C480460Ism.LIZ().getClass();
                                billingAddressVM2.LLJJI.LIZ(((IExchangeApi) C480460Ism.LIZLLL(IExchangeApi.class)).updateBillingAddress(exchangeUpdateAddressRequest).LJIILIIL(new C0UO0()).LJJIJIIJIL(new C09JN() { // from class: X.0g2E
                                    @Override // X.C09JN
                                    public final void accept(Object obj) throws C1149180g0i {
                                        C1C7U.LIZ("BillingAddressVM@e91b.saveLocation$disposable$1");
                                        if (((UpdateBillingAddressData) ((BaseResponse) obj).data).isSaved) {
                                            C1C7U.LIZIZ("BillingAddressVM@e91b.saveLocation$disposable$1");
                                            return;
                                        }
                                        throw new C1149180g0i("is saved false");
                                    }
                                }).LJJLL(new AfS186S0100000_17(billingAddressVM2, 106), new AfS186S0100000_17(billingAddressVM2, 107)));
                            }
                        }
                    }, new InterfaceC21691519ur() { // from class: X.0g2F
                        @Override // X.InterfaceC21691519ur
                        public final void LJJJJ() {
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_exchange_billing_address_change_done");
                            c474500IjALIZ2.LJJII("live_gift", "request_page");
                            c474500IjALIZ2.LJJII("anchor_income", "charge_reason");
                            c474500IjALIZ2.LIZ();
                        }

                        @Override // X.InterfaceC21691519ur
                        public final void LJJJJI(String str3) {
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_exchange_billing_address_location_show");
                            c474500IjALIZ2.LJJII("live_gift", "request_page");
                            c474500IjALIZ2.LJJII("anchor_income", "charge_reason");
                            c474500IjALIZ2.LJJII(str3, "page_type");
                            c474500IjALIZ2.LIZ();
                        }
                    });
                }
            };
            C1150160g2I c1150160g2I = new C1150160g2I();
            c1150160g2I.LIZIZ = iLJJJ;
            c1150160g2I.LIZJ = length;
            c1150160g2I.LIZLLL = 33;
            c1150160g2I.LIZ(new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ewy, getContext())));
            c1150160g2I.LIZ(new AbsoluteSizeSpan());
            c1150160g2I.LIZ(abstractC1150140g2G);
            c1150160g2I.LIZIZ(spannableStringBuilder2);
            C1119920fFW.LJ(getContext(), spannableStringBuilder2, iLJJJ, length, 33, 6, 500);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
