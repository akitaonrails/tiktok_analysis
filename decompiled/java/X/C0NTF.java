package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.bottombar.CommentImageEditBottomBarComponent$saveAction$1$1", f = "CommentImageEditBottomBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0NTF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1451860nsu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTF(C1451860nsu c1451860nsu, InterfaceC1364105Vn<? super C0NTF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1451860nsu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentImageEditBottomBarComponent@a28c.saveAction$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FNV.LIZ(this.LL.t5());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.saveAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
