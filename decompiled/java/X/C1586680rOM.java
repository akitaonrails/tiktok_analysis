package X;

import Y.ARunnableS124S0100000_24;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586680rOM {
    public static final C1586680rOM LIZ = new C1586680rOM();
    public static String LIZIZ;
    public static EnumC1586970rOp LIZJ;
    public static volatile long LIZLLL;
    public static NewContentResponse LJ;
    public static Long LJFF;
    public static EnumC1586970rOp LJI;
    public static final C11NJ LJII;
    public static boolean LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final Set<String> LJIIJ;
    public static final Set<String> LJIIJJI;
    public static final Set<String> LJIIL;
    public static final Set<String> LJIILIIL;

    static {
        EnumC1586970rOp enumC1586970rOp = EnumC1586970rOp.UNKNOWN;
        LIZJ = enumC1586970rOp;
        LJI = enumC1586970rOp;
        LJII = new C11NJ();
        LJIIIZ = C452501pT.LIZIZ(new C1586720rOQ());
        LJIIJ = new LinkedHashSet();
        LJIIJJI = new LinkedHashSet();
        LJIIL = new LinkedHashSet();
        LJIILIIL = new LinkedHashSet();
    }

    public static void LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1471928054) {
            if (iHashCode != -1309089240) {
                if (iHashCode == -734952021 && str.equals("FRIENDS_TAB")) {
                    LJIIJJI.clear();
                    LJIIJ.clear();
                    LJIILIIL.clear();
                    LJIIL.clear();
                    return;
                }
                return;
            }
            if (!str.equals("FRIENDS_FEED")) {
                return;
            }
            LJIIJJI.clear();
            LJIIJ.clear();
            return;
        }
        if (!str.equals("REPOST_FEED")) {
            return;
        }
        LJIILIIL.clear();
        LJIIL.clear();
    }

    public static void LIZIZ(int i, Aweme aweme) {
        boolean zLJI = MethodIDManager.LJI(137901);
        ArrayList arrayList = new ArrayList();
        if (LJIIJJI.contains(aweme.getAid()) && (!C296600Bju.LIZ() || (C296600Bju.LIZ() && i != 31))) {
            Set<String> set = LJIIJ;
            boolean zRemove = set.remove(aweme.getAid());
            C797820VRk.LIZIZ.LIZIZ(new C0VNJ(aweme.getAwemeType(), aweme.getAid(), false, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), System.currentTimeMillis(), System.currentTimeMillis()));
            arrayList.add(new C1587090rP1("FRIENDS_FEED", set.size(), zRemove ? 1 : 0));
        }
        if (LJIILIIL.contains(aweme.getAid()) && (!C296600Bju.LIZ() || (C296600Bju.LIZ() && i != 195))) {
            Set<String> set2 = LJIIL;
            arrayList.add(new C1587090rP1("REPOST_FEED", set2.size(), set2.remove(aweme.getAid()) ? 1 : 0));
        }
        if (!arrayList.isEmpty()) {
            C2252408s6.LJII(new AwS425S0200000_24((List) arrayList, (List<C1587090rP1>) aweme, (Aweme) 72));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZJ(EnumC1586970rOp enumC1586970rOp, Function0 function0) {
        boolean zLJI = MethodIDManager.LJI(202142);
        if (LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is requesting, ignore the source of ");
            sbLIZ.append(enumC1586970rOp);
            C2188811AlT.LIZIZ(sbLIZ);
            C1586690rON.LIZ.getClass();
            C1586690rON.LIZ("is_requesting", enumC1586970rOp);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("try to request red dot in source of ");
        sbLIZ2.append(enumC1586970rOp);
        C2188811AlT.LIZIZ(sbLIZ2);
        Pair<Boolean, String> pairLJIJ = C1586750rOT.LIZ().LJIJ(enumC1586970rOp);
        boolean zBooleanValue = pairLJIJ.getFirst().booleanValue();
        String second = pairLJIJ.getSecond();
        if (zBooleanValue) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("the request was intercept,reason:");
            sbLIZ3.append(second);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1586690rON.LIZ.getClass();
            C1586690rON.LIZ(second, enumC1586970rOp);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LJIIIIZZ = true;
        if (((Number) C296320BjS.LIZ.getValue()).intValue() >= 1 && LIZLLL == 0) {
            LIZLLL = SystemClock.elapsedRealtime();
        }
        if (function0 != null) {
            function0.invoke();
        }
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(enumC1586970rOp, 1751);
        if ((((Number) C296340BjU.LIZ.getValue()).intValue() & 1) == 1) {
            awS568S0100000_24.invoke();
        } else {
            C823050WQl.LIZLLL().execute(new ARunnableS124S0100000_24(awS568S0100000_24, 140));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
