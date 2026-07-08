package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakSharerFilterManager$getFeatureResultSyncWithTimeout$1$1", f = "StreakSharerFilterManager.kt", l = {104}, m = "invokeSuspend")
public final class C374501ct extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C374501ct(AnonymousClass0957<Unit> anonymousClass0957, InterfaceC1364105Vn<? super C374501ct> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C374501ct(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1$1");
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
            AnonymousClass0957<Unit> anonymousClass0957 = this.LLILLJJLI;
            if (anonymousClass0957 != null) {
                this.LL = 1;
                if (anonymousClass0957.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakSharerFilterManager@bb26.getFeatureResultSyncWithTimeout$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
