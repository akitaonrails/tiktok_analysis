package X;

import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent$realSubscribeExposure$1", f = "BaseSlashGlueSlotAssemComponent.kt", l = {}, m = "invokeSuspend")
public final class C1173320gde extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseSlashGlueSlotAssemComponent<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1173320gde(BaseSlashGlueSlotAssemComponent<T> baseSlashGlueSlotAssemComponent, InterfaceC1364105Vn<? super C1173320gde> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseSlashGlueSlotAssemComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1173320gde c1173320gde = new C1173320gde(this.LLILLJJLI, interfaceC1364105Vn);
        c1173320gde.LL = obj;
        return c1173320gde;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSlashGlueSlotAssemComponent@bef1.realSubscribeExposure$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaseSlashGlueSlotAssemComponent@bef1.realSubscribeExposure$1");
            return unit;
        }
        this.LLILLJJLI.fm1();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseSlashGlueSlotAssemComponent@bef1.realSubscribeExposure$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
