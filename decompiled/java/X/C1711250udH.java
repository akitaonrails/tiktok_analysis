package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundOption;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0udH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711250udH extends FrameLayout {
    public EnumC1709240ua2 LL;
    public EnumC1711310udN LLILLJJLI;
    public String LLILLL;
    public InterfaceC1711260udI LLILZ;
    public Boolean LLILZIL;
    public WeakReference<InterfaceC1711270udJ> LLILZLL;
    public Function1<? super AbstractC1711120ud4, Unit> LLIZ;
    public Function1<? super String, Unit> LLIZLLLIL;

    public C1711250udH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1708610uZ1.LIZ.remove(this.LLILLL);
    }

    public final void setRefundActionStateCallback$cashier_release(Function1<? super AbstractC1711120ud4, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setRefundCashierBasicInfo(RefundCashierBasicInfo refundCashierBasicInfo) {
        LIZJ(null, refundCashierBasicInfo);
    }

    public final void setRefundLinkActionCallback$cashier_release(Function1<? super String, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setRefundOptionChangeCallback(InterfaceC1711270udJ interfaceC1711270udJ) {
        this.LLILZLL = new WeakReference<>(interfaceC1711270udJ);
    }

    public final void setTheme(int i) {
        EnumC1709240ua2 enumC1709240ua2LIZ = C1708970uZb.LIZ(Integer.valueOf(i));
        if (this.LL != enumC1709240ua2LIZ) {
            this.LL = enumC1709240ua2LIZ;
            InterfaceC1711260udI interfaceC1711260udI = this.LLILZ;
            if (interfaceC1711260udI != null) {
                interfaceC1711260udI.LIZ(enumC1709240ua2LIZ);
            }
        }
    }

    public final void setUIMode(EnumC1711310udN enumC1711310udN) {
        this.LLILLJJLI = enumC1711310udN;
        InterfaceC1711260udI interfaceC1711260udI = this.LLILZ;
        if (interfaceC1711260udI != null) {
            interfaceC1711260udI.LIZJ(enumC1711310udN);
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        String strValueOf;
        String str;
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        InterfaceC1708000uY2 interfaceC1708000uY2LIZ = c1708030uY5.LIZ(new C1708080uYA(this.LLILLL));
        if (z) {
            strValueOf = null;
        } else if (z2) {
            strValueOf = String.valueOf(EnumC1709120uZq.REFUND_RESULT_CLIENT_ERROR_DEFAULT.getErrorCode());
        } else {
            strValueOf = String.valueOf(EnumC1709120uZq.REFUND_RESULT_SERVER_ERROR_CBI_INVALID.getErrorCode());
        }
        interfaceC1708000uY2LIZ.LIZIZ("set_cbi", null, strValueOf, z ? 1 : 0);
        if (this.LLILLJJLI == EnumC1711310udN.EMBEDDED) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            linkedHashMap.put("result", str);
            c1708030uY5.LIZ(new C1708080uYA(this.LLILLL)).LJ(linkedHashMap, new AwS605S0100000_26(this, 383));
        }
    }

    public final void LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILLL = str;
        C1708610uZ1.LIZ(str, linkedHashMap);
    }

    public final void LIZJ(String str, RefundCashierBasicInfo refundCashierBasicInfo) {
        InterfaceC1711260udI c1712640ufW;
        List<RefundOption> list;
        if (this.LLILLJJLI == EnumC1711310udN.EMBEDDED) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("priority_region", C2222691Bz1.LIZ());
            C1708030uY5.LIZ.LIZ(new C1708080uYA(this.LLILLL)).LIZLLL(linkedHashMap, new AwS605S0100000_26(this, 493));
        }
        C1708030uY5.LIZ.LIZ(new C1708080uYA(this.LLILLL)).LIZJ("set_cbi", null);
        if (refundCashierBasicInfo.emptyRefundOptionsContent == null && ((list = refundCashierBasicInfo.refundOptions) == null || list.isEmpty())) {
            LIZ(false, false);
            return;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "V2");
        if (!Intrinsics.LJFF(this.LLILZIL, Boolean.valueOf(zLJFF)) || this.LLILZ == null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
            if (zLJFF) {
                c1712640ufW = new C1712630ufV(getContext());
            } else {
                c1712640ufW = new C1712640ufW(getContext());
            }
            this.LLILZIL = Boolean.valueOf(zLJFF);
            this.LLILZ = c1712640ufW;
            addView(c1712640ufW.getContentView(), new FrameLayout.LayoutParams(-1, -2));
            c1712640ufW.LIZJ(this.LLILLJJLI);
            c1712640ufW.LIZ(this.LL);
        }
        InterfaceC1711260udI interfaceC1711260udI = this.LLILZ;
        if (interfaceC1711260udI != null) {
            interfaceC1711260udI.LIZIZ(new C1711330udP(refundCashierBasicInfo, this.LLILLJJLI, this.LL, this.LLILLL, new AwS605S0100000_26(this, 385), new AwS605S0100000_26(this, 494), new AwS605S0100000_26(this, 495)));
        }
        if (refundCashierBasicInfo.refundOptions != null && (!r0.isEmpty())) {
            LIZ(true, false);
        } else if (refundCashierBasicInfo.emptyRefundOptionsContent != null) {
            LIZ(false, true);
        }
    }

    public C1711250udH(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = EnumC1709240ua2.DEFAULT;
        this.LLILLJJLI = EnumC1711310udN.EMBEDDED;
        this.LLILLL = "";
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZ("refund_view", "h5", C1697810uHb.LJIILJJIL("credit_wallet"));
    }
}
