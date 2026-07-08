package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1773440wFa extends C2217421BqW implements Function2<Boolean, C1773550wFl, Unit> {
    public C1773440wFa(Object obj) {
        super(2, obj, AbstractC1773460wFc.class, "onItemDefaultVisibilityChanged", "onItemDefaultVisibilityChanged(ZLcom/ss/android/ugc/aweme/ecommerce/mixmall/container/body/ECMMKItemVisibility$Threshold;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, C1773550wFl c1773550wFl) {
        Object obj;
        D d;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        Map<String, Object> map;
        boolean zBooleanValue = bool.booleanValue();
        AbstractC1773460wFc abstractC1773460wFc = (AbstractC1773460wFc) this.receiver;
        D d2 = abstractC1773460wFc.LLILLL;
        AbstractC1773210wFD abstractC1773210wFD = null;
        if (d2 != 0 && (map = d2.LJI) != null) {
            obj = ((LinkedHashMap) map).get("from");
        } else {
            obj = null;
        }
        InterfaceC1771900wD6 interfaceC1771900wD6 = (InterfaceC1771900wD6) abstractC1773460wFc.LL.LIZJ().getService(InterfaceC1771900wD6.class);
        if (interfaceC1771900wD6 != null) {
            int iLIZJ = interfaceC1771900wD6.LIZJ();
            if (zBooleanValue && iLIZJ == 0 && ((Intrinsics.LJFF(obj, "prefetch_cache") || Intrinsics.LJFF(obj, "first_fetch")) && (d = abstractC1773460wFc.LLILLL) != 0 && (c1775190wIP = d.LJII) != null && (c1775180wIO = c1775190wIP.LIZIZ) != null)) {
                c1775180wIO.LJIILIIL = 1;
            }
        }
        abstractC1773460wFc.onVisibilityChanged(zBooleanValue);
        if (zBooleanValue) {
            InterfaceC1774100wGe interfaceC1774100wGe = (InterfaceC1774100wGe) abstractC1773460wFc.LL.LIZJ().getService(InterfaceC1774100wGe.class);
            if (interfaceC1774100wGe != null) {
                interfaceC1774100wGe.LJIIIZ(abstractC1773460wFc.LLILLL);
            }
            InterfaceC1774100wGe interfaceC1774100wGe2 = (InterfaceC1774100wGe) abstractC1773460wFc.LL.LIZJ().getService(InterfaceC1774100wGe.class);
            if (interfaceC1774100wGe2 != null) {
                D d3 = abstractC1773460wFc.LLILLL;
                if (d3 != 0) {
                    abstractC1773210wFD = d3.LJIJJLI;
                }
                interfaceC1774100wGe2.LJIIIZ(abstractC1773210wFD);
            }
        }
        return Unit.LIZ;
    }
}
