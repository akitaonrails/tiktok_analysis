package X;

import android.content.Context;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0Jko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501000Jko implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 101;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        Context context = c500840JkY.LIZ;
        if (!UserService.getInstance().user().isLogin()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131853573);
            c476760Imo.LIZJ = -1;
            c476760Imo.LJ = "video_take";
            c476760Imo.LJFF = "open_live";
            c476760Imo.LIZLLL = "bottom_tab";
            interfaceC500940JkiUser.LJIILL(context, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn());
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
