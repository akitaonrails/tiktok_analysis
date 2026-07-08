package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;

/* JADX INFO: renamed from: X.0bmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986890bmx extends C0W9W {
    public final int $t;
    public Object l0;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(C986890bmx c986890bmx) {
        C1C7U.LIZ("MultiGuestV3GuestPresenter@ae69.handlePermitMessage$1$1");
        boolean zLJ = C0W9U.LJ(c986890bmx.bpeaTraceContext);
        try {
            MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = (MultiGuestV3GuestPresenter) c986890bmx.l0;
            if (multiGuestV3GuestPresenter.isEnterBackground) {
                C1AZW.LJIIJ(12, multiGuestV3GuestPresenter.logTAG(3151), "linkmic in bg timeout, just leave", null, null);
                ((MultiGuestV3GuestPresenter) c986890bmx.l0).stopInteract("play_pip_window", false, true, 10015);
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("MultiGuestV3GuestPresenter@ae69.handlePermitMessage$1$1");
    }

    public static final void run$1(C986890bmx c986890bmx) {
        C1C7U.LIZ("VoiceChatWatchPresenter@8e7f.linkMicEventListener$1$handlePermitMessage$1$1");
        boolean zLJ = C0W9U.LJ(c986890bmx.bpeaTraceContext);
        try {
            C923650a8x c923650a8x = (C923650a8x) c986890bmx.l0;
            if (c923650a8x.LLILZ) {
                C1AZW.LJIIJ(12, c923650a8x.logTAG(1100), "linkmic in bg timeout, just leave", null, null);
                ((C923650a8x) c986890bmx.l0).stopInteract("play_pip_window", false, true, 10015);
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("VoiceChatWatchPresenter@8e7f.linkMicEventListener$1$handlePermitMessage$1$1");
    }

    public C986890bmx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
