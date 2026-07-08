package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.marketing.widget.BubbleImageLoader$loadAll$2", f = "BubbleImageLoader.kt", l = {106}, m = "invokeSuspend")
public final class C324301Np extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324301Np(Context context, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324301Np c324301Np = new C324301Np(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c324301Np.LLILLJJLI = obj;
        return c324301Np;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BubbleImageLoader@6f48.loadAll$2");
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
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBackground.png", C2286608xc.LJ(320)), new Pair("https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBottomMoney.webp", C2286608xc.LJ(320)), new Pair("https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetDefaultBubble.webp", C2286608xc.LJ(168)), new Pair("https://sf16-sg.tiktokcdn.com/obj/eden-sg/j_uvpavtvyw_hlz_jjln/ljhwZthlaukjlkulzlp/bonus/widget/BonusWidgetBubble.webp", C2286608xc.LJ(168)));
            List<String> list = this.LLILLL;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
            for (Object obj2 : arrayList) {
                if (((LinkedHashMap) mapLJIIJ).get(obj2) == null) {
                    mapLJIIJ.put(obj2, C2286608xc.LJ(168));
                }
            }
            Context context = this.LLILZ;
            ArrayList arrayList2 = new ArrayList(mapLJIIJ.size());
            for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C324401Nq(((Number) entry.getValue()).intValue(), context, (String) entry.getKey(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BubbleImageLoader@6f48.loadAll$2");
                return objLJFF;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Pair pair : (Iterable) obj) {
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            if (second != null) {
                arrayList3.add(new Pair(first, second));
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList3);
        C1C7U.LIZIZ("BubbleImageLoader@6f48.loadAll$2");
        return mapLJIILLIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
