package X;

import android.content.Context;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BaseTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardTrackParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardLiveStatusHelper$onLiveStart$2", f = "BillboardLiveStatusHelper.kt", l = {85}, m = "invokeSuspend")
public final class C1729100v64 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1729300v6O LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729100v64(C1729300v6O c1729300v6O, String str, long j, String str2, Context context, InterfaceC1364105Vn<? super C1729100v64> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1729300v6O;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729100v64(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardLiveStatusHelper@7875.onLiveStart$2");
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
            C1730290v7z.LIZ.getClass();
            if (!C1730290v7z.LJIILIIL()) {
                C1728940v5o.LLZLLIL(null, this.LLILLL);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BillboardLiveStatusHelper@7875.onLiveStart$2");
                return unit;
            }
            C1729110v65 c1729110v65LJLZ = C1728940v5o.LJLZ(this.LLILLL);
            if (c1729110v65LJLZ == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BillboardLiveStatusHelper@7875.onLiveStart$2");
                return unit2;
            }
            ArrayList arrayList = new ArrayList();
            List<BaseTemplateItem> list = c1729110v65LJLZ.LIZIZ;
            if (list != null) {
                long j = this.LLILZ;
                Iterator<BaseTemplateItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(BaseTemplateItem.LIZ(it2.next(), null, null, C2286608xc.LJFF(j), true, 163839));
                }
            }
            boolean z = c1729110v65LJLZ.LIZ;
            String str = c1729110v65LJLZ.LIZJ;
            Long lLJFF = C2286608xc.LJFF(this.LLILZ);
            String str2 = c1729110v65LJLZ.LJFF;
            String str3 = c1729110v65LJLZ.LJI;
            C1728940v5o.LLZLLIL(new C1729110v65(z, arrayList, str, lLJFF, true, str2, str3, this.LLILZIL, c1729110v65LJLZ.LJIIIIZZ, c1729110v65LJLZ.LJIIIZ), this.LLILLL);
            String str4 = this.LLILZIL;
            String str5 = this.LLILLL;
            String str6 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (str3 != null) {
                str6 = str3;
            }
            BillboardTrackParams billboardTrackParams = c1729110v65LJLZ.LJIIIZ;
            C1729120v66.LIZ(str4, str5, false, str2, str6, z, null, arrayList, null, str, "", true, billboardTrackParams.operatedFrom, billboardTrackParams.isAutoDisplay);
            C1729300v6O c1729300v6O = this.LLILLJJLI;
            String str7 = this.LLILZIL;
            String str8 = this.LLILLL;
            Context context = this.LLILZLL;
            this.LL = 1;
            if (c1729300v6O.LIZIZ(c1729110v65LJLZ, str7, str8, context, this) == objLJFF) {
                C1C7U.LIZIZ("BillboardLiveStatusHelper@7875.onLiveStart$2");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BillboardLiveStatusHelper@7875.onLiveStart$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
