package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.promotioncard.PromotionCardCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xTI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820380xTI extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ PromotionCardCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820380xTI(PromotionCardCell promotionCardCell) {
        super(2);
        this.LL = promotionCardCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Boolean bool) {
        List<InterfaceC1891350zJl> list;
        boolean zBooleanValue = bool.booleanValue();
        if (!zBooleanValue) {
            C1820630xTh c1820630xThLIZ = this.LL.L5().getState().LL.LIZ();
            InterfaceC1891350zJl interfaceC1891350zJl = null;
            if (c1820630xThLIZ != null && (list = c1820630xThLIZ.LIZLLL) != null) {
                Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC1891350zJl next = it2.next();
                    if (next instanceof C1820390xTJ) {
                        interfaceC1891350zJl = next;
                        break;
                    }
                }
                interfaceC1891350zJl = interfaceC1891350zJl;
            }
            this.LL.N5((C1820390xTJ) interfaceC1891350zJl);
        }
        for (AbstractC20628015ni abstractC20628015ni : (ArrayList) this.LL.LLJILJILJ) {
            if (abstractC20628015ni != null) {
                abstractC20628015ni.setLoading(zBooleanValue);
            }
        }
        return Unit.LIZ;
    }
}
