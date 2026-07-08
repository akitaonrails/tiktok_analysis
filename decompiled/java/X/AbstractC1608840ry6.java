package X;

import X.InterfaceC1606880ruw;
import X.InterfaceC426680GoE;
import android.view.View;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;

/* JADX INFO: renamed from: X.0ry6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1608840ry6<STATE extends InterfaceC1606880ruw, VARIANT extends InterfaceC426680GoE> implements InterfaceC1608850ry7<STATE, VARIANT> {
    public static View LJ(AbstractC1608840ry6 abstractC1608840ry6, EnumC1608710rxt enumC1608710rxt, AvatarComponentView avatarComponentView) {
        abstractC1608840ry6.getClass();
        if (avatarComponentView == null || avatarComponentView.getCurrentActiveBusiness().get(abstractC1608840ry6.LIZ()) == null) {
            return null;
        }
        if (enumC1608710rxt == EnumC1608710rxt.AVATAR) {
            return avatarComponentView.getRealAvatarView();
        }
        return avatarComponentView.findViewById(C1608680rxq.LIZJ(abstractC1608840ry6.LIZ(), enumC1608710rxt, null, null));
    }
}
