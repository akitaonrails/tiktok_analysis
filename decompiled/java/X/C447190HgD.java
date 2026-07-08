package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.widget.multiImageview.loader.MultiIconLoadHelper$fetchImageUrlsWithListener$1", f = "MultiIconLoadHelper.kt", l = {38}, m = "invokeSuspend")
public final class C447190HgD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C447180HgC LLILLL;
    public final /* synthetic */ List<C0HTW> LLILZ;
    public final /* synthetic */ InterfaceC447210HgF LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C447190HgD(C447180HgC c447180HgC, List<? extends C0HTW> list, InterfaceC447210HgF interfaceC447210HgF, InterfaceC1364105Vn<? super C447190HgD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c447180HgC;
        this.LLILZ = list;
        this.LLILZIL = interfaceC447210HgF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C447190HgD c447190HgD = new C447190HgD(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c447190HgD.LLILLJJLI = obj;
        return c447190HgD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiIconLoadHelper@8f7e.fetchImageUrlsWithListener$1");
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
            C447180HgC c447180HgC = this.LLILLL;
            List<C0HTW> list = this.LLILZ;
            this.LL = 1;
            obj = c447180HgC.LIZ(list, interfaceC497601wk, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiIconLoadHelper@8f7e.fetchImageUrlsWithListener$1");
                return objLJFF;
            }
        }
        List<Bitmap> list2 = (List) obj;
        if (list2.isEmpty()) {
            this.LLILZIL.LLJJIJIIJIL();
        } else {
            this.LLILZIL.LLJJIJIL(list2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiIconLoadHelper@8f7e.fetchImageUrlsWithListener$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
