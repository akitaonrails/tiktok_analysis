package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.SparkLiteVHReuseBySchemaStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647970PbH {
    public static final C647970PbH LIZ = new C647970PbH();
    public static final SparkLiteVHReuseBySchemaStruct LIZIZ = new SparkLiteVHReuseBySchemaStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(226));

    public static final boolean LIZ() {
        LIZ.getClass();
        return ((SparkLiteVHReuseBySchemaStruct) LIZJ.getValue()).enable;
    }

    public static final boolean LIZIZ(String str) {
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        if (((SparkLiteVHReuseBySchemaStruct) c01gw.getValue()).enable) {
            List<String> list = ((SparkLiteVHReuseBySchemaStruct) c01gw.getValue()).lynxUpdateWhiteList;
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

    public static final boolean LIZJ(String str) {
        String strLJ = C649470Pdh.LJ(str);
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        if (((SparkLiteVHReuseBySchemaStruct) c01gw.getValue()).enable && !((SparkLiteVHReuseBySchemaStruct) c01gw.getValue()).blackList.contains(strLJ)) {
            return true;
        }
        return false;
    }
}
