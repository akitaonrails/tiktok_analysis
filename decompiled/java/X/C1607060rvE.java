package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0rvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607060rvE implements InterfaceC1608870ry9<AbstractC1607170rvP, C1606270rtx>, InterfaceC1608830ry5<AbstractC1607170rvP, C1606270rtx>, InterfaceC1608820ry4<AbstractC1607170rvP, C1606270rtx> {
    @Override // X.InterfaceC1608820ry4
    public final void LIZJ(String str, InterfaceC1607380rvk interfaceC1607380rvk, Object obj) {
    }

    @Override // X.InterfaceC1608820ry4
    public final void LJ(AvatarComponentView avatarComponentView, LifecycleOwner lifecycleOwner) {
    }

    @Override // X.InterfaceC1608830ry5
    public final InterfaceC1606880ruw LIZLLL(Object obj) {
        if (obj instanceof UserNewContent) {
            if (!((UserNewContent) obj).isStory()) {
                return new C1607150rvN();
            }
            return new C1607160rvO();
        }
        if (obj instanceof User) {
            return new C1607160rvO();
        }
        return new C1607150rvN();
    }

    @Override // X.InterfaceC1608820ry4
    public final InterfaceC1606880ruw LJFF(Object obj) {
        if (obj instanceof UserNewContent) {
            if (!((UserNewContent) obj).isStory()) {
                return new C1607150rvN();
            }
            return new C1607160rvO();
        }
        if (obj instanceof User) {
            return new C1607160rvO();
        }
        return new C1607150rvN();
    }
}
