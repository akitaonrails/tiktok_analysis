package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetAssem;
import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetAssem$onCreate$1", f = "StreakPetAssem.kt", l = {124}, m = "invokeSuspend")
public final class C1572106Dn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StreakPetAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572106Dn(StreakPetAssem streakPetAssem, InterfaceC1364105Vn<? super C1572106Dn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = streakPetAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1572106Dn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StreakPetAssem@a8a3.onCreate$1");
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
            StreakPetAssem streakPetAssem = this.LLILLJJLI;
            C1598406Nq c1598406Nq = streakPetAssem.LLILZLL;
            if (c1598406Nq == null) {
                synchronized (streakPetAssem) {
                    c1598406Nq = streakPetAssem.LLILZLL;
                    if (c1598406Nq == null) {
                        c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                        streakPetAssem.LLILZLL = c1598406Nq;
                    }
                }
            }
            AbstractC2252651DEx abstractC2252651DEx = c1598406Nq.LIZ;
            C1572206Do c1572206Do = new C1572206Do(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2252651DEx, c1572206Do);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakPetAssem@a8a3.onCreate$1");
                return objLJFF;
            }
        }
        StreakPetData streakPetData = (StreakPetData) obj;
        C1572806Du.LL.Z7(streakPetData);
        this.LLILLJJLI.getLifecycle().addObserver((StreakJsEventHandler) this.LLILLJJLI.LLILZ.getValue());
        this.LLILLJJLI.getLifecycle().addObserver((StreakJsEventHandler) this.LLILLJJLI.LLILZIL.getValue());
        C1572506Dr.LIZ().LIZIZ(streakPetData, this.LLILLJJLI.bo());
        C06I0.LIZIZ.getClass();
        C06I0.LIZIZ(streakPetData);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetAssem@a8a3.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
