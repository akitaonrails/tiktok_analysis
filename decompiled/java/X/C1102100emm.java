package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSlowFunctionOptABSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNotifyLogRemoveAutoTerminateSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0emm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102100emm {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C474500IjA r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, X.C1097740efk r6, X.InterfaceC1102110emn r7) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102100emm.LIZ(X.0IjA, com.bytedance.ies.sdk.datachannel.DataChannel, X.0efk, X.0emn):void");
    }

    public static void LIZIZ(DataChannel dataChannel, C1097740efk c1097740efk, InterfaceC1102110emn interfaceC1102110emn, Map map) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_component_avoid");
        LIZ(c474500IjALIZ, dataChannel, c1097740efk, interfaceC1102110emn);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(interfaceC1102110emn.LJIIIIZZ(), "avoid_info");
        c474500IjALIZ.LJJII(interfaceC1102110emn.LJIILIIL(), "avoid_target");
        Integer numLJIIIZ = interfaceC1102110emn.LJIIIZ();
        if (numLJIIIZ != null) {
            if (numLJIIIZ.intValue() == 0) {
                str = Scene.SCENE_SERVICE;
            } else {
                str = "component";
            }
            c474500IjALIZ.LJJII(str, "avoid_type");
        }
        String strLJII = interfaceC1102110emn.LJII();
        if (strLJII != null) {
            c474500IjALIZ.LJJII(strLJII, "avoid_reason");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LJIJ()), "avoid_count");
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LIZ()), "active_count");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJFF()), "active_duration_ms");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(DataChannel dataChannel, C1097740efk c1097740efk, InterfaceC1102110emn interfaceC1102110emn, Map map) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_component_show");
        LIZ(c474500IjALIZ, dataChannel, c1097740efk, interfaceC1102110emn);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LJIJ()), "avoid_count");
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LIZ()), "active_count");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJIJJ()), "avoid_duration_ms");
        if (interfaceC1102110emn.LJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_avoid_recovery");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(DataChannel dataChannel, C1097740efk c1097740efk, InterfaceC1102110emn interfaceC1102110emn, String str, Set set, Map map) {
        if (LiveNotifyLogRemoveAutoTerminateSetting.enable() && Intrinsics.LJFF(str, C0KAJ.AUTO_TERMINATE.getKey())) {
            return;
        }
        if (AnchorSlowFunctionOptABSetting.INSTANCE.enable() && C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1097860efw(dataChannel, c1097740efk, interfaceC1102110emn, str, set, map, null), 3);
        } else {
            LJ(dataChannel, c1097740efk, interfaceC1102110emn, str, set, map);
        }
    }

    public static void LJ(DataChannel dataChannel, C1097740efk c1097740efk, InterfaceC1102110emn interfaceC1102110emn, String str, Set set, Map map) {
        String strLJJLIIIJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_component_consumed");
        LIZ(c474500IjALIZ, dataChannel, c1097740efk, interfaceC1102110emn);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(str, "consume_method");
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LJIJ()), "avoid_count");
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LIZ()), "active_count");
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LJIL()), "recover_count");
        c474500IjALIZ.LJJII(Integer.valueOf(interfaceC1102110emn.LJIJJLI()), "route_count");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJIIJ()), "total_avoid_duration_ms");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJIILJJIL()), "total_active_duration_ms");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJIJJ()), "avoid_duration_ms");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJJ()), "issue_receive_duration_ms");
        c474500IjALIZ.LJJII(Long.valueOf(interfaceC1102110emn.LJIILLIIL()), "receive_ready_duration_ms");
        if (set != null && !set.isEmpty()) {
            if (set != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            c474500IjALIZ.LJJII(strLJJLIIIJ, "control_reason");
        }
        c474500IjALIZ.LIZ();
    }
}
