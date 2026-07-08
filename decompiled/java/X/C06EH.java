package X;

import com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayCallbackData;

/* JADX INFO: renamed from: X.06EH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06EH {
    public final Long LIZ;
    public final RestoreDelayCallbackData LIZIZ;

    public C06EH() {
        this(null, null, 3);
    }

    public C06EH(Long l, RestoreDelayCallbackData restoreDelayCallbackData, int i) {
        l = (i & 1) != 0 ? null : l;
        restoreDelayCallbackData = (i & 2) != 0 ? null : restoreDelayCallbackData;
        this.LIZ = l;
        this.LIZIZ = restoreDelayCallbackData;
    }
}
