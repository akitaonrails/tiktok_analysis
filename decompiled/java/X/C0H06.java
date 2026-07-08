package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H06, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8ImageAssem$loadImage$1$imageInfo$1", f = "Lemon8ImageAssem.kt", l = {82}, m = "invokeSuspend")
public final class C0H06 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C428600GrK>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ Lemon8ImageAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H06(Lemon8ImageAssem lemon8ImageAssem, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = lemon8ImageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H06(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Lemon8ImageAssem@e58b.loadImage$1$imageInfo$1");
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
            List<String> list = this.LLILLJJLI;
            Context context = this.LLILLL.getContext();
            this.LL = 1;
            if (context == null) {
                obj = null;
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                c1331670kl3LJIIJ.LJIL = Bitmap.Config.RGB_565;
                c1331670kl3LJIIJ.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJIIJ.LJIIIIZZ = 100;
                c1331670kl3LJIIJ.LJIIIZ = 100;
                c1331670kl3LJIIJ.LJJIJL(context);
                c1331670kl3LJIIJ.LJJII(new C0ID3(c23260099m, 5));
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Lemon8ImageAssem@e58b.loadImage$1$imageInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("Lemon8ImageAssem@e58b.loadImage$1$imageInfo$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C428600GrK> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
