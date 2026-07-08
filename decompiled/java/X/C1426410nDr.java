package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426410nDr {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(51));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(50));

    public final List<C1426450nDv> LIZJ() {
        Object c098200Yq;
        String stringJustDisk = ((Keva) this.LIZ.getValue()).getStringJustDisk(LIZIZ(), "");
        if (stringJustDisk.length() == 0) {
            return new ArrayList();
        }
        try {
            List list = (List) ((Gson) this.LIZIZ.getValue()).LJIIIIZZ(stringJustDisk, new TypeToken<List<? extends C1426450nDv>>() { // from class: X.0nDt
            }.getType());
            c098200Yq = list != null ? new ArrayList(list) : new ArrayList();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMutableHistoryList failed, e = ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C201955140j.LIZLLL(c20012313Rx, "EditEffectSearchHistoryRepo", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List<C1426450nDv> list2 = (List) c098200Yq;
        return list2 == null ? new ArrayList() : list2;
    }

    public static String LIZIZ() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" currentUserHistoryKey = ");
        sbLIZ.append(currentUserID);
        C201955140j.LIZLLL(c20012313Rx, "EditEffectSearchHistoryRepo", C2188811AlT.LIZIZ(sbLIZ));
        return currentUserID;
    }

    public final List<C1426450nDv> LIZ(String str) {
        C1426450nDv c1426450nDv = new C1426450nDv(C13LN.LJZL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, a0.LJLIIIL(str).toString()), C0CHQ.LIZ().getAccountService().getCurrentUserID(), System.currentTimeMillis());
        List<C1426450nDv> listLIZJ = LIZJ();
        Iterator<C1426450nDv> it2 = listLIZJ.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().LIZ, c1426450nDv.LIZ)) {
                if (i >= 0) {
                    ListProtector.remove(listLIZJ, i);
                    ListProtector.add(listLIZJ, 0, c1426450nDv);
                }
            } else {
                i++;
            }
        }
        ListProtector.add(listLIZJ, 0, c1426450nDv);
        if (listLIZJ.size() > 10) {
            ListProtector.remove(listLIZJ, listLIZJ.size() - 1);
        }
        LIZLLL(listLIZJ);
        return listLIZJ;
    }

    public final void LIZLLL(List<C1426450nDv> list) {
        Object c098200Yq;
        try {
            ((Keva) this.LIZ.getValue()).storeStringJustDisk(LIZIZ(), ((Gson) this.LIZIZ.getValue()).LJIILL(list));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIIZ(C20012313Rx.LIZIZ, "EditEffectSearchHistoryRepo", " save history list failed", thM5exceptionOrNullimpl);
        }
    }
}
