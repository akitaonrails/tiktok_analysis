package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083910eJR {
    public static final void LIZ(DataChannel dataChannel, int i) {
        int iIntValue;
        Integer num;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(C1083380eIa.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == i && dataChannel != null) {
            dataChannel.SX0(C1083380eIa.class, 0);
        }
    }

    public static final boolean LIZIZ(DataChannel dataChannel, int i) {
        int iIntValue;
        if (dataChannel == null) {
            return false;
        }
        Integer num = (Integer) dataChannel.gg0(C1083380eIa.class);
        if (num != null && (iIntValue = num.intValue()) != 0 && iIntValue != i) {
            return false;
        }
        dataChannel.SX0(C1083380eIa.class, Integer.valueOf(i));
        return true;
    }
}
