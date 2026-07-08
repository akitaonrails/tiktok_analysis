package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917610ZzD {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(String str, EnumC918970a1P enumC918970a1P) {
        if (!C930540aK4.LIZJ() && C920830a4P.LIZIZ != null && LIZ != 0) {
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            if (!Intrinsics.LJFF(str, "live_over") && !Intrinsics.LJFF(str, "manual_setting_switch") && !Intrinsics.LJFF(str, "connection_start")) {
                str = "others";
            }
            map.put("trigger", str);
            if (enumC918970a1P == null) {
                enumC918970a1P = C920830a4P.LIZIZ;
            }
            C920830a4P.LIZIZ = null;
            map.put("layout_setting", C917520Zz4.LJII(enumC918970a1P).getFirst());
            map.put("window_setting", C917520Zz4.LJII(enumC918970a1P).getSecond());
            map.put("duration", String.valueOf(System.currentTimeMillis() - LIZ));
            C0KX4.LIZ("livesdk_multilive_mode_watch_duration", map, null, true);
        }
    }

    public static void LIZIZ(String str, Integer num) {
        int i;
        if (C930540aK4.LIZJ()) {
            return;
        }
        EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
        if (enumC918970a1PLJIILIIL == null) {
            enumC918970a1PLJIILIIL = EnumC918970a1P.NORMAL;
        }
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        if ((enumC918970a1PLJIILIIL == EnumC918970a1P.FLOATING || enumC918970a1PLJIILIIL == EnumC918970a1P.GRID) && i < 1) {
            enumC918970a1PLJIILIIL = EnumC918970a1P.NORMAL;
        }
        EnumC918970a1P enumC918970a1P = C920830a4P.LIZIZ;
        if (enumC918970a1PLJIILIIL == enumC918970a1P) {
            return;
        }
        if (enumC918970a1P != null) {
            LIZ(str, enumC918970a1P);
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (C920830a4P.LIZIZ == null) {
            str = "live_play";
        }
        map.put("trigger", str);
        C920830a4P.LIZIZ = enumC918970a1PLJIILIIL;
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
        if (num != null) {
            map.put("guest_cnt", String.valueOf(num.intValue()));
        }
        C0KX4.LIZ("livesdk_multilive_mode_watch_start", map, null, true);
        LIZ = System.currentTimeMillis();
    }
}
