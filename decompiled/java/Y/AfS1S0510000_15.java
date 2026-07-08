package Y;

import X.C09JN;
import X.C1C7U;
import X.C914590ZuL;
import X.C925610aC7;
import X.C944860ahA;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S0510000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0510000_15 afS1S0510000_15, Object obj) {
        C1C7U.LIZ("ToolbarCoHostBehavior@a5e6.invite$2");
        if (afS1S0510000_15.z5) {
            ((C944860ahA) afS1S0510000_15.l0).LJFF((Room) afS1S0510000_15.l1, (HashMap) afS1S0510000_15.l2, null, (OptPairInfo) afS1S0510000_15.l3);
        } else {
            ((C944860ahA) afS1S0510000_15.l0).LJFF((Room) afS1S0510000_15.l1, (HashMap) afS1S0510000_15.l2, (ReserveInfo) afS1S0510000_15.l4, null);
        }
        C1C7U.LIZIZ("ToolbarCoHostBehavior@a5e6.invite$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS1S0510000_15 afS1S0510000_15, Object obj) {
        Function0 function0;
        C914590ZuL c914590ZuL;
        PerceptionDialogInfo perceptionDialogInfo;
        ViolationStatusResponse.ResponseData responseData;
        ViolationStatusResponse.ResponseData responseData2;
        C1C7U.LIZ("MultiCoHostViolationHelper@f39c.checkViolationStatus$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData2 = (ViolationStatusResponse.ResponseData) baseResponse.data) != null) {
            DataChannel dataChannel = (DataChannel) afS1S0510000_15.l3;
            int i = responseData2.status;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            C925610aC7.LIZLLL(dataChannel, z);
        }
        PunishEventInfo punishEventInfo = null;
        if (afS1S0510000_15.z5) {
            if (baseResponse != null && (responseData = (ViolationStatusResponse.ResponseData) baseResponse.data) != null) {
                perceptionDialogInfo = responseData.perceptionDialog;
            } else {
                perceptionDialogInfo = null;
                if (baseResponse != null) {
                }
                C925610aC7.LJ((Context) afS1S0510000_15.l2, perceptionDialogInfo, punishEventInfo, (Function1) afS1S0510000_15.l0, (Function1) afS1S0510000_15.l1, true, false);
            }
            ViolationStatusResponse.ResponseData responseData3 = (ViolationStatusResponse.ResponseData) baseResponse.data;
            if (responseData3 != null) {
                punishEventInfo = responseData3.punishEvent;
            }
            C925610aC7.LJ((Context) afS1S0510000_15.l2, perceptionDialogInfo, punishEventInfo, (Function1) afS1S0510000_15.l0, (Function1) afS1S0510000_15.l1, true, false);
        }
        DataChannel dataChannel2 = (DataChannel) afS1S0510000_15.l3;
        if ((dataChannel2 == null || (c914590ZuL = (C914590ZuL) dataChannel2.gg0(CoHostPunishPermissionChannel.class)) == null || !c914590ZuL.LIZ) && (function0 = (Function0) afS1S0510000_15.l4) != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("MultiCoHostViolationHelper@f39c.checkViolationStatus$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS1S0510000_15(boolean z, boolean z2, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Context context, DataChannel dataChannel, Function0<Unit> function0) {
        this.$t = function0;
        this.z5 = z;
        this.l0 = z2;
        this.l1 = function1;
        this.l2 = function12;
        this.l3 = context;
        this.l4 = dataChannel;
    }
}
