package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.09MS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem$initSubscribe$2$1", f = "SearchKeyframeOptDir2Assem.kt", l = {}, m = "invokeSuspend")
public final class C09MS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ SearchKeyframeOptDir2Assem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09MS(View view, SearchKeyframeOptDir2Assem searchKeyframeOptDir2Assem, InterfaceC1364105Vn<? super C09MS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = searchKeyframeOptDir2Assem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09MS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchKeyframeOptDir2Assem@78b8.initSubscribe$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL;
        C2211631BhB.LJ(view, new AwS372S0200000_6(view, this.LLILLJJLI, 85));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchKeyframeOptDir2Assem@78b8.initSubscribe$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
