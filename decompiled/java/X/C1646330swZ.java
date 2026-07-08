package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0swZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cameraspec.ChangeCameraSpecComponent$changeCameraSpec$1", f = "ChangeCameraSpecComponent.kt", l = {}, m = "invokeSuspend")
public final class C1646330swZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1649170t19 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646330swZ(C1649170t19 c1649170t19, String str, InterfaceC1364105Vn<? super C1646330swZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1649170t19;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1646330swZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeCameraSpecComponent@58a7.changeCameraSpec$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1649220t1E interfaceC1649220t1EZ4 = this.LL.Z4();
        if (interfaceC1649220t1EZ4 != null) {
            interfaceC1649220t1EZ4.rH1(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeCameraSpecComponent@58a7.changeCameraSpec$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
