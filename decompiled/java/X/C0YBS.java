package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YBS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YBS extends C09AY implements Function0<C869860YAm> {
    public final /* synthetic */ C0YBI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YBS(C0YBI c0ybi) {
        super(0);
        this.LL = c0ybi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0YAm] */
    @Override // kotlin.jvm.functions.Function0
    public final C869860YAm invoke() {
        return new InterfaceC869850YAl(this.LL.LIZ) { // from class: X.0YAm
            public final C0YEM LIZIZ;
            public final C0Y5R LIZJ;

            @Override // X.InterfaceC869850YAl
            public final List<Pair<Long, String>> LIZ() throws Throwable {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n            SELECT rowid,");
                EnumC869910YAr enumC869910YAr = EnumC869910YAr.COLUMN_REGION_NAME;
                sbLIZ.append(enumC869910YAr.getKey());
                sbLIZ.append("\n            FROM region_name\n        ");
                String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                ArrayList arrayList = new ArrayList();
                InterfaceC869470Y8z interfaceC869470Y8z = null;
                try {
                    try {
                        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZJ, "getAllRegionNames", null);
                        if (interfaceC869470Y8zLJIIJJI == null) {
                            C13BV c13bv = C13BV.INSTANCE;
                            this.LIZJ.LIZ().getClass();
                            return c13bv;
                        }
                        try {
                            int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex("rowid");
                            int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869910YAr.getKey());
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                arrayList.add(new Pair(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex)), interfaceC869470Y8zLJIIJJI.getString(columnIndex2)));
                            }
                            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getAllRegionNames, success with rows: ");
                            sbLIZ2.append(arrayList.size());
                            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DefaultIMRegionNameDao", C2188811AlT.LIZIZ(sbLIZ2), 4);
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return arrayList;
                        } catch (Exception e) {
                            e = e;
                            interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIIZZ("DefaultIMRegionNameDao", "getAllRegionNames, failed", e);
                this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                C13BV c13bv2 = C13BV.INSTANCE;
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                return c13bv2;
            }

            {
                this.LIZIZ = c0yem;
                this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
            }

            @Override // X.InterfaceC869850YAl
            public final long LIZIZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n            INSERT OR IGNORE INTO region_name\n            (");
                sbLIZ.append(EnumC869910YAr.COLUMN_REGION_NAME.getKey());
                sbLIZ.append(")\n            VALUES (?)\n        ");
                InterfaceC869960YAw interfaceC869960YAwLIZ = this.LIZJ.getProxy().LIZ(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
                long jLJIL = -1;
                if (interfaceC869960YAwLIZ == null) {
                    return -1L;
                }
                try {
                    try {
                        interfaceC869960YAwLIZ.LJIILIIL(1, str);
                        jLJIL = interfaceC869960YAwLIZ.LJIL();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("DefaultIMRegionNameDao", "insertOrIgnoreName, failed", e);
                        this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                    }
                    interfaceC869960YAwLIZ.close();
                    return jLJIL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC869960YAwLIZ.close();
                    throw th;
                }
            }
        };
    }
}
