package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import java.util.List;
import kotlin.jvm.internal.AwS277S0000000_32;

/* JADX INFO: renamed from: X.18cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class RunnableC21321818cK implements Runnable {
    public final /* synthetic */ MynaGeckoChannelPreloadInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AbstractC21321718cJ LLILLL;
    public final /* synthetic */ InterfaceC1540190qBN LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    public final void LIZ() {
        List<MynaTemplatePreloadInfo> list = this.LL.preloadList;
        if (list == null || list.isEmpty()) {
            return;
        }
        C21322018cM c21322018cM = C21322218cO.LJI;
        c21322018cM.LIZLLL.put(this.LLILLJJLI, this.LL);
        for (final MynaTemplatePreloadInfo mynaTemplatePreloadInfo : this.LL.preloadList) {
            final String str = mynaTemplatePreloadInfo.url;
            if (str != null) {
                C21322018cM c21322018cM2 = C21322218cO.LJI;
                c21322018cM2.getClass();
                C21322218cO c21322218cO = C21322218cO.LIZ;
                c21322218cO.getClass();
                if (c21322018cM2.LIZ.get(str) != null) {
                    AbstractC21321718cJ abstractC21321718cJ = this.LLILLL;
                    if (abstractC21321718cJ != null) {
                        abstractC21321718cJ.LIZJ(0, mynaTemplatePreloadInfo.name, mynaTemplatePreloadInfo.url, "memory", null);
                    }
                } else {
                    final String str2 = this.LLILLJJLI;
                    final InterfaceC1540190qBN interfaceC1540190qBN = this.LLILZ;
                    final boolean z = this.LLILZIL;
                    final AbstractC21321718cJ abstractC21321718cJ2 = this.LLILLL;
                    Runnable runnable = new Runnable() { // from class: X.18cL
                        public final void LIZ() {
                            try {
                                String str3 = mynaTemplatePreloadInfo.name;
                                String strLIZ = (str3 == null || str3.length() == 0) ? C1942607jE.LIZ(str) : mynaTemplatePreloadInfo.name;
                                if (strLIZ.length() > 0) {
                                    C21322518cR c21322518cR = new C21322518cR(str2, str, strLIZ, C21321318cF.LIZ(false, false, false, 7));
                                    C21322218cO c21322218cO2 = C21322218cO.LIZ;
                                    InterfaceC1540190qBN interfaceC1540190qBN2 = interfaceC1540190qBN;
                                    boolean z2 = z;
                                    AbstractC21321718cJ abstractC21321718cJ3 = abstractC21321718cJ2;
                                    c21322218cO2.getClass();
                                    C21322218cO.LIZIZ(interfaceC1540190qBN2, c21322518cR, true, z2, abstractC21321718cJ3);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("preloadTemplate exception, ");
                                sbLIZ.append(mynaTemplatePreloadInfo.url);
                                sbLIZ.append(' ');
                                sbLIZ.append(e.getMessage());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                AbstractC21321718cJ abstractC21321718cJ4 = abstractC21321718cJ2;
                                if (abstractC21321718cJ4 != null) {
                                    MynaTemplatePreloadInfo mynaTemplatePreloadInfo2 = mynaTemplatePreloadInfo;
                                    abstractC21321718cJ4.LIZJ(7001, mynaTemplatePreloadInfo2.name, mynaTemplatePreloadInfo2.url, null, strLIZIZ);
                                }
                                C1168400gVi.LIZIZ(new AwS277S0000000_32(strLIZIZ, e, 1));
                                C1325860kbg.LJFF(e, strLIZIZ);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MynaPreloadUtil@d8bb.doPreloadTemplate$optPreloadRunnable$1$run$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MynaPreloadUtil@d8bb.doPreloadTemplate$optPreloadRunnable$1$run$1");
                        }
                    };
                    c21322218cO.getClass();
                    C21322218cO.LIZJ.execute(runnable);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MynaPreloadUtil@d8bb.doPreloadTemplate$optPreloadRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaPreloadUtil@d8bb.doPreloadTemplate$optPreloadRunnable$1");
    }

    public RunnableC21321818cK(MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo, String str, AbstractC21321718cJ abstractC21321718cJ, InterfaceC1540190qBN interfaceC1540190qBN, boolean z) {
        this.LL = mynaGeckoChannelPreloadInfo;
        this.LLILLJJLI = str;
        this.LLILLL = abstractC21321718cJ;
        this.LLILZ = interfaceC1540190qBN;
        this.LLILZIL = z;
    }
}
