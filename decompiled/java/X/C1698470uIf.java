package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS126S0100000_26;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.ISignalingCallbackDelegate;
import com.bytedance.vcloud.strategy.StrategyStartupGearInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.videoarch.liveio.LiveIOManager;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import com.ss.videoarch.liveplayer.retry.RetryProcessor;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698470uIf extends AbstractC1470550oN3<C1470760oNO> implements InterfaceC1470680oNG {
    public C1698510uIj LIZLLL;
    public LiveLoggerService LJ;
    public C1286540jaG LJFF;
    public RetryProcessor LJI;

    @Override // X.InterfaceC1470560oN4
    public final void LIZIZ() {
    }

    public final void LJIIJ() {
        VideoLiveManager videoLiveManager = (VideoLiveManager) this.LIZIZ;
        int i = videoLiveManager.LJJJLZIJ;
        if (i != -1) {
            if (i < 1000) {
                if (i != -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("networktimeout so small: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" microsecond");
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZIZ();
                    this.LJ.r3 = 5000;
                    return;
                }
                return;
            }
            ((C1470430oMr) videoLiveManager.LIZLLL).LIZJ(9, i * LSPassThroughRecordSizeConfig.DEFAULT);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("networktimeout: ");
            sbLIZ2.append(i);
            sbLIZ2.append(" microsecond");
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
            this.LJ.r3 = i;
        }
    }

    public final void LIZJ(Map map) throws Throwable {
        Object obj;
        VideoLiveManager videoLiveManager;
        InterfaceC1467950oIr interfaceC1467950oIr;
        InterfaceC1467950oIr interfaceC1467950oIr2 = ((AbstractC1487640ooc) this.LIZIZ).LIZLLL;
        if (interfaceC1467950oIr2 == null) {
            return;
        }
        C1470430oMr c1470430oMr = (C1470430oMr) interfaceC1467950oIr2;
        c1470430oMr.LIZJ(659, 1);
        if (TextUtils.equals(((VideoLiveManager) this.LIZIZ).LLJJ, "cmaf") && (interfaceC1467950oIr = (videoLiveManager = (VideoLiveManager) this.LIZIZ).LIZLLL) != null) {
            C1470430oMr c1470430oMr2 = (C1470430oMr) interfaceC1467950oIr;
            c1470430oMr2.LIZJ(687, videoLiveManager.LLIIIZ);
            String str = ((VideoLiveManager) this.LIZIZ).LLLLLLL;
            if (str != null) {
                c1470430oMr2.LIZ(689, str);
            }
        }
        if (Arrays.asList("quic", "h2q").contains(((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJIIJIL)) {
            Context context = ((C1470760oNO) this.LIZ).LIZIZ;
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = context.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context applicationContext = null;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: ");
                        sbLIZ.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Application context obtained through ActivityThread: ");
                        sbLIZ2.append(applicationContext);
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getMessage());
                        sbLIZ3.append(":");
                        sbLIZ3.append(C08RN.LIZJ());
                        sbLIZ3.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                    sbLIZ32.append(th.getMessage());
                    sbLIZ32.append(":");
                    sbLIZ32.append(C08RN.LIZJ());
                    sbLIZ32.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
                }
                file = C786450Ut9.LIZJ;
            }
            String absolutePath = file.getAbsolutePath();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(absolutePath);
            sbLIZ4.append("/pullstream.scfg");
            c1470430oMr.LIZ(353, C2188811AlT.LIZIZ(sbLIZ4));
            if (!TextUtils.isEmpty(((VideoLiveManager) this.LIZIZ).LLLLLLIL)) {
                VideoLiveManager videoLiveManager2 = (VideoLiveManager) this.LIZIZ;
                String strJ3 = videoLiveManager2.LLLLLLIL;
                if (!TextUtils.isEmpty(strJ3) && !TextUtils.isEmpty(absolutePath)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ3);
                        if (jSONObject.has("UseLSQUIC") && JSONObjectProtectorUtils.getInt(jSONObject, "UseLSQUIC") == 1) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(absolutePath);
                            sbLIZ5.append("/lspullstream.scfg");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                            if (!jSONObject.has("LSEngineParamJson")) {
                                jSONObject.put("LSEngineParamJson", new JSONObject());
                            }
                            JSONObjectProtectorUtils.getJSONObject(jSONObject, "LSEngineParamJson").put("SCFGPath", strLIZIZ);
                            strJ3 = C786410Ut5.J3(jSONObject);
                        }
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1698940uJQ.LJ();
                    }
                }
                videoLiveManager2.LLLLLLIL = strJ3;
            }
        }
        VideoLiveManager videoLiveManager3 = (VideoLiveManager) this.LIZIZ;
        if (!videoLiveManager3.LJJJJI) {
            videoLiveManager3.LJFF.LLLIILIL(false);
        }
        if (Arrays.asList("h2", "h2q").contains(((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJIIJIL)) {
            ((HashMap) map).put("suggest_protocol", ((VideoLiveManager) this.LIZIZ).LLJJIJIIJIL);
            String str2 = ((VideoLiveManager) this.LIZIZ).LLLLLLIL;
            if (str2 != null) {
                c1470430oMr.LIZ(944, str2);
            }
        }
        String str3 = ((VideoLiveManager) this.LIZIZ).LLLLLLJ;
        if (str3 != null) {
            c1470430oMr.LIZ(1139, str3);
        }
        c1470430oMr.LIZJ(1303, ((VideoLiveManager) this.LIZIZ).S);
        c1470430oMr.LIZJ(938, ((VideoLiveManager) this.LIZIZ).LLLLJ);
        c1470430oMr.LIZJ(939, ((VideoLiveManager) this.LIZIZ).LLLLILI);
        c1470430oMr.LIZJ(372, 1);
        c1470430oMr.LIZJ(648, 1);
        this.LIZIZ.getClass();
        c1470430oMr.LIZJ(374, 0);
        this.LIZIZ.getClass();
        c1470430oMr.LIZJ(373, 0);
        this.LIZIZ.getClass();
        c1470430oMr.LIZJ(375, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698470uIf.LJII(java.lang.String):void");
    }

    public final void LJIIIIZZ(boolean z) {
        InterfaceC1698710uJ3 interfaceC1698710uJ3;
        VideoLiveManager videoLiveManager;
        String str;
        ArrayList<String> arrayListLIZLLL;
        VideoLiveManager videoLiveManager2 = ((AbstractC1487640ooc) this.LIZIZ).LJFF;
        C1486290omR c1486290omR = videoLiveManager2.b3;
        if (c1486290omR != null && c1486290omR.LIZ == 1 && c1486290omR.LIZIZ == 1 && (arrayListLIZLLL = videoLiveManager2.LJJII.LIZLLL()) != null && !arrayListLIZLLL.isEmpty()) {
            VideoLiveManager videoLiveManager3 = ((AbstractC1487640ooc) this.LIZIZ).LJFF;
            videoLiveManager3.LLLLLZIL();
            C1486290omR c1486290omR2 = videoLiveManager3.b3;
            if (c1486290omR2 == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("content steering startup start param is nil -- ");
                sbLIZ.append(videoLiveManager3.P0);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZIZ();
            } else {
                if (videoLiveManager3.d3 == null) {
                    videoLiveManager3.d3 = new ARunnableS123S0100000_23(videoLiveManager3, 197);
                }
                long j = c1486290omR2.LIZLLL;
                if (j > 0) {
                    videoLiveManager3.f3 = true;
                    videoLiveManager3.LLLLII(j, videoLiveManager3.d3);
                }
            }
        }
        final VideoLiveManager videoLiveManager4 = ((AbstractC1487640ooc) this.LIZIZ).LJFF;
        String strLJIILIIL = videoLiveManager4.LJJII.LJIILIIL();
        if (strLJIILIIL != null && !strLJIILIIL.isEmpty()) {
            videoLiveManager4.LJLZ().addSignalingCallback(strLJIILIIL, new ISignalingCallbackDelegate(videoLiveManager4) { // from class: X.0uIo
                public final WeakReference<VideoLiveManager> LIZ;

                {
                    this.LIZ = new WeakReference<>(videoLiveManager4);
                }

                @Override // com.bytedance.vcloud.strategy.ISignalingCallbackDelegate
                public final void onSignalIgnored(String str2, long j2, long j3, String str3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onSignalIgnored - uniqueId: ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", reason: ");
                    sbLIZ2.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZJ();
                    VideoLiveManager videoLiveManager5 = this.LIZ.get();
                    if (videoLiveManager5 == null) {
                        return;
                    }
                    C1698670uIz c1698670uIzLJLIIL = videoLiveManager5.LJLIIL(str2);
                    if (c1698670uIzLJLIIL != null) {
                        if (TextUtils.isEmpty(c1698670uIzLJLIIL.LJ) && c1698670uIzLJLIIL.LJIIIZ == 0 && c1698670uIzLJLIIL.LJIIJ == 0) {
                            c1698670uIzLJLIIL.LJ = "ignore";
                            c1698670uIzLJLIIL.LJIIJJI = str3;
                            c1698670uIzLJLIIL.LIZIZ = j2;
                            c1698670uIzLJLIIL.LIZJ = j3;
                            return;
                        }
                        return;
                    }
                    C1698670uIz c1698670uIz = new C1698670uIz();
                    c1698670uIz.LIZ = str2;
                    c1698670uIz.LIZIZ = j2;
                    c1698670uIz.LIZJ = j3;
                    c1698670uIz.LIZLLL = EnumC1699210uJr.IN_ROOM;
                    c1698670uIz.LJ = "ignore";
                    c1698670uIz.LJIIJJI = str3;
                    ((ArrayList) videoLiveManager5.LLIIIILZ).add(c1698670uIz);
                }

                @Override // com.bytedance.vcloud.strategy.ISignalingCallbackDelegate
                public final void handleCdnSwitch(List<String> list, long j2, long j3, boolean z2, String str2, long j4) {
                    String str3;
                    boolean z3;
                    String str4;
                    String strLJI;
                    long jNextInt;
                    C1698670uIz c1698670uIzLJLIIL;
                    C1698940uJQ.LIZJ();
                    VideoLiveManager videoLiveManager5 = this.LIZ.get();
                    if (videoLiveManager5 == null) {
                        return;
                    }
                    C1698680uJ0 c1698680uJ0 = videoLiveManager5.LJIILLIIL.c7;
                    EnumC1699210uJr enumC1699210uJr = EnumC1699210uJr.IN_ROOM;
                    c1698680uJ0.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[updateOnReceivedSignal] - context=");
                    sbLIZ2.append(enumC1699210uJr);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1698940uJQ.LIZJ();
                    if (enumC1699210uJr == EnumC1699210uJr.IN_FEED) {
                        c1698680uJ0.LIZ.LIZLLL++;
                    } else {
                        c1698680uJ0.LIZIZ.LJIIIZ++;
                    }
                    String str5 = videoLiveManager5.LLJILLL;
                    String str6 = "main";
                    if (!TextUtils.equals(str5, "main")) {
                        str3 = "main";
                    } else {
                        str3 = "backup";
                    }
                    C1698700uJ2 c1698700uJ2 = videoLiveManager5.LLIIIJ;
                    if (c1698700uJ2 != null && c1698700uJ2.LJIIJ == EnumC801300Vc0.SWITCHING && c1698700uJ2.LIZJ == str5 && c1698700uJ2.LIZLLL == str3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        C1698940uJQ.LIZJ();
                        if (videoLiveManager5.LJLIIL(str2) == null) {
                            C1698670uIz c1698670uIz = new C1698670uIz();
                            c1698670uIz.LIZ = str2;
                            c1698670uIz.LIZIZ = j2;
                            c1698670uIz.LIZJ = j4;
                            c1698670uIz.LIZLLL = enumC1699210uJr;
                            c1698670uIz.LJ = "ignore";
                            c1698670uIz.LJIIJJI = "same_direction_switch_in_progress";
                            ((ArrayList) videoLiveManager5.LLIIIILZ).add(c1698670uIz);
                            return;
                        }
                        return;
                    }
                    if (!TextUtils.equals(videoLiveManager5.LLJILLL, "main")) {
                        str4 = "main";
                    } else {
                        str4 = "backup";
                    }
                    String str7 = videoLiveManager5.LJLLJ;
                    C1698510uIj c1698510uIj = videoLiveManager5.LJJII;
                    if (videoLiveManager5.LLJILJIL.equals("auto")) {
                        strLJI = videoLiveManager5.LJJII.LJI();
                    } else {
                        strLJI = videoLiveManager5.LLJILJIL;
                    }
                    String strLJIIJJI = c1698510uIj.LJIIJJI(strLJI, "flv", str4, videoLiveManager5.LLJZIJLIL);
                    if (str7 == null) {
                        C1698940uJQ.LIZJ();
                        return;
                    }
                    if (strLJIIJJI == null) {
                        C1698940uJQ.LIZJ();
                        return;
                    }
                    String strLIZJ = C1486300omS.LIZJ(str7);
                    String strLIZJ2 = C1486300omS.LIZJ(strLJIIJJI);
                    if (strLIZJ == null) {
                        C1698940uJQ.LIZJ();
                        return;
                    }
                    if (strLIZJ2 == null) {
                        C1698940uJQ.LIZJ();
                        return;
                    }
                    boolean zContains = list.contains(strLIZJ);
                    boolean zContains2 = list.contains(strLIZJ2);
                    if (zContains) {
                        if (zContains2) {
                            C1698940uJQ.LIZJ();
                            if (videoLiveManager5.LJLIIL(str2) == null) {
                                C1698670uIz c1698670uIz2 = new C1698670uIz();
                                c1698670uIz2.LIZ = str2;
                                c1698670uIz2.LIZIZ = j2;
                                c1698670uIz2.LIZJ = j4;
                                c1698670uIz2.LIZLLL = enumC1699210uJr;
                                c1698670uIz2.LJ = "ignore";
                                c1698670uIz2.LJIIJJI = "both_cdns_degraded";
                                ((ArrayList) videoLiveManager5.LLIIIILZ).add(c1698670uIz2);
                                return;
                            }
                            return;
                        }
                        if (videoLiveManager5.LJLIIL(str2) == null) {
                            C1698670uIz c1698670uIz3 = new C1698670uIz();
                            c1698670uIz3.LIZ = str2;
                            c1698670uIz3.LIZIZ = j2;
                            c1698670uIz3.LIZJ = j4;
                            c1698670uIz3.LIZLLL = enumC1699210uJr;
                            ((ArrayList) videoLiveManager5.LLIIIILZ).add(c1698670uIz3);
                        }
                        C1698700uJ2 c1698700uJ22 = videoLiveManager5.LLIIIJ;
                        c1698700uJ22.LJIILIIL = str2;
                        c1698700uJ22.LJIILJJIL = j4;
                        if (j3 > 0) {
                            jNextInt = ThreadLocalRandom.current().nextInt((int) j3);
                        } else {
                            jNextInt = 0;
                        }
                        C1698700uJ2 c1698700uJ23 = videoLiveManager5.LLIIIJ;
                        c1698700uJ23.LJIIJJI = EnumC1699200uJq.SIGNAL_INITIATED;
                        c1698700uJ23.LJIIL.put("cdn_switch_signal_time", Long.valueOf(j2));
                        videoLiveManager5.LLIIIJ.LJIIL.put("random_delay", Long.valueOf(jNextInt));
                        videoLiveManager5.LLIIIJ.LJIIL.put("disable_fallback", Boolean.valueOf(z2));
                        C1698700uJ2 c1698700uJ24 = videoLiveManager5.LLIIIJ;
                        c1698700uJ24.LJIIJ = EnumC801300Vc0.SWITCHING;
                        String str8 = videoLiveManager5.LLJILLL;
                        c1698700uJ24.LIZJ = str8;
                        if (Objects.equals(str8, "main")) {
                            str6 = "backup";
                        }
                        c1698700uJ24.LIZLLL = str6;
                        C1698700uJ2 c1698700uJ25 = videoLiveManager5.LLIIIJ;
                        c1698700uJ25.LJII = j2;
                        String str9 = c1698700uJ25.LJIILIIL;
                        if (str9 != null && (c1698670uIzLJLIIL = videoLiveManager5.LJLIIL(str9)) != null) {
                            c1698670uIzLJLIIL.LJIIIIZZ = System.currentTimeMillis();
                        }
                        if (jNextInt <= 0) {
                            if (!videoLiveManager5.LLLLZ(-100028, enumC1699210uJr)) {
                                videoLiveManager5.LLJLLIL(-100028, System.currentTimeMillis());
                                return;
                            }
                            return;
                        } else {
                            C786410Ut5.k4(Locale.US, "cdn_switch - random delay = %d(ms)", new Object[]{Long.valueOf(jNextInt)});
                            C1698940uJQ.LIZJ();
                            videoLiveManager5.LLLLII(jNextInt, new ARunnableS126S0100000_26(videoLiveManager5, 62));
                            return;
                        }
                    }
                    C786410Ut5.j4("[handleCdnSwitch] current domain not degraded - ignore (%s)", new Object[]{strLIZJ});
                    C1698940uJQ.LIZJ();
                    if (videoLiveManager5.LJLIIL(str2) == null) {
                        C1698670uIz c1698670uIz4 = new C1698670uIz();
                        c1698670uIz4.LIZ = str2;
                        c1698670uIz4.LIZIZ = j2;
                        c1698670uIz4.LIZJ = j4;
                        c1698670uIz4.LIZLLL = enumC1699210uJr;
                        c1698670uIz4.LJ = "ignore";
                        c1698670uIz4.LJIIJJI = "current_cdn_not_degraded";
                        ((ArrayList) videoLiveManager5.LLIIIILZ).add(c1698670uIz4);
                    }
                }
            });
        } else {
            C1698940uJQ.LIZJ();
        }
        VideoLiveManager videoLiveManager5 = (VideoLiveManager) this.LIZIZ;
        if (videoLiveManager5.k1 == 1 && z) {
            videoLiveManager5.LJIIIIZZ = EnumC1487710ooj.PLAYED;
            LiveLoggerService liveLoggerService = this.LJ;
            String str2 = videoLiveManager5.r2;
            C1286540jaG c1286540jaG = this.LJFF;
            c1286540jaG.LJI();
            liveLoggerService.LJJJJLL(str2, c1286540jaG.LJ);
            if (((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJIIJIL() && (str = (videoLiveManager = (VideoLiveManager) this.LIZIZ).r2) != null) {
                videoLiveManager.LJFF.LLJLL(str, false);
            }
        }
        VideoLiveManager videoLiveManager6 = (VideoLiveManager) this.LIZIZ;
        if (videoLiveManager6.H == 1 && videoLiveManager6.G && z) {
            C1698940uJQ.LIZJ();
            C1476650oWt c1476650oWt = C1476660oWu.LIZ;
            String str3 = ((VideoLiveManager) this.LIZIZ).Q0;
            if (c1476650oWt.LIZJ) {
                LiveIOManager.getInstance().play(str3);
            }
        }
        AbstractC1469000oKY abstractC1469000oKY = this.LIZIZ;
        VideoLiveManager videoLiveManager7 = (VideoLiveManager) abstractC1469000oKY;
        if ((videoLiveManager7.LJJLJ == 1 || videoLiveManager7.LJJZ == 1) && z) {
            C1698940uJQ.LIZJ();
            VideoLiveManager videoLiveManager8 = (VideoLiveManager) this.LIZIZ;
            if (videoLiveManager8.LJJLJ == 1 && (interfaceC1698710uJ3 = videoLiveManager8.LJIJJ) != null) {
                interfaceC1698710uJ3.onPrepared();
            }
            this.LIZIZ.LIZJ.start();
            return;
        }
        try {
            ((VideoLiveManager) abstractC1469000oKY).LIZJ.prepare();
            ((VideoLiveManager) this.LIZIZ).LJIIIZ = EnumC1487690ooh.PREPARING;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("playerPrepareAsync -- ");
            sbLIZ2.append(((VideoLiveManager) this.LIZIZ).P0);
            sbLIZ2.append(",");
            sbLIZ2.append(((VideoLiveManager) this.LIZIZ).r2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJI(-100001, e);
        }
    }

    public final void LJIIIZ(Map map) {
        InterfaceC1467950oIr interfaceC1467950oIr = ((AbstractC1487640ooc) this.LIZIZ).LIZLLL;
        if (interfaceC1467950oIr == null) {
            return;
        }
        try {
            ((C1470430oMr) interfaceC1467950oIr).LIZJ(800, 0);
            AbstractC1469000oKY abstractC1469000oKY = this.LIZIZ;
            ((VideoLiveManager) abstractC1469000oKY).LIZJ.setDataSource(((C1470760oNO) this.LIZ).LIZIZ, UriProtector.parse(((VideoLiveManager) abstractC1469000oKY).r2), map);
            if (!((VideoLiveManager) this.LIZIZ).LJFF.LLJJJ()) {
                this.LJ.N3 = ((VideoLiveManager) this.LIZIZ).r2;
            } else {
                String strReplace = ((VideoLiveManager) this.LIZIZ).r2.replace("mem://llash/", "");
                String strLIZ = this.LIZLLL.LIZ(strReplace);
                if (!TextUtils.isEmpty(strLIZ)) {
                    LiveLoggerService liveLoggerService = this.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZ);
                    sbLIZ.append("&llash=");
                    sbLIZ.append(strReplace);
                    liveLoggerService.N3 = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            C1698940uJQ.LIZJ();
            this.LJ.O3 = map;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJI(-100002, e);
        }
    }

    @Override // X.InterfaceC1470680oNG
    public final void play(InterfaceC1470720oNK interfaceC1470720oNK) throws Throwable {
        VideoLiveManager videoLiveManager;
        String str;
        C1699050uJb c1699050uJb = (C1699050uJb) interfaceC1470720oNK;
        if (c1699050uJb.LIZ == 10001) {
            LIZLLL(c1699050uJb.LIZIZ, new C1487660ooe(this));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePrepareStartProcessPlugin start, call play -- ");
        sbLIZ.append(((VideoLiveManager) this.LIZIZ).P0);
        sbLIZ.append(", SessionId:");
        sbLIZ.append(this.LIZLLL.LJIILL());
        C1481110oe5.LIZIZ("VideoLiveManager_TTKPlayer", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LLILLL.LIZIZ = System.currentTimeMillis();
        ((AbstractC1487640ooc) this.LIZIZ).LJFF.LLLLIL();
        ((VideoLiveManager) this.LIZIZ).j3 = true;
        C1698490uIh c1698490uIh = this.LJ.LLILLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1698490uIh.LLLLZI = jCurrentTimeMillis;
        c1698490uIh.LLLLZIL = jCurrentTimeMillis;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("_playInternal -- ");
        sbLIZ2.append(((VideoLiveManager) this.LIZIZ).P0);
        C1481110oe5.LIZIZ("BasePlugin", C2188811AlT.LIZIZ(sbLIZ2));
        AbstractC1487640ooc abstractC1487640ooc = (AbstractC1487640ooc) this.LIZIZ;
        EnumC1487710ooj enumC1487710ooj = abstractC1487640ooc.LJIIIIZZ;
        EnumC1487710ooj enumC1487710ooj2 = EnumC1487710ooj.PLAYED;
        if (enumC1487710ooj != enumC1487710ooj2) {
            if (enumC1487710ooj == EnumC1487710ooj.PAUSED) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("play resume -- ");
                sbLIZ3.append(((VideoLiveManager) this.LIZIZ).P0);
                C1481110oe5.LIZIZ("BasePlugin", C2188811AlT.LIZIZ(sbLIZ3));
                AbstractC1487640ooc abstractC1487640ooc2 = (AbstractC1487640ooc) this.LIZIZ;
                abstractC1487640ooc2.LJIIIIZZ = enumC1487710ooj2;
                InterfaceC1467950oIr interfaceC1467950oIr = abstractC1487640ooc2.LIZLLL;
                if (interfaceC1467950oIr != null) {
                    ((C1470430oMr) interfaceC1467950oIr).start();
                }
            } else {
                abstractC1487640ooc.LJIIIIZZ = enumC1487710ooj2;
                this.LJ.getClass();
                AtomicLong atomicLong = LiveLoggerService.A7;
                if (atomicLong.get() > 0) {
                    C1698490uIh c1698490uIh2 = this.LJ.LLILLL;
                    c1698490uIh2.LLLZL = c1698490uIh2.LLLLZI - atomicLong.get();
                } else {
                    this.LJ.LLILLL.LLLZL = 0L;
                }
                EnumC1487700ooi enumC1487700ooiLJIIIZ = ((AbstractC1487640ooc) this.LIZIZ).LJIIIZ();
                if (enumC1487700ooiLJIIIZ == EnumC1487700ooi.PREPARED) {
                    VideoLiveManager videoLiveManager2 = (VideoLiveManager) this.LIZIZ;
                    String str2 = videoLiveManager2.LLJILLL;
                    videoLiveManager2.LJJZZIII();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("play PrepareFlvStatus ");
                    sbLIZ4.append(enumC1487700ooiLJIIIZ);
                    sbLIZ4.append(" -- ");
                    sbLIZ4.append(((VideoLiveManager) this.LIZIZ).P0);
                    C1481110oe5.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    boolean z = !TextUtils.equals(str2, ((VideoLiveManager) this.LIZIZ).LLJILLL);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Preprepared source is different: ");
                    sbLIZ5.append(z);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    C1698940uJQ.LIZJ();
                    if (z) {
                        VideoLiveManager videoLiveManager3 = (VideoLiveManager) this.LIZIZ;
                        videoLiveManager3.LLJILLL = str2;
                        videoLiveManager3.LLIIIJ.LJIIL.put("is_pre_create", 1);
                        if (!((VideoLiveManager) this.LIZIZ).LLLLZ(0, EnumC1699210uJr.IN_FEED)) {
                            ((VideoLiveManager) this.LIZIZ).LLIIIJ.LJIIL.remove("is_pre_create");
                        }
                    } else {
                        LJIIIIZZ(true);
                    }
                } else if (enumC1487700ooiLJIIIZ == EnumC1487700ooi.PREIO) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("play PrepareFlvStatus ");
                    sbLIZ6.append(enumC1487700ooiLJIIIZ);
                    sbLIZ6.append(" -- ");
                    sbLIZ6.append(((VideoLiveManager) this.LIZIZ).P0);
                    C1481110oe5.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                    LJIIIIZZ(true);
                } else if (enumC1487700ooiLJIIIZ == EnumC1487700ooi.PREFETCHING) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("play PrepareFlvStatus PREFETCHING -- ");
                    sbLIZ7.append(((VideoLiveManager) this.LIZIZ).P0);
                    C1481110oe5.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
                    LiveLoggerService liveLoggerService = this.LJ;
                    String str3 = ((VideoLiveManager) this.LIZIZ).LJIIJ;
                    C1286540jaG c1286540jaG = this.LJFF;
                    c1286540jaG.LJI();
                    liveLoggerService.LJJJJLL(str3, c1286540jaG.LJ);
                    if (((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJIIJIL() && (str = (videoLiveManager = (VideoLiveManager) this.LIZIZ).LJIIJ) != null) {
                        videoLiveManager.LJFF.LLJLL(str, false);
                    }
                    LJII(((VideoLiveManager) this.LIZIZ).LJIIJ);
                } else if (enumC1487700ooiLJIIIZ == EnumC1487700ooi.CREATING) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("play PrepareFlvStatus CREATING -- ");
                    sbLIZ8.append(((VideoLiveManager) this.LIZIZ).P0);
                    C1481110oe5.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
                } else {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("PrepareFlvStatus is IDLE -- ");
                    sbLIZ9.append(((VideoLiveManager) this.LIZIZ).P0);
                    C2188811AlT.LIZIZ(sbLIZ9);
                    C1698940uJQ.LIZJ();
                    if (((VideoLiveManager) this.LIZIZ).k1 == 1) {
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("disable mEnablePreCreatedPlayer -- ");
                        sbLIZ10.append(((VideoLiveManager) this.LIZIZ).P0);
                        C2188811AlT.LIZIZ(sbLIZ10);
                        C1698940uJQ.LIZJ();
                        ((VideoLiveManager) this.LIZIZ).k1 = 0;
                    }
                    C1698940uJQ.LIZJ();
                    String strLJL = ((AbstractC1487640ooc) this.LIZIZ).LJFF.LJL();
                    LiveLoggerService liveLoggerService2 = this.LJ;
                    C1286540jaG c1286540jaG2 = this.LJFF;
                    c1286540jaG2.LJI();
                    liveLoggerService2.LJJJJLL(strLJL, c1286540jaG2.LJ);
                    if (strLJL != null) {
                        LJII(strLJL);
                    }
                    if (((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJJIJIIJIL() && strLJL != null) {
                        ((AbstractC1487640ooc) this.LIZIZ).LJFF.LLJLL(strLJL, false);
                    }
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("play end -- ");
                    sbLIZ11.append(((VideoLiveManager) this.LIZIZ).P0);
                    C1481110oe5.LIZ(C2188811AlT.LIZIZ(sbLIZ11));
                }
            }
        }
        if (!((VideoLiveManager) this.LIZIZ).LLJJJJLIIL()) {
            VideoLiveManager videoLiveManager4 = (VideoLiveManager) this.LIZIZ;
            videoLiveManager4.getClass();
            if (C1699230uJt.LIZ() && videoLiveManager4.K0 == 0) {
                return;
            }
            VideoLiveManager videoLiveManager5 = (VideoLiveManager) this.LIZIZ;
            if (videoLiveManager5.LJIJJ == null) {
                return;
            }
            C1284740jXM c1284740jXM = new C1284740jXM(-100019, "widevine is NOT supported on this device", null, false);
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("drm widevine is NOT supported on this device forceDisableWidevine=");
            sbLIZ12.append(videoLiveManager5.K0);
            C2188811AlT.LIZIZ(sbLIZ12);
            C1698940uJQ.LIZIZ();
            videoLiveManager5.LJIJJ.LJJJLL(c1284740jXM);
            return;
        }
        this.LJI.LJIIJJI = true;
        this.LJ.LLILLL.LLLLZIL = System.currentTimeMillis();
        C1698490uIh c1698490uIh3 = this.LJ.LLILLL;
        long j = c1698490uIh3.LLLLZIL - c1698490uIh3.LLLLZI;
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("play cost ms:");
        sbLIZ13.append(j);
        C2188811AlT.LIZIZ(sbLIZ13);
        C1698940uJQ.LIZ();
        DecimalFormat decimalFormat = LiveLoggerService.q7;
    }

    @Override // X.InterfaceC1470680oNG
    public final void prepare(InterfaceC1470730oNL interfaceC1470730oNL) throws Throwable {
        C1484630ojl c1484630ojl = (C1484630ojl) interfaceC1470730oNL;
        int i = c1484630ojl.LIZ;
        if (i == 10001) {
            String strLJL = ((AbstractC1487640ooc) this.LIZIZ).LJFF.LJL();
            if (((VideoLiveManager) this.LIZIZ).k1 == 1) {
                LJII(strLJL);
                return;
            }
            return;
        }
        if (i == 10002) {
            String str = c1484630ojl.LIZIZ;
            final StrategyStartupGearInfo.GearResponse gearResponse = c1484630ojl.LIZJ;
            InterfaceC1487680oog interfaceC1487680oog = new InterfaceC1487680oog() { // from class: X.0uIr
                @Override // X.InterfaceC1487680oog
                public final void LIZ(String str2, String str3, String str4) throws Throwable {
                    String strLJI;
                    int i2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[StartupRetry] onDNSResult callback url:");
                    sbLIZ.append(str2);
                    sbLIZ.append(",originalURL:");
                    sbLIZ.append(str3);
                    sbLIZ.append(",ip:");
                    sbLIZ.append((String) null);
                    sbLIZ.append(",host:");
                    sbLIZ.append(str4);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZJ();
                    C1698470uIf c1698470uIf = this.LIZIZ;
                    VideoLiveManager videoLiveManager = (VideoLiveManager) c1698470uIf.LIZIZ;
                    if (videoLiveManager.k1 == 1 && videoLiveManager.LJII == EnumC1487700ooi.PREPARED) {
                        InterfaceC1467950oIr interfaceC1467950oIr = videoLiveManager.LIZLLL;
                        if (str2 != null && interfaceC1467950oIr != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[StartupRetry] call _prepare:");
                            sbLIZ2.append(str2);
                            sbLIZ2.append(",originalURL:");
                            sbLIZ2.append(str3);
                            sbLIZ2.append(",ip:");
                            sbLIZ2.append((String) null);
                            sbLIZ2.append(",host:");
                            sbLIZ2.append(str4);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            C1698940uJQ.LIZJ();
                            Map<String, String> mapLJ = c1698470uIf.LJ(str4, ((VideoLiveManager) c1698470uIf.LIZIZ).LLJILLL);
                            c1698470uIf.LIZJ(mapLJ);
                            VideoLiveManager videoLiveManager2 = (VideoLiveManager) c1698470uIf.LIZIZ;
                            videoLiveManager2.r2 = str2;
                            LiveLoggerService liveLoggerService = c1698470uIf.LJ;
                            String str5 = videoLiveManager2.LLJILJIL;
                            liveLoggerService.F1 = str5;
                            C1698510uIj c1698510uIj = c1698470uIf.LIZLLL;
                            if (TextUtils.equals("auto", str5)) {
                                strLJI = c1698470uIf.LIZLLL.LJI();
                            } else {
                                strLJI = ((VideoLiveManager) c1698470uIf.LIZIZ).LLJILJIL;
                            }
                            liveLoggerService.L1 = c1698510uIj.LJ(strLJI, ((VideoLiveManager) c1698470uIf.LIZIZ).LLJILLL);
                            try {
                                AbstractC1469000oKY abstractC1469000oKY = c1698470uIf.LIZIZ;
                                ((VideoLiveManager) abstractC1469000oKY).r2 = c1698470uIf.LJFF(System.currentTimeMillis(), ((VideoLiveManager) abstractC1469000oKY).r2);
                                AbstractC1469000oKY abstractC1469000oKY2 = c1698470uIf.LIZIZ;
                                String strLLLIIIIL = ((VideoLiveManager) abstractC1469000oKY2).LJFF.LLLIIIIL(((VideoLiveManager) abstractC1469000oKY2).r2, null, str4, mapLJ);
                                if (strLLLIIIIL != null) {
                                    ((VideoLiveManager) c1698470uIf.LIZIZ).r2 = strLLLIIIIL;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("proxyUrl: ");
                                    sbLIZ3.append(((VideoLiveManager) c1698470uIf.LIZIZ).r2);
                                    sbLIZ3.append(" headers: ");
                                    sbLIZ3.append(mapLJ.toString());
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                    C1698940uJQ.LIZJ();
                                } else if (((VideoLiveManager) c1698470uIf.LIZIZ).LLJJ.equals("flv") && (i2 = VideoLiveManager.p3) != -1) {
                                    AbstractC1469000oKY abstractC1469000oKY3 = c1698470uIf.LIZIZ;
                                    ((VideoLiveManager) abstractC1469000oKY3).r2 = ((VideoLiveManager) abstractC1469000oKY3).LJFF.LJIIJJI(((VideoLiveManager) abstractC1469000oKY3).r2, "abr_pts", String.valueOf(i2));
                                }
                                C1698500uIi c1698500uIi = c1698470uIf.LIZLLL.LIZIZ;
                                if (c1698500uIi != null) {
                                    c1698500uIi.LJJJJZI = null;
                                    c1698500uIi.LJJJLIIL = null;
                                    c1698500uIi.LJJJLL = null;
                                }
                                ((VideoLiveManager) c1698470uIf.LIZIZ).LJFF.LLJJI(null, str4);
                                c1698470uIf.LJIIIZ(mapLJ);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                ((AbstractC1487640ooc) c1698470uIf.LIZIZ).LJFF.LLJJIJI(-100002, e);
                            }
                        }
                    }
                    VideoLiveManager videoLiveManager3 = (VideoLiveManager) this.LIZIZ.LIZIZ;
                    if (!videoLiveManager3.j3 && gearResponse == null) {
                        VideoLiveManager videoLiveManager4 = videoLiveManager3.LJFF;
                        videoLiveManager4.getClass();
                        C1698940uJQ.LIZJ();
                        if (videoLiveManager4.LJIILLIIL.q5 >= videoLiveManager4.f455p1) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("[StartupRetry] retry count: ");
                            sbLIZ4.append(videoLiveManager4.LJIILLIIL.q5);
                            sbLIZ4.append("upper, so return");
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C1698940uJQ.LIZJ();
                            return;
                        }
                        BPEAHandler bPEAHandler = videoLiveManager4.LJIILIIL;
                        if (bPEAHandler == null) {
                            return;
                        }
                        C786410Ut5.LJLIIL(videoLiveManager4.q1, bPEAHandler, new ARunnableS123S0100000_23(videoLiveManager4, 196));
                    }
                }
            };
            this.LIZIZ.getClass();
            LIZLLL(str, interfaceC1487680oog);
            return;
        }
        C1481110oe5.LIZIZ("VideoLiveManager_TTKPlayer", "LivePrepareStartProcessPlugin prepare");
        if (((AbstractC1487640ooc) this.LIZIZ).LJIIIZ() != EnumC1487700ooi.IDLE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Has prepared -- ");
            sbLIZ.append(((VideoLiveManager) this.LIZIZ).P0);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("1. prepare -- ");
        sbLIZ2.append(((VideoLiveManager) this.LIZIZ).P0);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        VideoLiveManager videoLiveManager = (VideoLiveManager) this.LIZIZ;
        if (videoLiveManager.k1 == 0) {
            C1698940uJQ.LIZJ();
            return;
        }
        videoLiveManager.LJIIIIZZ = EnumC1487710ooj.PREPARING;
        this.LJ.L5 = System.currentTimeMillis();
        ((AbstractC1487640ooc) this.LIZIZ).LJIIJ(EnumC1487700ooi.PREPARING);
        String strLJL2 = ((AbstractC1487640ooc) this.LIZIZ).LJFF.LJL();
        if (((VideoLiveManager) this.LIZIZ).k1 == 1) {
            LJII(strLJL2);
        }
        DecimalFormat decimalFormat = LiveLoggerService.q7;
    }

    public C1698470uIf(C1470760oNO c1470760oNO, InterfaceC1469660oLc interfaceC1469660oLc) {
        super(c1470760oNO, interfaceC1469660oLc);
        AbstractC1469000oKY abstractC1469000oKY = this.LIZIZ;
        this.LIZLLL = ((VideoLiveManager) abstractC1469000oKY).LJJII;
        this.LJ = ((VideoLiveManager) abstractC1469000oKY).LJIILLIIL;
        this.LJFF = ((VideoLiveManager) abstractC1469000oKY).LJIL;
        this.LJI = ((VideoLiveManager) abstractC1469000oKY).LJJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r15, X.InterfaceC1487680oog r16) {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698470uIf.LIZLLL(java.lang.String, X.0oog):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: JSONException -> 0x0088, LOOP:0: B:23:0x0074->B:25:0x007a, LOOP_END, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0088, blocks: (B:12:0x0031, B:14:0x0039, B:16:0x0045, B:19:0x005f, B:21:0x0067, B:22:0x0070, B:23:0x0074, B:25:0x007a), top: B:33:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJ(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r9 == 0) goto L18
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r9
            java.lang.String r0 = " %s"
            java.lang.String r1 = X.C786410Ut5.j4(r0, r1)
            java.lang.String r0 = "Host"
            r4.put(r0, r1)
        L18:
            X.0uIj r2 = r8.LIZLLL
            int r1 = r2.LIZLLL
            r0 = 2
            r5 = 0
            if (r1 != r0) goto L8e
            X.0uIi r7 = r2.LIZIZ
            if (r7 == 0) goto L8e
            java.lang.String r2 = "header"
            java.lang.String r1 = "main_backup_header"
            org.json.JSONObject r0 = r7.LIZIZ
            if (r0 == 0) goto L8e
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            org.json.JSONObject r0 = r7.LIZIZ     // Catch: org.json.JSONException -> L88
            boolean r0 = r0.has(r1)     // Catch: org.json.JSONException -> L88
            if (r0 == 0) goto L5c
            org.json.JSONObject r0 = r7.LIZIZ     // Catch: org.json.JSONException -> L88
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: org.json.JSONException -> L88
            boolean r0 = r1.has(r10)     // Catch: org.json.JSONException -> L88
            if (r0 == 0) goto L5c
            org.json.JSONObject r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r10)     // Catch: org.json.JSONException -> L88
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: org.json.JSONException -> L88
            java.lang.String r0 = "headers - using common->main_backup_header->"
            r1.append(r0)     // Catch: org.json.JSONException -> L88
            r1.append(r10)     // Catch: org.json.JSONException -> L88
            X.C2188811AlT.LIZIZ(r1)     // Catch: org.json.JSONException -> L88
            X.C1698940uJQ.LIZJ()     // Catch: org.json.JSONException -> L88
            goto L5d
        L5c:
            r3 = r5
        L5d:
            if (r3 != 0) goto L70
            org.json.JSONObject r0 = r7.LIZIZ     // Catch: org.json.JSONException -> L88
            boolean r0 = r0.has(r2)     // Catch: org.json.JSONException -> L88
            if (r0 == 0) goto L8e
            org.json.JSONObject r0 = r7.LIZIZ     // Catch: org.json.JSONException -> L88
            org.json.JSONObject r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r2)     // Catch: org.json.JSONException -> L88
            X.C1698940uJQ.LIZJ()     // Catch: org.json.JSONException -> L88
        L70:
            java.util.Iterator r2 = r3.keys()     // Catch: org.json.JSONException -> L88
        L74:
            boolean r0 = r2.hasNext()     // Catch: org.json.JSONException -> L88
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r2.next()     // Catch: org.json.JSONException -> L88
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L88
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r3, r1)     // Catch: org.json.JSONException -> L88
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L88
            goto L74
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L8e
        L8d:
            r5 = r6
        L8e:
            if (r5 == 0) goto La9
            r4.putAll(r5)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "headers: "
            r1.append(r0)
            java.lang.String r0 = r4.toString()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.C1698940uJQ.LIZJ()
        La9:
            X.0oKY r0 = r8.LIZIZ
            r0.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698470uIf.LJ(java.lang.String, java.lang.String):java.util.Map");
    }

    public final String LJFF(long j, String str) {
        String strLJJJJJL = ((AbstractC1487640ooc) this.LIZIZ).LJFF.LJJJJJL(str);
        C1698940uJQ.LIZJ();
        VideoLiveManager videoLiveManager = (VideoLiveManager) this.LIZIZ;
        int i = videoLiveManager.D1;
        if (i != 0) {
            if (videoLiveManager.H1 > videoLiveManager.I1) {
                i = 0;
            }
            strLJJJJJL = videoLiveManager.LJFF.LJIIJJI(strLJJJJJL, "drop_frame", C786410Ut5.j4("%d", new Object[]{Integer.valueOf(i)}));
        }
        this.LIZIZ.getClass();
        if (((VideoLiveManager) this.LIZIZ).LLJJ.equals("tsl")) {
            String strSubstring = ((VideoLiveManager) this.LIZIZ).LJLLJ.substring(((VideoLiveManager) this.LIZIZ).LJLLJ.indexOf("TimeShiftFormat=") + 16);
            if (strSubstring.indexOf("&") > 0) {
                strSubstring = strSubstring.substring(0, strSubstring.indexOf("&"));
            }
            VideoLiveManager videoLiveManager2 = (VideoLiveManager) this.LIZIZ;
            int i2 = videoLiveManager2.LLZL;
            if (i2 > 0) {
                return videoLiveManager2.LJFF.LJIIJJI(strLJJJJJL, strSubstring, C786410Ut5.j4("%d", new Object[]{Integer.valueOf(i2)}));
            }
            return strLJJJJJL;
        }
        return strLJJJJJL;
    }

    @Override // X.AbstractC1470550oN3, X.InterfaceC1470560oN4, X.InterfaceC1470600oN8
    public final void update(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        super.update(abstractC1470590oN7, interfaceC1469660oLc);
        AbstractC1469000oKY abstractC1469000oKY = this.LIZIZ;
        this.LIZLLL = ((VideoLiveManager) abstractC1469000oKY).LJJII;
        this.LJ = ((VideoLiveManager) abstractC1469000oKY).LJIILLIIL;
        this.LJFF = ((VideoLiveManager) abstractC1469000oKY).LJIL;
        this.LJI = ((VideoLiveManager) abstractC1469000oKY).LJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(java.lang.String r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698470uIf.LJI(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
