package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem$initListener$2$1$1", f = "SearchKeyframeOptDir3PanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C506201y8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchKeyframeOptDir3PanelAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506201y8(View view, SearchKeyframeOptDir3PanelAssem searchKeyframeOptDir3PanelAssem, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchKeyframeOptDir3PanelAssem;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C506201y8(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchKeyframeOptDir3PanelAssem@2187.initListener$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1 function1 = (Function1) C723850SaN.LJFF(this.LL, "prop_collapse_request");
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchKeyframeOptDir3PanelAssem@2187.initListener$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
