package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.absetting.EPRecentFavVHBugfixKillSwitch;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteRecentFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0sfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635800sfa implements InterfaceC1635690sfP<C1642680sqg, Fragment> {
    public final LifecycleOwner LIZ;
    public final InterfaceC1628180sTI LIZIZ;
    public final InterfaceC1624480sNK LIZJ;
    public final C1630250sWd LIZLLL;

    @Override // X.InterfaceC1635690sfP
    public final List<Integer> LIZ() {
        return C1641140soC.LIZLLL();
    }

    public C1635800sfa(LifecycleOwner lifecycleOwner, InterfaceC1628180sTI interfaceC1628180sTI, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1630220sWa interfaceC1630220sWa) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = interfaceC1628180sTI;
        this.LIZJ = interfaceC1624480sNK;
        this.LIZLLL = new C1630250sWd(lifecycleOwner, interfaceC1624480sNK, interfaceC1630220sWa);
    }

    @Override // X.InterfaceC1635690sfP
    public final InterfaceC1631590sYn<Fragment> LIZJ(int i, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, RecyclerView.RecycledViewPool recycledViewPool) {
        if (c1630880sXe.LIZ.LJJLIIIJJIZ().LJIILLIIL) {
            if (EPRecentFavVHBugfixKillSwitch.INSTANCE.isEnabled()) {
                RecyclerView.RecycledViewPool recycledViewPool2 = new RecyclerView.RecycledViewPool();
                FavoriteRecentFragment favoriteRecentFragment = new FavoriteRecentFragment();
                favoriteRecentFragment.cS(i, c1630880sXe, c1631250sYF, recycledViewPool2);
                return favoriteRecentFragment;
            }
            FavoriteRecentFragment favoriteRecentFragment2 = new FavoriteRecentFragment();
            favoriteRecentFragment2.cS(i, c1630880sXe, c1631250sYF, recycledViewPool);
            return favoriteRecentFragment2;
        }
        FavoriteFragment favoriteFragment = new FavoriteFragment();
        favoriteFragment.cS(i, c1630880sXe, c1631250sYF, recycledViewPool);
        return favoriteFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    @Override // X.InterfaceC1635690sfP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1642680sqg LIZIZ(X.C19EG r8, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r9, X.C19YA r10, X.C1630880sXe r11, kotlin.jvm.internal.AwS147S0201000_25 r12) {
        /*
            r7 = this;
            boolean r0 = com.ss.android.ugc.aweme.absetting.EffectFavImgTabChangedToTextTabExperiment.isEnabled()
            if (r0 == 0) goto L27
            X.0sNK r0 = r11.LIZ
            X.0sV8 r0 = r0.LJJLIIIJJIZ()
            boolean r0 = r0.LJIILJJIL
            X.0sqg r3 = X.C1641140soC.LIZJ(r8, r0)
            r0 = 2131833814(0x7f1133d6, float:1.930072E38)
            r3.setText(r0)
            Y.ACListenerS89S0300000_25 r1 = new Y.ACListenerS89S0300000_25
            r0 = 4
            r1.<init>(r7, r8, r12, r0)
            X.C786410Ut5.ab(r3, r1)
            X.0sWd r0 = r7.LIZLLL
            r0.LIZ(r10)
            return r3
        L27:
            X.0sNK r0 = r11.LIZ
            X.0sV8 r0 = r0.LJJLIIIJJIZ()
            boolean r0 = r0.LJIILJJIL
            X.0sqg r3 = X.C1641140soC.LIZJ(r8, r0)
            com.ss.android.ugc.effectmanager.common.model.UrlModel r1 = r9.getIcon()
            if (r1 == 0) goto Lb0
            java.lang.String r0 = r1.getUri()
            r6 = 0
            if (r0 == 0) goto Lb0
            int r0 = r0.length()
            if (r0 == 0) goto Lb0
            r0 = r6 ^ 1
            r5 = 0
            if (r0 == 0) goto Lb0
            java.lang.String r2 = r1.getUri()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131232150(0x7f080596, float:1.8080401E38)
            int r4 = r1.getColor(r0)
            if (r2 == 0) goto L90
            int r0 = r2.length()
            if (r0 == 0) goto L90
            android.widget.TextView r1 = r3.LLILLL
            r0 = 8
            X.C786410Ut5.LLIL(r1, r0)
            X.0kVd r0 = r3.LLILLJJLI
            X.C786410Ut5.LLZZLLIL(r0, r6)
            java.lang.String r0 = "res://"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r2, r0, r6)
            if (r0 == 0) goto La9
            X.0kVd r2 = r3.LLILLJJLI
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L8d
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2130971912(0x7f040d08, float:1.7552576E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.Drawable r5 = X.C19734012Iw.LIZLLL(r0, r4)
        L8d:
            r2.setImageDrawable(r5)
        L90:
            r0 = 2131837787(0x7f11435b, float:1.9308779E38)
            java.lang.String r0 = r8.getString(r0)
            r3.setContentDescription(r0)
        L9a:
            Y.ACListenerS89S0300000_25 r1 = new Y.ACListenerS89S0300000_25
            r0 = 5
            r1.<init>(r7, r8, r12, r0)
            X.C786410Ut5.ab(r3, r1)
            X.0sWd r0 = r7.LIZLLL
            r0.LIZ(r10)
            return r3
        La9:
            X.0kVd r1 = r3.LLILLJJLI
            r0 = -1
            X.C1324750kZt.LJIIIZ(r1, r2, r0, r0)
            goto L90
        Lb0:
            java.lang.String r0 = r9.getName()
            r3.setText(r0)
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1635800sfa.LIZIZ(X.19EG, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, X.19YA, X.0sXe, kotlin.jvm.internal.AwS147S0201000_25):X.0sqg");
    }
}
