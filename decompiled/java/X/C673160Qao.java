package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Qao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673160Qao implements C18HS {
    @Override // X.C18HS
    public final void onPageDestroyed(Object obj) {
    }

    @Override // X.C18HS
    public final void onPagePaused(Object obj) {
    }

    @Override // X.C18HS
    public final void onPageResumed(Object obj) {
    }

    public static void LIZ(Object obj) {
        String str;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C21246818Cs btmPageInfoV2 = btmSDK.getBtmPageInfoV2(PageFinder.via(obj));
        if (btmPageInfoV2 != null && (str = btmPageInfoV2.LIZIZ) != null) {
            C01GW c01gw = C664260Q3s.LIZ;
            if (((HashSet) c01gw.getValue()).contains(C13LP.LJJLIIIJ(C13LP.LL(a0.LJJLIIIJ(str, new char[]{'.'}, false, 0, 6), 2), e3.d, null, null, 0, null, null, 62)) || ((HashSet) c01gw.getValue()).contains(C13LP.LJJLIIIJ(C13LP.LL(a0.LJJLIIIJ(str, new char[]{'.'}, false, 0, 6), 3), e3.d, null, null, 0, null, null, 62))) {
                PageFinder pageFinderVia = PageFinder.via(obj);
                BcmParams bcmParams = new BcmParams();
                bcmParams.put("business_domain", "ecom_search");
                btmSDK.setBcmPageParams(pageFinderVia, bcmParams, Boolean.FALSE);
            }
        }
    }

    @Override // X.C18HS
    public final void onPageCreated(Object obj) {
        if (C1773900wGK.LIZ()) {
            C0S78.LIZJ(new AwS411S0200000_10(new WeakReference(obj), (WeakReference<Object>) this, (C673160Qao) 0), true);
        } else {
            C0S78.LIZJ(new AwS411S0200000_10(this, obj, 1), true);
        }
    }
}
