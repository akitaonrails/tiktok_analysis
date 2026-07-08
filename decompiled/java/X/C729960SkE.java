package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729960SkE extends C1619110sEf implements InterfaceC19330810jy {
    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return new int[]{35, 2486, 2496, 2479};
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        return null;
    }

    public static JSONObject LJIILIIL(String str) {
        try {
            if (str == null) {
                str = "{}";
            }
            return new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static User LJIILJJIL(InnerPushMessage innerPushMessage) {
        List<User> list;
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate == null || (list = uiTemplate.fromUsers) == null || list.size() <= 0 || list == null) {
            return null;
        }
        return (User) ListProtector.get(list, 0);
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        IStoryRevealService iStoryRevealService;
        Integer numValueOf;
        if (innerPushMessage == null) {
            return;
        }
        int type = innerPushMessage.getType();
        if ((type == 2496 || type == 2479 || type == 2486) && (iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null)) != null) {
            iStoryRevealService.LJIIIIZZ();
        }
        User userLJIILJJIL = LJIILJJIL(innerPushMessage);
        JSONObject jSONObjectLJIILIIL = LJIILIIL(innerPushMessage.getBizExtraJsonStr());
        Object objOpt = jSONObjectLJIILIIL.opt("itemID");
        Object objOpt2 = jSONObjectLJIILIIL.opt("fromUserID");
        C0LAB c0lab = new C0LAB();
        String label = innerPushMessage.getLabel();
        if (label == null) {
            label = "inner_social_push_story_post";
        }
        c0lab.LJ("enter_from", label);
        String label2 = innerPushMessage.getLabel();
        if (label2 == null) {
            label2 = "video_cover";
        }
        c0lab.LJ("enter_method", label2);
        c0lab.LIZLLL(objOpt, "group_id");
        c0lab.LIZLLL(objOpt2, "author_id");
        C735840Sti.LIZ.getClass();
        c0lab.LIZ(C735840Sti.LJIIIIZZ(userLJIILJJIL), "follow_status");
        if (userLJIILJJIL != null) {
            numValueOf = Integer.valueOf(userLJIILJJIL.getFollowStatusRelation());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "follow_status_relation");
        C20684815ws.LJIILLIIL("story_show", c0lab.LIZ);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return C1601110rld.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        String strLIZ;
        boolean z;
        Object c098200Yq;
        List<Aweme> stories;
        Aweme aweme;
        UserStory userStory;
        String strLJJIFFI;
        String str;
        if (!C1601110rld.LIZ()) {
            return false;
        }
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null) {
            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
            if (uiTemplate2 != null && (str = uiTemplate2.globalSchemaUrl) != null) {
                strLJJIFFI = u.LJJIFFI(str, "aweme://story/inapppush", "aweme://story/detail", true);
            } else {
                strLJJIFFI = null;
            }
            uiTemplate.setGlobalSchemaUrl(strLJJIFFI);
        }
        JSONObject jSONObjectLJIILIIL = LJIILIIL(innerPushMessage.getBizExtraJsonStr());
        String strOptString = jSONObjectLJIILIIL.optString("itemID");
        String strOptString2 = jSONObjectLJIILIIL.optString("fromUserID");
        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
            String string = Collections.singletonList(strOptString2).toString();
            try {
                strLIZ = C728840SiQ.LIZ(new InsertStory(CastLongProtector.parseLong(strOptString2), CastLongProtector.parseLong(strOptString)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJ(e.getMessage());
                strLIZ = "";
            }
            try {
                UserStoriesResponse userStoriesResponse = (UserStoriesResponse) C728370Shf.LIZ(C728370Shf.LIZ, string, strLIZ, 0, null, 12).LJ();
                List<Aweme> awemes = userStoriesResponse.getAwemes();
                if (awemes != null) {
                    C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZ(awemes, userStoriesResponse.extra.logid, null, true);
                }
                List<Aweme> awemes2 = userStoriesResponse.getAwemes();
                if (awemes2 == null || (aweme = (Aweme) C13LP.LJJJLZIJ(0, awemes2)) == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null) {
                    stories = C13BV.INSTANCE;
                }
                if (!(stories instanceof Collection) || !stories.isEmpty()) {
                    Iterator<Aweme> it2 = stories.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getAid(), strOptString)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                try {
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C614770O9j.LIZIZ.LJ().LJIILLIIL("fyp_card", thM5exceptionOrNullimpl, C2097608Jq.LJIIIIZZ(new Pair("api_path", "story/get_user_stories"), new Pair("checkpoint", "StoryInnerPushHandler#getInAppPushStoryValidOpt")));
                return true;
            }
            return z;
        }
        return C1601110rld.LIZ();
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        IStoryRevealService iStoryRevealService;
        Integer numValueOf;
        if (innerPushMessage == null) {
            return;
        }
        int type = innerPushMessage.getType();
        if ((type == 2496 || type == 2479 || type == 2486) && (iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null)) != null) {
            iStoryRevealService.LJII();
        }
        User userLJIILJJIL = LJIILJJIL(innerPushMessage);
        JSONObject jSONObjectLJIILIIL = LJIILIIL(innerPushMessage.getBizExtraJsonStr());
        Object objOpt = jSONObjectLJIILIIL.opt("itemID");
        Object objOpt2 = jSONObjectLJIILIIL.opt("fromUserID");
        C0LAB c0lab = new C0LAB();
        String label = innerPushMessage.getLabel();
        if (label == null) {
            label = "inner_social_push_story_post";
        }
        c0lab.LJ("enter_from", label);
        String label2 = innerPushMessage.getLabel();
        if (label2 == null) {
            label2 = "video_cover";
        }
        c0lab.LJ("enter_method", label2);
        c0lab.LIZLLL(objOpt, "group_id");
        c0lab.LIZLLL(objOpt2, "author_id");
        Integer numValueOf2 = null;
        if (userLJIILJJIL != null) {
            numValueOf = Integer.valueOf(userLJIILJJIL.getFollowStatus());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "follow_status");
        if (userLJIILJJIL != null) {
            numValueOf2 = Integer.valueOf(userLJIILJJIL.getFollowStatusRelation());
        }
        c0lab.LIZLLL(numValueOf2, "follow_status_relation");
        C20684815ws.LJIILLIIL("story_click", c0lab.LIZ);
    }
}
