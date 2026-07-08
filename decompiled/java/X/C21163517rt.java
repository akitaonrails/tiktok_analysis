package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.download.ability.AbsBaseDownloadAbility$abilityCancel$1", f = "AbsBaseDownloadAbility.kt", l = {}, m = "invokeSuspend")
public final class C21163517rt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC21169717st<CONTEXT> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21163517rt(AbstractC21169717st<CONTEXT> abstractC21169717st, InterfaceC1364105Vn<? super C21163517rt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC21169717st;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21163517rt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsBaseDownloadAbility@8e27.abilityCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2222908nL.LIZJ(this.LL.LIZLLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsBaseDownloadAbility@8e27.abilityCancel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
