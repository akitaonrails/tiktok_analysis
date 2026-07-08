package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L12, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoUploadMVStage$action$1$3", f = "PhotoUploadMVStage.kt", l = {}, m = "invokeSuspend")
public final class C0L12 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C0L17<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L12(C013C c013c, C0L17<Object> c0l17, InterfaceC1364105Vn<? super C0L12> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = c0l17;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L12(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoUploadMVStage@5ce.action$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.element) {
            C0L14 c0l14 = C0L14.LIZ;
            C0L13 c0l13 = (C0L13) this.LLILLJJLI;
            c0l14.getClass();
            C0L14.LIZIZ(c0l13);
        } else {
            ((C0L13) this.LLILLJJLI).LJFF.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoUploadMVStage@5ce.action$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
