package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel$onPrepared$1$loadCurrentUserSaAsync$1$1", f = "IdAndElementViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05Z0 extends C09AX implements Function2<C0HOM<? extends List<? extends C440440HOw>>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C05Z0(InterfaceC1364105Vn<? super C05Z0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05Z0 c05z0 = new C05Z0(interfaceC1364105Vn);
        c05z0.LL = obj;
        return c05z0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IdAndElementViewModel@a6fe.onPrepared$1$loadCurrentUserSaAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!Intrinsics.LJFF(this.LL, C1372605Yu.LIZIZ));
        C1C7U.LIZIZ("IdAndElementViewModel@a6fe.onPrepared$1$loadCurrentUserSaAsync$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0HOM<? extends List<? extends C440440HOw>> c0hom, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0hom, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
