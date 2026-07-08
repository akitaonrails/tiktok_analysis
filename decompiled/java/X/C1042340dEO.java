package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S3101000_16;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS5S0200200_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042340dEO implements InterfaceC1035500d3M {
    public final SparkContext LIZ;
    public long LIZIZ = -1;
    public String LIZJ = "";
    public String LIZLLL = "";

    public final C1035880d3y LJ() {
        SparkContext sparkContext = this.LIZ;
        if (sparkContext != null) {
            return (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        }
        return null;
    }

    public final boolean LIZIZ() {
        AwemeRawAd awemeRawAd;
        C1035880d3y c1035880d3yLJ = LJ();
        return C1035990d49.LIZJ((c1035880d3yLJ == null || (awemeRawAd = c1035880d3yLJ.getAwemeRawAd()) == null) ? null : awemeRawAd.getFeature()) && C1042260dEG.LIZ().enable;
    }

    @Override // X.InterfaceC1035500d3M
    public final void onHide() {
        if (LIZIZ()) {
            LIZLLL(System.currentTimeMillis(), 1L);
        }
    }

    @Override // X.InterfaceC1035500d3M
    public final void onShow() {
        C1035880d3y c1035880d3yLJ;
        String strLJIJJ;
        InterfaceC1038080d7W interfaceC1038080d7W;
        if (((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).nr(LJ()) || !LIZIZ() || (c1035880d3yLJ = LJ()) == null) {
            return;
        }
        if (c1035880d3yLJ.getHasPageStart() == 1 || c1035880d3yLJ.getWebLoadStatusModel().loadingStatus == 0) {
            SparkContext sparkContext = this.LIZ;
            if (sparkContext == null || (interfaceC1038080d7W = (InterfaceC1038080d7W) sparkContext.LJFF(InterfaceC1038080d7W.class)) == null || (strLJIJJ = interfaceC1038080d7W.LJIJJ()) == null) {
                strLJIJJ = "";
            }
            LIZJ(System.currentTimeMillis(), 1L, strLJIJJ, null);
        }
    }

    public C1042340dEO(SparkContext sparkContext) {
        this.LIZ = sparkContext;
    }

    public final void LIZLLL(long j, long j2) {
        C1035880d3y c1035880d3yLJ;
        if (this.LIZIZ == -1 || (c1035880d3yLJ = LJ()) == null) {
            return;
        }
        LJFF(C2274551E1d.LIZ, c1035880d3yLJ, this.LIZJ, new AwS5S0200200_16(j, this, j2, c1035880d3yLJ, 2), new AwS31S0000100_16(j2, 23), this.LIZLLL);
        this.LIZIZ = -1L;
        c1035880d3yLJ.getRecordingModel().currentPageClickCount.set(0L);
        c1035880d3yLJ.getRecordingModel().currentPageScrollCount.set(0L);
    }

    @Override // X.InterfaceC1035500d3M
    public final void LIZ(String str, String str2, long j) {
        String containerId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageInfoIdCreate: ");
        sbLIZ.append(str2);
        sbLIZ.append(", lastPageInfoTime: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createTime: ");
        sbLIZ.append(j);
        sbLIZ.append(", containerId: ");
        C1035880d3y c1035880d3yLJ = LJ();
        if (c1035880d3yLJ != null) {
            containerId = c1035880d3yLJ.getContainerId();
        } else {
            containerId = null;
        }
        sbLIZ.append(containerId);
        sbLIZ.append(", url ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LIZIZ()) {
            return;
        }
        if (str != null && !a0.LJJJIL(str) && (u.LJJIIJZLJL(str, "data:text/html", false) || C1035990d49.LJFF(str) || Intrinsics.LJFF(this.LIZLLL, str))) {
            return;
        }
        LIZLLL(System.currentTimeMillis(), 0L);
        this.LIZLLL = str;
        LIZJ(System.currentTimeMillis(), 0L, str2, str);
    }

    public final void LIZJ(long j, long j2, String str, String str2) {
        C1035880d3y c1035880d3yLJ = LJ();
        if (c1035880d3yLJ == null) {
            return;
        }
        LJFF(C2274531E1b.LIZ, c1035880d3yLJ, str, new AwS31S0000100_16(j2, 24), new AwS31S0000100_16(j2, 25), str2);
        this.LIZIZ = j;
        this.LIZJ = str;
    }

    public static void LJFF(C1023960ckk c1023960ckk, C1035880d3y c1035880d3y, String str, Function1 function1, Function1 function12, String str2) {
        String creativeIdStr;
        String currentUrlOrWebUrl = str2;
        int iIncrementAndGet = c1035880d3y.getRecordingModel().eventIndex.incrementAndGet();
        boolean z = true;
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1035880d3y);
        IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) ServiceManager.get().getService(IAdLandPageEngageInfoProvider.class);
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null) {
            creativeIdStr = awemeRawAd.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        String strLIZIZ = iAdLandPageEngageInfoProvider.LIZIZ(creativeIdStr);
        if (currentUrlOrWebUrl != null && currentUrlOrWebUrl.length() != 0) {
            z = false;
        }
        String str3 = "";
        if (z && (currentUrlOrWebUrl = c1035880d3y.getCurrentUrlOrWebUrl()) == null) {
            currentUrlOrWebUrl = "";
        }
        adWebEventLogger.logAd(c1023960ckk, c1035880d3y.getAwemeRawAd(), new AwS0S3101000_16(iIncrementAndGet, strLIZIZ, str, currentUrlOrWebUrl, function1, 2));
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        String url = c1035880d3y.getUrl();
        if (url == null) {
            url = "";
        }
        String second = c1023960ckk.LJI.getSecond();
        String containerId = c1035880d3y.getContainerId();
        if (containerId != null) {
            str3 = containerId;
        }
        C2283708x9.LIZ(new RunnableC1042850dFD(new C1042860dFE(url, currentUrlOrWebUrl, second, "", "", str3, str, String.valueOf(System.currentTimeMillis()), iIncrementAndGet, C1035990d49.LIZLLL(strLIZIZ, c1035880d3y, function12)), null));
    }
}
