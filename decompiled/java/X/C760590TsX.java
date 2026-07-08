package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0TsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.schema.EffectSchemaDispatchCenter$setSingleEffect$1", f = "EffectSchemaDispatchCenter.kt", l = {73, 77}, m = "invokeSuspend")
public final class C760590TsX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C760600TsY LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760590TsX(String str, String str2, String str3, String str4, C760600TsY c760600TsY, Map<String, String> map, String str5, InterfaceC1364105Vn<? super C760590TsX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = c760600TsY;
        this.LLIZ = map;
        this.LLIZLLLIL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760590TsX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = obj;
        C1C7U.LIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJFF);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJFF);
        } else {
            C155000ia.LIZIZ(objLJFF);
            C0U8T c0u8t = C0U8T.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(509);
            boolean zLJFF = Intrinsics.LJFF(this.LLILZIL, "play_book");
            this.LL = 1;
            objLJFF = c0u8t.LJFF(str, str2, str3, this, aFwS199S0000000_12, null, null, true, zLJFF);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1");
                return objLJFF2;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJFF).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C760580TsW c760580TsW = new C760580TsW(zBooleanValue, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c760580TsW) == objLJFF2) {
            C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1");
            return objLJFF2;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.setSingleEffect$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
