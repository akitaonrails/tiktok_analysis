package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13TD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TD {
    public static boolean LIZIZ;
    public static C0WKX LIZJ;
    public static C13S6 LIZLLL;
    public static final Set<String> LJ = new LinkedHashSet();
    public final HashMap<String, Integer> LIZ = new HashMap<>();

    public static final void LIZ(String str, String str2) throws Throwable {
        HashMap<String, Object> mapLJI;
        if (C0C0Y.LIZ()) {
            if (LIZLLL != null) {
                if (str2 != null) {
                    mapLJI = C2097608Jq.LJI(new Pair("music_id", str2));
                } else {
                    mapLJI = null;
                }
                C13S6 c13s6 = LIZLLL;
                if (c13s6 != null) {
                    c13s6.LJIIJJI("music", str, "music", mapLJI);
                    return;
                }
                return;
            }
            C0WKX c0wkx = LIZJ;
            if (c0wkx == null) {
                return;
            }
            c0wkx.LIZ(str, str2);
            return;
        }
        Set<String> set = LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1490520otG.LJFF().LIZ());
        sbLIZ.append(str);
        set.add(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(List<String> list, List<String> list2, String str, String str2, final InterfaceC202028143e interfaceC202028143e, final boolean z, final String str3) {
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with((String) ListProtector.get(list, 0));
        abstractC2199801B7qWith.LJIIIIZZ = list2;
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJII = ((Number) C0ANE.LIZ.getValue()).intValue();
        abstractC2199801B7qWith.LJFF(Collections.singletonList(new HttpHeader("downloader_scene", "music")));
        abstractC2199801B7qWith.LJIIJ = "music_normal_file";
        abstractC2199801B7qWith.LJIIL = new AbsDownloadListener() { // from class: X.13TE
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (downloadInfo != null) {
                    InterfaceC202028143e interfaceC202028143e2 = interfaceC202028143e;
                    if (downloadInfo.getTotalBytes() <= 0) {
                        return;
                    }
                    interfaceC202028143e2.onProgress((int) ((downloadInfo.getCurBytes() * ((long) 100)) / downloadInfo.getTotalBytes()));
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r7) throws java.lang.Throwable {
                /*
                    r6 = this;
                    r0 = 200063(0x30d7f, float:2.80348E-40)
                    boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
                    super.onSuccessed(r7)
                    r3 = 0
                    if (r7 == 0) goto L51
                    java.lang.String r4 = r4
                    boolean r0 = X.C0C0Y.LIZ()
                    if (r0 == 0) goto La8
                    X.13S6 r0 = X.C13TD.LIZLLL
                    if (r0 == 0) goto L9c
                    if (r4 == 0) goto L9a
                    r0 = 1
                    kotlin.Pair[] r2 = new kotlin.Pair[r0]
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "music_id"
                    r1.<init>(r0, r4)
                    r0 = 0
                    r2[r0] = r1
                    java.util.HashMap r4 = X.C2097608Jq.LJI(r2)
                L2c:
                    X.13S6 r2 = X.C13TD.LIZLLL
                    if (r2 == 0) goto L39
                    java.lang.String r1 = r7.getName()
                    java.lang.String r0 = "music"
                    r2.LJIIJJI(r0, r1, r0, r4)
                L39:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = r7.getSavePath()
                    r1.append(r0)
                    java.lang.String r0 = r7.getName()
                    r1.append(r0)
                    java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
                    if (r2 != 0) goto L53
                L51:
                    java.lang.String r2 = ""
                L53:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    X.13TD r0 = r2
                    r0.getClass()
                    java.lang.String r0 = "downloader_loader"
                    r1.append(r0)
                    java.lang.String r0 = ", onSuccessed ; entity : "
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r0 = " , musicFilePath : "
                    r1.append(r0)
                    r1.append(r2)
                    java.lang.String r0 = " , fileExists : "
                    r1.append(r0)
                    X.0VSJ r0 = new X.0VSJ
                    r0.<init>(r2)
                    boolean r0 = r0.exists()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C201955140j.LJIIL(r0)
                    X.143e r1 = r1
                    boolean r0 = r3
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r1.LIZ(r2, r3, r0)
                    if (r5 == 0) goto L99
                    com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
                L99:
                    return
                L9a:
                    r4 = r3
                    goto L2c
                L9c:
                    X.0WKX r1 = X.C13TD.LIZJ
                    if (r1 == 0) goto L39
                    java.lang.String r0 = r7.getName()
                    r1.LIZ(r0, r4)
                    goto L39
                La8:
                    java.util.Set<java.lang.String> r2 = X.C13TD.LJ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = r7.getSavePath()
                    r1.append(r0)
                    java.lang.String r0 = r7.getName()
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r2.add(r0)
                    goto L39
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C13TE.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int errorCode;
                String errorMessage;
                super.onFailed(downloadInfo, baseException);
                InterfaceC202028143e interfaceC202028143e2 = interfaceC202028143e;
                if (baseException != null) {
                    errorCode = baseException.getErrorCode();
                } else {
                    errorCode = -1;
                }
                String connectionUrl = null;
                if (baseException != null) {
                    errorMessage = baseException.getErrorMessage();
                } else {
                    errorMessage = null;
                }
                if (downloadInfo != null) {
                    connectionUrl = downloadInfo.getConnectionUrl();
                }
                interfaceC202028143e2.LIZJ(new C202035143l(errorCode, errorMessage, connectionUrl));
            }
        };
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJIJJLI = true;
        this.LIZ.put(str3, Integer.valueOf(abstractC2199801B7qWith.LIZJ()));
    }
}
