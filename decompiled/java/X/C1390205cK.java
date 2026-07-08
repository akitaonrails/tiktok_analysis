package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$initDownloadJob$1", f = "OfflineModeManager.kt", l = {947}, m = "invokeSuspend")
public final class C1390205cK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1390205cK(InterfaceC1364105Vn<? super C1390205cK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390205cK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeManager@8800.initDownloadJob$1");
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
            C625470Og5 c625470Og5 = C625470Og5.LL;
            EnumC624980OfI enumC624980OfI = C625470Og5.LLJILJILJ;
            this.LL = 1;
            if (c625470Og5.LLZLLIL(enumC624980OfI, this) == objLJFF) {
                C1C7U.LIZIZ("OfflineModeManager@8800.initDownloadJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManager@8800.initDownloadJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1390205cK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
