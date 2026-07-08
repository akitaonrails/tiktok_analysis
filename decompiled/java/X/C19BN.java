package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19BN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19BN implements InterfaceC21658919pb {
    public static final C0S4J LIZLLL = new C0S4J("flexible_root");
    public final NavigationScene LIZ;
    public final SAFTikTokFragment LIZIZ;
    public C19BQ LIZJ;

    public final void LIZ() {
        C19BQ c19bq = this.LIZJ;
        if (c19bq != null) {
            c19bq.LIZ();
            this.LIZJ = null;
        }
        SAFFragmentRootScene sAFFragmentRootSceneIb = this.LIZIZ.ib();
        if (!Intrinsics.LJFF(sAFFragmentRootSceneIb != null ? sAFFragmentRootSceneIb.mParentScene : null, this.LIZ.LLLLIIIILLL())) {
            LIZLLL.LJII(new AwS576S0100000_32(this, 469));
            return;
        }
        NavigationScene navigationScene = this.LIZ;
        C560320LyI c560320LyI = new C560320LyI();
        c560320LyI.LIZ = new C214798194i();
        navigationScene.LLLLLLIL(c560320LyI.LIZ());
    }

    @Override // X.InterfaceC21658919pb
    public final void Sm(float f) {
        C19BQ c19bq = this.LIZJ;
        if (c19bq != null) {
            c19bq.LJ(f);
        }
    }

    @Override // X.InterfaceC21658919pb
    public final void Sn(boolean z) {
        final C19BQ c19bq = this.LIZJ;
        if (c19bq == null) {
            return;
        }
        this.LIZJ = null;
        if (c19bq.LIZJ) {
            c19bq.LIZJ = false;
            float f = c19bq.LIZLLL;
            float f2 = 0.0f;
            c19bq.LIZLLL = 0.0f;
            final boolean zLJFF = C19BQ.LJFF(f);
            if (zLJFF) {
                f2 = 1.0f;
            }
            ArrayList arrayList = new ArrayList();
            for (C191E c191e : c19bq.LIZIZ) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c191e, C191E.LIZLLL, c191e.LIZIZ, f2);
                objectAnimatorOfFloat.setDuration(150L);
                arrayList.add(objectAnimatorOfFloat);
            }
            final AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.19BP
                public boolean LL;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    this.LL = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (zLJFF && !this.LL) {
                        C19BO c19bo = c19bq;
                        if (C19BO.LJIIJ == c19bo.LJIIIZ) {
                            C19BO.LJIIJ = null;
                        }
                        NavigationScene navigationScene = c19bo.LIZ;
                        if (navigationScene.LLJILJIL.LIZJ) {
                            navigationScene.mView.setBackground(C19BL.LIZLLL(navigationScene.requireSceneContext()));
                        }
                        c19bo.LIZJ();
                        C19BR c19br = c19bo.LJIIIIZZ;
                        if (c19br != null) {
                            c19br.LIZLLL();
                            return;
                        }
                        return;
                    }
                    c19bq.LIZLLL();
                }
            });
            animatorSet.setInterpolator(new C12DN());
            animatorSet.start();
            c19bq.LIZIZ = null;
            c19bq.LJIIIZ.LIZJ(new InterfaceC20148613sa() { // from class: X.19Bn
                @Override // X.InterfaceC20148613sa
                public final void onCancel() {
                    animatorSet.cancel();
                }
            });
        }
        if (z) {
            LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19BN(com.bytedance.scene.navigation.NavigationScene r9, androidx.fragment.app.SAFTikTokFragment r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.LIZ = r9
            r8.LIZIZ = r10
            X.19BQ r2 = new X.19BQ
            r2.<init>(r8)
            X.C12WP.LIZ()
            X.19BR r0 = r9.LLLFF
            r2.LJIIIIZZ = r0
            X.19A6 r7 = r9.LLJILJILJ
            r7.getClass()
            X.13sZ r0 = X.C19BO.LJIIJ
            r3 = 0
            if (r0 == 0) goto L22
            r0.LIZ()
            X.C19BO.LJIIJ = r3
        L22:
            com.bytedance.scene.navigation.Record r0 = r7.LIZJ()
            boolean r0 = r0.mIsTranslucent
            if (r0 != 0) goto Laf
            com.bytedance.scene.Scene r6 = r7.LJJIIZ()
            X.19AC r1 = r7.LIZIZ
            java.util.List<com.bytedance.scene.navigation.Record> r0 = r1.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r4 = 2
            if (r0 < r4) goto Lac
            java.util.List<com.bytedance.scene.navigation.Record> r1 = r1.LIZ
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r0 = r1.size()
            int r0 = r0 - r4
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.bytedance.scene.navigation.Record r0 = (com.bytedance.scene.navigation.Record) r0
            r5 = 0
            if (r0 == 0) goto Lac
            com.bytedance.scene.Scene r4 = r0.mScene
            com.bytedance.scene.navigation.NavigationScene r1 = r7.LIZ
            r0 = 1
            r2.LIZJ = r0
            r2.LIZ = r1
            r2.LJ = r6
            r2.LJFF = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.LIZIZ = r1
            X.19BR r0 = r2.LJIIIIZZ
            if (r0 == 0) goto L6d
            X.19BS r0 = new X.19BS
            r0.<init>()
            r1.add(r0)
        L6d:
            com.bytedance.scene.Scene r0 = r2.LJFF
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            r2.LJII = r0
            com.bytedance.scene.Scene r0 = r2.LJFF
            android.view.View r0 = r0.mView
            X.C786410Ut5.LJLLLLLL(r5, r0)
            com.bytedance.scene.Scene r0 = r2.LJ
            android.view.View r0 = r0.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r2.LJI = r0
            com.bytedance.scene.Scene r0 = r2.LJ
            android.view.View r0 = r0.mView
            r0.setBackground(r3)
            X.13sZ r1 = new X.13sZ
            r1.<init>()
            r2.LJIIIZ = r1
            X.19Bi r0 = new X.19Bi
            r0.<init>()
            r1.LIZJ(r0)
            X.13sZ r0 = r2.LJIIIZ
            X.C19BO.LJIIJ = r0
            X.19BR r0 = r2.LJIIIIZZ
            if (r0 == 0) goto La9
            r0.onStart()
        La9:
            r8.LIZJ = r2
            return
        Lac:
            r2.LJIIIIZZ = r3
            goto La9
        Laf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InteractionNavigationPopAnimationFactory can't support translucent Scene"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19BN.<init>(com.bytedance.scene.navigation.NavigationScene, androidx.fragment.app.SAFTikTokFragment):void");
    }
}
