package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07iU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1938007iU implements InterfaceC1938407iY {
    public static final /* synthetic */ int LJ = 0;
    public final C1938107iV LIZ;
    public final boolean LIZIZ;
    public final EnumC1980907pP LIZJ;
    public final AbstractC1938007iU LIZLLL;

    public abstract boolean LIZJ(SchemaBundle schemaBundle);

    @Override // X.InterfaceC1938407iY
    public final String LIZ(SchemaBundle schemaBundle) {
        SchemaBundle urlBundle;
        int iOrdinal = this.LIZJ.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                urlBundle = schemaBundle;
            } else {
                throw new C1954807lC();
            }
        } else {
            urlBundle = schemaBundle.getUrlBundle();
        }
        String strLIZ = null;
        if (urlBundle == null) {
            C1530030puz.LIZIZ("SparkSchemaRuleManager", "cannot find corresponding target", schemaBundle.getSparkContext());
            AbstractC1938007iU abstractC1938007iULIZIZ = LIZIZ(false);
            if (abstractC1938007iULIZIZ == null) {
                return null;
            }
            return abstractC1938007iULIZIZ.LIZ(schemaBundle);
        }
        if (!LIZJ(urlBundle)) {
            C1530030puz.LIZIZ("SparkSchemaRuleManager", "schema not matches", schemaBundle.getSparkContext());
            AbstractC1938007iU abstractC1938007iULIZIZ2 = LIZIZ(false);
            if (abstractC1938007iULIZIZ2 == null) {
                return null;
            }
            return abstractC1938007iULIZIZ2.LIZ(schemaBundle);
        }
        C1938107iV c1938107iV = this.LIZ;
        if (c1938107iV == null) {
            AbstractC1938007iU abstractC1938007iULIZIZ3 = LIZIZ(true);
            if (abstractC1938007iULIZIZ3 == null) {
                return null;
            }
            return abstractC1938007iULIZIZ3.LIZ(schemaBundle);
        }
        C1530030puz.LIZIZ("SparkSchemaRuleManager", "start to handle schema", schemaBundle.getSparkContext());
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = "";
            if (c1938107iV != null) {
                if (c1938107iV.LIZ(urlBundle)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("rule ");
                    sbLIZ.append(c1938107iV.LIZ);
                    sbLIZ.append(" matches");
                    C1530030puz.LIZIZ("SparkSchemaRuleManager", C2188811AlT.LIZIZ(sbLIZ), schemaBundle.getSparkContext());
                    sb.append(c1938107iV.LIZ);
                    sb.append(",");
                    AbstractC1938207iW abstractC1938207iW = c1938107iV.LIZLLL;
                    if (abstractC1938207iW == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((Object) sb);
                        AbstractC1938007iU abstractC1938007iULIZIZ4 = LIZIZ(true);
                        if (abstractC1938007iULIZIZ4 != null) {
                            strLIZ = abstractC1938007iULIZIZ4.LIZ(urlBundle);
                        }
                        if (strLIZ != null) {
                            str = strLIZ;
                        }
                        sbLIZ2.append(str);
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    while (abstractC1938207iW != null) {
                        abstractC1938207iW.LIZ(urlBundle);
                        abstractC1938207iW = abstractC1938207iW.LIZ;
                    }
                }
                c1938107iV = c1938107iV.LIZJ;
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append((Object) sb);
                AbstractC1938007iU abstractC1938007iULIZIZ5 = LIZIZ(true);
                if (abstractC1938007iULIZIZ5 != null) {
                    strLIZ = abstractC1938007iULIZIZ5.LIZ(schemaBundle);
                }
                if (strLIZ != null) {
                    str = strLIZ;
                }
                sbLIZ3.append(str);
                return C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    public final AbstractC1938007iU LIZIZ(boolean z) {
        if (z && this.LIZIZ) {
            return null;
        }
        return this.LIZLLL;
    }

    public AbstractC1938007iU(h hVar, n nVar, int i) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean zBooleanValue;
        Object c098200Yq3;
        EnumC1980907pP enumC1980907pP;
        Object c098200Yq4;
        String lowerCase;
        try {
            c098200Yq = new C1938107iV(nVar.LJJIIZI("rules"), 0);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AbstractC1938007iU c1937407iO = null;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot parse rule in ");
            sbLIZ.append(getClass().getName());
            C1530030puz.LIZ("SparkSchemaRuleManager", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        this.LIZ = (C1938107iV) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        try {
            c098200Yq2 = Boolean.valueOf(nVar.LJJIIZ("isBreak").LJ());
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LIZIZ = zBooleanValue;
        try {
            c098200Yq3 = nVar.LJJIIZ("modifyTarget").LJIL();
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        String str = (String) (C189200o6.m7isFailureimpl(c098200Yq3) ? null : c098200Yq3);
        if (Intrinsics.LJFF((str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) ? "url" : lowerCase, "schema")) {
            enumC1980907pP = EnumC1980907pP.LLILLJJLI;
        } else {
            enumC1980907pP = EnumC1980907pP.LL;
        }
        this.LIZJ = enumC1980907pP;
        if (i < hVar.size() - 1) {
            int i2 = i + 1;
            try {
                c098200Yq4 = hVar.LJJIIJZLJL(i2).LJIILIIL();
                C189200o6.m2constructorimpl(c098200Yq4);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq4 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq4);
            }
            n nVar2 = (n) (C189200o6.m7isFailureimpl(c098200Yq4) ? null : c098200Yq4);
            if (nVar2 != null) {
                if (this instanceof C1937507iP) {
                    c1937407iO = new C1937507iP(hVar, nVar2, i2);
                } else if (this instanceof C1937707iR) {
                    c1937407iO = new C1937707iR(hVar, nVar2, i2);
                } else if (this instanceof C1937407iO) {
                    c1937407iO = new C1937407iO(hVar, nVar2, i2);
                } else {
                    throw new IllegalArgumentException("rule is illegal");
                }
            }
        }
        this.LIZLLL = c1937407iO;
    }
}
