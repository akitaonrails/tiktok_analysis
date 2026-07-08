package X;

import com.ss.android.ugc.aweme.im.b2c.strategy.model.ChatCommonConfMetaData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatRoomTitleBarLabelConf;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662506f9 implements InterfaceC1669006gC {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(988));

    @Override // X.InterfaceC1669006gC
    public final String LIZ(C909290Zln c909290Zln, IMUser iMUser) {
        ChatRoomTitleBarLabelConf chatRoomTitleBarLabelConf;
        IStrategyPlatformService.LIZ.getClass();
        IStrategyPlatformService value = C909190Zld.LIZIZ.getValue();
        EnumC909380Zlw enumC909380Zlw = EnumC909380Zlw.CHAT_ROOM_TITLE_BAR_LABEL;
        C1663706fL.LIZ.getClass();
        ChatCommonConfMetaData chatCommonConfMetaDataLIZ = C1663706fL.LIZ(c909290Zln, iMUser, null);
        C1724206p6 c1724206p6 = new C1724206p6();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        IBusinessConfig iBusinessConfigLJ = value.LJ(enumC909380Zlw, chatCommonConfMetaDataLIZ, c1724206p6, curUserId, true);
        if (!(iBusinessConfigLJ instanceof ChatRoomTitleBarLabelConf) || (chatRoomTitleBarLabelConf = (ChatRoomTitleBarLabelConf) iBusinessConfigLJ) == null) {
            return null;
        }
        return chatRoomTitleBarLabelConf.getLabel();
    }
}
