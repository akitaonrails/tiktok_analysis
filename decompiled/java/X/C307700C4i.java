package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0C4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307700C4i {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C307710C4j());
    public static volatile boolean LIZIZ;

    public static void LIZ(n nVar, String str) {
        k kVarLJJIIZ;
        try {
            n nVarLJJIJ = nVar.LJJIJ(str);
            if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                C307760C4o.LIZJ.LJIIJ(str, kVarLJJIIZ.toString());
            } else if (nVar.LJJIJIIJIL(str)) {
                C307760C4o.LIZJ.LJIIJ(str, null);
            } else {
                C307760C4o.LIZJ.LJIIIIZZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th);
            sbLIZ.append(": key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    public static void LIZIZ(final ConfigItem configItem, final n nVar, final Object obj, final String str) {
        try {
            new C0C6T() { // from class: X.0C4h
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x024d -> B:138:0x001c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x02c2 -> B:126:0x001c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006d -> B:141:0x001c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00dc -> B:135:0x001c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0138 -> B:132:0x001c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0194 -> B:129:0x001c). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01f0 -> B:144:0x001c). Please report as a decompilation issue!!! */
                @Override // X.C0C6T
                public final Object call() {
                    k kVarLJJIIZ;
                    k kVarLJJIIZ2;
                    k kVarLJJIIZ3;
                    k kVarLJJIIZ4;
                    k kVarLJJIIZ5;
                    q qVarLJJIJIIJI;
                    q qVarLJJIJIIJI2;
                    ConfigItem configItem2 = configItem;
                    Object obj2 = obj;
                    String str2 = str;
                    n nVar2 = nVar;
                    SaveConfigType$ConfigType saveConfigType$ConfigType = configItem2.type;
                    switch (saveConfigType$ConfigType == null ? -1 : C0C4P.LIZ[saveConfigType$ConfigType.ordinal()]) {
                        case 1:
                            if (obj2 != null && (obj2 instanceof Boolean)) {
                                C307760C4o.LIZJ.LJIIIZ().LIZLLL(str2, ((Boolean) obj2).booleanValue());
                            } else {
                                try {
                                    n nVarLJJIJ = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ == null || (qVarLJJIJIIJI2 = nVarLJJIJ.LJJIJIIJI("val")) == null) {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    } else if (qVarLJJIJIIJI2.LL instanceof Number) {
                                        C307760C4o.LIZJ.LJIIIZ().LIZLLL(str2, qVarLJJIJIIJI2.LJIIJJI() != 0);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIZ().LIZLLL(str2, qVarLJJIJIIJI2.LJ());
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(th);
                                    sbLIZ.append(": key:");
                                    sbLIZ.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
                                }
                            }
                            break;
                        case 2:
                            if (obj2 != null && (obj2 instanceof Integer)) {
                                C307760C4o.LIZJ.LJIIIZ().LIZJ(str2, ((Number) obj2).intValue());
                            } else {
                                try {
                                    n nVarLJJIJ2 = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ2 == null || (qVarLJJIJIIJI = nVarLJJIJ2.LJJIJIIJI("val")) == null) {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    } else if (qVarLJJIJIIJI.LL instanceof Boolean) {
                                        C307760C4o.LIZJ.LJIIIZ().LIZJ(str2, qVarLJJIJIIJI.LJ() ? 1 : 0);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIZ().LIZJ(str2, qVarLJJIJIIJI.LJIIJJI());
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(th2);
                                    sbLIZ2.append(": key:");
                                    sbLIZ2.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ2), th2));
                                }
                            }
                            break;
                        case 3:
                            if (obj2 != null && (obj2 instanceof Long)) {
                                C307760C4o.LIZJ.LJIIIZ().LJIIIIZZ(str2, ((Number) obj2).longValue());
                            } else {
                                try {
                                    n nVarLJJIJ3 = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ3 == null || (kVarLJJIIZ5 = nVarLJJIJ3.LJJIIZ("val")) == null || (kVarLJJIIZ5 instanceof m)) {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIZ().LJIIIIZZ(str2, kVarLJJIIZ5.LJIIZILJ());
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(th3);
                                    sbLIZ3.append(": key:");
                                    sbLIZ3.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ3), th3));
                                }
                            }
                            break;
                        case 4:
                            if (obj2 != null && (obj2 instanceof Double)) {
                                C307760C4o.LIZJ.LJIIIZ().LJFF(str2, ((Number) obj2).doubleValue());
                            } else {
                                try {
                                    n nVarLJJIJ4 = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ4 == null || (kVarLJJIIZ4 = nVarLJJIJ4.LJJIIZ("val")) == null || (kVarLJJIIZ4 instanceof m)) {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIZ().LJFF(str2, kVarLJJIIZ4.LJIIIZ());
                                    }
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(th4);
                                    sbLIZ4.append(": key:");
                                    sbLIZ4.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ4), th4));
                                }
                            }
                            break;
                        case 5:
                            if (obj2 != null && (obj2 instanceof Float)) {
                                C307760C4o.LIZJ.LJIIIZ().LJIIJ(str2, ((Number) obj2).floatValue());
                            } else {
                                try {
                                    n nVarLJJIJ5 = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ5 == null || (kVarLJJIIZ3 = nVarLJJIJ5.LJJIIZ("val")) == null || (kVarLJJIIZ3 instanceof m)) {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIZ().LJIIJ(str2, kVarLJJIIZ3.LJIIJ());
                                    }
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(th5);
                                    sbLIZ5.append(": key:");
                                    sbLIZ5.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ5), th5));
                                }
                            }
                            break;
                        case 6:
                            if (obj2 != null && (obj2 instanceof String)) {
                                C307760C4o.LIZJ.LJIIJ(str2, (String) obj2);
                            } else {
                                try {
                                    n nVarLJJIJ6 = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ6 != null && (kVarLJJIIZ2 = nVarLJJIJ6.LJJIIZ("val")) != null && !(kVarLJJIIZ2 instanceof m)) {
                                        C307760C4o.LIZJ.LJIIJ(str2, kVarLJJIIZ2.LJIL());
                                    } else if (nVar2.LJJIJIIJIL(str2)) {
                                        C307760C4o.LIZJ.LJIIJ(str2, null);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    }
                                } catch (Throwable th6) {
                                    TryCatchGuardChecker.doCheck(th6);
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(th6);
                                    sbLIZ6.append(": key:");
                                    sbLIZ6.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ6), th6));
                                }
                            }
                            break;
                        case 7:
                            if (obj2 != null && (obj2 instanceof Object[])) {
                                C307760C4o.LIZJ.LJIIIZ().LJII(str2, (String[]) obj2);
                            } else {
                                try {
                                    n nVarLJJIJ7 = nVar2.LJJIJ(str2);
                                    if (nVarLJJIJ7 != null && (kVarLJJIIZ = nVarLJJIJ7.LJJIIZ("val")) != null && !(kVarLJJIIZ instanceof m)) {
                                        C307760C4o c307760C4o = C307760C4o.LIZJ;
                                        c307760C4o.LJIIIZ().LJII(str2, (String[]) ((Gson) c307760C4o.LIZIZ.getValue()).LIZLLL(kVarLJJIIZ, String[].class));
                                    } else if (nVar2.LJJIJIIJIL(str2)) {
                                        C307760C4o.LIZJ.LJIIIZ().LJII(str2, null);
                                    } else {
                                        C307760C4o.LIZJ.LJIIIIZZ(str2);
                                    }
                                } catch (Throwable th7) {
                                    TryCatchGuardChecker.doCheck(th7);
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(th7);
                                    sbLIZ7.append(": key:");
                                    sbLIZ7.append(str2);
                                    C0C46.LIZIZ("SaveConfigValue", new Throwable(C2188811AlT.LIZIZ(sbLIZ7), th7));
                                }
                            }
                            break;
                        case 8:
                            if (obj2 == null) {
                                C307700C4i.LIZ(nVar2, str2);
                            } else {
                                C307760C4o.LIZJ.LJIIJ(str2, obj2.toString());
                            }
                            break;
                        default:
                            C307700C4i.LIZ(nVar2, str2);
                            break;
                    }
                    return Unit.LIZ;
                }
            }.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("saveValue");
            C0C46.LIZIZ("launchConfigDataManager", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }
}
