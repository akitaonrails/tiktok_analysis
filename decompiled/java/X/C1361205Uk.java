package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.share.TakoShareImageShowViewKt$TakoShareImageSharedElementPreview$3$1$2", f = "TakoShareImageShowView.kt", l = {}, m = "invokeSuspend")
public final class C1361205Uk extends C09AX implements Function2<InterfaceC1692950u9l, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C1361205Uk(InterfaceC1364105Vn<? super C1361205Uk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1361205Uk c1361205Uk = new C1361205Uk(interfaceC1364105Vn);
        c1361205Uk.LL = obj;
        return c1361205Uk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$3$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TakoShareImageShowViewKt@b200.TakoShareImageSharedElementPreview$3$1$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1692950u9l interfaceC1692950u9l, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1692950u9l, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
