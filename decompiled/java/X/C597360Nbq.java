package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Nbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.UserSearchContentUpdateEngine$fullUpdate$overallCost$1$1", f = "UserSearchContentUpdateEngine.kt", l = {158}, m = "invokeSuspend")
public final class C597360Nbq extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends IMUserBaseInfo>>, Object> {
    public int LL;
    public final /* synthetic */ C907530Zix LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597360Nbq(C907530Zix c907530Zix, InterfaceC1364105Vn<? super C597360Nbq> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c907530Zix;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597360Nbq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends IMUserBaseInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserSearchContentUpdateEngine@f047.fullUpdate$overallCost$1$1");
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
            Function1<InterfaceC1364105Vn<? super List<IMUserBaseInfo>>, Object> function1 = this.LLILLJJLI.LJ;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047.fullUpdate$overallCost$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047.fullUpdate$overallCost$1$1");
        return obj;
    }
}
