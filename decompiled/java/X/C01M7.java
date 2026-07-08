package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01M7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbStateServiceImpl$anchorLiveEntranceEnabled$2", f = "SmbStateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C01M7 extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C01M7(InterfaceC1364105Vn<? super C01M7> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmbStateServiceImpl@d96b.anchorLiveEntranceEnabled$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (this.LLILLJJLI) {
            obj2 = false;
        } else if (obj2 == null) {
            obj2 = null;
        }
        C1C7U.LIZIZ("SmbStateServiceImpl@d96b.anchorLiveEntranceEnabled$2");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool2.booleanValue();
        C01M7 c01m7 = new C01M7(interfaceC1364105Vn);
        c01m7.LL = bool;
        c01m7.LLILLJJLI = zBooleanValue;
        return c01m7.invokeSuspend(Unit.LIZ);
    }
}
