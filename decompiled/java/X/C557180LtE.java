package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoRestoreTaskHandler$onRestoreFail$3", f = "AILivePhotoRestoreTaskHandler.kt", l = {}, m = "invokeSuspend")
public final class C557180LtE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C557190LtF LL;
    public final /* synthetic */ C0LSZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557180LtE(C557190LtF c557190LtF, C0LSZ c0lsz, InterfaceC1364105Vn<? super C557180LtE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c557190LtF;
        this.LLILLJJLI = c0lsz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557180LtE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILivePhotoRestoreTaskHandler@7924.onRestoreFail$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL.PE(this.LLILLJJLI.LJIILL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoRestoreTaskHandler@7924.onRestoreFail$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
