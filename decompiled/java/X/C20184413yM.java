package X;

import Y.ARunnableS77S0200000_8;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS274S0300000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20184413yM {
    public static final C570710MZx LJ = new C570710MZx();
    public static volatile C20184413yM LJFF;
    public final C20182913y7 LIZ;
    public final C20184013yI LIZIZ;
    public final C20184713yP LIZJ;
    public final ConcurrentHashMap<String, C20184113yJ> LIZLLL;

    public C20184413yM() {
        new C20183313yB();
        this.LIZ = new C20182913y7();
        this.LIZIZ = new C20184013yI();
        this.LIZJ = new C20184713yP();
        this.LIZLLL = new ConcurrentHashMap<>();
    }

    public static C12EI LIZIZ() {
        C0WYK c0wykLJIILLIIL = C0WYJ.LJIILLIIL(C1BWL.LIZ());
        return new C12EI(c0wykLJIILLIIL.LIZIZ, c0wykLJIILLIIL.LIZ, c0wykLJIILLIIL.LJ);
    }

    public final C20184113yJ LIZ(AwemeDraft awemeDraft, EnumC19355810o0 enumC19355810o0, C12EI c12ei) {
        float f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C20183913yH> listLIZLLL = this.LIZ.LIZLLL(awemeDraft, Long.valueOf(c12ei.LIZ));
        Iterator<C20183913yH> it2 = listLIZLLL.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().LJ;
        }
        String strLIZ = C2400309ar.LIZ(awemeDraft);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C20183913yH c20183913yH : listLIZLLL) {
            EnumC19373010qm enumC19373010qm = c20183913yH.LJIIIZ;
            Object arrayList = linkedHashMap.get(enumC19373010qm);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(enumC19373010qm, arrayList);
            }
            ((List) arrayList).add(c20183913yH);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("count", Integer.valueOf(list.size()));
            Iterator it3 = list.iterator();
            long j2 = 0;
            while (it3.hasNext()) {
                j2 += ((C20183913yH) it3.next()).LJ;
            }
            pairArr[1] = new Pair("totalSize", Long.valueOf(j2));
            linkedHashMap2.put(key, C2097608Jq.LJIIIIZZ(pairArr));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Collected ");
        sbLIZ.append(listLIZLLL.size());
        sbLIZ.append(" files:");
        C20183113y9.LJIIIIZZ("DraftFileSizeMonitor", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key2 = entry2.getKey();
            Map map = (Map) entry2.getValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("  ");
            sbLIZ2.append(key2);
            sbLIZ2.append(": ");
            sbLIZ2.append(map.get("count"));
            sbLIZ2.append(" files, ");
            sbLIZ2.append(map.get("totalSize"));
            sbLIZ2.append(" bytes");
            C20183113y9.LJIIIIZZ("DraftFileSizeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        }
        String strLIZ2 = awemeDraft.LIZ();
        if (strLIZ2 == null) {
            strLIZ2 = "unknown";
        }
        int i = awemeDraft.LIZJ;
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int size = listLIZLLL.size();
        long j3 = c12ei.LIZ;
        if (j3 > 0) {
            f = (j / j3) * 100;
        } else {
            f = 0.0f;
        }
        return new C20184113yJ(strLIZ2, i, jCurrentTimeMillis3, enumC19355810o0, new C20184813yQ(size, j, f, strLIZ), listLIZLLL, new C20185013yS(listLIZLLL.size(), jCurrentTimeMillis2), LIZIZ());
    }

    public final void LIZJ(AwemeDraft awemeDraft, EnumC570650MZr enumC570650MZr, InterfaceC20184613yO interfaceC20184613yO) {
        boolean z;
        if (!C2540409xS.LIZIZ()) {
            return;
        }
        String strLIZ = awemeDraft.LIZ();
        if (strLIZ != null && strLIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20183113y9.LJIIJ("DraftFileSizeMonitor", "Invalid draft for monitoring");
            return;
        }
        int i = C570660MZs.LIZ[enumC570650MZr.ordinal()];
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown monitoring stage: ");
                    sbLIZ.append(enumC570650MZr);
                    C20183113y9.LJIIJ("DraftFileSizeMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C20184713yP c20184713yP = this.LIZJ;
                c20184713yP.LIZ.execute(new ARunnableS77S0200000_8(c20184713yP, (C20184713yP) new AwS274S0300000_30(this, awemeDraft, interfaceC20184613yO, 7), (Function0<Unit>) new AwS609S0100000_30(interfaceC20184613yO, 137), (Function1<? super Throwable, Unit>) 27));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Recording file operation for draft: ");
            sbLIZ2.append(awemeDraft.LIZ());
            C20183113y9.LIZ("DraftFileSizeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C20184713yP c20184713yP2 = this.LIZJ;
        c20184713yP2.LIZ.execute(new ARunnableS77S0200000_8(c20184713yP2, (C20184713yP) new AwS274S0300000_30(this, awemeDraft, interfaceC20184613yO, 9), (Function0<Unit>) new AwS609S0100000_30(interfaceC20184613yO, 139), (Function1<? super Throwable, Unit>) 27));
    }

    public final void LIZLLL(AwemeDraft awemeDraft, EnumC570650MZr enumC570650MZr, InterfaceC20184613yO interfaceC20184613yO) {
        boolean z;
        if (!C2540409xS.LIZIZ()) {
            return;
        }
        String strLIZ = awemeDraft.LIZ();
        if (strLIZ != null && strLIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20183113y9.LJIIJ("DraftFileSizeMonitor", "Invalid draft for monitoring");
            return;
        }
        int i = C570660MZs.LIZ[enumC570650MZr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown monitoring stage: ");
                    sbLIZ.append(enumC570650MZr);
                    C20183113y9.LJIIJ("DraftFileSizeMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C20184713yP c20184713yP = this.LIZJ;
                c20184713yP.LIZ.execute(new ARunnableS77S0200000_8(c20184713yP, (C20184713yP) new AwS274S0300000_30(this, awemeDraft, interfaceC20184613yO, 8), (Function0<Unit>) new AwS609S0100000_30(interfaceC20184613yO, 138), (Function1<? super Throwable, Unit>) 27));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Recording file operation for draft: ");
            sbLIZ2.append(awemeDraft.LIZ());
            C20183113y9.LIZ("DraftFileSizeMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C20184713yP c20184713yP2 = this.LIZJ;
        c20184713yP2.LIZ.execute(new ARunnableS77S0200000_8(c20184713yP2, (C20184713yP) new AwS274S0300000_30(this, awemeDraft, interfaceC20184613yO, 10), (Function0<Unit>) new AwS609S0100000_30(interfaceC20184613yO, 140), (Function1<? super Throwable, Unit>) 27));
    }
}
