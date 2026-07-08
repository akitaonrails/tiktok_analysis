package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editpageprepublish.EditPageSaveLocalController$onSaveLocalFinish$1", f = "EditPageSaveLocalController.kt", l = {569}, m = "invokeSuspend")
public final class C858890Xmh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C858890Xmh(InterfaceC1364105Vn<? super C858890Xmh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858890Xmh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditPageSaveLocalController@4472.onSaveLocalFinish$1");
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
            C1436310nTp c1436310nTp = C1436310nTp.LIZ;
            this.LL = 1;
            c1436310nTp.getClass();
            if (C1436310nTp.LJFF(this) == objLJFF) {
                C1C7U.LIZIZ("EditPageSaveLocalController@4472.onSaveLocalFinish$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditPageSaveLocalController@4472.onSaveLocalFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C858890Xmh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
