package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.components.ArticleImageLoader$downloadImagesWithFilePaths$2", f = "ArticleImageLoader.kt", l = {46}, m = "invokeSuspend")
public final class C317420CcO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C1321590kUn LLILLJJLI;
    public final /* synthetic */ List<C1325710kbR> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C317420CcO(C1321590kUn c1321590kUn, List<? extends C1325710kbR> list, InterfaceC1364105Vn<? super C317420CcO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1321590kUn;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317420CcO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArticleImageLoader@71b3.downloadImagesWithFilePaths$2");
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
            C1321590kUn c1321590kUn = this.LLILLJJLI;
            List<C1325710kbR> list = this.LLILLL;
            this.LL = 1;
            c1321590kUn.getClass();
            obj = C2296808zG.LJ(new C317410CcN(c1321590kUn, list, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ArticleImageLoader@71b3.downloadImagesWithFilePaths$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ArticleImageLoader@71b3.downloadImagesWithFilePaths$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
