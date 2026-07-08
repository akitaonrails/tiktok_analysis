package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0966, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelper$handleComprehensionNLEExperimentExt$event$1", f = "AutoCutHelper.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0966 extends C09AX implements Function2<C096H, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public AnonymousClass0966(InterfaceC1364105Vn<? super AnonymousClass0966> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0966 anonymousClass0966 = new AnonymousClass0966(interfaceC1364105Vn);
        anonymousClass0966.LL = obj;
        return anonymousClass0966;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AutoCutHelper@27e4.handleComprehensionNLEExperimentExt$event$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (!(obj2 instanceof C23149095f) && !(obj2 instanceof C096G)) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AutoCutHelper@27e4.handleComprehensionNLEExperimentExt$event$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096H c096h, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c096h, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
