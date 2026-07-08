package X;

import com.ss.android.ugc.aweme.aikit.experiments.AIGCImagePreprocessConfigExp;
import com.ss.android.ugc.image.format.ImagePreprocessService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationImagePreprocessTask$run$results$1$1", f = "AICreationImagePreprocessTask.kt", l = {}, m = "invokeSuspend")
public final class C542910LQz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LR3>>, Object> {
    public final /* synthetic */ ImagePreprocessService LL;
    public final /* synthetic */ C541610LLz LLILLJJLI;
    public final /* synthetic */ C542870LQv LLILLL;
    public final /* synthetic */ AIGCImagePreprocessConfigExp.AIGCImagePreprocessConfig LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542910LQz(ImagePreprocessService imagePreprocessService, C541610LLz c541610LLz, C542870LQv c542870LQv, AIGCImagePreprocessConfigExp.AIGCImagePreprocessConfig aIGCImagePreprocessConfig, InterfaceC1364105Vn<? super C542910LQz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imagePreprocessService;
        this.LLILLJJLI = c541610LLz;
        this.LLILLL = c542870LQv;
        this.LLILZ = aIGCImagePreprocessConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542910LQz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationImagePreprocessTask@b4bf.run$results$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ImagePreprocessService imagePreprocessService = this.LL;
        C541610LLz c541610LLz = this.LLILLJJLI;
        List<String> list = c541610LLz.LIZIZ;
        C542870LQv c542870LQv = this.LLILLL;
        AIGCImagePreprocessConfigExp.AIGCImagePreprocessConfig aIGCImagePreprocessConfig = this.LLILZ;
        c542870LQv.getClass();
        C547860LeC.LIZ.getClass();
        List<C0LR3> listLIZIZ = imagePreprocessService.LIZIZ(list, new C0LR5(C547860LeC.LJ().LJI(c541610LLz.LIZ, c541610LLz.LIZJ), aIGCImagePreprocessConfig.formatWhitelist, Float.valueOf(aIGCImagePreprocessConfig.aspectRatioMin), Float.valueOf(aIGCImagePreprocessConfig.aspectRatioMax), Integer.valueOf(aIGCImagePreprocessConfig.minEdgePx), Integer.valueOf(aIGCImagePreprocessConfig.maxEdgePx), Long.valueOf(aIGCImagePreprocessConfig.maxFileSizeBytes), aIGCImagePreprocessConfig.imageQuality, aIGCImagePreprocessConfig.imageQualityFallbackSteps, aIGCImagePreprocessConfig.downsampleRatioOnOverflow, aIGCImagePreprocessConfig.maxIterations));
        C1C7U.LIZIZ("AICreationImagePreprocessTask@b4bf.run$results$1$1");
        return listLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LR3>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
