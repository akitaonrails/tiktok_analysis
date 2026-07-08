package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePausePrePullStreamExp;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ACF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LivePreviewPlayerWidget LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ACF(LivePreviewPlayerWidget livePreviewPlayerWidget, long j, long j2, int i, int i2, Object obj, long j3, long j4, long j5, long j6, long j7) {
        super(0);
        this.LL = livePreviewPlayerWidget;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = obj;
        this.LLIZ = j3;
        this.LLIZLLLIL = j4;
        this.LLJ = j5;
        this.LLJI = j6;
        this.LLJIJIL = j7;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [X.1ACK] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = this.LL.P1();
        if (feedLiveViewHolderVMP1 != null && feedLiveViewHolderVMP1.LLLFZ) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaZ1 = this.LL.z1();
            EnumC1488280ope enumC1488280ope = EnumC1488280ope.RUN_STRATEGY;
            long j = this.LLILLJJLI;
            long j2 = this.LLILLL;
            int i = this.LLILZ;
            int i2 = this.LLILZIL;
            String strValueOf = String.valueOf(this.LLILZLL);
            c1ac7.getClass();
            C1AC7.LJII(c1acaZ1, enumC1488280ope, j, j2, i, i2, strValueOf);
            this.LL.P1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pullWithSmartManager: pullDelay=");
            sbLIZ.append(this.LLIZ);
            sbLIZ.append(", pullTime=");
            sbLIZ.append(this.LLIZLLLIL);
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
            Pair[] pairArr = new Pair[5];
            C1ACA c1acaZ12 = this.LL.z1();
            pairArr[0] = new Pair("roomId", Long.valueOf((c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null) ? 0L : liveRoomStruct2.id));
            pairArr[1] = new Pair("pullTime", Long.valueOf(this.LLIZLLLIL));
            pairArr[2] = new Pair("delayTime", Long.valueOf(this.LLIZ));
            pairArr[3] = new Pair("totalTime", Long.valueOf(this.LLIZLLLIL + this.LLIZ));
            pairArr[4] = new Pair("mode", C1AD3.LIZ().enableEtaPulse ? "pulse" : "normal");
            C1AC7.LJIILL("preview_pull_schedule", pairArr);
            if (C1AD3.LIZ().enableEtaPulse) {
                C1ACA c1acaZ13 = this.LL.z1();
                long j3 = (c1acaZ13 == null || (liveRoomStruct = c1acaZ13.LIZJ) == null) ? 0L : liveRoomStruct.id;
                long j4 = this.LLJ;
                Number numberValueOf = j4 > 0 ? Long.valueOf(j4) : Integer.valueOf(C1AD3.LIZ().pulseMaxCount);
                long j5 = this.LLJI;
                if (j5 <= 0) {
                    j5 = C1AD3.LIZ().pulseIntervalMs;
                }
                long j6 = this.LLJIJIL;
                if (j6 <= 0) {
                    j6 = C1AD3.LIZ().pulseKeepMs;
                }
                final LivePreviewPlayerWidget livePreviewPlayerWidget = this.LL;
                long j7 = this.LLIZ;
                int iIntValue = numberValueOf.intValue();
                long j8 = this.LLIZLLLIL + this.LLIZ;
                livePreviewPlayerWidget.N1();
                C2175561ACk c2175561ACk = new C2175561ACk(j7, iIntValue, j6, j5, j8);
                C1AC7.LJIILL("pulse_schedule", new Pair("roomId", Long.valueOf(j3)), new Pair("totalTimeMs", Long.valueOf(j8)), new Pair("plusCount", Integer.valueOf(iIntValue)), new Pair("pulseDelayMs", Long.valueOf(j5)), new Pair("pulsePullMs", Long.valueOf(j6)));
                final long j9 = j3;
                final long j10 = j5;
                final long j11 = j6;
                C2175531ACh c2175531ACh = new C2175531ACh(c2175561ACk, new C1ADZ() { // from class: X.1ACK
                    @Override // X.C1ADZ
                    public final void LIZIZ(long j12) {
                        Integer numValueOf;
                        livePreviewPlayerWidget.z1();
                        C1AC7 c1ac72 = C1AC7.LIZ;
                        Pair[] pairArr2 = new Pair[3];
                        pairArr2[0] = new Pair("roomId", Long.valueOf(j9));
                        pairArr2[1] = new Pair("totalMs", Long.valueOf(j12));
                        C1ACA c1acaZ14 = livePreviewPlayerWidget.z1();
                        if (c1acaZ14 != null) {
                            numValueOf = Integer.valueOf(c1acaZ14.LLF);
                        } else {
                            numValueOf = null;
                        }
                        pairArr2[2] = new Pair("pulseCount", numValueOf);
                        c1ac72.getClass();
                        C1AC7.LJIILL("pulse_complete", pairArr2);
                    }

                    @Override // X.C1ADZ
                    public final void LIZ(int i3, long j12) {
                        Integer numValueOf;
                        int iLJIJJLI;
                        livePreviewPlayerWidget.z1();
                        C1ACA c1acaZ14 = livePreviewPlayerWidget.z1();
                        if (c1acaZ14 != null) {
                            LivePreviewPlayerVM livePreviewPlayerVMQ1 = livePreviewPlayerWidget.Q1();
                            if (livePreviewPlayerVMQ1 != null) {
                                iLJIJJLI = livePreviewPlayerVMQ1.LLJLLIL.LJIJJLI();
                            } else {
                                C1ACA c1acaZ15 = livePreviewPlayerWidget.z1();
                                if (c1acaZ15 != null) {
                                    iLJIJJLI = c1acaZ15.LLF;
                                } else {
                                    iLJIJJLI = 0;
                                }
                            }
                            c1acaZ14.LLF = iLJIJJLI;
                        }
                        if (C285940BIq.LIZ()) {
                            LivePreviewPlayerVM livePreviewPlayerVMQ12 = livePreviewPlayerWidget.Q1();
                            if (livePreviewPlayerVMQ12 != null) {
                                livePreviewPlayerVMQ12.IQ2();
                            }
                        } else if (LivePausePrePullStreamExp.INSTANCE.isEnable()) {
                            LivePreviewPlayerVM livePreviewPlayerVMQ13 = livePreviewPlayerWidget.Q1();
                            if (livePreviewPlayerVMQ13 != null) {
                                livePreviewPlayerVMQ13.LLJLLIL.LJJJIL();
                                livePreviewPlayerVMQ13.LLJJIII = false;
                            }
                        } else {
                            LivePreviewPlayerVM livePreviewPlayerVMQ14 = livePreviewPlayerWidget.Q1();
                            if (livePreviewPlayerVMQ14 != null) {
                                livePreviewPlayerVMQ14.LLJLLIL.LJJJJIZL();
                                livePreviewPlayerVMQ14.LLJJIII = false;
                            }
                        }
                        C1AC7 c1ac72 = C1AC7.LIZ;
                        long j13 = j9;
                        c1ac72.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(j13));
                        c2344009Gk.LJIIIIZZ("pulse_round", String.valueOf(i3));
                        c2344009Gk.LJIIIIZZ("round_pull_ms", String.valueOf(j12));
                        C20684815ws.LJIILLIIL("live_preview_eta_pulse_pause", c2344009Gk.LIZ);
                        Pair[] pairArr2 = new Pair[4];
                        pairArr2[0] = new Pair("roomId", Long.valueOf(j9));
                        pairArr2[1] = new Pair("round", Integer.valueOf(i3));
                        pairArr2[2] = new Pair("elapsedMs", Long.valueOf(j12));
                        C1ACA c1acaZ16 = livePreviewPlayerWidget.z1();
                        if (c1acaZ16 != null) {
                            numValueOf = Integer.valueOf(c1acaZ16.LLF);
                        } else {
                            numValueOf = null;
                        }
                        pairArr2[3] = new Pair("pulseCount", numValueOf);
                        C1AC7.LJIILL("pulse_pause", pairArr2);
                        new Pair("roomId", Long.valueOf(j9));
                        new Pair("round", Integer.valueOf(i3));
                        new Pair("elapsedMs", Long.valueOf(j12));
                        Map<String, Object> map = C1338270kvh.LIZ;
                    }

                    @Override // X.C1ADZ
                    public final void LIZJ(int i3, long j12) {
                        Integer numValueOf;
                        C1ACA c1acaZ14 = livePreviewPlayerWidget.z1();
                        if (c1acaZ14 != null) {
                            c1acaZ14.LLFF = true;
                        }
                        livePreviewPlayerWidget.z1();
                        C1ACA c1acaZ15 = livePreviewPlayerWidget.z1();
                        if (c1acaZ15 != null) {
                            c1acaZ15.LLF = i3 + 1;
                        }
                        livePreviewPlayerWidget.z1();
                        livePreviewPlayerWidget.V1(EnumC2175041AAk.PRE_PULL);
                        C1ACA c1acaZ16 = livePreviewPlayerWidget.z1();
                        if (c1acaZ16 != null) {
                            c1acaZ16.LJJLIIIJ = "eta_pulse";
                        }
                        LivePreviewPlayerVM livePreviewPlayerVMQ1 = livePreviewPlayerWidget.Q1();
                        if (livePreviewPlayerVMQ1 != null) {
                            livePreviewPlayerVMQ1.LLJLLIL.LJJJJ();
                        }
                        C1AC7 c1ac72 = C1AC7.LIZ;
                        long j13 = j9;
                        long j14 = j10;
                        long j15 = j11;
                        c1ac72.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(j13));
                        c2344009Gk.LJIIIIZZ("pulse_round", String.valueOf(i3));
                        c2344009Gk.LJIIIIZZ("delay_time_ms", String.valueOf(j14));
                        c2344009Gk.LJIIIIZZ("pull_time_ms", String.valueOf(j15));
                        C20684815ws.LJIILLIIL("live_preview_eta_pulse_trigger", c2344009Gk.LIZ);
                        Pair[] pairArr2 = new Pair[4];
                        pairArr2[0] = new Pair("roomId", Long.valueOf(j9));
                        pairArr2[1] = new Pair("round", Integer.valueOf(i3));
                        pairArr2[2] = new Pair("keepTimeMs", Long.valueOf(j12));
                        C1ACA c1acaZ17 = livePreviewPlayerWidget.z1();
                        if (c1acaZ17 != null) {
                            numValueOf = Integer.valueOf(c1acaZ17.LLF);
                        } else {
                            numValueOf = null;
                        }
                        pairArr2[3] = new Pair("pulseCount", numValueOf);
                        C1AC7.LJIILL("pulse_start", pairArr2);
                        new Pair("roomId", Long.valueOf(j9));
                        new Pair("round", Integer.valueOf(i3));
                        new Pair("keepTimeMs", Long.valueOf(j12));
                        Map<String, Object> map = C1338270kvh.LIZ;
                    }
                });
                if (!c2175531ACh.LJI.get()) {
                    c2175531ACh.LJ.set(EnumC1779790wPp.PENDING);
                    C786410Ut5.LJLIIL(j7, c2175531ACh.LIZJ, c2175531ACh.LJIIIZ);
                }
                livePreviewPlayerWidget.LLJLILLLLZIIL = c2175531ACh;
            } else {
                LivePreviewPlayerWidget.g2(this.LL, EnumC993870byD.FAST_FIXED, this.LLIZ, this.LLIZLLLIL);
            }
        } else {
            C1AC7 c1ac72 = C1AC7.LIZ;
            Pair[] pairArr2 = new Pair[2];
            C1ACA c1acaZ14 = this.LL.z1();
            pairArr2[0] = new Pair("roomId", Long.valueOf((c1acaZ14 == null || (liveRoomStruct3 = c1acaZ14.LIZJ) == null) ? 0L : liveRoomStruct3.id));
            pairArr2[1] = new Pair("reason", "parallel_pull_cancelled");
            c1ac72.getClass();
            C1AC7.LJIILL("preview_pull_fallback", pairArr2);
        }
        return Unit.LIZ;
    }
}
