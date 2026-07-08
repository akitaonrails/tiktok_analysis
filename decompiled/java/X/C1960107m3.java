package X;

import android.util.Log;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: renamed from: X.07m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1960107m3 implements InterfaceC1521740phc {
    public static final boolean LIZ = Log.isLoggable("HBMonitorSDK_Logcat", 3);

    @Override // X.InterfaceC1521740phc
    public final void d(String str, String str2) {
        while (str2.length() > 3000) {
            if (!LIZ) {
                C1959907m1.LIZIZ(C1959907m1.LIZ("d"), str, str2.substring(0, LivePreCreateNextRoomPlayer.ENABLE));
            }
            str2 = str2.substring(LivePreCreateNextRoomPlayer.ENABLE);
        }
        if (!LIZ) {
            C1959907m1.LIZIZ(C1959907m1.LIZ("d"), str, str2);
        }
    }

    @Override // X.InterfaceC1521740phc
    public final void e(String str, String str2) {
        while (str2.length() > 3000) {
            if (!LIZ) {
                C1959907m1.LIZIZ(C1959907m1.LIZ("e"), str, str2.substring(0, LivePreCreateNextRoomPlayer.ENABLE));
            }
            str2 = str2.substring(LivePreCreateNextRoomPlayer.ENABLE);
        }
        if (!LIZ) {
            C1959907m1.LIZIZ(C1959907m1.LIZ("e"), str, str2);
        }
    }

    @Override // X.InterfaceC1521740phc
    public final void i(String str, String str2) {
        while (str2.length() > 3000) {
            if (!LIZ) {
                C1959907m1.LIZIZ(C1959907m1.LIZ("i"), str, str2.substring(0, LivePreCreateNextRoomPlayer.ENABLE));
            }
            str2 = str2.substring(LivePreCreateNextRoomPlayer.ENABLE);
        }
        if (!LIZ) {
            C1959907m1.LIZIZ(C1959907m1.LIZ("i"), str, str2);
        }
    }

    @Override // X.InterfaceC1521740phc
    public final void w(String str, String str2) {
        while (str2.length() > 3000) {
            if (!LIZ) {
                C1959907m1.LIZIZ(C1959907m1.LIZ("w"), str, str2.substring(0, LivePreCreateNextRoomPlayer.ENABLE));
            }
            str2 = str2.substring(LivePreCreateNextRoomPlayer.ENABLE);
        }
        if (!LIZ) {
            C1959907m1.LIZIZ(C1959907m1.LIZ("w"), str, str2);
        }
    }

    @Override // X.InterfaceC1521740phc
    public final void e(String str, String str2, Throwable th) {
        if (!LIZ) {
            C1959907m1.LIZIZ(C1959907m1.LIZ("e"), str, str2);
        }
    }
}
