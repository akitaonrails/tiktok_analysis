package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19932212ym {
    public static final C19932212ym LJ;
    public static final C19932212ym LJFF;
    public static final C19932212ym LJI;
    public final C19918712wb LIZ;
    public final C19926312xp LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;

    static {
        C19918712wb c19918712wb = C19918812wc.LIZ;
        LJ = new C19932212ym(c19918712wb, C19926312xp.LIZ(), false);
        LJFF = new C19932212ym(c19918712wb, C19926312xp.LIZ(), true);
        C19932212ym c19932212ym = new C19932212ym(c19918712wb, C19926312xp.LIZ(), false);
        c19932212ym.LIZLLL = C19924212xU.LIZ;
        LJI = c19932212ym;
        new ThreadLocal<EnumC1284150jWP>() { // from class: X.0jWQ
            @Override // java.lang.ThreadLocal
            public final EnumC1284150jWP initialValue() {
                return EnumC1284150jWP.ABSTRACT_TO_STRING;
            }
        };
    }

    public static C19932212ym LIZ() {
        ThreadLocal<EnumC19368010py> threadLocal = C19748712On.LIZ;
        if (threadLocal.get() == EnumC19368010py.DEFAULT_FORMAT) {
            boolean z = C19924212xU.LIZ;
            return LJI;
        }
        if (threadLocal.get() == EnumC19368010py.DEBUG_FORMAT) {
            boolean z2 = C19924212xU.LIZ;
            return LJFF;
        }
        boolean z3 = C19924212xU.LIZ;
        return LJ;
    }

    public final String LIZLLL(InterfaceC19933112yv interfaceC19933112yv) {
        try {
            StringBuilder sb = new StringBuilder();
            if (this.LIZJ) {
                try {
                    sb.append((CharSequence) "");
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalStateException(e);
                }
            }
            interfaceC19933112yv.getDescriptorForType();
            LIZIZ(interfaceC19933112yv, new C19933012yu(sb, this.LIZLLL));
            return sb.toString();
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalStateException(e2);
        }
    }

    public final void LIZIZ(InterfaceC19933112yv interfaceC19933112yv, C19933012yu c19933012yu) throws IOException {
        if (interfaceC19933112yv.getDescriptorForType().LLILZ.equals("google.protobuf.Any")) {
            AnonymousClass1301 descriptorForType = interfaceC19933112yv.getDescriptorForType();
            C19939112zt c19939112ztLJIJ = descriptorForType.LJIJ(1);
            C19939112zt c19939112ztLJIJ2 = descriptorForType.LJIJ(2);
            if (c19939112ztLJIJ != null && c19939112ztLJIJ.LJJI() == EnumC19937712zf.STRING && c19939112ztLJIJ2 != null && c19939112ztLJIJ2.LJJI() == EnumC19937712zf.BYTES) {
                String str = (String) interfaceC19933112yv.getField(c19939112ztLJIJ);
                if (!str.isEmpty()) {
                    Object field = interfaceC19933112yv.getField(c19939112ztLJIJ2);
                    try {
                        AnonymousClass1301 anonymousClass1301LIZ = this.LIZ.LIZ(str);
                        if (anonymousClass1301LIZ != null) {
                            C19932412yo c19932412yo = new C19932412yo(C19932512yp.LJ(anonymousClass1301LIZ).LLILLJJLI);
                            c19932412yo.LIZJ((AbstractC19922812xG) field, this.LIZIZ);
                            c19933012yu.LIZLLL(e3.e);
                            c19933012yu.LIZLLL(str);
                            c19933012yu.LIZLLL(e3.f);
                            c19933012yu.LIZIZ();
                            c19933012yu.LIZLLL("{");
                            c19933012yu.LIZ();
                            c19933012yu.LIZIZ.append("  ");
                            LIZIZ(c19932412yo, c19933012yu);
                            c19933012yu.LIZJ();
                            c19933012yu.LIZLLL("}");
                            c19933012yu.LIZ();
                            return;
                        }
                    } catch (C19926612xs e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        for (Map.Entry<C19939112zt, Object> entry : interfaceC19933112yv.getAllFields().entrySet()) {
            C19939112zt key = entry.getKey();
            Object value = entry.getValue();
            if (key.LJJIIJ()) {
                ArrayList<C19932712yr> arrayList = new ArrayList();
                Iterator it2 = ((List) value).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C19932712yr(key, it2.next()));
                }
                Collections.sort(arrayList);
                for (C19932712yr c19932712yr : arrayList) {
                    Object obj = c19932712yr.LLILLJJLI;
                    if (obj == null) {
                        obj = c19932712yr.LL;
                    }
                    LIZJ(key, obj, c19933012yu);
                }
            } else if (key.LJJLJ()) {
                Iterator it3 = ((List) value).iterator();
                while (it3.hasNext()) {
                    LIZJ(key, it3.next(), c19933012yu);
                }
            } else {
                LIZJ(key, value, c19933012yu);
            }
        }
        LJFF(interfaceC19933112yv.getUnknownFields(), c19933012yu, this.LIZJ);
    }

    public C19932212ym(C19918712wb c19918712wb, C19926312xp c19926312xp, boolean z) {
        this.LIZ = c19918712wb;
        this.LIZIZ = c19926312xp;
        this.LIZJ = z;
    }

    public static void LJFF(C19927612y2 c19927612y2, C19933012yu c19933012yu, boolean z) {
        Map mapEmptyMap;
        if (c19927612y2.LL.isEmpty()) {
            return;
        }
        if (c19927612y2.LL.isEmpty()) {
            mapEmptyMap = Collections.emptyMap();
        } else {
            mapEmptyMap = (Map) c19927612y2.LL.clone();
        }
        for (Map.Entry entry : mapEmptyMap.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C19927912y5 c19927912y5 = (C19927912y5) entry.getValue();
            LJ(iIntValue, 0, c19927912y5.LIZ, c19933012yu, z);
            LJ(iIntValue, 5, c19927912y5.LIZIZ, c19933012yu, z);
            LJ(iIntValue, 1, c19927912y5.LIZJ, c19933012yu, z);
            LJ(iIntValue, 2, c19927912y5.LIZLLL, c19933012yu, z);
            for (C19927612y2 c19927612y22 : c19927912y5.LJ) {
                c19933012yu.LIZLLL(((Integer) entry.getKey()).toString());
                c19933012yu.LIZIZ();
                c19933012yu.LIZLLL("{");
                c19933012yu.LIZ();
                c19933012yu.LIZIZ.append("  ");
                LJFF(c19927612y22, c19933012yu, z);
                c19933012yu.LIZJ();
                c19933012yu.LIZLLL("}");
                c19933012yu.LIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C19939112zt r7, java.lang.Object r8, X.C19933012yu r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19932212ym.LIZJ(X.12zt, java.lang.Object, X.12yu):void");
    }

    public static void LJ(int i, int i2, List<?> list, C19933012yu c19933012yu, boolean z) throws IOException {
        String strLJ;
        String strK4;
        String strK42;
        for (Object obj : list) {
            c19933012yu.LIZLLL(String.valueOf(i));
            c19933012yu.LIZLLL(":");
            c19933012yu.LIZIZ();
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 5) {
                                if (z) {
                                    strK42 = C786410Ut5.j4("UNKNOWN_FIXED32 %s", new Object[]{"[REDACTED]"});
                                } else {
                                    strK42 = C786410Ut5.k4(null, "0x%08x", new Object[]{obj});
                                }
                                c19933012yu.LIZLLL(strK42);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Bad tag: ");
                                sbLIZ.append(i2);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            LJFF((C19927612y2) obj, c19933012yu, z);
                        }
                    } else {
                        try {
                            AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
                            C19927612y2 c19927612y2 = C19927612y2.LLILLJJLI;
                            C19927512y1 c19927512y1 = new C19927512y1();
                            try {
                                AbstractC19927312xz abstractC19927312xzNewCodedInput = abstractC19922812xG.newCodedInput();
                                c19927512y1.LJ(abstractC19927312xzNewCodedInput);
                                abstractC19927312xzNewCodedInput.LIZ(0);
                                C19927612y2 c19927612y2Build = c19927512y1.build();
                                c19933012yu.LIZLLL("{");
                                c19933012yu.LIZ();
                                c19933012yu.LIZIZ.append("  ");
                                LJFF(c19927612y2Build, c19933012yu, z);
                                c19933012yu.LIZJ();
                                c19933012yu.LIZLLL("}");
                            } catch (C19926612xs e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw e;
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e2);
                            }
                        } catch (C19926612xs e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            if (z) {
                                c19933012yu.LIZLLL(C786410Ut5.j4("UNKNOWN_STRING %s", new Object[]{"[REDACTED]"}));
                            } else {
                                c19933012yu.LIZLLL("\"");
                                boolean z2 = C19924212xU.LIZ;
                                c19933012yu.LIZLLL(C19854212mC.LIZ((AbstractC19922812xG) obj));
                                c19933012yu.LIZLLL("\"");
                            }
                        }
                    }
                } else {
                    if (z) {
                        strK4 = C786410Ut5.j4("UNKNOWN_FIXED64 %s", new Object[]{"[REDACTED]"});
                    } else {
                        strK4 = C786410Ut5.k4(null, "0x%016x", new Object[]{obj});
                    }
                    c19933012yu.LIZLLL(strK4);
                }
            } else {
                if (z) {
                    strLJ = C786410Ut5.j4("UNKNOWN_VARINT %s", new Object[]{"[REDACTED]"});
                } else {
                    strLJ = C19924212xU.LJ(((Long) obj).longValue());
                }
                c19933012yu.LIZLLL(strLJ);
            }
            c19933012yu.LIZ();
        }
    }
}
