package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Owe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.SubscribeHelper$tryShowSubscribeCard$1$resp$1", f = "SubscribeHelper.kt", l = {208}, m = "invokeSuspend")
public final class C635740Owe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SubscribeInfoResponse>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ C635690OwZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C635740Owe(int i, List<Integer> list, C635690OwZ c635690OwZ, InterfaceC1364105Vn<? super C635740Owe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = c635690OwZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C635740Owe(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscribeHelper@2963.tryShowSubscribeCard$1$resp$1");
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
            C635700Owa c635700Owa = C635700Owa.LIZ;
            int i2 = this.LLILLJJLI;
            List<Integer> list = this.LLILLL;
            C635690OwZ c635690OwZ = this.LLILZ;
            this.LL = 1;
            obj = c635700Owa.LIZ(i2, list, c635690OwZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SubscribeInfoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
