package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215391BnF {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(h hVar) {
        ArrayList arrayList = new ArrayList();
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(LIZJ(hVar.LJJIIJZLJL(i).LJIILIIL()));
        }
        return arrayList;
    }

    public static Map LIZIZ(n nVar) {
        double dDoubleValue;
        C824810WXf c824810WXf;
        if (nVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : nVar.LJJIJIL()) {
            n nVarLIZIZ = C1931307hP.LIZIZ(nVar, str);
            Object objLIZJ = C1931307hP.LIZJ(nVarLIZIZ, "rate");
            if (objLIZJ instanceof Number) {
                dDoubleValue = ((Number) objLIZJ).doubleValue();
            } else if (objLIZJ instanceof String) {
                try {
                    dDoubleValue = CastDoubleProtector.parseDouble((String) objLIZJ);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NumberFormatException while parsing rate=");
                    sbLIZ.append((String) objLIZJ);
                    sbLIZ.append(" exception=");
                    sbLIZ.append(e.getMessage());
                    sbLIZ.append(", defaulting to 0.0");
                    C201955140j.LJIJJ(c20102213l6, "ExceptionConfigParser", C2188811AlT.LIZIZ(sbLIZ));
                    dDoubleValue = 0.0d;
                }
            } else {
                dDoubleValue = 1.0d;
            }
            n nVarLIZLLL = C1931307hP.LIZLLL(nVarLIZIZ, "app_ver");
            if (nVarLIZLLL == null) {
                c824810WXf = null;
            } else {
                c824810WXf = new C824810WXf(C1931307hP.LJ(nVarLIZLLL, "from"), C1931307hP.LJ(nVarLIZLLL, "to"));
            }
            AbstractC1556890qcJ abstractC1556890qcJLIZJ = LIZJ(C1931307hP.LIZIZ(nVarLIZIZ, "filter"));
            C1931307hP.LJ(nVarLIZIZ, "display_name").length();
            C1931307hP.LJ(nVarLIZIZ, "metric_key").length();
            map.put(str, new C824790WXd(dDoubleValue, c824810WXf, abstractC1556890qcJLIZJ));
        }
        return map;
    }

    public static AbstractC1556890qcJ LIZJ(n nVar) {
        EnumC2215431BnJ enumC2215431BnJValueOf;
        EnumC2215401BnG enumC2215401BnG;
        EnumC2215421BnI enumC2215421BnI;
        if (nVar.LJJIJIIJIL("operator") && nVar.LJJIJIIJIL("elements")) {
            C2215451BnL c2215451BnL = EnumC2215421BnI.Companion;
            String strLJ = C1931307hP.LJ(nVar, "operator");
            c2215451BnL.getClass();
            if (Intrinsics.LJFF(strLJ, "&&")) {
                enumC2215421BnI = EnumC2215421BnI.AND;
            } else {
                if (Intrinsics.LJFF(strLJ, "||")) {
                    enumC2215421BnI = EnumC2215421BnI.OR;
                }
                enumC2215421BnI = EnumC2215421BnI.AND;
                return new C1556880qcI(enumC2215421BnI, LIZ(C1931307hP.LIZ(nVar)));
            }
            if (enumC2215421BnI == null) {
                enumC2215421BnI = EnumC2215421BnI.AND;
            }
            return new C1556880qcI(enumC2215421BnI, LIZ(C1931307hP.LIZ(nVar)));
        }
        if (nVar.LJJIJIIJIL("elements") && !nVar.LJJIJIIJIL("operator")) {
            List listLIZ = LIZ(C1931307hP.LIZ(nVar));
            ArrayList arrayList = (ArrayList) listLIZ;
            if (arrayList.size() == 1) {
                return (AbstractC1556890qcJ) C13LP.LJJJJZI(listLIZ);
            }
            if (arrayList.size() > 1) {
                return new C1556880qcI(EnumC2215421BnI.AND, listLIZ);
            }
        }
        String strLJFF = C1931307hP.LJFF(nVar, "type", "string");
        try {
            enumC2215431BnJValueOf = EnumC2215431BnJ.valueOf(strLJFF.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid type: ");
            sbLIZ.append(strLJFF);
            sbLIZ.append(", defaulting to STRING");
            C201955140j.LJIJJ(c20102213l6, "ExceptionConfigParser", C2188811AlT.LIZIZ(sbLIZ));
            enumC2215431BnJValueOf = EnumC2215431BnJ.STRING;
        }
        String strLJ2 = C1931307hP.LJ(nVar, "key");
        Object objLIZJ = C1931307hP.LIZJ(nVar, "value");
        if (objLIZJ == null) {
            objLIZJ = "";
        } else if (objLIZJ instanceof h) {
            ArrayList arrayList2 = new ArrayList();
            h hVar = (h) objLIZJ;
            int size = hVar.size();
            for (int i = 0; i < size; i++) {
                Object objLJI = C1931307hP.LJI(hVar.LJJIIJZLJL(i));
                if (objLJI == null) {
                    objLJI = "";
                }
                arrayList2.add(objLJI);
            }
            objLIZJ = arrayList2;
        }
        C2215441BnK c2215441BnK = EnumC2215401BnG.Companion;
        String strLJ3 = C1931307hP.LJ(nVar, "compare");
        c2215441BnK.getClass();
        if (strLJ3 != null) {
            int iHashCode = strLJ3.hashCode();
            if (iHashCode != -1039699439) {
                if (iHashCode != 60) {
                    if (iHashCode != 62) {
                        if (iHashCode != 1084) {
                            if (iHashCode != 1921) {
                                if (iHashCode != 1952) {
                                    if (iHashCode != 1983) {
                                        if (iHashCode != 3365) {
                                            if (iHashCode == 108392519 && strLJ3.equals("regex")) {
                                                enumC2215401BnG = EnumC2215401BnG.REGEX;
                                                if (enumC2215401BnG == null) {
                                                }
                                            }
                                            enumC2215401BnG = EnumC2215401BnG.EQUAL;
                                        } else {
                                            if (strLJ3.equals("in")) {
                                                enumC2215401BnG = EnumC2215401BnG.IN;
                                                if (enumC2215401BnG == null) {
                                                }
                                            }
                                            enumC2215401BnG = EnumC2215401BnG.EQUAL;
                                        }
                                    } else {
                                        if (strLJ3.equals(">=")) {
                                            enumC2215401BnG = EnumC2215401BnG.GREATER_EQUAL;
                                            if (enumC2215401BnG == null) {
                                            }
                                        }
                                        enumC2215401BnG = EnumC2215401BnG.EQUAL;
                                    }
                                } else {
                                    if (strLJ3.equals("==")) {
                                        enumC2215401BnG = EnumC2215401BnG.EQUAL;
                                        if (enumC2215401BnG == null) {
                                        }
                                    }
                                    enumC2215401BnG = EnumC2215401BnG.EQUAL;
                                }
                            } else {
                                if (strLJ3.equals("<=")) {
                                    enumC2215401BnG = EnumC2215401BnG.LESS_EQUAL;
                                    if (enumC2215401BnG == null) {
                                    }
                                }
                                enumC2215401BnG = EnumC2215401BnG.EQUAL;
                            }
                        } else {
                            if (strLJ3.equals("!=")) {
                                enumC2215401BnG = EnumC2215401BnG.NOT_EQUAL;
                                if (enumC2215401BnG == null) {
                                }
                            }
                            enumC2215401BnG = EnumC2215401BnG.EQUAL;
                        }
                    } else {
                        if (strLJ3.equals(">")) {
                            enumC2215401BnG = EnumC2215401BnG.GREATER_THAN;
                            if (enumC2215401BnG == null) {
                            }
                        }
                        enumC2215401BnG = EnumC2215401BnG.EQUAL;
                    }
                } else {
                    if (strLJ3.equals("<")) {
                        enumC2215401BnG = EnumC2215401BnG.LESS_THAN;
                        if (enumC2215401BnG == null) {
                        }
                    }
                    enumC2215401BnG = EnumC2215401BnG.EQUAL;
                }
            } else {
                if (strLJ3.equals("not_in")) {
                    enumC2215401BnG = EnumC2215401BnG.NOT_IN;
                    if (enumC2215401BnG == null) {
                    }
                }
                enumC2215401BnG = EnumC2215401BnG.EQUAL;
            }
        } else {
            enumC2215401BnG = EnumC2215401BnG.EQUAL;
        }
        return new C1557900qdw(strLJ2, objLIZJ, enumC2215401BnG, enumC2215431BnJValueOf);
    }
}
