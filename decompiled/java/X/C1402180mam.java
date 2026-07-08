package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.PortraitInputKeyboard;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402180mam implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
        }
    }

    public C1402180mam(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C1402180mam c1402180mam, int i, boolean z, int i2, User user) {
        if (z) {
            KeyboardVMV2 keyboardVMV2Sp = ((PortraitInputKeyboard) c1402180mam.l0).sp();
            keyboardVMV2Sp.getClass();
            keyboardVMV2Sp.withState(new AwS600S0100000_21(keyboardVMV2Sp, 411));
        }
    }

    public static final void onAccountResult$1(C1402180mam c1402180mam, int i, boolean z, int i2, User user) {
        InterfaceC1398820mVM interfaceC1398820mVM = (InterfaceC1398820mVM) c1402180mam.l0;
        if (user != null) {
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJJJ(user);
        }
        interfaceC1398820mVM.LLLLLLL(i, z);
    }
}
