package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05My, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel$onPrepared$1$1$1$1$1", f = "IdAndElementViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1341805My extends C09AX implements Function2<InterfaceC439080HJq, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C1341805My(InterfaceC1364105Vn<? super C1341805My> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1341805My c1341805My = new C1341805My(interfaceC1364105Vn);
        c1341805My.LL = obj;
        return c1341805My;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IdAndElementViewModel@a6fe.onPrepared$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!(this.LL instanceof C1341405Mu));
        C1C7U.LIZIZ("IdAndElementViewModel@a6fe.onPrepared$1$1$1$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC439080HJq interfaceC439080HJq, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC439080HJq, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
