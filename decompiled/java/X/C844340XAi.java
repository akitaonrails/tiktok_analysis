package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailActivity$onCreate$2", f = "TakoAiVideoDetailActivity.kt", l = {52}, m = "invokeSuspend")
public final class C844340XAi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ TakoAiVideoDetailActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844340XAi(TakoAiVideoDetailActivity takoAiVideoDetailActivity, InterfaceC1364105Vn<? super C844340XAi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAiVideoDetailActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844340XAi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAiVideoDetailActivity@79a2.onCreate$2");
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
            C844350XAj c844350XAj = C844350XAj.LIZ;
            this.LL = 1;
            c844350XAj.getClass();
            obj = C844350XAj.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoAiVideoDetailActivity@79a2.onCreate$2");
                return objLJFF;
            }
        }
        String str = (String) obj;
        this.LLILLJJLI.LLILZLL = str;
        C1C7U.LIZIZ("TakoAiVideoDetailActivity@79a2.onCreate$2");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
