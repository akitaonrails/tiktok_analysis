package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898970zW3 implements InterfaceC1898430zVB {
    public static final C1898970zW3 LIZ = new C1898970zW3();
    public static final List<C1898960zW2> LIZIZ = new ArrayList();
    public static final HashMap<String, Integer> LIZJ = new HashMap<>();
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final HashMap<String, C1898420zVA> LJ = new HashMap<>();

    @Override // X.InterfaceC1898430zVB
    public final void clear() {
        C01U6.LIZIZ(new C1899240zWU());
    }

    public static List LJ(C1898420zVA c1898420zVA) {
        List<C1898960zW2> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            AbstractC1899090zWF abstractC1899090zWF = (AbstractC1899090zWF) obj;
            abstractC1899090zWF.getClass();
            if (c1898420zVA.LIZ()) {
                C1896810zSZ c1896810zSZ = new C1896810zSZ();
                c1896810zSZ.LIZIZ = true;
                String str = c1898420zVA.LIZIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c1896810zSZ.LJ = str;
                String str3 = c1898420zVA.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                c1896810zSZ.LJI = str3;
                String str4 = abstractC1899090zWF.LL.taskEventKey;
                if (str4 != null) {
                    str2 = str4;
                }
                c1896810zSZ.LJFF = str2;
                if (C1898870zVt.LIZ(c1896810zSZ, abstractC1899090zWF.LLILZ)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1898430zVB
    public final boolean LIZ(C1898420zVA c1898420zVA) {
        HashSet<String> hashSet = LIZLLL;
        String str = c1898420zVA.LIZ;
        if (str == null) {
            str = "";
        }
        return !hashSet.contains(str);
    }

    @Override // X.InterfaceC1898430zVB
    public final void LIZJ(C1898420zVA c1898420zVA) {
        C01U6.LIZIZ(new AwS572S0100000_28(c1898420zVA, 32));
    }

    @Override // X.InterfaceC1898430zVB
    public final void LIZLLL(C1898420zVA c1898420zVA) {
        C01U6.LIZIZ(new AwS572S0100000_28(c1898420zVA, 31));
    }

    @Override // X.InterfaceC1898430zVB
    public final void LIZIZ(C1898420zVA c1898420zVA, InterfaceC1899340zWe interfaceC1899340zWe) {
        C01U6.LIZIZ(new AwS429S0200000_28(c1898420zVA, interfaceC1899340zWe, 5));
    }
}
