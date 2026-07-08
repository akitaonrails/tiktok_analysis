package X;

import Y.ARunnableS8S1400000_20;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.HumanOrientation;
import com.ss.bytertc.engine.data.Orientation;
import com.ss.bytertc.engine.data.Position;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276550jK9 implements InterfaceC1275980jJE {
    public final C1275030jHh LIZ;
    public final C1269160j8E LIZIZ;
    public JSONObject LIZJ;
    public final C1274830jHN LIZLLL;
    public boolean LJ;
    public final InterfaceC1275920jJ8 LJFF;
    public final VPassInteractCfg LJI;
    public final C1275140jHs LJII;
    public final C1274810jHL LJIIIIZZ;
    public C1275970jJD LJIIIZ;
    public final C1274850jHP LJIIJJI;
    public String LJIIL;
    public final InterfaceC1274710jHB LJIILIIL;
    public final C1274890jHT LJIILL;
    public VideoEncoderConfig LJIILLIIL;
    public String LJIJJ;
    public C1271430jBt LJJ;
    public final C1276650jKJ LJIIZILJ = new C1276650jKJ();
    public final C1276630jKH LJIJ = new C1276630jKH();
    public final C1276600jKE LJIJI = new C1276600jKE();
    public String LJIJJLI = "";
    public final List<MixedStreamConfig.MixedStreamLayoutRegionConfig> LJIL = new ArrayList();
    public boolean LJIILJJIL = false;
    public EnumC1275210jHz LJIIJ = EnumC1275210jHz.NONE;

    public final void LJIIIZ() {
        int i;
        int i2;
        C1274890jHT c1274890jHT;
        C1275140jHs c1275140jHsLJIIL;
        int i3;
        int i4;
        this.LJI.getClass();
        MixedStreamConfig mixedStreamConfigLIZLLL = LIZLLL(true);
        if (mixedStreamConfigLIZLLL == null) {
            C1275030jHh c1275030jHh = this.LIZ;
            if (c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHh.LJJIFFI == EnumC1275210jHz.SERVER_MIX) {
                if (c1275030jHh.LIZ() == null) {
                    AVLog.ioe("StreamMixManager", "Fail to init LiveTranscoding: MixStreamConfig is null");
                    return;
                }
                if (!TextUtils.isEmpty(this.LIZ.LIZ().LIZJ())) {
                    AVLog.ioe("StreamMixManager", "Fail to init LiveTranscoding: unknown reason");
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fail to init LiveTranscoding: stream url is ");
                sbLIZ.append(this.LIZ.LIZ().LIZJ());
                AVLog.ioe("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        C1275030jHh c1275030jHh2 = this.LIZ;
        InterfaceC1276590jKD interfaceC1276590jKD = c1275030jHh2.LJJIJLIJ;
        if (interfaceC1276590jKD == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("InteractConfig.getStreamMixer is null: interact mode ");
            sbLIZ2.append(this.LIZ.LJIILL);
            sbLIZ2.append(", character ");
            sbLIZ2.append(this.LIZ.LJIIL);
            sbLIZ2.append(", mix type ");
            sbLIZ2.append(this.LIZ.LJJIFFI);
            sbLIZ2.append(". Create client stack: ");
            this.LIZ.getClass();
            sbLIZ2.append((String) null);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            AVLog.ioe("StreamMixManager", strLIZIZ);
            AVLog.logKibana(6, "StreamMixManager", strLIZIZ, null);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(strLIZIZ);
            C1274080jGA.LIZ.LIZ("StreamMixManager.configMixTranscoding", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
            return;
        }
        C1274930jHX c1274930jHXLIZ = c1275030jHh2.LIZ();
        if (this.LIZ.LJJJJJ) {
            synchronized (c1274930jHXLIZ) {
                try {
                    i = c1274930jHXLIZ.LIZ;
                    i2 = c1274930jHXLIZ.LIZIZ;
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            i = c1274930jHXLIZ.LIZ;
            i2 = c1274930jHXLIZ.LIZIZ;
        }
        VideoEncoderConfig videoEncoderConfig = this.LJIILLIIL;
        if (videoEncoderConfig != null && (i3 = videoEncoderConfig.width) > 0 && (i4 = videoEncoderConfig.height) > 0) {
            i2 = i4;
            i = i3;
        }
        List<C1276580jKC> listLJIILL = this.LJIIIIZZ.LJIILL();
        C1274810jHL c1274810jHL = this.LJIIIIZZ;
        if (c1274810jHL != null && (c1274890jHT = c1274810jHL.LJI) != null && c1274890jHT.LJIIL() != null && (c1275140jHsLJIIL = this.LJIIIIZZ.LJI.LJIIL()) != null && c1275140jHsLJIIL.LIZLLL != null) {
            String str = this.LJIIIIZZ.LJI.LJIIL().LIZLLL;
            this.LJIIL = str;
            if (TextUtils.isEmpty(str)) {
                C1267520j5a.LIZIZ("createMixTranscoding null roomId");
            }
            mixedStreamConfigLIZLLL.setRoomID(this.LJIIL);
        }
        String strMixStream = interfaceC1276590jKD.mixStream(i, i2, listLJIILL);
        if (((ArrayList) listLJIILL).isEmpty()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startMixStream with empty regions, sei: ");
            sbLIZ3.append(strMixStream);
            sbLIZ3.append(", region is invalid");
            AVLog.iow("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startMixStream mixStream result: sei");
        sbLIZ4.append(strMixStream);
        sbLIZ4.append(", region:");
        sbLIZ4.append(LJIIIIZZ(listLJIILL));
        AVLog.iow("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ4));
        LIZ(listLJIILL, mixedStreamConfigLIZLLL);
        C1271430jBt c1271430jBt = this.LJJ;
        if (c1271430jBt != null && c1271430jBt.LLILZ && c1271430jBt.LIZ(strMixStream, "app_data", "1610612737") != 0) {
            strMixStream = "";
        }
        mixedStreamConfigLIZLLL.getLayout().setUserConfigExtraInfo(strMixStream);
        if (this.LIZJ != null && !TextUtils.isEmpty(this.LIZ.LIZ().LIZJ())) {
            Matcher matcher = PatternProtector.compile("stream-[0-9]+([0-9]{5})").matcher(this.LIZ.LIZ().LIZJ());
            if (matcher.find()) {
                try {
                    this.LIZJ.put("streamName", matcher.group());
                    mixedStreamConfigLIZLLL.setAuthInfo(this.LIZJ);
                } catch (Exception e) {
                }
            }
            this.LIZJ = null;
        }
        boolean zLJIIL = LJIIL();
        if (zLJIIL) {
            C1274980jHc.LIZ(mixedStreamConfigLIZLLL);
        } else if (c1274930jHXLIZ.LIZJ) {
            C1274980jHc.LIZIZ(mixedStreamConfigLIZLLL, c1274930jHXLIZ.LJFF, zLJIIL);
        } else if (this.LIZIZ.LIZ.mVPassInteractCfg.LJIIJJI()) {
            mixedStreamConfigLIZLLL.getVideoConfig().setUpgradeRes(1080, 1920);
        }
        mixedStreamConfigLIZLLL.setOrientation(this.LIZIZ.LJLJJI.getValue());
        this.LJ = true;
        C1275970jJD c1275970jJD = this.LJIIIZ;
        if (c1275970jJD != null) {
            c1275970jJD.LIZ(mixedStreamConfigLIZLLL);
        }
        mixedStreamConfigLIZLLL.setAuthInfo(null);
        C1274830jHN c1274830jHN = this.LIZLLL;
        if (c1274830jHN != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("");
            sbLIZ5.append(this);
            sbLIZ5.append(mixedStreamConfigLIZLLL.toString());
            c1274830jHN.LJIIIIZZ("enableLiveTranscoding", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public final JSONObject LJIIJ() {
        C1267440j5S c1267440j5S;
        C1267440j5S c1267440j5S2;
        JSONObject jSONObject = new JSONObject();
        try {
            C1275970jJD c1275970jJD = this.LJIIIZ;
            if (c1275970jJD != null) {
                jSONObject.put("linkmic_mix_width", c1275970jJD.LJIIIIZZ);
                jSONObject.put("linkmic_mix_height", this.LJIIIZ.LJIIIZ);
                C1275970jJD c1275970jJD2 = this.LJIIIZ;
                int i = c1275970jJD2.LJIIJ;
                if (i > 0 && c1275970jJD2.LJIIJJI > 0) {
                    jSONObject.put("linkmic_mix_upgrade_width", i);
                    jSONObject.put("linkmic_mix_upgrade_height", this.LJIIIZ.LJIIJJI);
                }
                jSONObject.put("linkmic_mix_fps", this.LJIIIZ.LJIIL);
                String str = this.LJIIIZ.LJIILIIL;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("push_client_orientation", str);
                    C1275970jJD c1275970jJD3 = this.LJIIIZ;
                    C1269760j9C c1269760j9CLIZJ = C1276790jKX.LIZJ(new C1269760j9C(c1275970jJD3.LJIIIIZZ, c1275970jJD3.LJIIIZ), !TextUtils.isEmpty(str) ? str.equals("vertical") ? EnumC1276810jKZ.VERTICAL : EnumC1276810jKZ.HORIZONTAL : null);
                    if (c1269760j9CLIZJ != null) {
                        jSONObject.put("virtual_width", c1269760j9CLIZJ.LIZ);
                        jSONObject.put("virtual_height", c1269760j9CLIZJ.LIZIZ);
                    }
                }
            }
            C1266810j4R c1266810j4R = this.LJI.LIZIZ;
            if (c1266810j4R != null) {
                C1275030jHh c1275030jHh = this.LIZ;
                boolean z = c1275030jHh != null && c1275030jHh.LJIJJ == EnumC1276410jJv.CO_HOST;
                boolean z2 = c1266810j4R != null && ((z && (c1267440j5S2 = c1266810j4R.LIZIZ) != null && c1267440j5S2.LIZ == 1) || !(z || (c1267440j5S = c1266810j4R.LIZ) == null || c1267440j5S.LIZ != 1));
                jSONObject.put("linkmic_mix_degradation_enabled", z2 ? 1 : 0);
                if (z2) {
                    C1267440j5S c1267440j5S3 = z ? c1266810j4R.LIZIZ : c1266810j4R.LIZ;
                    jSONObject.put("linkmic_mix_degradation_resolution_width", c1267440j5S3.LIZJ);
                    jSONObject.put("linkmic_mix_degradation_resolution_height", c1267440j5S3.LIZLLL);
                    jSONObject.put("linkmic_mix_degradation_reason", c1267440j5S3.LIZIZ);
                    jSONObject.put("linkmic_mix_degradation_cache", this.LJI.LIZJ ? 1 : 0);
                    return jSONObject;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final boolean LJIIL() {
        C1275030jHh c1275030jHh = this.LIZ;
        boolean z = c1275030jHh != null && c1275030jHh.LJIJJ == EnumC1276410jJv.CO_HOST;
        C1266810j4R c1266810j4R = this.LJI.LIZIZ;
        if (c1266810j4R == null) {
            return false;
        }
        if (z) {
            C1267440j5S c1267440j5S = c1266810j4R.LIZIZ;
            if (c1267440j5S != null && c1267440j5S.LIZ == 1) {
                return true;
            }
        } else {
            C1267440j5S c1267440j5S2 = c1266810j4R.LIZ;
            if (c1267440j5S2 != null && c1267440j5S2.LIZ == 1) {
                return true;
            }
        }
        return false;
    }

    public final void LJIILJJIL() {
        C1275970jJD c1275970jJD = this.LJIIIZ;
        if (c1275970jJD != null) {
            c1275970jJD.LIZ = false;
            c1275970jJD.LJFF.stopPushStreamToCDN(c1275970jJD.LJII);
        }
        this.LJ = false;
        C1274830jHN c1274830jHN = this.LIZLLL;
        if (c1274830jHN != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(this);
            c1274830jHN.LJIIIIZZ("disableLiveTranscoding", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1275980jJE
    public final JSONObject LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1275980jJE
    public final C1275030jHh LJII() {
        return this.LIZ;
    }

    public static final String LJIIIIZZ(List<C1276580jKC> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C1276580jKC c1276580jKC : list) {
                if (c1276580jKC != null) {
                    double d = 0.0f;
                    jSONArray.put(new JSONObject().put("uid", c1276580jKC.LIZIZ).put("left", c1276580jKC.LJ).put("top", c1276580jKC.LJFF).put("width", c1276580jKC.LJI).put("height", c1276580jKC.LJII).put("zOrder", c1276580jKC.LJIILIIL).put("mute", c1276580jKC.LJIIJJI).put("spatialAudioX", d).put("spatialAudioY", d).put("spatialAudioZ", d));
                }
            }
            return jSONArray.toString();
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create layout json message happen exception: ");
            sbLIZ.append(e);
            AVLog.ioe("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    @Override // X.InterfaceC1275980jJE
    public final MixedStreamConfig LIZLLL(boolean z) {
        MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType mixedStreamVideoCodecType;
        boolean z2;
        MixedStreamConfig.MixedStreamAudioProfile mixedStreamAudioProfile;
        MixedStreamConfig.MixedStreamSyncStrategy mixedStreamSyncStrategy;
        boolean z3;
        String str;
        C1269160j8E c1269160j8E;
        C1275030jHh c1275030jHh = this.LIZ;
        if (c1275030jHh.LJJIFFI != EnumC1275210jHz.NONE && c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHh.LIZ() != null && !TextUtils.isEmpty(this.LIZ.LIZ().LIZJ())) {
            C1274930jHX c1274930jHXLIZ = this.LIZ.LIZ();
            MixedStreamConfig mixedStreamConfigDefaultMixedStreamConfig = MixedStreamConfig.defaultMixedStreamConfig();
            mixedStreamConfigDefaultMixedStreamConfig.getVideoConfig().setRoiInfo(0.0f, 0.0f, 0.0f, 0.0f);
            mixedStreamConfigDefaultMixedStreamConfig.setRoomID(this.LJII.LIZLLL);
            mixedStreamConfigDefaultMixedStreamConfig.setUserID(this.LJII.LJFF);
            MixedStreamConfig.MixedStreamVideoConfig videoConfig = mixedStreamConfigDefaultMixedStreamConfig.getVideoConfig();
            videoConfig.setBitrate(c1274930jHXLIZ.LIZLLL);
            videoConfig.setFps(c1274930jHXLIZ.LJ);
            videoConfig.setWidth(c1274930jHXLIZ.LIZ);
            videoConfig.setHeight(c1274930jHXLIZ.LIZIZ);
            if (c1274930jHXLIZ.LJII == EnumC1275320jIA.BYTEVC1) {
                mixedStreamVideoCodecType = MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1;
            } else {
                mixedStreamVideoCodecType = MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
            }
            videoConfig.setVideoCodec(mixedStreamVideoCodecType);
            videoConfig.setGop((int) c1274930jHXLIZ.LJI);
            if (c1274930jHXLIZ.LJIIIZ.booleanValue() && this.LIZ.LJJJJL) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoConfig.setEnableBframe(z2);
            if (c1274930jHXLIZ.LJIILJJIL == EnumC1275260jI4.HE) {
                mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV1;
            } else {
                mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
            }
            if (this.LJIILL.LJJIIZI() && (c1269160j8E = this.LIZIZ) != null) {
                int iLJIIIZ = c1269160j8E.LJIIIZ();
                if (iLJIIIZ != 2) {
                    if (iLJIIIZ != 3) {
                        mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
                    } else {
                        mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV2;
                    }
                } else {
                    mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV1;
                }
            }
            MixedStreamConfig.MixedStreamAudioConfig audioConfig = mixedStreamConfigDefaultMixedStreamConfig.getAudioConfig();
            audioConfig.setChannels(c1274930jHXLIZ.LJIIL);
            audioConfig.setSampleRate(c1274930jHXLIZ.LIZ());
            audioConfig.setAudioProfile(mixedStreamAudioProfile);
            audioConfig.setBitrate(c1274930jHXLIZ.LJIILIIL);
            HumanOrientation humanOrientation = new HumanOrientation();
            C1276640jKI c1276640jKI = this.LJIJ.LIZ;
            humanOrientation.forward = new Orientation(c1276640jKI.LIZ, c1276640jKI.LIZIZ, c1276640jKI.LIZJ);
            C1276640jKI c1276640jKI2 = this.LJIJ.LIZIZ;
            humanOrientation.right = new Orientation(c1276640jKI2.LIZ, c1276640jKI2.LIZIZ, c1276640jKI2.LIZJ);
            C1276640jKI c1276640jKI3 = this.LJIJ.LIZJ;
            humanOrientation.up = new Orientation(c1276640jKI3.LIZ, c1276640jKI3.LIZIZ, c1276640jKI3.LIZJ);
            MixedStreamConfig.MixedStreamSpatialConfig spatialConfig = mixedStreamConfigDefaultMixedStreamConfig.getSpatialConfig();
            spatialConfig.setEnableSpatialRender(false);
            C1276650jKJ c1276650jKJ = this.LJIIZILJ;
            spatialConfig.setAudienceSpatialPosition(c1276650jKJ.LIZ, c1276650jKJ.LIZIZ, c1276650jKJ.LIZJ);
            spatialConfig.setAudienceSpatialOrientation(humanOrientation);
            MixedStreamConfig.MixedStreamClientMixConfig clientMixConfig = mixedStreamConfigDefaultMixedStreamConfig.getClientMixConfig();
            clientMixConfig.setVideoFormat(MixedStreamConfig.MixedStreamClientMixVideoFormat.MIXED_STREAM_CLIENT_MIX_VIDEO_FORMAT_TEXTURE_2D);
            clientMixConfig.setUseAudioMixer(false);
            MixedStreamConfig.MixedStreamSyncControlConfig syncControlConfig = mixedStreamConfigDefaultMixedStreamConfig.getSyncControlConfig();
            if (this.LIZ.LJJIIZI != EnumC1275490jIR.NO_USE) {
                mixedStreamSyncStrategy = MixedStreamConfig.MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_SIMPLEX_MODE_SYNC;
            } else {
                mixedStreamSyncStrategy = MixedStreamConfig.MixedStreamSyncStrategy.MIXED_STREAM_SYNC_STRATEGY_NO_SYNC;
            }
            syncControlConfig.setSyncStrategy(mixedStreamSyncStrategy);
            syncControlConfig.setMaxCacheTimeMs(this.LIZ.LJJJJI);
            if (this.LIZ.LJJIFFI == EnumC1275210jHz.RTC_CLIENT_MIX) {
                z3 = true;
            } else {
                z3 = false;
            }
            syncControlConfig.setVideoNeedSdkMix(z3);
            if (this.LIZ.LJJIIZI == EnumC1275490jIR.MAIN_SINGER) {
                str = this.LJII.LJFF;
            } else {
                str = "";
            }
            syncControlConfig.setBaseUserID(str);
            VideoEncoderConfig videoEncoderConfig = this.LJIILLIIL;
            if (videoEncoderConfig != null) {
                if (videoEncoderConfig.width > 0 && videoEncoderConfig.height > 0) {
                    mixedStreamConfigDefaultMixedStreamConfig.getVideoConfig().setWidth(this.LJIILLIIL.width);
                    mixedStreamConfigDefaultMixedStreamConfig.getVideoConfig().setHeight(this.LJIILLIIL.height);
                }
                if (this.LJIILLIIL.maxBitrate > 0) {
                    mixedStreamConfigDefaultMixedStreamConfig.getVideoConfig().setBitrate(this.LJIILLIIL.maxBitrate);
                }
                if (this.LJIILLIIL.frameRate > 0) {
                    mixedStreamConfigDefaultMixedStreamConfig.getVideoConfig().setFps(this.LJIILLIIL.frameRate);
                }
            }
            if (z) {
                c1274930jHXLIZ.LJIIZILJ = System.currentTimeMillis();
            }
            C1274890jHT c1274890jHT = this.LJIILL;
            if (c1274890jHT != null && !c1274890jHT.LJJIIZI() && !TextUtils.isEmpty(this.LIZIZ.LJLJI.LJJJ)) {
                c1274930jHXLIZ.LJIJJLI = this.LIZIZ.LJLJI.LJJJ;
            }
            c1274930jHXLIZ.LJIJ = 0;
            String strLIZJ = this.LIZ.LIZ().LIZJ();
            List<String> list = this.LJIIIIZZ.LJJLIL;
            if (list != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(strLIZJ) && strLIZJ.contains(str2)) {
                        c1274930jHXLIZ.LJIJ = 1;
                    }
                }
            }
            mixedStreamConfigDefaultMixedStreamConfig.setPushURL(c1274930jHXLIZ.LIZJ());
            MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
            mixedStreamLayoutConfig.setBackgroundColor(C786410Ut5.j4("#%06x", new Object[]{Integer.valueOf(c1274930jHXLIZ.LJIIJ)}));
            mixedStreamConfigDefaultMixedStreamConfig.setLayout(mixedStreamLayoutConfig);
            InterfaceC1276590jKD interfaceC1276590jKD = this.LIZ.LJJIJLIJ;
            if (interfaceC1276590jKD != null && interfaceC1276590jKD.updateMixAudioVolumeIndication(this.LJIJI)) {
                MixedStreamConfig.MixedStreamServerControlConfig mixedStreamServerControlConfig = new MixedStreamConfig.MixedStreamServerControlConfig();
                mixedStreamServerControlConfig.setEnableVolumeIndication(true);
                mixedStreamServerControlConfig.setVolumeIndicationInterval(this.LJIJI.LIZ);
                mixedStreamServerControlConfig.setTalkVolume(this.LJIJI.LIZIZ);
                mixedStreamServerControlConfig.setIsAddVolumeValue(this.LJIJI.LIZJ);
                mixedStreamServerControlConfig.setSeiContentMode(MixedStreamConfig.MixedStreamSEIContentMode.values()[this.LJIJI.LIZLLL.value()]);
                mixedStreamServerControlConfig.setEnableTalkVolumeLevels(this.LIZ.LJJJJLL);
                C1275030jHh c1275030jHh2 = this.LIZ;
                if (c1275030jHh2.LJJJJLL) {
                    mixedStreamServerControlConfig.setTalkVolumeLevels(c1275030jHh2.LJJJJZ);
                }
                mixedStreamConfigDefaultMixedStreamConfig.setServerControlConfig(mixedStreamServerControlConfig);
            }
            ArrayList arrayList = new ArrayList();
            List<LyraxTranscoderFeature> features = this.LJIIIIZZ.getFeatures();
            if (features != null && !features.isEmpty()) {
                for (LyraxTranscoderFeature lyraxTranscoderFeature : features) {
                    arrayList.add(new MixedStreamConfig.MixedStreamFeatureConfig(true, lyraxTranscoderFeature.getFeatureName(), lyraxTranscoderFeature.getProjectKey(), lyraxTranscoderFeature.getOptions()));
                }
            }
            mixedStreamConfigDefaultMixedStreamConfig.setFeatureConfigs(arrayList);
            return mixedStreamConfigDefaultMixedStreamConfig;
        }
        return null;
    }

    @Override // X.InterfaceC1275980jJE
    public final MixedStreamConfig.MixedStreamLayoutRegionConfig LJFF(C1276580jKC c1276580jKC) {
        double d;
        MixedStreamConfig.MixedStreamMediaType mixedStreamMediaType;
        List<JSONObject> list;
        if (TextUtils.isEmpty(c1276580jKC.LIZIZ)) {
            return null;
        }
        String str = c1276580jKC.LIZIZ;
        double d2 = c1276580jKC.LJ;
        double d3 = c1276580jKC.LJFF;
        double d4 = c1276580jKC.LJI;
        double d5 = c1276580jKC.LJII;
        int i = c1276580jKC.LJIILIIL;
        if (c1276580jKC.LJIIL) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfigLJIIJJI = LJIIJJI(str, d2, d3, d4, d5, i, d);
        if (this.LJIILL.LJJIIZI() && TextUtils.equals(c1276580jKC.LIZIZ, this.LJII.LJFF)) {
            mixedStreamLayoutRegionConfigLJIIJJI.setMediaType(MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO);
        } else {
            if (c1276580jKC.LJIIJJI) {
                mixedStreamMediaType = MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
            } else {
                mixedStreamMediaType = MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
            }
            mixedStreamLayoutRegionConfigLJIIJJI.setMediaType(mixedStreamMediaType);
        }
        mixedStreamLayoutRegionConfigLJIIJJI.setCornerRadius(c1276580jKC.LJIILL);
        mixedStreamLayoutRegionConfigLJIIJJI.setStreamIndex(StreamIndex.fromId(c1276580jKC.LJIJ));
        int i2 = c1276580jKC.LJIILJJIL;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN);
                } else {
                    mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE);
                }
            } else {
                mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT);
            }
        } else {
            mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN);
        }
        mixedStreamLayoutRegionConfigLJIIJJI.setSpatialPosition(new Position(0.0f, 0.0f, 0.0f));
        mixedStreamLayoutRegionConfigLJIIJJI.setApplySpatialAudio(true);
        mixedStreamLayoutRegionConfigLJIIJJI.setApplySpatialReverb(false);
        int i3 = c1276580jKC.LIZLLL;
        if (i3 != -1) {
            mixedStreamLayoutRegionConfigLJIIJJI.setWinID(i3);
        }
        C1276160jJW c1276160jJW = c1276580jKC.LJIJI;
        if (c1276160jJW != null && (list = c1276160jJW.LIZ) != null && !list.isEmpty()) {
            MixedStreamConfig.MixedStreamEffectDescription[] mixedStreamEffectDescriptionArr = new MixedStreamConfig.MixedStreamEffectDescription[c1276160jJW.LIZ.size()];
            for (int i4 = 0; i4 < c1276160jJW.LIZ.size(); i4++) {
                JSONObject jSONObject = (JSONObject) ListProtector.get(c1276160jJW.LIZ, i4);
                MixedStreamConfig.MixedStreamEffectDescription mixedStreamEffectDescription = new MixedStreamConfig.MixedStreamEffectDescription();
                if (jSONObject.optInt("effectType", 0) == 1) {
                    mixedStreamEffectDescription.setEffectType(MixedStreamConfig.MixedStreamEffectType.MIXED_STREAM_EFFECT_TYPE_BORDER);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("effectParam");
                    if (jSONObjectOptJSONObject != null) {
                        MixedStreamConfig.MixedStreamEffectParam mixedStreamEffectParam = new MixedStreamConfig.MixedStreamEffectParam();
                        String strOptString = jSONObjectOptJSONObject.optString("color", "#000000");
                        int iOptInt = jSONObjectOptJSONObject.optInt("thickness", 0);
                        mixedStreamEffectParam.setColor(strOptString);
                        mixedStreamEffectParam.setThickness(iOptInt);
                        mixedStreamEffectDescription.setEffectParam(mixedStreamEffectParam);
                        mixedStreamEffectDescriptionArr[i4] = mixedStreamEffectDescription;
                    } else {
                        mixedStreamEffectDescriptionArr[i4] = null;
                    }
                } else if (jSONObject.optInt("effectType", 0) == 2) {
                    mixedStreamEffectDescription.setEffectType(MixedStreamConfig.MixedStreamEffectType.MIXED_STREAM_EFFECT_TYPE_ASR_WORD_MUTING);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("effectParam");
                    if (jSONObjectOptJSONObject2 != null) {
                        MixedStreamConfig.MixedStreamEffectParam mixedStreamEffectParam2 = new MixedStreamConfig.MixedStreamEffectParam();
                        mixedStreamEffectParam2.setEnableWordMuting(jSONObjectOptJSONObject2.optBoolean("enable_word_muting", false));
                        mixedStreamEffectParam2.setEnableSegmentStore(jSONObjectOptJSONObject2.optBoolean("enable_segment_store", false));
                        mixedStreamEffectParam2.setEnableSdkCallback(jSONObjectOptJSONObject2.optBoolean("enable_sdk_callback", false));
                        mixedStreamEffectParam2.setEnable(jSONObjectOptJSONObject2.optBoolean("enable", false));
                        mixedStreamEffectDescription.setEffectParam(mixedStreamEffectParam2);
                        mixedStreamEffectDescriptionArr[i4] = mixedStreamEffectDescription;
                    } else {
                        mixedStreamEffectDescriptionArr[i4] = null;
                    }
                } else {
                    mixedStreamEffectDescriptionArr[i4] = null;
                }
            }
            mixedStreamLayoutRegionConfigLJIIJJI.setEffectDescriptions(mixedStreamEffectDescriptionArr);
        }
        return mixedStreamLayoutRegionConfigLJIIJJI;
    }

    @Override // X.InterfaceC1275980jJE
    public final void LIZ(List<C1276580jKC> list, MixedStreamConfig mixedStreamConfig) {
        int i;
        MixedStreamConfig.MixedStreamLayoutConfig layout = mixedStreamConfig.getLayout();
        MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
        mixedStreamLayoutConfig.setBackgroundColor(layout.getBackgroundColor());
        mixedStreamLayoutConfig.setUserConfigExtraInfo(layout.getUserConfigExtraInfo());
        ArrayList arrayList = new ArrayList();
        Iterator<C1276580jKC> it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            C1276580jKC next = it2.next();
            if (!TextUtils.isEmpty(next.LIZIZ)) {
                MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfigLJFF = LJFF(next);
                arrayList.add(mixedStreamLayoutRegionConfigLJFF);
                if (mixedStreamLayoutRegionConfigLJFF.getEffectDescription() != null) {
                    MixedStreamConfig.MixedStreamEffectDescription[] effectDescription = mixedStreamLayoutRegionConfigLJFF.getEffectDescription();
                    int length = effectDescription.length;
                    while (i < length) {
                        MixedStreamConfig.MixedStreamEffectDescription mixedStreamEffectDescription = effectDescription[i];
                        if (mixedStreamEffectDescription != null && mixedStreamEffectDescription.getEffectParam() != null && mixedStreamEffectDescription.getEffectParam().isEnable()) {
                            mixedStreamConfig.setDisableCdnForward(true);
                        }
                        i++;
                    }
                }
            }
        }
        mixedStreamLayoutConfig.setRegions((MixedStreamConfig.MixedStreamLayoutRegionConfig[]) arrayList.toArray(new MixedStreamConfig.MixedStreamLayoutRegionConfig[arrayList.size()]));
        while (i < mixedStreamLayoutConfig.getRegions().length) {
            i++;
        }
        mixedStreamConfig.setLayout(mixedStreamLayoutConfig);
    }

    public final void LJIILL(C969430bKn c969430bKn, EnumC1275390jIH enumC1275390jIH) {
        int i;
        int i2;
        String strMixStream;
        int i3;
        int i4;
        AVLog.debugTrace(new Object[0]);
        C1275030jHh c1275030jHh = this.LIZ;
        InterfaceC1276590jKD interfaceC1276590jKD = c1275030jHh.LJJIJLIJ;
        if (c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHh.LJJIFFI != EnumC1275210jHz.NONE && interfaceC1276590jKD != null) {
            C1275970jJD c1275970jJD = this.LJIIIZ;
            if (c1275970jJD != null && c1275970jJD.LIZ) {
                List<C1276580jKC> list = c969430bKn.LIZJ;
                if (list != null && !list.isEmpty()) {
                    C1274930jHX c1274930jHXLIZ = this.LIZ.LIZ();
                    synchronized (c1274930jHXLIZ) {
                        try {
                            i = c1274930jHXLIZ.LIZ;
                            i2 = c1274930jHXLIZ.LIZIZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    VideoEncoderConfig videoEncoderConfig = this.LJIILLIIL;
                    if (videoEncoderConfig != null && (i3 = videoEncoderConfig.width) > 0 && (i4 = videoEncoderConfig.height) > 0) {
                        i2 = i4;
                        i = i3;
                    }
                    if (!TextUtils.isEmpty(c969430bKn.LIZ)) {
                        strMixStream = c969430bKn.LIZ;
                    } else {
                        strMixStream = interfaceC1276590jKD.mixStream(i, i2, c969430bKn.LIZJ);
                    }
                    C1276000jJG c1276000jJG = new C1276000jJG(c1274930jHXLIZ.LIZJ, this.LIZIZ.LJLJJI.getValue(), c1274930jHXLIZ.LJFF, LJIIL());
                    if (C1274690jH9.LIZJ() != null) {
                        C1274690jH9.LJFF(new ARunnableS8S1400000_20(this, c969430bKn, strMixStream, c1276000jJG, enumC1275390jIH, 0));
                        return;
                    }
                    return;
                }
                if (C1267520j5a.LIZ()) {
                    AVLog.logKibana(5, "StreamMixManager", "getRegions is empty", null);
                    return;
                }
                return;
            }
            AVLog.logKibana(5, "StreamMixManager", "updateMixStream before startMixStream, return", null);
            return;
        }
        if (C1267520j5a.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateMixStream mConfig.getCharacter():");
            sbLIZ.append(this.LIZ.LJIIL);
            sbLIZ.append(" getMixStreamType:");
            sbLIZ.append(this.LIZ.LJJIFFI);
            sbLIZ.append(" externalMixer:");
            sbLIZ.append(interfaceC1276590jKD);
            AVLog.logKibana(5, "StreamMixManager", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    @Override // X.InterfaceC1275980jJE
    public final void LIZIZ(boolean z, Map<String, C1276670jKL> map, MixedStreamConfig mixedStreamConfig) {
        MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode;
        C1276050jJL c1276050jJL;
        int i;
        int i2;
        if (map != null && map.size() != 0) {
            MixedStreamConfig.MixedStreamLayoutConfig layout = mixedStreamConfig.getLayout();
            MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
            mixedStreamLayoutConfig.setBackgroundColor(layout.getBackgroundColor());
            mixedStreamLayoutConfig.setUserConfigExtraInfo(layout.getUserConfigExtraInfo());
            ArrayList arrayList = new ArrayList();
            MixedStreamConfig.MixedStreamLayoutRegionConfig[] regions = layout.getRegions();
            for (MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : regions) {
                arrayList.add(mixedStreamLayoutRegionConfig);
            }
            ArrayList arrayList2 = new ArrayList();
            if (z) {
                for (Map.Entry<String, C1276670jKL> entry : map.entrySet()) {
                    MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode2 = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT;
                    int i3 = C1276700jKO.LIZ[entry.getValue().LJIIIIZZ.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 == 3) {
                            mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE;
                        } else {
                            mixedStreamRenderMode = mixedStreamRenderMode2;
                        }
                    } else {
                        mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                    }
                    MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfigLJIIJJI = LJIIJJI(entry.getKey(), entry.getValue().LIZJ, entry.getValue().LIZLLL, entry.getValue().LJ, entry.getValue().LJFF, entry.getValue().LJI, entry.getValue().LJII);
                    mixedStreamLayoutRegionConfigLJIIJJI.setMediaType(MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY);
                    mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(mixedStreamRenderMode);
                    mixedStreamLayoutRegionConfigLJIIJJI.setRegionContentType(MixedStreamConfig.MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM);
                    if (!TextUtils.isEmpty(entry.getValue().LJIIIZ)) {
                        mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageUrl(entry.getValue().LJIIIZ);
                        int i4 = C1276700jKO.LIZIZ[entry.getValue().LJIILIIL.ordinal()];
                        if (i4 != 1) {
                            i = 2;
                            if (i4 == 2) {
                                mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageFillMode(MixedStreamConfig.AlternateImageFillMode.ALTERNATE_IMAGE_FILL_MODE);
                            }
                        } else {
                            i = 2;
                            mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageFillMode(MixedStreamConfig.AlternateImageFillMode.ALTERNATE_IMAGE_HIDDEN_MODE);
                        }
                        int i5 = C1276700jKO.LIZJ[entry.getValue().LJIILJJIL.ordinal()];
                        if (i5 != 1) {
                            if (i5 != i) {
                                i2 = 3;
                                if (i5 == 3) {
                                    mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageProcess(MixedStreamConfig.AlternateImageProcess.ALTERNATE_IMAGE_PROCESS_CONFIG);
                                }
                            } else {
                                i2 = 3;
                                mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageProcess(MixedStreamConfig.AlternateImageProcess.ALTERNATE_IMAGE_PROCESS_GAUSSIAN);
                            }
                        } else {
                            i2 = 3;
                            mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageProcess(MixedStreamConfig.AlternateImageProcess.ALTERNATE_IMAGE_PROCESS_NONE);
                        }
                        mixedStreamLayoutRegionConfigLJIIJJI.setAlternateImageProcessValue(entry.getValue().LJIIJ);
                        mixedStreamLayoutRegionConfigLJIIJJI.setCornerRadius(entry.getValue().LJIIJJI);
                        mixedStreamLayoutRegionConfigLJIIJJI.getAlternateImageProcessConfig().setBlur(entry.getValue().LIZ);
                        mixedStreamLayoutRegionConfigLJIIJJI.getAlternateImageProcessConfig().setBrightness(entry.getValue().LIZIZ);
                        if (entry.getValue().LJIILL != null) {
                            int i6 = C1276700jKO.LIZLLL[entry.getValue().LJIILL.ordinal()];
                            if (i6 != 1) {
                                if (i6 != i) {
                                    if (i6 != i2) {
                                        if (i6 == 4) {
                                            mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(mixedStreamRenderMode2);
                                        }
                                    } else {
                                        mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_BOTTOM_CROP);
                                    }
                                } else {
                                    mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE);
                                }
                            } else {
                                mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN);
                            }
                        }
                    }
                    C1276670jKL value = entry.getValue();
                    if (value != null && (c1276050jJL = value.LJIIL) != null) {
                        mixedStreamLayoutRegionConfigLJIIJJI.setSourceCropInfo(C1274980jHc.LIZJ(c1276050jJL));
                    }
                    arrayList2.add(mixedStreamLayoutRegionConfigLJIIJJI);
                }
                C1274930jHX c1274930jHXLIZ = this.LIZ.LIZ();
                c1274930jHXLIZ.getClass();
                this.LJIJJLI = "";
                int i7 = C1276700jKO.LJ[c1274930jHXLIZ.LJIL.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        mixedStreamLayoutConfig.setAppdataSEIMode(MixedStreamConfig.AppdataSEIMode.APPDATA_SEI_SYN_MODE);
                    }
                } else {
                    mixedStreamLayoutConfig.setAppdataSEIMode(MixedStreamConfig.AppdataSEIMode.APPDATA_SEI_ASYN_MODE);
                }
            } else {
                Iterator it2 = ((ArrayList) this.LJIL).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
            }
            mixedStreamLayoutConfig.setBackgroundImage(this.LJIJJLI);
            ((ArrayList) this.LJIL).clear();
            ((ArrayList) this.LJIL).addAll(arrayList2);
            arrayList.addAll(arrayList2);
            mixedStreamLayoutConfig.setRegions((MixedStreamConfig.MixedStreamLayoutRegionConfig[]) arrayList.toArray(new MixedStreamConfig.MixedStreamLayoutRegionConfig[arrayList.size()]));
            mixedStreamConfig.setLayout(mixedStreamLayoutConfig);
        }
    }

    @Override // X.InterfaceC1275980jJE
    public final void LJI(boolean z, Map<String, C1276670jKL> map, MixedStreamConfig mixedStreamConfig) {
        C1276050jJL c1276050jJL;
        if (map != null && map.size() != 0) {
            MixedStreamConfig.MixedStreamLayoutConfig layout = mixedStreamConfig.getLayout();
            MixedStreamConfig.MixedStreamLayoutConfig mixedStreamLayoutConfig = new MixedStreamConfig.MixedStreamLayoutConfig();
            mixedStreamLayoutConfig.setBackgroundColor(layout.getBackgroundColor());
            mixedStreamLayoutConfig.setUserConfigExtraInfo(layout.getUserConfigExtraInfo());
            ArrayList arrayList = new ArrayList();
            MixedStreamConfig.MixedStreamLayoutRegionConfig[] regions = layout.getRegions();
            for (MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig : regions) {
                arrayList.add(mixedStreamLayoutRegionConfig);
            }
            for (Map.Entry<String, C1276670jKL> entry : map.entrySet()) {
                MixedStreamConfig.MixedStreamRenderMode mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_FIT;
                int i = C1276700jKO.LIZ[entry.getValue().LJIIIIZZ.ordinal()];
                if (i != 1) {
                    if (i != 2 && i == 3) {
                        mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_ADAPTIVE;
                    }
                } else {
                    mixedStreamRenderMode = MixedStreamConfig.MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                }
                MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfigLJIIJJI = LJIIJJI(entry.getKey(), entry.getValue().LIZJ, entry.getValue().LIZLLL, entry.getValue().LJ, entry.getValue().LJFF, entry.getValue().LJI, entry.getValue().LJII);
                mixedStreamLayoutRegionConfigLJIIJJI.setMediaType(MixedStreamConfig.MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY);
                mixedStreamLayoutRegionConfigLJIIJJI.setRenderMode(mixedStreamRenderMode);
                mixedStreamLayoutRegionConfigLJIIJJI.setRegionContentType(MixedStreamConfig.MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_IMAGE);
                if (z) {
                    entry.getValue().getClass();
                }
                C1276670jKL value = entry.getValue();
                if (value != null && (c1276050jJL = value.LJIIL) != null) {
                    mixedStreamLayoutRegionConfigLJIIJJI.setSourceCropInfo(C1274980jHc.LIZJ(c1276050jJL));
                }
                arrayList.add(mixedStreamLayoutRegionConfigLJIIJJI);
            }
            mixedStreamLayoutConfig.setRegions((MixedStreamConfig.MixedStreamLayoutRegionConfig[]) arrayList.toArray(new MixedStreamConfig.MixedStreamLayoutRegionConfig[arrayList.size()]));
            mixedStreamConfig.setLayout(mixedStreamLayoutConfig);
        }
    }

    @Override // X.InterfaceC1275980jJE
    public final void LJ(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, int i, int i2, int i3) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_MIX_IMAGE_EVENT) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 402, i, i2, Integer.valueOf(i3));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image mix failed: ");
            sbLIZ.append(i);
            sbLIZ.append(", mixType: ");
            sbLIZ.append(i3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1274830jHN c1274830jHN = this.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" || ");
            sbLIZ2.append(str2);
            c1274830jHN.LJIIIZ(8305, C2188811AlT.LIZIZ(sbLIZ2));
            AVLog.iod("StreamMixManager", strLIZIZ);
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_SINGLE_CHORUS_EVENT) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 403, i, i2, Integer.valueOf(i3));
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_SUCCESS) {
            ((C1274990jHd) this.LJFF).LIZ();
            this.LJIIIIZZ.getClass();
            this.LJI.getClass();
            AVLog.logKibana(3, "StreamMixManager", "STREAM_MIXING_START_SUCCESS mixStreamSuccessCallbackPublishSuccess", null);
            this.LJIIIIZZ.LJJJLZIJ();
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 404, i, i2, Integer.valueOf(i3));
            if (this.LJIILJJIL) {
                LJIILIIL(byteRTCStreamMixingEvent, i, i2, str2, i3);
                return;
            }
            return;
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_FAILED) {
            if (this.LJIILJJIL) {
                LJIILIIL(byteRTCStreamMixingEvent, i, i2, str2, i3);
            } else {
                this.LJIILIIL.LIZIZ(this.LJIIIIZZ, 405, i, i2, new Exception(str2));
            }
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_ALTERNATE_IMAGE_SUCCEED) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 406, i, i2, new Object[0]);
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_ALTERNATE_IMAGE_FAILED) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 407, i, i2, str2);
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_BACKGROUND_URL_SUCCEED) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 408, i, i2, new Object[0]);
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_BACKGROUND_URL_FAILED) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 409, i, i2, str2);
        }
    }

    public final void LJIILIIL(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, int i, int i2, String str, int i3) {
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_SUCCESS) {
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 401, i, i2, Integer.valueOf(i3), str);
        }
        if (byteRTCStreamMixingEvent == ByteRTCStreamMixingEvent.STREAM_MIXING_START_FAILED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switch to server mix failed, postprocess error code: ");
            sbLIZ.append(i);
            sbLIZ.append("|| msg: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LIZLLL.LJIIIZ(8304, strLIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switch to server mix failed, error_msg");
            sbLIZ2.append(strLIZIZ);
            AVLog.iod("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIILIIL.LIZ(this.LJIIIIZZ, 401, 8304L, i2, Integer.valueOf(i3), str);
            EnumC1275210jHz enumC1275210jHz = this.LJIIJ;
            if (enumC1275210jHz != EnumC1275210jHz.NONE) {
                this.LJIIIIZZ.LLIIIJ(enumC1275210jHz);
            }
        }
        this.LJIILJJIL = false;
    }

    public final MixedStreamConfig.MixedStreamLayoutRegionConfig LJIIJJI(String str, double d, double d2, double d3, double d4, int i, double d5) {
        MixedStreamConfig.MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig = new MixedStreamConfig.MixedStreamLayoutRegionConfig();
        mixedStreamLayoutRegionConfig.setUserID(str);
        mixedStreamLayoutRegionConfig.setLocationX(d);
        mixedStreamLayoutRegionConfig.setLocationY(d2);
        mixedStreamLayoutRegionConfig.setWidthProportion(d3);
        mixedStreamLayoutRegionConfig.setHeightProportion(d4);
        mixedStreamLayoutRegionConfig.setZOrder(i);
        mixedStreamLayoutRegionConfig.setAlpha(d5);
        if (str.equals(this.LJII.LJFF)) {
            mixedStreamLayoutRegionConfig.setIsLocalUser(true);
        }
        if (!TextUtils.isEmpty(this.LJIIL)) {
            mixedStreamLayoutRegionConfig.setRoomID(this.LJIIL);
        }
        return mixedStreamLayoutRegionConfig;
    }

    public C1276550jK9(C1274810jHL c1274810jHL, C1275030jHh c1275030jHh, C1269340j8W c1269340j8W, C1274830jHN c1274830jHN, InterfaceC1275920jJ8 interfaceC1275920jJ8, VPassInteractCfg vPassInteractCfg, C1275140jHs c1275140jHs, C1274850jHP c1274850jHP, C1274700jHA c1274700jHA, C1274890jHT c1274890jHT) {
        VideoEncoderConfig videoEncoderConfig;
        this.LJIIIIZZ = c1274810jHL;
        this.LIZ = c1275030jHh;
        this.LIZIZ = c1269340j8W;
        this.LIZLLL = c1274830jHN;
        this.LJFF = interfaceC1275920jJ8;
        this.LJI = vPassInteractCfg;
        this.LJII = c1275140jHs;
        this.LJIIJJI = c1274850jHP;
        this.LJIILIIL = c1274700jHA;
        this.LJIILL = c1274890jHT;
        String str = c1275140jHs.LJIIJ;
        this.LJIJJ = str;
        if (c1275030jHh.LJJJJJ && TextUtils.isEmpty(str)) {
            this.LJIJJ = c1275030jHh.LIZ().LJIJJ;
        }
        if (c1274890jHT.LJJIIZI()) {
            if (c1274890jHT.LJJIIZ()) {
                InterfaceC1266360j3i interfaceC1266360j3i = c1274890jHT.LJIJI.LJI;
                this.LJIJJ = interfaceC1266360j3i != null ? interfaceC1266360j3i.LJIJJ() : "";
            } else {
                this.LJIJJ = c1274890jHT.getLivePusherTaskId();
            }
        }
        EnumC1275210jHz enumC1275210jHz = c1275030jHh.LJJIFFI;
        EnumC1275210jHz enumC1275210jHz2 = EnumC1275210jHz.SERVER_MIX;
        if (enumC1275210jHz == enumC1275210jHz2) {
            this.LJIIIZ = new C1275970jJD(c1275140jHs, this, c1274890jHT, this.LJIJJ);
        }
        C1275970jJD c1275970jJD = this.LJIIIZ;
        if (c1275970jJD != null) {
            c1275970jJD.LIZLLL = c1269340j8W;
        }
        if (c1275030jHh.LJJIFFI == enumC1275210jHz2 && (videoEncoderConfig = c1274890jHT.LJIILIIL.LJII) != null && videoEncoderConfig != C1275720jIo.LIZ) {
            this.LJIILLIIL = videoEncoderConfig;
        }
        if (vPassInteractCfg.LJIIJ()) {
            this.LJIIL = c1275140jHs.LIZLLL;
        }
    }
}
