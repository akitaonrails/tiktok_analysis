package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.NativePreloadController;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.preload.ShopBagListSparkFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.17zN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21209917zN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C21208517z9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21209917zN(Context context, C21208517z9 c21208517z9, String str, String str2, Map<String, ? extends Object> map, String str3) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = c21208517z9;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        NativePreloadController nativePreloadControllerLIZ = C150V.LIZIZ.LIZ().LIZ(this.LL);
        C21208517z9 c21208517z9 = this.LLILLJJLI;
        String str = this.LLILLL;
        Room room = c21208517z9.LLILZ;
        boolean z = c21208517z9.LLJL;
        String str2 = this.LLILZ;
        Map<String, Object> map = this.LLILZIL;
        long j = c21208517z9.LLJILJIL;
        String str3 = this.LLILZLL;
        C21209817zM c21209817zM = c21208517z9.LLL;
        if (!Intrinsics.LJFF(nativePreloadControllerLIZ.LJFF, c21208517z9)) {
            nativePreloadControllerLIZ.LIZJ(null);
            nativePreloadControllerLIZ.LJFF = c21208517z9;
            nativePreloadControllerLIZ.LJII = new C1506070pIL(c21208517z9);
        }
        nativePreloadControllerLIZ.LIZIZ = c21209817zM;
        nativePreloadControllerLIZ.LIZJ = true;
        ShopBagListSparkFragment shopBagListSparkFragment = nativePreloadControllerLIZ.LJ;
        if (shopBagListSparkFragment != null) {
            InterfaceC1541990qEH kitView = shopBagListSparkFragment.getKitView();
            if (kitView != null) {
                C21208717zB.LIZJ(str, room != null ? Long.valueOf(room.getId()) : null, j, str2, z, map, kitView);
            }
            ((TuxSheet) nativePreloadControllerLIZ.LJIIIZ.getValue()).ZR();
            ShopBagListSparkFragment shopBagListSparkFragment2 = nativePreloadControllerLIZ.LJ;
            if (shopBagListSparkFragment2 != null) {
                shopBagListSparkFragment2.onFragmentShow();
            }
            if (z) {
                C1506070pIL c1506070pIL = nativePreloadControllerLIZ.LJII;
                if (c1506070pIL != null) {
                    c1506070pIL.LIZ("reuse", str2);
                }
            } else {
                C1506070pIL c1506070pIL2 = nativePreloadControllerLIZ.LJII;
                if (c1506070pIL2 != null) {
                    c1506070pIL2.LIZ("preload_open", str2);
                }
            }
        } else {
            if (((Fragment) nativePreloadControllerLIZ.LJIIIZ.getValue()).isAdded()) {
                ((TuxSheet) nativePreloadControllerLIZ.LJIIIZ.getValue()).ZR();
            } else {
                nativePreloadControllerLIZ.LIZ();
            }
            ShopBagListSparkFragment shopBagListSparkFragmentLIZIZ = nativePreloadControllerLIZ.LIZIZ(str, str2, c21208517z9);
            nativePreloadControllerLIZ.LJ = shopBagListSparkFragmentLIZIZ;
            InterfaceC1541990qEH kitView2 = shopBagListSparkFragmentLIZIZ.getKitView();
            if (kitView2 != null) {
                C21208717zB.LIZJ(str, room != null ? Long.valueOf(room.getId()) : null, j, str2, z, map, kitView2);
            }
            C1506070pIL c1506070pIL3 = nativePreloadControllerLIZ.LJII;
            if (c1506070pIL3 != null) {
                c1506070pIL3.LIZ("direct_open", str2);
            }
        }
        nativePreloadControllerLIZ.LIZLLL.LLJ = true;
        ShopBagListSparkFragment shopBagListSparkFragment3 = nativePreloadControllerLIZ.LJ;
        if (shopBagListSparkFragment3 != null) {
            BtmSDK.INSTANCE.updateBtmPage(shopBagListSparkFragment3, str3);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        ShopBagListSparkFragment shopBagListSparkFragment4 = nativePreloadControllerLIZ.LJ;
        Boolean bool = Boolean.TRUE;
        C0PSL c0psl = new C0PSL();
        c0psl.LIZ = true;
        btmSDK.onPageShow(shopBagListSparkFragment4, bool, c0psl);
        InterfaceC21210317zR interfaceC21210317zR = nativePreloadControllerLIZ.LIZIZ;
        if (interfaceC21210317zR != null) {
            interfaceC21210317zR.LIZIZ();
        }
        return Unit.LIZ;
    }
}
