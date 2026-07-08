package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellComposablesKt$MusicRow$1$1", f = "MusicCellComposables.kt", l = {}, m = "invokeSuspend")
public final class C631190OpJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C631940OqW LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631190OpJ(C631940OqW c631940OqW, Function0<Unit> function0, InterfaceC1364105Vn<? super C631190OpJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c631940OqW;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C631190OpJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicCellComposablesKt@4557.MusicRow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isHighlighted()) {
            this.LLILLJJLI.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCellComposablesKt@4557.MusicRow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
