package X;

import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ebB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094910ebB {
    public C1095010ebL LIZ;
    public int LIZIZ;

    public static int LIZ(DataChannel dataChannel) {
        C1095140ebY c1095140ebY;
        if (dataChannel != null && (c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class)) != null) {
            return c1095140ebY.LJ;
        }
        return 0;
    }
}
