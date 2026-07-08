package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0oKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468840oKI implements AVMDLURLFetcherInterface {
    public final String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String[] LJ;
    public VideoInfoFetcher LJFF;
    public AVMDLURLFetcherListener LJI;
    public final Context LJII;
    public String LJIIIIZZ;

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final void close() {
        VideoInfoFetcher videoInfoFetcher = this.LJFF;
        if (videoInfoFetcher != null) {
            videoInfoFetcher.LJI();
            this.LJFF = null;
        }
        this.LJ = null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final String[] getURLs() {
        String[] strArr = this.LJ;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get urls from cache. + urls.length = ");
        sbLIZ.append(this.LJ.length);
        TTVideoEngineLog.d("MDLFetcher", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJ;
    }

    public static String[] LIZ(String str, C1470240oMY c1470240oMY) {
        if (c1470240oMY != null && !TextUtils.isEmpty(str)) {
            HashMap map = new HashMap();
            map.put(15, str);
            C1474520oTS c1474520oTSLJJIJIIJI = c1470240oMY.LJJIJIIJI(map);
            if (c1474520oTSLJJIJIIJI != null) {
                String[] strArrLJIIJ = c1474520oTSLJJIJIIJI.LJIIJ();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_getUrlsFromVideoModel ");
                sbLIZ.append(Arrays.toString(strArrLJIIJ));
                TTVideoEngineLog.d("MDLFetcher", C2188811AlT.LIZIZ(sbLIZ));
                if (strArrLJIIJ == null || strArrLJIIJ.length <= 0) {
                    return null;
                }
                return strArrLJIIJ;
            }
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("MDLFetcher", "_getUrlsFromVideoModel videoInfo is null");
            return null;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_getUrlsFromVideoModel videoModel is null or fileHash is empty ");
        sbLIZ2.append(str);
        TTVideoEngineLog.d("MDLFetcher", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public C1468840oKI(Context context, String str, String str2) {
        this.LJII = context;
        this.LIZ = C790040Uyw.LIZ(str);
        this.LIZIZ = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int start(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.ss.mediakit.fetcher.AVMDLURLFetcherListener r12) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468840oKI.start(java.lang.String, java.lang.String, java.lang.String, com.ss.mediakit.fetcher.AVMDLURLFetcherListener):int");
    }
}
