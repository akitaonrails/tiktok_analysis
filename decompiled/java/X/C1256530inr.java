package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity;
import com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0inr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256530inr {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Activity LIZ;
    public final View LIZIZ;
    public User LIZJ;
    public final String LIZLLL;
    public final Rect LJ;
    public final String LJFF;
    public final C1255650imR LJI;
    public final C1242890iRr LJII;
    public final C01GW LJIIIIZZ;

    public final void LIZ() {
        C1322090kVb c1322090kVb;
        Animatable animatableLIZ;
        C1606420ruC c1606420ruCLJ;
        if (this.LIZ.isFinishing()) {
            return;
        }
        if (C297430BlF.LIZIZ) {
            if (LIZIZ()) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("EnlargeAvatarDebug", " v1-social avatar-version enlarge activity ");
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("EnlargeAvatarDebug", "v0");
            }
            Intent intent = new Intent(this.LIZ, (Class<?>) (LIZIZ() ? EnlargeAvatarOptActivity.class : EnlargeAvatarActivity.class));
            intent.putExtra("user_key", this.LIZJ);
            intent.putExtra("gid_key", this.LIZLLL);
            intent.putExtra("enter_method", this.LJFF);
            if (!LIZIZ()) {
                intent.putExtra("screen_position_key", this.LJ);
                intent.putExtra("avatar_height", this.LIZIZ.getHeight());
                intent.putExtra("avatar_width", this.LIZIZ.getWidth());
            }
            if (LIZIZ()) {
                this.LIZIZ.setTransitionName("profile_avatar");
                Activity activity = this.LIZ;
                View view = this.LIZIZ;
                c1606420ruCLJ = C1607950rwf.LJ(activity, new C0WIY(view, view.getTransitionName()));
            } else {
                c1606420ruCLJ = C1607950rwf.LJ(this.LIZ, new C0WIY[0]);
            }
            Activity activity2 = this.LIZ;
            Bundle bundleLJFF = c1606420ruCLJ.LJFF();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Context_startActivity_2");
            C1701330uNH.LIZ(intent, activity2);
            C2204961BRm.LJIILL(activity2, intent, bundleLJFF, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDm+kq1akzVbaGIltgqmfLmODJ3LzHw0Lc", null));
        }
        View view2 = this.LIZIZ;
        if (!(view2 instanceof C422820Gi0) || (c1322090kVb = (C1322090kVb) view2) == null || c1322090kVb.getController() == null || (animatableLIZ = c1322090kVb.getController().LIZ()) == null || !animatableLIZ.isRunning()) {
            return;
        }
        animatableLIZ.stop();
    }

    public final boolean LIZIZ() {
        User user = this.LIZJ;
        boolean zLJIILLIIL = C10EU.LJIILLIIL(user);
        return (((SocialAvatarAccess) this.LJIIIIZZ.getValue()).LIZLLL() && zLJIILLIIL) || !(!((SocialAvatarAccess) this.LJIIIIZZ.getValue()).LIZ() || zLJIILLIIL || !C1245160iVW.LIZ(user) || user == null || user.isBlock || user.isBlocked());
    }

    public C1256530inr(Activity activity, View view, C1255650imR c1255650imR, User user, String str, Rect rect, String str2, int i) {
        rect = (i & 64) != 0 ? null : rect;
        str2 = (i & 128) != 0 ? null : str2;
        this.LIZ = activity;
        this.LIZIZ = view;
        this.LIZJ = user;
        this.LIZLLL = str;
        this.LJ = rect;
        this.LJFF = str2;
        this.LJI = c1255650imR;
        this.LJII = new C1242890iRr(this);
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(3));
    }
}
