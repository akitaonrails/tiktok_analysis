package X;

import Y.ACListenerS122S0200000_19;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.IBulletinBoardService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0iXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("BulletinBoardProfilePopupTask")
public final class C1246230iXF extends AbstractC20660115st<View> {
    public final C20515215Pi LL;
    public final Activity LLILLJJLI;
    public final int LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        IBulletinBoardService iBulletinBoardService = (IBulletinBoardService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardService.class, false, false, false, 14, null);
        if (iBulletinBoardService == null) {
            return null;
        }
        iBulletinBoardService.LJIIIZ();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LJI(new AwS385S0200000_19(c688120Qyw, curUser, 114));
        c20515215Pi.LIZ(2131828081);
        c20515215Pi.LIZJ(2131828082);
        String strLJJIFFI = u.LJJIFFI(c688120Qyw.LIZ.getString(2131828083), "%1$s", curUser.getNickname(), false);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJ = strLJJIFFI;
        c1057450dcl.LJIILIIL = new ACListenerS122S0200000_19(iBulletinBoardService, this, 59);
        c20515215Pi.LIZ.LJIILJJIL = new AwS385S0200000_19(iBulletinBoardService, this, 115);
        LJIIL("show", null);
        C20515215Pi c20515215Pi2 = this.LL;
        c20515215Pi2.LIZ.LJIILLIIL = true;
        c20515215Pi2.LJ();
        return c20515215Pi2.LJ;
    }

    public static void LJIIL(String str, String str2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "profile_page");
        c0xgr.LIZLLL("action_type", str);
        if (str2 != null) {
            c0xgr.LIZJ("click_type", str2);
        }
        C20684815ws.LJIILLIIL("create_bulletin_board_notice", c0xgr.LIZ);
    }

    public C1246230iXF(C0TGX c0tgx, C20515215Pi c20515215Pi, C19EG c19eg) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = c19eg;
        this.LLILLL = 447;
    }
}
