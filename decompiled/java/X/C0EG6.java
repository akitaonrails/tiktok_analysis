package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.oh;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EG6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG6 implements C0E8Y, InterfaceC379610EuV {
    public final Function0<VideoPublishEditModel> LL;
    public final C1DRG LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1203));

    public static final void LIZLLL() {
        C0EU3.LIZ.getClass();
        C0E5N.LIZ();
    }

    @Override // X.C0E8Y
    public final void LIZ() {
        VideoPublishEditModel videoPublishEditModelInvoke = this.LL.invoke();
        if (videoPublishEditModelInvoke != null) {
            C20684815ws.LJIILLIIL("edit_black_screen_toast", C1402900mbw.LIZIZ(videoPublishEditModelInvoke).LIZ);
        }
    }

    @Override // X.C0E8Y
    public final void LIZIZ() {
        C0E48 c0e48;
        VideoPublishEditModel videoPublishEditModelInvoke = this.LL.invoke();
        if (videoPublishEditModelInvoke == null || (c0e48 = (C0E48) this.LLILLL.getValue()) == null) {
            return;
        }
        C361680EFy.LJJLIIIJJI(videoPublishEditModelInvoke, c0e48);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C0E8Y
    public final void LIZJ(C0E6I c0e6i) {
        C0EU3 c0eu3 = C0EU3.LIZ;
        C0E48 c0e48 = (C0E48) this.LLILLL.getValue();
        c0eu3.getClass();
        if (C0E5N.LIZ()) {
            if (c0e6i == C0E6I.DRAGGING) {
                C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
                new Pair(-1, -1);
                C860470XpF.LJIIIIZZ(c860330Xp1, "ep_main_track_manual_scroll_scene", -1L, C361680EFy.LJII(null, c0e48).LIZ, null, 8);
            }
            if (c0e6i == C0E6I.IDLE) {
                oh.LJ("ep_main_track_manual_scroll_scene");
            }
        }
    }

    public C0EG6(AwS549S0100000_5 awS549S0100000_5, C1DRG c1drg) {
        this.LL = awS549S0100000_5;
        this.LLILLJJLI = c1drg;
    }
}
