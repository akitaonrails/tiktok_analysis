package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.experiment.MovingTabCornerTip;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.MainFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571260qzU implements InterfaceC1570900qyu, InterfaceC1602790roL {
    public C19EG LL;
    public InterfaceC1617760sCU LLILLJJLI;
    public C1255210ilj LLILLL;
    public C422820Gi0 LLILZ;
    public String LLILZIL;
    public final Keva LLILZLL = Keva.getRepo("move_reminder_keva");

    @Override // X.InterfaceC1570900qyu
    public final void LIZ() {
    }

    @Override // X.InterfaceC1602790roL
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1602790roL
    public final Animator LJII(TuxIconView tuxIconView) {
        return null;
    }

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void T1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        return true;
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void d2(Integer num) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        return true;
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return "USER";
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onPause() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onResume() {
    }

    @Override // X.InterfaceC1602790roL
    public final void LIZIZ() throws Throwable {
        C1255210ilj c1255210ilj;
        if (this.LL == null || (c1255210ilj = this.LLILLL) == null) {
            return;
        }
        c1255210ilj.LIZLLL();
    }

    @Override // X.InterfaceC1602790roL
    public final void LIZLLL() {
        this.LLILZLL.storeLong("profile_last_reminder_time", System.currentTimeMillis());
        this.LLILZLL.storeInt("profile_reminder_count", this.LLILZLL.getInt("profile_reminder_count", 0) + 1);
    }

    @Override // X.InterfaceC1602790roL
    public final C1602830roP LJ() {
        Resources resources;
        C422820Gi0 c422820Gi0 = this.LLILZ;
        C19EG c19eg = this.LL;
        return new C1602830roP(c422820Gi0, (c19eg == null || (resources = c19eg.getResources()) == null) ? null : resources.getString(2131849396), 5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }

    @Override // X.InterfaceC1602790roL
    public final boolean LJIIIIZZ() {
        if (this.LLILZLL.getBoolean("profile_has_clicked", false)) {
            return false;
        }
        C01GW c01gw = C1571270qzV.LIZIZ;
        MovingTabCornerTip movingTabCornerTip = (MovingTabCornerTip) c01gw.getValue();
        if (this.LLILZLL.getInt("profile_reminder_count", 0) >= (movingTabCornerTip != null ? movingTabCornerTip.maxPopTimes : 2)) {
            return false;
        }
        MovingTabCornerTip movingTabCornerTip2 = (MovingTabCornerTip) c01gw.getValue();
        return System.currentTimeMillis() - this.LLILZLL.getLong("profile_last_reminder_time", 0L) >= ((long) ((((movingTabCornerTip2 != null ? movingTabCornerTip2.popIntervalHour : 259200000) * 60) * 60) * LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC1570900qyu
    public final void a2() {
        C422820Gi0 c422820Gi0;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || ((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin()) {
            C0XQ7.LJ();
            String avatarUrl = C0XQ7.LIZ.LJIIJ().getAvatarUrl();
            if (TextUtils.equals(avatarUrl, this.LLILZIL) || (c422820Gi0 = this.LLILZ) == null) {
                return;
            }
            C1324840ka2.LJIIJ(c422820Gi0, avatarUrl, -1, -1);
        }
    }

    @Override // X.InterfaceC1602790roL
    public final ImageView LJI(Context context) {
        InterfaceC1617760sCU interfaceC1617760sCU = null;
        if (this.LL == null) {
            return null;
        }
        C0XQ7.LJ();
        String avatarUrl = C0XQ7.LIZ.LJIIJ().getAvatarUrl();
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class);
        InterfaceC1617760sCU interfaceC1617760sCU2 = this.LLILLJJLI;
        if (interfaceC1617760sCU2 != null) {
            interfaceC1617760sCU = interfaceC1617760sCU2;
        }
        RemoteImageView remoteImageView = (RemoteImageView) homePageUIFrameService.buildProfileIcon(interfaceC1617760sCU.getActivity());
        C1324840ka2.LJIIJ(remoteImageView, avatarUrl, -1, -1);
        return remoteImageView;
    }

    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) throws Throwable {
        C1255210ilj c1255210ilj;
        if (!C0OBG.LIZIZ(view) && this.LL != null && (c1255210ilj = this.LLILLL) != null) {
            c1255210ilj.LIZLLL();
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
        C1255210ilj c1255210ilj;
        C19EG activity = interfaceC1617760sCU.getActivity();
        this.LL = activity;
        this.LLILLJJLI = interfaceC1617760sCU;
        if (activity != null) {
            c1255210ilj = new C1255210ilj(activity);
        } else {
            c1255210ilj = null;
        }
        this.LLILLL = c1255210ilj;
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        InterfaceC1617760sCU interfaceC1617760sCU = null;
        if (this.LL == null) {
            return null;
        }
        String str = this.LLILZIL;
        C0XQ7.LJ();
        boolean zLJFF = Intrinsics.LJFF(str, C0XQ7.LIZ.LJIIJ().getAvatarUrl());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildIcon curUrl: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", this: ");
        sbLIZ.append(this);
        sbLIZ.append(", real url: ");
        C0XQ7.LJ();
        sbLIZ.append(C0XQ7.LIZ.LJIIJ().getAvatarUrl());
        C1720106oR.LJI("ProfileTopIconGenerator", C2188811AlT.LIZIZ(sbLIZ));
        C0XQ7.LJ();
        this.LLILZIL = C0XQ7.LIZ.LJIIJ().getAvatarUrl();
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class);
        InterfaceC1617760sCU interfaceC1617760sCU2 = this.LLILLJJLI;
        if (interfaceC1617760sCU2 != null) {
            interfaceC1617760sCU = interfaceC1617760sCU2;
        }
        C422820Gi0 c422820Gi0 = (C422820Gi0) homePageUIFrameService.buildProfileIcon(interfaceC1617760sCU.getActivity());
        this.LLILZ = c422820Gi0;
        if (!zLJFF) {
            C1324840ka2.LJIIJ(c422820Gi0, this.LLILZIL, -1, -1);
        }
        return this.LLILZ;
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LLILLJJLI = interfaceC1617760sCU;
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
        if (interfaceC1571160qzK != null) {
            interfaceC1571160qzK.LIZLLL("USER", this);
        }
    }
}
