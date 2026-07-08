package Y;

import X.AbstractC714940S2q;
import X.C0R5Q;
import X.C0R5W;
import X.C0S3T;
import X.C0S3V;
import X.C20092413jW;
import X.C714930S2p;
import X.C786410Ut5;
import X.InterfaceC1482530ogN;
import android.content.Context;
import android.os.Build;
import android.view.Surface;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS287S0200000_11 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS287S0200000_11 aObjectS287S0200000_11) {
        C0S3T c0s3t = (C0S3T) aObjectS287S0200000_11.l0;
        C0S3V c0s3v = (C0S3V) aObjectS287S0200000_11.l1;
        c0s3t.getClass();
        return c0s3v.LJFF().findViewById(R.id.u0j);
    }

    public static final Object invoke$1(AObjectS287S0200000_11 aObjectS287S0200000_11) {
        final C0S3V c0s3v = (C0S3V) aObjectS287S0200000_11.l0;
        final C0S3T c0s3t = (C0S3T) aObjectS287S0200000_11.l1;
        return new InterfaceC1482530ogN() { // from class: X.0S3X
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
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
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
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
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
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPause(String str) {
                C0S3W c0s3wLJIIIZ = c0s3v.LJIIIZ();
                if (c0s3wLJIIIZ != null) {
                    c0s3wLJIIIZ.LJ(C1DZD.PAUSE);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                c0s3v.getClass();
                c0s3v.LJIIIZ().setVisibility(0);
                C0S3W c0s3wLJIIIZ = c0s3v.LJIIIZ();
                if (c0s3wLJIIIZ != null) {
                    c0s3wLJIIIZ.LJ(C1DZD.VIDEO_CHANGE);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C0S3W c0s3wLJIIIZ;
                C0S3W c0s3wLJIIIZ2 = c0s3v.LJIIIZ();
                if (c0s3wLJIIIZ2 != null && !c0s3wLJIIIZ2.LIZJ() && (c0s3wLJIIIZ = c0s3v.LJIIIZ()) != null) {
                    c0s3wLJIIIZ.LJ(C1DZD.RESUME);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBufferedPercent(String str, long j, int i) {
                C0S3V c0s3v2 = c0s3v;
                long j2 = c0s3v2.LJIIJJI;
                if (j2 > 0) {
                    if (j > j2) {
                        j = j2;
                    }
                    C0S3W c0s3wLJIIIZ = c0s3v2.LJIIIZ();
                    if (c0s3wLJIIIZ != null) {
                        c0s3wLJIIIZ.setSecondaryProgress((int) j);
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
                C0S3V c0s3v2 = c0s3v;
                if (c0s3v2.LJIIJ) {
                    return;
                }
                long progress = 0;
                if (j >= 0) {
                    C0S3W c0s3wLJIIIZ = c0s3v2.LJIIIZ();
                    if (c0s3wLJIIIZ != null) {
                        progress = c0s3wLJIIIZ.getProgress();
                    }
                    if (j != progress && j <= j2) {
                        if (j2 - j >= 300) {
                            j2 = j;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            c0s3t.LIZ.getClass();
                        }
                        C0S3W c0s3wLJIIIZ2 = c0s3v.LJIIIZ();
                        if (c0s3wLJIIIZ2 != null) {
                            c0s3wLJIIIZ2.setProgress((int) j, false);
                        }
                        String str2 = c0s3v.LJIIIIZZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("progress update by player: ");
                        sbLIZ.append((int) j2);
                        C1481110oe5.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                C0S3W c0s3wLJIIIZ = c0s3v.LJIIIZ();
                if (c0s3wLJIIIZ != null) {
                    c0s3wLJIIIZ.setProgress(0, false);
                }
                C0S3W c0s3wLJIIIZ2 = c0s3v.LJIIIZ();
                if (c0s3wLJIIIZ2 != null) {
                    c0s3wLJIIIZ2.setSecondaryProgress(0);
                }
            }
        };
    }

    public static final Object invoke$2(AObjectS287S0200000_11 aObjectS287S0200000_11) {
        boolean z;
        boolean z2;
        String nickname;
        C0R5W c0r5w = (C0R5W) aObjectS287S0200000_11.l0;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) aObjectS287S0200000_11.l1;
        c0r5w.getClass();
        C0R5Q.LIZ = Boolean.TRUE;
        if (((Boolean) C0R5Q.LIZIZ.getValue()).booleanValue()) {
            VideoViewCell videoViewCell = c0r5w.LIZ;
            if (videoViewCell.M) {
                videoViewCell.Q = videoViewCell.a(R.id.y6, 2131823154, null);
                C20092413jW c20092413jW = c0r5w.LIZ.Q;
                if (c20092413jW != null) {
                    accessibilityNodeInfoCompat.addAction(c20092413jW);
                }
            } else {
                videoViewCell.R = videoViewCell.a(R.id.y5, 2131823153, null);
                C20092413jW c20092413jW2 = c0r5w.LIZ.R;
                if (c20092413jW2 != null) {
                    accessibilityNodeInfoCompat.addAction(c20092413jW2);
                }
            }
            VideoViewCell videoViewCell2 = c0r5w.LIZ;
            videoViewCell2.S = videoViewCell2.a(R.id.y4, 2131823156, null);
            C20092413jW c20092413jW3 = c0r5w.LIZ.S;
            if (c20092413jW3 != null) {
                accessibilityNodeInfoCompat.addAction(c20092413jW3);
            }
            VideoViewCell videoViewCell3 = c0r5w.LIZ;
            if (videoViewCell3.f0 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (videoViewCell3.Ak2() != null && c0r5w.LIZ.z.LJLJJL() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                VideoViewCell videoViewCell4 = c0r5w.LIZ;
                videoViewCell4.T = videoViewCell4.a(R.id.y7, 2131823157, null);
            }
            C20092413jW c20092413jW4 = c0r5w.LIZ.T;
            if (c20092413jW4 != null) {
                accessibilityNodeInfoCompat.addAction(c20092413jW4);
            }
            VideoViewCell videoViewCell5 = c0r5w.LIZ;
            videoViewCell5.U = videoViewCell5.a(R.id.y1, 2131823152, null);
            C20092413jW c20092413jW5 = c0r5w.LIZ.U;
            if (c20092413jW5 != null) {
                accessibilityNodeInfoCompat.addAction(c20092413jW5);
            }
            Aweme aweme = c0r5w.LIZ.LLJJ;
            if (aweme != null && !aweme.isLike()) {
                VideoViewCell videoViewCell6 = c0r5w.LIZ;
                videoViewCell6.W = videoViewCell6.a(R.id.y3, 2131823151, null);
                C20092413jW c20092413jW6 = c0r5w.LIZ.W;
                if (c20092413jW6 != null) {
                    accessibilityNodeInfoCompat.addAction(c20092413jW6);
                }
            }
            if (c0r5w.LIZ.j() != null && c0r5w.LIZ.j().rH0()) {
                if (c0r5w.LIZ.LLJJ.getAuthor() != null) {
                    nickname = c0r5w.LIZ.LLJJ.getAuthor().getNickname();
                } else {
                    nickname = "";
                }
                VideoViewCell videoViewCell7 = c0r5w.LIZ;
                String strW = videoViewCell7.w(2131823150);
                if (strW != null) {
                    if (nickname != null) {
                        strW = C786410Ut5.j4(strW, new Object[]{nickname});
                    }
                    videoViewCell7.V = null;
                    try {
                        videoViewCell7.V = new C20092413jW(R.id.y2, strW);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    C20092413jW c20092413jW7 = videoViewCell7.V;
                    if (c20092413jW7 != null) {
                        accessibilityNodeInfoCompat.addAction(c20092413jW7);
                    }
                }
            }
            VideoViewCell videoViewCell8 = c0r5w.LIZ;
            videoViewCell8.f361X = videoViewCell8.a(R.id.y0, 2131823149, String.valueOf(2));
            C20092413jW c20092413jW8 = c0r5w.LIZ.f361X;
            if (c20092413jW8 != null) {
                accessibilityNodeInfoCompat.addAction(c20092413jW8);
            }
            VideoViewCell videoViewCell9 = c0r5w.LIZ;
            videoViewCell9.f362Y = videoViewCell9.a(R.id.y8, 2131823155, String.valueOf(2));
            C20092413jW c20092413jW9 = c0r5w.LIZ.f362Y;
            if (c20092413jW9 != null) {
                accessibilityNodeInfoCompat.addAction(c20092413jW9);
            }
        }
        return null;
    }

    public static final Object invoke$3(AObjectS287S0200000_11 aObjectS287S0200000_11) {
        ((C714930S2p) aObjectS287S0200000_11.l0).LIZLLL((AbstractC714940S2q) aObjectS287S0200000_11.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS287S0200000_11 aObjectS287S0200000_11) {
        ((C714930S2p) aObjectS287S0200000_11.l0).LIZLLL((AbstractC714940S2q) aObjectS287S0200000_11.l1);
        return Unit.LIZ;
    }

    public AObjectS287S0200000_11(C0S3V c0s3v, C0S3T c0s3t, int i) {
        this.$t = i;
        if (i != 0) {
            this.l0 = c0s3v;
            this.l1 = c0s3t;
        } else {
            this.l0 = c0s3t;
            this.l1 = c0s3v;
        }
    }

    public AObjectS287S0200000_11(C0R5W c0r5w, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        this.$t = i;
        this.l0 = c0r5w;
        this.l1 = accessibilityNodeInfoCompat;
    }

    public AObjectS287S0200000_11(C714930S2p c714930S2p, AbstractC714940S2q abstractC714940S2q, Context context, int i) {
        this.$t = i;
        this.l0 = c714930S2p;
        this.l1 = abstractC714940S2q;
    }
}
