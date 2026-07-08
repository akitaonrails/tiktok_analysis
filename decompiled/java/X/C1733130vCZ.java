package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.business.billboard.feed.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733130vCZ implements InterfaceC1611000s1a, InterfaceC1733000vCM {
    public C1733010vCN LL;
    public LiveRoomStruct LLILLJJLI;

    @Override // X.InterfaceC1733000vCM
    public final void LJIIL(List<ECBillboard> list, Map<String, ? extends Object> map, ECBillboard eCBillboard) {
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJIJJ(List<ECBillboard> list, Map<String, ? extends Object> map, boolean z, ECBillboard eCBillboard) {
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJIJJLI(Map map, ECBillboard eCBillboard) {
    }

    @Override // X.InterfaceC1611000s1a
    public final void destroy() {
        this.LLILLJJLI = null;
        this.LL = null;
    }

    @Override // X.InterfaceC1733000vCM
    public final void LJI(List<ECBillboard> list, Map<String, ? extends Object> map) {
        Long lValueOf;
        String str;
        C1733100vCW c1733100vCW = C1733100vCW.LIZ;
        LiveRoomStruct liveRoomStruct = this.LLILLJJLI;
        if (liveRoomStruct != null) {
            lValueOf = Long.valueOf(liveRoomStruct.ownerUserId);
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        LiveRoomStruct liveRoomStruct2 = this.LLILLJJLI;
        if (liveRoomStruct2 == null || (str = liveRoomStruct2.idStr) == null) {
            str = "";
        }
        C1733100vCW.LJI(c1733100vCW, strValueOf, str, C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AnonymousClass0207.get$arr$(120), 30), C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AnonymousClass0207.get$arr$(121), 30), C13LP.LJJLIIIJ(list, ";", null, null, 0, null, AFwS268S0000000_26.get$arr$(646), 30), "preview_live", null, null, null, false, 1984);
    }

    @Override // X.InterfaceC1733000vCM
    public final String LJIJ(ECBillboard eCBillboard, Map<String, ? extends Object> map, int i) {
        return eCBillboard.LIZJ(i);
    }

    public static void LIZIZ(String str, ECBillboard eCBillboard, LiveRoomStruct liveRoomStruct, String str2) {
        int iIntValue;
        String str3;
        Integer num = eCBillboard.billboardType;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        Long lValueOf = null;
        if (liveRoomStruct != null) {
            str3 = liveRoomStruct.idStr;
            lValueOf = Long.valueOf(liveRoomStruct.ownerUserId);
        } else {
            str3 = null;
        }
        C1729270v6L.LIZ(str2, str, null, "feed", str3, String.valueOf(lValueOf), String.valueOf(eCBillboard.billboardId), iIntValue, 0, 0, 772);
    }

    @Override // X.InterfaceC1611000s1a
    public final void LIZ(Context context, FrameLayout frameLayout, String str, final LiveRoomStruct liveRoomStruct) {
        final List<ECBillboard> list;
        C03DZ.LIZJ(frameLayout);
        OecLivePreviewRoomData oecLivePreviewRoomDataLIZ = C1733150vCb.LIZ(str);
        if (oecLivePreviewRoomDataLIZ != null && (list = oecLivePreviewRoomDataLIZ.billboard) != null) {
            Iterator<ECBillboard> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZIZ("", it2.next(), liveRoomStruct, "billboard_get");
            }
            this.LLILLJJLI = liveRoomStruct;
            this.LL = new C1733010vCN(context, 2, this);
            C1733010vCN c1733010vCN = this.LL;
            if (c1733010vCN != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1733010vCN);
                c1733010vCN.setLayoutParams(layoutParams);
            }
            C786410Ut5.LJJJJIZL(frameLayout);
            frameLayout.addView(this.LL);
            C1733010vCN c1733010vCN2 = this.LL;
            if (c1733010vCN2 != null) {
                c1733010vCN2.LIZ(list, new InterfaceC1731950vAf() { // from class: X.0vCa
                    @Override // X.InterfaceC1731950vAf
                    public final void onSuccess() {
                        List<ECBillboard> list2 = list;
                        C1733130vCZ c1733130vCZ = this;
                        LiveRoomStruct liveRoomStruct2 = liveRoomStruct;
                        for (ECBillboard eCBillboard : list2) {
                            c1733130vCZ.getClass();
                            C1733130vCZ.LIZIZ("", eCBillboard, liveRoomStruct2, "billboard_on_screen");
                        }
                    }

                    @Override // X.InterfaceC1731950vAf
                    public final void LIZ(String str2) {
                        List<ECBillboard> list2 = list;
                        C1733130vCZ c1733130vCZ = this;
                        LiveRoomStruct liveRoomStruct2 = liveRoomStruct;
                        for (ECBillboard eCBillboard : list2) {
                            c1733130vCZ.getClass();
                            C1733130vCZ.LIZIZ(str2, eCBillboard, liveRoomStruct2, "billboard_show_fail");
                        }
                    }
                }, null);
            }
        }
    }
}
