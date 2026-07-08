package X;

import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMorePanelViewModel;
import com.bytedance.android.livesdk.broadcast.interaction.function.ToolbarCampaignCenterViewModel;
import com.bytedance.android.livesdk.broadcast.setting.LiveShowCampaignGuideInRoom;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;
import webcast.data.CampaignExposureData;

/* JADX INFO: renamed from: X.0UNO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMorePanelViewModel$fetchMorePanelSettingData$1", f = "BroadcastMorePanelViewModel.kt", l = {26}, m = "invokeSuspend")
public final class C0UNO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BroadcastMorePanelViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UNO(BroadcastMorePanelViewModel broadcastMorePanelViewModel, InterfaceC1364105Vn<? super C0UNO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = broadcastMorePanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0UNO c0uno = new C0UNO(this.LLILLL, interfaceC1364105Vn);
        c0uno.LLILLJJLI = obj;
        return c0uno;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        boolean z;
        boolean z2;
        String str2;
        CampaignExposureData campaignExposureData;
        CampaignExposureData campaignExposureData2;
        CampaignExposureData campaignExposureData3;
        CampaignExposureData campaignExposureData4;
        C1C7U.LIZ("BroadcastMorePanelViewModel@7bd9.fetchMorePanelSettingData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0UNQ c0unq = this.LLILLL.LL;
                this.LL = 1;
                obj = c0unq.LIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BroadcastMorePanelViewModel@7bd9.fetchMorePanelSettingData$1");
                    return objLJFF;
                }
            }
            c098200Yq = (GetSettingPanelData) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str3 = null;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = null;
        }
        GetSettingPanelData getSettingPanelData = (GetSettingPanelData) c098200Yq;
        ToolbarCampaignCenterViewModel toolbarCampaignCenterViewModel = this.LLILLL.LLILLJJLI;
        toolbarCampaignCenterViewModel.getClass();
        if (!C500260Jjc.LJJIFFI((Boolean) DataChannelGlobal.LLILZ.gg0(C931220aLA.class)) && LiveShowCampaignGuideInRoom.INSTANCE.getValue() != 0) {
            toolbarCampaignCenterViewModel.LLILZ = true;
            if (getSettingPanelData != null && (campaignExposureData4 = getSettingPanelData.campaignExposureData) != null) {
                str = campaignExposureData4.plainText;
            } else {
                str = null;
            }
            if (getSettingPanelData != null && (campaignExposureData3 = getSettingPanelData.campaignExposureData) != null) {
                z = campaignExposureData3.isShow;
            } else {
                z = false;
            }
            if (z && C500260Jjc.LJJIIZ(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getSettingPanelData != null && (campaignExposureData2 = getSettingPanelData.campaignExposureData) != null) {
                str2 = campaignExposureData2.eventName;
            } else {
                str2 = null;
            }
            if (getSettingPanelData != null && (campaignExposureData = getSettingPanelData.campaignExposureData) != null) {
                str3 = campaignExposureData.eventData;
            }
            if (str2 != null && str3 != null) {
                try {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
                    c474500IjALIZ.LJJIIJZLJL(new JSONObject(str3));
                    c474500IjALIZ.LIZ();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
            if (z2) {
                toolbarCampaignCenterViewModel.LLILLL = true;
                toolbarCampaignCenterViewModel.LL.postValue(str);
            } else {
                toolbarCampaignCenterViewModel.LLILLL = false;
                toolbarCampaignCenterViewModel.LLILLJJLI.postValue(Boolean.TRUE);
            }
            toolbarCampaignCenterViewModel.wQ2();
            toolbarCampaignCenterViewModel.LLILZIL = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BroadcastMorePanelViewModel@7bd9.fetchMorePanelSettingData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
