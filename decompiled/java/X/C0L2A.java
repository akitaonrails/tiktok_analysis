package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L2A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.VideoProcessor$getCanvasVideoDataObservable$1$1$data$1$1", f = "VideoProcessor.kt", l = {261}, m = "invokeSuspend")
public final class C0L2A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData>, Object> {
    public int LL;
    public final /* synthetic */ IStoryCanvasVideoHelper LLILLJJLI;
    public final /* synthetic */ C578890Mn9 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L2A(IStoryCanvasVideoHelper iStoryCanvasVideoHelper, C578890Mn9 c578890Mn9, String str, InterfaceC1364105Vn<? super C0L2A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iStoryCanvasVideoHelper;
        this.LLILLL = c578890Mn9;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L2A(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1$data$1$1");
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
            C0L29 c0l29 = new C0L29(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C099A.LIZJ(2000L, c0l29, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1$data$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoProcessor@449d.getCanvasVideoDataObservable$1$1$data$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
