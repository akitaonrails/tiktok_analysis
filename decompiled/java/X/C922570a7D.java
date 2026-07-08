package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.tool.helper.ViewerLimitViolation;
import com.bytedance.android.livesdk.dataChannel.LimitRoomVisibilityData;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922570a7D {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            return Intrinsics.LJFF(dataChannel.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE);
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Long l;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (currentUserId == 0 || dataChannel == null || (l = (Long) dataChannel.gg0(ViewerLimitViolation.class)) == null || l.longValue() != currentUserId) {
            return false;
        }
        return true;
    }

    public static void LIZJ(DataChannel dataChannel, Function1 function1) {
        boolean zLIZ = LIZ(dataChannel);
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onViewerLimitCommonProcess] isViewerLimit=");
        sbLIZ.append(zLIZ);
        sbLIZ.append(", handler=");
        sbLIZ.append(function1.getClass().getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("ViewerLimit", strLIZIZ, null, null);
        function1.invoke(Boolean.valueOf(zLIZ));
    }

    public static int LJ(DataChannel dataChannel, PerceptionMessage perceptionMessage) {
        PunishEventInfo punishEventInfo;
        Integer num;
        int i = 0;
        if (perceptionMessage != null && (punishEventInfo = perceptionMessage.publicEventInfo) != null && (num = punishEventInfo.punishTypeId) != null && num.intValue() == 70) {
            PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
            if (perceptionDialogInfo != null && perceptionDialogInfo.scene == 21) {
                i = 1;
            }
            long j = 0;
            if (i == 0) {
                if (dataChannel != null) {
                    dataChannel.LC0(LimitRoomVisibilityData.class, Boolean.FALSE);
                    PunishEventInfo punishEventInfo2 = perceptionMessage.publicEventInfo;
                    if (punishEventInfo2 != null) {
                        j = punishEventInfo2.violationUid;
                    }
                    dataChannel.zW(ViewerLimitViolation.class, Long.valueOf(j));
                    dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.TRUE);
                }
                i = 1;
            } else {
                if (dataChannel != null) {
                    dataChannel.LC0(LimitRoomVisibilityData.class, Boolean.TRUE);
                    dataChannel.zW(ViewerLimitViolation.class, 0L);
                    dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.FALSE);
                }
                i = 2;
            }
        }
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onViewerLimitTrigger] res=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("ViewerLimit", strLIZIZ, null, null);
        return i;
    }

    public static void LIZLLL(boolean z, long j, PerceptionMessage perceptionMessage, Context context, LifecycleOwner lifecycleOwner, InterfaceC777420Uea interfaceC777420Uea, Function2 function2, Function2 function22) {
        boolean z2;
        boolean z3;
        PerceptionDialogInfo perceptionDialogInfo;
        PunishEventInfo punishEventInfo;
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onViewerLimitDialogProcess] context=");
        boolean z4 = true;
        if (context != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", lifecycle=");
        if (lifecycleOwner != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("ViewerLimit", strLIZIZ, null, null);
        if (context == null || lifecycleOwner == null) {
            return;
        }
        if (j == 0 || (punishEventInfo = perceptionMessage.publicEventInfo) == null || punishEventInfo.violationUid != j) {
            z4 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[onViewerLimitDialogProcess] isAnchor=");
        sbLIZ2.append(z);
        sbLIZ2.append(", selfViolation=");
        sbLIZ2.append(z4);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c1azw.getClass();
        C1AZW.LIZ("ViewerLimit", strLIZIZ2, null, null);
        if (!z4 && (perceptionDialogInfo = perceptionMessage.dialog) != null) {
            C782130UmB.LIZLLL(perceptionDialogInfo, context, lifecycleOwner, interfaceC777420Uea, function2, function22, new AwS155S0110000_15(perceptionMessage, z, 0), 64);
        }
    }
}
