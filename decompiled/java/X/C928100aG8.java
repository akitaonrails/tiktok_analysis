package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0aG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928100aG8 {
    public static InterfaceC928200aGI LIZ(C927240aEk c927240aEk) {
        c927240aEk.LJ = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        return c927240aEk;
    }
}
