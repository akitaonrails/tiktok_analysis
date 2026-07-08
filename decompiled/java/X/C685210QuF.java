package X;

import android.text.Layout;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchPovCardDocAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchPovCardDocAssem$onBind$2$1", f = "SearchPovCardDocAssem.kt", l = {}, m = "invokeSuspend")
public final class C685210QuF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchPovCardDocAssem LL;
    public final /* synthetic */ Layout LLILLJJLI;
    public final /* synthetic */ Layout LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685210QuF(SearchPovCardDocAssem searchPovCardDocAssem, Layout layout, Layout layout2, InterfaceC1364105Vn<? super C685210QuF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchPovCardDocAssem;
        this.LLILLJJLI = layout;
        this.LLILLL = layout2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C685210QuF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPovCardDocAssem@40e2.onBind$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21415018rM c21415018rM = this.LL.LLJLIL;
        if (c21415018rM != null) {
            c21415018rM.setTextLayout(this.LLILLJJLI);
        }
        C21415018rM c21415018rM2 = this.LL.LLJLLL;
        if (c21415018rM2 != null) {
            c21415018rM2.setTextLayout(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPovCardDocAssem@40e2.onBind$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
