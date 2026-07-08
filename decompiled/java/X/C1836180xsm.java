package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0xsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836180xsm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LiveReplayVideoClipActivity LL;
    public final /* synthetic */ Pair<Long, Long> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836180xsm(LiveReplayVideoClipActivity liveReplayVideoClipActivity, Pair<Long, Long> pair, long j, long j2) {
        super(0);
        this.LL = liveReplayVideoClipActivity;
        this.LLILLJJLI = pair;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        ((LinkedHashMap) this.LL.LLJZIJLIL).clear();
        this.LL.LLJZIJLIL.put(this.LLILLJJLI, 0L);
        LiveReplayVideoClipActivity liveReplayVideoClipActivity = this.LL;
        if (liveReplayVideoClipActivity.LLJJJJJIL == null) {
            C1836170xsl c1836170xsl = C1836170xsl.LIZ;
            Float fValueOf = Float.valueOf(0.0f);
            DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(this.LL);
            DialogInterfaceOnCancelListenerC1864660yci dialogInterfaceOnCancelListenerC1864660yci = new DialogInterfaceOnCancelListenerC1864660yci(this.LL, this.LLILLJJLI, 0);
            c1836170xsl.getClass();
            C1836170xsl.LIZ(fValueOf, dialogC1390150mHN, dialogInterfaceOnCancelListenerC1864660yci);
            liveReplayVideoClipActivity.LLJJJJJIL = dialogC1390150mHN;
        }
        LiveReplayVideoClipActivity liveReplayVideoClipActivity2 = this.LL;
        liveReplayVideoClipActivity2.LLJL = true;
        DialogC1390150mHN dialogC1390150mHN2 = liveReplayVideoClipActivity2.LLJJJJJIL;
        if (dialogC1390150mHN2 != null) {
            dialogC1390150mHN2.LJJLL(0.0f, false);
        }
        DialogC1390150mHN dialogC1390150mHN3 = this.LL.LLJJJJJIL;
        if (dialogC1390150mHN3 != null) {
            C786410Ut5.K4(dialogC1390150mHN3);
        }
        this.LL.LLJJL.run();
        long j = this.LLILLL - this.LLILZ;
        C2344009Gk c2344009GkLLLLZLLIL = this.LL.LLLLZLLIL();
        c2344009GkLLLLZLLIL.LIZLLL(this.LLILZ, "start_time");
        c2344009GkLLLLZLLIL.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("livesdk_live_replay_clip_post_click", c2344009GkLLLLZLLIL.LIZ);
        this.LL.LLZ("post");
        LiveReplayVideoClipActivity liveReplayVideoClipActivity3 = this.LL;
        liveReplayVideoClipActivity3.LLLLZLL(this.LLILZ, this.LLILLL, 2, new AwS393S0200000_27(liveReplayVideoClipActivity3, (LiveReplayVideoClipActivity) this.LLILLJJLI, (Pair<Long, Long>) 34), new AwS393S0200000_27(this.LL, (LiveReplayVideoClipActivity) this.LLILLJJLI, (Pair<Long, Long>) 35));
        return Unit.LIZ;
    }
}
