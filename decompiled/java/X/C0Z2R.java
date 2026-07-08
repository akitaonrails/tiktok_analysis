package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import tbk.c;

/* JADX INFO: renamed from: X.0Z2R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.publish.inspirerepost.PostPushManager$sendLocalPushInternal$1", f = "PostPushManager.kt", l = {}, m = "invokeSuspend")
public final class C0Z2R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<C19323510in> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z2R(Function0<C19323510in> function0, InterfaceC1364105Vn<? super C0Z2R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z2R(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostPushManager@4f06.sendLocalPushInternal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1908480zlO.LIZIZ.LIZLLL(this.LL.invoke())) {
            c.LIZLLL = EnumC755480TkI.LLILLJJLI;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostPushManager@4f06.sendLocalPushInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
