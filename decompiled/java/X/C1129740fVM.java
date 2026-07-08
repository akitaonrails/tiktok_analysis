package X;

import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.0fVM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129740fVM {
    public final String LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final User LJFF;
    public final Long LJI;
    public final boolean LJII;

    public C1129740fVM(String str, Long l, Boolean bool, Boolean bool2, User user, Long l2, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        l = (i & 2) != 0 ? null : l;
        bool = (i & 8) != 0 ? null : bool;
        bool2 = (i & 16) != 0 ? null : bool2;
        user = (i & 32) != 0 ? null : user;
        l2 = (i & 64) != 0 ? null : l2;
        z = (i & 128) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = null;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = user;
        this.LJI = l2;
        this.LJII = z;
    }
}
