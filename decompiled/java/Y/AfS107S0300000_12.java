package Y;

import X.AbstractC1273900jFs;
import X.AbstractC1387200mCc;
import X.C09JN;
import X.C0FNV;
import X.C0UCV;
import X.C0UGS;
import X.C118300cf;
import X.C1233040iBy;
import X.C1269340j8W;
import X.C1273890jFr;
import X.C1388190mED;
import X.C1440005kM;
import X.C1519140pdQ;
import X.C1C7U;
import X.C259800zU;
import X.C494680Jac;
import X.C712300Rwq;
import X.C758220Toi;
import X.C758270Ton;
import X.C758320Tos;
import X.C766270U4b;
import X.C783810Uot;
import X.InterfaceC472150IfN;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.detail.component.biz.TrashBinBottomComponent;
import com.ss.android.ugc.aweme.donation.token.DonationSessionResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS107S0300000_12 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        List<String> list;
        List<String> list2;
        C1C7U.LIZ("TrashBinBottomComponent$TrashBinRestoreApiManager@90b1.trashBinRestore$1");
        TrashBinBottomComponent.TrashBinRestoreApiManager.TrashBinUpdateResponse trashBinUpdateResponse = (TrashBinBottomComponent.TrashBinRestoreApiManager.TrashBinUpdateResponse) obj;
        if (trashBinUpdateResponse != null && (list2 = trashBinUpdateResponse.recoverSuccessItems) != null && list2.size() == ((List) afS107S0300000_12.l0).size()) {
            Function0 function0 = (Function0) afS107S0300000_12.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0 function02 = (Function0) afS107S0300000_12.l2;
            if (function02 != null) {
                function02.invoke();
            }
        }
        if (trashBinUpdateResponse != null) {
            list = trashBinUpdateResponse.recoverSuccessItems;
        } else {
            list = null;
        }
        C1440005kM.LIZ(new C712300Rwq(list));
        C1C7U.LIZIZ("TrashBinBottomComponent$TrashBinRestoreApiManager@90b1.trashBinRestore$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        C1C7U.LIZ("DonationTokenManager@7b54.realGetFinalUrl$1");
        DonationSessionResponse donationSessionResponse = (DonationSessionResponse) obj;
        Dialog dialog = (Dialog) ((C259800zU) afS107S0300000_12.l0).element;
        if (dialog != null) {
            C0FNV.LIZ(dialog);
        }
        if (donationSessionResponse.status_code == 0 && !TextUtils.isEmpty(donationSessionResponse.getSessionUrl())) {
            ((Function1) afS107S0300000_12.l1).invoke(donationSessionResponse.getSessionUrl());
        } else {
            Context context = (Context) afS107S0300000_12.l2;
            if (context != null) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZJ(context.getString(2131845468));
                c1233040iBy.LIZLLL();
            }
        }
        C1C7U.LIZIZ("DonationTokenManager@7b54.realGetFinalUrl$1");
    }

    public static final void accept$2(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        C1C7U.LIZ("LiveVisibleScopeHelper@97dd.openContactorSelector$2$onSelectedConfirm$disposable$2");
        if (C494680Jac.LIZJ()) {
            C494680Jac.LJIJJ(false);
            C494680Jac.LJIL(true);
            C494680Jac.LJIJ(false);
        }
        ((Function1) afS107S0300000_12.l0).invoke(Integer.valueOf(((C758320Tos) afS107S0300000_12.l1).LIZ.size()));
        DataChannel dataChannel = ((C758270Ton) afS107S0300000_12.l2).LIZ;
        if (dataChannel != null) {
            C758320Tos c758320Tos = (C758320Tos) afS107S0300000_12.l1;
            dataChannel.zW(VisibleScopeSelectedChannel.class, new C758220Toi(2, c758320Tos.LIZ, c758320Tos.LIZIZ, c758320Tos.LIZJ, c758320Tos.LIZLLL));
        }
        C766270U4b.LIZLLL(2131856058);
        C1C7U.LIZIZ("LiveVisibleScopeHelper@97dd.openContactorSelector$2$onSelectedConfirm$disposable$2");
    }

    public static final void accept$3(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        Activity activityLIZ;
        C1C7U.LIZ("PopupLoadAction@fa84.execute$1$1$1$2$1");
        Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
        if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            ((C1519140pdQ) afS107S0300000_12.l0).LIZJ((NetworkUniversalPopupDispatchResponse) afS107S0300000_12.l1, activityLIZ, (Map) afS107S0300000_12.l2);
        }
        C1C7U.LIZIZ("PopupLoadAction@fa84.execute$1$1$1$2$1");
    }

    public static final void accept$4(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        C1C7U.LIZ("NaviAvatarRequest@d172.downloadEffects$1");
        List<? extends Effect> list = (List) obj;
        Function1 function1 = (Function1) afS107S0300000_12.l0;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        ((C0UCV) afS107S0300000_12.l1).LIZ((List) afS107S0300000_12.l2, list);
        C1C7U.LIZIZ("NaviAvatarRequest@d172.downloadEffects$1");
    }

    public static final void accept$5(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        C1269340j8W c1269340j8WLLD;
        C1C7U.LIZ("DualDeviceLiveCoreHandler@92e6.initLiveStream$2");
        C1273890jFr c1273890jFr = (C1273890jFr) obj;
        AbstractC1273900jFs abstractC1273900jFs = c1273890jFr.LJI;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null) {
            c1269340j8WLLD.LJJJJLL(((C118300cf) afS107S0300000_12.l0).element, ((C118300cf) afS107S0300000_12.l1).element);
        }
        C0UGS.LIZ = c1273890jFr;
        ((C09JN) afS107S0300000_12.l2).accept(c1273890jFr);
        C1C7U.LIZIZ("DualDeviceLiveCoreHandler@92e6.initLiveStream$2");
    }

    public static final void accept$6(AfS107S0300000_12 afS107S0300000_12, Object obj) {
        C783810Uot c783810Uot = (C783810Uot) afS107S0300000_12.l0;
        InterfaceC472150IfN interfaceC472150IfN = (InterfaceC472150IfN) afS107S0300000_12.l1;
        Boolean bool = (Boolean) afS107S0300000_12.l2;
        LivePodcastResponse.ResponseData responseData = (LivePodcastResponse.ResponseData) obj;
        c783810Uot.getClass();
        C1C7U.LIZ("LiveServiceAdapter@4348.requestLivePermissionFromCache$3L");
        if (responseData != null) {
            c783810Uot.LJIILLIIL(interfaceC472150IfN, responseData, bool, Boolean.TRUE);
            c783810Uot.LJIIL();
        }
        C1C7U.LIZIZ("LiveServiceAdapter@4348.requestLivePermissionFromCache$3L");
    }

    public AfS107S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
