package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.DefaultResourceProvider$downloadEffectById$3$2$1", f = "DefaultResourceProvider.kt", l = {}, m = "invokeSuspend")
public final class C1704690uSh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1704730uSl<Effect> LL;
    public final /* synthetic */ InterfaceC1705380uTo<Effect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1704690uSh(C1704730uSl<Effect> c1704730uSl, InterfaceC1705380uTo<? super Effect> interfaceC1705380uTo, InterfaceC1364105Vn<? super C1704690uSh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1704730uSl;
        this.LLILLJJLI = interfaceC1705380uTo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704690uSh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultResourceProvider@b5b8.downloadEffectById$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = this.LL.LIZ;
        if (effect != null) {
            InterfaceC1705380uTo<Effect> interfaceC1705380uTo = this.LLILLJJLI;
            if (interfaceC1705380uTo != null) {
                interfaceC1705380uTo.LIZIZ(effect, false);
            }
        } else {
            InterfaceC1705380uTo<Effect> interfaceC1705380uTo2 = this.LLILLJJLI;
            if (interfaceC1705380uTo2 != null) {
                interfaceC1705380uTo2.LIZ(-1, "");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultResourceProvider@b5b8.downloadEffectById$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
