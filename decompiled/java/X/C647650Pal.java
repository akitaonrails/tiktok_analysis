package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxPreLayoutWhenChunkReadyStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Pal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647650Pal {
    public static final C647650Pal LIZ = new C647650Pal();
    public static final LynxPreLayoutWhenChunkReadyStruct LIZIZ = new LynxPreLayoutWhenChunkReadyStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(216));

    public static final boolean LIZ(String str) {
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        if (((LynxPreLayoutWhenChunkReadyStruct) c01gw.getValue()).enable) {
            List<String> list = ((LynxPreLayoutWhenChunkReadyStruct) c01gw.getValue()).enableWhiteList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("/template.js");
                    if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
