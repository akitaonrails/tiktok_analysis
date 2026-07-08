package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import njp.a;

/* JADX INFO: renamed from: X.0TsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$setEffect$1", f = "LiveEffectTestHelper.kt", l = {23}, m = "invokeSuspend")
public final class C760520TsQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760520TsQ(String str, String str2, InterfaceC1364105Vn<? super C760520TsQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760520TsQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectTestHelper@73b1.setEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0U8T c0u8t = C0U8T.LIZ;
            String str = this.LLILLJJLI;
            String str2 = C0UD4.LIZIZ;
            String str3 = this.LLILLL;
            this.LL = 1;
            obj = c0u8t.LJFF(str, str2, str3, this, AFwS199S0000000_12.get$arr$(476), null, null, true, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveEffectTestHelper@73b1.setEffect$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C766270U4b.LJIIJJI("set effect fail");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEffectTestHelper@73b1.setEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
