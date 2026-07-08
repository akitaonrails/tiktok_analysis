package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.story.RevealStorySynthesisTask$getRevealStoryImages$1", f = "RevealStorySynthesisTask.kt", l = {135}, m = "invokeSuspend")
public final class C090H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C090I>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1440410naR LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ RevealStoryCreationModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090H(C1440410naR c1440410naR, Bitmap bitmap, String str, RevealStoryCreationModel revealStoryCreationModel, InterfaceC1364105Vn<? super C090H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1440410naR;
        this.LLILZ = bitmap;
        this.LLILZIL = str;
        this.LLILZLL = revealStoryCreationModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C090H c090h = new C090H(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c090h.LLILLJJLI = obj;
        return c090h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ImageSynthesisResult imageSynthesisResultLJIILLIIL;
        ImageSynthesisResult backImageModel;
        ImageSynthesisResult frontImageModel;
        C1C7U.LIZ("RevealStorySynthesisTask@353b.getRevealStoryImages$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1440410naR c1440410naR = this.LLILLL;
            Bitmap bitmap = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = 1;
            obj = c1440410naR.LJIILL(interfaceC497601wk, bitmap, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RevealStorySynthesisTask@353b.getRevealStoryImages$1");
                return objLJFF;
            }
        }
        C090I c090i = (C090I) obj;
        RevealStoryCreationModel revealStoryCreationModel = this.LLILZLL;
        ImageSynthesisResult imageSynthesisResultLJIILLIIL2 = null;
        if (revealStoryCreationModel != null && (frontImageModel = revealStoryCreationModel.getFrontImageModel()) != null) {
            this.LLILLL.getClass();
            imageSynthesisResultLJIILLIIL = C1440410naR.LJIILLIIL(frontImageModel);
        } else {
            imageSynthesisResultLJIILLIIL = null;
        }
        RevealStoryCreationModel revealStoryCreationModel2 = this.LLILZLL;
        if (revealStoryCreationModel2 != null && (backImageModel = revealStoryCreationModel2.getBackImageModel()) != null) {
            this.LLILLL.getClass();
            imageSynthesisResultLJIILLIIL2 = C1440410naR.LJIILLIIL(backImageModel);
        }
        C090I c090i2 = new C090I(c090i.LIZ, c090i.LIZIZ, imageSynthesisResultLJIILLIIL, imageSynthesisResultLJIILLIIL2);
        C1C7U.LIZIZ("RevealStorySynthesisTask@353b.getRevealStoryImages$1");
        return c090i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C090I> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
