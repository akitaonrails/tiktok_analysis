package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.external.ExternalCreateGroupProcessor$createGroupAndShowExternalPanel$1$1$onSuccessWithInfo$1", f = "ExternalCreateGroupProcessor.kt", l = {174}, m = "invokeSuspend")
public final class C1566006Be extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1566006Be(InterfaceC1364105Vn<? super C1566006Be> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566006Be(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExternalCreateGroupProcessor@9665.createGroupAndShowExternalPanel$1$1$onSuccessWithInfo$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("ExternalCreateGroupProcessor@9665.createGroupAndShowExternalPanel$1$1$onSuccessWithInfo$1");
                return objLJFF;
            }
        }
        C0YOP.LIZ("external_share_create_group_enter_quick_chat", true, 1, null, 24);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExternalCreateGroupProcessor@9665.createGroupAndShowExternalPanel$1$1$onSuccessWithInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1566006Be(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
