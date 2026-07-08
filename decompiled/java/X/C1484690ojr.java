package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0ojr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484690ojr {
    public static final C1484690ojr LIZ = new C1484690ojr();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(556));

    public static void LIZ(String str) {
        if (C07HM.LIZ) {
            if (str == null) {
                return;
            }
            C0IS3 c0is3 = new C0IS3();
            c0is3.LIZ = str;
            c0is3.LIZJ = "ONLY_LIST_PRELOAD";
            ((InterfaceC468940IaC) LIZIZ.getValue()).LIZIZ(c0is3);
            return;
        }
        C1478160oZK.LIZ().LJJJI(str, null);
    }

    public static void LIZJ(String str) {
        if (C07HM.LIZ) {
            C0IS1 c0is1LIZ = ((InterfaceC468940IaC) LIZIZ.getValue()).LIZ(str);
            if (c0is1LIZ != null) {
                c0is1LIZ.LIZJ();
                return;
            }
            return;
        }
        C1478160oZK.LIZ().LJJJ(str);
    }

    public static void LIZIZ(List list, boolean z, boolean z2, String str, String str2, boolean z3) {
        InterfaceC676420Qg4 interfaceC676420Qg4;
        if (str != null && list != null) {
            if (C07HM.LIZ) {
                C0IS1 c0is1LIZ = ((InterfaceC468940IaC) LIZIZ.getValue()).LIZ(str);
                if (c0is1LIZ != null && (interfaceC676420Qg4 = (InterfaceC676420Qg4) c0is1LIZ.LIZLLL()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme = (Aweme) it2.next();
                        LIZ.getClass();
                        C1482580ogS c1482580ogS = new C1482580ogS();
                        c1482580ogS.LIZ = aweme.getAid();
                        c1482580ogS.LJI = C1483340ohg.LJFF(aweme);
                        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
                        c1058540deW.LIZIZ = aweme.getAid();
                        C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
                        c1482580ogSLIZ.getClass();
                        arrayList.add(new C1484680ojq(c1482580ogSLIZ).LIZ());
                    }
                    interfaceC676420Qg4.LJIIIIZZ(str, arrayList);
                    return;
                }
                return;
            }
            C1483340ohg.LIZ(list, z, z2, str, z3, str2);
        }
    }
}
