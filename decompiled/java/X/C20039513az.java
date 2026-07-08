package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxPreLayoutOnlyUseReadyCacheAbStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20039513az {
    public static final C20039513az LIZ = new C20039513az();
    public static final LynxPreLayoutOnlyUseReadyCacheAbStruct LIZIZ = new LynxPreLayoutOnlyUseReadyCacheAbStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(89));

    public static final boolean LIZ(String str) {
        LIZ.getClass();
        List<String> list = ((LynxPreLayoutOnlyUseReadyCacheAbStruct) LIZJ.getValue()).enableWhiteList;
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
