package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0Z1L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z1L implements C0Z1M {
    public final IMUser LIZ;
    public final C2252331DDr LIZIZ;
    public final C2252331DDr LIZJ;

    @Override // X.InterfaceC893110Z1x
    public final void LJI() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC893110Z1x
    public final void register() {
        EventBus.LIZLLL().LJIJJ(this);
        this.LIZIZ.LIZJ(this.LIZ);
    }

    @Override // X.C0Z1M
    public final C2252331DDr LIZJ() {
        return this.LIZJ;
    }

    public C0Z1L(IMUser iMUser) {
        this.LIZ = iMUser;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LIZIZ = c2252331DDrLIZIZ;
        this.LIZJ = c2252331DDrLIZIZ;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserUpdateEvent(C1434905jX c1434905jX) {
        String uid;
        IMUser iMUser = this.LIZ;
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        if (!Intrinsics.LJFF(uid, c1434905jX.LIZJ.getUid())) {
            return;
        }
        this.LIZIZ.LIZJ(c1434905jX.LIZJ);
    }
}
