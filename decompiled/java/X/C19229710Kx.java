package X;

import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19229710Kx {
    public static void LJ(InterfaceC19229810Ky interfaceC19229810Ky) {
        C1910890zpH logger = interfaceC19229810Ky.getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[previous fypCardList] size is ");
        sbLIZ.append(interfaceC19229810Ky.Dz1().size());
        logger.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ));
        LJI(interfaceC19229810Ky, interfaceC19229810Ky.Dz1(), "no_fyp_feed");
        LJI(interfaceC19229810Ky, interfaceC19229810Ky.hX0(), "homepage_hot");
        C1910890zpH logger2 = interfaceC19229810Ky.getLogger();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[new fypCardList] size is ");
        sbLIZ2.append(interfaceC19229810Ky.Dz1().size());
        logger2.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJII(InterfaceC19229810Ky interfaceC19229810Ky) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > interfaceC19229810Ky.LA()) {
            interfaceC19229810Ky.s21(jCurrentTimeMillis + C19990113Jj.LJIIIZ(C19990313Jl.LJII(1, EnumC19990213Jk.DAYS)));
        }
    }

    public static void LIZ(InterfaceC19229810Ky interfaceC19229810Ky, List<C1261860iwS> list) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(list);
        C1910890zpH logger = interfaceC19229810Ky.getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[before filter]tempFYPData size is ");
        sbLIZ.append(copyOnWriteArrayList.size());
        logger.LIZ("BigCardViewModel", C2188811AlT.LIZIZ(sbLIZ));
        final int i = 0;
        if (!copyOnWriteArrayList.isEmpty()) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (C10LJ.LIZJ((C1261860iwS) it2.next()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        final String eventType = interfaceC19229810Ky.getEventType();
        final int size = copyOnWriteArrayList.size();
        new AbstractC1223210hw7(eventType, size, i) { // from class: X.07sW
            public final String LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final String LJ = "big_card_cover_filter_cost";
            public final Map<String, String> LJFF;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2000207sW)) {
                    return false;
                }
                C2000207sW c2000207sW = (C2000207sW) obj;
                return Intrinsics.LJFF(this.LIZIZ, c2000207sW.LIZIZ) && this.LIZJ == c2000207sW.LIZJ && this.LIZLLL == c2000207sW.LIZLLL;
            }

            public final int hashCode() {
                return (((this.LIZIZ.hashCode() * 31) + this.LIZJ) * 31) + this.LIZLLL;
            }

            public final String toString() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BigCardFilterCostTrack(enterFrom=");
                sbLIZ2.append(this.LIZIZ);
                sbLIZ2.append(", userCountTotal=");
                sbLIZ2.append(this.LIZJ);
                sbLIZ2.append(", userCountAfterFilter=");
                sbLIZ2.append(this.LIZLLL);
                sbLIZ2.append(')');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            @Override // X.AbstractC1223210hw7
            public final String LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC1223210hw7
            public final Map<String, String> LIZIZ() {
                return this.LJFF;
            }

            {
                this.LIZIZ = eventType;
                this.LIZJ = size;
                this.LIZLLL = i;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", eventType);
                c2344009Gk.LIZJ(size, "user_count_total");
                c2344009Gk.LIZJ(i, "user_count_after_filter");
                this.LJFF = c2344009Gk.LIZ;
            }
        }.LIZLLL(null);
        if (interfaceC19229810Ky.Js2()) {
            LJI(interfaceC19229810Ky, copyOnWriteArrayList, "no_fyp_feed");
            LJI(interfaceC19229810Ky, copyOnWriteArrayList2, "homepage_hot");
        }
        interfaceC19229810Ky.getLogger().LIZ("BigCardViewModel", "[after filter]tempFYPData size is " + copyOnWriteArrayList.size());
        interfaceC19229810Ky.Dz1().addAll(copyOnWriteArrayList);
        interfaceC19229810Ky.hX0().addAll(copyOnWriteArrayList2);
    }

    public static CopyOnWriteArrayList<C1261860iwS> LIZIZ(InterfaceC19229810Ky interfaceC19229810Ky, String str) {
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            return interfaceC19229810Ky.Dz1();
        }
        return interfaceC19229810Ky.hX0();
    }

    public static boolean LIZJ(C1261860iwS c1261860iwS, String str) {
        C492501vv c492501vv = C492501vv.LIZ;
        String uid = c1261860iwS.getUid();
        c492501vv.getClass();
        Keva kevaLIZIZ = C492501vv.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(uid);
        if (kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L) > System.currentTimeMillis() - C19990113Jj.LJIIIZ(C19990313Jl.LJII(((Number) C0BLT.LIZ.getValue()).intValue(), EnumC19990213Jk.HOURS))) {
            return true;
        }
        return false;
    }

    public static void LJFF(InterfaceC19229810Ky interfaceC19229810Ky, C1261860iwS c1261860iwS) {
        C492501vv c492501vv = C492501vv.LIZ;
        String eventType = interfaceC19229810Ky.getEventType();
        if (!Intrinsics.LJFF(eventType, "homepage_hot")) {
            eventType = "no_fyp_feed";
        }
        String uid = c1261860iwS.getUid();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c492501vv.getClass();
        Keva kevaLIZIZ = C492501vv.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(eventType);
        sbLIZ.append(uid);
        kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
    }

    public static void LJI(final InterfaceC19229810Ky interfaceC19229810Ky, CopyOnWriteArrayList<C1261860iwS> copyOnWriteArrayList, final String str) {
        String str2;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                copyOnWriteArrayList.removeIf(new Predicate() { // from class: X.10Kz
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C1261860iwS c1261860iwS = (C1261860iwS) obj;
                        InterfaceC19229810Ky interfaceC19229810Ky2 = interfaceC19229810Ky;
                        String str3 = str;
                        if (!Intrinsics.LJFF(str3, "homepage_hot")) {
                            str3 = "no_fyp_feed";
                        }
                        if (!interfaceC19229810Ky2.cM0(c1261860iwS, str3) && C10LJ.LIZJ(c1261860iwS)) {
                            return false;
                        }
                        return true;
                    }
                });
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC19229810Ky.getLogger().LIZJ("BigCardViewModel", "Possibly unsupported operation", e);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C1261860iwS c1261860iwS : copyOnWriteArrayList) {
            C1261860iwS c1261860iwS2 = c1261860iwS;
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                str2 = str;
            } else {
                str2 = "no_fyp_feed";
            }
            if (!interfaceC19229810Ky.cM0(c1261860iwS2, str2) && C10LJ.LIZJ(c1261860iwS2)) {
                arrayList.add(c1261860iwS);
            }
        }
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
    }
}
