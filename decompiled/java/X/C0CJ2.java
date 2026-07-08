package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJ2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5171));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5170));

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    public static Keva LIZLLL() {
        return (Keva) LIZ.getValue();
    }

    public static Set LIZ() {
        return LIZLLL().getStringSet("cdn_file_url_namespace_set", new LinkedHashSet());
    }

    public static boolean LJ() {
        return LIZLLL().getBoolean("is_fetch_launch", true);
    }

    public static Set LIZIZ(String str) {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("$cdn_file_url_set");
        return kevaLIZLLL.getStringSet(C2188811AlT.LIZIZ(sbLIZ), new LinkedHashSet());
    }

    public static void LJFF(Set set) {
        LIZLLL().storeStringSet("cdn_file_url_namespace_set", set);
    }

    public static void LJI(String str) {
        LIZJ().storeString("fetch_config_by_group_original_json", str);
    }
}
