package X;

import X.C830490Whz;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.12Zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19777412Zo extends AbstractC19781512aT {
    public String LIZLLL;
    public Set<Integer> LJ;
    public C830490Whz LJFF;
    public Long LJI;
    public Long LJII;

    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.12b8] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.12b8] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.12b8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public final List<C19778112Zv> LJIIZILJ() {
        ArrayList arrayList;
        ?? arrayList2;
        ArrayList arrayList3 = new ArrayList();
        C830490Whz.c cVar = (C830490Whz.c) this.LJFF.keySet();
        cVar.removeAll(this.LJ);
        Iterator it2 = cVar.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            C19777812Zs c19777812Zs = (C19777812Zs) this.LJFF.get(Integer.valueOf(iIntValue));
            C0W3J.LJIIIIZZ(c19777812Zs);
            C19782512ad c19782512adLJJIIJ = C19778112Zv.LJJIIJ();
            c19782512adLJJIIJ.LJIIJ();
            C19778112Zv.LJJIFFI((C19778112Zv) c19782512adLJJIIJ.LLILLJJLI, iIntValue);
            boolean z = c19777812Zs.LIZIZ;
            c19782512adLJJIIJ.LJIIJ();
            C19778112Zv.LJJIII((C19778112Zv) c19782512adLJJIIJ.LLILLJJLI, z);
            C19778212Zw c19778212Zw = c19777812Zs.LIZJ;
            if (c19778212Zw != null) {
                c19782512adLJJIIJ.LJIIJ();
                C19778112Zv.LJJIIJZLJL((C19778112Zv) c19782512adLJJIIJ.LLILLJJLI, c19778212Zw);
            }
            C19783412am c19783412amLJJI = C19778212Zw.LJJI();
            List<Long> listLJJIII = C19777312Zn.LJJIII(c19777812Zs.LIZLLL);
            c19783412amLJJI.LJIIJ();
            C19778212Zw c19778212Zw2 = (C19778212Zw) c19783412amLJJI.LLILLJJLI;
            ?? r1 = c19778212Zw2.zzf;
            if (!((AbstractC19886812rS) r1).LL) {
                c19778212Zw2.zzf = AbstractC19899612tW.LJIILJJIL(r1);
            }
            AbstractC19899312tT.LJI(listLJJIII, c19778212Zw2.zzf);
            List<Long> listLJJIII2 = C19777312Zn.LJJIII(c19777812Zs.LJ);
            c19783412amLJJI.LJIIJ();
            C19778212Zw c19778212Zw3 = (C19778212Zw) c19783412amLJJI.LLILLJJLI;
            ?? r12 = c19778212Zw3.zze;
            if (!((AbstractC19886812rS) r12).LL) {
                c19778212Zw3.zze = AbstractC19899612tW.LJIILJJIL(r12);
            }
            AbstractC19899312tT.LJI(listLJJIII2, c19778212Zw3.zze);
            if (c19777812Zs.LJFF == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(c19777812Zs.LJFF.size());
                Iterator<Integer> it3 = c19777812Zs.LJFF.keySet().iterator();
                while (it3.hasNext()) {
                    int iIntValue2 = it3.next().intValue();
                    Long l = c19777812Zs.LJFF.get(Integer.valueOf(iIntValue2));
                    if (l != null) {
                        C19782612ae c19782612aeLJJIII = C19778812a2.LJJIII();
                        c19782612aeLJJIII.LJIIJ();
                        C19778812a2.LJJIFFI((C19778812a2) c19782612aeLJJIII.LLILLJJLI, iIntValue2);
                        long jLongValue = l.longValue();
                        c19782612aeLJJIII.LJIIJ();
                        C19778812a2.LJJII((C19778812a2) c19782612aeLJJIII.LLILLJJLI, jLongValue);
                        arrayList.add(c19782612aeLJJIII.LJI());
                    }
                }
            }
            if (arrayList != null) {
                c19783412amLJJI.LJIIJ();
                C19778212Zw c19778212Zw4 = (C19778212Zw) c19783412amLJJI.LLILLJJLI;
                InterfaceC19875012pY<C19778812a2> interfaceC19875012pY = c19778212Zw4.zzg;
                if (!interfaceC19875012pY.LIZIZ()) {
                    c19778212Zw4.zzg = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY);
                }
                AbstractC19899312tT.LJI(arrayList, c19778212Zw4.zzg);
            }
            if (c19777812Zs.LJI != null) {
                arrayList2 = new ArrayList(c19777812Zs.LJI.LLILLL);
                Iterator it4 = ((C830490Whz.c) c19777812Zs.LJI.keySet()).iterator();
                while (true) {
                    AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it4;
                    if (!abstractC1322040kVW.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) abstractC1322040kVW.next();
                    C19783512an c19783512anLJJIFFI = C19778712a1.LJJIFFI();
                    int iIntValue3 = num.intValue();
                    c19783512anLJJIFFI.LJIIJ();
                    C19778712a1.LJJI((C19778712a1) c19783512anLJJIFFI.LLILLJJLI, iIntValue3);
                    List list = (List) c19777812Zs.LJI.get(num);
                    if (list != null) {
                        Collections.sort(list);
                        c19783512anLJJIFFI.LJIIJ();
                        C19778712a1 c19778712a1 = (C19778712a1) c19783512anLJJIFFI.LLILLJJLI;
                        ?? r13 = c19778712a1.zzg;
                        if (!((AbstractC19886812rS) r13).LL) {
                            c19778712a1.zzg = AbstractC19899612tW.LJIILJJIL(r13);
                        }
                        AbstractC19899312tT.LJI(list, c19778712a1.zzg);
                    }
                    arrayList2.add(c19783512anLJJIFFI.LJI());
                }
            } else {
                arrayList2 = Collections.emptyList();
            }
            c19783412amLJJI.LJIIJ();
            C19778212Zw c19778212Zw5 = (C19778212Zw) c19783412amLJJI.LLILLJJLI;
            InterfaceC19875012pY<C19778712a1> interfaceC19875012pY2 = c19778212Zw5.zzh;
            if (!interfaceC19875012pY2.LIZIZ()) {
                c19778212Zw5.zzh = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY2);
            }
            AbstractC19899312tT.LJI(arrayList2, c19778212Zw5.zzh);
            c19782512adLJJIIJ.LJIIJ();
            C19778112Zv.LJJII((C19778112Zv) c19782512adLJJIIJ.LLILLJJLI, (C19778212Zw) c19783412amLJJI.LJI());
            C19778112Zv c19778112Zv = (C19778112Zv) c19782512adLJJIIJ.LJI();
            arrayList3.add(c19778112Zv);
            C12Z6 c12z6LJI = LJI();
            String str = this.LIZLLL;
            C19778212Zw c19778212ZwLJJIIZI = c19778112Zv.LJJIIZI();
            c12z6LJI.LJIIIIZZ();
            c12z6LJI.LJ();
            C0W3J.LJI(str);
            C0W3J.LJIIIIZZ(c19778212ZwLJJIIZI);
            byte[] bArrLJIIJ = c19778212ZwLJJIIZI.LJIIJ();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(iIntValue));
            contentValues.put("current_results", bArrLJIIJ);
            try {
                if (c12z6LJI.LJIILIIL().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    c12z6LJI.LJIILJJIL().LJFF.LIZ(C19806212eS.LJIIJ(str), "Failed to insert filter results (got -1). appId");
                }
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                c12z6LJI.LJIILJJIL().LJFF.LIZIZ(C19806212eS.LJIIJ(str), "Error storing filter results. appId", e);
            }
        }
        return arrayList3;
    }

    public C19777412Zo(C12Z4 c12z4) {
        super(c12z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19777812Zs LJIILIIL(Integer num) {
        if (this.LJFF.containsKey(num)) {
            return (C19777812Zs) this.LJFF.get(num);
        }
        C19777812Zs c19777812Zs = new C19777812Zs(this, this.LIZLLL);
        this.LJFF.put(num, c19777812Zs);
        return c19777812Zs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.util.List<X.C12ZE> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19777412Zo.LJIILL(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x023f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x08a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.util.List<X.C12ZI> r37, boolean r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19777412Zo.LJIILLIIL(java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v14, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.0Whz, X.0Wi3] */
    /* JADX WARN: Type inference failed for: r14v9, types: [X.12b8] */
    /* JADX WARN: Type inference failed for: r15v3, types: [X.12b8] */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C19778112Zv> LJIIJJI(java.lang.String r32, java.util.List<X.C12ZI> r33, java.util.List<X.C12ZE> r34, java.lang.Long r35, java.lang.Long r36, boolean r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19777412Zo.LJIIJJI(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }
}
