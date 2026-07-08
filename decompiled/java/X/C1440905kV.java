package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.model.DmDelegate$sendVideoOrPhotoMsg$1", f = "DmDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1440905kV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20615115ld LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1440905kV(C20615115ld c20615115ld, InterfaceC1364105Vn<? super C1440905kV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20615115ld;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1440905kV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmDelegate@362a.sendVideoOrPhotoMsg$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmDelegate@362a.sendVideoOrPhotoMsg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
