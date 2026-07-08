package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotBarAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBotBarAssem$onBotExit$1", f = "TakoBotBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C1568940qvk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoBotBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568940qvk(TakoBotBarAssem takoBotBarAssem, InterfaceC1364105Vn<? super C1568940qvk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoBotBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568940qvk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBotBarAssem@53a1.onBotExit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            iTakoContextAbility.PG0(new C144T(1, "", "", 1L, "", ""));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBotBarAssem@53a1.onBotExit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
