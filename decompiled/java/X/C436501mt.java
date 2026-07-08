package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaDescDownloadManager$startDownload$downloadListener$1$onStart$1", f = "SeaDescDownloadManager.kt", l = {}, m = "invokeSuspend")
public final class C436501mt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C436501mt(Function1<? super Boolean, Unit> function1, View view, InterfaceC1364105Vn<? super C436501mt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436501mt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaDescDownloadManager@9e06.startDownload$downloadListener$1$onStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<Boolean, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(true);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
        c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
        c1389890mGx.LJII(R.attr.ee);
        c1389890mGx.LJIIIZ(2131839185);
        c1389890mGx.LIZLLL(500L);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaDescDownloadManager@9e06.startDownload$downloadListener$1$onStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
