package X;

import android.graphics.drawable.GradientDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.view.RenderThumbnailView$renderBackground$1$1$1", f = "RenderThumbnailView.kt", l = {}, m = "invokeSuspend")
public final class C433790Gzh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C433800Gzi LL;
    public final /* synthetic */ GradientDrawable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433790Gzh(C433800Gzi c433800Gzi, GradientDrawable gradientDrawable, InterfaceC1364105Vn<? super C433790Gzh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c433800Gzi;
        this.LLILLJJLI = gradientDrawable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433790Gzh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RenderThumbnailView@90ac.renderBackground$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C433800Gzi c433800Gzi = this.LL;
        c433800Gzi.LLIZLLLIL = true;
        c433800Gzi.setBackground(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RenderThumbnailView@90ac.renderBackground$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
