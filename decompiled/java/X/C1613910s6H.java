package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import com.bytedance.android.live.wallet.model.IapProductGetResult;
import com.ss.android.ugc.aweme.experiment.PaidContentAnchorInAppSetting;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0s6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613910s6H {
    public static Map<String, IapProductGetResult.Item> LIZIZ;
    public static boolean LIZLLL;
    public static long LJI;
    public static final C1613910s6H LIZ = new C1613910s6H();
    public static MutableLiveData<AbstractC1556250qbH> LJ = new MutableLiveData<>();
    public static String LJFF = "";
    public static final C1807570x8d LJII = new C1807570x8d(new InterfaceC1807600x8g() { // from class: X.0s6G
        @Override // X.InterfaceC1807600x8g
        public final void LJ() {
        }

        @Override // X.InterfaceC1807600x8g
        public final void LJIIL() {
        }

        @Override // X.InterfaceC1807600x8g
        public final void LIZJ(IapProductGetResult iapProductGetResult) {
            IapProductGetResult.Item item;
            String str;
            C1613910s6H c1613910s6H = C1613910s6H.LIZ;
            C1613910s6H.LIZIZ = iapProductGetResult.data;
            if (!C1613910s6H.LIZLLL) {
                Map<String, IapProductGetResult.Item> map = C1613910s6H.LIZIZ;
                String str2 = null;
                if (map != null) {
                    item = map.get(C1613910s6H.LJFF);
                } else {
                    item = null;
                }
                MutableLiveData<AbstractC1556250qbH> mutableLiveData = C1613910s6H.LJ;
                if (item != null) {
                    str = item.price;
                } else {
                    str = null;
                }
                mutableLiveData.postValue(new C1556240qbG(str));
                C1613910s6H.LIZLLL = true;
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (item != null) {
                    str2 = item.productId;
                }
                c2344009Gk.LJIIIIZZ("iap_id", str2);
                c2344009Gk.LIZJ(1, "is_success");
                c2344009Gk.LIZLLL(System.currentTimeMillis() - C1613910s6H.LJI, "latency");
                C20684815ws.LJIILLIIL("paid_content_anchor_fetch_price", c2344009Gk.LIZ);
            }
        }

        @Override // X.InterfaceC1807600x8g
        public final void LJFF(IapProductGetResult iapProductGetResult) {
            C1613910s6H.LJ.postValue(C1556260qbI.LIZ);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, "is_success");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - C1613910s6H.LJI, "latency");
            C20684815ws.LJIILLIIL("paid_content_anchor_fetch_price", c2344009Gk.LIZ);
        }
    }, new InterfaceC1807590x8f() { // from class: X.0s6Q
        @Override // X.InterfaceC1807590x8f
        public final void L0() {
        }

        @Override // X.InterfaceC1807590x8f
        public final void LIZ(IapProductBuyResult iapProductBuyResult) {
        }

        @Override // X.InterfaceC1807590x8f
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1807590x8f
        public final void LIZLLL(IapProductBuyResult iapProductBuyResult) {
        }
    });
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(252));
    public static List<String> LIZJ = PaidContentAnchorInAppSetting.LIZ().iAPIDs;
}
