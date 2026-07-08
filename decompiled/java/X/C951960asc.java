package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostUserManagementPanelSchemaSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0asc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951960asc {
    public static SparkContext LIZ;

    public static void LIZJ() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext = LIZ;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        LIZ = null;
    }

    public static boolean LIZIZ() {
        boolean zAl1 = C915980Zwa.LIZ().Al1();
        boolean zJ8 = C915980Zwa.LIZLLL().J8();
        boolean zLJ = C1533950q1J.LJ(C915980Zwa.LJII().LLJJ());
        boolean z = C955010axX.LJIIJJI;
        boolean zQS0 = C915980Zwa.LJFF().QS0();
        if (zAl1 || zLJ) {
            return false;
        }
        if (C955020axY.LIZIZ()) {
            C20441214yg.LJIIIZ("MultiCoHostUserMgmtPanel", "canOpen=false — quick-cohost preference search UI active");
            return false;
        }
        if (!zJ8) {
            return false;
        }
        if (C915980Zwa.LJFF().co0()) {
            z = zQS0;
        }
        return z;
    }

    public static void LIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
        } else if (layoutParams instanceof C16G1) {
            ((C16G1) layoutParams).LIZJ = 80;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = C497740JfY.LJIIZILJ();
        layoutParams2.height = (int) C497740JfY.LIZIZ(234.0f);
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
        }
        C786410Ut5.W5(view, layoutParams2);
        view.requestLayout();
    }

    public static View LIZLLL(View view) {
        Object c098200Yq;
        ViewGroup viewGroup;
        if (view.getId() != -1) {
            try {
                c098200Yq = view.getResources().getResourceEntryName(view.getId());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (Intrinsics.LJFF(c098200Yq, "popup_container")) {
                return view;
            }
        }
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewLIZLLL = LIZLLL(viewGroup.getChildAt(i));
            if (viewLIZLLL != null) {
                return viewLIZLLL;
            }
        }
        return null;
    }

    public static void LJI(String str, String str2, boolean z) throws JSONException {
        SparkContext sparkContext = LIZ;
        if (sparkContext == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", str);
        jSONObject.put("media_type", str2);
        jSONObject.put("is_on", z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMediaUpdateEvent: userId=");
        sbLIZ.append(str);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(str2);
        sbLIZ.append(", isOn=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("MultiCoHostUserMgmtPanel", C2188811AlT.LIZIZ(sbLIZ));
        sparkContext.LJJIIJZLJL(jSONObject, "live_cohost_user_media_update");
    }

    public static boolean LJ(Context context, C954460awe c954460awe, boolean z, boolean z2) {
        if (c954460awe == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open cohost userId=");
        sbLIZ.append(c954460awe.LJ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(c954460awe.LJIJJLI);
        sbLIZ.append(", isCurrentUser=");
        sbLIZ.append(c954460awe.LJI());
        C20441214yg.LJIIIZ("MultiCoHostUserMgmtPanel", C2188811AlT.LIZIZ(sbLIZ));
        return LJFF(context, z, z2, new AwS594S0100000_15(c954460awe, 999));
    }

    public static boolean LJFF(Context context, boolean z, boolean z2, Function1 function1) {
        long ownerUserId;
        long j;
        Object obj;
        int i;
        SparkContext sparkContextYC1;
        try {
            String value = LiveCoHostUserManagementPanelSchemaSetting.INSTANCE.getValue();
            if (value == null || value.length() == 0) {
                return false;
            }
            IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room roomLJJLI = C500260Jjc.LJJLI();
            if (roomLJJLI != null) {
                ownerUserId = roomLJJLI.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            C954460awe c954460aweLLILL = iMultiHostServiceLJII.LLILL(ownerUserId);
            if (c954460aweLLILL != null) {
                j = c954460aweLLILL.LJFF;
            } else {
                j = 0;
            }
            HashMap map = new HashMap();
            map.put("roomId", String.valueOf(j));
            String str = "1";
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("muteAudio", obj);
            if (z2) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("videoSwitchOn", str);
            function1.invoke(map);
            long channelId = C915980Zwa.LIZLLL().getChannelId();
            if (channelId != 0) {
                map.put("channelId", String.valueOf(channelId));
            }
            map.put("currentConnectionCnts", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
            map.put("bothGuestCnt", String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size()));
            map.put("guestCnt", String.valueOf(C915980Zwa.LIZLLL().getGuestCount()));
            if (C915980Zwa.LJFF().co0()) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("isBattleProcessing", Integer.valueOf(i));
            map.put("pkId", String.valueOf(C915980Zwa.LIZLLL().getBattleId()));
            long jFf = C915980Zwa.LJII().ff();
            String strLJLJJL = C915980Zwa.LJII().LJLJJL();
            if (jFf > 0 && strLJLJJL != null) {
                map.put("enlargedUserId", String.valueOf(jFf));
                map.put("enlargedUserType", strLJLJJL);
            }
            int iLJJI = (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(value);
            EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
            c760370TsBLIZ.LJIIIZ(234, enumC760350Ts9);
            c760370TsBLIZ.LJJ(iLJJI, enumC760350Ts9);
            c760370TsBLIZ.LJIJI(26, enumC760350Ts9);
            c760370TsBLIZ.LJIIIIZZ("bottom");
            Uri uriLIZ = c760370TsBLIZ.LIZ();
            LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openPanel globalProps: userId=");
            sbLIZ.append(map.get("userId"));
            sbLIZ.append(", followStatus=");
            sbLIZ.append(map.get("followStatus"));
            sbLIZ.append(", userRole=");
            sbLIZ.append(map.get("userRole"));
            sbLIZ.append(", muteAudio=");
            sbLIZ.append(map.get("muteAudio"));
            sbLIZ.append(", videoSwitchOn=");
            sbLIZ.append(map.get("videoSwitchOn"));
            C20441214yg.LJIIIZ("MultiCoHostUserMgmtPanel", C2188811AlT.LIZIZ(sbLIZ));
            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
            if (iHybridContainerService != null) {
                sparkContextYC1 = iHybridContainerService.YC1(context, uriLIZ.toString(), new AwS594S0100000_15(map, (HashMap<String, Object>) LSPassThroughRecordSizeConfig.DEFAULT));
            } else {
                sparkContextYC1 = null;
            }
            LIZ = sparkContextYC1;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
