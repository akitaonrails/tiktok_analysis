package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0bHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967420bHY {
    public static final C967420bHY LIZ = new C967420bHY();
    public static final ConcurrentLinkedQueue<LinkUser> LIZIZ = new ConcurrentLinkedQueue<>();

    public static LinkUser LIZ() {
        if (C0IB2.LIZ()) {
            return new LinkUser.Builder().build();
        }
        LinkUser linkUserPoll = LIZIZ.poll();
        return linkUserPoll == null ? new LinkUser.Builder().build() : linkUserPoll;
    }
}
