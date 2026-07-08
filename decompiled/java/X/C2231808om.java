package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS88S1200000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2231808om {
    public final C2152808c2 LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final ConcurrentHashMap<String, C2229808oS> LIZJ = new ConcurrentHashMap<>();
    public final C20181513xt LIZLLL = new C20181513xt(C2149108bR.LIZ().downloadMaxConcurrent);

    public C2231808om(C2152808c2 c2152808c2, C054G c054g) {
        this.LIZ = c2152808c2;
        this.LIZIZ = c054g;
    }

    public final synchronized AnonymousClass0957<String> LIZ(String str, String str2, String str3, String str4) {
        C0VSJ c0vsjLJI = this.LIZ.LJI(str, str2);
        int i = 0;
        if (c0vsjLJI.exists() && c0vsjLJI.length() > 0) {
            String absolutePath = this.LIZ.LJI(str, str2).getAbsolutePath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceDownloader cache hit: vid=");
            sbLIZ.append(str);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            return C090F.LIZ(absolutePath);
        }
        C2229808oS c2229808oS = this.LIZJ.get(str);
        if (c2229808oS != null && c2229808oS.LIZ.isActive()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinVoiceDownloader joining in-flight: vid=");
            sbLIZ2.append(str);
            sbLIZ2.append(" trigger=");
            sbLIZ2.append(str4);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            if (Intrinsics.LJFF(str4, "click")) {
                c2229808oS.LIZIZ.set(10);
                C2233808p6 c2233808p6 = C2233808p6.LIZ;
                this.LIZJ.size();
                c2233808p6.getClass();
                C2233808p6.LJI(str, str4, true);
            }
            return c2229808oS.LIZ;
        }
        C2233808p6 c2233808p62 = C2233808p6.LIZ;
        this.LIZJ.size();
        c2233808p62.getClass();
        C2233808p6.LJI(str, str4, false);
        if (Intrinsics.LJFF(str4, "click")) {
            i = 10;
        }
        AtomicInteger atomicInteger = new AtomicInteger(i);
        C099G c099gLIZIZ = C23250099c.LIZIZ(this.LIZIZ, null, null, new C2152708c1(this, str, str2, str3, atomicInteger, null), 3);
        C2229808oS c2229808oS2 = new C2229808oS(c099gLIZIZ, atomicInteger);
        this.LIZJ.put(str, c2229808oS2);
        c099gLIZIZ.LJII(new AwS88S1200000_3(this, str, c2229808oS2, 1));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("BulletinVoiceDownloader started new task: vid=");
        sbLIZ3.append(str);
        sbLIZ3.append(" trigger=");
        sbLIZ3.append(str4);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
        return c099gLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.concurrent.atomic.AtomicInteger r30, X.InterfaceC1364105Vn<? super java.lang.String> r31) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2231808om.LIZIZ(java.lang.String, java.lang.String, java.lang.String, java.util.concurrent.atomic.AtomicInteger, X.05Vn):java.lang.Object");
    }

    public final Object LIZJ(Context context, final String str, final String str2, String str3, String str4, final File file, final File file2, C2231908on c2231908on) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c2231908on));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new AwS88S1200000_3(atomicInteger, this, str, context, 2));
        DownloadTask downloadTaskWith = C2200151B8z.with(context);
        downloadTaskWith.url(str2);
        downloadTaskWith.savePath(str3);
        downloadTaskWith.name(str4);
        downloadTaskWith.retryCount(3);
        downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.08oX
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinVoiceDownloader: HTTP cancelled vid=");
                sbLIZ.append(str);
                sbLIZ.append(" elapsed=");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ.append("ms");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    C189200o6.m2constructorimpl(Boolean.valueOf(file.delete()));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onStart(DownloadInfo downloadInfo) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinVoiceDownloader: HTTP start vid=");
                sbLIZ.append(str);
                sbLIZ.append(" url=");
                sbLIZ.append(str2);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                Object c098200Yq;
                File file3 = file2;
                File file4 = file;
                try {
                    if (file3.exists()) {
                        file3.delete();
                    }
                    c098200Yq = Boolean.valueOf(file4.renameTo(file3));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                if (((Boolean) c098200Yq).booleanValue()) {
                    long length = file2.length();
                    C0OPX.LJII("BulletinVoiceDownloader: HTTP success vid=" + str + " bytes=" + length + " elapsed=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                    C2233808p6 c2233808p6 = C2233808p6.LIZ;
                    String str5 = str;
                    int size = this.LIZJ.size();
                    c2233808p6.getClass();
                    C2233808p6.LJFF(size, length, null, str5, "success", null);
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                        String absolutePath = file2.getAbsolutePath();
                        C189200o6.m2constructorimpl(absolutePath);
                        interfaceC20236714Gf.resumeWith(absolutePath);
                        return;
                    }
                    return;
                }
                C0OPX.LJIIIIZZ("BulletinVoiceDownloader: rename failed vid=" + str + " tmpBytes=" + file.length());
                try {
                    C189200o6.m2constructorimpl(Boolean.valueOf(file.delete()));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                C2233808p6 c2233808p62 = C2233808p6.LIZ;
                String str6 = str;
                int size2 = this.LIZJ.size();
                c2233808p62.getClass();
                C2233808p6.LJFF(size2, 0L, -100L, str6, "fail", "tmp→final rename returned false");
                if (!c2252611DEt.isActive()) {
                    return;
                }
                InterfaceC20236714Gf<String> interfaceC20236714Gf2 = c2252611DEt;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf2.resumeWith(null);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                Integer numValueOf;
                String message;
                long errorCode;
                String message2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinVoiceDownloader: HTTP failed vid=");
                sbLIZ.append(str);
                sbLIZ.append(" errCode=");
                if (baseException != null) {
                    numValueOf = Integer.valueOf(baseException.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" elapsed=");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ.append("ms error=");
                if (baseException != null) {
                    message = baseException.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    C189200o6.m2constructorimpl(Boolean.valueOf(file.delete()));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C2233808p6 c2233808p6 = C2233808p6.LIZ;
                String str5 = str;
                if (baseException != null) {
                    errorCode = baseException.getErrorCode();
                } else {
                    errorCode = -1;
                }
                Long lValueOf = Long.valueOf(errorCode);
                if (baseException != null) {
                    message2 = baseException.getMessage();
                } else {
                    message2 = null;
                }
                int size = this.LIZJ.size();
                c2233808p6.getClass();
                C2233808p6.LJFF(size, 0L, lValueOf, str5, "fail", message2);
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }
            }
        });
        downloadTaskWith.asyncDownload(new InterfaceC2329409Au() { // from class: X.08oo
            @Override // X.InterfaceC2329409Au
            public final void onStart(int i) {
                atomicInteger.set(i);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c2231908on);
        }
        return objLJIJ;
    }
}
