package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: X.0Uyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C789880Uyg {
    public static ComponentName LIZIZ(Context context, Intent intent) {
        return C2204961BRm.LJJJJL(context, intent, new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OUpTd+iHazBjRtbZlh0=", new String[]{"01789"}));
    }

    public static Intent LIZ(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        if ((i & 4) != 0 && str == null) {
            return C786410Ut5.LJIL(context, broadcastReceiver, intentFilter, C838410Wul.LJ(context), handler);
        }
        return C786410Ut5.LJJ(context, broadcastReceiver, intentFilter, str, handler, i & 1);
    }
}
