package Y;

import X.AbstractC1513210pTr;
import X.C08DK;
import X.C08DL;
import X.C1168400gVi;
import X.C1292290jjX;
import X.C1468940oKS;
import X.C1474810oTv;
import X.C1478160oZK;
import X.C1482330og3;
import X.C1483340ohg;
import X.C1488750oqP;
import X.C1505310pH7;
import X.C1520640pfq;
import X.C1521180pgi;
import X.C1521200pgk;
import X.C1549240qPy;
import X.C1551360qTO;
import X.C1553130qWF;
import X.C1C7U;
import X.C207093161z;
import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import com.bytedance.geckox.policy.meta.file.ChannelFileAccessRecord;
import com.bytedance.geckox.policy.meta.file.ChannelFileRecordSettings;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.perfetservice.ICLAPerfETServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS20S2000000_23;
import kotlin.jvm.internal.AwS73S1000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS11S2100000_23 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    public static final void run$6(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        C1468940oKS.b((C1468940oKS) aRunnableS11S2100000_23.l2, aRunnableS11S2100000_23.s0, aRunnableS11S2100000_23.s1);
    }

    public static final void run$9(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        C1482330og3.LJIIIIZZ((C1482330og3) aRunnableS11S2100000_23.l2, aRunnableS11S2100000_23.s0, aRunnableS11S2100000_23.s1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str = this.s0;
        if (str == null || str.length() == 0) {
            C1168400gVi.LIZJ(new AwS73S1000000_23(this.s1, 0));
            ((C1292290jjX) this.l2).setSource(this.s1);
        } else {
            C1168400gVi.LIZJ(new AwS20S2000000_23(this.s1, this.s0, 0));
            ((C1292290jjX) this.l2).setSource(this.s0);
        }
    }

    public final void LIZ$1() {
        boolean z;
        C1551360qTO c1551360qTO = C1551360qTO.LIZ;
        String str = this.s0;
        ChannelFileRecordSettings channelFileRecordSettings = (ChannelFileRecordSettings) this.l2;
        c1551360qTO.getClass();
        long fileAccessFrequencyControlIntervalSeconds = channelFileRecordSettings.getFileAccessFrequencyControlIntervalSeconds();
        if (fileAccessFrequencyControlIntervalSeconds < 30) {
            fileAccessFrequencyControlIntervalSeconds = 30;
        }
        long j = fileAccessFrequencyControlIntervalSeconds * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap<String, Long> concurrentHashMap = C1551360qTO.LJFF;
        Long l = concurrentHashMap.get(str);
        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < j) {
            z = false;
        } else {
            concurrentHashMap.put(str, Long.valueOf(jCurrentTimeMillis));
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hit throttle, ");
            sbLIZ.append(this.s0);
            C1553130qWF.LIZLLL("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String str2 = this.s0;
        String str3 = this.s1;
        ChannelFileRecordSettings channelFileRecordSettings2 = (ChannelFileRecordSettings) this.l2;
        C08DL c08dlLIZ = C08DK.LIZ(str2, str3);
        if (c08dlLIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Parse File Path Error:Root: ");
            sbLIZ2.append(str3);
            sbLIZ2.append("\nFilePath=");
            sbLIZ2.append(str2);
            sbLIZ2.append('\n');
            C1553130qWF.LIZJ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ2), null);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Parse File Path Success.Root: ");
        sbLIZ3.append(str3);
        sbLIZ3.append("\nFilePath=");
        sbLIZ3.append(str2);
        sbLIZ3.append("\nAccessKey=");
        sbLIZ3.append(c08dlLIZ.LIZ);
        sbLIZ3.append("Channel=");
        sbLIZ3.append(c08dlLIZ.LIZIZ);
        sbLIZ3.append("\nBundle=");
        sbLIZ3.append(c08dlLIZ.LIZJ);
        C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ3));
        if (C1551360qTO.LJFF(c08dlLIZ.LIZ)) {
            C1553130qWF.LJ("gecko-debug-tag-ChannelFileRecord", "Parse File Path but isExcludeAk", null);
            return;
        }
        ChannelFileAccessRecord channelFileAccessRecordLJ = C1551360qTO.LJ(c08dlLIZ.LIZ, c08dlLIZ.LIZIZ);
        if (channelFileAccessRecordLJ == null) {
            C1553130qWF.LIZJ("gecko-debug-tag-ChannelFileRecord", "Update-File-Access Failed for getOrLoadRecord is NULL!!!", null);
            return;
        }
        channelFileAccessRecordLJ.updateAccessTime(c08dlLIZ.LIZJ, System.currentTimeMillis());
        C1551360qTO.LJIIIIZZ(c08dlLIZ.LIZ, c08dlLIZ.LIZIZ, channelFileAccessRecordLJ);
        C1551360qTO.LJIIJ(channelFileRecordSettings2, c08dlLIZ.LIZ, c08dlLIZ.LIZIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Update-File-Access Success and schedulePersist, FilePath=");
        sbLIZ4.append(str2);
        C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ4));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS11S2100000_23.LIZ$2():void");
    }

    public static final void run$0(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("MynaPlayAnimateActionTypeHandler@3344.applySourceWithPageResolver$handled$1$1");
        try {
            aRunnableS11S2100000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaPlayAnimateActionTypeHandler@3344.applySourceWithPageResolver$handled$1$1");
    }

    public static final void run$1(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1521180pgi c1521180pgi;
        C1C7U.LIZ("WebViewMonitorJsBridge@6e17.cover$1");
        try {
            C1521200pgk c1521200pgk = ((WebViewMonitorJsBridge) aRunnableS11S2100000_23.l2).webViewViewSession;
            JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(aRunnableS11S2100000_23.s0);
            String str = aRunnableS11S2100000_23.s1;
            c1521200pgk.getClass();
            if (Intrinsics.LJFF(str, "perf") && (c1521180pgi = (C1521180pgi) c1521200pgk.LLJIJIL) != null) {
                c1521180pgi.LJIILJJIL(jSONObjectLJIILL);
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("WebViewMonitorJsBridge@6e17.cover$1");
    }

    public static final void run$10(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("UploadStatistic@6c5e.uploadChannelInfo$1");
        try {
            aRunnableS11S2100000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadStatistic@6c5e.uploadChannelInfo$1");
    }

    public static final void run$11(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("ECLynxVideoView@b73a.createPreRenderStatusListener$1$onPreRenderReady$1");
        try {
            C1488750oqP c1488750oqP = (C1488750oqP) ((WeakReference) aRunnableS11S2100000_23.l2).get();
            if (c1488750oqP != null) {
                String str = aRunnableS11S2100000_23.s0;
                String str2 = aRunnableS11S2100000_23.s1;
                if ((str2 == null || Intrinsics.LJFF(str2, str)) && Intrinsics.LJFF(c1488750oqP.LLJJIJIL, str) && c1488750oqP.getParent() != null) {
                    c1488750oqP.LIZJ("pre_render_ready");
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECLynxVideoView@b73a.createPreRenderStatusListener$1$onPreRenderReady$1");
    }

    public static final void run$12(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("MonitorLogAsyncImpl@2dda.d$1");
        try {
            ((C1549240qPy) aRunnableS11S2100000_23.l2).LIZ.d(aRunnableS11S2100000_23.s0, aRunnableS11S2100000_23.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MonitorLogAsyncImpl@2dda.d$1");
    }

    public static final void run$13(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("MonitorLogAsyncImpl@2dda.i$1");
        try {
            ((C1549240qPy) aRunnableS11S2100000_23.l2).LIZ.i(aRunnableS11S2100000_23.s0, aRunnableS11S2100000_23.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MonitorLogAsyncImpl@2dda.i$1");
    }

    public static final void run$14(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("MonitorLogAsyncImpl@2dda.w$1");
        try {
            ((C1549240qPy) aRunnableS11S2100000_23.l2).LIZ.w(aRunnableS11S2100000_23.s0, aRunnableS11S2100000_23.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MonitorLogAsyncImpl@2dda.w$1");
    }

    public static final void run$15(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("MonitorLogAsyncImpl@2dda.e$1");
        try {
            ((C1549240qPy) aRunnableS11S2100000_23.l2).LIZ.e(aRunnableS11S2100000_23.s0, aRunnableS11S2100000_23.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MonitorLogAsyncImpl@2dda.e$1");
    }

    public static final void run$16(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS11S2100000_23.l2;
        String str = aRunnableS11S2100000_23.s0;
        String str2 = aRunnableS11S2100000_23.s1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.createScene$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS11S2100000_23(videoPreloadManagerAsync, str, str2, 18));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.createScene$2L");
    }

    public static final void run$17(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS11S2100000_23.l2;
        String str = aRunnableS11S2100000_23.s0;
        String str2 = aRunnableS11S2100000_23.s1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.createScene$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJI(str, str2);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.createScene$1L");
    }

    public static final void run$18(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS11S2100000_23.l2;
        String str = aRunnableS11S2100000_23.s0;
        String str2 = aRunnableS11S2100000_23.s1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.createScene$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJI(str, str2);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.createScene$2L$1L");
    }

    public static final void run$2(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("WebViewMonitorJsBridge@6e17.reportDirectly$1");
        try {
            C1521180pgi navigationManager = ((WebViewMonitorJsBridge) aRunnableS11S2100000_23.l2).getNavigationManager();
            if (navigationManager != null) {
                navigationManager.LJIJJ(aRunnableS11S2100000_23.s0, C1520640pfq.LJIILL(aRunnableS11S2100000_23.s1));
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("WebViewMonitorJsBridge@6e17.reportDirectly$1");
    }

    public static final void run$3(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("KevaKeyValueSaverImpl@236b.save$1");
        try {
            if (aRunnableS11S2100000_23.s0 == null) {
                Keva kevaLIZJ = ((C1505310pH7) aRunnableS11S2100000_23.l2).LIZJ();
                if (kevaLIZJ != null) {
                    kevaLIZJ.erase(aRunnableS11S2100000_23.s1);
                }
            } else {
                Keva kevaLIZJ2 = ((C1505310pH7) aRunnableS11S2100000_23.l2).LIZJ();
                if (kevaLIZJ2 != null) {
                    kevaLIZJ2.storeString(aRunnableS11S2100000_23.s1, aRunnableS11S2100000_23.s0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KevaKeyValueSaverImpl@236b.save$1");
    }

    public static final void run$4(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("ICLAPerfETServiceImpl@5c43.onCaptionRealDisplay$1");
        try {
            C207093161z c207093161z = ((ICLAPerfETServiceImpl) aRunnableS11S2100000_23.l2).LJIILLIIL.get(aRunnableS11S2100000_23.s0);
            if (c207093161z != null) {
                ICLAPerfETServiceImpl iCLAPerfETServiceImpl = (ICLAPerfETServiceImpl) aRunnableS11S2100000_23.l2;
                c207093161z.LIZJ(SystemClock.elapsedRealtime(), null, aRunnableS11S2100000_23.s1, iCLAPerfETServiceImpl.LJ.compareAndSet(false, true));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ICLAPerfETServiceImpl@5c43.onCaptionRealDisplay$1");
    }

    public static final void run$5(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        List<Aweme> list = (List) aRunnableS11S2100000_23.l2;
        String str = aRunnableS11S2100000_23.s0;
        String str2 = aRunnableS11S2100000_23.s1;
        C1C7U.LIZ("VideoPreloaderManagerUtil@ccfe.refreshMedias$1L");
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null) {
                if (C1474810oTv.LLJJIJIIJIL() && C1483340ohg.LJIJJLI(aweme)) {
                    C1483340ohg.LJIJ(arrayList, aweme, "", str, null);
                } else if (C1483340ohg.LJIJJ(aweme)) {
                    C1483340ohg.LJIIZILJ(str, aweme, arrayList);
                } else {
                    arrayList.add(C1483340ohg.LJI(aweme, "", str));
                }
            }
        }
        C1478160oZK.LIZ().LJJIIZI(str2, arrayList);
        C1C7U.LIZIZ("VideoPreloaderManagerUtil@ccfe.refreshMedias$1L");
    }

    public static final void run$7(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        boolean zLIZ;
        C1C7U.LIZ("ChannelFileAccessManager@6fd1.onFileAccess$1");
        try {
            aRunnableS11S2100000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChannelFileAccessManager@6fd1.onFileAccess$1");
    }

    public static final void run$8(ARunnableS11S2100000_23 aRunnableS11S2100000_23) {
        AbstractC1513210pTr abstractC1513210pTr = (AbstractC1513210pTr) aRunnableS11S2100000_23.l2;
        String str = aRunnableS11S2100000_23.s0;
        String str2 = aRunnableS11S2100000_23.s1;
        C1C7U.LIZ("BaseTTMFeatureInfo@5b8c.installUidListener$lambda$1$1L");
        synchronized (abstractC1513210pTr) {
            if (!Intrinsics.LJFF(str, str2)) {
                if (str.length() > 0) {
                    abstractC1513210pTr.LIZ(true);
                }
                abstractC1513210pTr.LIZJ = str2;
                abstractC1513210pTr.LJI();
                if (str2.length() > 0) {
                    abstractC1513210pTr.LJFF();
                }
            }
        }
        C1C7U.LIZIZ("BaseTTMFeatureInfo@5b8c.installUidListener$lambda$1$1L");
    }

    public ARunnableS11S2100000_23(C1482330og3 c1482330og3, String str, int i) {
        this.$t = i;
        this.l2 = c1482330og3;
        this.s0 = "pgc";
        this.s1 = str;
    }

    public ARunnableS11S2100000_23(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
