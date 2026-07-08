package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$removeItem$1", f = "UserCardListAbility.kt", l = {154}, m = "invokeSuspend")
public final class C1261690iwB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1262230ix3 LLILLJJLI;
    public final /* synthetic */ UserCardListAbility LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261690iwB(InterfaceC1262230ix3 interfaceC1262230ix3, UserCardListAbility userCardListAbility, InterfaceC1364105Vn<? super C1261690iwB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1262230ix3;
        this.LLILLL = userCardListAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1261690iwB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("UserCardListAbility@7b48.removeItem$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Object obj2 = this.LLILLJJLI;
                this.LL = 1;
                if (C1262360ixG.LIZ(this.LLILLL.LLILZ, (User) obj2, null, EnumC2010007u6.SCENE_CARD.getValue(), EnumC587510N2n.DISLIKE_USER.getValue(), this) == objLJFF) {
                    C1C7U.LIZIZ("UserCardListAbility@7b48.removeItem$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("ListAbility", "dislike error", thM5exceptionOrNullimpl);
        }
        this.LLILLL.rz((C1261860iwS) this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardListAbility@7b48.removeItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
