package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene$deleteLottieCache$1", f = "EPAICreateSelectMaterialScene.kt", l = {}, m = "invokeSuspend")
public final class C2212608lg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212608lg(String str, InterfaceC1364105Vn<? super C2212608lg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2212608lg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAICreateSelectMaterialScene@65c4.deleteLottieCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2242408qU c2242408qU = C2242408qU.LIZ;
        String str = this.LL;
        c2242408qU.getClass();
        C0VSJ c0vsjLJIIIIZZ = C2242408qU.LJIIIIZZ(str);
        if (c0vsjLJIIIIZZ != null) {
            Boolean.valueOf(c0vsjLJIIIIZZ.delete());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAICreateSelectMaterialScene@65c4.deleteLottieCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
