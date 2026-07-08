package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.LynxPreFabricTemplateDataWhenChunkReadyStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Pau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647740Pau {
    public static final C647740Pau LIZ = new C647740Pau();
    public static final LynxPreFabricTemplateDataWhenChunkReadyStruct LIZIZ = new LynxPreFabricTemplateDataWhenChunkReadyStruct();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(227));

    public static final boolean LIZIZ() {
        LIZ.getClass();
        return ((LynxPreFabricTemplateDataWhenChunkReadyStruct) LIZJ.getValue()).enable;
    }

    public static final boolean LIZ(String str) {
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        if (((LynxPreFabricTemplateDataWhenChunkReadyStruct) c01gw.getValue()).enable) {
            List<String> list = ((LynxPreFabricTemplateDataWhenChunkReadyStruct) c01gw.getValue()).enableWhiteList;
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
