package X;

import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09KC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.send.service.VisualPoetImageUploadStepImpl$transform$2", f = "VisualPoetImageUploadStepImpl.kt", l = {39}, m = "invokeSuspend")
public final class C09KC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>>, Object> {
    public int LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;
    public final /* synthetic */ C09KL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09KC(List<? extends MediaModel> list, C09KL c09kl, InterfaceC1364105Vn<? super C09KC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c09kl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09KC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VisualPoetImageUploadStepImpl@591.transform$2");
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
            C09KB c09kb = new C09KB(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C2296808zG.LJ(c09kb, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VisualPoetImageUploadStepImpl@591.transform$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VisualPoetImageUploadStepImpl@591.transform$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
