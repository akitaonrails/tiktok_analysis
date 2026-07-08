package X;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistFragmentAssem;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment;

/* JADX INFO: renamed from: X.0hZG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209040hZG implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            case 3:
                return onApplyWindowInsets$3(this, view, c20246014Ju);
            case 4:
                return onApplyWindowInsets$4(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C1209040hZG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C1209040hZG c1209040hZG, View view, C20246014Ju c20246014Ju) throws Throwable {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        int i = 0;
        view.setPadding(0, 0, 0, c20244914JjLIZ.LIZLLL);
        StoreMixActivity storeMixActivity = (StoreMixActivity) c1209040hZG.l0;
        if (!storeMixActivity.LLILZIL) {
            storeMixActivity.LLILZIL = true;
            String str = StoreMixActivity._pnsPageId;
            int i2 = c20244914JjLIZ.LIZLLL;
            StoreMixActivity.LLILZLL = i2;
            if (i2 == 0) {
                StoreMixActivity.LLILZLL = c20246014Ju.LIZJ();
            }
            if (StoreMixActivity.LLILZLL == 0) {
                StoreMixActivity storeMixActivity2 = (StoreMixActivity) c1209040hZG.l0;
                storeMixActivity2.getClass();
                if (Build.VERSION.SDK_INT == 29) {
                    Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(storeMixActivity2, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3ZuhKqaILhr0x1LFsyujD48Ix3ls6gO8l0NJEpBsPvBkP", null));
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    displayLLILZIL.getRealMetrics(displayMetrics);
                    displayLLILZIL.getMetrics(displayMetrics2);
                    int i3 = displayMetrics.heightPixels - displayMetrics2.heightPixels;
                    if (i3 > 0) {
                        i = i3;
                    }
                }
                StoreMixActivity.LLILZLL = i;
            }
            StoreMixActivity.LLILZLL = C418440Gaw.LJFF(StoreMixActivity.LLILZLL, (StoreMixActivity) c1209040hZG.l0);
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C1209040hZG c1209040hZG, View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        ((EditCollectionFragment) c1209040hZG.l0).LLJL.set(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
        ((EditCollectionFragment) c1209040hZG.l0).OR();
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$2(C1209040hZG c1209040hZG, View view, C20246014Ju c20246014Ju) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        int paddingTop;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(1);
        C20244914Jj c20244914JjLIZ2 = c20246014Ju.LIZ(2);
        EditPlaylistFragmentAssem editPlaylistFragmentAssem = (EditPlaylistFragmentAssem) c1209040hZG.l0;
        TuxNavBar tuxNavBar = editPlaylistFragmentAssem.LLJJ;
        if (tuxNavBar != null) {
            Integer num = editPlaylistFragmentAssem.LLJLL;
            if (num != null) {
                paddingTop = num.intValue();
            } else {
                paddingTop = tuxNavBar.getPaddingTop();
                editPlaylistFragmentAssem.LLJLL = Integer.valueOf(paddingTop);
            }
            int i = paddingTop + c20244914JjLIZ.LIZIZ;
            if (tuxNavBar.getPaddingTop() != i) {
                tuxNavBar.setPadding(tuxNavBar.getPaddingLeft(), i, tuxNavBar.getPaddingRight(), tuxNavBar.getPaddingBottom());
            }
        }
        EditPlaylistFragmentAssem editPlaylistFragmentAssem2 = (EditPlaylistFragmentAssem) c1209040hZG.l0;
        View view2 = editPlaylistFragmentAssem2.LLJJIJIIJIL;
        int iIntValue2 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            Integer num2 = editPlaylistFragmentAssem2.LLJLLIL;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                if (marginLayoutParams != null) {
                    iIntValue = marginLayoutParams.bottomMargin;
                } else {
                    iIntValue = 0;
                }
                editPlaylistFragmentAssem2.LLJLLIL = Integer.valueOf(iIntValue);
            }
            int i2 = iIntValue + c20244914JjLIZ2.LIZLLL;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                marginLayoutParams.bottomMargin = i2;
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
        EditPlaylistFragmentAssem editPlaylistFragmentAssem3 = (EditPlaylistFragmentAssem) c1209040hZG.l0;
        C1749280vcc c1749280vcc = editPlaylistFragmentAssem3.LLJILJILJ;
        if (c1749280vcc != null) {
            ViewGroup.LayoutParams layoutParams2 = c1749280vcc.getLayoutParams();
            if (layoutParams2 instanceof C19ME) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            Integer num3 = editPlaylistFragmentAssem3.LLJLLL;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                if (marginLayoutParams2 != null) {
                    iIntValue2 = marginLayoutParams2.bottomMargin;
                }
                editPlaylistFragmentAssem3.LLJLLL = Integer.valueOf(iIntValue2);
            }
            int i3 = iIntValue2 + c20244914JjLIZ2.LIZLLL;
            if (marginLayoutParams2 != null && marginLayoutParams2.bottomMargin != i3) {
                marginLayoutParams2.bottomMargin = i3;
                C786410Ut5.U6(c1749280vcc, marginLayoutParams2);
            }
        }
        return c20246014Ju;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r4
      0x0027: PHI (r4v1 android.view.View) = (r4v0 android.view.View), (r4v4 android.view.View) binds: [B:3:0x0011, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20246014Ju onApplyWindowInsets$3(X.C1209040hZG r7, android.view.View r8, X.C20246014Ju r9) {
        /*
            r0 = 1
            X.14Jj r6 = r9.LIZ(r0)
            r0 = 2
            X.14Jj r5 = r9.LIZ(r0)
            java.lang.Object r2 = r7.l0
            com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment r2 = (com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment) r2
            com.bytedance.tux.navigation.TuxNavBar r4 = r2.LLILZ
            r0 = 0
            if (r4 != 0) goto L27
            android.view.View r1 = r2.getView()
            if (r1 == 0) goto L8e
            r0 = 2131394815(0x7f0a80ff, float:1.8410325E38)
            android.view.View r4 = r1.findViewById(r0)
        L20:
            r0 = r4
            com.bytedance.tux.navigation.TuxNavBar r0 = (com.bytedance.tux.navigation.TuxNavBar) r0
            r2.LLILZ = r0
            if (r4 == 0) goto L4b
        L27:
            java.lang.Object r1 = r7.l0
            com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment r1 = (com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment) r1
            java.lang.Integer r0 = r1.LLJIJIL
            if (r0 == 0) goto L83
            int r3 = r0.intValue()
        L33:
            int r0 = r6.LIZIZ
            int r3 = r3 + r0
            int r0 = r4.getPaddingTop()
            if (r0 == r3) goto L4b
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingRight()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r2, r3, r1, r0)
        L4b:
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment r0 = (com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment) r0
            X.127h r4 = r0.SR()
            if (r4 == 0) goto L79
            java.lang.Object r3 = r7.l0
            com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment r3 = (com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment) r3
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L79
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L79
            java.lang.Integer r0 = r3.LLJILJIL
            if (r0 == 0) goto L7a
            int r1 = r0.intValue()
        L6d:
            int r0 = r5.LIZLLL
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            if (r0 == r1) goto L79
            r2.bottomMargin = r1
            X.C786410Ut5.J6(r4, r2)
        L79:
            return r9
        L7a:
            int r1 = r2.bottomMargin
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.LLJILJIL = r0
            goto L6d
        L83:
            int r3 = r4.getPaddingTop()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.LLJIJIL = r0
            goto L33
        L8e:
            r4 = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1209040hZG.onApplyWindowInsets$3(X.0hZG, android.view.View, X.14Ju):X.14Ju");
    }

    public static final C20246014Ju onApplyWindowInsets$4(C1209040hZG c1209040hZG, View view, C20246014Ju c20246014Ju) {
        int iIW;
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        PoiOrderSubmitSlashFragment poiOrderSubmitSlashFragment = (PoiOrderSubmitSlashFragment) c1209040hZG.l0;
        int i = c20244914JjLIZ.LIZLLL;
        poiOrderSubmitSlashFragment.LLLZZIL = i;
        int iFT = i + poiOrderSubmitSlashFragment.FT();
        if (((PoiOrderSubmitSlashFragment) c1209040hZG.l0).qW().getState().LLILZIL) {
            iIW = 0;
        } else {
            iIW = ((PoiOrderSubmitSlashFragment) c1209040hZG.l0).iW();
        }
        view.setPadding(0, 0, 0, iFT + iIW);
        return c20246014Ju;
    }
}
