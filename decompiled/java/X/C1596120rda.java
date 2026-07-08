package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0rda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596120rda {
    public final CopyOnWriteArrayList<Aweme> LIZ;
    public final CopyOnWriteArrayList<SkylightStoryUser> LIZIZ;
    public final ConcurrentSkipListSet<String> LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public Boolean LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;

    public C1596120rda() {
        throw null;
    }

    public final String LIZ() {
        String str = this.LJIILLIIL;
        if (str == null || str.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("story_skylight_");
            sbLIZ.append(UUID.randomUUID());
            this.LJIILLIIL = C2188811AlT.LIZIZ(sbLIZ);
            this.LJIILL = System.currentTimeMillis();
        }
        return this.LJIILLIIL;
    }

    public C1596120rda(int i) {
        CopyOnWriteArrayList<Aweme> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<SkylightStoryUser> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        ConcurrentSkipListSet<String> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        this.LIZ = copyOnWriteArrayList;
        this.LIZIZ = copyOnWriteArrayList2;
        this.LIZJ = concurrentSkipListSet;
        this.LIZLLL = 0;
        this.LJ = -1;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = null;
        this.LJIIJJI = false;
        this.LJIIL = "";
        this.LJIILIIL = 0;
        this.LJIILJJIL = null;
        this.LJIILL = 0L;
        this.LJIILLIIL = null;
    }
}
