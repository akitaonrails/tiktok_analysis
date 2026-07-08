package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0iRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242480iRC extends MusNotice {
    public static final List<Integer> LLILZIL = C1697810uHb.LJIIJJI(2001, 2011, 2002, 2003, 2004, 2005);
    public static final List<Integer> LLILZLL = C1697810uHb.LJIIJJI(2004, 2005);
    public final int LL;
    public final User LLILLJJLI;
    public final List<User> LLILLL;
    public final int LLILZ;

    public C1242480iRC() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LL), this.LLILLJJLI, this.LLILLL, Integer.valueOf(this.LLILZ));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendNotice(recommend_type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", recommend_user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", aggregateUsers=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", aggregateTotalUserCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1242480iRC(int i) {
        super(true, false);
        this.LL = 2002;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = 0;
        this.type = 2002;
        this.nid = String.valueOf(hashCode());
        this.hasRead = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1242480iRC)) {
            return false;
        }
        C1242480iRC c1242480iRC = (C1242480iRC) obj;
        if (this.LL == c1242480iRC.LL && Objects.equals(this.LLILLJJLI, c1242480iRC.LLILLJJLI) && Objects.equals(this.LLILLL, c1242480iRC.LLILLL) && this.LLILZ == c1242480iRC.LLILZ) {
            return true;
        }
        return false;
    }
}
