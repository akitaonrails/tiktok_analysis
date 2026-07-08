package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxAwemeSerializationOptStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20039713b1 {
    public static final C20039713b1 LIZ = new C20039713b1();
    public static final LynxAwemeSerializationOptStruct LIZIZ = new LynxAwemeSerializationOptStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(87));

    public static boolean LIZ() {
        return ((LynxAwemeSerializationOptStruct) LIZJ.getValue()).enableJsonMapReader;
    }

    public static boolean LIZJ() {
        return ((LynxAwemeSerializationOptStruct) LIZJ.getValue()).enableForAll;
    }

    public static boolean LIZIZ(String str) {
        if (LIZJ()) {
            return true;
        }
        List<String> list = ((LynxAwemeSerializationOptStruct) LIZJ.getValue()).enableWhiteList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("/template.*\\.js");
                if (new Regex(C2188811AlT.LIZIZ(sbLIZ)).containsMatchIn(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
