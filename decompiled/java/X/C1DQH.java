package X;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS324S0000000_35;
import kotlin.jvm.internal.AwS357S0000000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1DQH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DQH {
    public static final C1053010dVb LIZ;
    public static final C1053010dVb LIZIZ;
    public static final C1053010dVb LIZJ;
    public static final C1053010dVb LIZLLL;
    public static final Map<String, String> LJ;

    static {
        C1053010dVb c1053010dVb = new C1053010dVb(C1044210dHP.class);
        LIZ = c1053010dVb;
        C1053010dVb c1053010dVb2 = new C1053010dVb(C1DQI.class);
        C1053010dVb c1053010dVb3 = new C1053010dVb(C1DQ5.class);
        LIZIZ = c1053010dVb3;
        C1053010dVb c1053010dVb4 = new C1053010dVb(C1DQL.class);
        LIZJ = c1053010dVb4;
        C1053010dVb c1053010dVb5 = new C1053010dVb(C1DQK.class);
        LIZLLL = c1053010dVb5;
        c1053010dVb.LIZLLL(Uri.class, new AwS324S0000000_35(6));
        c1053010dVb.LIZJ(Uri.Builder.class, new AwS357S0000000_35(7));
        c1053010dVb2.LIZLLL(Uri.class, new AwS324S0000000_35(7));
        c1053010dVb2.LIZJ(Uri.Builder.class, new AwS357S0000000_35(8));
        c1053010dVb3.LIZLLL(Uri.class, new AwS324S0000000_35(8));
        c1053010dVb3.LIZJ(Uri.Builder.class, new AwS357S0000000_35(9));
        c1053010dVb4.LIZLLL(Uri.class, new AwS324S0000000_35(9));
        c1053010dVb4.LIZJ(Uri.Builder.class, new AwS357S0000000_35(11));
        c1053010dVb5.LIZLLL(Uri.class, new AwS324S0000000_35(11));
        c1053010dVb5.LIZJ(Uri.Builder.class, new AwS357S0000000_35(6));
        c1053010dVb.LIZLLL(Map.class, new AwS324S0000000_35(1));
        c1053010dVb.LIZJ(Map.class, new AwS357S0000000_35(2));
        c1053010dVb2.LIZLLL(Map.class, new AwS324S0000000_35(2));
        c1053010dVb2.LIZJ(Map.class, new AwS357S0000000_35(3));
        c1053010dVb3.LIZLLL(Map.class, new AwS324S0000000_35(3));
        c1053010dVb3.LIZJ(Map.class, new AwS357S0000000_35(4));
        c1053010dVb4.LIZLLL(Map.class, new AwS324S0000000_35(4));
        c1053010dVb4.LIZJ(Map.class, new AwS357S0000000_35(5));
        c1053010dVb5.LIZLLL(Map.class, new AwS324S0000000_35(5));
        c1053010dVb5.LIZJ(Map.class, new AwS357S0000000_35(1));
        c1053010dVb.LIZLLL(Bundle.class, new AwS324S0000000_35(10));
        c1053010dVb.LIZJ(Bundle.class, new AwS357S0000000_35(12));
        c1053010dVb2.LIZLLL(Bundle.class, new AwS324S0000000_35(12));
        c1053010dVb2.LIZJ(Bundle.class, new AwS357S0000000_35(13));
        c1053010dVb3.LIZLLL(Bundle.class, new AwS324S0000000_35(13));
        c1053010dVb3.LIZJ(Bundle.class, new AwS357S0000000_35(14));
        c1053010dVb4.LIZLLL(Bundle.class, new AwS324S0000000_35(14));
        c1053010dVb4.LIZJ(Bundle.class, new AwS357S0000000_35(0));
        c1053010dVb5.LIZLLL(Bundle.class, new AwS324S0000000_35(0));
        c1053010dVb5.LIZJ(Bundle.class, new AwS357S0000000_35(10));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("white", "#FFFFFFFF");
        linkedHashMap.put("black", "#FF000000");
        linkedHashMap.put("transparent", "#00000000");
        LJ = linkedHashMap;
    }

    public static String LIZ(String str) {
        if (str.length() != 3) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FF");
        sbLIZ.append(str.charAt(0));
        sbLIZ.append(str.charAt(0));
        sbLIZ.append(str.charAt(1));
        sbLIZ.append(str.charAt(1));
        sbLIZ.append(str.charAt(2));
        sbLIZ.append(str.charAt(2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1044210dHP LIZIZ(String str) {
        Map<String, String> map;
        C1044210dHP c1044210dHP = new C1044210dHP(-2);
        try {
            map = LJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (((LinkedHashMap) map).keySet().contains(str)) {
            return new C1044210dHP(Color.parseColor((String) ((LinkedHashMap) map).get(str)));
        }
        if (u.LJJIIJZLJL(str, "#", false)) {
            str = C13LN.LJLJLJ(1, str);
        }
        int length = str.length();
        if (length != 3) {
            if (length != 6) {
                if (length == 8) {
                    if (str.length() == 8) {
                        str = Intrinsics.LJIIJJI(C13LN.LJLL(2, str), C13LN.LL(2, str));
                    }
                    return new C1044210dHP(Color.parseColor(Intrinsics.LJIIJJI(str, "#")));
                }
                return c1044210dHP;
            }
            return new C1044210dHP(Color.parseColor(Intrinsics.LJIIJJI(str, "#FF")));
        }
        return new C1044210dHP(Color.parseColor(Intrinsics.LJIIJJI(LIZ(str), "#")));
    }
}
