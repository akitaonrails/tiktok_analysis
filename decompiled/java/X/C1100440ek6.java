package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ek6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.ui.framework.BaseLeaf$addSubLeaf$1$1$1", f = "BaseLeaf.kt", l = {}, m = "invokeSuspend")
public final class C1100440ek6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1100460ek8 LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ AbstractC1100450ek7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100440ek6(AbstractC1100460ek8 abstractC1100460ek8, Context context, ViewGroup viewGroup, AbstractC1100450ek7 abstractC1100450ek7, InterfaceC1364105Vn<? super C1100440ek6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1100460ek8;
        this.LLILLJJLI = context;
        this.LLILLL = viewGroup;
        this.LLILZ = abstractC1100450ek7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1100440ek6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View first;
        C1C7U.LIZ("BaseLeaf@4cfe.addSubLeaf$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1100460ek8 abstractC1100460ek8 = this.LL;
        Context context = this.LLILLJJLI;
        Pair<View, C19ME> pairLJJJ = abstractC1100460ek8.LJJJ(context, this.LLILLL, C786410Ut5.ne(context));
        AbstractC1100460ek8 abstractC1100460ek82 = this.LL;
        C19ME second = null;
        if (pairLJJJ != null) {
            first = pairLJJJ.getFirst();
        } else {
            first = null;
        }
        abstractC1100460ek82.LLILZ = first;
        if (pairLJJJ != null) {
            second = pairLJJJ.getSecond();
        }
        C786410Ut5.LJLZ(0, this.LLILLL);
        this.LLILLL.addView(this.LL.LLILZ, second);
        AbstractC1100460ek8 abstractC1100460ek83 = this.LL;
        AbstractC1100450ek7 abstractC1100450ek7 = this.LLILZ;
        abstractC1100460ek83.LLILZIL = abstractC1100450ek7.LLILZIL;
        abstractC1100460ek83.LLIZLLLIL = abstractC1100450ek7;
        abstractC1100460ek83.LLIZ = abstractC1100450ek7.LLILLL;
        ((ArrayList) abstractC1100450ek7.LLILZLL).add(abstractC1100460ek83);
        this.LL.LJJIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseLeaf@4cfe.addSubLeaf$1$1$1");
        return unit;
    }
}
