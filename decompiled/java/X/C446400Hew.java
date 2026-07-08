package X;

import android.content.Context;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.profile.ui.ability.IProfileBottomTabService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem$showSocialAvatarIconFlip$1", f = "MainPageSocialAssem.kt", l = {}, m = "invokeSuspend")
public final class C446400Hew extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MainPageSocialAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446400Hew(MainPageSocialAssem mainPageSocialAssem, InterfaceC1364105Vn<? super C446400Hew> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mainPageSocialAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446400Hew(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        Context context;
        IProfileBottomTabService iProfileBottomTabService;
        C1C7U.LIZ("MainPageSocialAssem@697e.showSocialAvatarIconFlip$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("friends avatar ability ");
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbility = (IBottomFriendsTabAvatarAbility) this.LL.LLJJI.getValue();
        if (iBottomFriendsTabAvatarAbility != null) {
            boolValueOf = Boolean.valueOf(iBottomFriendsTabAvatarAbility.isShowing());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", showEntrances: ");
        sbLIZ.append(((SocialAvatarAccess) this.LL.LLJJIII.getValue()).LIZLLL());
        sbLIZ.append(", entrance control: ");
        C0HZE c0hze = C0HZE.LIZIZ;
        sbLIZ.append(c0hze.LJIIIIZZ());
        C2188811AlT.LIZIZ(sbLIZ);
        IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbility2 = (IBottomFriendsTabAvatarAbility) this.LL.LLJJI.getValue();
        if ((iBottomFriendsTabAvatarAbility2 == null || !iBottomFriendsTabAvatarAbility2.isShowing()) && ((SocialAvatarAccess) this.LL.LLJJIII.getValue()).LIZLLL() && c0hze.LJIIIIZZ() && (context = this.LL.getContext()) != null && (iProfileBottomTabService = (IProfileBottomTabService) this.LL.LLJJ.getValue()) != null) {
            iProfileBottomTabService.LIZIZ(context, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainPageSocialAssem@697e.showSocialAvatarIconFlip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
