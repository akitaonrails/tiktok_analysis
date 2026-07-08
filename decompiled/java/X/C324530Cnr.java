package X;

import android.os.Bundle;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Cnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.core.telecom.CallsManager$addCall$2$1", f = "CallsManager.kt", l = {}, m = "invokeSuspend")
public final class C324530Cnr extends C09AX implements InterfaceC1631620sYq<String, Bundle, InterfaceC1364105Vn<? super Unit>, Object> {
    public C324530Cnr(InterfaceC1364105Vn<? super C324530Cnr> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(String str, Bundle bundle, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C324530Cnr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
