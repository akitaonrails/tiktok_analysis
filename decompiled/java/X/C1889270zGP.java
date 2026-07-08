package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.inbox.widget.multi.UserCardSkeletonLoadingWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IRecommendUserAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.UserCardSkeletonLoadingWidget$initializeWidgetData$2", f = "UserCardSkeletonLoadingWidget.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1889270zGP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCardSkeletonLoadingWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889270zGP(UserCardSkeletonLoadingWidget userCardSkeletonLoadingWidget, InterfaceC1364105Vn<? super C1889270zGP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardSkeletonLoadingWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889270zGP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<InboxWidgetStatus> c05ydEX0;
        C1C7U.LIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$2");
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
            UserCardSkeletonLoadingWidget userCardSkeletonLoadingWidget = this.LLILLJJLI;
            userCardSkeletonLoadingWidget.getClass();
            InboxCommonAbilityCenter$IBaseRecommendUserAbility inboxCommonAbilityCenter$IBaseRecommendUserAbility = (InboxCommonAbilityCenter$IBaseRecommendUserAbility) C1558520qew.LIZ(C1558520qew.LJIIL(userCardSkeletonLoadingWidget), FollowerPageAbilityCenter$IRecommendUserAbility.class, null);
            if (inboxCommonAbilityCenter$IBaseRecommendUserAbility != null && (c05ydEX0 = inboxCommonAbilityCenter$IBaseRecommendUserAbility.EX0()) != null) {
                C19335010ke c19335010ke = new C19335010ke(c05ydEX0, 3);
                AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLJJLI, 9);
                this.LL = 1;
                if (c19335010ke.collect(agS308S0100000_28, this) == objLJFF) {
                    C1C7U.LIZIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardSkeletonLoadingWidget@458c.initializeWidgetData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
