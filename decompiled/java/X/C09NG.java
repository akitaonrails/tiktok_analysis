package X;

import Y.ARunnableS36S0400000_28;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09NG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NG extends AbstractC1871960yoU {
    public final IHostNetworkDepend LJII() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (iHostNetworkDepend2 = c1871520ynm.LJIIIIZZ) != null) {
            return iHostNetworkDepend2;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        return (c1871520ynm2 == null || (iHostNetworkDepend = c1871520ynm2.LJIIIIZZ) == null) ? new C1515160pX0() : iHostNetworkDepend;
    }

    public final IHostPermissionDepend LJIIIIZZ() {
        IHostPermissionDepend iHostPermissionDepend;
        C1871520ynm c1871520ynm = (C1871520ynm) LJFF(C1871520ynm.class);
        if (c1871520ynm != null && (iHostPermissionDepend = c1871520ynm.LJIIIZ) != null) {
            return iHostPermissionDepend;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        if (c1871520ynm2 != null) {
            return c1871520ynm2.LJIIIZ;
        }
        return null;
    }

    public final void LJIIIZ(Context context, C1871950yoT c1871950yoT, C09NH c09nh) throws Throwable {
        LinkedHashMap linkedHashMapLJII;
        C1871520ynm c1871520ynm;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        List<C09NI> list = c1871950yoT.LJ;
        if (list != null) {
            ArrayList<Pair> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C09NI c09ni : list) {
                C0VSJ c0vsjLJI = LJI(context, c09ni.LIZIZ, c09nh, c09ni.LIZ);
                if (c0vsjLJI != null) {
                    arrayList.add(new Pair(c09ni.LIZ, c0vsjLJI));
                } else {
                    return;
                }
            }
            linkedHashMapLJII = new LinkedHashMap();
            for (Pair pair : arrayList) {
                linkedHashMapLJII.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            String str = c1871950yoT.LIZIZ;
            if (str == null) {
                str = null;
            }
            if (str.length() > 0) {
                String str2 = c1871950yoT.LIZIZ;
                if (str2 == null) {
                    str2 = null;
                }
                C0VSJ c0vsjLJI2 = LJI(context, str2, c09nh, "filePath");
                if (c0vsjLJI2 == null || (linkedHashMapLJII = C2097608Jq.LJII(new Pair("file", c0vsjLJI2))) == null) {
                    return;
                }
            } else {
                c09nh.LIZ(-3, "filePath or formDataBody can not be null.", null);
                return;
            }
        }
        C1871520ynm c1871520ynm2 = (C1871520ynm) LJFF(C1871520ynm.class);
        if (((c1871520ynm2 == null || (iHostThreadPoolExecutorDepend = c1871520ynm2.LJIIJ) == null) && ((c1871520ynm = C1871520ynm.LJIIL) == null || (iHostThreadPoolExecutorDepend = c1871520ynm.LJIIJ) == null)) || (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
            normalThreadExecutor = C2126108Up.LIZ;
        }
        normalThreadExecutor.execute(new ARunnableS36S0400000_28(c1871950yoT, linkedHashMapLJII, this, c09nh, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b1 A[Catch: IOException -> 0x03f4, TRY_ENTER, TryCatch #1 {IOException -> 0x03f4, blocks: (B:105:0x01b1, B:107:0x01b6, B:109:0x01bb, B:111:0x01c0, B:80:0x017f, B:81:0x0182, B:83:0x0187, B:85:0x018c), top: B:235:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6 A[Catch: IOException -> 0x03f4, TryCatch #1 {IOException -> 0x03f4, blocks: (B:105:0x01b1, B:107:0x01b6, B:109:0x01bb, B:111:0x01c0, B:80:0x017f, B:81:0x0182, B:83:0x0187, B:85:0x018c), top: B:235:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb A[Catch: IOException -> 0x03f4, TryCatch #1 {IOException -> 0x03f4, blocks: (B:105:0x01b1, B:107:0x01b6, B:109:0x01bb, B:111:0x01c0, B:80:0x017f, B:81:0x0182, B:83:0x0187, B:85:0x018c), top: B:235:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c0 A[Catch: IOException -> 0x03f4, TRY_LEAVE, TryCatch #1 {IOException -> 0x03f4, blocks: (B:105:0x01b1, B:107:0x01b6, B:109:0x01bb, B:111:0x01c0, B:80:0x017f, B:81:0x0182, B:83:0x0187, B:85:0x018c), top: B:235:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d3 A[Catch: IOException -> 0x01e1, TryCatch #9 {IOException -> 0x01e1, blocks: (B:117:0x01ce, B:119:0x01d3, B:121:0x01d8, B:123:0x01dd), top: B:242:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d8 A[Catch: IOException -> 0x01e1, TryCatch #9 {IOException -> 0x01e1, blocks: (B:117:0x01ce, B:119:0x01d3, B:121:0x01d8, B:123:0x01dd), top: B:242:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd A[Catch: IOException -> 0x01e1, TRY_LEAVE, TryCatch #9 {IOException -> 0x01e1, blocks: (B:117:0x01ce, B:119:0x01d3, B:121:0x01d8, B:123:0x01dd), top: B:242:0x01ce }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [X.0VSV, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.nio.channels.FileChannel, java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VSJ LJI(android.content.Context r14, java.lang.String r15, X.C09NH r16, java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09NG.LJI(android.content.Context, java.lang.String, X.09NH, java.lang.String):X.0VSJ");
    }
}
