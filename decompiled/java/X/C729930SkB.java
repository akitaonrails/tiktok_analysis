package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729930SkB implements InterfaceC613740O5k<C729840Sk2> {
    public final List<String> LIZ;
    public final AtomicBoolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C729930SkB)) {
            return false;
        }
        C729930SkB c729930SkB = (C729930SkB) obj;
        return Intrinsics.LJFF(this.LIZ, c729930SkB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c729930SkB.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStoryQuery(uidList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", getUserStoriesFromRemoteCalled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    public C729930SkB(List<String> list, AtomicBoolean atomicBoolean) {
        this.LIZ = list;
        this.LIZIZ = atomicBoolean;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r11, X.InterfaceC1364105Vn<? super X.C729840Sk2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C729940SkC
            if (r0 == 0) goto L93
            r2 = r12
            X.0SkC r2 = (X.C729940SkC) r2
            int r3 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L93
            int r3 = r3 - r1
            r2.LLILLL = r3
        L12:
            java.lang.Object r1 = r2.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r2.LLILLL
            r7 = 1
            if (r0 == 0) goto L2a
            if (r0 != r7) goto L9a
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.story.model.UserStoriesResponse r1 = (com.ss.android.ugc.aweme.story.model.UserStoriesResponse) r1
            X.0Sk2 r0 = new X.0Sk2
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            java.util.List<java.lang.String> r0 = r10.LIZ
            java.lang.String r5 = r0.toString()
            X.0Sgt r4 = X.C727890Sgt.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "querying server for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r4.getClass()
            java.lang.String r0 = "UserStorySource"
            X.C727890Sgt.LJ(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.LIZIZ
            boolean r0 = r0.get()
            if (r0 != 0) goto L83
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L83
            boolean r0 = X.C07JE.LIZ()
            if (r0 == 0) goto L83
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            X.11Hj r1 = X.AbstractC19484711Kz.LJIJJLI(r0)
            X.0SkD r0 = new X.0SkD
            r0.<init>()
            X.11Je r1 = r1.LJIIZILJ(r0)
        L7a:
            r2.LLILLL = r7
            java.lang.Object r1 = X.C11UD.LIZIZ(r1, r2)
            if (r1 != r3) goto L22
            return r3
        L83:
            X.0Shf r4 = X.C728370Shf.LIZ
            r6 = 0
            r9 = 10
            r8 = r6
            X.11L6 r1 = X.C728370Shf.LIZ(r4, r5, r6, r7, r8, r9)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.LIZIZ
            r0.set(r7)
            goto L7a
        L93:
            X.0SkC r2 = new X.0SkC
            r2.<init>(r10, r12)
            goto L12
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C729930SkB.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
