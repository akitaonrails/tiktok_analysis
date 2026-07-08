package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Calendar;
import java.util.Map;

/* JADX INFO: renamed from: X.0fHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120960fHC {
    public final C11NJ LIZ = new C11NJ();
    public DataChannel LIZIZ;
    public InterfaceC1121280fHi LIZJ;
    public boolean LIZLLL;

    public static boolean LIZ() {
        if (InterfaceC1094160eZy.b1.LIZIZ().booleanValue()) {
            return false;
        }
        Map<String, String> mapLIZIZ = InterfaceC1094160eZy.a1.LIZIZ();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String str = mapLIZIZ.get("time_slot");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        calendar2.setTimeInMillis(CastLongProtector.parseLong(str));
        boolean z = calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
        String str3 = mapLIZIZ.get("day_count");
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        int i = CastIntegerProtector.parseInt(str3);
        String str4 = mapLIZIZ.get("show_count");
        if (str4 != null) {
            str2 = str4;
        }
        int i2 = CastIntegerProtector.parseInt(str2);
        if (z) {
            if (i2 >= 1) {
                return false;
            }
        } else if (i >= 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        if (InterfaceC1094160eZy.b1.LIZIZ().booleanValue()) {
            return false;
        }
        Map<String, String> mapLIZIZ = InterfaceC1094160eZy.Z0.LIZIZ();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String str = mapLIZIZ.get("time_slot");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        calendar2.setTimeInMillis(CastLongProtector.parseLong(str));
        boolean z = calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6);
        String str3 = mapLIZIZ.get("day_count");
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        int i = CastIntegerProtector.parseInt(str3);
        String str4 = mapLIZIZ.get("show_count");
        if (str4 != null) {
            str2 = str4;
        }
        int i2 = CastIntegerProtector.parseInt(str2);
        if (z) {
            if (i2 >= 5) {
                return false;
            }
        } else if (i >= 3) {
            return false;
        }
        return true;
    }
}
