package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08uB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.RecordUploadFrameTask$resizePicturesForAIWithFrameNew$2$2$1", f = "RecordUploadFrameTask.kt", l = {}, m = "invokeSuspend")
public final class C2265308uB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2265508uD LLILLJJLI;
    public final /* synthetic */ FrameItem LLILLL;
    public final /* synthetic */ C817403Hg LLILZ;
    public final /* synthetic */ C817403Hg LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C259800zU<VEUtils.VEVideoFileInfo> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265308uB(C2265508uD c2265508uD, FrameItem frameItem, C817403Hg c817403Hg, C817403Hg c817403Hg2, String str, C259800zU<VEUtils.VEVideoFileInfo> c259800zU, int i, InterfaceC1364105Vn<? super C2265308uB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2265508uD;
        this.LLILLL = frameItem;
        this.LLILZ = c817403Hg;
        this.LLILZIL = c817403Hg2;
        this.LLILZLL = str;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2265308uB c2265308uB = new C2265308uB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c2265308uB.LL = obj;
        return c2265308uB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("RecordUploadFrameTask@26a7.resizePicturesForAIWithFrameNew$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2265508uD c2265508uD = this.LLILLJJLI;
        FrameItem frameItem = this.LLILLL;
        C817403Hg c817403Hg = this.LLILZ;
        C817403Hg c817403Hg2 = this.LLILZIL;
        String str = this.LLILZLL;
        C259800zU<VEUtils.VEVideoFileInfo> c259800zU = this.LLIZ;
        try {
            c098200Yq = c2265508uD.LJJIFFI(frameItem, c817403Hg.element, c817403Hg2.element, str, c259800zU.element, this.LLIZLLLIL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("RecordUploadFrameTask@26a7.resizePicturesForAIWithFrameNew$2$2$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
