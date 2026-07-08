package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OI4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI4 {
    public final long LIZ;
    public final LinkedHashMap<C0OIH<?>, C0OIJ> LIZIZ;
    public final C054G LIZJ;
    public volatile boolean LIZLLL;
    public final C605840NpW LJ;
    public final C1DEK LJFF;
    public final InterfaceC346201Wa<EnumC617480OJu> LJI;
    public final C455501px<C616900OHo<EnumC617060OIe, EnumC617480OJu, EnumC617010OHz, BulletinBoardInfo>> LJII;

    public C0OI4(long j) {
        this.LIZ = j;
        LinkedHashMap<C0OIH<?>, C0OIJ> linkedHashMap = new LinkedHashMap<>();
        this.LIZIZ = linkedHashMap;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
        this.LIZJ = c054gLIZ;
        this.LJ = new C605840NpW(j);
        this.LJFF = C095G.LIZ(Integer.MAX_VALUE, null, 6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [DC] created: bbId=");
        sbLIZ.append(j);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C605860NpY(this, null), 3);
        C0OIH<EnumC617060OIe> c0oih = C0OII.LIZ;
        C2252321DDq c2252321DDqLJI = LJI(c0oih);
        C0OIH<BulletinBoardInfo> c0oih2 = C0OII.LIZJ;
        C2252321DDq c2252321DDqLJI2 = LJI(c0oih2);
        C0OIH<EnumC617010OHz> c0oih3 = C0OII.LIZLLL;
        C2252321DDq c2252321DDqLJI3 = LJI(c0oih3);
        linkedHashMap.put(C0OII.LJ, new C0OIG(C1BNE.LIZ(0L)));
        linkedHashMap.put(C0OII.LJFF, new C0OIG(C1BNE.LIZ(0L)));
        LJI(C0OII.LJI);
        LJI(C0OII.LJII);
        LJI(C0OII.LJIIIIZZ);
        InterfaceC346201Wa<EnumC617480OJu> interfaceC346201WaLJIILL = C09IC.LJIILL(C09IC.LJIIIIZZ(new C05RH(c2252321DDqLJI), new C05RH(c2252321DDqLJI3), new C05RH(c2252321DDqLJI2), new C0OI3(null)));
        this.LJI = interfaceC346201WaLJIILL;
        C0OIH<EnumC617480OJu> c0oih4 = C0OII.LIZIZ;
        final C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        linkedHashMap.put(c0oih4, new C0OIJ(c2252321DDqLIZ) { // from class: X.0OIK
            public final C05YD<Object> LIZ;

            @Override // X.C0OIJ
            public final C05YD<Object> LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = c2252321DDqLIZ;
            }
        });
        C23250099c.LIZLLL(c054gLIZ, null, null, new C605850NpX(interfaceC346201WaLJIILL, c2252321DDqLIZ, c0oih4, null), 3);
        this.LJII = new C455501px<>(new C638950P4j(new InterfaceC346201Wa[]{C0OID.LIZ(this, c0oih).LIZ(), C0OID.LIZ(this, c0oih4).LIZ(), C0OID.LIZ(this, c0oih3).LIZ(), C0OID.LIZ(this, c0oih2).LIZ()}, 5));
    }

    public static String LIZIZ(Object obj) {
        if (obj == null) {
            return "null";
        }
        String string = obj.toString();
        if (string.length() > 200) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, 200));
            sbLIZ.append((char) 8230);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return string;
    }

    public final void LIZ(List<C605890Npb> list) {
        List<C0OI5<?>> listLLIIII;
        Object value;
        Object value2;
        if (list.size() == 1) {
            listLLIIII = ((C605890Npb) ListProtector.get(list, 0)).LIZ;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C605890Npb> it2 = list.iterator();
            while (it2.hasNext()) {
                for (C0OI5<?> c0oi5 : it2.next().LIZ) {
                    if (linkedHashMap.get(c0oi5.LIZ) == null) {
                        linkedHashMap.put(c0oi5.LIZ, c0oi5);
                    } else if (c0oi5.LIZJ == C0OI8.SET) {
                        linkedHashMap.put(c0oi5.LIZ, c0oi5);
                    }
                }
            }
            listLLIIII = C13LP.LLIIII(linkedHashMap.values());
        }
        if (list.size() > 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [DC] merged ");
            sbLIZ.append(list.size());
            sbLIZ.append(" events → ");
            sbLIZ.append(listLLIIII.size());
            sbLIZ.append(" field writes");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (C0OI5<?> c0oi52 : listLLIIII) {
            C0OIJ c0oij = this.LIZIZ.get(c0oi52.LIZ);
            if (c0oij == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BBArch [DC] ERROR: unknown field ");
                sbLIZ2.append(c0oi52.LIZ.LIZ);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            } else if (!(c0oij instanceof C0OIG)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BBArch [DC] ERROR: cannot write derived field ");
                sbLIZ3.append(c0oi52.LIZ.LIZ);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
            } else {
                C0OIH<?> c0oih = c0oi52.LIZ;
                String str = c0oih.LIZ;
                Object obj = c0oi52.LIZIZ;
                if (obj == null) {
                    if (c0oi52.LIZJ == C0OI8.PROPOSE) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("BBArch [DC] PROPOSE null rejected: ");
                        sbLIZ4.append(str);
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ4));
                    } else if (!c0oih.LIZLLL) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("BBArch [DC] ERROR: null set on non-nullable field ");
                        sbLIZ5.append(str);
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ5));
                    } else if (c0oih.LIZJ && (value = ((C0OIG) c0oij).LIZ.getValue()) != null && c0oi52.LIZ.LIZIZ.invoke(value).booleanValue()) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("BBArch [DC] WRITE-ONCE blocked (null set): ");
                        sbLIZ6.append(str);
                        sbLIZ6.append(" (already valid)");
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ6));
                    } else {
                        C0OIG c0oig = (C0OIG) c0oij;
                        Object value3 = c0oig.LIZ.getValue();
                        c0oig.LIZ.setValue(null);
                        if (value3 != null) {
                            this.LJ.LIZ(c0oi52.LIZLLL, str);
                        }
                        LIZLLL(value3, null, "SET null", str);
                    }
                } else if (!c0oih.LIZIZ.invoke(obj).booleanValue()) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("BBArch [DC] FILTERED: ");
                    sbLIZ7.append(str);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ7));
                } else if (c0oi52.LIZ.LIZJ && (value2 = ((C0OIG) c0oij).LIZ.getValue()) != null && c0oi52.LIZ.LIZIZ.invoke(value2).booleanValue()) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("BBArch [DC] WRITE-ONCE blocked: ");
                    sbLIZ8.append(str);
                    sbLIZ8.append(" (already valid)");
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ8));
                } else {
                    int i = C0OIB.LIZ[c0oi52.LIZJ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            C0OIG c0oig2 = (C0OIG) c0oij;
                            if (c0oig2.LIZ.getValue() == null) {
                                c0oig2.LIZ.setValue(obj);
                                this.LJ.LIZ(c0oi52.LIZLLL, str);
                                LIZLLL(null, obj, "PROPOSE accepted", str);
                            } else {
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("BBArch [DC] PROPOSE skipped (already set): ");
                                sbLIZ9.append(str);
                                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ9));
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C0OIG c0oig3 = (C0OIG) c0oij;
                        Object value4 = c0oig3.LIZ.getValue();
                        c0oig3.LIZ.setValue(obj);
                        if (!Intrinsics.LJFF(value4, obj)) {
                            this.LJ.LIZ(c0oi52.LIZLLL, str);
                        }
                        LIZLLL(value4, obj, "SET", str);
                    }
                }
            }
        }
    }

    public final <T> T LIZJ(C0OIH<T> c0oih) {
        C05YD<Object> c05ydLIZ;
        T t;
        C0OIJ c0oij = this.LIZIZ.get(c0oih);
        if (c0oij == null || (c05ydLIZ = c0oij.LIZ()) == null || (t = (T) c05ydLIZ.getValue()) == null) {
            return null;
        }
        return t;
    }

    public final C861640Xr8 LJ(C0OIH c0oih) {
        C0OIJ c0oij = this.LIZIZ.get(c0oih);
        if (c0oij != null) {
            return new C861640Xr8(new C605830NpV(this, c0oih, null), c0oij.LIZ());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown field: ");
        sbLIZ.append(c0oih.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public final void LJFF(Function1<? super C0OI7, Unit> function1) {
        if (this.LIZLLL) {
            C0OPX.LJII("BBArch [DC] update rejected: DC disposed");
            return;
        }
        C0OI7 c0oi7 = new C0OI7();
        function1.invoke(c0oi7);
        if (((ArrayList) c0oi7.LIZ).isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0OI5<?>> list = c0oi7.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C0OI5 c0oi5 : (ArrayList) list) {
            arrayList.add(new C0OI5(c0oi5.LIZ, c0oi5.LIZIZ, c0oi5.LIZJ, jCurrentTimeMillis));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [DC] update: ");
        sbLIZ.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS240S0000000_9.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 31));
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJFF.LJIIIIZZ(new C605890Npb(arrayList)) instanceof C094O) {
            C0OPX.LJII("BBArch [DC] update dropped (channel closed)");
        }
    }

    public final C2252321DDq LJI(C0OIH c0oih) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LIZIZ.put(c0oih, new C0OIG(c2252321DDqLIZ));
        return c2252321DDqLIZ;
    }

    public static void LIZLLL(Object obj, Object obj2, String str, String str2) {
        String str3;
        boolean zLJFF = Intrinsics.LJFF(obj, obj2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [DC] ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        sbLIZ.append(": ");
        sbLIZ.append(LIZIZ(obj));
        sbLIZ.append(" -> ");
        sbLIZ.append(LIZIZ(obj2));
        if (zLJFF) {
            str3 = " (unchanged)";
        } else {
            str3 = "";
        }
        sbLIZ.append(str3);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }
}
