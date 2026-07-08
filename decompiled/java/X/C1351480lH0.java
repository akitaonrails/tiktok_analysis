package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.multipanel.HorizontalEmojiMiniPanel$addMiniEmojiPanel$1$1", f = "HorizontalEmojiMiniPanel.kt", l = {}, m = "invokeSuspend")
public final class C1351480lH0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1351440lGw LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351480lH0(C1351440lGw c1351440lGw, InterfaceC1364105Vn<? super C1351480lH0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1351440lGw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1351480lH0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalEmojiMiniPanel@cf65.addMiniEmojiPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1351440lGw c1351440lGw = this.LL;
        c1351440lGw.LIZIZ(c1351440lGw.getMiniEmojiNum());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalEmojiMiniPanel@cf65.addMiniEmojiPanel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
