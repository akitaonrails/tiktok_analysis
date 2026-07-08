package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.boards.BoardsPageActionChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.util.BoardsPageDialogActionChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.rank.api.BoardsPermissionChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758450Tp5 implements InterfaceC1141530foN {
    public static final C758450Tp5 LL = new C758450Tp5();
    public static DataChannel LLILLJJLI;
    public static Map<String, String> LLILLL;

    public final void LIZ() {
        DataChannel dataChannel = LLILLJJLI;
        if (dataChannel != null) {
            final Map<String, String> map = LLILLL;
            dataChannel.zW(BoardsPageActionChannel.class, new AbstractC758530TpD(map) { // from class: X.0TpC
            });
        }
        DataChannel dataChannel2 = LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        C1548820qPI.LJIIIIZZ("playbook_request_data", this);
        LLILLJJLI = null;
        LLILLL = null;
    }

    public static final boolean LIZIZ(DataChannel dataChannel) {
        boolean z;
        C758470Tp7 c758470Tp7LIZ;
        boolean zBooleanValue;
        if (dataChannel == null) {
            return false;
        }
        if (dataChannel.gg0(RoomChannel.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean zJ8 = InteractServiceDel.LLILLJJLI.J8();
        if (C500260Jjc.LJJIJLIJ()) {
            Boolean bool = (Boolean) dataChannel.gg0(BoardsPermissionChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            ArrayList arrayList = new ArrayList();
            if (zBooleanValue) {
                arrayList.add(EnumC1815680xLi.GENERAL);
            }
            if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                arrayList.add(EnumC1815680xLi.MULTI_GUEST);
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        if (!z || !zJ8 || (c758470Tp7LIZ = C758510TpB.LIZ()) == null) {
            return false;
        }
        return c758470Tp7LIZ.LIZ;
    }

    public static final void LIZLLL(String str) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = LLILLJJLI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            if (C758370Tox.LIZ() && C758370Tox.LIZJ()) {
                C758370Tox.LIZIZ(dataChannel, new C0TMO(str));
            } else {
                C0TND.LIZ(LiveBoardsPageDialogFragment.LLJILJILJ, str, null, dataChannel, null, null, 24).show(fragmentManager, "LiveBoardsPageDialogFragment");
            }
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Object obj;
        Map<String, Object> mapLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "playbook_request_data")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            Object obj2 = null;
            if (interfaceC1107590evd != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null) {
                mapLIZ.get("page_data");
                obj = mapLIZ.get("page_status");
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                obj2 = obj;
            }
            if (!Intrinsics.LJFF(obj2, Boolean.TRUE) && Intrinsics.LJFF(obj2, Boolean.FALSE)) {
                LIZ();
            }
        }
    }

    public final void LIZJ(DataChannel dataChannel, String str, Map<String, String> map) {
        boolean z;
        DataChannel dataChannel2;
        FragmentManager fragmentManager;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        LLILLJJLI = dataChannel;
        LLILLL = map;
        if (dataChannel.gg0(RoomChannel.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean zJ8 = InteractServiceDel.LLILLJJLI.J8();
        DataChannel dataChannel3 = LLILLJJLI;
        if (dataChannel3 != null) {
            final Map<String, String> map2 = LLILLL;
            dataChannel3.zW(BoardsPageActionChannel.class, new AbstractC758530TpD(map2) { // from class: X.0TpE
            });
        }
        DataChannel dataChannel4 = LLILLJJLI;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(BoardsPageDialogActionChannel.class, this, new C758460Tp6());
        }
        if (C500260Jjc.LJJIJLIJ()) {
            if (!MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                Context contextLJII = C497740JfY.LJII();
                if (contextLJII != null) {
                    C20337914i1<Boolean> c20337914i1 = C0KPJ.gf;
                    if (Intrinsics.LJFF(c20337914i1.LIZIZ(), Boolean.TRUE)) {
                        c20337914i1.LJFF(Boolean.FALSE);
                        C1548820qPI.LIZLLL("playbook_request_data", this);
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLJII, UriProtector.parse(LiveSubscriptionAnchorUrlSetting.boardIntro()).buildUpon().appendQueryParameter("show_entrance", str).build());
                        return;
                    }
                    LIZLLL(str);
                    return;
                }
                return;
            }
            LIZLLL(str);
            return;
        }
        if (!z || !zJ8 || (dataChannel2 = LLILLJJLI) == null || (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) == null) {
            return;
        }
        if (C758370Tox.LIZ() && C758370Tox.LIZJ()) {
            C758370Tox.LIZIZ(dataChannel2, new C0TMN(str));
        } else {
            C0TND.LIZ(LiveBoardsPageDialogFragment.LLJILJILJ, str, String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2)), dataChannel2, null, null, 24).show(fragmentManager, "LiveBoardsPageDialogFragment");
        }
    }
}
