package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask$run$2$authDeferred$1", f = "AutoPickFrameUploadTask.kt", l = {161}, m = "invokeSuspend")
public final class C2297608zO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UploadImageConfig>, Object> {
    public int LL;
    public final /* synthetic */ C0LKL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297608zO(C0LKL c0lkl, InterfaceC1364105Vn<? super C2297608zO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lkl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2297608zO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.run$2$authDeferred$1");
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
            C0LKL c0lkl = this.LLILLJJLI;
            this.LL = 1;
            obj = c0lkl.LJJJJLI(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$2$authDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$2$authDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UploadImageConfig> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
