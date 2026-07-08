package X;

import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081590eFh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0azk] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    public static final void LIZ(DataChannel dataChannel, ConstraintProperty constraintProperty, C1081600eFi c1081600eFi, C956380azk c956380azk) {
        boolean z;
        boolean z2;
        Object objGg0 = c1081600eFi;
        if (c1081600eFi == null) {
            objGg0 = dataChannel.gg0(MultiLiveRTCLayoutChannel.class);
        }
        if (c956380azk == 0) {
            c956380azk = dataChannel.gg0(LinkCrossRoomStateChangeEvent.class);
        }
        C1081600eFi c1081600eFi2 = (C1081600eFi) objGg0;
        boolean z3 = true;
        if (c1081600eFi2 != null) {
            z = !c1081600eFi2.LIZ();
        } else {
            z = false;
        }
        C956380azk c956380azk2 = (C956380azk) c956380azk;
        if (c956380azk2 != null) {
            z2 = c956380azk2.LJIIIIZZ;
            if (c956380azk2.LIZJ <= 0) {
            }
            if (z && !z2 && !z3) {
                constraintProperty.connect(3, R.id.hgs, 4, 0);
                constraintProperty.apply();
                return;
            } else {
                constraintProperty.connect(3, R.id.o_c, 3, 0);
                constraintProperty.apply();
            }
        }
        z2 = false;
        z3 = false;
        if (z) {
        }
        constraintProperty.connect(3, R.id.o_c, 3, 0);
        constraintProperty.apply();
    }
}
