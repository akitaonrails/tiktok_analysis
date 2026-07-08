package Y;

import X.C05QT;
import X.C09JN;
import X.C0PEM;
import X.C1197704mN;
import X.C12998056u;
import X.C13003056z;
import X.C1461005nk;
import X.C1C7U;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C727890Sgt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AfS32S1000000_2 implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public AfS32S1000000_2(int i) {
        this.$t = i;
        this.s0 = "syncPeriodic";
    }

    public AfS32S1000000_2(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS32S1000000_2 afS32S1000000_2, Object obj) {
        String str;
        C1C7U.LIZ("BioTranslationObject@ac0b.requestTranslation$1");
        TranslationResult translationResult = (TranslationResult) obj;
        String str2 = afS32S1000000_2.s0;
        if (translationResult != null) {
            str = translationResult.translatedContent;
        } else {
            str = null;
        }
        Map<String, String> map = C1197704mN.LIZ;
        if (map.size() >= 10) {
            ((LinkedHashMap) map).clear();
        }
        if (str != null) {
            map.put(str2, str);
        }
        C1C7U.LIZIZ("BioTranslationObject@ac0b.requestTranslation$1");
    }

    public static final void accept$1(AfS32S1000000_2 afS32S1000000_2, Object obj) {
        C1C7U.LIZ("GlobalAppSyncManager@2ef9.fullBatchSyncWith$1$disp$2");
        Throwable th = (Throwable) obj;
        synchronized (C12998056u.LIZIZ) {
            try {
                C12998056u.LIZJ = null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS32S1000000_2.s0);
        sbLIZ.append(": batchSync failed: ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C13003056z.LIZ.LIZJ(true);
        C1C7U.LIZIZ("GlobalAppSyncManager@2ef9.fullBatchSyncWith$1$disp$2");
    }

    public static final void accept$2(AfS32S1000000_2 afS32S1000000_2, Object obj) {
        C1C7U.LIZ("StoryFeedService@825.reportStoryViewed$1");
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("succeeded for ");
        sbLIZ.append(afS32S1000000_2.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LJ("reportViewed", strLIZIZ);
        C1C7U.LIZIZ("StoryFeedService@825.reportStoryViewed$1");
    }

    public static final void accept$3(AfS32S1000000_2 afS32S1000000_2, Object obj) {
        C1C7U.LIZ("StoryFeedService@825.reportStoryViewed$2");
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed for ");
        sbLIZ.append(afS32S1000000_2.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZJ("reportViewed", strLIZIZ, (Throwable) obj);
        C1C7U.LIZIZ("StoryFeedService@825.reportStoryViewed$2");
    }

    public static final void accept$4(AfS32S1000000_2 afS32S1000000_2, Object obj) {
        C1C7U.LIZ("GroupMemberUtil@7ee8.addMemberToCache$2");
        C1461005nk c1461005nk = C1461005nk.LIZ;
        C05QT c05qt = C05QT.ADD_MEMBER;
        String str = afS32S1000000_2.s0;
        c1461005nk.getClass();
        C1461005nk.LJIIJ(c05qt, str, (List) obj);
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.addMemberToCache$2");
    }

    public static final void accept$5(AfS32S1000000_2 afS32S1000000_2, Object obj) {
        C1C7U.LIZ("GroupMemberUtil@7ee8.fetchMemberInfo$2");
        List list = (List) obj;
        C1461005nk c1461005nk = C1461005nk.LIZ;
        C05QT c05qt = C05QT.FETCH_MEMBER_INFO;
        String str = afS32S1000000_2.s0;
        c1461005nk.getClass();
        C1461005nk.LJIIJ(c05qt, str, list);
        C1461005nk.LJI(afS32S1000000_2.s0, list, C0PEM.LIZJ, C2107308Nj.LIZ);
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.fetchMemberInfo$2");
    }
}
