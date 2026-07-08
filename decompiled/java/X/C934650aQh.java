package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0aQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934650aQh {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public String LJ;
    public String LJFF;
    public Long LJI;

    public C934650aQh(String str, long j) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        this.LIZ = str;
        this.LIZIZ = currentUserId;
        this.LIZJ = j;
        this.LJ = "guest";
        this.LJFF = "room";
    }
}
