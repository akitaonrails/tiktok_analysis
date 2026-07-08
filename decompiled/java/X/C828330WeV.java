package X;

import android.content.Context;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828330WeV {
    public final ThirdPartyBizCert LIZ;
    public final C0W04 LIZIZ;

    public final void LIZJ() {
        WeakReference<Context> weakReference;
        Context context;
        C0W04 c0w04 = this.LIZIZ;
        if (c0w04 != null && c0w04.LLILZIL && (weakReference = c0w04.LLILZLL) != null && (context = weakReference.get()) != null) {
            context.unbindService(c0w04);
        }
        int i = this.LIZ.dataflowId;
        Integer numValueOf = Integer.valueOf(i);
        Map<Integer, C0W04> map = C1197504mL.LIZ;
        map.put(numValueOf, null);
        map.remove(Integer.valueOf(i));
    }

    public C828330WeV(ThirdPartyBizCert thirdPartyBizCert) {
        this.LIZ = thirdPartyBizCert;
        int i = thirdPartyBizCert.dataflowId;
        Map<Integer, C0W04> map = C1197504mL.LIZ;
        C0W04 c0w04 = (C0W04) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (c0w04 == null) {
            c0w04 = new C0W04();
            map.put(Integer.valueOf(i), c0w04);
        }
        this.LIZIZ = c0w04;
    }

    public final void LIZ(Context context, String str) {
        String strLIZ;
        C0W04 c0w04 = this.LIZIZ;
        if (c0w04 != null && c0w04.LLILLJJLI == null && (strLIZ = c0w04.LIZ(context, str)) != null) {
            boolean zLIZ = C817470W4z.LIZ(context, strLIZ, c0w04);
            c0w04.LLILZIL = zLIZ;
            if (zLIZ) {
                c0w04.LLILZLL = new WeakReference<>(context);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:8:0x0045, B:10:0x006c, B:12:0x0084, B:14:0x0088, B:15:0x008a, B:17:0x008e, B:19:0x0092, B:21:0x0096, B:22:0x009c, B:24:0x00a0, B:31:0x00ad, B:32:0x00b3, B:34:0x00bb, B:38:0x00c7, B:40:0x00cd), top: B:75:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db A[PHI: r1
      0x00db: PHI (r1v15 java.lang.String) = (r1v13 java.lang.String), (r1v16 java.lang.String) binds: [B:42:0x00d4, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6 A[EXC_TOP_SPLITTER, PHI: r1
      0x00d6: PHI (r1v16 java.lang.String) = (r1v13 java.lang.String), (r1v21 java.lang.String) binds: [B:42:0x00d4, B:40:0x00cd] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r22, java.lang.String r23, X.InterfaceC828360WeY r24, X.C0WWG r25) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C828330WeV.LIZIZ(android.content.Context, java.lang.String, X.0WeY, X.0WWG):void");
    }
}
