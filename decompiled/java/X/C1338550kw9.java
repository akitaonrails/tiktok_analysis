package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.PdpHeadImagePreloadHelper$preloadImageInner$1", f = "PdpHeadImagePreloadHelper.kt", l = {}, m = "invokeSuspend")
public final class C1338550kw9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Image> LL;
    public final /* synthetic */ C1760980vvU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338550kw9(List<Image> list, C1760980vvU c1760980vvU, InterfaceC1364105Vn<? super C1338550kw9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c1760980vvU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338550kw9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String str;
        String str2;
        C1C7U.LIZ("PdpHeadImagePreloadHelper@a2fc.preloadImageInner$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Image> list = this.LL;
        C1760980vvU c1760980vvU = this.LLILLJJLI;
        try {
            ArrayList arrayList2 = new ArrayList();
            for (Image image : list) {
                if (!C13LP.LJJJJ(image.getUri(), c1760980vvU.LIZLLL)) {
                    arrayList2.add(image);
                }
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List<String> urls = ((Image) it2.next()).getUrls();
                if (urls != null && (str = (String) C13LP.LJJJLL(urls)) != null && (str2 = C1326840kdG.LIZ.LIZLLL(str, false).LIZ) != null) {
                    arrayList.add(str2);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (arrayList.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpHeadImagePreloadHelper@a2fc.preloadImageInner$1");
            return unit;
        }
        if (C1338560kwA.LIZ().preloadImageToDisk == 0) {
            C1326620kcu.LIZJ(arrayList, "product_detail", "a2270.b6661", Bitmap.Config.RGB_565, null, null, false, null, null);
        } else {
            C1326620kcu.LIZIZ(arrayList, "", "product_detail", "a2270.b6661", null, false, null, null);
        }
        Boolean.valueOf(((CopyOnWriteArraySet) c1760980vvU.LIZLLL).addAll(arrayList));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpHeadImagePreloadHelper@a2fc.preloadImageInner$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
