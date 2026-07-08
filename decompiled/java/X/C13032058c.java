package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$addPitayaMsgObserver$1", f = "EcUgPitayaManager.kt", l = {}, m = "invokeSuspend")
public final class C13032058c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13032058c(long j, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13032058c(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("EcUgPitayaManager@a4f0.addPitayaMsgObserver$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C13034058e c13034058e = C13034058e.LIZ;
        EnumC13036058g enumC13036058g = EnumC13036058g.REGISTER_HANDLER;
        EnumC13035058f enumC13035058f = EnumC13035058f.REGISTER_RESPONSE_HANDLER;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("duration", C2286608xc.LJFF(this.LL));
        if (this.LLILLJJLI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_pitaya_ready", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c13034058e.getClass();
        C13034058e.LIZ(enumC13036058g, enumC13035058f, true, mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPitayaManager@a4f0.addPitayaMsgObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
