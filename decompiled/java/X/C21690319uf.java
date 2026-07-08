package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.ss.android.vesdk.runtime.VERuntime;

/* JADX INFO: renamed from: X.19uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21690319uf {
    public static EnumC1641600sow LIZ() {
        boolean[] zArr = new boolean[EnumC1641600sow.values().length];
        int iOrdinal = EnumC1641600sow.BLUETOOTH.ordinal();
        int iOrdinal2 = EnumC1641600sow.WIRED.ordinal();
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) C786410Ut5.H2(VERuntime.getInstance().getContext(), "audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                zArr[iOrdinal] = true;
            } else if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                zArr[iOrdinal2] = true;
            }
        }
        return zArr[iOrdinal2] ? EnumC1641600sow.WIRED : zArr[iOrdinal] ? EnumC1641600sow.BLUETOOTH : EnumC1641600sow.DEFAULT;
    }
}
