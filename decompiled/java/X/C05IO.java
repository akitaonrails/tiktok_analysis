package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05IO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction$loadMaterial$1$response$1", f = "OpenCelebrationCreateAction.kt", l = {283}, m = "invokeSuspend")
public final class C05IO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05IO(Context context, int i, InterfaceC1364105Vn<? super C05IO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenCelebrationCreateAction@524e.loadMaterial$1$response$1");
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
            ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class);
            Context context = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = iCelebrationCreateService.syncRequestCelebrationMaterial(context, 2, 1, i2, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OpenCelebrationCreateAction@524e.loadMaterial$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OpenCelebrationCreateAction@524e.loadMaterial$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
