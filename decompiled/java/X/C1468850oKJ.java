package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oKJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468850oKJ implements AVMDLURLFetcherInterface {
    public WeakReference<InterfaceC1468880oKM> LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String[] LIZLLL;
    public VideoInfoFetcher LJ;
    public AVMDLURLFetcherListener LJFF;
    public String LJI;
    public C1470240oMY LJII;

    public final InterfaceC1468880oKM LIZ() {
        WeakReference<InterfaceC1468880oKM> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        int i = C2187451AjH.LIZ;
        TTVideoEngineLog.d("MDLFetcherNew", "getMDLFetcherListener is null");
        return null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final void close() {
        VideoInfoFetcher videoInfoFetcher = this.LJ;
        if (videoInfoFetcher != null) {
            videoInfoFetcher.LJI();
            this.LJ = null;
        }
        this.LIZ = null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final String[] getURLs() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mdl getURLs ");
        sbLIZ.append(Arrays.toString(this.LIZLLL));
        C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ));
        return this.LIZLLL;
    }

    public C1468850oKJ(InterfaceC1468880oKM interfaceC1468880oKM) {
        this.LIZ = new WeakReference<>(interfaceC1468880oKM);
    }

    public static String[] LIZIZ(String str, C1470240oMY c1470240oMY) {
        if (c1470240oMY != null && !TextUtils.isEmpty(str)) {
            HashMap map = new HashMap();
            map.put(15, str);
            if (str.startsWith("fileid")) {
                try {
                    map.put(28, str.substring(6));
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("MDLFetcherNew", "fileid index out of bounds");
                }
            }
            C1474520oTS c1474520oTSLJJIJIIJI = c1470240oMY.LJJIJIIJI(map);
            if (c1474520oTSLJJIJIIJI == null) {
                int i2 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoInfo is null");
                return null;
            }
            String[] strArrLJIIJ = c1474520oTSLJJIJIIJI.LJIIJ();
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUrlsFromVideoModelByFileHash ");
            sbLIZ.append(Arrays.toString(strArrLJIIJ));
            C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ));
            return strArrLJIIJ;
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getUrlsFromVideoModelByFileHash videoModel is null or fileHash is empty ");
        sbLIZ2.append(str);
        C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public static boolean LIZJ(String str, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("MDLFetcherNew", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    public final void LIZLLL(e eVar, boolean z) {
        C1470240oMY c1470240oMYLIZIZ;
        JSONObject jSONObjectLJII;
        if (z) {
            this.LJFF.onCompletion(eVar.LIZ, this.LIZIZ, this.LIZJ, null);
        }
        InterfaceC1468880oKM interfaceC1468880oKMLIZ = LIZ();
        if (interfaceC1468880oKMLIZ != null) {
            interfaceC1468880oKMLIZ.LIZLLL(eVar, this.LIZJ);
            if (eVar.LIZ == -10003 && (c1470240oMYLIZIZ = interfaceC1468880oKMLIZ.LIZIZ()) != null && (jSONObjectLJII = c1470240oMYLIZIZ.LJII()) != null) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("MDLFetcherNew", C786410Ut5.j4("old video model: %s", new Object[]{C786410Ut5.J3(jSONObjectLJII)}));
            }
        }
        close();
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public final int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        boolean z;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start rawKey ");
        sbLIZ.append(str);
        sbLIZ.append(", fileKey ");
        sbLIZ.append(str2);
        sbLIZ.append(", olderUrl ");
        sbLIZ.append(str3);
        sbLIZ.append(", listener ");
        sbLIZ.append(aVMDLURLFetcherListener);
        C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJFF = aVMDLURLFetcherListener;
        this.LJI = str3;
        InterfaceC1468880oKM interfaceC1468880oKMLIZ = LIZ();
        if (interfaceC1468880oKMLIZ == null) {
            C1471660oOq.LIZJ("MDLFetcherNew", "start MDLFetcherListener is null return MDL_GET_URLS");
            LIZLLL(new e("kTTVideoErrorDomainMDLRetry", -10001, 0, "MDLFetcherListener is empty"), false);
            return 1;
        }
        String strLJ = interfaceC1468880oKMLIZ.LJ();
        if (TextUtils.isEmpty(strLJ)) {
            C1471660oOq.LIZJ("MDLFetcherNew", "start fallbackApi is empty return MDL_GET_URLS");
            LIZLLL(new e("kTTVideoErrorDomainMDLRetry", -10002, 0, "fallbackApi is empty"), false);
            return 1;
        }
        C1468800oKE c1468800oKELIZ = C1468790oKD.LIZIZ().LIZ(this.LIZIZ, strLJ);
        if (c1468800oKELIZ != null && !c1468800oKELIZ.LIZJ) {
            C1470240oMY c1470240oMY = c1468800oKELIZ.LIZ;
            this.LJII = c1470240oMY;
            String[] strArrLIZIZ = LIZIZ(this.LIZJ, c1470240oMY);
            if (strArrLIZIZ != null && strArrLIZIZ.length > 0) {
                if (!LIZJ(str3, strArrLIZIZ)) {
                    C1468790oKD.LIZIZ().LJFF(this.LIZIZ, strLJ);
                    C1471660oOq.LIZJ("MDLFetcherNew", "getURLsFromCache urls is invalid");
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getURLsFromCache ");
                    sbLIZ2.append(Arrays.toString(strArrLIZIZ));
                    C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ2));
                    if (strArrLIZIZ.length > 0) {
                        this.LIZLLL = strArrLIZIZ;
                        C1471660oOq.LIZJ("MDLFetcherNew", "start return MDL_GET_URLS");
                        C1470240oMY c1470240oMY2 = this.LJII;
                        InterfaceC1468880oKM interfaceC1468880oKMLIZ2 = LIZ();
                        if (interfaceC1468880oKMLIZ2 != null) {
                            interfaceC1468880oKMLIZ2.LIZJ(c1470240oMY2, false, this.LIZJ);
                        }
                        close();
                        return 1;
                    }
                }
            } else {
                C1471660oOq.LIZJ("MDLFetcherNew", "getURLsFromCache temUrls is null");
            }
        } else {
            C1471660oOq.LIZJ("MDLFetcherNew", "getURLsFromCache cacheInfo is null or isExpired");
        }
        Context context = interfaceC1468880oKMLIZ.getContext();
        VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(context);
        this.LJ = videoInfoFetcher;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        videoInfoFetcher.LJIIIZ(z);
        VideoInfoFetcher videoInfoFetcher2 = this.LJ;
        videoInfoFetcher2.LJIIL = str;
        videoInfoFetcher2.LJII = new InterfaceC1468830oKH(this) { // from class: X.0oKK
            public final WeakReference<C1468850oKJ> LIZ;

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZ(e eVar) {
                C1468850oKJ c1468850oKJ = this.LIZ.get();
                if (c1468850oKJ != null && c1468850oKJ.LIZ() != null) {
                    c1468850oKJ.LIZ().LIZ(eVar);
                }
            }

            @Override // X.InterfaceC1468830oKH
            public final void onLog(String str4) {
                C1468850oKJ c1468850oKJ = this.LIZ.get();
                if (c1468850oKJ != null && c1468850oKJ.LIZ() != null) {
                    c1468850oKJ.LIZ().onLog(str4);
                }
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZIZ(int i2, String str4) {
                C1468850oKJ c1468850oKJ = this.LIZ.get();
                if (c1468850oKJ == null) {
                    int i3 = C2187451AjH.LIZ;
                    C1471660oOq.LIZJ("MDLFetcherNew", "onStatusException but fetcher is null");
                } else {
                    c1468850oKJ.LIZLLL(new e("kTTVideoErrorDomainMDLRetry", -10005, i2, str4), true);
                }
            }

            @Override // X.InterfaceC1468830oKH
            public final void LIZJ(C1470240oMY c1470240oMY3, e eVar) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onCompletion model ");
                sbLIZ3.append(c1470240oMY3);
                sbLIZ3.append(", error ");
                sbLIZ3.append(eVar);
                C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ3));
                C1468850oKJ c1468850oKJ = this.LIZ.get();
                if (c1468850oKJ == null) {
                    C1471660oOq.LIZJ("MDLFetcherNew", "onCompletion but fetcher is null");
                    return;
                }
                if (eVar != null) {
                    c1468850oKJ.LIZLLL(eVar, true);
                    return;
                }
                if (c1470240oMY3 == null) {
                    c1468850oKJ.LIZLLL(new e("kTTVideoErrorDomainMDLRetry", -9997, 0, "fetch empty"), true);
                    return;
                }
                c1468850oKJ.LIZLLL = C1468850oKJ.LIZIZ(c1468850oKJ.LIZJ, c1470240oMY3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onCompletion newUrls ");
                sbLIZ4.append(Arrays.toString(c1468850oKJ.LIZLLL));
                C1471660oOq.LIZJ("MDLFetcherNew", C2188811AlT.LIZIZ(sbLIZ4));
                String[] strArr = c1468850oKJ.LIZLLL;
                if (strArr != null && strArr.length != 0) {
                    if (C1468850oKJ.LIZJ(c1468850oKJ.LJI, strArr)) {
                        c1468850oKJ.LJFF.onCompletion(0, c1468850oKJ.LIZIZ, c1468850oKJ.LIZJ, c1468850oKJ.LIZLLL);
                        InterfaceC1468880oKM interfaceC1468880oKMLIZ3 = c1468850oKJ.LIZ();
                        if (interfaceC1468880oKMLIZ3 != null) {
                            interfaceC1468880oKMLIZ3.LIZJ(c1470240oMY3, true, c1468850oKJ.LIZJ);
                        }
                        c1468850oKJ.close();
                        return;
                    }
                    c1468850oKJ.LIZLLL(new e("kTTVideoErrorDomainMDLRetry", -10004, 0, "fetch videoModel is expired"), true);
                    return;
                }
                c1468850oKJ.LIZLLL(new e("kTTVideoErrorDomainMDLRetry", -10003, 0, "file hash invalid"), true);
                JSONObject jSONObjectLJII = c1470240oMY3.LJII();
                if (jSONObjectLJII != null) {
                    C1471660oOq.LIZJ("MDLFetcherNew", C786410Ut5.j4("new video model: %s", new Object[]{C786410Ut5.J3(jSONObjectLJII)}));
                }
            }
        };
        VideoInfoFetcher videoInfoFetcher3 = this.LJ;
        videoInfoFetcher3.getClass();
        videoInfoFetcher3.LJI = true;
        this.LJ.LJII(0, strLJ, null, null);
        C1471660oOq.LIZJ("MDLFetcherNew", "start return CALLBACK_URLS_TO_MDL");
        return 0;
    }
}
