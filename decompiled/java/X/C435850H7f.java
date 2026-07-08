package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0H7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoKeyFrameAssem$initListener$3$1", f = "SearchVideoKeyFrameAssem.kt", l = {}, m = "invokeSuspend")
public final class C435850H7f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ SearchVideoKeyFrameAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435850H7f(View view, SearchVideoKeyFrameAssem searchVideoKeyFrameAssem, InterfaceC1364105Vn<? super C435850H7f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = searchVideoKeyFrameAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435850H7f(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchVideoKeyFrameAssem@1893.initListener$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL;
        C2211631BhB.LJ(view, new AwS372S0200000_6(this.LLILLJJLI, view, 21));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoKeyFrameAssem@1893.initListener$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
