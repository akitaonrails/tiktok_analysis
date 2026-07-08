package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0ivB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261070ivB {
    public final User LIZ;
    public List<? extends Aweme> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final EnumC1245890iWh LJ;

    public C1261070ivB(User user, List list, EnumC1245890iWh enumC1245890iWh, int i) {
        enumC1245890iWh = (i & 256) != 0 ? EnumC1245890iWh.DEFAULT_PAGE : enumC1245890iWh;
        this.LIZ = user;
        this.LIZIZ = list;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = enumC1245890iWh;
    }
}
