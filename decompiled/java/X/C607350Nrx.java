package X;

import Y.AObserverS174S0200000_9;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS410S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.UserSearchContentUpdateEngine$_relationObserverFlow$1", f = "UserSearchContentUpdateEngine.kt", l = {102}, m = "invokeSuspend")
public final class C607350Nrx extends C09AX implements Function2<C094D<? super C597380Nbs>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EventLiveData<FollowStatus> LLILLL;
    public final /* synthetic */ Function1<Integer, Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C607350Nrx(EventLiveData<FollowStatus> eventLiveData, Function1<? super Integer, Boolean> function1, InterfaceC1364105Vn<? super C607350Nrx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = eventLiveData;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C607350Nrx c607350Nrx = new C607350Nrx(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c607350Nrx.LLILLJJLI = obj;
        return c607350Nrx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserSearchContentUpdateEngine@f047._relationObserverFlow$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            AObserverS174S0200000_9 aObserverS174S0200000_9 = new AObserverS174S0200000_9(this.LLILZ, c094d, 1);
            this.LLILLL.observeForever(aObserverS174S0200000_9);
            AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(this.LLILLL, aObserverS174S0200000_9, 97);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS410S0200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047._relationObserverFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047._relationObserverFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C597380Nbs> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
