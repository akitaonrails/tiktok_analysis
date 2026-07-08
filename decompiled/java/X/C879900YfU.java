package X;

import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0YfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879900YfU {
    public static long LIZ(C0Y8T c0y8t, LastMessageProperty lastMessageProperty, C879910YfV c879910YfV) {
        long createdAt;
        C0Z2V.LIZ.getClass();
        long jLIZ = C0YU9.LIZ(lastMessageProperty);
        C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
        long j = 0;
        if (lastShowMessage != null) {
            createdAt = lastShowMessage.getCreatedAt();
        } else {
            createdAt = 0;
        }
        if (jLIZ < createdAt) {
            jLIZ = createdAt;
        }
        if (jLIZ < 10000000000L) {
            jLIZ *= (long) LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (c879910YfV != null) {
            j = c879910YfV.LIZ;
        }
        if (jLIZ < j) {
            return j;
        }
        return jLIZ;
    }
}
