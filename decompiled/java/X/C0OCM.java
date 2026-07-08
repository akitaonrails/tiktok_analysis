package X;

import Y.ACallableS7S0110100_9;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OCM extends AbstractC1255880imo<Aweme, AddYoursDetailResp> implements C0PDP {
    public final int LL;
    public final String LLILLJJLI;
    public Boolean LLILZLL;
    public int LLIZLLLIL;
    public AddYoursTopic LLJ;
    public final boolean LLJI;
    public final C01GW LLILLL = C1935107i1.LIZ(AFwS195S0000000_9.get$arr$(371));
    public final C01GW LLILZ = C1935107i1.LIZ(AFwS195S0000000_9.get$arr$(372));
    public final List<Aweme> LLILZIL = new ArrayList();
    public AddYoursPagination LLIZ = new AddYoursPagination(0L, 1);

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return new ArrayList(C13LP.LJLIL(Intrinsics.LJFF(this.LLILZLL, Boolean.FALSE) ? (Iterable) this.LLILZ.getValue() : C13BV.INSTANCE, C13LP.LJLIL(this.LLILZIL, (Collection) this.LLILLL.getValue())));
    }

    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        return ((ArrayList) this.LLILZIL).isEmpty();
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        Boolean bool = this.LLILZLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        long jLongValue;
        this.LLIZLLLIL = ((ArrayList) this.LLILZIL).size();
        boolean zLIZIZ = C729980SkG.LIZIZ(this.LLILZIL, aweme, this.mNotifyListeners);
        if (zLIZIZ) {
            AddYoursTopic addYoursTopic = this.LLJ;
            Long videoCount = addYoursTopic.getVideoCount();
            if (videoCount != null) {
                jLongValue = videoCount.longValue();
            } else {
                jLongValue = 1;
            }
            C1440005kM.LIZ(new C0NKE(addYoursTopic.copy(addYoursTopic.topicId, addYoursTopic.text, addYoursTopic.inviterAvatars, addYoursTopic.inviterCount, addYoursTopic.suggestInviteeAvatars, Long.valueOf(jLongValue - 1), addYoursTopic.video, addYoursTopic.fromQuestion, addYoursTopic.collectStatus, addYoursTopic.viewerInvited, addYoursTopic.eoyCampaign, addYoursTopic.eoyCampaignSchema, addYoursTopic.topicType), EnumC615090OAp.VIDEO_DELETION));
        }
        return zLIZIZ;
    }

    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        List<Aweme> list;
        AddYoursPagination addYoursPagination;
        List<Aweme> list2;
        AddYoursDetailResp addYoursDetailResp = (AddYoursDetailResp) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on data come query type: ");
        sbLIZ.append(this.mListQueryType);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = this.mListQueryType;
        Boolean bool = null;
        if (i2 != 1) {
            if (i2 == 4) {
                if (addYoursDetailResp != null) {
                    bool = addYoursDetailResp.hasMore;
                }
                this.LLILZLL = bool;
                if (addYoursDetailResp != null && (list2 = addYoursDetailResp.videos) != null) {
                    ((ArrayList) this.LLILZIL).addAll(list2);
                }
                Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
                while (it2.hasNext()) {
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) it2.next());
                }
            }
        } else {
            C730000SkI.LIZIZ.LIZJ(249372161, 5);
            if (addYoursDetailResp != null) {
                AddYoursTopic addYoursTopic = addYoursDetailResp.topicInfo;
                if (addYoursTopic != null) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C0NJI(addYoursTopic, null), 2);
                }
                bool = addYoursDetailResp.hasMore;
            }
            this.LLILZLL = bool;
            ((ArrayList) this.LLILZIL).clear();
            if (addYoursDetailResp != null && (list = addYoursDetailResp.videos) != null) {
                ((ArrayList) this.LLILZIL).addAll(list);
            }
            Iterator it3 = ((ArrayList) this.LLILZIL).iterator();
            while (it3.hasNext()) {
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) it3.next());
            }
        }
        if (addYoursDetailResp != null && (addYoursPagination = addYoursDetailResp.pagination) != null) {
            this.LLIZ = addYoursPagination;
        }
        this.LLIZLLLIL = ((ArrayList) this.LLILZIL).size();
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        boolean zBooleanValue;
        boolean zLJI = MethodIDManager.LJI(202169);
        Long topicId = this.LLJ.getTopicId();
        if (topicId != null) {
            long jLongValue = topicId.longValue();
            Boolean fromQuestion = this.LLJ.getFromQuestion();
            if (fromQuestion != null) {
                zBooleanValue = fromQuestion.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS7S0110100_9(jLongValue, zBooleanValue, this, 0), 0);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        boolean zBooleanValue;
        Long topicId = this.LLJ.getTopicId();
        if (topicId != null) {
            long jLongValue = topicId.longValue();
            Boolean fromQuestion = this.LLJ.getFromQuestion();
            if (fromQuestion != null) {
                zBooleanValue = fromQuestion.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C730000SkI.LIZIZ.LIZJ(249372161, 4);
            C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS7S0110100_9(jLongValue, zBooleanValue, this, 1), 0);
        }
    }

    public C0OCM(AddYoursTopic addYoursTopic, int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLJI = this.mListQueryType == 1;
        this.LLJ = addYoursTopic;
    }
}
