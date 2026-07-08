package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.RecordTimerKt$RecordTimer$1$1", f = "RecordTimer.kt", l = {39}, m = "invokeSuspend")
public final class C05AX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ EnumC1308705Af LLILLL;
    public final /* synthetic */ C05P0<Long> LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;
    public final /* synthetic */ C05P0<C09AE> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AX(EnumC1308705Af enumC1308705Af, C05P0<Long> c05p0, C05P0<Boolean> c05p02, C05P0<C09AE> c05p03, InterfaceC1364105Vn<? super C05AX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC1308705Af;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AX(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05P0 c05p0;
        C1C7U.LIZ("RecordTimerKt@721f.RecordTimer$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c05p0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C05AY.LIZ[this.LLILLL.ordinal()] == 1) {
                this.LLILZ.setValue(0L);
                this.LLILZIL.setValue(Boolean.FALSE);
                c05p0 = this.LLILZLL;
                C05AW c05aw = new C05AW(this.LLILZIL, this.LLILZ, null);
                this.LL = c05p0;
                this.LLILLJJLI = 1;
                obj = C2296808zG.LJ(c05aw, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RecordTimerKt@721f.RecordTimer$1$1");
                    return objLJFF;
                }
            } else {
                C09AE value = this.LLILZLL.getValue();
                if (value != null) {
                    value.LIZIZ(null);
                }
                this.LLILZLL.setValue(null);
                this.LLILZ.setValue(0L);
                this.LLILZIL.setValue(Boolean.FALSE);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecordTimerKt@721f.RecordTimer$1$1");
                return unit;
            }
        }
        c05p0.setValue(obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordTimerKt@721f.RecordTimer$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
