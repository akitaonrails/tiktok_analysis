package X;

import android.util.Size;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadBitmapTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadBitmapTask$onImageDataFetched$1", f = "PreloadBitmapTask.kt", l = {130}, m = "invokeSuspend")
public final class C05YJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<MediaModel> LLILLL;
    public final /* synthetic */ PreloadBitmapTask LLILZ;
    public final /* synthetic */ Size LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05YJ(List<? extends MediaModel> list, PreloadBitmapTask preloadBitmapTask, Size size, InterfaceC1364105Vn<? super C05YJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = preloadBitmapTask;
        this.LLILZIL = size;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05YJ c05yj = new C05YJ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05yj.LLILLJJLI = obj;
        return c05yj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadBitmapTask@7b8d.onImageDataFetched$1");
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
            List<MediaModel> list = this.LLILLL;
            PreloadBitmapTask preloadBitmapTask = this.LLILZ;
            Size size = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<MediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05YK(preloadBitmapTask, it2.next(), size, null), 3));
            }
            this.LL = 1;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("PreloadBitmapTask@7b8d.onImageDataFetched$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadBitmapTask@7b8d.onImageDataFetched$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
