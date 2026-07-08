package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS72S1300000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Yvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889930Yvf {
    public static boolean LIZJ;
    public static volatile Pair<String, ? extends C05RV> LIZLLL;
    public static Pair<? extends Pair<String, ? extends C05RV>, ? extends List<? extends FilterTabType>> LJ;
    public static C889900Yvc LJI;
    public static AnonymousClass0956 LJII;
    public static final C889930Yvf LIZ = new C889930Yvf();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C889920Yve());
    public static final C2252331DDr LJFF = C09IR.LIZIZ(1, 0, null, 6);
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C889960Yvi());

    public static C890070Yvt LJIIIIZZ() {
        return (C890070Yvt) LJIIIIZZ.getValue();
    }

    public final C05RV LIZJ() {
        Pair pairLJIILIIL;
        C05RV second;
        Pair<String, ? extends C05RV> pair = LIZLLL;
        if (pair != null && (second = pair.getSecond()) != null) {
            return second;
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        synchronized (this) {
            pairLJIILIIL = LIZLLL;
            if (pairLJIILIIL == null || !Intrinsics.LJFF(pairLJIILIIL.getFirst(), strLIZIZ)) {
                pairLJIILIIL = LJIILIIL(strLIZIZ);
                LIZLLL = pairLJIILIIL;
                C622680Oba.LIZJ(LIZ);
            }
        }
        return (C05RV) pairLJIILIIL.getSecond();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:11:0x001d, B:13:0x0021, B:17:0x0030, B:19:0x0038, B:46:0x00db, B:47:0x00e1, B:49:0x00e7, B:50:0x00f6, B:26:0x004f, B:27:0x0054, B:28:0x0055, B:29:0x0062, B:31:0x0068, B:33:0x0079, B:34:0x007d, B:35:0x008e, B:37:0x0094, B:39:0x00a5, B:40:0x00a9, B:42:0x00bd, B:43:0x00c2, B:45:0x00d5), top: B:56:0x001d }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List<com.ss.android.ugc.aweme.inbox.filter.FilterTabType>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.inbox.filter.FilterTabType> LJFF() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889930Yvf.LJFF():java.util.List");
    }

    public final C05RV LIZLLL() {
        return LJIIJ(this) ? C05RV.PRO_CREATOR_INBOX : C05RV.PERSONAL_INBOX;
    }

    public final Pair<FilterTabType, Set<EnumC880480YgQ>> LJI() {
        int i = C05RY.LIZ[LIZJ().ordinal()];
        if (i == 1) {
            return new Pair<>(FilterTabType.PRIMARY, Collections.singleton(EnumC880480YgQ.PRIMARY));
        }
        if (i == 2) {
            return new Pair<>(FilterTabType.ALL_FOR_BUSINESS, Collections.singleton(EnumC880480YgQ.ALL_FOR_BUSINESS));
        }
        if (i == 3) {
            return new Pair<>(FilterTabType.OVERALL, Collections.singleton(EnumC880480YgQ.ALL));
        }
        throw new C1954807lC();
    }

    public final Pair<FilterTabType, Set<EnumC880480YgQ>> LJII() {
        C886330Ypr c886330YprLIZJ;
        if (LIZJ() == C05RV.BUSINESS_INBOX && C890110Yvx.LIZIZ.LJI() == 3) {
            IMChatListApi.LJJIII.getClass();
            Pair pair = (Pair) C890330YwJ.LIZ().LJIIIZ().LIZ().getValue();
            if (((pair != null && (c886330YprLIZJ = (C886330Ypr) pair.getFirst()) != null) || (c886330YprLIZJ = C890330YwJ.LIZ().LJIIIZ().LIZJ()) != null) && c886330YprLIZJ.LIZ > 0) {
                return new Pair<>(FilterTabType.UNREAD, Collections.singleton(EnumC880480YgQ.UNREAD));
            }
        }
        return LJI();
    }

    public final boolean LJIIIZ() {
        return LIZJ() == C05RV.PRO_CREATOR_INBOX;
    }

    public final boolean LJIIJJI() {
        return LIZJ() != C05RV.PERSONAL_INBOX;
    }

    public final boolean LJIIL() {
        int i = C05RY.LIZ[LIZJ().ordinal()];
        return i == 1 || i == 2;
    }

    public static boolean LJIIJ(C889930Yvf c889930Yvf) {
        c889930Yvf.getClass();
        if (!C890080Yvu.LIZIZ.LIZJ(false) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        return true;
    }

    public final List<EnumC880480YgQ> LJ(List<? extends FilterTabType> list) {
        int i = C05RY.LIZ[LIZJ().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return C13BV.INSTANCE;
            }
            throw new C1954807lC();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends FilterTabType> it2 = list.iterator();
        while (it2.hasNext()) {
            EnumC880480YgQ enumC880480YgQLIZJ = C880600Ygc.LIZJ(it2.next());
            if (enumC880480YgQLIZJ != null) {
                arrayList.add(enumC880480YgQLIZJ);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, X.C05RV> LJIILIIL(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889930Yvf.LJIILIIL(java.lang.String):kotlin.Pair");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserUpdateEvent(C1434905jX c1434905jX) {
        String first;
        Pair<String, ? extends C05RV> pair;
        String str = c1434905jX.LIZ;
        Pair<String, ? extends C05RV> pair2 = LIZLLL;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        if (Intrinsics.LJFF(str, first) && Intrinsics.LJFF(c1434905jX.LIZ, C461720I8s.LIZIZ()) && (pair = LIZLLL) != null && pair.getSecond() != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05RR(c1434905jX, null), 3);
        }
    }

    public static void LJIILJJIL(C05RV c05rv, String str) {
        C05RV second;
        Pair<String, ? extends C05RV> pair = LIZLLL;
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        Pair<String, ? extends C05RV> pair2 = new Pair<>(C461720I8s.LIZIZ(), c05rv);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryHandleInboxModeSwitch, oldMode: ");
        sbLIZ.append(second);
        sbLIZ.append(", newMode: ");
        sbLIZ.append(pair2.getSecond());
        sbLIZ.append(", enterMethod: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (second == pair2.getSecond()) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC889970Yvj) it2.next()).QH0();
        }
        LIZLLL = pair2;
        Iterator it3 = ((CopyOnWriteArrayList) LIZIZ.getValue()).iterator();
        while (it3.hasNext()) {
            ((InterfaceC889970Yvj) it3.next()).eV0();
        }
        if (str != null) {
            C889930Yvf c889930Yvf = LIZ;
            C05RV second2 = pair2.getSecond();
            c889930Yvf.getClass();
            if (second != null) {
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_method", str), new Pair("from_mode", second.getMobValue()), new Pair("to_mode", second2.getMobValue()));
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("inbox_mode_switch", mapLJIIIIZZ);
            }
        }
    }

    public static void LIZ(C05RV c05rv, String str, Function1 function1) {
        boolean z;
        AnonymousClass0956 anonymousClass0956;
        Long lValueOf = Long.valueOf(C461720I8s.LIZJ());
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeInboxMode(), toMode: ");
        sbLIZ.append(c05rv);
        sbLIZ.append(", currentModeWithUid: ");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(", enterMethodForMob: ");
        sbLIZ.append(str);
        sbLIZ.append(", requestJobNotComplete: ");
        AnonymousClass0956 anonymousClass09562 = LJII;
        if (anonymousClass09562 != null && !anonymousClass09562.isCompleted()) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C1720106oR.LJI("ProfessionalInboxManager", C2188811AlT.LIZIZ(sbLIZ));
        if (lValueOf == null || ((anonymousClass0956 = LJII) != null && !anonymousClass0956.isCompleted())) {
            C0CNO.LIZLLL(0L, new AwS546S0100000_2(function1, (Function1<? super Boolean, Unit>) 1006));
            return;
        }
        if (c05rv == C05RV.BUSINESS_INBOX) {
            PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
            Map<String, Integer> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("dm_setting_potential_connection", 1), new Pair("dm_setting_others", 1));
            if (!mapLJIIIIZZ.isEmpty()) {
                for (Map.Entry<String, Integer> entry : mapLJIIIIZZ.entrySet()) {
                    if (imPrivacySettings.LJIIIZ(entry.getKey()) != entry.getValue().intValue()) {
                        imPrivacySettings.LJJIFFI(mapLJIIIIZZ, C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS72S1300000_2(lValueOf, (Long) c05rv, (C05RV) str, (String) function1, (Function1<? super Boolean, Unit>) 6), new AwS581S0100000_2(function1, (Function1<Object, String>) 447), true);
                        return;
                    }
                }
            }
            LJIILL(lValueOf.longValue(), c05rv, str, function1);
            return;
        }
        LJIILL(lValueOf.longValue(), c05rv, str, function1);
    }

    public static void LJIILL(long j, C05RV c05rv, String str, Function1 function1) {
        LJII = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05RQ(c05rv, j, str, function1, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r18, X.C05RV r19, int r20, java.lang.String r21, X.InterfaceC1364105Vn<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C889930Yvf.LIZIZ(java.lang.String, X.05RV, int, java.lang.String, X.05Vn):java.lang.Object");
    }
}
