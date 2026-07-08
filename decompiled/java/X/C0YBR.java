package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0YBR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YBR extends C09AY implements Function0<C869830YAj> {
    public final /* synthetic */ C0YBI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YBR(C0YBI c0ybi) {
        super(0);
        this.LL = c0ybi;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0YAj] */
    @Override // kotlin.jvm.functions.Function0
    public final C869830YAj invoke() {
        final C0YEM c0yem = this.LL.LIZ;
        return new InterfaceC869510Y9d(c0yem) { // from class: X.0YAj
            public final C0YEM LIZIZ;
            public final C0Y5R LIZJ;

            @Override // X.InterfaceC869510Y9d
            public final boolean LIZIZ() {
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMSegmentDao", "deleteSegmentsForConversation, start", 4);
                return this.LIZJ.getProxy().LIZIZ("msg_segment", "", null);
            }

            {
                this.LIZIZ = c0yem;
                this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
            }

            public static List LJFF(InterfaceC869470Y8z interfaceC869470Y8z) {
                int columnIndex = interfaceC869470Y8z.getColumnIndex("rowid");
                int columnIndex2 = interfaceC869470Y8z.getColumnIndex(C0YAY.COLUMN_CONV_ID.getKey());
                int columnIndex3 = interfaceC869470Y8z.getColumnIndex(C0YAY.COLUMN_PREV_INDEX.getKey());
                int columnIndex4 = interfaceC869470Y8z.getColumnIndex(C0YAY.COLUMN_MIN_INDEX.getKey());
                int columnIndex5 = interfaceC869470Y8z.getColumnIndex(C0YAY.COLUMN_MAX_INDEX.getKey());
                int columnIndex6 = interfaceC869470Y8z.getColumnIndex(C0YAY.COLUMN_MIN_REGION_ID.getKey());
                int columnIndex7 = interfaceC869470Y8z.getColumnIndex(C0YAY.COLUMN_MAX_REGION_ID.getKey());
                ArrayList arrayList = new ArrayList();
                while (interfaceC869470Y8z.moveToNext()) {
                    int i = interfaceC869470Y8z.getInt(columnIndex);
                    String string = interfaceC869470Y8z.getString(columnIndex2);
                    long j = interfaceC869470Y8z.getLong(columnIndex3);
                    arrayList.add(new C869840YAk(interfaceC869470Y8z.getLong(columnIndex4), interfaceC869470Y8z.getLong(columnIndex6), i, interfaceC869470Y8z.getLong(columnIndex5), interfaceC869470Y8z.getLong(columnIndex7), j, string));
                }
                return arrayList;
            }

            public final boolean LIZ(List<C869840YAk> list) {
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMSegmentDao", "batchInsertSegments, start", 4);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n            INSERT INTO msg_segment \n            (\n                ");
                sbLIZ.append(C13LQ.LJJJ(C0YAY.values(), ",", null, null, AFwS248S0000000_14.get$arr$(408), 30));
                sbLIZ.append("\n            ) \n            VALUES (");
                sbLIZ.append(C13LQ.LJJJ(C0YAY.values(), ",", null, null, AFwS248S0000000_14.get$arr$(409), 30));
                sbLIZ.append(")\n        ");
                InterfaceC869960YAw interfaceC869960YAwLIZ = this.LIZJ.getProxy().LIZ(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
                if (interfaceC869960YAwLIZ == null) {
                    return false;
                }
                try {
                    for (C869840YAk c869840YAk : list) {
                        interfaceC869960YAwLIZ.LJIILIIL(1, c869840YAk.LIZIZ);
                        interfaceC869960YAwLIZ.LJIJ(2, c869840YAk.LJI);
                        interfaceC869960YAwLIZ.LJIJ(3, c869840YAk.LIZJ);
                        interfaceC869960YAwLIZ.LJIJ(4, c869840YAk.LJ);
                        interfaceC869960YAwLIZ.LJIJ(5, c869840YAk.LIZLLL);
                        interfaceC869960YAwLIZ.LJIJ(6, c869840YAk.LJFF);
                        interfaceC869960YAwLIZ.LJIL();
                        interfaceC869960YAwLIZ.LJJIIZ();
                    }
                    interfaceC869960YAwLIZ.close();
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC869960YAwLIZ.close();
                    throw th;
                }
            }

            @Override // X.InterfaceC869510Y9d
            public final boolean LJ(String str) {
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMSegmentDao", "deleteSegmentsForConversation, start", 4);
                String[] strArr = {str};
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0YAY.COLUMN_CONV_ID.getKey());
                sbLIZ.append(" = ?");
                return proxy.LIZIZ("msg_segment", C2188811AlT.LIZIZ(sbLIZ), strArr);
            }

            public final boolean LJI(List<C869840YAk> list) {
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMSegmentDao", "deleteSegments, start", 4);
                ArrayList arrayList = new ArrayList();
                for (C869840YAk c869840YAk : list) {
                    if (c869840YAk.LIZ >= 0) {
                        arrayList.add(c869840YAk);
                    }
                }
                if (arrayList.isEmpty()) {
                    return true;
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((C869840YAk) it2.next()).LIZ));
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                String strLJJJ = C13LQ.LJJJ(strArr, ",", null, null, AFwS248S0000000_14.get$arr$(410), 30);
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rowid in (");
                sbLIZ.append(strLJJJ);
                sbLIZ.append(')');
                return proxy.LIZIZ("msg_segment", C2188811AlT.LIZIZ(sbLIZ), strArr);
            }

            @Override // X.InterfaceC869510Y9d
            public final boolean LIZLLL(List<C869840YAk> list, List<C869840YAk> list2) {
                boolean zLJI;
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMSegmentDao", "replaceSegments, start", 4);
                this.LIZJ.getProxy().LJIILIIL("IMSegmentDao_replaceSegments");
                try {
                    boolean z = true;
                    if (list.isEmpty()) {
                        zLJI = true;
                    } else {
                        zLJI = LJI(list);
                    }
                    boolean zLIZ = LIZ(list2);
                    if (!zLJI || !zLIZ) {
                        z = false;
                    }
                    this.LIZJ.getProxy().LIZJ("IMSegmentDao_replaceSegments", z);
                    C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("replaceSegments inserted ");
                    sbLIZ.append(zLIZ);
                    sbLIZ.append(" and deleted ");
                    sbLIZ.append(zLJI);
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMSegmentDao", C2188811AlT.LIZIZ(sbLIZ), 4);
                    return z;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZIZ.LIZLLL().LJIIIIZZ("IMSegmentDao", "replaceSegments, failed", e);
                    this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMSegmentDao: replaceSegments", e);
                    this.LIZJ.getProxy().LIZJ("IMSegmentDao_replaceSegments", false);
                    return false;
                }
            }

            @Override // X.InterfaceC869510Y9d
            public final List LIZJ(long j, long j2, String str) {
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMSegmentDao", "getSegmentsBetween, start", 4);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n            SELECT rowid,* from msg_segment\n            WHERE ");
                sbLIZ.append(C0YAY.COLUMN_CONV_ID.getKey());
                sbLIZ.append(" = ?\n            AND (\n                ");
                C0YAY c0yay = C0YAY.COLUMN_MIN_INDEX;
                sbLIZ.append(c0yay.getKey());
                sbLIZ.append(" BETWEEN ? AND ?\n                OR ");
                C0YAY c0yay2 = C0YAY.COLUMN_MAX_INDEX;
                sbLIZ.append(c0yay2.getKey());
                sbLIZ.append(" BETWEEN ? AND ?\n                OR (\n                    ");
                sbLIZ.append(c0yay.getKey());
                sbLIZ.append(" < ?\n                    AND ");
                sbLIZ.append(c0yay2.getKey());
                sbLIZ.append(" > ?\n                )\n            )\n        ");
                String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                ArrayList arrayList = new ArrayList();
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZJ, "getSegmentsBetween", new String[]{str, String.valueOf(j), String.valueOf(j2), String.valueOf(j), String.valueOf(j2), String.valueOf(j), String.valueOf(j2)});
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIIZZ("IMSegmentDao", "getSegmentsBetween, failed.", e);
                        this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                    }
                    if (interfaceC869470Y8zLJIIJJI == null) {
                        this.LIZJ.LIZ().getClass();
                        return arrayList;
                    }
                    arrayList.addAll(LJFF(interfaceC869470Y8zLJIIJJI));
                    C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getSegmentsBetween, success with rows: ");
                    sbLIZ2.append(arrayList.size());
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMSegmentDao", C2188811AlT.LIZIZ(sbLIZ2), 4);
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }
        };
    }
}
