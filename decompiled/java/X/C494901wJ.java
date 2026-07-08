package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01wJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.EDADataSyncEngine$launchRestoreEditJob$1$1", f = "EDADataSyncEngine.kt", l = {}, m = "invokeSuspend")
public final class C494901wJ extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C494901wJ(InterfaceC1364105Vn<? super C494901wJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C494901wJ c494901wJ = new C494901wJ(interfaceC1364105Vn);
        c494901wJ.LL = obj;
        return c494901wJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EDADataSyncEngine@8a7.launchRestoreEditJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(this.LL, true));
        C1C7U.LIZIZ("EDADataSyncEngine@8a7.launchRestoreEditJob$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(bool, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
