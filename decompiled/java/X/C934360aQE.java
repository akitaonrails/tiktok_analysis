package X;

import com.bytedance.android.live.room.MultiGuestToolbarEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicToolbarEventSetting;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934360aQE {
    public static final <T extends Channel<Integer>> boolean LIZIZ(DataChannel dataChannel, Class<T> cls) {
        Integer num;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(cls)) != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static final <T extends Channel<Integer>> void LIZ(DataChannel dataChannel, Class<T> cls, int i, Function0<Boolean> function0) {
        Integer num;
        int i2;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(cls)) != null) {
            int iIntValue = num.intValue();
            if (function0.invoke().booleanValue()) {
                i2 = i | iIntValue;
            } else {
                i2 = (~i) & iIntValue;
            }
            dataChannel.zW(cls, Integer.valueOf(i2));
        }
    }

    public static final <T extends Channel<Integer>> void LIZJ(DataChannel dataChannel, Class<T> cls, int i, boolean z) {
        Integer num;
        int i2;
        int i3;
        Integer num2;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(cls)) != null) {
            int iIntValue = num.intValue();
            if (z) {
                i2 = i | iIntValue;
            } else {
                i2 = (~i) & iIntValue;
            }
            dataChannel.zW(cls, Integer.valueOf(i2));
            if (i2 == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (LinkMicToolbarEventSetting.INSTANCE.enable() && (num2 = (Integer) dataChannel.gg0(MultiGuestToolbarEvent.class)) != null && num2.intValue() == -1) {
                dataChannel.zW(MultiGuestToolbarEvent.class, Integer.valueOf(i3));
            }
        }
    }
}
