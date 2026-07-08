package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.bottombar.CommentImageEditBottomBarComponent$onSave$2", f = "CommentImageEditBottomBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0NTJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1451860nsu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTJ(C1451860nsu c1451860nsu, InterfaceC1364105Vn<? super C0NTJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1451860nsu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CommentImageEditBottomBarComponent@a28c.onSave$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1450620nqu interfaceC1450620nquX5 = this.LL.x5();
        if (interfaceC1450620nquX5 != null) {
            interfaceC1450620nquX5.hide();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.onSave$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
