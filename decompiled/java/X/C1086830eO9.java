package X;

import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0eO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086830eO9 {
    public static EnumC1086920eOI LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static PollMessage LJFF;

    public static boolean LIZJ() {
        return LIZ == EnumC1086920eOI.GIFT && C1086800eO6.LIZJ;
    }

    public static boolean LIZLLL() {
        return LIZ == EnumC1086920eOI.NORMAL && C1086800eO6.LIZJ;
    }

    public static boolean LIZIZ(String str) {
        if (str.length() != 1) {
            return false;
        }
        return Character.isDigit(str.charAt(0));
    }

    public static PollData LIZ(DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI) {
        HashMap map;
        if (dataChannel == null || (map = (HashMap) dataChannel.gg0(C780320UjG.class)) == null) {
            return null;
        }
        return (PollData) map.get(Integer.valueOf(enumC1086920eOI.ordinal()));
    }
}
