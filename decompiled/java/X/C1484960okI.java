package X;

import Y.ARunnableS91S0200000_22;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.PlayAddress;
import com.ss.android.ugc.effectmanager.effect.model.PreviewVideoInfo;
import com.ss.android.ugc.effectmanager.effect.model.VideoBitrate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS262S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.AwS672S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0okI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484960okI implements InterfaceC1425150nBp {
    public WeakReference<FrameLayout> LIZJ;
    public C1484970okJ LIZLLL;
    public float LJFF;
    public final C1485000okM LJIIIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(291));
    public final ConcurrentHashMap<C1484970okJ, Set<InterfaceC1485010okN>> LJ = new ConcurrentHashMap<>();
    public boolean LJI = true;
    public long LJII = -1;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 114));

    public final boolean LJIILLIIL() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue();
    }

    public final InterfaceC1484830ok5 LJIIZILJ() {
        return (InterfaceC1484830ok5) this.LJIIIIZZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0okM] */
    public C1484960okI() {
        final AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(this, 115);
        final AwS567S0100000_23 awS567S0100000_232 = new AwS567S0100000_23(this, 116);
        final AwS567S0100000_23 awS567S0100000_233 = new AwS567S0100000_23(this, 117);
        final AwS602S0100000_23 awS602S0100000_23 = new AwS602S0100000_23(this, 32);
        final AwS637S0100000_23 awS637S0100000_23 = new AwS637S0100000_23(this, 1);
        final AwS672S0100000_23 awS672S0100000_23 = new AwS672S0100000_23(this, 0);
        final AwS637S0100000_23 awS637S0100000_232 = new AwS637S0100000_23(this, 2);
        this.LJIIIZ = new InterfaceC1482530ogN(awS567S0100000_23, awS567S0100000_232, awS567S0100000_233, awS602S0100000_23, awS637S0100000_23, awS672S0100000_23, awS637S0100000_232) { // from class: X.0okM
            public final Function0<InterfaceC1484830ok5> LL;
            public final Function0<C1484970okJ> LLILLJJLI;
            public final Function0<Float> LLILLL;
            public final Function1<Float, Unit> LLILZ;
            public final Function2<String, Function1<? super InterfaceC1485010okN, Unit>, Unit> LLILZIL;
            public final InterfaceC1631620sYq<Integer, Integer, String, Unit> LLILZLL;
            public final Function2<Integer, Integer, Unit> LLIZ;

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Au(Surface surface) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void VK() {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void W1(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPause(String str) {
                this.LLILZIL.invoke(str, AFwS263S0000000_23.get$arr$(33));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                this.LLILZIL.invoke(str, new AwS262S0000000_23(i, 0));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                this.LLILZIL.invoke(str, AFwS263S0000000_23.get$arr$(35));
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
            @Override // X.InterfaceC1482530ogN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onRenderFirstFrame(java.lang.String r9, X.C1480420ocy r10) {
                /*
                    r8 = this;
                    kotlin.jvm.functions.Function0<java.lang.Float> r0 = r8.LLILLL
                    java.lang.Object r0 = r0.invoke()
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r6 = r0.floatValue()
                    X.0mUb r5 = X.C1398350mUb.LIZIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "onRenderFirstFrame: "
                    r1.append(r0)
                    r1.append(r9)
                    java.lang.String r0 = ", pendingSeekProgress="
                    r1.append(r0)
                    r1.append(r6)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r4 = "TemplatePreviewPlayer"
                    X.C201955140j.LIZLLL(r5, r4, r0)
                    r7 = 0
                    int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                    r3 = 0
                    if (r0 <= 0) goto L92
                    kotlin.jvm.functions.Function0<X.0okJ> r0 = r8.LLILLJJLI
                    java.lang.Object r0 = r0.invoke()
                    X.0okJ r0 = (X.C1484970okJ) r0
                    if (r0 == 0) goto L90
                    java.lang.String r0 = r0.LIZ
                L3d:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
                    if (r0 == 0) goto L92
                    r0 = 100
                    float r2 = (float) r0
                    float r2 = r2 * r6
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Seeking to "
                    r1.append(r0)
                    r1.append(r2)
                    java.lang.String r0 = "% (pendingSeekProgress="
                    r1.append(r0)
                    r1.append(r6)
                    r0 = 41
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C201955140j.LIZLLL(r5, r4, r0)
                    kotlin.jvm.functions.Function0<X.0ok5> r0 = r8.LL
                    java.lang.Object r0 = r0.invoke()
                    X.0ok5 r0 = (X.InterfaceC1484830ok5) r0
                    r0.seek(r2)
                    kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r1 = r8.LLILZ
                    java.lang.Float r0 = java.lang.Float.valueOf(r7)
                    r1.invoke(r0)
                L7b:
                    kotlin.jvm.functions.Function0<X.0okJ> r0 = r8.LLILLJJLI
                    java.lang.Object r0 = r0.invoke()
                    X.0okJ r0 = (X.C1484970okJ) r0
                    if (r0 == 0) goto L8e
                    java.lang.String r0 = r0.LIZ
                L87:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
                    if (r0 != 0) goto L9e
                    return
                L8e:
                    r0 = r3
                    goto L87
                L90:
                    r0 = r3
                    goto L3d
                L92:
                    kotlin.jvm.functions.Function2<java.lang.String, kotlin.jvm.functions.Function1<? super X.0okN, kotlin.Unit>, kotlin.Unit> r1 = r8.LLILZIL
                    r0 = 36
                    kotlin.jvm.internal.AFwS263S0000000_23 r0 = kotlin.jvm.internal.AFwS263S0000000_23.get$arr$(r0)
                    r1.invoke(r9, r0)
                    goto L7b
                L9e:
                    X.0sYq<java.lang.Integer, java.lang.Integer, java.lang.String, kotlin.Unit> r2 = r8.LLILZLL
                    r0 = 0
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r2.invoke(r1, r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1485000okM.onRenderFirstFrame(java.lang.String, X.0ocy):void");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onResumePlay: ");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZIL.invoke(str, AFwS263S0000000_23.get$arr$(37));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onSeekEnd(String str, boolean z) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSeekEnd: sourceId=");
                sbLIZ.append(str);
                sbLIZ.append(", success=");
                sbLIZ.append(z);
                C201955140j.LIZLLL(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    return;
                }
                this.LLILZIL.invoke(str, AFwS263S0000000_23.get$arr$(38));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                int i;
                this.LLILZIL.invoke(str, new AwS262S0000000_23(c1481290oeN, 1));
                InterfaceC1631620sYq<Integer, Integer, String, Unit> interfaceC1631620sYq = this.LLILZLL;
                if (c1481290oeN != null) {
                    i = c1481290oeN.LJ;
                } else {
                    i = 0;
                }
                interfaceC1631620sYq.invoke(1, Integer.valueOf(i), null);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                this.LLILZIL.invoke(str, AFwS263S0000000_23.get$arr$(34));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onVideoSizeChanged(String str, int i, int i2) {
                String str2;
                C1484970okJ c1484970okJInvoke = this.LLILLJJLI.invoke();
                if (c1484970okJInvoke != null) {
                    str2 = c1484970okJInvoke.LIZ;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str, str2)) {
                    return;
                }
                this.LLIZ.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }

            {
                this.LL = awS567S0100000_23;
                this.LLILLJJLI = awS567S0100000_232;
                this.LLILLL = awS567S0100000_233;
                this.LLILZ = awS602S0100000_23;
                this.LLILZIL = awS637S0100000_23;
                this.LLILZLL = awS672S0100000_23;
                this.LLIZ = awS637S0100000_232;
            }
        };
    }

    @Override // X.InterfaceC1425150nBp
    public final float LIZIZ() {
        if (!LJIILLIIL() || getDurationMs() <= 0) {
            return 0.0f;
        }
        return C13LZ.LIZLLL(LJIIL() / getDurationMs(), 0.0f, 1.0f);
    }

    @Override // X.InterfaceC1425150nBp
    public final void LIZJ() {
        if (LJIILLIIL()) {
            LJIIZILJ().setLoop(false);
        }
    }

    @Override // X.InterfaceC1425150nBp
    public final C1484970okJ LIZLLL() {
        if (LJIILLIIL()) {
            return this.LIZLLL;
        }
        return null;
    }

    @Override // X.InterfaceC1425150nBp
    public final String LJFF() {
        InterfaceC1483420oho interfaceC1483420ohoLJIIIZ;
        C1479510obV c1479510obVLIZJ;
        C1477160oXi c1477160oXi;
        C1478290oZX c1478290oZX;
        String str;
        return (!LJIILLIIL() || (interfaceC1483420ohoLJIIIZ = LJIIZILJ().LJIIIZ()) == null || (c1479510obVLIZJ = interfaceC1483420ohoLJIIIZ.LIZJ()) == null || (c1477160oXi = c1479510obVLIZJ.LJJIJIIJIL) == null || (c1478290oZX = c1477160oXi.LIZLLL) == null || (str = c1478290oZX.LIZIZ) == null) ? "" : str;
    }

    @Override // X.InterfaceC1425150nBp
    public final int LJIIIZ() {
        if (LJIILLIIL()) {
            return (int) LJIIZILJ().LJIIIZ().getBitrate();
        }
        return 0;
    }

    @Override // X.InterfaceC1425150nBp
    public final long LJIIL() {
        if (LJIILLIIL()) {
            return LJIIZILJ().LJIIIZ().getCurrentPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC1425150nBp
    public final long getDurationMs() {
        if (LJIILLIIL()) {
            return LJIIZILJ().LJIIIZ().getDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC1425150nBp
    public final boolean isPlaying() {
        if (LJIILLIIL()) {
            return LJIIZILJ().getPlayState().isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC1425150nBp
    public final void release() {
        if (LJIILLIIL()) {
            this.LIZLLL = null;
            WeakReference<FrameLayout> weakReference = this.LIZJ;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.LIZJ = null;
            this.LJ.clear();
            LJIIZILJ().release();
        }
    }

    public static C1482560ogQ LJIJJ(C1484970okJ c1484970okJ) {
        String str;
        PreviewVideoInfo preview_video;
        List<VideoBitrate> video_bitrate_list;
        int i;
        Object obj;
        UrlModel urlModelLIZIZ;
        String string;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Pair<Asset, InterfaceC1419170n2B> pair = c1484970okJ.LIZIZ;
        Asset first = pair.getFirst();
        InterfaceC1419170n2B second = pair.getSecond();
        C1425280nC2 c1425280nC2 = c1484970okJ.LIZJ;
        C1482580ogS c1482580ogS = new C1482580ogS();
        VideoUrlModel videoUrlModelLIZ = second.LIZ();
        if (videoUrlModelLIZ != null) {
            C1479570obb c1479570obb = new C1479570obb();
            c1479570obb.LJIILL = "creation";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create_tab");
            if (a0.LJJIIZI(c1425280nC2.LIZ, "template_tab", false)) {
                str = "_outer";
            } else if (a0.LJJIIZI(c1425280nC2.LIZ, "template_feed", false)) {
                str = "_inner";
            } else {
                str = "";
            }
            sbLIZ.append(str);
            c1479570obb.LJIILLIIL = C2188811AlT.LIZIZ(sbLIZ);
            if (((Number) C299150Bo1.LIZ.getValue()).intValue() != 0) {
                c1479570obb.LJJ = Intrinsics.LJFF(C1610140s0C.LIZ, Boolean.TRUE);
            }
            c1482580ogS.LJ = new C1482570ogR(c1479570obb);
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZJ = 0;
            c1058540deW.LJ = videoUrlModelLIZ.getSize();
            c1058540deW.LIZIZ = videoUrlModelLIZ.getUrlKey();
            C01GW c01gw = C0AYJ.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 3) {
                c1058540deW.LIZLLL = C13BV.INSTANCE;
            } else {
                List<String> urlList = videoUrlModelLIZ.getUrlList();
                if (urlList == null) {
                    urlList = C13BV.INSTANCE;
                }
                c1058540deW.LIZLLL = urlList;
            }
            c1058540deW.LIZ();
            if (((Number) c01gw.getValue()).intValue() != 4 && ((Number) c01gw.getValue()).intValue() != 0 && (preview_video = first.getBusiness_extra().getPreview_video()) != null && (video_bitrate_list = preview_video.getVideo_bitrate_list()) != null) {
                ArrayList<BitRate> arrayList = new ArrayList();
                for (VideoBitrate videoBitrate : video_bitrate_list) {
                    try {
                        BitRate bitRate = new BitRate();
                        Integer bit_rate = videoBitrate.getBit_rate();
                        if (bit_rate != null) {
                            bitRate.setBitRate(bit_rate.intValue());
                        }
                        Integer numIs_bytevc1 = videoBitrate.is_bytevc1();
                        if (numIs_bytevc1 != null) {
                            bitRate.setBytevc1(numIs_bytevc1.intValue());
                        }
                        bitRate.setGearName(videoBitrate.getGear_name());
                        Integer quality_type = videoBitrate.getQuality_type();
                        if (quality_type != null) {
                            bitRate.setQualityType(quality_type.intValue());
                        }
                        PlayAddress play_addr = videoBitrate.getPlay_addr();
                        if (play_addr != null) {
                            urlModelLIZIZ = C1419160n2A.LIZIZ(play_addr);
                        } else {
                            urlModelLIZIZ = null;
                        }
                        bitRate.setPlayAddr(urlModelLIZIZ);
                        String hDR_type = videoBitrate.getHDR_type();
                        if (hDR_type != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(hDR_type)) != null) {
                            bitRate.setHdrType(numLJIIJJI2.intValue());
                        }
                        String hDT_bit = videoBitrate.getHDT_bit();
                        if (hDT_bit != null && (numLJIIJJI = C2095008Iq.LJIIJJI(hDT_bit)) != null) {
                            bitRate.setHdrBit(numLJIIJJI.intValue());
                        }
                        bitRate.videoExtra = videoBitrate.getVideo_extra();
                        bitRate.format = videoBitrate.getFormat();
                        Integer fps = videoBitrate.getFps();
                        if (fps != null) {
                            string = fps.toString();
                        } else {
                            string = null;
                        }
                        bitRate.fps = string;
                        bitRate.setFidProfileLabels(videoBitrate.getFid_profile_labels());
                        C189200o6.m2constructorimpl(bitRate);
                        obj = bitRate;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        obj = c098200Yq;
                    }
                    if (!C189200o6.m7isFailureimpl(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (BitRate bitRate2 : arrayList) {
                        C1058540deW c1058540deW2 = new C1058540deW(c1482580ogS);
                        if (bitRate2.isBytevc1() == 1) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c1058540deW2.LIZJ = i;
                        c1058540deW2.LJ = bitRate2.getSize();
                        c1058540deW2.LIZIZ = bitRate2.getUrlKey();
                        c1058540deW2.LIZLLL = bitRate2.urlList();
                        C1484750ojx c1484750ojx = new C1484750ojx(c1058540deW2);
                        c1484750ojx.LIZ = bitRate2.getBitRate();
                        c1484750ojx.LIZIZ = bitRate2.getGearName();
                        c1484750ojx.LIZJ = bitRate2.getQualityType();
                        c1058540deW2.LJI = c1484750ojx;
                        c1058540deW2.LIZ();
                    }
                }
            }
        }
        c1482580ogS.LIZ = c1484970okJ.LIZ;
        return new C1484680ojq(c1482580ogS).LIZ();
    }

    @Override // X.InterfaceC1425150nBp
    public final void LIZ(boolean z) {
        if (!LJIILLIIL()) {
            return;
        }
        if (z) {
            LJIIZILJ().LJIILIIL().mute();
        } else {
            LJIIZILJ().LJIILIIL().unmute();
        }
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJ(C1484970okJ c1484970okJ) {
        if (!LJIILL(C1484970okJ.LIZ(c1484970okJ, new C1484990okL("pause")))) {
            return;
        }
        LJIIZILJ().pause();
        LJIJ(2, 0, null);
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJIIIIZZ(C1484970okJ c1484970okJ) {
        if (!LJIILLIIL() || !Intrinsics.LJFF(c1484970okJ, LIZLLL())) {
            return;
        }
        LJIIZILJ().pause();
        this.LIZLLL = C1484970okJ.LIZ(c1484970okJ, new C1484990okL("pause"));
        LJIJ(2, 0, null);
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJIIJJI(C1484970okJ c1484970okJ) {
        if (!LJIILL(C1484970okJ.LIZ(c1484970okJ, new C1484990okL("stop")))) {
            return;
        }
        this.LIZLLL = null;
        WeakReference<FrameLayout> weakReference = this.LIZJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LIZJ = null;
        LJIIZILJ().stop();
        LJIJ(2, 0, null);
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJIILIIL(C1484970okJ c1484970okJ) {
        if (!LJIILLIIL()) {
            return;
        }
        LJIIZILJ().LJJJIL(LJIJJ(c1484970okJ));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean LJIILL(C1484970okJ c1484970okJ) {
        String str;
        C1484990okL c1484990okL;
        if (!LJIILLIIL()) {
            return false;
        }
        C1484970okJ c1484970okJ2 = this.LIZLLL;
        C1484990okL c1484990okL2 = c1484970okJ.LJFF;
        String str2 = null;
        if (c1484990okL2 != null) {
            str = c1484990okL2.LIZ;
        } else {
            str = null;
        }
        if (c1484970okJ2 != null && (c1484990okL = c1484970okJ2.LJFF) != null) {
            str2 = c1484990okL.LIZ;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[isMainThread: ");
        sbLIZ.append(C0IB2.LIZ());
        sbLIZ.append("]checkStatus: thisSourceId=");
        sbLIZ.append(c1484970okJ.LIZ);
        sbLIZ.append(" thisPosition=");
        sbLIZ.append(c1484970okJ.LIZLLL);
        sbLIZ.append(" operation=");
        sbLIZ.append(str);
        sbLIZ.append(" sceneTag=");
        sbLIZ.append(c1484970okJ.LIZJ.LIZ);
        sbLIZ.append(" isSourceSame=");
        sbLIZ.append(Intrinsics.LJFF(c1484970okJ, c1484970okJ2));
        sbLIZ.append(" isPlaying=");
        sbLIZ.append(LJIIZILJ().getPlayState().isPlaying());
        sbLIZ.append(" isPaused=");
        sbLIZ.append(LJIIZILJ().getPlayState().isPaused());
        sbLIZ.append(" isStopped=");
        sbLIZ.append(LJIIZILJ().getPlayState().LJJIJIIJIL());
        C201955140j.LIZLLL(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(c1484970okJ2, c1484970okJ)) {
            if (str != null) {
                if ((r5 = str.hashCode()) != -934426579) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkStatus: false 0 - invalid '");
                    sbLIZ2.append(str);
                    sbLIZ2.append("' for non-current request");
                    C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    return false;
                }
            }
            if (Intrinsics.LJFF(str, "play") && LJIIZILJ().getPlayState().isPlaying()) {
                LJIIJJI(c1484970okJ);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkStatus: true 1 - valid new request '");
            sbLIZ3.append(str);
            sbLIZ3.append('\'');
            C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZLLL = c1484970okJ;
            return true;
        }
        if (Intrinsics.LJFF(str, str2)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("checkStatus: false 2 - repeated request '");
            sbLIZ4.append(str);
            sbLIZ4.append('\'');
            C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ4));
            return false;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume") && LJIIZILJ().getPlayState().isPlaying()) {
                        C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", "checkStatus: false 5 - 'resume' while playing");
                        return false;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        if (LJIIZILJ().getPlayState().isPlaying()) {
                            C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", "checkStatus: false 3 - 'play' while playing");
                            return false;
                        }
                        if (LJIIZILJ().getPlayState().isPaused()) {
                            LJIJI(c1484970okJ);
                            C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", "checkStatus: false 4 - 'play' while paused, continue with 'resume'");
                            return false;
                        }
                    }
                    break;
                case 3540994:
                    if (str.equals("stop") && LJIIZILJ().getPlayState().LJJIJIIJIL()) {
                        C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", "checkStatus: false 7 - 'stop' while stopped");
                        return false;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause") && !LJIIZILJ().getPlayState().isPlaying()) {
                        C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", "checkStatus: false 6 - 'pause' while not playing");
                        return false;
                    }
                    break;
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("checkStatus: true 8 - valid request '");
        sbLIZ5.append(str);
        sbLIZ5.append('\'');
        C201955140j.LJIIIIZZ(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ5));
        this.LIZLLL = c1484970okJ;
        return true;
    }

    public final void LJIJI(C1484970okJ c1484970okJ) {
        if (!LJIILLIIL() || !LJIILL(C1484970okJ.LIZ(c1484970okJ, new C1484990okL("resume")))) {
            return;
        }
        LJIIZILJ().resume();
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJII(C1484970okJ c1484970okJ, InterfaceC1485010okN interfaceC1485010okN) {
        Set<InterfaceC1485010okN> set = this.LJ.get(c1484970okJ);
        if (set != null) {
            set.remove(interfaceC1485010okN);
        }
    }

    @Override // X.InterfaceC1425150nBp
    @InterfaceC1294060jmO
    public final Bitmap LJIIJ(FrameLayout frameLayout, Pair<Integer, Integer> pair) {
        TextureView textureView;
        Bitmap bitmap;
        int width;
        int height;
        int height2;
        if (!LJIILLIIL()) {
            return null;
        }
        int width2 = 0;
        View childAt = frameLayout.getChildAt(0);
        if (childAt instanceof TextureView) {
            textureView = (TextureView) childAt;
        } else {
            textureView = null;
        }
        if (textureView == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (textureView.isAvailable()) {
            bitmap = textureView.getBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        float fIntValue = pair.getFirst().intValue() / pair.getSecond().intValue();
        if (bitmap.getWidth() / bitmap.getHeight() > fIntValue) {
            height = bitmap.getHeight();
            width = (int) (height * fIntValue);
            width2 = (bitmap.getWidth() - width) / 2;
            height2 = 0;
        } else {
            width = bitmap.getWidth();
            height = (int) (width / fIntValue);
            height2 = (bitmap.getHeight() - height) / 2;
        }
        return Bitmap.createBitmap(bitmap, width2, height2, width, height);
    }

    public final void LJIJJLI(String str, Function1<? super InterfaceC1485010okN, Unit> function1) {
        if (str == null) {
            return;
        }
        for (Map.Entry<C1484970okJ, Set<InterfaceC1485010okN>> entry : this.LJ.entrySet()) {
            C1484970okJ key = entry.getKey();
            Set<InterfaceC1485010okN> value = entry.getValue();
            if (Intrinsics.LJFF(key.LIZ, str)) {
                Iterator it2 = C13LP.LLIIII(value).iterator();
                while (it2.hasNext()) {
                    function1.invoke(it2.next());
                }
            }
        }
    }

    public final void LJIJ(int i, int i2, String str) {
        if (LJIILLIIL() && !this.LJI && this.LJII > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJII;
            this.LJII = -1L;
            int i3 = 1;
            this.LJI = true;
            C1484970okJ c1484970okJ = this.LIZLLL;
            if (c1484970okJ == null) {
                return;
            }
            InterfaceC1419170n2B second = c1484970okJ.LIZIZ.getSecond();
            String strLIZIZ = LJIIZILJ().LJIIIZ().LIZIZ();
            int i4 = c1484970okJ.LIZLLL;
            if (!a0.LJJIIZI(c1484970okJ.LIZJ.LIZ, "template_tab", false) && a0.LJJIIZI(c1484970okJ.LIZJ.LIZ, "template_feed", false)) {
                i3 = 2;
            }
            C1419580n2q.LJI(i, second, jCurrentTimeMillis, i2, str, strLIZIZ, i3, false, i4);
        }
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJI(C1484970okJ c1484970okJ, final FrameLayout frameLayout, float f, InterfaceC1485010okN interfaceC1485010okN) {
        String str;
        Object next;
        Set<InterfaceC1485010okN> setPutIfAbsent;
        String str2;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play: sourceId=");
        sbLIZ.append(c1484970okJ.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(f);
        sbLIZ.append(", currentSourceId=");
        C1484970okJ c1484970okJ2 = this.LIZLLL;
        TextureView textureView = null;
        if (c1484970okJ2 != null) {
            str = c1484970okJ2.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(isPlaying());
        C201955140j.LIZLLL(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
        if (f > 0.0f) {
            C1484970okJ c1484970okJ3 = this.LIZLLL;
            if (c1484970okJ3 != null) {
                str2 = c1484970okJ3.LIZ;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, c1484970okJ.LIZ) && LJIIZILJ().getPlayState().isPlaying()) {
                LJIIZILJ().seek(100 * f);
                return;
            }
        }
        if (!LJIILL(C1484970okJ.LIZ(c1484970okJ, new C1484990okL("play")))) {
            return;
        }
        if (interfaceC1485010okN != null) {
            this.LJ.clear();
            ConcurrentHashMap<C1484970okJ, Set<InterfaceC1485010okN>> concurrentHashMap = this.LJ;
            Set<InterfaceC1485010okN> linkedHashSet = concurrentHashMap.get(c1484970okJ);
            if (linkedHashSet == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(c1484970okJ, (linkedHashSet = new LinkedHashSet<>()))) != null) {
                linkedHashSet = setPutIfAbsent;
            }
            linkedHashSet.add(interfaceC1485010okN);
        }
        if (f > 0.0f) {
            this.LJFF = f;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Set pendingSeekProgress=");
            sbLIZ2.append(f);
            sbLIZ2.append(" for new play, sourceId=");
            sbLIZ2.append(c1484970okJ.LIZ);
            C201955140j.LIZLLL(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        }
        InterfaceC1484830ok5 interfaceC1484830ok5LJIIZILJ = LJIIZILJ();
        C337180DJs.LIZJ(frameLayout);
        interfaceC1484830ok5LJIIZILJ.LIZJ(new InterfaceC1483820oiS() { // from class: X.0okK
            @Override // X.InterfaceC1483820oiS
            public final boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void hj() {
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return frameLayout;
            }
        });
        this.LIZJ = new WeakReference<>(frameLayout);
        Iterator<View> it2 = new C09RD(frameLayout).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                next = c09re.next();
                if (next instanceof TextureView) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof TextureView) {
            textureView = (TextureView) next;
        }
        LJIJJLI(c1484970okJ.LIZ, new AwS602S0100000_23(textureView, 33));
        if (!C299140Bo0.LIZ() && textureView != null) {
            HandlerHook.viewPost(textureView, new ARunnableS91S0200000_22(textureView, c1484970okJ, 28));
        }
        if (LJIILLIIL()) {
            this.LJI = false;
            this.LJII = System.currentTimeMillis();
        }
        LJIIZILJ().LJ(LJIJJ(c1484970okJ));
    }

    @Override // X.InterfaceC1425150nBp
    public final void LJIILJJIL(C1484970okJ c1484970okJ, FrameLayout frameLayout, float f, InterfaceC1485010okN interfaceC1485010okN) {
        if (!LJIILLIIL()) {
            return;
        }
        if (Intrinsics.LJFF(LIZLLL(), c1484970okJ) && LJIIZILJ().getPlayState().isPaused()) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resumeOrPlay: resume ");
            sbLIZ.append(c1484970okJ.LIZ);
            sbLIZ.append('-');
            sbLIZ.append(c1484970okJ.LIZJ.LIZ);
            sbLIZ.append('-');
            sbLIZ.append(c1484970okJ.LIZLLL);
            C201955140j.LIZLLL(c1398350mUb, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
            LJIJI(c1484970okJ);
            return;
        }
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resumeOrPlay: play ");
        sbLIZ2.append(c1484970okJ.LIZ);
        sbLIZ2.append('-');
        sbLIZ2.append(c1484970okJ.LIZJ.LIZ);
        sbLIZ2.append('-');
        sbLIZ2.append(c1484970okJ.LIZLLL);
        C201955140j.LIZLLL(c1398350mUb2, "TemplatePreviewPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        LJI(c1484970okJ, frameLayout, f, interfaceC1485010okN);
    }
}
