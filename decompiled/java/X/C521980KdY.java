package X;

import Y.ARunnableS107S0100000_7;
import com.bytedance.android.livesdk.broadcast.preview.widget.playbook.PreviewInteractWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521980KdY implements InterfaceC254600ye {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254600ye
    public final void onShow() {
        switch (this.$t) {
            case 0:
                onShow$0(this);
                break;
            case 1:
                onShow$1(this);
                break;
            case 2:
                onShow$2(this);
                break;
            case 3:
                onShow$3(this);
                break;
            case 4:
                onShow$4(this);
                break;
            case 5:
                onShow$5(this);
                break;
        }
    }

    public static final void onShow$0(C521980KdY c521980KdY) {
        ((List) c521980KdY.l0).add(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        C0KPJ.He.LJFF((List) c521980KdY.l0);
    }

    public static final void onShow$1(C521980KdY c521980KdY) {
        C0UKZ.LLJJJJ.LJFF(Boolean.TRUE);
        ((PreviewSettingWidget) c521980KdY.l0).LLJJI = true;
    }

    public static final void onShow$2(C521980KdY c521980KdY) {
        ((PreviewInteractWidget) c521980KdY.l0).LLJI = true;
        C0JGR.v2.LJFF(Boolean.FALSE);
    }

    public static final void onShow$3(C521980KdY c521980KdY) {
        Function0<Unit> function0LIZ;
        try {
            InterfaceC520940Kbs interfaceC520940Kbs = (InterfaceC520940Kbs) c521980KdY.l0;
            if (interfaceC520940Kbs != null && (function0LIZ = interfaceC520940Kbs.LIZ()) != null) {
                function0LIZ.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void onShow$4(C521980KdY c521980KdY) {
        String str;
        C1106110etF c1106110etF = (C1106110etF) c521980KdY.l0;
        c1106110etF.getClass();
        InterfaceC960800b6s.LLLLLIL.LJFF(Boolean.TRUE);
        DataChannel dataChannel = c1106110etF.LLJIJIL;
        Room room = c1106110etF.LLILZIL;
        boolean zLIZ = C01C5.LIZ(dataChannel);
        HashMap map = new HashMap();
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("room_id", room.getIdStr());
        String strValueOf = String.valueOf(room.getOwnerUserId());
        if (strValueOf == null) {
            strValueOf = "";
        }
        map.put("anchor_id", strValueOf);
        if (zLIZ) {
            str = "administrator";
        } else {
            str = "normal";
        }
        map.put("audience_type", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_suggest_creator_popup_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        C20441214yg.LIZIZ("CoHostSuggestionToolTip", "Tooltip shown");
        c1106110etF.LLLII = true;
    }

    public static final void onShow$5(C521980KdY c521980KdY) {
        int iIntValue;
        ((C498820JhI) c521980KdY.l0).LJFF = true;
        DataChannelGlobal.LLILZ.JQ2(C952020asi.class, Boolean.TRUE);
        InterfaceC1106030et7.i5.LIZJ(Double.valueOf(System.currentTimeMillis()));
        C0JT6<Integer> c0jt6 = InterfaceC1106030et7.j5;
        Integer numLIZ = c0jt6.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        c0jt6.LIZJ(Integer.valueOf(iIntValue + 1));
        C498820JhI c498820JhI = (C498820JhI) c521980KdY.l0;
        C786410Ut5.LJLIIL(C498820JhI.LJIIJJI, c498820JhI.LJI, new ARunnableS107S0100000_7(c498820JhI, 214));
    }

    public C521980KdY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
