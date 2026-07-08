package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab.ProfileBottomTabServiceImpl;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ICE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab.ProfileBottomTabServiceImpl$changeSocialAvatarIconFlipVisibility$1", f = "ProfileBottomTabServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ICE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ProfileBottomTabServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ICE(boolean z, ProfileBottomTabServiceImpl profileBottomTabServiceImpl, Context context, InterfaceC1364105Vn<? super C0ICE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = profileBottomTabServiceImpl;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ICE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1591090rVT abstractC1591090rVTY01;
        int i;
        AbstractC1591090rVT abstractC1591090rVTY012;
        C1C7U.LIZ("ProfileBottomTabServiceImpl@8e47.changeSocialAvatarIconFlipVisibility$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            if (!this.LLILLJJLI.LIZ) {
                C0HYP.LIZ.getClass();
                if (!C435330H5f.LIZ()) {
                    long j = C0HYP.LJ().getLong("profile_icon_flip_show_timestamp", 0L);
                    boolean z = C0HYP.LJ().getBoolean("profile_icon_flip_clicked", false);
                    boolean z2 = C0HYP.LJ().getBoolean("has_shown_profile_popup_sheet", false);
                    if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((SocialAvatarAccess) C0HYP.LIZIZ.getValue()).LIZIZ() && ((j == 0 || System.currentTimeMillis() - j <= TimeUnit.HOURS.toMillis(48L)) && !z && !z2)) {
                        this.LLILLJJLI.LIZ = true;
                        ImageView imageView = new ImageView(this.LLILLL);
                        ProfileBottomTabServiceImpl profileBottomTabServiceImpl = this.LLILLJJLI;
                        imageView.setImageResource(R.drawable.d0k);
                        profileBottomTabServiceImpl.getClass();
                        if ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) {
                            i = 36;
                        } else {
                            i = 30;
                        }
                        int i2 = i - 6;
                        C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(i2))), 1));
                        ProfileBottomTabServiceImpl profileBottomTabServiceImpl2 = this.LLILLJJLI;
                        Context context = this.LLILLL;
                        profileBottomTabServiceImpl2.getClass();
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                        if (c19egLIZIZ != null && (abstractC1591090rVTY012 = C1591880rWk.LIZIZ.LJIILL(c19egLIZIZ).y01()) != null) {
                            abstractC1591090rVTY012.LJIIIIZZ(imageView);
                        }
                        if (C0HYP.LJ().getLong("profile_icon_flip_show_timestamp", 0L) == 0) {
                            C0HYP.LJ().storeLong("profile_icon_flip_show_timestamp", System.currentTimeMillis());
                        }
                        C0HWW.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("action_type", "show");
                        C20684815ws.LJIILLIIL("show_profile_icon_flipped", c2344009Gk.LIZ);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ProfileBottomTabServiceImpl@8e47.changeSocialAvatarIconFlipVisibility$1");
                return unit;
            }
        } else {
            this.LLILLJJLI.LIZ = false;
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LLILLL);
            if (c19egLIZIZ2 != null && (abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19egLIZIZ2).y01()) != null) {
                abstractC1591090rVTY01.LJJIZ();
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBottomTabServiceImpl@8e47.changeSocialAvatarIconFlipVisibility$1");
        return unit2;
    }
}
