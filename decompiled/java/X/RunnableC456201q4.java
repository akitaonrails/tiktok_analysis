package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01q4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC456201q4 implements Runnable {
    public static final RunnableC456201q4 LL = new RunnableC456201q4();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C0IR5 c0ir5;
        C1C7U.LIZ("LiveBoardsEffectHelper@31ba.runnable$1");
        try {
            DataChannel dataChannel = C456101q3.LIZIZ;
            if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null) {
                C20441214yg.LIZIZ("LiveBoardsEffectHelper", "reset isAiSummaryBoardShow");
                c0ir5.LJIIZILJ = null;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBoardsEffectHelper@31ba.runnable$1");
    }
}
