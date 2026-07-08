package X;

import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Sgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727780Sgi {
    public int LIZ;
    public final Integer LIZIZ;
    public Boolean LIZJ;
    public UserAllStoryMetadata LIZLLL;
    public Set<Long> LJ;

    public C727780Sgi() {
        this(0, null, null, null, null, 63);
    }

    public final C727780Sgi LIZ() {
        C727780Sgi c727780Sgi = new C727780Sgi(0, null, null, null, null, 63);
        c727780Sgi.LIZ = this.LIZ;
        c727780Sgi.LIZJ = this.LIZJ;
        UserAllStoryMetadata userAllStoryMetadata = this.LIZLLL;
        c727780Sgi.LIZLLL = userAllStoryMetadata != null ? userAllStoryMetadata.clone() : null;
        c727780Sgi.LJ = this.LJ;
        return c727780Sgi;
    }

    public final long LIZIZ() {
        UserAllStoryMetadata userAllStoryMetadata = this.LIZLLL;
        if (userAllStoryMetadata != null) {
            return userAllStoryMetadata.version();
        }
        return -1L;
    }

    public C727780Sgi(int i, Boolean bool, Long l, UserAllStoryMetadata userAllStoryMetadata, Set set, int i2) {
        i = (i2 & 1) != 0 ? -1 : i;
        bool = (i2 & 4) != 0 ? null : bool;
        userAllStoryMetadata = (i2 & 16) != 0 ? null : userAllStoryMetadata;
        set = (i2 & 32) != 0 ? new HashSet() : set;
        this.LIZ = i;
        this.LIZIZ = null;
        this.LIZJ = bool;
        this.LIZLLL = userAllStoryMetadata;
        this.LJ = set;
    }
}
