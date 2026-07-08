package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioModeratorPinCardAssem;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.PerksPinPanel;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.SMBServicePinInfo;

/* JADX INFO: renamed from: X.0KUH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KUH extends C09AY implements Function2<UIAssem, C0KUR, Unit> {
    public final /* synthetic */ PcsServiceBioModeratorPinCardAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KUH(PcsServiceBioModeratorPinCardAssem pcsServiceBioModeratorPinCardAssem) {
        super(2);
        this.LL = pcsServiceBioModeratorPinCardAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C0KUR c0kur) {
        C1784870wY1 c1784870wY1;
        SMBPreviewResponse.ResponseData responseData;
        PcsServiceBioModeratorPinCardAssem pcsServiceBioModeratorPinCardAssem;
        C1822330xWR c1822330xWRHp;
        SMBServicePinInfo sMBServicePinInfo;
        String str;
        String str2;
        String str3;
        String str4;
        int size;
        PerksPinPanel perksPinPanel;
        String str5;
        List<SimplePinCardInfo> list;
        String str6;
        List<SimplePinCardInfo> list2;
        if (c0kur == C0KUR.LOAD_SUCCESS && (c1784870wY1 = this.LL.ip().getState().LLILLJJLI) != null && (responseData = c1784870wY1.LIZJ) != null && (((c1822330xWRHp = (pcsServiceBioModeratorPinCardAssem = this.LL).hp()) == null || !(!c1822330xWRHp.LIZ())) && (((sMBServicePinInfo = responseData.smbServicePinInfo) == null || (list2 = sMBServicePinInfo.pinCardList) == null || !list2.isEmpty()) && pcsServiceBioModeratorPinCardAssem.LLJJIJI == null))) {
            pcsServiceBioModeratorPinCardAssem.ip().setState(new C0KUL(true));
            ViewGroup viewGroup = pcsServiceBioModeratorPinCardAssem.LLJJIII;
            if (viewGroup != null) {
                C500260Jjc.LLFFF(viewGroup);
            }
            Context context = pcsServiceBioModeratorPinCardAssem.getContext();
            if (context != null) {
                SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = SubscribeUpsellLynxUrlSetting.INSTANCE;
                C1822330xWR c1822330xWRHp2 = pcsServiceBioModeratorPinCardAssem.hp();
                String str7 = "";
                if (c1822330xWRHp2 == null || (str = c1822330xWRHp2.LL) == null) {
                    str = "";
                }
                C1822330xWR c1822330xWRHp3 = pcsServiceBioModeratorPinCardAssem.hp();
                if (c1822330xWRHp3 == null || (str2 = c1822330xWRHp3.LLJ) == null) {
                    str2 = "";
                }
                C1822330xWR c1822330xWRHp4 = pcsServiceBioModeratorPinCardAssem.hp();
                if (c1822330xWRHp4 == null || (str3 = c1822330xWRHp4.LLILLJJLI) == null) {
                    str3 = "";
                }
                C1822330xWR c1822330xWRHp5 = pcsServiceBioModeratorPinCardAssem.hp();
                if (c1822330xWRHp5 == null || (str4 = c1822330xWRHp5.LLILLL) == null) {
                    str4 = "";
                }
                C1822330xWR c1822330xWRHp6 = pcsServiceBioModeratorPinCardAssem.hp();
                if (c1822330xWRHp6 != null && (str6 = c1822330xWRHp6.LLILLJJLI) != null) {
                    str7 = str6;
                }
                String moderatorPinCardViewSchema = subscribeUpsellLynxUrlSetting.getModeratorPinCardViewSchema(str, str2, str3, str4, str7, AFwS237S0000000_7.get$arr$(39));
                IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                pcsServiceBioModeratorPinCardAssem.getActualLifecycleOwner();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2 = iHybridContainerService.Vn2(context, moderatorPinCardViewSchema, pcsServiceBioModeratorPinCardAssem, "service_plus_bio_moderator_pin_card", true, new C0KUI(pcsServiceBioModeratorPinCardAssem));
                pcsServiceBioModeratorPinCardAssem.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2 != null) {
                    SMBServicePinInfo sMBServicePinInfo2 = responseData.smbServicePinInfo;
                    if (sMBServicePinInfo2 != null && (list = sMBServicePinInfo2.pinCardList) != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    int i = (size * 88) + ((size - 1) * 8);
                    SMBServicePinInfo sMBServicePinInfo3 = responseData.smbServicePinInfo;
                    if (sMBServicePinInfo3 != null && (perksPinPanel = sMBServicePinInfo3.pinInfo) != null && (str5 = perksPinPanel.pinnedIdStr) != null && C500260Jjc.LJJIJ(str5)) {
                        i += 54;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C439101nJ.LIZ(i + 72));
                    float f = 16;
                    marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(f);
                    marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(f);
                    marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(f);
                    marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(f);
                    ViewGroup viewGroup2 = pcsServiceBioModeratorPinCardAssem.LLJJIII;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBVn2, marginLayoutParams);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
