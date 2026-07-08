package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;

/* JADX INFO: renamed from: X.0yRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857620yRM {
    public static final long LIZ(Message message) {
        if (message == null) {
            return 0L;
        }
        long j = message.LIZLLL;
        if (j <= 0) {
            j = message.serverTime;
        }
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() <= 0) {
            return 0L;
        }
        return lValueOf.longValue();
    }
}
