package X;

import Y.ACallableS254S0200000_28;
import Y.ALAdapterS23S0100000_28;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import java.util.List;

/* JADX INFO: renamed from: X.0zrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912080zrC {
    public final C19EG LIZ;
    public final UgAwemeActivitySetting LIZIZ;
    public C1912140zrI LIZJ;
    public final View LIZLLL;
    public int LJ;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public List<Integer> LJIIJJI;
    public int LJFF = 3;
    public int LJI = -1;
    public final C1911970zr1 LJIIL = new C1911970zr1();
    public String LJIILIIL = "";

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r4 = this;
            X.19EG r0 = r4.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = X.C740740T3w.LJFF(r0)
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L16
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r2.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L17
            boolean r0 = r0.isAvoidGlobalPendant()
            if (r0 != r1) goto L17
        L16:
            return r3
        L17:
            boolean r0 = r2.isAd()
            if (r0 == 0) goto L30
            boolean r0 = X.C1017070cZd.LJLJJLL(r2)
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
            if (r0 == 0) goto L30
            int r0 = r0.getAdType()
            if (r0 != r1) goto L30
            return r3
        L30:
            android.view.View r0 = r4.LIZLLL
            java.lang.Object r0 = X.C487580JAe.LIZIZ(r0)
            boolean r0 = r0 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L7d
            X.19EG r1 = r4.LIZ
            boolean r0 = r1 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L7d
            X.0roz r1 = (X.InterfaceC1603190roz) r1
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            boolean r0 = r0 instanceof X.InterfaceC1593630rZZ
            if (r0 == 0) goto L7d
            X.19EG r0 = r4.LIZ
            X.0roz r0 = (X.InterfaceC1603190roz) r0
            androidx.fragment.app.Fragment r0 = r0.getCurFragment()
            X.0rZZ r0 = (X.InterfaceC1593630rZZ) r0
            boolean r0 = r0.Ik()
            if (r0 == 0) goto L7d
        L5a:
            boolean r0 = r4.LJII
            if (r0 != 0) goto L16
            X.19EG r0 = r4.LIZ
            r2 = 0
            X.0sGB r1 = X.C0SHX.LIZ(r0, r2)
            java.lang.String r0 = "long_press_layer"
            boolean r0 = r1.LIZ(r0)
            if (r0 != 0) goto L16
            X.19EG r0 = r4.LIZ
            X.0sGB r1 = X.C0SHX.LIZ(r0, r2)
            java.lang.String r0 = "upload_progress_fragment"
            boolean r0 = r1.LIZ(r0)
            if (r0 != 0) goto L16
            r3 = 1
            return r3
        L7d:
            android.view.View r0 = r4.LIZLLL
            java.lang.Object r0 = X.C487580JAe.LIZIZ(r0)
            boolean r0 = r0 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L16
            X.19EG r1 = r4.LIZ
            boolean r0 = r1 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L16
            X.0roz r1 = (X.InterfaceC1603190roz) r1
            androidx.fragment.app.Fragment r0 = r1.getCurFragment()
            boolean r0 = r0 instanceof X.InterfaceC1593630rZZ
            if (r0 == 0) goto L16
            X.19EG r0 = r4.LIZ
            X.0roz r0 = (X.InterfaceC1603190roz) r0
            androidx.fragment.app.Fragment r0 = r0.getCurFragment()
            X.0rZZ r0 = (X.InterfaceC1593630rZZ) r0
            boolean r0 = r0.Vp()
            if (r0 == 0) goto L16
            boolean r0 = r4.LJIIIIZZ
            if (r0 == 0) goto L16
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1912080zrC.LIZIZ():boolean");
    }

    public final void LIZ(boolean z) {
        AbstractC1912160zrK abstractC1912160zrK;
        C1912140zrI c1912140zrI;
        AbstractC1912160zrK abstractC1912160zrK2;
        AbstractC1912160zrK abstractC1912160zrK3;
        if (LIZIZ()) {
            C1912140zrI c1912140zrI2 = this.LIZJ;
            if (c1912140zrI2 != null && !c1912140zrI2.getClosed() && (abstractC1912160zrK3 = c1912140zrI2.LLILLL) != null) {
                abstractC1912160zrK3.LIZLLL();
            }
            C1912140zrI c1912140zrI3 = this.LIZJ;
            if (c1912140zrI3 != null && c1912140zrI3.getVisibility() == 0 && z) {
                this.LJ++;
            }
            if (this.LJ >= this.LJFF && (c1912140zrI = this.LIZJ) != null && (abstractC1912160zrK2 = c1912140zrI.LLILLL) != null && abstractC1912160zrK2.LLJILJILJ && !abstractC1912160zrK2.LLJILJIL) {
                if (abstractC1912160zrK2.LLJI) {
                    C786410Ut5.LJLLLLLL(0, abstractC1912160zrK2.LLILZ);
                } else {
                    C786410Ut5.LJLLLLLL(4, abstractC1912160zrK2.LLILZ);
                }
                abstractC1912160zrK2.LLJILJIL = true;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(abstractC1912160zrK2.LJI(false), abstractC1912160zrK2.LJFF(false), abstractC1912160zrK2.LJ(false));
                animatorSet.addListener(new ALAdapterS23S0100000_28(abstractC1912160zrK2, 7));
                animatorSet.start();
                return;
            }
            return;
        }
        C1912140zrI c1912140zrI4 = this.LIZJ;
        if (c1912140zrI4 == null || (abstractC1912160zrK = c1912140zrI4.LLILLL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, abstractC1912160zrK.LL);
    }

    public final void LIZJ(C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        C15O7.LIZJ(new ACallableS254S0200000_28(this, c19eg, 1)).LJ(new C19335210kg(c19eg, this, 1), C15O7.LJIIIIZZ, null);
    }

    public C1912080zrC(View view, C19EG c19eg, UgAwemeActivitySetting ugAwemeActivitySetting) {
        this.LIZ = c19eg;
        this.LIZIZ = ugAwemeActivitySetting;
        this.LIZLLL = view;
    }
}
