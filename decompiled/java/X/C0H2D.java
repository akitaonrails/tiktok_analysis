package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.supplementalinfocomponent.model.AnoleSupplementalInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.supplementalinfocomponent.AnoleSupplementalInfoComponentInitExtKt$setText$1$1$onFailed$1", f = "AnoleSupplementalInfoComponentInitExt.kt", l = {}, m = "invokeSuspend")
public final class C0H2D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1003370cDX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2D(C1003370cDX c1003370cDX, InterfaceC1364105Vn<? super C0H2D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1003370cDX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2D(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AnoleSupplementalInfoComponentInitExtKt@c9e5.setText$1$1$onFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1003370cDX c1003370cDX = this.LL;
        TuxTextView tuxTextView = c1003370cDX.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ = c1003370cDX.LJJ();
            if (anoleSupplementalInfoDataLJJ != null) {
                str = anoleSupplementalInfoDataLJJ.title;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnoleSupplementalInfoComponentInitExtKt@c9e5.setText$1$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
