package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PEG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PEG {
    public static final C0PEG LIZ = new C0PEG();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZIZ);
    public static List<InboxSearchRecentStoreItem> LIZJ = new ArrayList();
    public static List<InboxSearchRecentStoreItem> LIZLLL = new ArrayList();
    public static boolean LJ;
    public static boolean LJFF;

    public static void LIZ() {
        try {
            if (LJ) {
                return;
            }
            List<InboxSearchRecentStoreItem> listLIZJ = JsonParseUtils.LIZJ(InboxSearchRecentStoreItem.class, LIZJ().getString("keyword_repo", JsonParseUtils.LJ(C13BV.INSTANCE)));
            ArrayList arrayList = new ArrayList();
            for (InboxSearchRecentStoreItem inboxSearchRecentStoreItem : listLIZJ) {
                if (inboxSearchRecentStoreItem.type == C0PGF.NORMAL) {
                    arrayList.add(inboxSearchRecentStoreItem);
                }
            }
            LIZJ = new ArrayList(arrayList);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recentKeyWordList init size:");
            sbLIZ.append(((ArrayList) LIZJ).size());
            C1720106oR.LJI("InboxSearchRecentRepository", C2188811AlT.LIZIZ(sbLIZ));
            LJ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("e:");
            sbLIZ2.append(e.getCause());
            C1720106oR.LIZ("InboxSearchRecentRepository", C2188811AlT.LIZIZ(sbLIZ2));
            ((ArrayList) LIZJ).clear();
        }
    }

    public static void LIZIZ() {
        try {
            if (LJFF) {
                return;
            }
            List<InboxSearchRecentStoreItem> listLIZJ = JsonParseUtils.LIZJ(InboxSearchRecentStoreItem.class, LIZJ().getString("user_repo", JsonParseUtils.LJ(C13BV.INSTANCE)));
            ArrayList arrayList = new ArrayList();
            for (InboxSearchRecentStoreItem inboxSearchRecentStoreItem : listLIZJ) {
                C0PGF c0pgf = inboxSearchRecentStoreItem.type;
                if (c0pgf == C0PGF.USER || c0pgf == C0PGF.GROUP) {
                    arrayList.add(inboxSearchRecentStoreItem);
                }
            }
            LIZLLL = new ArrayList(arrayList);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recentUserList init size:");
            sbLIZ.append(((ArrayList) LIZLLL).size());
            C1720106oR.LJI("InboxSearchRecentRepository", C2188811AlT.LIZIZ(sbLIZ));
            LJFF = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("e:");
            sbLIZ2.append(e.getCause());
            C1720106oR.LIZ("InboxSearchRecentRepository", C2188811AlT.LIZIZ(sbLIZ2));
            ((ArrayList) LIZLLL).clear();
        }
    }

    public static Keva LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inbox_search_recent_repo");
        sbLIZ.append(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
