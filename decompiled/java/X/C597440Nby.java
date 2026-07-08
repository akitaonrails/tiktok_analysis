package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileBgBizData;
import com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent$parseBizDataAsync$1$1", f = "ProfileBackgroundComponent.kt", l = {}, m = "invokeSuspend")
public final class C597440Nby extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ProfileBackgroundComponent LLILLJJLI;
    public final /* synthetic */ ProfileBgBizData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597440Nby(ProfileBackgroundComponent profileBackgroundComponent, ProfileBgBizData profileBgBizData, InterfaceC1364105Vn<? super C597440Nby> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileBackgroundComponent;
        this.LLILLL = profileBgBizData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597440Nby c597440Nby = new C597440Nby(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c597440Nby.LL = obj;
        return c597440Nby;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileBackgroundComponent@e625.parseBizDataAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ProfileBackgroundComponent@e625.parseBizDataAsync$1$1");
            return unit;
        }
        ProfileBackgroundComponent profileBackgroundComponent = this.LLILLJJLI;
        profileBackgroundComponent.LLLLII = false;
        ProfileBgBizData profileBgBizData = this.LLILLL;
        profileBackgroundComponent.LLJJL = profileBgBizData;
        profileBackgroundComponent.LLJJIJIIJIL = profileBgBizData;
        if (profileBackgroundComponent.LLJJ != null) {
            profileBackgroundComponent.tp();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBackgroundComponent@e625.parseBizDataAsync$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
