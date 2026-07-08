package X;

import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;

/* JADX INFO: renamed from: X.117V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117V {
    public AVChallenge LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public RecommendHashTagData.AdData LJ;
    public String LJFF;
    public boolean LJI;
    public int LJII;

    public static C117V LIZ(AVSearchChallenge aVSearchChallenge) {
        C117V c117v = new C117V();
        boolean z = aVSearchChallenge.LIZ;
        if (z) {
            if (aVSearchChallenge.challenge.chaType == 1) {
                c117v.LJFF = "guide_history_recommendation";
            } else {
                c117v.LJFF = "guide_recommendation";
            }
        } else {
            c117v.LJFF = "search";
        }
        c117v.LIZIZ = 2;
        c117v.LIZ = aVSearchChallenge.challenge;
        c117v.LJI = z;
        return c117v;
    }
}
