package X;

import Y.ACListenerS130S0200000_28;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cla.et.newet.DubbingAuthorizationOperationEvent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10Gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("auto_dubbing_turnon_guide")
public final class C19218910Gt extends AbstractC20660115st<View> {
    public final int LL;
    public final Activity LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    public static void LJIIL(String str) {
        C207069161b.LJ(DubbingAuthorizationOperationEvent.class, new C017D() { // from class: X.017K
            @Override // X.C017D
            public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
                return C13BV.INSTANCE;
            }
        }, new AnonymousClass0175(), Collections.singletonList(new C0258006u("turn_on", str, null, "personal_homepage")), 16);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        View viewFindViewById;
        View viewFindViewById2 = this.LLILLJJLI.findViewById(this.LL);
        C746760TRa.LIZ().LJLLILLLL();
        LJIIL("show");
        C20515215Pi c20515215Pi = new C1257230ioz((ViewGroup) this.LLILLJJLI.findViewById(this.LL), true).LIZ;
        c20515215Pi.LIZ.LJIILLIIL = true;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_text_to_speech;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZIZ = ((Number) this.LLILZ.getValue()).intValue();
        c419910GdJ.LIZJ = ((Number) this.LLILZ.getValue()).intValue();
        c20515215Pi.LJFF(c419910GdJ);
        c20515215Pi.LIZ.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        c20515215Pi.LIZ.LJIILJJIL = new AwS607S0100000_28(this, 215);
        c20515215Pi.LIZ.LJ = this.LLILLJJLI.getString(2131845987);
        c20515215Pi.LIZ.LJFF = this.LLILLJJLI.getString(2131845986);
        c20515215Pi.LIZ.LJI = this.LLILLJJLI.getString(2131845985);
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.pcs)) != null) {
            viewFindViewById.setClickable(true);
            C786410Ut5.I7(new ACListenerS130S0200000_28(this, c20515215Pi, 40), viewFindViewById);
        }
        return viewFindViewById2;
    }

    public C19218910Gt(C0TGX c0tgx, C19EG c19eg) {
        super(c0tgx);
        this.LL = R.id.s0t;
        this.LLILLJJLI = c19eg;
        this.LLILLL = 8007;
        this.LLILZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(326));
    }
}
