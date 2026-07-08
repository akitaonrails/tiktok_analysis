package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L29, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.VideoProcessor$getCanvasVideoDataObservable$1$1$data$1$1$1", f = "VideoProcessor.kt", l = {262}, m = "invokeSuspend")
public final class C0L29 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData>, Object> {
    public int LL;
    public final /* synthetic */ IStoryCanvasVideoHelper LLILLJJLI;
    public final /* synthetic */ C578890Mn9 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L29(IStoryCanvasVideoHelper iStoryCanvasVideoHelper, C578890Mn9 c578890Mn9, String str, InterfaceC1364105Vn<? super C0L29> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iStoryCanvasVideoHelper;
        this.LLILLL = c578890Mn9;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L29(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1$data$1$1$1");
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
            IStoryCanvasVideoHelper iStoryCanvasVideoHelper = this.LLILLJJLI;
            C578890Mn9 c578890Mn9 = this.LLILLL;
            C19EG c19eg = c578890Mn9.LLILLJJLI;
            List<C536390L1x> listSingletonList = Collections.singletonList(new C536390L1x(this.LLILZ, c578890Mn9.LIZJ().cameraComponentModel.mVideoWidth, d4.LJIIIIZZ(this.LLILLL.LIZJ())));
            this.LL = 1;
            obj = iStoryCanvasVideoHelper.LIZLLL(c19eg, listSingletonList, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1$data$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1$data$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
