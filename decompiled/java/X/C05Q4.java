package X;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.celebration.CelebrationPosterComponent$createPoster$1$2$1", f = "CelebrationPosterComponent.kt", l = {}, m = "invokeSuspend")
public final class C05Q4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MPL LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;
    public final /* synthetic */ C259800zU<Effect> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Q4(C0MPL c0mpl, View view, C259800zU<Bitmap> c259800zU, C259800zU<Effect> c259800zU2, InterfaceC1364105Vn<? super C05Q4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mpl;
        this.LLILLJJLI = view;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Q4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationPosterComponent@e211.createPoster$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.i3(this.LLILLJJLI, this.LLILLL.element);
        this.LL.v3(this.LLILLJJLI);
        this.LL.m3(this.LLILZ.element, this.LLILLJJLI);
        this.LL.c3(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationPosterComponent@e211.createPoster$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
