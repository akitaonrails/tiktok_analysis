package X;

import android.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import com.ss.android.ugc.now.interaction.ui.NowCommentListFragment;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0lIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352380lIS {
    public static void LIZ(C19EG c19eg, Aweme aweme, String str, NowFeedMobHierarchyData nowFeedMobHierarchyData, boolean z, Comment comment, Integer num, String str2, boolean z2, Long l) {
        NowCommentListFragment nowCommentListFragment;
        long jLongValue;
        Fragment fragmentLJJJJZI;
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        String aid = aweme.getAid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg.getClass().getName());
        sbLIZ.append('_');
        sbLIZ.append(aid);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InteractionFragment interactionFragment = (InteractionFragment) supportFragmentManager.LJJJJZI(strLIZIZ);
        if (interactionFragment == null) {
            C01GW<LinkedList<String>> c01gw = C1352440lIY.LIZ;
            if (c01gw.getValue().size() == 5 && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI(c01gw.getValue().poll())) != null) {
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIJ();
            }
            InteractionFragment interactionFragment2 = new InteractionFragment();
            interactionFragment2.LLILLJJLI = aweme;
            interactionFragment2.LLJJ = str;
            interactionFragment2.LLJILJILJ = nowFeedMobHierarchyData;
            interactionFragment2.LLJJI = z;
            interactionFragment2.LLJJIII = comment;
            interactionFragment2.LLJILLL = num;
            interactionFragment2.LLJJIJI = str2;
            interactionFragment2.LLJJIJIIJIL = z2;
            C1352320lIM c1352320lIM = C1352320lIM.LIZ;
            String aid2 = aweme.getAid();
            c1352320lIM.getClass();
            C1352330lIN c1352330lINLIZ = C1352320lIM.LIZ(aid2);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1352330lINLIZ.LIZ = jLongValue;
            c1352330lINLIZ.LIZIZ = System.currentTimeMillis();
            c1352330lINLIZ.LJFF = str2;
            c01gw.getValue().add(strLIZIZ);
            if (c01gw.getValue().size() == 0) {
                int i = C519960KaI.LIZ;
                C519960KaI.LIZ(Keva.getRepo("interaction_like_count"));
                C519960KaI.LIZ(Keva.getRepo("interaction_comment_count"));
            }
            C19EH c19ehLJIIJ2 = supportFragmentManager.LJIIJ();
            c19ehLJIIJ2.LIZJ(R.id.content, interactionFragment2, strLIZIZ);
            c19ehLJIIJ2.LJIIJ();
            return;
        }
        interactionFragment.LLILLJJLI = aweme;
        interactionFragment.LLJILJILJ = nowFeedMobHierarchyData;
        interactionFragment.LLJILLL = num;
        interactionFragment.LLJJIJI = str2;
        interactionFragment.show();
        if (!z) {
            return;
        }
        List<AbsFragment> list = interactionFragment.LLJ;
        AbsFragment absFragment = null;
        if (list != null) {
            absFragment = (AbsFragment) C13LP.LJJJLZIJ(0, list);
        }
        if (!(absFragment instanceof NowCommentListFragment) || (nowCommentListFragment = (NowCommentListFragment) absFragment) == null) {
            return;
        }
        nowCommentListFragment.NR().QK0(comment, nowCommentListFragment.LLJJIJI);
    }
}
