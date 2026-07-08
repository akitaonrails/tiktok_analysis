package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.EcHybridPbResourceManager$createPreloadDeferred$1", f = "EcHybridPbResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C365801bU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super File>, Object> {
    public final /* synthetic */ RequestParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365801bU(RequestParams requestParams, InterfaceC1364105Vn<? super C365801bU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = requestParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C365801bU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533790q13 c1533790q13LIZIZ;
        C1C7U.LIZ("EcHybridPbResourceManager@a9f1.createPreloadDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1533910q1F c1533910q1FCreateSyncRequest = ((Forest) C1517130paB.LIZIZ.getValue()).createSyncRequest("", this.LL);
        File fileLJIIJ = null;
        if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null && c1533790q13LIZIZ.LIZIZ) {
            fileLJIIJ = C1533790q13.LJIIJ(c1533790q13LIZIZ);
        }
        C1C7U.LIZIZ("EcHybridPbResourceManager@a9f1.createPreloadDeferred$1");
        return fileLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super File> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
