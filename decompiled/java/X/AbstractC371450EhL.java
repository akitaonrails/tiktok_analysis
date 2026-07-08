package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC371450EhL<OUT> {
    public C099G LIZ;
    public final C099F LIZIZ = C090F.LIZIZ();
    public final C099F LIZJ = C090F.LIZIZ();

    public abstract Object LIZJ(InterfaceC1364105Vn<? super OUT> interfaceC1364105Vn);

    public void LJ(VideoPublishEditModel videoPublishEditModel) {
    }

    public final OUT LIZIZ() {
        C099G c099g = this.LIZ;
        if (c099g == null) {
            c099g = null;
        }
        return (OUT) c099g.LJJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super OUT> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C371460EhM
            if (r0 == 0) goto L49
            r5 = r7
            X.0EhM r5 = (X.C371460EhM) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L38
            if (r0 != r2) goto L4f
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            X.099G r0 = r6.LIZ
            if (r0 != 0) goto L3b
            X.099F r0 = r6.LIZIZ
            r5.LLILLL = r1
            java.lang.Object r0 = r0.LJLIIIL(r5)
            if (r0 != r3) goto L3b
            return r3
        L38:
            X.C155000ia.LIZIZ(r4)
        L3b:
            X.099G r0 = r6.LIZ
            if (r0 != 0) goto L40
            r0 = 0
        L40:
            r5.LLILLL = r2
            java.lang.Object r4 = r0.LJLIIIL(r5)
            if (r4 != r3) goto L25
            return r3
        L49:
            X.0EhM r5 = new X.0EhM
            r5.<init>(r6, r7)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC371450EhL.LIZ(X.05Vn):java.lang.Object");
    }

    public final AnonymousClass0957<OUT> LIZLLL(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C371440EhK(this, null), 3);
        this.LIZIZ.LJJLIIIJILLIZJL(Unit.LIZ);
        C099G c099g = this.LIZ;
        if (c099g == null) {
            return null;
        }
        return c099g;
    }
}
