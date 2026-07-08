package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0L24, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L24 implements InterfaceC345200Dg6 {
    public final Context LIZ;
    public final ShortVideoContext LIZIZ;
    public final List<C536390L1x> LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final IStoryCanvasVideoHelper LJ;

    @Override // X.InterfaceC345200Dg6
    public final void LIZIZ(C1DRG c1drg) {
    }

    @Override // X.InterfaceC345200Dg6
    public final String getName() {
        return "story_canvas_prepare_task";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    @Override // X.InterfaceC345200Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Intent r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0L27
            if (r0 == 0) goto L58
            r6 = r9
            X.0L27 r6 = (X.C0L27) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r6.LLILLL
            r4 = 0
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L3c
            if (r1 != r3) goto L5e
            X.C155000ia.LIZIZ(r2)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            X.0L25 r2 = new X.0L25
            r2.<init>(r7, r4)
            r6.LLILLL = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r6)
            if (r2 != r5) goto L3f
            return r5
        L3c:
            X.C155000ia.LIZIZ(r2)
        L3f:
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r2 = (com.ss.android.ugc.aweme.canvas.CanvasVideoData) r2
            if (r2 != 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0L26 r0 = new X.0L26
            r0.<init>(r7, r2, r4)
            r6.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r6, r1, r0)
            if (r0 != r5) goto L26
            return r5
        L58:
            X.0L27 r6 = new X.0L27
            r6.<init>(r7, r9)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L24.LIZ(android.content.Intent, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC345200Dg6
    public final Object LIZJ(C1DRG c1drg, Intent intent, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C345230Dg9.LIZIZ(this, intent, interfaceC1364105Vn);
    }

    public C0L24(Context context, ShortVideoContext shortVideoContext, List<C536390L1x> list, Pair<Integer, Integer> pair, IStoryCanvasVideoHelper iStoryCanvasVideoHelper) {
        this.LIZ = context;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = list;
        this.LIZLLL = pair;
        this.LJ = iStoryCanvasVideoHelper;
    }
}
