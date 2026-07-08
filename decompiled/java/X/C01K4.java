package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01K4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.utils.StorySafDetailExtKt$trackUriEventIfSaf$1", f = "StorySafDetailExt.kt", l = {}, m = "invokeSuspend")
public final class C01K4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01K4(String str, InterfaceC1364105Vn<? super C01K4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01K4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorySafDetailExtKt@3867.trackUriEventIfSaf$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIILLIIL("story_saf_detail_uri_event", C2097908Jt.LIZJ(new Pair("uri", this.LL)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorySafDetailExtKt@3867.trackUriEventIfSaf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
