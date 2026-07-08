package X;

import android.util.Pair;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502840pD8 {
    public static final C1502840pD8 LIZ = new C1502840pD8();

    public static C1493620oyG LIZ(C1502850pD9 c1502850pD9) {
        C1493620oyG c1493620oyG = new C1493620oyG();
        boolean z = c1502850pD9.LIZLLL;
        c1493620oyG.LJIILLIIL = !z;
        c1493620oyG.LJIIIZ = z;
        c1493620oyG.LIZJ = 0L;
        c1493620oyG.LIZLLL = 0L;
        c1493620oyG.LJ = 0L;
        Long l = c1502850pD9.LJII;
        if (l != null) {
            c1493620oyG.LJIIIIZZ = l.longValue();
        }
        return c1493620oyG;
    }

    public static C443120HZe LIZIZ(C1502850pD9 c1502850pD9) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(new C2089008Gi(c1502850pD9.LIZ).LJ(), linkedHashMap);
        return new C443120HZe(pairLIZJ.first, pairLIZJ.second, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(X.C1502850pD9 r7) {
        /*
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r7.LIZIZ
            java.lang.String r6 = "x-tt-dataflow-id"
            r4 = 0
            if (r0 == 0) goto L3e
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            X.080U r0 = new X.080U
            r0.<init>(r2, r1)
            r5.add(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r6)
            if (r0 == 0) goto L14
            r4 = 1
            goto L14
        L3c:
            if (r4 != 0) goto L48
        L3e:
            X.080U r1 = new X.080U
            java.lang.String r0 = "671088657"
            r1.<init>(r6, r0)
            r5.add(r1)
        L48:
            java.lang.String r2 = r7.LJI
            if (r2 == 0) goto L56
            X.080U r1 = new X.080U
            java.lang.String r0 = "Content-Type"
            r1.<init>(r0, r2)
            r5.add(r1)
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502840pD8.LIZJ(X.0pD9):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.retrofit2.mime.TypedByteArray] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.bytedance.retrofit2.mime.MultipartTypedOutput] */
    public static TypedOutput LIZLLL(C1502850pD9 c1502850pD9) {
        C259800zU c259800zU = new C259800zU();
        LinkedHashMap<String, File> linkedHashMap = c1502850pD9.LJIIIIZZ;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            ?? multipartTypedOutput = new MultipartTypedOutput();
            Map<String, String> map = c1502850pD9.LJ;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            c259800zU.element = multipartTypedOutput;
        } else {
            byte[] bArr = c1502850pD9.LJFF;
            if (bArr != null) {
                c259800zU.element = new TypedByteArray(c1502850pD9.LJI, bArr, new String[0]);
            }
        }
        return (TypedOutput) c259800zU.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #1 {all -> 0x0195, blocks: (B:3:0x002a, B:5:0x0054, B:6:0x005c, B:15:0x0072, B:23:0x00b4, B:24:0x00bf, B:26:0x00c5, B:28:0x00d1, B:29:0x00d5, B:31:0x00dd, B:32:0x00e1, B:34:0x00e7, B:37:0x00f4, B:38:0x00f8, B:40:0x00fd, B:41:0x0124, B:43:0x012a, B:45:0x0137, B:48:0x0144, B:47:0x0141, B:50:0x014a, B:52:0x017e, B:16:0x0086, B:19:0x008e, B:21:0x009f), top: B:57:0x002a, inners: #3, #4 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, X.0ozz, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, X.0ozZ, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1879450z0Z LJ(X.EnumC1503380pE0 r23, X.C1502850pD9 r24, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r25) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502840pD8.LJ(X.0pE0, X.0pD9, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):X.0z0Z");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[Catch: all -> 0x01c1, PHI: r8
      0x00be: PHI (r8v7 X.0X9S<java.lang.String>) = (r8v13 X.0X9S<java.lang.String>), (r8v16 X.0X9S<java.lang.String>) binds: [B:28:0x00bc, B:23:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:3:0x0025, B:5:0x004f, B:6:0x0057, B:15:0x006d, B:29:0x00be, B:30:0x00c5, B:32:0x00cb, B:34:0x00d9, B:35:0x00dd, B:37:0x00e3, B:40:0x00f0, B:41:0x00f4, B:43:0x00f9, B:44:0x0127, B:46:0x012d, B:48:0x013a, B:50:0x0146, B:52:0x014d, B:54:0x0178, B:56:0x01aa, B:16:0x007a, B:18:0x0080, B:19:0x008e, B:22:0x0096, B:25:0x00a1, B:27:0x00af), top: B:61:0x0025, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [T] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, X.0ozZ, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [T, X.0ozb, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, X.0ozz, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1506420pIu LJFF(X.EnumC1503380pE0 r18, X.C1502850pD9 r19, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r20) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502840pD8.LJFF(X.0pE0, X.0pD9, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend):X.0pIu");
    }
}
