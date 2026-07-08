package X;

import Y.AfS180S0100000_11;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Shr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728490Shr extends C728480Shq {
    public static final /* synthetic */ int LLILZLL = 0;

    @Override // X.C728480Shq
    public final void LIZIZ(C2189821An6 c2189821An6) {
        Fragment fragment;
        C19EG activity;
        String strLIZ;
        UserStory userStory;
        List<Aweme> stories;
        final String itemId = c2189821An6.getItemId();
        String uid = c2189821An6.getUid();
        if (itemId != null && uid != null) {
            Aweme awemeLJIIIZ = C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIZ(uid);
            if (awemeLJIIIZ != null && (userStory = awemeLJIIIZ.getUserStory()) != null && (stories = userStory.getStories()) != null && !stories.isEmpty()) {
                Iterator<Aweme> it2 = stories.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), itemId)) {
                        LIZLLL(itemId, null, Collections.singletonList(awemeLJIIIZ), false);
                        return;
                    }
                }
            }
            String string = Collections.singletonList(uid).toString();
            try {
                strLIZ = C728840SiQ.LIZ(new InsertStory(CastLongProtector.parseLong(uid), CastLongProtector.parseLong(itemId)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJ(e.getMessage());
                strLIZ = "";
            }
            C730000SkI.LIZIZ.LIZJ(249372176, 4);
            this.LL.LIZ(C728370Shf.LIZ(C728370Shf.LIZ, string, strLIZ, 0, null, 12).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0Shs
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StoryInnerAppPostPushDetailOperator@d13a.requestImpl$3");
                    UserStoriesResponse userStoriesResponse = (UserStoriesResponse) obj;
                    C730000SkI c730000SkI = C730000SkI.LIZIZ;
                    c730000SkI.LIZJ(249372176, 5);
                    c730000SkI.LIZ(249372176, 1, "is_request");
                    List<Aweme> awemes = userStoriesResponse.getAwemes();
                    if (awemes != null) {
                        this.LL.LIZLLL(itemId, userStoriesResponse.extra.logid, awemes, true);
                    } else {
                        this.LL.LLILZ = false;
                    }
                    C1C7U.LIZIZ("StoryInnerAppPostPushDetailOperator@d13a.requestImpl$3");
                }
            }, new AfS180S0100000_11(this, 10)));
            return;
        }
        InterfaceC1209780haS interfaceC1209780haS = this.LLILLJJLI;
        if (interfaceC1209780haS != null && (fragment = interfaceC1209780haS.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            C728540Shw.LIZ(activity);
        }
    }

    public final void LIZLLL(String str, String str2, List list, boolean z) {
        UserStory userStory;
        List<Aweme> stories;
        Fragment fragment;
        C19EG activity;
        this.LLILZ = false;
        if (z) {
            C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZ(list, str2, null, true);
        }
        Aweme aweme = (Aweme) C13LP.LJJJLZIJ(0, list);
        if (aweme != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null && !stories.isEmpty()) {
            Iterator<Aweme> it2 = stories.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme next = it2.next();
                if (Intrinsics.LJFF(next.getAid(), str)) {
                    if (next == null) {
                        break;
                    }
                }
            }
            InterfaceC1209780haS interfaceC1209780haS = this.LLILLJJLI;
            if (interfaceC1209780haS != null && (fragment = interfaceC1209780haS.getFragment()) != null && (activity = fragment.getActivity()) != null) {
                C728540Shw.LIZ(activity);
            }
            LIZ(list);
            return;
        }
        InterfaceC1209780haS interfaceC1209780haS2 = this.LLILLJJLI;
        if (interfaceC1209780haS2 == null) {
            return;
        }
        interfaceC1209780haS2.G90(new Pair<>(3020007, null));
    }
}
