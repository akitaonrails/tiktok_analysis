package X;

import android.content.DialogInterface;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;

/* JADX INFO: renamed from: X.0IDU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDU implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
        }
    }

    public C0IDU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(C0IDU c0idu, DialogInterface dialogInterface) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", "cancel");
        c2344009Gk.LJIIIIZZ("enter_from", ((SocialAvatarReviewFragment) c0idu.l0).getEnterFrom());
        if (((SocialAvatarReviewFragment) c0idu.l0).VR()) {
            str = "edit_sa_page";
        } else {
            str = "edit_sa_detail_page";
        }
        c2344009Gk.LJIIIIZZ("page", str);
        C20684815ws.LJIILLIIL("edit_social_avatar_pop_up", c2344009Gk.LIZ);
    }

    public static final void onCancel$1(C0IDU c0idu, DialogInterface dialogInterface) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0idu.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCancel$2(C0IDU c0idu, DialogInterface dialogInterface) {
        ((C0HXY) c0idu.l0).LJIILIIL();
    }
}
