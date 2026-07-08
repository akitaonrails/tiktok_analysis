package X;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.sendmsg.EditShareSendMsgDelegate$showSendInFailureToast$1", f = "EditShareSendMsgDelegate.kt", l = {}, m = "invokeSuspend")
public final class C612970O2l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20616415lq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612970O2l(C20616415lq c20616415lq, InterfaceC1364105Vn<? super C612970O2l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20616415lq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612970O2l(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("EditShareSendMsgDelegate@3814.showSendInFailureToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20616415lq c20616415lq = this.LL;
        Fragment fragment = c20616415lq.LJ;
        if (fragment != null) {
            C19EG activity = fragment.getActivity();
            String str2 = "";
            if (activity != null) {
                Object[] objArr = new Object[1];
                C20618015m6 c20618015m6 = c20616415lq.LJIIIIZZ;
                if (c20618015m6 == null || (str = c20618015m6.LLILLJJLI) == null) {
                    str = "";
                }
                objArr[0] = str;
                String string = activity.getString(2131836995, objArr);
                if (string != null) {
                    str2 = string;
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIJ(str2);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditShareSendMsgDelegate@3814.showSendInFailureToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
