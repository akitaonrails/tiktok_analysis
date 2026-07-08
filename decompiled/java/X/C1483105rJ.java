package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.SearchVideoListPlaybackStrategySingleton$checkIfAllImagesAlreadyLoaded$2", f = "SearchVideoListPlaybackStrategySingleton.kt", l = {60}, m = "invokeSuspend")
public final class C1483105rJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1483105rJ(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1483105rJ c1483105rJ = new C1483105rJ(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c1483105rJ.LLILLJJLI = obj;
        return c1483105rJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("SearchVideoListPlaybackStrategySingleton@5c49.checkIfAllImagesAlreadyLoaded$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            C1483205rK<UrlModel> c1483205rK = C1483305rL.LIZ;
            if (c1483205rK.LIZ.isEmpty()) {
                C1483305rL.LIZIZ.set(false);
                C1C7U.LIZIZ("SearchVideoListPlaybackStrategySingleton@5c49.checkIfAllImagesAlreadyLoaded$2");
                return true;
            }
            if (System.currentTimeMillis() - this.LLILLL > this.LLILZ) {
                synchronized (c1483205rK) {
                    c1483205rK.LIZ.clear();
                }
                C1483305rL.LIZIZ.set(false);
                C1C7U.LIZIZ("SearchVideoListPlaybackStrategySingleton@5c49.checkIfAllImagesAlreadyLoaded$2");
                return true;
            }
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10L, this) == objLJFF) {
                C1C7U.LIZIZ("SearchVideoListPlaybackStrategySingleton@5c49.checkIfAllImagesAlreadyLoaded$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SearchVideoListPlaybackStrategySingleton@5c49.checkIfAllImagesAlreadyLoaded$2");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
