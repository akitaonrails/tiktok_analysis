package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.social.creation.api.edit.IStoryCanvasVideoHelper;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L25, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCanvasPrepareTask$process$data$1", f = "SocCreativeInternalLauncher.kt", l = {1109}, m = "invokeSuspend")
public final class C0L25 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData>, Object> {
    public int LL;
    public final /* synthetic */ C0L24 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L25(C0L24 c0l24, InterfaceC1364105Vn<? super C0L25> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l24;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L25(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CanvasVideoData canvasVideoData;
        C1C7U.LIZ("StoryCanvasPrepareTask@3797.process$data$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0L24 c0l24 = this.LLILLJJLI;
                IStoryCanvasVideoHelper iStoryCanvasVideoHelper = c0l24.LJ;
                Context context = c0l24.LIZ;
                List<C536390L1x> list = c0l24.LIZJ;
                Pair<Integer, Integer> pair = c0l24.LIZLLL;
                this.LL = 1;
                obj = iStoryCanvasVideoHelper.LIZLLL(context, list, pair, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryCanvasPrepareTask@3797.process$data$1");
                    return objLJFF;
                }
            }
            canvasVideoData = (CanvasVideoData) obj;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            canvasVideoData = null;
        }
        C1C7U.LIZIZ("StoryCanvasPrepareTask@3797.process$data$1");
        return canvasVideoData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
