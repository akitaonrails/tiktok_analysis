package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* JADX INFO: renamed from: X.0Gwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432050Gwt {
    public View LIZ;
    public TuxTextView LIZIZ;
    public final C433060GyW LIZJ = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.0GyW
        @Override // X.InterfaceC989510brB
        public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C433050GyV(privacyUserSettingsV2, this.LL, null), 2);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C432050Gwt.LIZ():void");
    }

    public final void LIZIZ() {
        ViewGroup viewGroup;
        TuxTextView tuxTextView = this.LIZIZ;
        if (tuxTextView != null) {
            this.LIZIZ = null;
            View view = this.LIZ;
            if (view == null) {
                view = null;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return;
            }
            if (viewGroup.getChildCount() == 2) {
                View view2 = this.LIZ;
                C426750GoL.LJIIIZ(view2 != null ? view2 : null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, false, 29);
                if (viewGroup == null) {
                    return;
                }
            }
            C786410Ut5.LJJJLZIJ(tuxTextView, viewGroup);
        }
    }
}
