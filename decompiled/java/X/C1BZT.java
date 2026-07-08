package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1BZT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.model.CombineEntranceAutoTranslateSetting$1", f = "CombineEntranceAutoTranslateSetting.kt", l = {}, m = "invokeSuspend")
public final class C1BZT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1BZY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BZT(C1BZY c1bzy, InterfaceC1364105Vn<? super C1BZT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1bzy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1BZT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CombineEntranceAutoTranslateSetting@ca44.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C1BZY c1bzy = this.LL;
        c1bzy.getClass();
        if (!C1BZV.LIZ()) {
            C0C5P.LIZJ().LJIIJJI("cla_auto_translation_by_default_new_user_enabled", new InterfaceC304970BxP() { // from class: X.1BZU
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    C1BZV.LIZIZ = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "cla_auto_translation_by_default_new_user_enabled", false, false));
                    if (C1BZV.LIZ()) {
                        c1bzy.LIZ();
                        C0C5P.LIZJ().LJIJ("cla_auto_translation_by_default_new_user_enabled", this);
                    }
                }
            });
        } else {
            c1bzy.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombineEntranceAutoTranslateSetting@ca44.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
