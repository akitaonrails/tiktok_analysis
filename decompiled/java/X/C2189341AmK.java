package X;

import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.settings.MinisPerfConfigSettings;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1AmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2189341AmK {
    public static volatile boolean LIZIZ;
    public static C2189351AmL LIZLLL;
    public static boolean LJFF;
    public static final C2189341AmK LIZ = new C2189341AmK();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(547));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(188));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(546));

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2189341AmK.LIZ(android.content.Context):void");
    }

    public static void LIZIZ(List list, Function1 function1) {
        C2189351AmL c2189351AmL;
        boolean z = MinisPerfConfigSettings.LIZ().metaPreloadEnable;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadMetaByScene, value:");
        sbLIZ.append(MinisPerfConfigSettings.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        if (z && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SchemaParserData schemaParserData = (SchemaParserData) it2.next();
                if (schemaParserData.clientKey != null && (c2189351AmL = LIZLLL) != null) {
                    int i2 = C2187451AjH.LIZ;
                    c2189351AmL.LIZ.LIZ(Collections.singletonList(schemaParserData)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(function1, 3));
                }
            }
        }
    }
}
