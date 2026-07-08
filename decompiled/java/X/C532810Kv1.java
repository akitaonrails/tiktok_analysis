package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$downloadSingleMaterial$path$1", f = "MaterialHandler.kt", l = {}, m = "invokeSuspend")
public final class C532810Kv1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ C532910KvB LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532810Kv1(C532910KvB c532910KvB, String str, InterfaceC1364105Vn<? super C532810Kv1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c532910KvB;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532810Kv1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialHandler@ef69.downloadSingleMaterial$path$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJIIJ = this.LL.LJIIJ(this.LLILLJJLI);
        C1C7U.LIZIZ("MaterialHandler@ef69.downloadSingleMaterial$path$1");
        return strLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
