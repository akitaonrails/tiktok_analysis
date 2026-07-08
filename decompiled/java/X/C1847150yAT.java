package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0yAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847150yAT extends FrameLayout {
    public C1846630y9d LL;
    public C1846630y9d LLILLJJLI;
    public FrameLayout LLILLL;
    public C1324720kZq LLILZ;
    public C1324720kZq LLILZIL;
    public C1324720kZq LLILZLL;
    public C1324720kZq LLIZ;
    public C1324720kZq LLIZLLLIL;
    public C1324720kZq LLJ;
    public boolean LLJI;
    public int LLJIJIL;

    public C1847150yAT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g35, this, true);
        this.LL = (C1846630y9d) findViewById(R.id.tv_rank_class_level);
        this.LLILLJJLI = (C1846630y9d) findViewById(R.id.tv_rank_class_level_animation);
        this.LLILLL = (FrameLayout) findViewById(R.id.sqi);
        this.LLILZ = (C1324720kZq) findViewById(R.id.lh7);
        this.LLILZLL = (C1324720kZq) findViewById(R.id.luh);
        this.LLIZLLLIL = (C1324720kZq) findViewById(R.id.lxi);
        this.LLILZIL = (C1324720kZq) findViewById(R.id.lh8);
        this.LLIZ = (C1324720kZq) findViewById(R.id.lui);
        this.LLJ = (C1324720kZq) findViewById(R.id.lxj);
        C1846630y9d c1846630y9d = this.LL;
        if (c1846630y9d != null) {
            c1846630y9d.LJJJJI();
        }
        C1846630y9d c1846630y9d2 = this.LLILLJJLI;
        if (c1846630y9d2 != null) {
            c1846630y9d2.LJJJJI();
        }
        C1846630y9d c1846630y9d3 = this.LL;
        if (c1846630y9d3 != null) {
            C1119210fEN.LIZ.getClass();
            int i = C1119210fEN.LIZJ;
            c1846630y9d3.LLJJIJIIJIL = true;
            c1846630y9d3.LLJJIJI = i;
        }
        C1846630y9d c1846630y9d4 = this.LLILLJJLI;
        if (c1846630y9d4 != null) {
            C1119210fEN.LIZ.getClass();
            int i2 = C1119210fEN.LIZJ;
            c1846630y9d4.LLJJIJIIJIL = true;
            c1846630y9d4.LLJJIJI = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.ObjectAnimator LIZ(X.C1324720kZq r8, X.C1324720kZq r9, long r10, long r12, int r14, int r15, boolean r16) {
        /*
            r7 = this;
            X.013C r3 = new X.013C
            r3.<init>()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r16 != 0) goto L69
            long r0 = (long) r14
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 <= 0) goto L65
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 > 0) goto L69
        L12:
            r6 = 0
        L13:
            r4 = 0
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r4 = 1
            if (r0 <= 0) goto L21
            long r0 = (long) r14
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 > 0) goto L21
            r3.element = r4
        L21:
            r5 = 0
            if (r9 == 0) goto L27
            X.C786410Ut5.LLJJIII(r9, r5)
        L27:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L31
            int r1 = r7.LLJIJIL
            int r0 = (int) r10
            X.C1847160yAU.LJ(r1, r14, r0, r9)
        L31:
            android.util.Property r1 = android.view.View.ALPHA
            r0 = 2
            float[] r0 = new float[r0]
            r0[r5] = r6
            r0[r4] = r2
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r8, r1, r0)
            r0 = 240(0xf0, double:1.186E-321)
            r4.setDuration(r0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1051595899(0x3eae147b, float:0.34)
            r0 = 1059648963(0x3f28f5c3, float:0.66)
            android.view.animation.Interpolator r0 = X.C0GY9.LIZIZ(r0, r5, r1, r2)
            r4.setInterpolator(r0)
            Y.AAListenerS75S0201000_27 r1 = new Y.AAListenerS75S0201000_27
            r0 = 0
            r1.<init>(r8, r3, r15, r0)
            r4.addListener(r1)
            Y.AAListenerS337S0100000_27 r1 = new Y.AAListenerS337S0100000_27
            r0 = 0
            r1.<init>(r9, r0)
            r4.addListener(r1)
            return r4
        L65:
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 > 0) goto L12
        L69:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1847150yAT.LIZ(X.0kZq, X.0kZq, long, long, int, int, boolean):android.animation.ObjectAnimator");
    }
}
