package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.CarouselV2DO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS28S1400000_26;

/* JADX INFO: renamed from: X.0usv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720950usv extends C09AY implements Function2<Object, AbstractC1720840usk<Object>, Unit> {
    public final /* synthetic */ CardDO LL;
    public final /* synthetic */ C1555670qaL LLILLJJLI;
    public final /* synthetic */ C1720760usc LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720950usv(CardDO cardDO, C1555670qaL c1555670qaL, C1720760usc c1720760usc, Fragment fragment) {
        super(2);
        this.LL = cardDO;
        this.LLILLJJLI = c1555670qaL;
        this.LLILLL = c1720760usc;
        this.LLILZ = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, AbstractC1720840usk<Object> abstractC1720840usk) {
        int iIntValue;
        String objId;
        BaseWidgetDO baseWidgetDO;
        C13BV arrayList;
        C1721130utD c1721130utD;
        CarouselV2DO carouselV2DO;
        List<String> progressCardIdList;
        AbstractC1720840usk<Object> abstractC1720840usk2 = abstractC1720840usk;
        Integer num = C1720940usu.LIZIZ.get();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        View view = null;
        if (iIntValue <= 0) {
            if ((obj instanceof CarouselV2DO) && (carouselV2DO = (CarouselV2DO) obj) != null && (progressCardIdList = carouselV2DO.getProgressCardIdList()) != null) {
                arrayList = new ArrayList();
                for (String str : progressCardIdList) {
                    if (str.length() > 0) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (!arrayList.isEmpty() && (abstractC1720840usk2 instanceof C1721130utD) && (c1721130utD = (C1721130utD) abstractC1720840usk2) != null) {
                c1721130utD.LLJILJIL = C1721070ut7.LIZ;
            }
        }
        Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
        CardDO cardDO = this.LL;
        if ((abstractC1720840usk2 instanceof C1721420utg) && abstractC1720840usk2 != null) {
            String[] strArr = new String[3];
            strArr[0] = cardDO.getId();
            strArr[1] = cardDO.getObjId();
            if ((obj instanceof BaseWidgetDO) && (baseWidgetDO = (BaseWidgetDO) obj) != null) {
                objId = baseWidgetDO.getObjId();
            } else {
                objId = null;
            }
            strArr[2] = objId;
            List listLJIJI = C13LQ.LJIJI(strArr);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (ArrayList) listLJIJI) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                C19719612Di.LJJIII(((LinkedHashMap) C1720940usu.LIZ).entrySet(), AFwS231S0000000_3.get$arr$(161), true);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C1720940usu.LIZ.put((String) it2.next(), new WeakReference<>(abstractC1720840usk2));
                }
            }
        }
        String str2 = this.LLILLJJLI.LIZLLL;
        if (str2 != null && (obj instanceof BaseWidgetDO)) {
            Map<String, WeakReference<C1721420utg>> map2 = C1720940usu.LIZ;
            BaseWidgetDO baseWidgetDO2 = (BaseWidgetDO) obj;
            CardDO cardDO2 = this.LL;
            C1720760usc c1720760usc = this.LLILLL;
            if (abstractC1720840usk2 != null) {
                view = abstractC1720840usk2.LLILLJJLI;
            }
            Fragment fragment = this.LLILZ;
            if (C1720520usE.LIZIZ(baseWidgetDO2) && view != null) {
                C2211631BhB.LJ(view, new AwS28S1400000_26(fragment, baseWidgetDO2, cardDO2, c1720760usc, str2, 2));
            }
        }
        return Unit.LIZ;
    }
}
