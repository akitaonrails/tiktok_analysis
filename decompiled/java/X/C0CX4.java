package X;

import Y.ARunnableS104S0100000_4;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;

/* JADX INFO: renamed from: X.0CX4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0CX4 implements C0CX5 {
    public boolean LIZLLL() {
        throw null;
    }

    @Override // X.C0CX5
    public final void LIZ(List<? extends Aweme> list) {
        C0CX8.LIZIZ(this, list);
    }

    @Override // X.C0CX9
    public void LIZIZ(String str) {
        Long lValueOf;
        UserStory userStory;
        List<Aweme> listLJJLIIIJ;
        UserStory userStory2;
        List<Aweme> stories;
        UserStory userStory3;
        if (LIZLLL()) {
            C0CXA.LIZ(str, C0CX7.LIZ);
            return;
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        Aweme awemeLJIIIZ = c1618440sDa.LJJLIIIJLJLI().LJIIIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadStory: ");
        Integer numValueOf = null;
        if (awemeLJIIIZ != null && (userStory3 = awemeLJIIIZ.getUserStory()) != null) {
            lValueOf = Long.valueOf(userStory3.getCurrentPosition());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(' ');
        if (awemeLJIIIZ != null && (userStory2 = awemeLJIIIZ.getUserStory()) != null && (stories = userStory2.getStories()) != null) {
            numValueOf = Integer.valueOf(stories.size());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (awemeLJIIIZ == null || (userStory = awemeLJIIIZ.getUserStory()) == null || userStory.getStories() == null || (listLJJLIIIJ = c1618440sDa.LJJLIIIJ(((Number) C0BNY.LIZ.getValue()).intValue(), awemeLJIIIZ)) == null) {
            return;
        }
        for (Aweme aweme : listLJJLIIIJ) {
            if (aweme != null) {
                C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(this, aweme, 87));
            }
        }
    }
}
