package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0aTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936570aTn {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public final String LJ;

    public C936570aTn(String str) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        this.LIZ = str;
        this.LIZIZ = currentUserId;
        this.LIZLLL = "guest";
        this.LJ = "room";
    }
}
