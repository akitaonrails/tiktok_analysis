package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ek3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.ui.framework.LeafHostLayout$addLeaf$1$1", f = "LeafHostLayout.kt", l = {}, m = "invokeSuspend")
public final class C1100410ek3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1100450ek7 LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C1100420ek4 LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100410ek3(AbstractC1100450ek7 abstractC1100450ek7, Context context, C1100420ek4 c1100420ek4, ViewGroup viewGroup, InterfaceC1364105Vn<? super C1100410ek3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1100450ek7;
        this.LLILLJJLI = context;
        this.LLILLL = c1100420ek4;
        this.LLILZ = viewGroup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1100410ek3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LeafHostLayout@dda6.addLeaf$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1100450ek7 abstractC1100450ek7 = this.LL;
        Context context = this.LLILLJJLI;
        Pair<View, C19ME> pairLJJJ = abstractC1100450ek7.LJJJ(context, this.LLILLL, C786410Ut5.ne(context));
        AbstractC1100450ek7 abstractC1100450ek72 = this.LL;
        if (!(abstractC1100450ek72 instanceof DialogLeaf) && pairLJJJ != null) {
            C1100420ek4 c1100420ek4 = this.LLILLL;
            ViewGroup viewGroup = this.LLILZ;
            View first = pairLJJJ.getFirst();
            C19ME second = pairLJJJ.getSecond();
            abstractC1100450ek72.LLILZ = first;
            if (viewGroup == null) {
                viewGroup = c1100420ek4;
            }
            c1100420ek4.getClass();
            if (second == null) {
                viewGroup.addView(first);
            } else {
                viewGroup.addView(first, second);
            }
        }
        this.LLILLL.LLILLJJLI.put(C2286608xc.LJ(this.LL.LJIIJJI()), this.LL);
        this.LL.LJJIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeafHostLayout@dda6.addLeaf$1$1");
        return unit;
    }
}
