package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0K4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511630K4r {
    public static boolean LIZLLL(InterfaceC511460K4a interfaceC511460K4a, Context context, Map map) {
        return interfaceC511460K4a.LIZ(context, UriProtector.parse("sslocal://webcast_subscribe/settings").buildUpon().appendQueryParameter("enter_from", "native_privilege_page").build(), map);
    }

    public static boolean LIZJ(InterfaceC511460K4a interfaceC511460K4a, Context context, long j, Map map) {
        if (j <= 0) {
            return false;
        }
        return interfaceC511460K4a.LIZ(context, UriProtector.parse("sslocal://live").buildUpon().appendQueryParameter("room_id", String.valueOf(j)).appendQueryParameter("enter_from_merge", "sub_privilege_page").appendQueryParameter("enter_method", "subscribe_btn").build(), map);
    }
}
