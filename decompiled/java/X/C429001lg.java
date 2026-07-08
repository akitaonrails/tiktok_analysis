package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS584S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.01lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.preview.ui.PreviewPanelComponent$captureAndCachePreviewBitmap$1$1", f = "PreviewPanelComponent.kt", l = {}, m = "invokeSuspend")
public final class C429001lg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C385710FAj LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C429001lg(C385710FAj c385710FAj, Function0<Unit> function0, C259800zU<Bitmap> c259800zU, InterfaceC1364105Vn<? super C429001lg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c385710FAj;
        this.LLILLJJLI = function0;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C429001lg(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewPanelComponent@4b21.captureAndCachePreviewBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.i3(new AwS584S0100000_5(this.LLILLL, (C259800zU<Effect>) 727));
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewPanelComponent@4b21.captureAndCachePreviewBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
