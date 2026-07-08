package X;

import com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction$routeToInboxThen$1", f = "SocialThoughtRouteAction.kt", l = {150}, m = "invokeSuspend")
public final class C314570CUt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialThoughtRouteAction LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ Function1<C19EG, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C314570CUt(SocialThoughtRouteAction socialThoughtRouteAction, C19EG c19eg, Function1<? super C19EG, Unit> function1, InterfaceC1364105Vn<? super C314570CUt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialThoughtRouteAction;
        this.LLILLL = c19eg;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314570CUt(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtRouteAction@262b.routeToInboxThen$1");
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
            SocialThoughtRouteAction socialThoughtRouteAction = this.LLILLJJLI;
            C19EG c19eg = this.LLILLL;
            this.LL = 1;
            obj = socialThoughtRouteAction.waitForNewTopActivity(c19eg, 2000L, 50L, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtRouteAction@262b.routeToInboxThen$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialThoughtRouteAction@262b.routeToInboxThen$1");
            return unit;
        }
        this.LLILZ.invoke((C19EG) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtRouteAction@262b.routeToInboxThen$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
