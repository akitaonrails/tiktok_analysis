package X;

import Y.ARunnableS107S0100000_7;
import android.os.SystemClock;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0IIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464200IIg {
    public static final Object LIZ = new Object();

    public static void LIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        C786410Ut5.LJLIIIL(C473410IhP.LIZ(), new ARunnableS107S0100000_7(dataChannel, 274), LIZ, SystemClock.uptimeMillis() + 3000);
    }
}
