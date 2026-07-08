package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0U2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765880U2o {
    public final int LIZ;
    public boolean LIZIZ;

    public C765880U2o(int i) {
        boolean z;
        this.LIZ = i;
        C0JG7 c0jg7ND = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ND(UserService.getInstance().user().LJIJJLI());
        if (c0jg7ND != C0JG7.GUEST_AUDIENCE && c0jg7ND != C0JG7.GUEST_ANCHOR) {
            z = false;
        } else {
            z = true;
        }
        this.LIZIZ = z;
    }
}
