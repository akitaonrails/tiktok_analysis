package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.01PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01PJ {
    public static final C01PK LIZ(long j, DataChannel dataChannel) {
        C01PK c01pk = (C01PK) dataChannel.gg0(C1083480eIk.class);
        if (c01pk == null) {
            c01pk = new C01PK(0L, 7);
        }
        if (c01pk.LIZ != j) {
            return new C01PK(j, 6);
        }
        return c01pk;
    }
}
