package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1609080ryU {
    public InterfaceC1609140rya LIZ;
    public String LIZIZ;

    public abstract View LIZIZ();

    public void LIZJ() {
    }

    public void LIZ(User user) {
        String uid = null;
        if ((user instanceof User) && user != null) {
            uid = user.getUid();
        }
        if (!Intrinsics.LJFF(uid, this.LIZIZ)) {
            this.LIZIZ = uid;
        }
    }
}
