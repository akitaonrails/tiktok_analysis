package X;

import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileStyleOptimizeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0JFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489040JFu implements InterfaceC495660JcC {
    public final C495920Jcc LIZ;
    public final User LIZIZ;
    public final Context LIZJ;
    public final Room LIZLLL;
    public final C16FS LJ;
    public final C01GW LJFF;
    public boolean LJI;
    public FollowInfo LJII;
    public final MutableLiveData<Integer> LJIIIIZZ;

    public final C488970JFn LIZIZ() {
        return (C488970JFn) this.LJFF.getValue();
    }

    public final void LIZLLL() {
        FollowInfo followInfo = this.LJII;
        if (followInfo == null) {
            return;
        }
        this.LIZIZ.setFollowInfo(followInfo);
        LJFF();
        this.LJIIIIZZ.setValue(Integer.valueOf((int) this.LIZIZ.getFollowInfo().getFollowStatus()));
    }

    public final void LJ() {
        this.LJ.setIcon((Drawable) null);
        this.LJ.setText(C497740JfY.LJIJI(2131840784));
        this.LJ.j0(LiveProfileStyleOptimizeSetting.INSTANCE.isNewStyleEnable() ? R.style.ak2 : R.style.ak1);
        C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
        C16FS c16fs = this.LJ;
        ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 290);
        C495920Jcc c495920Jcc = this.LIZ;
        EnumC495860JcW enumC495860JcW = EnumC495860JcW.OPERATION;
        c495870JcX.getClass();
        C495870JcX.LIZIZ(c16fs, aCListenerS142S0100000_7, false, c495920Jcc, enumC495860JcW, "unblock", null);
    }

    public final void LJFF() {
        if (this.LIZIZ.getFollowInfo() == null) {
            return;
        }
        this.LJ.setText("");
        C16FS c16fs = this.LJ;
        LiveProfileStyleOptimizeSetting liveProfileStyleOptimizeSetting = LiveProfileStyleOptimizeSetting.INSTANCE;
        c16fs.j0(liveProfileStyleOptimizeSetting.isNewStyleEnable() ? R.style.ak5 : R.style.ak4);
        long followStatus = this.LIZIZ.getFollowInfo().getFollowStatus();
        if (followStatus == 2) {
            if (liveProfileStyleOptimizeSetting.isNewStyleEnable()) {
                this.LJ.setIconAttr(R.attr.e77);
            } else {
                this.LJ.setIcon(R.drawable.f92);
            }
            this.LJ.setText(2131842814);
        } else if (followStatus == 1) {
            if (liveProfileStyleOptimizeSetting.isNewStyleEnable()) {
                this.LJ.setIconAttr(R.attr.e8e);
            } else {
                this.LJ.setIcon(R.drawable.f91);
            }
            this.LJ.setText(2131853485);
        } else {
            int i = R.style.ak2;
            if (followStatus == 3) {
                C16FS c16fs2 = this.LJ;
                if (!liveProfileStyleOptimizeSetting.isNewStyleEnable()) {
                    i = R.style.ak1;
                }
                c16fs2.j0(i);
                this.LJ.setText(2131841702);
                this.LJ.setIcon(C20736316Cj.LJ(R.attr.e_6, this.LIZJ));
                this.LIZIZ.getFollowInfo().setPushStatus(2L);
            } else {
                C16FS c16fs3 = this.LJ;
                if (!liveProfileStyleOptimizeSetting.isNewStyleEnable()) {
                    i = R.style.ak1;
                }
                c16fs3.j0(i);
                this.LJ.setText(2131853484);
                this.LJ.setIcon(C20736316Cj.LJ(R.attr.e_6, this.LIZJ));
                this.LIZIZ.getFollowInfo().setPushStatus(2L);
            }
        }
        C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
        C16FS c16fs4 = this.LJ;
        ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 291);
        C495920Jcc c495920Jcc = this.LIZ;
        EnumC495860JcW enumC495860JcW = EnumC495860JcW.OPERATION;
        String str = this.LIZIZ.isFollowing() ? "unfollow" : "follow";
        c495870JcX.getClass();
        C495870JcX.LIZIZ(c16fs4, aCListenerS142S0100000_7, false, c495920Jcc, enumC495860JcW, str, null);
    }

    @Override // X.InterfaceC495660JcC
    public final C16FS getContentView() {
        return this.LJ;
    }

    @Override // X.InterfaceC495660JcC
    public final /* bridge */ /* synthetic */ MutableLiveData getFollowStatus() {
        return this.LJIIIIZZ;
    }

    public static void LIZJ(Throwable th) {
        if (th instanceof C501470JlZ) {
            C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
        } else {
            C766270U4b.LIZLLL(2131853482);
        }
    }

    public C489040JFu(C495920Jcc c495920Jcc, User user) {
        this.LIZ = c495920Jcc;
        this.LIZIZ = user;
        Context context = c495920Jcc.LIZ;
        this.LIZJ = context;
        this.LIZLLL = c495920Jcc.LJFF;
        this.LJ = new C16FS(context, null);
        this.LJFF = C452501pT.LIZIZ(new AwS551S0100000_7(this, 765));
        ((C0J1N) UserService.getInstance().user().LJFF().LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(c495920Jcc.LIZIZ))).LIZJ(new AfS176S0100000_7(this, 280));
        if (user.isBlock) {
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null) {
                followInfo.setFollowStatus(0L);
            }
            FollowInfo followInfo2 = user.getFollowInfo();
            if (followInfo2 != null) {
                followInfo2.setPushStatus(0L);
            }
        }
        C784440Upu.LIZ().LIZJ(c495920Jcc.LIZIZ, C749960TbO.class).LIZJ(new AfS176S0100000_7(this, 281));
        if (user.isBlock) {
            LJ();
        } else {
            LJFF();
        }
        this.LJIIIIZZ = new MutableLiveData<>();
    }

    @Override // X.InterfaceC495660JcC
    public final void LIZ(int i, ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        if (this.LJ.getParent() == null) {
            viewGroup.addView(this.LJ, i, layoutParams);
            return;
        }
        throw new RuntimeException("This button has been attached");
    }
}
