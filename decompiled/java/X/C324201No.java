package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01No, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.marketing.widget.BubbleImageLoader$loadOrderImages$2", f = "BubbleImageLoader.kt", l = {140}, m = "invokeSuspend")
public final class C324201No extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324201No(Context context, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324201No c324201No = new C324201No(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c324201No.LLILLJJLI = obj;
        return c324201No;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BubbleImageLoader@6f48.loadOrderImages$2");
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
            List<String> list = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
            List listLJJJJI = C13LP.LJJJJI(arrayList);
            Context context = this.LLILZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
            Iterator it2 = listLJJJJI.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C443601o2(context, (String) it2.next(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BubbleImageLoader@6f48.loadOrderImages$2");
                return objLJFF;
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(C13LP.LJJJJLI((Iterable) obj));
        C1C7U.LIZIZ("BubbleImageLoader@6f48.loadOrderImages$2");
        return mapLJIILLIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
