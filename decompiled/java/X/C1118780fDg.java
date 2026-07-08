package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118780fDg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1126540fQC c1126540fQC, Context context, ImageModel imageModel, InterfaceC1631620sYq interfaceC1631620sYq, Function2 function2) {
        C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(context);
        c1322000kVSLJFF.LJFF = imageModel;
        c1322000kVSLJFF.LIZLLL = new C1151980g5E(function2, interfaceC1631620sYq, 0);
        c1322000kVSLJFF.LIZJ(c1126540fQC);
    }

    public static void LIZIZ(C1118840fDm c1118840fDm, int i, int i2, int i3, boolean z) {
        String strValueOf;
        String str;
        Long lValueOf;
        Object obj;
        Object obj2;
        long jLongValue;
        HashMap map = new HashMap();
        map.put("downgrade_status", String.valueOf(c1118840fDm.LIZ.LJIILIIL));
        map.put("error_code", String.valueOf(i));
        map.put("trail_effect_status", String.valueOf(i2));
        map.put("mic_effect_status", String.valueOf(i3));
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (i3 == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c1118840fDm.LIZLLL;
            Long l = c1118840fDm.LIZ.LJIIL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            strValueOf = String.valueOf(jCurrentTimeMillis + jLongValue);
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("mic_effect_delay", strValueOf);
        int i4 = c1118840fDm.LIZ.LIZIZ;
        if (i4 == 3) {
            str = "1";
        } else if (i4 != 4) {
            str = "-1";
        } else {
            str = "2";
        }
        map.put("fly_mic_gift_type", str);
        map.put("gift_id", String.valueOf(c1118840fDm.LIZ.LIZ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        map.put("anchor_id", String.valueOf(lValueOf));
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (c1118840fDm.LIZ.LIZLLL == UserService.getInstance().user().getCurrentUserId()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_own_send", obj);
        String strValueOf2 = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        }
        if (Intrinsics.LJFF(strValueOf2, String.valueOf(lValueOf2))) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", obj2);
        if (z) {
            str2 = "1";
        }
        map.put("is_guest", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fly_mic_gift_effect");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
