package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.inbox.widget.multi.UserCardSkeletonLoadingWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerWidgetContainerAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IRecommendUserAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.UserCardSkeletonLoadingWidget$initializeWidgetData$1", f = "UserCardSkeletonLoadingWidget.kt", l = {45}, m = "invokeSuspend")
public final class C1889290zGR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCardSkeletonLoadingWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889290zGR(UserCardSkeletonLoadingWidget userCardSkeletonLoadingWidget, InterfaceC1364105Vn<? super C1889290zGR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardSkeletonLoadingWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889290zGR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC332260D0u interfaceC332260D0uEa2;
        InterfaceC332260D0u interfaceC332260D0uLIZ;
        C1C7U.LIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            FollowerPageAbilityCenter$IFollowerWidgetContainerAbility followerPageAbilityCenter$IFollowerWidgetContainerAbility = (FollowerPageAbilityCenter$IFollowerWidgetContainerAbility) this.LLILLJJLI.LLIZLLLIL.getValue();
            if (followerPageAbilityCenter$IFollowerWidgetContainerAbility != null && (interfaceC332260D0uEa2 = followerPageAbilityCenter$IFollowerWidgetContainerAbility.Ea2()) != null) {
                C19335010ke c19335010ke = new C19335010ke(interfaceC332260D0uEa2, 2);
                UserCardSkeletonLoadingWidget userCardSkeletonLoadingWidget = this.LLILLJJLI;
                userCardSkeletonLoadingWidget.getClass();
                InboxCommonAbilityCenter$IBaseRecommendUserAbility inboxCommonAbilityCenter$IBaseRecommendUserAbility = (InboxCommonAbilityCenter$IBaseRecommendUserAbility) C1558520qew.LIZ(C1558520qew.LJIIL(userCardSkeletonLoadingWidget), FollowerPageAbilityCenter$IRecommendUserAbility.class, null);
                if (inboxCommonAbilityCenter$IBaseRecommendUserAbility == null || (interfaceC332260D0uLIZ = inboxCommonAbilityCenter$IBaseRecommendUserAbility.Mm2()) == null) {
                    interfaceC332260D0uLIZ = C1BNE.LIZ(EnumC1889520zGo.HAS_MORE);
                }
                C414301jJ c414301jJ = new C414301jJ(c19335010ke, interfaceC332260D0uLIZ, new C592700NMm(null));
                AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLJJLI, 7);
                this.LL = 1;
                if (c414301jJ.collect(agS308S0100000_28, this) == objLJFF) {
                    C1C7U.LIZIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
