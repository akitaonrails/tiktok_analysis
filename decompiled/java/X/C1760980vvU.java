package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public final class C1760980vvU implements InterfaceC1065104En {
    public final PdpViewModel LIZIZ;
    public boolean LIZJ;
    public final Set<String> LIZLLL = new CopyOnWriteArraySet();

    @Override // X.InterfaceC1065104En
    public final void release() {
        ((CopyOnWriteArraySet) this.LIZLLL).clear();
    }

    public C1760980vvU(PdpViewModel pdpViewModel) {
        this.LIZIZ = pdpViewModel;
    }

    @Override // X.InterfaceC1065104En
    public final void LIZ(C042Y c042y) {
        Skc skc;
        List<Image> listSubList;
        List<Image> list;
        SkcInfo skcInfo;
        List<Skc> list2;
        Skc next;
        if (C1338560kwA.LIZ().enablePreloadWhenSkuTouch != 1) {
            return;
        }
        try {
            if (c042y.LLILZIL) {
                ProductPackStruct productPackStruct = this.LIZIZ.LLJILLL;
                String strLJIIIIZZ = null;
                if (productPackStruct != null && (skcInfo = productPackStruct.skcInfo) != null && (list2 = skcInfo.skcList) != null) {
                    Iterator<Skc> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.skcId, c042y.LL)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    skc = next;
                } else {
                    skc = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadWhenSkuTouch: skc=");
                if (skc != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(skc);
                }
                sbLIZ.append(strLJIIIIZZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (skc == null || (list = skc.skcImages) == null || (listSubList = list.subList(0, Math.min(2, list.size() - 1))) == null) {
                    listSubList = C13BV.INSTANCE;
                }
                LIZLLL(listSubList);
                return;
            }
            this.LIZIZ.iR2(new AwS392S0200000_26(c042y, this, 126));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1065104En
    public final void LIZJ(int i) {
        if (C1338560kwA.LIZ().enablePreloadWhenScrollEnd != 1) {
            return;
        }
        try {
            this.LIZIZ.iR2(new AwS132S0101000_26(i, this, 5));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(List<Image> list) {
        C948503nH.LJFF(this.LIZIZ, C0PEM.LIZJ, new C1338550kw9(list, this, null));
    }

    @Override // X.InterfaceC1065104En
    public final void LIZIZ(int i, List<Image> list) {
        int i2;
        int size;
        if (C1338560kwA.LIZ().enablePreloadWhenDataReady == 1 && this.LIZIZ.LLLI && !this.LIZJ) {
            this.LIZJ = true;
            C0X4L c0x4l = C1506030pIH.LIZJ;
            int iMax = 0;
            if (c0x4l != null) {
                i2 = c0x4l.LIZIZ;
            } else {
                i2 = 0;
            }
            try {
                if (i2 < C1338560kwA.LIZ().preloadAllNetworkThreshold) {
                    iMax = Math.max(i - 1, 0);
                    size = Math.min(i + 2, ((ArrayList) list).size());
                } else {
                    size = ((ArrayList) list).size();
                }
                LIZLLL(((ArrayList) list).subList(iMax, size));
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
