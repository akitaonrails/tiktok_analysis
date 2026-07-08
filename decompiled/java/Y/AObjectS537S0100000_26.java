package Y;

import X.C098200Yq;
import X.C1019103yf;
import X.C1389880mGw;
import X.C1745480vWU;
import X.C1749160vcQ;
import X.C189200o6;
import X.C20145713s7;
import X.C786410Ut5;
import X.EnumC1014603xw;
import X.InterfaceC1631620sYq;
import X.InterfaceC1749170vcR;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PudoInfoItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public class AObjectS537S0100000_26 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS537S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS537S0100000_26 aObjectS537S0100000_26, Object obj, Object obj2, Object obj3) {
        Object c098200Yq;
        String str = (String) obj2;
        if (str != null && !a0.LJJJIL(str) && u.LJJIIJZLJL(str, "aweme", false)) {
            try {
                SmartRouter.buildRoute(((TuxTextView) aObjectS537S0100000_26.l0).getContext(), UriProtector.parse(str).toString()).open();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1019103yf.LIZ(EnumC1014603xw.ERR10005, thM5exceptionOrNullimpl, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS537S0100000_26 aObjectS537S0100000_26, Object obj, Object obj2, Object obj3) {
        String str;
        Object objH2;
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj3;
        if (Intrinsics.LJFF(obj2, "ec_action://copy") && eCRichTextExtraInfo != null && (str = eCRichTextExtraInfo.content) != null) {
            PudoInfoItemViewHolder pudoInfoItemViewHolder = (PudoInfoItemViewHolder) aObjectS537S0100000_26.l0;
            Context context = pudoInfoItemViewHolder.itemView.getContext();
            if (context == null) {
                objH2 = null;
            } else {
                try {
                    objH2 = C786410Ut5.H2(context, "clipboard");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.ERR54, e, null);
                }
            }
            C20145713s7.LIZJ((ClipboardManager) objH2, ClipData.newPlainText("", str), CertProviderManagerKt.findCert("bpea-gec_address_write", 1476399145));
            C1389880mGw c1389880mGw = new C1389880mGw(pudoInfoItemViewHolder.itemView);
            c1389880mGw.LJIIIIZZ(2131832957);
            c1389880mGw.LIZLLL(1000L);
            c1389880mGw.LJ(R.raw.icon_tick);
            c1389880mGw.LJI(R.attr.a1h);
            c1389880mGw.LJIIJ();
            C1745480vWU.LJ(pudoInfoItemViewHolder.W5().LLJJIJIL, "one_click_copy", null, null, 6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS537S0100000_26 aObjectS537S0100000_26, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        InterfaceC1749170vcR interfaceC1749170vcR = ((C1749160vcQ) aObjectS537S0100000_26.l0).LLIZLLLIL;
        if (interfaceC1749170vcR != null) {
            interfaceC1749170vcR.LIZ(view, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS537S0100000_26 aObjectS537S0100000_26, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        InterfaceC1749170vcR interfaceC1749170vcR = ((C1749160vcQ) aObjectS537S0100000_26.l0).LLIZLLLIL;
        if (interfaceC1749170vcR != null) {
            interfaceC1749170vcR.LIZIZ(view, str);
        }
        return Unit.LIZ;
    }
}
