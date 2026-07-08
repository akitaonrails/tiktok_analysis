package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventManager$unregisterJsEventSubscriber$1", f = "StreakJsEventManager.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1574406Ek extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574406Ek(String str, InterfaceC1364105Vn<? super C1574406Ek> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1574406Ek(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakJsEventManager@367b.unregisterJsEventSubscriber$1");
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
            C1609406Rw c1609406Rw = C1609406Rw.LIZ;
            C1574006Eg.LLILLJJLI.getClass();
            C085L c085l = (C085L) C1574006Eg.LLIZ.getValue();
            String str = this.LLILLJJLI;
            this.LL = 1;
            if (c1609406Rw.LIZIZ(c085l, str, this) == objLJFF) {
                C1C7U.LIZIZ("StreakJsEventManager@367b.unregisterJsEventSubscriber$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakJsEventManager@367b.unregisterJsEventSubscriber$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
