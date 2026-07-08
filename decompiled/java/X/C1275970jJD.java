package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.MixedStreamType;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275970jJD extends C1275640jIg {
    public final InterfaceC1275980jJE LJ;
    public final InterfaceC1276010jJH LJFF;
    public final C1275140jHs LJI;
    public final String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public final C1275990jJF LJIILLIIL = new C1275990jJF(this);
    public boolean LJIIZILJ = false;

    public final void LIZ(MixedStreamConfig mixedStreamConfig) {
        this.LIZ = true;
        if (this.LJI.LJII > 0 && mixedStreamConfig.getVideoConfig() != null) {
            mixedStreamConfig.getVideoConfig().setBitrate(this.LJI.LJII);
        }
        LIZIZ(mixedStreamConfig);
        AVLog.logKibana(4, "ServerStreamMixer", "startLiveTranscoding:", null);
        int iStartPushMixedStreamToCDN = this.LJFF.startPushMixedStreamToCDN(this.LJII, mixedStreamConfig, this.LJIILLIIL);
        if (iStartPushMixedStreamToCDN == 0) {
            this.LJIILLIIL.onMixingEvent(ByteRTCStreamMixingEvent.STREAM_MIXING_START_SUCCESS, this.LJII, ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_OK, 0, "STREAM_MIXING_START_SUCCESS", MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMixStream performer failed in AnchorNet branch, taskId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", ret=");
        sbLIZ.append(iStartPushMixedStreamToCDN);
        AVLog.ioe("ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(MixedStreamConfig mixedStreamConfig) {
        this.LJIIIIZZ = mixedStreamConfig.getVideoConfig().getWidth();
        this.LJIIIZ = mixedStreamConfig.getVideoConfig().getHeight();
        this.LJIIJ = mixedStreamConfig.getMixedStreamVideoConfigUpgradeWidth();
        this.LJIIJJI = mixedStreamConfig.getMixedStreamVideoConfigUpgradeHeight();
        this.LJIIL = mixedStreamConfig.getVideoConfig().getFps();
        this.LJIILIIL = mixedStreamConfig.getMixedStreamOrientation();
    }

    public C1275970jJD(C1275140jHs c1275140jHs, InterfaceC1275980jJE interfaceC1275980jJE, InterfaceC1276010jJH interfaceC1276010jJH, String str) {
        this.LJII = "";
        this.LJ = interfaceC1275980jJE;
        this.LJFF = interfaceC1276010jJH;
        this.LIZIZ = EnumC1275210jHz.SERVER_MIX;
        this.LJI = c1275140jHs;
        this.LJII = str;
        this.LIZ = true;
    }

    public final void LIZJ(final List<C1276580jKC> list, String str, final boolean z, final boolean z2, final boolean z3, final Map<String, C1276670jKL> map, final C1276000jJG c1276000jJG, final C969430bKn c969430bKn, final EnumC1275390jIH enumC1275390jIH) {
        int size;
        final String str2 = str;
        if (z3) {
            this.LJIIZILJ = true;
        }
        C1275030jHh c1275030jHhLJII = this.LJ.LJII();
        JSONObject jSONObjectLIZJ = this.LJ.LIZJ();
        if (c1275030jHhLJII.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHhLJII.LJJIFFI == EnumC1275210jHz.SERVER_MIX && !TextUtils.isEmpty(c1275030jHhLJII.LIZ().LIZJ())) {
            if (c1275030jHhLJII.LIZ != null && C786410Ut5.u3() != c1275030jHhLJII.LIZ.getLooper().getThread()) {
                C786410Ut5.LJJZZIII(c1275030jHhLJII.LIZ, new Runnable() { // from class: X.0jJC
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ServerStreamMixer@c6cd.updateMixStream$1");
                        try {
                            this.LLJI.LIZJ(list, str2, z, z2, z3, map, c1276000jJG, c969430bKn, enumC1275390jIH);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ServerStreamMixer@c6cd.updateMixStream$1");
                    }
                });
                return;
            }
            MixedStreamConfig mixedStreamConfigLIZLLL = this.LJ.LIZLLL(false);
            if (mixedStreamConfigLIZLLL == null) {
                return;
            }
            C1269160j8E c1269160j8E = this.LIZLLL;
            String str3 = "";
            if (c1269160j8E != null && c1269160j8E.LJLLJ) {
                if (c969430bKn != null) {
                    JSONObject jSONObject = c969430bKn.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateMixStream disposableMixParams: ");
                    sbLIZ.append(c969430bKn.toString());
                    AVLog.logKibana(4, "ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ), null);
                    if (jSONObject != null) {
                        String strOptString = jSONObject.optString("sceneType", "");
                        String strOptString2 = jSONObject.optString("danceVideoID", "");
                        this.LJIILJJIL = strOptString;
                        if (!"none".equals(strOptString2)) {
                            this.LJIILL = strOptString2;
                        }
                    }
                }
                Iterator<C1276580jKC> it2 = list.iterator();
                while (it2.hasNext()) {
                    C1276580jKC next = it2.next();
                    String str4 = next.LJIIZILJ;
                    if (!TextUtils.isEmpty(str4) && str4.endsWith("_game")) {
                        boolean zEquals = "JUST_DANCE".equals(this.LJIILJJIL);
                        boolean z4 = !TextUtils.isEmpty(this.LJIILL);
                        if (zEquals && z4) {
                            next.LIZIZ = this.LJIILL;
                        } else {
                            it2.remove();
                        }
                    }
                }
            }
            this.LJ.LIZ(list, mixedStreamConfigLIZLLL);
            if (c969430bKn != null) {
                mixedStreamConfigLIZLLL.getLayout().setAnimationId(c969430bKn.LIZIZ);
                List<C1276580jKC> list2 = c969430bKn.LIZLLL;
                if (list2 != null && (size = list2.size()) > 0) {
                    MixedStreamConfig.MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = new MixedStreamConfig.MixedStreamLayoutRegionConfig[size];
                    int i = 0;
                    do {
                        mixedStreamLayoutRegionConfigArr[i] = this.LJ.LJFF((C1276580jKC) ListProtector.get(list2, i));
                        i++;
                    } while (i < size);
                    mixedStreamConfigLIZLLL.getLayout().setBeforeRegions(mixedStreamLayoutRegionConfigArr);
                }
                JSONObject jSONObject2 = c969430bKn.LJ;
                if (jSONObject2 != null) {
                    String strOptString3 = jSONObject2.optString("flash_color", "");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        mixedStreamConfigLIZLLL.getLayout().setFlashColor(strOptString3);
                    }
                    C1269160j8E c1269160j8E2 = this.LIZLLL;
                    if (c1269160j8E2 != null && c1269160j8E2.LJLLJ) {
                        jSONObject2.optString("sceneType", "");
                        String strOptString4 = jSONObject2.optString("danceVideoID", "");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            mixedStreamConfigLIZLLL.getLayout().setDanceVideoId(strOptString4);
                        }
                        long jOptLong = jSONObject2.optLong("startDanceNtpTimeMs", 0L);
                        if (jOptLong > 0) {
                            mixedStreamConfigLIZLLL.getLayout().setDanceVideoStartNtpTime(jOptLong);
                        }
                    }
                }
            }
            C1271430jBt c1271430jBt = this.LIZJ;
            if (c1271430jBt != null && c1271430jBt.LLILZ && c1271430jBt.LIZ(str2, "app_data", "1610612737") != 0) {
                str2 = "";
            }
            if (C1268530j7D.LIZ()) {
                if (str2 != null) {
                    str3 = str2;
                }
                AVLog.i("ServerStreamMixer", str3);
            }
            mixedStreamConfigLIZLLL.getLayout().setUserConfigExtraInfo(str2);
            if (jSONObjectLIZJ != null && !TextUtils.isEmpty(c1275030jHhLJII.LIZ().LIZJ())) {
                Matcher matcher = PatternProtector.compile("stream-[0-9]+([0-9]{5})").matcher(c1275030jHhLJII.LIZ().LIZJ());
                if (matcher.find()) {
                    try {
                        jSONObjectLIZJ.put("streamName", matcher.group());
                        mixedStreamConfigLIZLLL.setAuthInfo(jSONObjectLIZJ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (map != null) {
                if (this.LJIIZILJ) {
                    this.LJ.LIZIZ(z3, map, mixedStreamConfigLIZLLL);
                } else {
                    try {
                        this.LJ.LJI(z2, map, mixedStreamConfigLIZLLL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            if (C1267520j5a.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateMixStream: isMixValidRegion:");
                sbLIZ2.append(c1276000jJG.LIZ);
                sbLIZ2.append(" getStreamOrientation:");
                sbLIZ2.append(true);
                sbLIZ2.append(" Orientation:");
                sbLIZ2.append(c1276000jJG.LIZIZ);
                sbLIZ2.append(" getMixStreamDowngrade:");
                sbLIZ2.append(c1276000jJG.LIZLLL);
                AVLog.logKibana(4, "ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            boolean z5 = c1276000jJG.LIZLLL;
            if (z5) {
                C1274980jHc.LIZ(mixedStreamConfigLIZLLL);
            } else if (c1276000jJG.LIZ) {
                C1274980jHc.LIZIZ(mixedStreamConfigLIZLLL, c1276000jJG.LIZJ, z5);
            } else {
                C1269160j8E c1269160j8E3 = this.LIZLLL;
                if (c1269160j8E3 != null && c1269160j8E3.LIZ.mVPassInteractCfg.LJIIJJI()) {
                    mixedStreamConfigLIZLLL.getVideoConfig().setUpgradeRes(1080, 1920);
                }
            }
            mixedStreamConfigLIZLLL.setOrientation(c1276000jJG.LIZIZ);
            mixedStreamConfigLIZLLL.getServerControlConfig().setAsrTaskMode(MixedStreamConfig.MixedStreamASRTaskMode.fromValue(enumC1275390jIH.getValue()));
            mixedStreamConfigLIZLLL.getVideoConfig().getWidth();
            mixedStreamConfigLIZLLL.getVideoConfig().getHeight();
            if (C1267520j5a.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateMixStream final:");
                sbLIZ3.append(mixedStreamConfigLIZLLL.getLayout().toString());
                AVLog.logKibana(4, "ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ3), null);
            }
            if (this.LJI.LJII > 0 && mixedStreamConfigLIZLLL.getVideoConfig() != null) {
                mixedStreamConfigLIZLLL.getVideoConfig().setBitrate(this.LJI.LJII);
            }
            LIZIZ(mixedStreamConfigLIZLLL);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("before updatePushMixedStreamToCDN:");
            sbLIZ4.append(mixedStreamConfigLIZLLL.getLayout().toString());
            AVLog.logKibana(4, "ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ4), null);
            this.LJFF.updatePushMixedStreamToCDN(this.LJII, mixedStreamConfigLIZLLL);
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("updateMixStream skip, maybe empty streamUrl:");
        sbLIZ5.append(c1275030jHhLJII.LIZ().LIZJ());
        AVLog.logKibana(5, "ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ5), null);
    }
}
