package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0zjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView$bindNotice$3$2", f = "NoticeTemplateRightView.kt", l = {}, m = "invokeSuspend")
public final class C1907200zjK extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1907120zjC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1907200zjK(C1907120zjC c1907120zjC, InterfaceC1364105Vn<? super C1907200zjK> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1907120zjC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1907200zjK(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeTemplateRightView@96c2.bindNotice$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1907020zj2 mBridge = this.LL.getMBridge();
        if (mBridge != null) {
            mBridge.LLD(EnumC1154130g8h.RELATION_BUTTON);
        }
        C1C7U.LIZIZ("NoticeTemplateRightView@96c2.bindNotice$3$2");
        return false;
    }
}
