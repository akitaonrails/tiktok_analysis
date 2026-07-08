package X;

import Y.ACListenerS113S0200000_9;
import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0OTC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTC implements InterfaceC619820OSu {
    public final BulletinCommonAbility LIZ;
    public final View LIZIZ;

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC619820OSu
    public final void LJ(BulletinBaseItem bulletinBaseItem) {
        UrlModel avatarThumb;
        if (bulletinBaseItem.LJLIIIL()) {
            User userLJJJJZI = bulletinBaseItem.LJJJJZI();
            if (userLJJJJZI != null && (avatarThumb = userLJJJJZI.getAvatarThumb()) != null) {
                C427660Gpo c427660Gpo = (C427660Gpo) this.LIZIZ.findViewById(R.id.cyg);
                C12ES.LJIILL(0, c427660Gpo);
                if (C290780BaW.LIZ()) {
                    C623720OdG.LIZ(c427660Gpo, avatarThumb, "bulletin_list_owneruser_avatar", EnumC1334360kpO.LOW);
                } else {
                    C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, AFwS240S0000000_9.get$arr$(834), 510);
                }
            }
            C786410Ut5.I7(new ACListenerS113S0200000_9(this, bulletinBaseItem, 37), this.LIZIZ);
            return;
        }
        C12ES.LJIILL(4, this.LIZIZ.findViewById(R.id.cyg));
        C786410Ut5.I7(null, this.LIZIZ);
    }

    public C0OTC(ViewStub viewStub, BulletinCommonAbility bulletinCommonAbility) {
        this.LIZ = bulletinCommonAbility;
        viewStub.setLayoutResource(R.layout.a5v);
        this.LIZIZ = C786410Ut5.LJLLLL(viewStub);
    }
}
