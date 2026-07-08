package X;

import bnj.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import zmj.j;

/* JADX INFO: renamed from: X.1DGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253011DGh {
    public final a LIZ;
    public final C2253091DGp LIZIZ;
    public final C2253081DGo LIZJ;
    public final C2253191DGz LIZLLL;
    public final j LJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.07s3] */
    public C2253011DGh(C2253061DGm c2253061DGm, C2253181DGy c2253181DGy) {
        a aVar = new a(c2253181DGy);
        this.LIZ = aVar;
        C2253091DGp c2253091DGp = new C2253091DGp(c2253181DGy);
        this.LIZIZ = c2253091DGp;
        C2253081DGo c2253081DGo = new C2253081DGo(c2253181DGy);
        this.LIZJ = c2253081DGo;
        C2253191DGz c2253191DGz = new C2253191DGz(c2253181DGy);
        this.LIZLLL = c2253191DGz;
        j jVar = new j(c2253061DGm, c2253181DGy, new InterfaceC1997507s5() { // from class: X.07s3
            @Override // X.InterfaceC1997507s5
            public final boolean LIZ(List list, Map map) {
                boolean z;
                Iterator it2 = list.iterator();
                while (true) {
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (z2) {
                            if (iIntValue != 0) {
                                if (iIntValue == 1) {
                                    break;
                                }
                                if (iIntValue != 2) {
                                    if (iIntValue != 3) {
                                    }
                                } else {
                                    while (true) {
                                        z = true;
                                        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                            if (!z || ((C1997407s4) entry.getValue()).LIZIZ != EnumC1997207s2.ALLOW_OPEN_MIC) {
                                                z = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    z = true;
                                    for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                                        if (!z || ((C1997407s4) entry2.getValue()).LIZ != EnumC1997107s1.ALLOW_OPEN_CAMERA) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                            if (z) {
                                break;
                            }
                        }
                        z2 = false;
                    }
                    return z2;
                }
            }
        });
        this.LJ = jVar;
        C1997407s4 c1997407s4 = new C1997407s4(EnumC1997107s1.DISALLOW_OPEN_CAMERA, EnumC1997207s2.DISALLOW_OPEN_MIC);
        EnumC1997107s1 enumC1997107s1 = EnumC1997107s1.ALLOW_OPEN_CAMERA;
        EnumC1997207s2 enumC1997207s2 = EnumC1997207s2.ALLOW_OPEN_MIC;
        C1997407s4 c1997407s42 = new C1997407s4(enumC1997107s1, enumC1997207s2);
        C1997407s4 c1997407s43 = new C1997407s4(enumC1997107s1, enumC1997207s2);
        C1997407s4 c1997407s44 = new C1997407s4(enumC1997107s1, enumC1997207s2);
        jVar.LIZ(c1997407s4, aVar);
        jVar.LIZ(c1997407s42, c2253091DGp);
        jVar.LIZ(c1997407s43, c2253081DGo);
        jVar.LIZ(c1997407s44, c2253191DGz);
    }
}
