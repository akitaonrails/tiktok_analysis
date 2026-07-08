package X;

import Y.AfS5S0300100_24;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610750s1B implements InterfaceC1608890ryB {
    public final C1610760s1C LIZ;
    public boolean LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final C1610770s1D LJ;
    public boolean LJFF;
    public boolean LJI;
    public Aweme LJII;
    public User LJIIIIZZ;
    public C09JN<C1610420s0e> LJIIIZ;

    @Override // X.InterfaceC1608890ryB
    public final void LJ() {
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJI() {
        this.LJFF = true;
        this.LIZ.LJ = true;
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJIIIZ() {
        LIZIZ(0);
        LIZ();
    }

    @Override // X.InterfaceC1608890ryB
    public final void Ir() {
        AnimatorSet animatorSet;
        C1610760s1C c1610760s1C = this.LIZ;
        if (c1610760s1C.LIZ.contains(this)) {
            c1610760s1C.LIZ.remove(this);
        }
        if (c1610760s1C.LIZ.isEmpty() && (animatorSet = c1610760s1C.LJIIIIZZ) != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
        this.LJI = false;
    }

    @Override // X.InterfaceC1608890ryB
    public final void LIZ() {
        User user;
        boolean zLIZJ = LIZJ(this.LJIIIIZZ);
        this.LIZIZ = zLIZJ;
        String str = this.LIZ.LJI;
        if (!zLIZJ) {
            LJIIIIZZ();
            C09JN<C1610420s0e> c09jn = this.LJIIIZ;
            if (c09jn == null || (user = this.LJIIIIZZ) == null) {
                return;
            }
            try {
                String uid = user.getUid();
                c09jn.accept(new C1610420s0e(uid != null ? CastLongProtector.parseLong(uid) : 0L, 0L));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
                return;
            }
        }
        if (this.LJI) {
            C09JN<C1610420s0e> c09jn2 = this.LJIIIZ;
            if (c09jn2 != null) {
                LJIIJJI(this.LJIIIIZZ, c09jn2, str);
                return;
            }
            return;
        }
        if (this.LJFF || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().p3() || C1511220pQe.LIZIZ.LIZ()) {
            return;
        }
        this.LIZ.LIZ(this);
        this.LJI = this.LIZ.LJII;
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJIIIIZZ() {
        LIZIZ(8);
        LJIIJ();
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJIIJ() {
        AnimatorSet animatorSet;
        C1610760s1C c1610760s1C = this.LIZ;
        if (c1610760s1C.LIZ.contains(this)) {
            c1610760s1C.LIZ.remove(this);
        }
        if (c1610760s1C.LIZ.isEmpty() && (animatorSet = c1610760s1C.LJIIIIZZ) != null && animatorSet.isRunning()) {
            animatorSet.pause();
        }
        this.LJI = false;
    }

    @Override // X.InterfaceC1608890ryB
    public final void xs() {
        this.LIZ.LIZ(this);
        this.LJI = this.LIZ.LJII;
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJII() {
        LJIIJ();
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
        }
    }

    @Override // X.InterfaceC1608890ryB
    public final boolean LIZLLL() {
        return this.LJI;
    }

    public final void LIZIZ(int i) {
        View view;
        View view2;
        if (i == 0) {
            C1610770s1D c1610770s1D = this.LJ;
            if (c1610770s1D != null) {
                C786410Ut5.Y(c1610770s1D, 0);
            }
            View view3 = this.LIZJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            if (!Intrinsics.LJFF(this.LIZJ, this.LIZLLL) && (view2 = this.LIZLLL) != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        C1610770s1D c1610770s1D2 = this.LJ;
        if (c1610770s1D2 != null) {
            C786410Ut5.Y(c1610770s1D2, 8);
        }
        if (!Intrinsics.LJFF(this.LIZJ, this.LIZLLL) && (view = this.LIZJ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view4 = this.LIZLLL;
        if (view4 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view4);
    }

    public final boolean LIZJ(User user) {
        if (!C1260740iue.LIZ()) {
            return false;
        }
        if (user == null) {
            return this.LIZIZ;
        }
        Aweme aweme = this.LJII;
        if (aweme != null && ((ICommerceCommonService) ServiceManager.get().getService(ICommerceCommonService.class)).LJFF(aweme)) {
            return true;
        }
        if (!user.isLive()) {
            return false;
        }
        if ((user.isSecret() && !C10EU.LJIIL(user)) || !user.isLive() || !C1492170ovv.LIZ() || user.isBlock()) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI(User user, C09JN<C1610420s0e> c09jn, String str) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).j3().LIZLLL(user, new AfS5S0300100_24(CastLongProtector.parseLong(user.getUid()), this, user, c09jn, 0), str);
        }
    }

    public C1610750s1B(C1610760s1C c1610760s1C, View view, View view2, C1610770s1D c1610770s1D) {
        boolean z;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = c1610770s1D;
        if (C1260740iue.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        if (c1610770s1D != null) {
            C786410Ut5.Y(c1610770s1D, z ? 0 : 8);
        }
        this.LIZ = c1610760s1C;
    }

    @Override // X.InterfaceC1608890ryB
    public final void LJFF(User user, Class<Object> cls, C09JN<C1610420s0e> c09jn, Aweme aweme, Function1<? super Boolean, Unit> function1) {
        this.LJII = aweme;
        this.LJIIIIZZ = user;
        this.LJIIIZ = null;
        boolean zLIZJ = LIZJ(user);
        this.LIZIZ = zLIZJ;
        if (zLIZJ) {
            LJIIIZ();
        } else {
            LJIIIIZZ();
        }
    }
}
