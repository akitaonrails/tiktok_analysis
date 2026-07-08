package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.PhotoModeImageLoader$downloadImagesWithFilePaths$2", f = "PhotoModeImageLoader.kt", l = {43}, m = "invokeSuspend")
public final class C317440CcQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C1321600kUo LLILLJJLI;
    public final /* synthetic */ List<C1325710kbR> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C317440CcQ(C1321600kUo c1321600kUo, List<? extends C1325710kbR> list, InterfaceC1364105Vn<? super C317440CcQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1321600kUo;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317440CcQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeImageLoader@d16a.downloadImagesWithFilePaths$2");
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
            C1321600kUo c1321600kUo = this.LLILLJJLI;
            List<C1325710kbR> list = this.LLILLL;
            this.LL = 1;
            c1321600kUo.getClass();
            obj = C2296808zG.LJ(new C317430CcP(c1321600kUo, list, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoModeImageLoader@d16a.downloadImagesWithFilePaths$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoModeImageLoader@d16a.downloadImagesWithFilePaths$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
