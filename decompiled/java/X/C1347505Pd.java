package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.05Pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1347505Pd {
    public static volatile SessionUnconsumptionItemList LIZLLL;
    public static volatile boolean LJFF;
    public static volatile boolean LJIIIIZZ;
    public static AnonymousClass0956 LJIIIZ;
    public static volatile Aweme LJIIJJI;
    public static final C1347505Pd LIZ = new C1347505Pd();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1347705Pf());
    public static List<SessionUnconsumptionItem> LIZJ = new ArrayList();
    public static volatile List<SessionUnconsumptionItem> LJ = new ArrayList();
    public static final Set<String> LJI = new LinkedHashSet();
    public static final Keva LJII = Keva.getRepo("unconsumed_video_v2");
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C1348005Pi());
    public static String LJIIL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();

    static {
        if (((Boolean) C1347805Pg.LIZ.getValue()).booleanValue()) {
            C0S78.LIZJ(AFwS195S0000000_9.get$arr$(16), true);
        }
    }

    public static InterfaceC497601wk LIZIZ() {
        return (InterfaceC497601wk) LJIIJ.getValue();
    }

    public static void LJ() {
        ArrayList arrayList = (ArrayList) LIZJ;
        LIZLLL = new SessionUnconsumptionItemList(C13LP.LLIIII(arrayList.subList(0, Math.min(50, arrayList.size()))), System.currentTimeMillis() / 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItemList LIZ(int r10) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1347505Pd.LIZ(int):com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItemList");
    }

    public static void LIZJ(Aweme aweme) {
        String aid;
        LJIIJJI = aweme;
        Keva keva = LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIL);
        sbLIZ.append("key_last_consumed_item");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        keva.storeString(strLIZIZ, aid);
    }

    public static void LIZLLL(List list) {
        AnonymousClass0956 anonymousClass0956;
        if (!LJIIIIZZ) {
            AnonymousClass0956 anonymousClass09562 = LJIIIZ;
            if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = LJIIIZ) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJIIIZ = C23250099c.LIZLLL(LIZIZ(), null, null, new C05PX(list, null), 3);
            return;
        }
        LJFF(list);
    }

    public static void LJFF(List list) {
        try {
            Keva keva = LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJIIL);
            sbLIZ.append("key_unconsumed_list_v2");
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ), C105700ad.LIZIZ(new SessionUnconsumptionItemList(list, System.currentTimeMillis() / 1000)));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
