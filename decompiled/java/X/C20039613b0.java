package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxAwemeToFEByNeededOptStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20039613b0 {
    public static final C20039613b0 LIZ = new C20039613b0();
    public static final LynxAwemeToFEByNeededOptStruct LIZIZ = new LynxAwemeToFEByNeededOptStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(88));

    public static final boolean LIZ(String str) {
        if (str != null) {
            LIZ.getClass();
            C01GW c01gw = LIZJ;
            if (((LynxAwemeToFEByNeededOptStruct) c01gw.getValue()).enable) {
                List<String> list = ((LynxAwemeToFEByNeededOptStruct) c01gw.getValue()).enableWhiteList;
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
            }
        }
        return false;
    }
}
