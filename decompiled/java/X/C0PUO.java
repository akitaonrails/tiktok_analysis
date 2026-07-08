package X;

import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PUO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUO {
    public static final C0PUO LIZ = new C0PUO();
    public static C0PQX LIZIZ;
    public static volatile C11H6<Integer, String, EnumC645610PTz, C09AE> LIZJ;

    public static String LIZ(EnumC645610PTz enumC645610PTz) {
        int i = C0PU5.LIZ[enumC645610PTz.ordinal()];
        if (i != 1 && i != 6 && i != 3) {
            if (i != 4) {
                return "video";
            }
            return "product";
        }
        return "live";
    }

    public static String LIZIZ(EnumC645610PTz enumC645610PTz) {
        int i = C0PU5.LIZ[enumC645610PTz.ordinal()];
        if (i != 1) {
            if (i != 4 && i != 5 && i != 6) {
                return "";
            }
            return "product";
        }
        return "live";
    }

    public static boolean LIZJ(Function1 function1) {
        C0PQX c0pqx = LIZIZ;
        if (c0pqx != null) {
            IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
            EnumC645610PTz enumC645610PTz = c0pqx.LIZ;
            if (enumC645610PTz == null) {
                enumC645610PTz = EnumC645610PTz.LIVE_FEED;
            }
            String str = c0pqx.LIZJ;
            if (str == null) {
                str = "";
            }
            iEcomGeneralSearchServiceLIZ.LJJ(enumC645610PTz, str, "request", "reuseRequest", Boolean.TRUE);
            function1.invoke(c0pqx);
            LIZIZ = null;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.EnumC645610PTz r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, java.util.Map r24, boolean r25, kotlin.jvm.functions.Function1 r26) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PUO.LIZLLL(X.0PTz, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.Map, boolean, kotlin.jvm.functions.Function1):void");
    }
}
