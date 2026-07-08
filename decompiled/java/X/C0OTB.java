package X;

import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTB implements InterfaceC619820OSu {
    public final ViewGroup LIZ;
    public final BulletinCommonAbility LIZIZ;
    public final View LIZJ;
    public String LJ;
    public BulletinBaseItem LJFF;
    public boolean LJI;
    public boolean LJII;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1721));
    public final ACListenerS144S0100000_9 LJIIIIZZ = new ACListenerS144S0100000_9(this, 108);

    @Override // X.C0OT0
    public final View LJIJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC619820OSu
    public final void LJ(BulletinBaseItem bulletinBaseItem) {
        UrlModel avatarThumb;
        String str;
        this.LJFF = bulletinBaseItem;
        if (bulletinBaseItem.LJLIIIL()) {
            this.LJI = true;
            View view = (View) this.LIZLLL.getValue();
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            User userLJJJJZI = bulletinBaseItem.LJJJJZI();
            if (userLJJJJZI != null && (avatarThumb = userLJJJJZI.getAvatarThumb()) != null) {
                List<String> urlList = avatarThumb.getUrlList();
                if (urlList != null) {
                    str = (String) C13LP.LJJJLL(urlList);
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, this.LJ)) {
                    this.LJ = str;
                    if (C290780BaW.LIZ()) {
                        C623720OdG.LIZ((SmartImageView) this.LIZLLL.getValue(), avatarThumb, "bulletin_list_owneruser_avatar", EnumC1334360kpO.LOW);
                    } else {
                        C427660Gpo c427660Gpo = (C427660Gpo) this.LIZLLL.getValue();
                        if (c427660Gpo != null) {
                            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, true, null, 766);
                        }
                    }
                }
            }
            if (!this.LJII) {
                C786410Ut5.I7(this.LJIIIIZZ, this.LIZJ);
                this.LJII = true;
                return;
            }
            return;
        }
        this.LJI = false;
        View view2 = (View) this.LIZLLL.getValue();
        if (view2 == null) {
            return;
        }
        C12ES.LJIILL(4, view2);
    }

    public C0OTB(ViewGroup viewGroup, BulletinCommonAbility bulletinCommonAbility) {
        this.LIZ = viewGroup;
        this.LIZIZ = bulletinCommonAbility;
        this.LIZJ = viewGroup;
    }
}
