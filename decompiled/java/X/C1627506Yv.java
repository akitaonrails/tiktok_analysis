package X;

import Y.AgS193S0200000_2;
import android.view.View;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedInfoAreaAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedInfoAreaAssem$onViewCreated$1", f = "TakoAIVideoFeedInfoAreaAssem.kt", l = {140}, m = "invokeSuspend")
public final class C1627506Yv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAIVideoFeedInfoAreaAssem LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627506Yv(TakoAIVideoFeedInfoAreaAssem takoAIVideoFeedInfoAreaAssem, View view, InterfaceC1364105Vn<? super C1627506Yv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAIVideoFeedInfoAreaAssem;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1627506Yv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedInfoAreaAssem@d489.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDqK5 = this.LLILLJJLI.dp().k5();
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLJJLI, this.LLILLL, 14);
            this.LL = 1;
            if (c2252321DDqK5.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoFeedInfoAreaAssem@d489.onViewCreated$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
