package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: renamed from: X.0Hds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445740Hds {
    public final C445760Hdu LIZ;

    public C445740Hds() {
        this(2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Hdu] */
    public C445740Hds(final int i) {
        this.LIZ = new LruCache<String, Bitmap>(i) { // from class: X.0Hdu
            @Override // android.util.LruCache
            public final /* bridge */ /* synthetic */ int sizeOf(String str, Bitmap bitmap) {
                return 1;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C445750Hdt
            if (r0 == 0) goto L7d
            r6 = r9
            X.0Hdt r6 = (X.C445750Hdt) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            java.lang.String r3 = "FrescoBitmapLruCache"
            if (r0 == 0) goto L4d
            if (r0 != r4) goto La0
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r1)
        L28:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r4 = r1.getFirst()
            java.lang.Object r2 = r1.getSecond()
            if (r4 == 0) goto L83
            X.0Hdu r0 = r7.LIZ
            r0.put(r8, r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadAndCache, put cache, url = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1706630uVp.LIZ(r3, r0)
            return r4
        L4d:
            X.C155000ia.LIZIZ(r1)
            X.0Hdu r0 = r7.LIZ
            java.lang.Object r2 = r0.get(r8)
            if (r2 == 0) goto L6c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadAndCache, hit cache, url = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1706630uVp.LIZ(r3, r0)
            return r2
        L6c:
            X.0HWT r1 = X.C0HWT.LIZ
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            r6.LL = r8
            r6.LLILZ = r4
            java.lang.Object r1 = r1.LIZIZ(r0, r6)
            if (r1 != r5) goto L28
            return r5
        L7d:
            X.0Hdt r6 = new X.0Hdt
            r6.<init>(r7, r9)
            goto L12
        L83:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadAndCache, load bitmap failed, url = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", err = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1706630uVp.LIZ(r3, r0)
            r0 = 0
            return r0
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C445740Hds.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
