package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.060O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$handleResult$1$uploadConfig$1$1", f = "EcEditVideoCoverMethod.kt", l = {}, m = "invokeSuspend")
public final class C060O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ CompletionBlock<InterfaceC1463805oC> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C060O(DialogC1389620mGW dialogC1389620mGW, CompletionBlock<InterfaceC1463805oC> completionBlock, InterfaceC1364105Vn<? super C060O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C060O(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$uploadConfig$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ(this.LL);
        C2382909Vj.LIZ(this.LLILLJJLI, -1001, "Unable to get auth key", null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.handleResult$1$uploadConfig$1$1");
        return unit;
    }
}
