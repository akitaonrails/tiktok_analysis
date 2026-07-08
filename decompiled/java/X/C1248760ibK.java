package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS633S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0ibK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.component.BaseUIComponent$reportProfileStandardInfoClick$1", f = "BaseUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C1248760ibK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseUIComponent LL;
    public final /* synthetic */ ProfileComponents LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248760ibK(BaseUIComponent baseUIComponent, ProfileComponents profileComponents, InterfaceC1364105Vn<? super C1248760ibK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseUIComponent;
        this.LLILLJJLI = profileComponents;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1248760ibK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String uid;
        ProfilePlatformProtocol<BizBaseData> profilePlatformProtocolAp;
        C1252220igu otherParams;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        C1C7U.LIZ("BaseUIComponent@1eb6.reportProfileStandardInfoClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1252480ihK c1252480ihK = null;
        MyProfileAbility myProfileAbility = (MyProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), MyProfileAbility.class, null);
        if (myProfileAbility != null && myProfileAbility.Om()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        ProfileCommonInfo profileCommonInfoVo = this.LL.Vo();
        String str2 = "";
        if (profileCommonInfoVo == null || (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) == null || (uid = userProfileInfo.getUid()) == null) {
            uid = "";
        }
        ProfilePlatformViewModel profilePlatformViewModelZo = this.LL.Zo();
        if (profilePlatformViewModelZo != null && (aweme = profilePlatformViewModelZo.getAweme()) != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
            c1252480ihK = otherParams.LJIJI;
        }
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        ProfileComponents profileComponents = this.LLILLJJLI;
        if (profileComponents == null && ((profilePlatformProtocolAp = this.LL.ap()) == null || (profileComponents = profilePlatformProtocolAp.LLJILJILJ) == null)) {
            profileComponents = this.LL.LLJJJ;
        }
        BaseUIComponent baseUIComponent = this.LL;
        int i = baseUIComponent.LLJILLL;
        AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(baseUIComponent, 154);
        c1248840ibS.getClass();
        C1248840ibS.LIZIZ(str, str2, uid, profileComponents, c1252480ihK, i, awS633S0100000_19);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseUIComponent@1eb6.reportProfileStandardInfoClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
