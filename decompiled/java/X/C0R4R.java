package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0R4R, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4R extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R4R(C645130PSd c645130PSd, int i) {
        super(4);
        this.$t = i;
        this.l0 = c645130PSd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R4R(ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn, int i) {
        super(4);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC655110Pmn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R4R(C658220Pro c658220Pro, int i) {
        super(4);
        this.$t = i;
        this.l0 = c658220Pro;
    }

    public static final Object invoke$0(C0R4R c0r4r, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        C658220Pro c658220Pro = (C658220Pro) c0r4r.l0;
        c658220Pro.LL.LJFF(iIntValue, (View) obj, (Aweme) obj3, c658220Pro.LLILZLL, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C0R4R c0r4r, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        C645380PTc c645380PTcLIZ;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        if (((Boolean) obj4).booleanValue()) {
            return Boolean.TRUE;
        }
        RecyclerView.RecycledViewPool recycledViewPool = ((C645130PSd) c0r4r.l0).LL.getRecycledViewPool();
        int recycledViewCount = recycledViewPool.getRecycledViewCount(iIntValue) + iIntValue2;
        if (recycledViewPool instanceof C645390PTd) {
            C645390PTd c645390PTd = (C645390PTd) recycledViewPool;
            synchronized (c645390PTd) {
                z = true;
                c645380PTcLIZ = c645390PTd.LIZ(1);
            }
            if (recycledViewCount < c645380PTcLIZ.LIZ - 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$2(C0R4R c0r4r, Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        C653660PkS c653660PkS;
        String str3;
        C653660PkS c653660PkS2;
        C653660PkS c653660PkS3;
        Aweme aweme = (Aweme) obj;
        C654590Plx c654590Plx = (C654590Plx) obj2;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj3;
        String str4 = (String) obj4;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c8929.d2722_i");
        sbLIZ.append(((ViewOnAttachStateChangeListenerC655110Pmn) c0r4r.l0).getPosition());
        sbLIZ.append("_w2405");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PageFinder pageFinderVia = PageFinder.via(((ViewOnAttachStateChangeListenerC655110Pmn) c0r4r.l0).itemView);
        BcmParams bcmParams = new BcmParams();
        String str5 = "";
        if (c654590Plx == null || (c653660PkS3 = c654590Plx.LIZIZ) == null || (str = c653660PkS3.LJIIJ) == null) {
            str = "";
        }
        bcmParams.put("search_id", str);
        if (c654590Plx == null || (c653660PkS2 = c654590Plx.LIZIZ) == null || (str2 = c653660PkS2.LJIJI) == null) {
            str2 = "";
        }
        bcmParams.put("search_result_id", str2);
        if (c654590Plx != null && (c653660PkS = c654590Plx.LIZIZ) != null && (str3 = c653660PkS.LJIJJ) != null) {
            str5 = str3;
        }
        bcmParams.put("list_item_id", str5);
        enterRoomConfig.mLogData.sourceBtmToken = btmSDK.createJumpSourceBtmToken(strLIZIZ, pageFinderVia, bcmParams);
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        C655900Po4 c655900Po4 = C655900Po4.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC655080Pmk interfaceC655080Pmk = ((ViewOnAttachStateChangeListenerC655110Pmn) c0r4r.l0).LLLFF;
        c655900Po4.getClass();
        C655900Po4.LIZ(linkedHashMap, interfaceC655080Pmk);
        roomsData.gamePartnershipExtra = linkedHashMap;
        C0Q00 c0q00 = C0Q00.LIZ;
        ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = (ViewOnAttachStateChangeListenerC655110Pmn) c0r4r.l0;
        InterfaceC644520PPu interfaceC644520PPu = viewOnAttachStateChangeListenerC655110Pmn.LLLIIL;
        View view = viewOnAttachStateChangeListenerC655110Pmn.itemView;
        Context context = view.getContext();
        c0q00.getClass();
        C0Q00.LIZJ(aweme, c654590Plx, interfaceC644520PPu, enterRoomConfig, str4, view, context);
        return Unit.LIZ;
    }
}
