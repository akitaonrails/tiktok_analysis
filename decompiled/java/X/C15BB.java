package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15BB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BB {
    public static User LIZJ(GuestShowdownUser guestShowdownUser) {
        User user = new User();
        user.setId(guestShowdownUser.userId);
        user.setDisplayId(guestShowdownUser.displayId);
        user.setNickName(guestShowdownUser.nickname);
        user.setAvatarThumb(guestShowdownUser.avatarThumb);
        return user;
    }

    public static Rect LIZ(Rect rect, C15BF c15bf) {
        int iWidth = rect.left + (rect.width() / 2);
        int iHeight = rect.top + (rect.height() / 2);
        float fFloatValue = ((c15bf.LIZJ.getFirst().floatValue() * 1.0f) / c15bf.LIZLLL.getFirst().floatValue()) * rect.width();
        float fFloatValue2 = ((c15bf.LIZJ.getSecond().floatValue() * 1.0f) / c15bf.LIZLLL.getSecond().floatValue()) * rect.height();
        Rect rect2 = new Rect();
        float f = 2;
        int i = (int) (iWidth - (fFloatValue / f));
        rect2.left = i;
        int i2 = (int) (iHeight - (fFloatValue2 / f));
        rect2.top = i2;
        rect2.right = (int) (i + fFloatValue);
        rect2.bottom = (int) (i2 + fFloatValue2);
        return rect2;
    }

    public static InterfaceC20476615Am LIZIZ(C20475815Ae c20475815Ae, ViewGroup viewGroup, String str) {
        int i = C15B8.LJIJI;
        EnumC20439114yL enumC20439114yL = EnumC20439114yL.GECKO;
        if (viewGroup == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.IMAGE;
        sbLIZ.append(enumC20476415Ak);
        sbLIZ.append("_bg");
        return c20475815Ae.LIZ(C2188811AlT.LIZIZ(sbLIZ), enumC20476415Ak, new C20476115Ah(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight(), 0.0f, 0.0f, 0.0f, C15BN.LIZ, 112), new C204752159y(enumC20439114yL, str, null, 0, 0, false, false, 124), EnumC20476715An.NORMAL);
    }
}
