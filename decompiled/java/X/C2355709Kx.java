package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$mediaToSegment$1", f = "TemplateMediaChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C2355709Kx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Intent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2355709Kx(Intent intent, InterfaceC1364105Vn<? super C2355709Kx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2355709Kx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaChosenHandler@d239.mediaToSegment$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2355609Kw.INSTANCE.recheckCache(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateMediaChosenHandler@d239.mediaToSegment$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
