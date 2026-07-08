package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.task.upload.UploadIconTask$run$2$uploadDeferredList$1$1", f = "UploadIconTask.kt", l = {57}, m = "invokeSuspend")
public final class C1738040vKU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1663010tNT>, Object> {
    public int LL;
    public final /* synthetic */ C1737940vKK LLILLJJLI;
    public final /* synthetic */ UploadImageConfig LLILLL;
    public final /* synthetic */ C1737770vK3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738040vKU(C1737940vKK c1737940vKK, UploadImageConfig uploadImageConfig, C1737770vK3 c1737770vK3, InterfaceC1364105Vn<? super C1738040vKU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1737940vKK;
        this.LLILLL = uploadImageConfig;
        this.LLILZ = c1737770vK3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738040vKU(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadIconTask@7ab0.run$2$uploadDeferredList$1$1");
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
            C1737940vKK c1737940vKK = this.LLILLJJLI;
            UploadImageConfig uploadImageConfig = this.LLILLL;
            C1737770vK3 c1737770vK3 = this.LLILZ;
            this.LL = 1;
            obj = c1737940vKK.LIZ(uploadImageConfig, c1737770vK3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UploadIconTask@7ab0.run$2$uploadDeferredList$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UploadIconTask@7ab0.run$2$uploadDeferredList$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1663010tNT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
