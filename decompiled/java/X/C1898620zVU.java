package X;

import Y.AComparatorS47S0000000_28;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.Control;
import com.bytedance.touchpoint.api.model.InAppPush;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zVU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898620zVU extends C09AY implements Function1<Long, Unit> {
    public C1898620zVU() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Integer numValueOf;
        l.longValue();
        C1898560zVO c1898560zVO = C1898560zVO.LL;
        C1898560zVO.LJIIL();
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List<InAppPush> listLJFF = C2178808gE.LIZ().LJFF(6);
        if (listLJFF != null) {
            for (InAppPush inAppPush : listLJFF) {
                Control control = inAppPush.control;
                if (control != null && (numValueOf = Integer.valueOf(control.type)) != null) {
                    if (numValueOf.intValue() == 1) {
                        ((ArrayList) C1898560zVO.LLILLJJLI).add(inAppPush);
                    } else if (numValueOf.intValue() == 2) {
                        ((ArrayList) C1898560zVO.LLILLL).add(inAppPush);
                    } else if (numValueOf.intValue() == 3) {
                        ((ArrayList) C1898560zVO.LLILZ).add(inAppPush);
                    }
                }
            }
        }
        ArrayList arrayList = (ArrayList) C1898560zVO.LLILLL;
        if ((!arrayList.isEmpty()) && arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS47S0000000_28(2));
        }
        C1898560zVO.LL.getClass();
        ArrayList arrayList2 = (ArrayList) C1898560zVO.LLILLJJLI;
        if (true ^ arrayList2.isEmpty()) {
            C1898560zVO.LJIILL((InAppPush) ListProtector.get(arrayList2, 0));
        }
        return Unit.LIZ;
    }
}
