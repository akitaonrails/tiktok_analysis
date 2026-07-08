package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$isPreDownloadAtLoadingSituation$2", f = "CutOptimizedVideoChosenHandler.kt", l = {1416}, m = "invokeSuspend")
public final class C09LH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0L0W>, Object> {
    public int LL;
    public final /* synthetic */ C0L7R LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<MediaModel> LLILZ;
    public final /* synthetic */ Intent LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ VideoPublishEditModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09LH(C0L7R c0l7r, String str, List<? extends MediaModel> list, Intent intent, boolean z, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C09LH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l7r;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = intent;
        this.LLILZLL = z;
        this.LLIZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.isPreDownloadAtLoadingSituation$2");
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
            C0L7R c0l7r = this.LLILLJJLI;
            String str = this.LLILLL;
            List<MediaModel> list = this.LLILZ;
            Intent intent = this.LLILZIL;
            boolean z = this.LLILZLL;
            VideoPublishEditModel videoPublishEditModel = this.LLIZ;
            this.LL = 1;
            obj = c0l7r.LJIIL(str, list, intent, z, videoPublishEditModel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.isPreDownloadAtLoadingSituation$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.isPreDownloadAtLoadingSituation$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0L0W> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
