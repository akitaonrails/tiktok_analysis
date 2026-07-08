package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoBottomHeightAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedVideoBottomHeightAssem$observeBottomHeight$1", f = "TakoAIVideoFeedVideoBottomHeightAssem.kt", l = {}, m = "invokeSuspend")
public final class C433970Gzz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ TakoAIVideoFeedVideoBottomHeightAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433970Gzz(View view, TakoAIVideoFeedVideoBottomHeightAssem takoAIVideoFeedVideoBottomHeightAssem, InterfaceC1364105Vn<? super C433970Gzz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = takoAIVideoFeedVideoBottomHeightAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433970Gzz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.observeBottomHeight$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLJJJJ;
        View view = this.LL;
        c2252321DDq.setValue(C2286608xc.LJ(TakoAIVideoFeedVideoBottomHeightAssem.cp(view.getBottom() - this.LL.getTop(), view)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoFeedVideoBottomHeightAssem@148f.observeBottomHeight$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
