package Y;

import X.C098200Yq;
import X.C0C64;
import X.C0NBW;
import X.C0VSJ;
import X.C0X9F;
import X.C0X9G;
import X.C1471410oOR;
import X.C1472310oPt;
import X.C1474930oU7;
import X.C1475700oVM;
import X.C1476410oWV;
import X.C1478160oZK;
import X.C1479110oar;
import X.C1480970odr;
import X.C1483270ohZ;
import X.C1484130oix;
import X.C1487370ooB;
import X.C1492020ovg;
import X.C1499100p76;
import X.C1514760pWM;
import X.C1550610qSB;
import X.C1551020qSq;
import X.C1551330qTL;
import X.C1551350qTN;
import X.C1551360qTO;
import X.C1551380qTQ;
import X.C1551410qTT;
import X.C1551500qTc;
import X.C1551780qU4;
import X.C1551940qUK;
import X.C1552810qVj;
import X.C1553130qWF;
import X.C1553140qWG;
import X.C189200o6;
import X.C1957007lY;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C797990VSb;
import X.C805420Vie;
import X.EnumC1520990pgP;
import X.InterfaceC1471400oOQ;
import X.InterfaceC1551450qTX;
import Y.ARunnableS106S0100000_6;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.policy.meta.ChannelMetaDataItem;
import com.bytedance.geckox.policy.meta.ChannelMetaDataReportSettings;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.NGSettings;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS98S0000000_23 implements Runnable {
    public final int $t;

    public static final void run$7(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("LynxViewMonitor@efbe.reportFallbackPage$1");
        C1C7U.LIZIZ("LynxViewMonitor@efbe.reportFallbackPage$1");
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
                C1499100p76.LIZ();
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
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static void LIZ$0() {
        SharedPreferences sharedPreferencesLIZIZ;
        String str;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        File[] fileArrListFiles;
        Map map;
        OptionCheckUpdateParams.CustomValue customValue;
        String strLIZIZ;
        long jLJIIIZ;
        C0VSJ c0vsj;
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        GlobalConfigSettings globalConfigSettingsLJI = c1551940qUK.LJI();
        if (globalConfigSettingsLJI != null) {
            int version = globalConfigSettingsLJI.getVersion();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(version);
            C1551780qU4.LJII(5, 1001, "", C2188811AlT.LIZIZ(sbLIZ));
        }
        NGSettings nGSettingsLJII = c1551940qUK.LJII();
        if (nGSettingsLJII != null) {
            int i = nGSettingsLJII.version;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(i);
            C1551780qU4.LJII(5, 1002, "", C2188811AlT.LIZIZ(sbLIZ2));
        }
        c1551940qUK.LIZIZ();
        File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
        ArrayList<C1551410qTT> arrayList = new ArrayList();
        File[] fileArrListFiles2 = rootDirectory.listFiles();
        if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
            long j = 0;
            for (File file : fileArrListFiles2) {
                String name = file.getName();
                if (!TextUtils.isEmpty(name) && (fileArrListFiles = file.listFiles(new C0X9G())) != null && fileArrListFiles.length != 0) {
                    long j2 = 0;
                    int iLIZLLL = 0;
                    for (File file2 : fileArrListFiles) {
                        File[] fileArrListFiles3 = file2.listFiles(new C0X9G());
                        long j3 = 0;
                        iLIZLLL = C1551020qSq.LIZLLL(0L, file2.getAbsolutePath(), true, true) + iLIZLLL;
                        if (fileArrListFiles3 != null && fileArrListFiles3.length != 0) {
                            for (File file3 : fileArrListFiles3) {
                                try {
                                    CastLongProtector.valueOf(file3.getName());
                                    try {
                                        C0VSJ c0vsj2 = new C0VSJ(file3, "res.zip");
                                        if (c0vsj2.exists()) {
                                            c0vsj2.delete();
                                        }
                                        c0vsj = new C0VSJ(file3, "res");
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        jLJIIIZ = C0X9F.LJIIIZ(file3);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                                if (c0vsj.exists()) {
                                    jLJIIIZ = C0X9F.LJIIIZ(c0vsj);
                                    j3 += jLJIIIZ;
                                }
                            }
                        }
                        j2 += j3;
                    }
                    j += j2;
                    int length = fileArrListFiles.length;
                    Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = C797990VSb.LIZ.LIZIZ;
                    if (map2 == null || (map = (Map) ((ConcurrentHashMap) map2).get(name)) == null || (customValue = (OptionCheckUpdateParams.CustomValue) map.get("business_version")) == null) {
                        strLIZIZ = C1551380qTQ.LIZIZ();
                    } else {
                        strLIZIZ = (String) customValue.getValue();
                        if (TextUtils.isEmpty(strLIZIZ)) {
                            strLIZIZ = C1551380qTQ.LIZIZ();
                        }
                    }
                    arrayList.add(new C1551410qTT(length, j2, iLIZLLL, name, strLIZIZ));
                }
            }
            if (arrayList.size() != 0) {
                C1551780qU4.LIZ.getClass();
                InterfaceC1551450qTX interfaceC1551450qTXLIZJ = C1551780qU4.LIZJ();
                if (interfaceC1551450qTXLIZJ != null) {
                    try {
                        for (C1551410qTT c1551410qTT : arrayList) {
                            String str2 = c1551410qTT.LIZ;
                            long j4 = c1551410qTT.LIZIZ;
                            int i2 = c1551410qTT.LIZJ;
                            String str3 = c1551410qTT.LIZLLL;
                            int i3 = c1551410qTT.LJ;
                            JSONObject jSONObject = new JSONObject();
                            C1551780qU4.LIZ.getClass();
                            C1551780qU4.LIZ(jSONObject);
                            jSONObject.put("access_key", str2);
                            jSONObject.put("access_key_resource_usage", j4);
                            jSONObject.put("channel_count", i2);
                            jSONObject.put("business_version", str3);
                            jSONObject.put("delete_old_dir_count", i3);
                            jSONObject.put("gecko_total_resource_usage", j);
                            C1551330qTL.LIZ.getClass();
                            jSONObject.put("block_channels", C1551330qTL.LIZLLL(str2));
                            jSONObject.put("blocklist_count", C1551330qTL.LJ(str2));
                            interfaceC1551450qTXLIZJ.LIZ("geckosdk_access_key_resource_info", jSONObject);
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceInfoToTea", e3);
                    }
                }
            }
        }
        AppSettingsManager appSettingsManager = C1957007lY.LIZ;
        if (!appSettingsManager.LIZ().getEnabled()) {
            C1551360qTO.LIZ.getClass();
            C1551360qTO.LJIIIZ();
        }
        C1551350qTN.LIZ.getClass();
        try {
            ChannelMetaDataReportSettings channelMetaDataReportSettings = appSettingsManager.LJIIL;
            if (channelMetaDataReportSettings == null) {
                channelMetaDataReportSettings = new ChannelMetaDataReportSettings();
            }
            long millis = TimeUnit.DAYS.toMillis(channelMetaDataReportSettings.getCreateDays());
            Iterator it2 = ((Set) C1551350qTN.LIZIZ.getValue()).iterator();
            while (it2.hasNext()) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"-"}, 0, 6);
                String str4 = (String) listLJJLIIIJILLIZJL.get(1);
                String str5 = (String) listLJJLIIIJILLIZJL.get(2);
                C1551350qTN.LIZ.getClass();
                if (Intrinsics.LJFF(str4, (String) C1551350qTN.LIZJ.getValue()) && (sharedPreferencesLIZIZ = C1551350qTN.LIZIZ(str5)) != null) {
                    if (C1551350qTN.LIZJ(str5)) {
                        sharedPreferencesLIZIZ.edit().clear().apply();
                    } else {
                        Map<String, ?> all = sharedPreferencesLIZIZ.getAll();
                        if (all != null) {
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if ((value instanceof String) && (str = (String) value) != null) {
                                    C1551350qTN.LIZ.getClass();
                                    ChannelMetaDataItem channelMetaDataItemLIZ = C1551350qTN.LIZ(str);
                                    if (channelMetaDataItemLIZ != null) {
                                        if (channelMetaDataItemLIZ.getLatestVersion() != 0 && C1550610qSB.LIZLLL(str5, key) == null) {
                                            channelMetaDataItemLIZ.setLatestVersion(0L);
                                        }
                                        if (channelMetaDataItemLIZ.getLatestVersion() == 0 && System.currentTimeMillis() - channelMetaDataItemLIZ.getCreateTime() > millis) {
                                            SharedPreferences sharedPreferencesLIZIZ2 = C1551350qTN.LIZIZ(str5);
                                            if (sharedPreferencesLIZIZ2 != null && (editorEdit = sharedPreferencesLIZIZ2.edit()) != null && (editorRemove = editorEdit.remove(key)) != null) {
                                                editorRemove.apply();
                                            }
                                            C1551360qTO.LIZ.getClass();
                                            SharedPreferences sharedPreferencesLIZLLL = C1551360qTO.LIZLLL(str5);
                                            if (sharedPreferencesLIZLLL != null) {
                                                sharedPreferencesLIZLLL.edit().remove(key).apply();
                                            }
                                        } else if (C1551350qTN.LIZLLL()) {
                                            C1551780qU4.LIZ.getClass();
                                            C1551500qTc.LIZIZ(new ARunnableS11S2100000_23(channelMetaDataItemLIZ, str5, key, 10));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        ArrayList<String> arrayList2 = new ArrayList();
        C1551940qUK c1551940qUK2 = C797990VSb.LIZ;
        c1551940qUK2.LIZIZ();
        for (File file4 : c1551940qUK2.LIZLLL.getCandidateRootDirectories()) {
            if (file4.exists()) {
                C1551940qUK c1551940qUK3 = C797990VSb.LIZ;
                c1551940qUK3.LIZIZ();
                if (!file4.equals(c1551940qUK3.LIZLLL.getRootDirectory())) {
                    try {
                        C0X9F.LJFF(file4);
                        arrayList2.add(file4.getName());
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1553130qWF.LIZJ("gecko-debug-tag", "error happened when clean other root directories", th2);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str6 : arrayList2) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str6);
        }
        C1551780qU4.LJII(6, 601, "", sb.toString());
        Iterator it3 = ((ArrayList) C1551380qTQ.LIZIZ).iterator();
        while (it3.hasNext()) {
            try {
                ((Runnable) it3.next()).run();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C1553130qWF.LIZJ("gecko-debug-tag", "daily task error", th3);
            }
        }
    }

    public ARunnableS98S0000000_23(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("StrategyCenterService@9e57.startAdaptiveStrategy$1");
        try {
            C1484130oix c1484130oix = C1483270ohZ.LIZ;
            c1484130oix.getClass();
            long j = C1479110oar.LIZ.LIZ.getAdaptiveRuleConfig().LJFF;
            c1484130oix.LIZLLL.scheduleWithFixedDelay(new ARunnableS123S0100000_23(c1484130oix, 45), j, j, TimeUnit.SECONDS);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StrategyCenterService@9e57.startAdaptiveStrategy$1");
    }

    public static final void run$1(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("NativeStrategyCenterLibsLoad@3797.init$1L");
        C1476410oWV.LIZ.getClass();
        C1476410oWV.LJ.getValue();
        C1C7U.LIZIZ("NativeStrategyCenterLibsLoad@3797.init$1L");
    }

    public static final void run$10(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("SparseBgScheduler@4a38.mutiCodescheduleling$1L");
        C1492020ovg c1492020ovg = C1492020ovg.LIZ;
        C1492020ovg.LIZ();
        C1C7U.LIZIZ("SparseBgScheduler@4a38.mutiCodescheduleling$1L");
    }

    public static final void run$11(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("SparseBgScheduler@4a38.handleNextAction$1L");
        C1492020ovg c1492020ovg = C1492020ovg.LIZ;
        C1492020ovg.LIZ();
        C1C7U.LIZIZ("SparseBgScheduler@4a38.handleNextAction$1L");
    }

    public static final void run$12(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("Cbof@7eb0.startBootFinishTasks$1L");
        new BPEAThread(C1474930oU7.LJI, "cbof-thread").start();
        C1C7U.LIZIZ("Cbof@7eb0.startBootFinishTasks$1L");
    }

    public static final void run$13(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("Cbof@7eb0.startBootFinishTasks$2L");
        new BPEAThread(C1474930oU7.LJI, "cbof-thread").start();
        C1C7U.LIZIZ("Cbof@7eb0.startBootFinishTasks$2L");
    }

    public static final void run$14(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoBlockHelper@3dae.block$1");
        try {
            C1552810qVj c1552810qVj = C797990VSb.LIZ.LJIIJJI;
            if (c1552810qVj != null) {
                C1553130qWF.LIZ("gecko-debug-tag", "gecko update pause");
                c1552810qVj.LIZ.set(true);
            }
            C1553140qWG.LIZ++;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoBlockHelper@3dae.block$1");
    }

    public static final void run$15(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoBlockHelper@3dae.block$2");
        try {
            if (C1553140qWG.LIZ < 2) {
                C797990VSb.LIZ.LJIILJJIL();
            }
            C1553140qWG.LIZ--;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoBlockHelper@3dae.block$2");
    }

    public static final void run$16(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("AwemePlayerConfig@f08.getPlayerConfig$1");
        try {
            C1472310oPt.LJ = C1480970odr.LJFF();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemePlayerConfig@f08.getPlayerConfig$1");
    }

    public static final void run$17(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("OnUIPlayListenerImpl@6766.onRenderFirstFrame$1");
        try {
            C1475700oVM.LIZ().LJJJJI();
            C1478160oZK.LIZIZ = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnUIPlayListenerImpl@6766.onRenderFirstFrame$1");
    }

    public static final void run$18(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        boolean zLIZ;
        C1C7U.LIZ("DailyTask@4ed3.doTask$1");
        try {
            LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DailyTask@4ed3.doTask$1");
    }

    public static final void run$19(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("BgAudioPlayManager@673c.doInnerExitBgAudioPlay$1L");
        C1487370ooB.LJFF.LIZ.clear();
        C1C7U.LIZIZ("BgAudioPlayManager@673c.doInnerExitBgAudioPlay$1L");
    }

    public static final void run$2(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("NativeStrategyCenterLibsLoad@3797.loadNativeSo$1L");
        C805420Vie.LIZ.LJJJLZIJ(true);
        C0NBW.LIZIZ().getClass();
        C0NBW.LIZJ();
        C1C7U.LIZIZ("NativeStrategyCenterLibsLoad@3797.loadNativeSo$1L");
    }

    public static final void run$20(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("HybridStatusJobber@7e83.startInternal$1$1");
        try {
            try {
                C1514760pWM.LIZ.getClass();
                C1514760pWM.LIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } finally {
            }
            C1514760pWM.LIZ.getClass();
            C1514760pWM.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
            }
        }
        C1C7U.LIZIZ("HybridStatusJobber@7e83.startInternal$1$1");
    }

    public static final void run$21(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("IdleBgScheduler@c787.<clinit>$1L");
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0ovM
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = C1491830ovN.LIZIZ;
                if (copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
                Function0 function0 = (Function0) C13LP.LJJJJZI(copyOnWriteArrayList);
                copyOnWriteArrayList.remove(function0);
                C1491980ovc.LIZ.getClass();
                Handler handler = C1491980ovc.LJ;
                if (handler == null) {
                    handler = null;
                }
                C786410Ut5.LJJZZIII(handler, new ARunnableS106S0100000_6(function0, 334));
                return true;
            }
        }, Looper.myQueue());
        C1C7U.LIZIZ("IdleBgScheduler@c787.<clinit>$1L");
    }

    public static final void run$3(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("NativeStrategyCenterLibsLoad@3797.loadNativeSoRunnable_delegate$lambda$1$1L");
        C1476410oWV.LIZ.LIZIZ();
        C1C7U.LIZIZ("NativeStrategyCenterLibsLoad@3797.loadNativeSoRunnable_delegate$lambda$1$1L");
    }

    public static final void run$4(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("ApiVodNetController@80f0.enterApiNetControl$1L");
        InterfaceC1471400oOQ interfaceC1471400oOQ = C1471410oOR.LIZ;
        if (interfaceC1471400oOQ != null) {
            interfaceC1471400oOQ.LIZJ();
        }
        C1C7U.LIZIZ("ApiVodNetController@80f0.enterApiNetControl$1L");
    }

    public static final void run$5(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("ApiVodNetController@80f0.exitApiNetControl$1L");
        InterfaceC1471400oOQ interfaceC1471400oOQ = C1471410oOR.LIZ;
        if (interfaceC1471400oOQ != null) {
            interfaceC1471400oOQ.LIZ();
        }
        C1C7U.LIZIZ("ApiVodNetController@80f0.exitApiNetControl$1L");
    }

    public static final void run$6(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("ApiVodNetController@80f0.sendMessage$1L");
        InterfaceC1471400oOQ interfaceC1471400oOQ = C1471410oOR.LIZ;
        if (interfaceC1471400oOQ != null) {
            interfaceC1471400oOQ.LIZIZ();
        }
        C1C7U.LIZIZ("ApiVodNetController@80f0.sendMessage$1L");
    }

    public static final void run$8(ARunnableS98S0000000_23 aRunnableS98S0000000_23) {
        C1C7U.LIZ("InitModules@32b4.initAccount$1L");
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "optimize_fixaccountcrash", true, false) && Looper.myLooper() == null) {
            Looper.prepare();
        }
        InitModules.LIZ();
        C1C7U.LIZIZ("InitModules@32b4.initAccount$1L");
    }

    public ARunnableS98S0000000_23(EnumC1520990pgP enumC1520990pgP, int i) {
        this.$t = i;
    }

    public ARunnableS98S0000000_23(JSONObject jSONObject, int i) {
        this.$t = i;
    }

    public ARunnableS98S0000000_23(LynxView lynxView, LynxViewMonitor lynxViewMonitor, int i) {
        this.$t = i;
    }
}
