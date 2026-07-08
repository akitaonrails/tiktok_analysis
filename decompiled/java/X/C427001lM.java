package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVMKt$whenFirstMessageRequestRendered$1$1", f = "MessageRequestRootPageVM.kt", l = {}, m = "invokeSuspend")
public final class C427001lM extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C427001lM(InterfaceC1364105Vn<? super C427001lM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C427001lM c427001lM = new C427001lM(interfaceC1364105Vn);
        c427001lM.LL = ((Boolean) obj).booleanValue();
        return c427001lM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestRootPageVMKt@1e78.whenFirstMessageRequestRendered$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL);
        C1C7U.LIZIZ("MessageRequestRootPageVMKt@1e78.whenFirstMessageRequestRendered$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
