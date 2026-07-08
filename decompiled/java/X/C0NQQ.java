package X;

import com.ss.android.ugc.aweme.tako.otherpage.share.api.ShareMessageResponse;
import com.ss.android.ugc.aweme.tako.otherpage.share.api.TakoShareApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.api.TakoShareRepository$operator$1$shareMessage$2", f = "TakoShareRepository.kt", l = {45, 51}, m = "invokeSuspend")
public final class C0NQQ extends C09AX implements Function2<InterfaceC346701Wf<? super ShareMessageResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NQS LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQQ(C0NQS c0nqs, String str, String str2, String str3, InterfaceC1364105Vn<? super C0NQQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nqs;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NQQ c0nqq = new C0NQQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0nqq.LLILLJJLI = obj;
        return c0nqq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("TakoShareRepository@f812.operator$1$shareMessage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoShareRepository@f812.operator$1$shareMessage$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            TakoShareApi takoShareApi = (TakoShareApi) this.LLILLL.LL.getValue();
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = takoShareApi.shareMessage(str, str2, "tako_prompts_share_optimize", str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoShareRepository@f812.operator$1$shareMessage$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("TakoShareRepository@f812.operator$1$shareMessage$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoShareRepository@f812.operator$1$shareMessage$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super ShareMessageResponse> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
