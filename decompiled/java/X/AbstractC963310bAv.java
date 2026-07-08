package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC963310bAv extends AbstractC962030b8r {
    @Override // X.AbstractC962030b8r
    public void LJIILLIIL() {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        LJIIL(C1516000pYM.LIZJ(arrayList), "uid_list", true);
        LJIIL(Integer.valueOf(arrayList.size()), "linked_count", true);
        LJIIL(Long.valueOf(C950220apo.LJ()), "current_anchor_id", true);
        LJIIL(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL(), "overload_score", true);
    }

    public static long LJJI(AbstractC982800bgM abstractC982800bgM) {
        BaseMessage baseMessage;
        Object obj = abstractC982800bgM.LIZIZ;
        if ((obj instanceof CompetitionMessage) && (baseMessage = (BaseMessage) obj) != null) {
            return baseMessage.receiveTime - baseMessage.baseMessage.createTime;
        }
        return 0L;
    }

    public final void LJIL(AbstractC982800bgM abstractC982800bgM) {
        AbstractC1136060ffY abstractC1136060ffY;
        Object obj = abstractC982800bgM.LIZIZ;
        if ((obj instanceof CompetitionMessage) && (abstractC1136060ffY = (AbstractC1136060ffY) obj) != null) {
            LJIILL(abstractC1136060ffY);
        }
    }

    public static void LJJ(AbstractC963310bAv abstractC963310bAv, EnumC962960bAM enumC962960bAM) {
        abstractC963310bAv.getClass();
        EnumC962960bAM.Companion.getClass();
        abstractC963310bAv.LJIIL(C962950bAL.LIZJ(enumC962960bAM), "match_type", true);
    }
}
