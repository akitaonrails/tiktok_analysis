package X;

import Y.ACListenerS110S0200000_6;
import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0iVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("social_avatar_profile_floating_notice_popup")
public final class C1245250iVf extends AbstractC20660115st<View> {
    public final Activity LL;
    public final C1257230ioz LLILLJJLI;
    public final C364901bL LLILLL;
    public final C0HZD LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return C1253010iiB.LIZJ.LJJ();
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C20515215Pi c20515215Pi;
        C1257230ioz c1257230ioz = this.LLILLJJLI;
        if (c1257230ioz == null || (c20515215Pi = c1257230ioz.LIZ) == null) {
            c20515215Pi = new C20515215Pi(this.LL);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("building tuxFloatingNotice, imageResource is ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLL != null) {
            c20515215Pi.LJI(new AwS372S0200000_6(c688120Qyw, this, 106));
        }
        C0HWW c0hww = C0HWW.LIZ;
        String str = this.LLILZ.LIZIZ;
        c0hww.getClass();
        C0HWW.LJIIL("show", str);
        c20515215Pi.LJII(this.LLILZ.LIZJ);
        c20515215Pi.LIZ(2131820636);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJIIJ = 0;
        c1057450dcl.LJIILIIL = new ACListenerS110S0200000_6(this, c20515215Pi, 68);
        c1057450dcl.LJIIJJI = new View.OnClickListener() { // from class: X.0iVg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C2187451AjH.LIZ;
            }
        };
        c20515215Pi.LIZ.LJIILJJIL = new AwS585S0100000_6(this, 450);
        c20515215Pi.LJ();
        return c20515215Pi.LJ;
    }

    public C1245250iVf(InterfaceC20660715sz interfaceC20660715sz, Activity activity, C1257230ioz c1257230ioz, C364901bL c364901bL, C0HZD c0hzd) {
        super(interfaceC20660715sz);
        this.LL = activity;
        this.LLILLJJLI = c1257230ioz;
        this.LLILLL = c364901bL;
        this.LLILZ = c0hzd;
    }
}
