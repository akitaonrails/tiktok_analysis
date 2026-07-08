package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Color;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.model.ExploreCardDimensionParam;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0SWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722670SWj extends AbstractC214710190y {
    public static final int LLJ = Color.argb(128, 0, 0, 0);
    public final ExploreCardDimensionParam LLILZ;
    public final WeakReference<Fragment> LLILZIL;
    public final boolean LLILZLL;
    public final ArgbEvaluator LLIZ = new ArgbEvaluator();
    public final InterpolatorC448120Hhi LLIZLLLIL = new InterpolatorC448120Hhi(4.0f);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[PHI: r7 r8
      0x006a: PHI (r7v3 int) = (r7v1 int), (r7v4 int) binds: [B:28:0x0066, B:52:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r8v2 int) = (r8v0 int), (r8v3 int) binds: [B:28:0x0066, B:52:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[PHI: r7
      0x00a9: PHI (r7v4 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v5 int) binds: [B:23:0x0055, B:25:0x005b, B:27:0x0064, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    @Override // X.AbstractC214710190y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C191E LIZJ(final boolean r13) {
        /*
            r12 = this;
            r5 = r12
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r5.LLILZIL
            java.lang.Object r3 = r0.get()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r11 = 0
            if (r3 == 0) goto Lbb
            android.view.View r1 = r3.getView()
            if (r1 == 0) goto Lbb
            r0 = 2131369282(0x7f0a1d42, float:1.8358538E38)
            android.view.View r4 = r1.findViewById(r0)
        L19:
            r2 = 1
            r1 = 0
            r6 = r13
            if (r6 != 0) goto Lb3
            if (r4 == 0) goto Lb0
            float r0 = r4.getTranslationY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L28:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LIZLLL(r0, r1)
            if (r0 == 0) goto Lb3
            float r0 = r4.getTranslationX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb3
            r7 = 0
        L37:
            float r0 = r4.getTranslationY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L3f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LIZLLL(r0, r1)
            if (r0 == 0) goto L55
            if (r4 == 0) goto Lae
            float r0 = r4.getTranslationX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L4f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LIZLLL(r0, r1)
            if (r0 != 0) goto La9
        L55:
            if (r3 == 0) goto La9
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto La9
            r0 = 2131100553(0x7f060389, float:1.781349E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto La9
            int r8 = r0.intValue()
        L6a:
            com.bytedance.tux.system.TuxImmersionBar r9 = X.C1766560w4U.LIZLLL(r3)
        L6e:
            if (r6 != 0) goto La7
            com.ss.android.ugc.aweme.model.ExploreCardDimensionParam r0 = r5.LLILZ
            if (r0 == 0) goto La7
            boolean r0 = r0.darkBackground
            if (r0 != r2) goto La7
        L78:
            r3 = 2131099676(0x7f06001c, float:1.7811712E38)
            if (r2 == 0) goto La1
            if (r4 == 0) goto La1
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto La1
            java.lang.Integer r10 = X.C1308910kAL.LIZJ(r3, r0)
        L89:
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L9b
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r1.<init>(r2, r0)
            java.lang.Integer r11 = X.C1308910kAL.LIZJ(r3, r1)
        L9b:
            X.0SWk r4 = new X.0SWk
            r4.<init>()
            return r4
        La1:
            r10 = r11
            if (r2 == 0) goto L9b
            if (r4 == 0) goto L9b
            goto L89
        La7:
            r2 = 0
            goto L78
        La9:
            r8 = 0
            if (r3 != 0) goto L6a
            r9 = r11
            goto L6e
        Lae:
            r0 = r11
            goto L4f
        Lb0:
            r0 = r11
            goto L28
        Lb3:
            int r7 = X.C722670SWj.LLJ
            if (r6 != 0) goto L55
            if (r4 != 0) goto L37
            r0 = r11
            goto L3f
        Lbb:
            r4 = r11
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C722670SWj.LIZJ(boolean):X.191E");
    }

    @Override // X.AbstractC214710190y
    public final void LJ(boolean z) {
        View view;
        View childAt;
        Context context;
        Integer numLIZJ;
        View viewFindViewById;
        Context context2;
        Integer numLIZJ2;
        ViewGroup viewGroup;
        Fragment fragment = this.LLILZIL.get();
        if (fragment != null && (view = fragment.getView()) != null) {
            int iIntValue = 0;
            if (!this.LLILZLL || !(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || (childAt = viewGroup.getChildAt(0)) == null) {
                childAt = view;
            }
            if (z) {
                childAt.setBackgroundColor(LLJ);
                return;
            }
            childAt.setBackgroundColor(0);
            ExploreCardDimensionParam exploreCardDimensionParam = this.LLILZ;
            if (exploreCardDimensionParam != null && exploreCardDimensionParam.darkBackground && (viewFindViewById = view.findViewById(R.id.fc3)) != null && (context2 = viewFindViewById.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, new ContextThemeWrapper(context2, R.style.y0))) != null) {
                viewFindViewById.setBackgroundColor(numLIZJ2.intValue());
            }
            if (this.LLILZLL) {
                return;
            }
            Fragment fragment2 = this.LLILZIL.get();
            if (fragment2 != null && (context = fragment2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            Fragment fragment3 = this.LLILZIL.get();
            if (fragment3 == null) {
                return;
            }
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragment3);
            tuxImmersionBarLIZLLL.LJFF(iIntValue);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    public C722670SWj(ExploreCardDimensionParam exploreCardDimensionParam, WeakReference<Fragment> weakReference, boolean z) {
        this.LLILZ = exploreCardDimensionParam;
        this.LLILZIL = weakReference;
        this.LLILZLL = z;
    }
}
