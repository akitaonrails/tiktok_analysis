package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkMultiguestOptimizeLinkmicSeiSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MixStreamServerControlParamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.VolumeMixStreamConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181301AYm extends C09AY implements Function0<C2181361AYs> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181301AYm(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.1AYs] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C2181361AYs invoke() {
        C1AXM c1axm = this.LL;
        final C2177031AIb c2177031AIb = c1axm.LL;
        final OnLineMicInfo onLineMicInfo = c1axm.LLJJIJIL;
        C1AZ8 c1az8 = new C1AZ8(c1axm);
        final C1AZ3 c1az3 = new C1AZ3(this.LL);
        final C2181351AYr c2181351AYr = new C2181351AYr(this.LL);
        final C1AZ5 c1az5 = new C1AZ5(this.LL);
        final C1AZ6 c1az6 = new C1AZ6(this.LL);
        final C1AZ1 c1az1 = new C1AZ1(this.LL);
        final C2181331AYp c2181331AYp = new C2181331AYp(this.LL);
        final C2181311AYn c2181311AYn = new C2181311AYn(this.LL);
        final C2181281AYk c2181281AYk = new C2181281AYk(this.LL);
        final C2181341AYq c2181341AYq = new C2181341AYq(this.LL);
        final HashMap<String, Map<String, String>> mapLJJLIIIJL = this.LL.LJJLIIIJL();
        final HashMap<String, Map<String, String>> mapLJJLIIIIJ = this.LL.LJJLIIIIJ();
        final Map<String, Object> mapLJJL = this.LL.LJJL();
        final HashMap<String, Map<String, JSONObject>> mapLJJLI = this.LL.LJJLI();
        final C2181321AYo c2181321AYo = new C2181321AYo(this.LL);
        C968920bJy c968920bJy = new C968920bJy(c2177031AIb, onLineMicInfo, c1az8, c1az3, c2181351AYr, c1az5, c1az6, c1az1, c2181331AYp, c2181311AYn, c2181281AYk, c2181341AYq, mapLJJLIIIJL, mapLJJLIIIIJ, mapLJJL, mapLJJLI, c2181321AYo);
        final C1AXM c1axm2 = this.LL;
        final LiveStreamMixer liveStreamMixerLJJLIL = c1axm2.LL.LJFF.LJJLIL(c968920bJy);
        if (liveStreamMixerLJJLIL == null) {
            final C968970bK3 c968970bK3 = new C968970bK3(c968920bJy);
            liveStreamMixerLJJLIL = new LiveStreamMixer(c2177031AIb, onLineMicInfo, c968970bK3, c1az3, c2181351AYr, c1az5, c1az6, c1az1, c2181331AYp, c2181311AYn, c2181281AYk, c2181341AYq, mapLJJLIIIJL, mapLJJLIIIIJ, mapLJJL, mapLJJLI, c2181321AYo) { // from class: X.1AYt
                public final C2177031AIb LL;
                public final OnLineMicInfo LLILLJJLI;
                public final Function0<Long> LLILLL;
                public final Function0<List<String>> LLILZ;
                public final Function0<Float> LLILZIL;
                public final Function0<Long> LLILZLL;
                public final Function0<Integer> LLIZ;
                public final Function1<String, Unit> LLIZLLLIL;
                public final Function0<Boolean> LLJ;
                public final Function0<Boolean> LLJI;
                public final Function0<Layout> LLJIJIL;
                public final Function0<Layout> LLJILJIL;
                public final HashMap<String, Map<String, String>> LLJILJILJ;
                public final HashMap<String, Map<String, String>> LLJILLL;
                public final Map<String, Object> LLJJ;
                public final HashMap<String, Map<String, JSONObject>> LLJJI;
                public final Function0<List<PosIdentity>> LLJJIII;
                public final String LLJJIJI = "LiveStreamMixer";
                public long LLJJIJIIJIL;

                @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
                public final boolean updateMixSpatialAudio(C1276650jKJ c1276650jKJ, C1276630jKH c1276630jKH) {
                    return false;
                }

                public final Map<String, OnLineMicInfo> LJIIIZ() {
                    return this.LLJ.invoke().booleanValue() ? this.LL.LJFF.LIZ() : this.LL.LJFF.LJJII();
                }

                public final MicPositionInfo LJIIIIZZ(String str) {
                    if (this.LLJ.invoke().booleanValue()) {
                        OnLineMicInfo onLineMicInfoLJIJI = this.LL.LJFF.LJIJI(str);
                        if (onLineMicInfoLJIJI == null) {
                            return null;
                        }
                        return onLineMicInfoLJIJI.micPositionData;
                    }
                    OnLineMicInfo onLineMicInfoLJFF = this.LL.LJFF.LJFF(str);
                    if (onLineMicInfoLJFF == null) {
                        return null;
                    }
                    return onLineMicInfoLJFF.micPositionData;
                }

                @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
                public final boolean updateMixAudioVolumeIndication(C1276600jKE c1276600jKE) {
                    VolumeMixStreamConfig value;
                    EnumC1276610jKF enumC1276610jKF;
                    LivesdkMultiguestOptimizeLinkmicSeiSetting livesdkMultiguestOptimizeLinkmicSeiSetting = LivesdkMultiguestOptimizeLinkmicSeiSetting.INSTANCE;
                    if (livesdkMultiguestOptimizeLinkmicSeiSetting.enable(this.LL.LIZIZ) && c1276600jKE != null && (value = MixStreamServerControlParamSetting.INSTANCE.getValue()) != null) {
                        c1276600jKE.LIZ = value.volumeIndicationInterval;
                        c1276600jKE.LIZIZ = value.talkVolumeThreshold;
                        c1276600jKE.LIZJ = value.addVolume;
                        if (value.seiContentMode == 1) {
                            enumC1276610jKF = EnumC1276610jKF.VOLUME_INDICATION_CONTENT_MODE_VOLUME_ONLY;
                        } else {
                            enumC1276610jKF = EnumC1276610jKF.VOLUME_INDICATION_CONTENT_MODE_FULL;
                        }
                        c1276600jKE.LIZLLL = enumC1276610jKF;
                    }
                    return livesdkMultiguestOptimizeLinkmicSeiSetting.enable(this.LL.LIZIZ);
                }

                /* JADX WARN: Removed duplicated region for block: B:148:0x02dc  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x0525  */
                @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.String mixStream(int r44, int r45, java.util.List<X.C1276580jKC> r46) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 1894
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2181371AYt.mixStream(int, int, java.util.List):java.lang.String");
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIIJ(java.lang.String r23, java.util.Map<java.lang.String, com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray> r24, int r25, X.C1276580jKC r26, android.graphics.RectF r27, X.InterfaceC969870bLV r28, float r29) {
                    /*
                        Method dump skipped, instruction units count: 417
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2181371AYt.LJIIJ(java.lang.String, java.util.Map, int, X.0jKC, android.graphics.RectF, X.0bLV, float):void");
                }

                {
                    this.LL = c2177031AIb;
                    this.LLILLJJLI = onLineMicInfo;
                    this.LLILLL = c968970bK3;
                    this.LLILZ = c1az3;
                    this.LLILZIL = c2181351AYr;
                    this.LLILZLL = c1az5;
                    this.LLIZ = c1az6;
                    this.LLIZLLLIL = c1az1;
                    this.LLJ = c2181331AYp;
                    this.LLJI = c2181311AYn;
                    this.LLJIJIL = c2181281AYk;
                    this.LLJILJIL = c2181341AYq;
                    this.LLJILJILJ = mapLJJLIIIJL;
                    this.LLJILLL = mapLJJLIIIIJ;
                    this.LLJJ = mapLJJL;
                    this.LLJJI = mapLJJLI;
                    this.LLJJIII = c2181321AYo;
                }
            };
        }
        c1axm2.LJLLLL().LJFF = new C2181291AYl(liveStreamMixerLJJLIL, c1axm2);
        return new LiveStreamMixer() { // from class: X.1AYs
            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
            public final InterfaceC969870bLV getPlayerInfoProvider() {
                return liveStreamMixerLJJLIL.getPlayerInfoProvider();
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
            public final boolean getEnableRoundCorner() {
                return super.getEnableRoundCorner();
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
            public final void setConfig(C1275030jHh c1275030jHh) {
                super.setConfig(c1275030jHh);
                liveStreamMixerLJJLIL.setConfig(c1275030jHh);
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
            public final void setEnableRoundCorner(boolean z) {
                liveStreamMixerLJJLIL.setEnableRoundCorner(z);
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
            public final void setPlayerInfoProvider(InterfaceC969870bLV interfaceC969870bLV) {
                liveStreamMixerLJJLIL.setPlayerInfoProvider(interfaceC969870bLV);
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
            public final boolean updateMixAudioVolumeIndication(C1276600jKE c1276600jKE) {
                return liveStreamMixerLJJLIL.updateMixAudioVolumeIndication(c1276600jKE);
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
            public final boolean updateMixSpatialAudio(C1276650jKJ c1276650jKJ, C1276630jKH c1276630jKH) {
                return liveStreamMixerLJJLIL.updateMixSpatialAudio(c1276650jKJ, c1276630jKH);
            }

            @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
            public final String mixStream(int i, int i2, List<C1276580jKC> list) {
                if (c1axm2.LJLLLL().LIZLLL().getFirst().intValue() != i || c1axm2.LJLLLL().LIZLLL().getSecond().intValue() != i2) {
                    C2181231AYf c2181231AYfLJLLLL = c1axm2.LJLLLL();
                    new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    c2181231AYfLJLLLL.getClass();
                }
                return liveStreamMixerLJJLIL.mixStream(i, i2, list);
            }
        };
    }
}
