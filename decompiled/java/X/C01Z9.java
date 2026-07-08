package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.model.GuestShowdownConfigChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Z9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01Z9 {
    public static final /* synthetic */ int LIZ = 0;

    public static C946060aj6 LIZIZ(DataChannel dataChannel) {
        C946060aj6 c946060aj6;
        if (dataChannel != null && (c946060aj6 = (C946060aj6) dataChannel.gg0(GuestShowdownConfigChannel.class)) != null && !Intrinsics.LJFF(c946060aj6.LIZIZ, "unknown")) {
            return c946060aj6;
        }
        return null;
    }

    public static LinkListUser LIZJ(long j) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        LinkPlayerInfo linkPlayerInfo;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (!(objLJIIIZ instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) == null || (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJIILIIL(j)) == null) {
                return null;
            }
            return C930540aK4.LIZIZ(linkPlayerInfo);
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(objLJIIIZ2 instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG = (InterfaceC917640ZzG) objLJIIIZ2) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null) {
            return null;
        }
        return (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(j);
    }

    public static void LIZLLL(Context context) {
        long playId;
        String realDrawLayoutId;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String str;
        String str2 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().faqUrl;
        if (str2 != null && str2.length() != 0) {
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ != null) {
                playId = interfaceC938530aWxLIZ.getPlayId();
            } else {
                playId = 0;
            }
            if (C931790aM5.LIZIZ()) {
                realDrawLayoutId = C940770aaZ.LIZ().getDataSource().LJIL();
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (realDrawLayoutId = interfaceC937820aVoLJJJJZ.getRealDrawLayoutId()) == null) {
                    realDrawLayoutId = "";
                }
            }
            if (C924810aAp.LJ().LJJII != 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            int i = C924810aAp.LJ().LJJII;
            String strLJIILL = C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("&transition_animation=bottom&guest_showdown_id=");
            sbLIZ.append(playId);
            sbLIZ.append("&layout_id=");
            sbLIZ.append(realDrawLayoutId);
            sbLIZ.append("&is_guest_connection=");
            sbLIZ.append(str);
            sbLIZ.append("&guest_cnt=");
            sbLIZ.append(i);
            sbLIZ.append("&user_type=");
            sbLIZ.append(strLJIILL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (context != null) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, strLIZIZ, null);
                return;
            }
            return;
        }
        C20441214yg.LJ("GuestShowdownIdleSettingsDialog", "openFAQDialog return as url is null");
    }

    public static boolean LIZ(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(list2, i))) {
                return false;
            }
        }
        return true;
    }
}
