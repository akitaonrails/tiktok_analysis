package X;

import android.graphics.Bitmap;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadBitmapTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadBitmapTask$onImageDataFetched$1$1$1", f = "PreloadBitmapTask.kt", l = {123}, m = "invokeSuspend")
public final class C05YK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PreloadBitmapTask LLILLL;
    public final /* synthetic */ MediaModel LLILZ;
    public final /* synthetic */ Size LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YK(PreloadBitmapTask preloadBitmapTask, MediaModel mediaModel, Size size, InterfaceC1364105Vn<? super C05YK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = preloadBitmapTask;
        this.LLILZ = mediaModel;
        this.LLILZIL = size;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05YK c05yk = new C05YK(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05yk.LLILLJJLI = obj;
        return c05yk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PreloadBitmapTask@7b8d.onImageDataFetched$1$1$1");
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
                PreloadBitmapTask preloadBitmapTask = this.LLILLL;
                MediaModel mediaModel = this.LLILZ;
                Size size = this.LLILZIL;
                C23216097u c23216097u = C23215097t.LIZ;
                C19EG c19eg = preloadBitmapTask.LLILZLL;
                this.LL = 1;
                obj = C23215097t.LJI(c19eg, mediaModel, size, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PreloadBitmapTask@7b8d.onImageDataFetched$1$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (Bitmap) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("PreloadBitmapTask@7b8d.onImageDataFetched$1$1$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
