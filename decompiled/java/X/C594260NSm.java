package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermissionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.manager.ECShortVideoPermissionManager$fetchAnchorPublishPermission$1$1$response$1", f = "ECShortVideoPermissionManager.kt", l = {118}, m = "invokeSuspend")
public final class C594260NSm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnchorPublishPermissionResponse>, Object> {
    public int LL;

    public C594260NSm(InterfaceC1364105Vn<? super C594260NSm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594260NSm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECShortVideoPermissionManager@ff2d.fetchAnchorPublishPermission$1$1$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C613630O4z c613630O4z = C613630O4z.LIZ;
            this.LL = 1;
            c613630O4z.getClass();
            obj = ((InterfaceC613620O4y) C613630O4z.LIZIZ.create(InterfaceC613620O4y.class)).LIZ(1, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECShortVideoPermissionManager@ff2d.fetchAnchorPublishPermission$1$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ECShortVideoPermissionManager@ff2d.fetchAnchorPublishPermission$1$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnchorPublishPermissionResponse> interfaceC1364105Vn) {
        return new C594260NSm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
