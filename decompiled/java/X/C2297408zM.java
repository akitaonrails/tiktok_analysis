package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask$run$2", f = "AutoPickFrameUploadTask.kt", l = {162, 162}, m = "invokeSuspend")
public final class C2297408zM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends UploadImageConfig>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LKL LLILLL;
    public final /* synthetic */ List<CompositionMediaItem> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297408zM(C0LKL c0lkl, List<CompositionMediaItem> list, InterfaceC1364105Vn<? super C2297408zM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0lkl;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2297408zM c2297408zM = new C2297408zM(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2297408zM.LLILLJJLI = obj;
        return c2297408zM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object obj2;
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.run$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj2, obj);
                    C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$2");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2297508zN(this.LLILLL, this.LLILZ, null), 3);
            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2297608zO(this.LLILLL, null), 3);
            this.LLILLJJLI = anonymousClass0957LIZIZ;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = obj;
        this.LL = 2;
        Object objLJLIIIL = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$2");
            return objLJFF;
        }
        obj2 = obj;
        obj = objLJLIIIL;
        Pair pair2 = new Pair(obj2, obj);
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$2");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends UploadImageConfig>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
