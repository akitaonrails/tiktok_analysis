package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: X.10eS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19296610eS implements C10FJ, C10F0 {
    public static final C19296610eS LL = new C19296610eS();
    public static final Queue<String> LLILLJJLI = new ArrayBlockingQueue(10);
    public static final C01GW LLILLL;

    @Override // X.C10FJ
    public final void onFailed(Exception exc) {
    }

    static {
        C1697810uHb.LJ("digg_push", "comment_push", "follow_push", "mention_push", "im_push");
        LLILLL = C452501pT.LIZIZ(new C19296510eR());
    }

    @Override // X.C10F0
    public final void A() {
        Queue<String> queue = LLILLJJLI;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        ((ArrayBlockingQueue) queue).poll();
    }

    @Override // X.C10F0
    public final void rY() {
        Queue<String> queue = LLILLJJLI;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        ((ArrayBlockingQueue) queue).poll();
    }

    @Override // X.C10F0
    public final void t00(int i) {
        rY();
    }

    @Override // X.C10FJ
    public final void Hl(PushSettings pushSettings) {
    }
}
