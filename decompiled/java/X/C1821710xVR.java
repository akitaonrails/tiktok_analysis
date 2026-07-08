package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkHeaderAssem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;
import webcast.api.smb.ThirdPartyLinkInfo;

/* JADX INFO: renamed from: X.0xVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821710xVR extends C09AY implements Function2<UIAssem, EnumC1821690xVP, Unit> {
    public final /* synthetic */ PcsThirdPartyLinkHeaderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821710xVR(PcsThirdPartyLinkHeaderAssem pcsThirdPartyLinkHeaderAssem) {
        super(2);
        this.LL = pcsThirdPartyLinkHeaderAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1821690xVP enumC1821690xVP) {
        ThirdPartyLinkInfo thirdPartyLinkInfo;
        User owner;
        UIAssem uIAssem2 = uIAssem;
        int i = C1821700xVQ.LIZ[enumC1821690xVP.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                C500260Jjc.LLFFF(uIAssem2.LJJIJL());
                PcsThirdPartyLinkHeaderAssem pcsThirdPartyLinkHeaderAssem = this.LL;
                SMBThirdPartyLinkGetBySkuResponse.ResponseData responseData = pcsThirdPartyLinkHeaderAssem.ip().getState().LL;
                if (responseData != null && (thirdPartyLinkInfo = responseData.linkInfo) != null) {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room != null) {
                        owner = room.getOwner();
                    } else {
                        owner = null;
                    }
                    String strLIZ = C0KVU.LIZ(owner);
                    String str = thirdPartyLinkInfo.platformName;
                    if (str == null) {
                        str = "";
                    }
                    C1166404hK c1166404hK = new C1166404hK(str);
                    C16F5 c16f5 = pcsThirdPartyLinkHeaderAssem.LLJJIII;
                    if (c16f5 != null) {
                        c16f5.setText(EnumC1785280wYg.THIRD_PARTY_SERVICE.getServiceSkuTitle(strLIZ, c1166404hK));
                    }
                    C16F5 c16f52 = pcsThirdPartyLinkHeaderAssem.LLJJIJI;
                    if (c16f52 != null) {
                        if (thirdPartyLinkInfo.desc.length() == 0) {
                            C500260Jjc.LJIILIIL(c16f52);
                        } else {
                            C500260Jjc.LLFFF(c16f52);
                            c16f52.setText(thirdPartyLinkInfo.desc);
                        }
                    }
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            C500260Jjc.LJIILIIL(uIAssem2.LJJIJL());
        }
        return Unit.LIZ;
    }
}
