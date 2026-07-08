package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTemperatureTipSetting;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Uay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775180Uay {
    public C785760Us2 LIZ;
    public PowerManager LIZIZ;
    public C775210Ub1 LIZJ;
    public AnonymousClass0956 LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public String LJII = "";

    public final void LJI() {
        this.LJ = false;
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static String LIZIZ() throws Exception {
        Context topContext;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        Intent intentLJIJJ = null;
        if (iHostAction != null && (topContext = iHostAction.getTopContext()) != null) {
            intentLJIJJ = C786410Ut5.LJIJJ(topContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }
        if (intentLJIJJ == null) {
            return "";
        }
        int intExtra = intentLJIJJ.getIntExtra("plugged", -1);
        return intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? intExtra == 8 ? "dock" : "" : "wireless" : "usb" : "ac";
    }

    public static float LIZJ() {
        Context topContext;
        Intent intentLJIJJ;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction == null || (topContext = iHostAction.getTopContext()) == null || (intentLJIJJ = C786410Ut5.LJIJJ(topContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        int intExtra = intentLJIJJ.getIntExtra("level", -1);
        int intExtra2 = intentLJIJJ.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return -1.0f;
        }
        return (intExtra * 1.0f) / intExtra2;
    }

    public final void LIZ() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29) {
            LJI();
            return;
        }
        C775210Ub1 c775210Ub1 = this.LIZJ;
        if (c775210Ub1 != null && (powerManager = this.LIZIZ) != null) {
            powerManager.removeThermalStatusListener(c775210Ub1);
        }
        this.LIZJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0Ub1, android.os.PowerManager$OnThermalStatusChangedListener] */
    public final void LIZLLL() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        AbstractC1387200mCc topRootPage;
        Context topContext;
        String idStr;
        C0JT6<String> c0jt6 = InterfaceC1106030et7.H7;
        String strLIZ = c0jt6.LIZ();
        if (!(strLIZ == null || strLIZ.length() == 0)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZ, new String[]{","}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() != 2) {
                c0jt6.LIZJ("");
                return;
            }
            try {
                long j = CastLongProtector.parseLong((String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL));
                String str = (String) listLJJLIIIJILLIZJL.get(1);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                boolean z = (room == null || (idStr = room.getIdStr()) == null || !idStr.equals(str)) ? false : true;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                int iFrequencyInterval = LiveBroadcastTemperatureTipSetting.INSTANCE.frequencyInterval();
                if (z) {
                    return;
                }
                if (jCurrentTimeMillis <= iFrequencyInterval * C538540LAe.LLJJJIL) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1106030et7.H7.LIZJ("");
                return;
            }
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        anonymousClass0956LIZLLL = null;
        anonymousClass0956LIZLLL = null;
        anonymousClass0956LIZLLL = null;
        if (Build.VERSION.SDK_INT >= 29) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            Object objH2 = (iHostAction == null || (topContext = iHostAction.getTopContext()) == null) ? null : C786410Ut5.H2(topContext, "power");
            PowerManager powerManager = objH2 instanceof PowerManager ? (PowerManager) objH2 : 0;
            this.LIZIZ = powerManager;
            ?? r0 = new PowerManager.OnThermalStatusChangedListener() { // from class: X.0Ub1
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public final void onThermalStatusChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2 && i != 3 && i != 4) {
                                return;
                            }
                            this.LIZ.getClass();
                            if (C775180Uay.LIZJ() < LiveBroadcastTemperatureTipSetting.INSTANCE.batteryThreshold()) {
                                return;
                            }
                            this.LIZ.LJFF();
                            return;
                        }
                        float f = C476230Ilx.LIZ.LJFF;
                        LiveBroadcastTemperatureTipSetting liveBroadcastTemperatureTipSetting = LiveBroadcastTemperatureTipSetting.INSTANCE;
                        if (f < liveBroadcastTemperatureTipSetting.thermalThreshold()) {
                            return;
                        }
                        this.LIZ.getClass();
                        if (C775180Uay.LIZJ() < liveBroadcastTemperatureTipSetting.batteryThreshold()) {
                            return;
                        }
                        this.LIZ.LJFF();
                        return;
                    }
                    if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || !LiveBroadcastTemperatureTipSetting.INSTANCE.localTestQuickShow()) {
                        return;
                    }
                    this.LIZ.LJFF();
                }
            };
            this.LIZJ = r0;
            if (powerManager != 0) {
                powerManager.addThermalStatusListener(r0);
                return;
            }
            return;
        }
        this.LJ = true;
        IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        Fragment fragmentLIZLLL = (iHostAction2 == null || (topRootPage = iHostAction2.getTopRootPage()) == null) ? null : topRootPage.LIZLLL();
        if (LiveBroadcastCpuOptSetting.enableCoroutineOpt()) {
            if (fragmentLIZLLL != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(fragmentLIZLLL)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope2, null, null, new C775190Uaz(this, null), 3);
            }
        } else if (fragmentLIZLLL != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLIZLLL)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C775200Ub0(this, null), 2);
        }
        this.LIZLLL = anonymousClass0956LIZLLL;
    }

    public final void LJFF() {
        RoomMessage roomMessageLJ;
        String idStr;
        User owner;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        long id = room != null ? room.getId() : 0L;
        String strLJIJI = C497740JfY.LJIJI(2131851996);
        LiveBroadcastTemperatureTipSetting liveBroadcastTemperatureTipSetting = LiveBroadcastTemperatureTipSetting.INSTANCE;
        if (liveBroadcastTemperatureTipSetting.prefixEmoji().length() == 0) {
            roomMessageLJ = C181500mr.LJ(id, strLJIJI);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(liveBroadcastTemperatureTipSetting.prefixEmoji());
            sbLIZ.append(' ');
            sbLIZ.append(strLJIJI);
            roomMessageLJ = C181500mr.LJ(id, C2188811AlT.LIZIZ(sbLIZ));
        }
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Jf0(id, roomMessageLJ, true, null);
        this.LJFF = System.currentTimeMillis();
        LIZ();
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 == null || (idStr = room2.getIdStr()) == null) {
            idStr = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(System.currentTimeMillis());
        sbLIZ2.append(',');
        sbLIZ2.append(idStr);
        InterfaceC1106030et7.H7.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        long id2 = (room3 == null || (owner = room3.getOwner()) == null) ? UserService.getInstance().user().getCurrentUser().getId() : owner.getId();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_overheat_notice_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(id2), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJI), "duration_since_start");
        c474500IjALIZ.LJJII(LIZIZ(), "charge_type");
        c474500IjALIZ.LJJII(String.valueOf(C476230Ilx.LIZ.LJFF), "thermal_value");
        c474500IjALIZ.LIZ();
    }

    public final void LJ(boolean z) {
        long id;
        long id2;
        long jCurrentTimeMillis;
        User owner;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null && (owner = room2.getOwner()) != null) {
            id2 = owner.getId();
        } else {
            id2 = UserService.getInstance().user().getCurrentUser().getId();
        }
        if (this.LJFF > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LJFF;
        } else {
            jCurrentTimeMillis = -1;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_charging_status");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(id2), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        int i = 1;
        c474500IjALIZ.LJJII(Integer.valueOf(!z ? 1 : 0), "charge_status");
        c474500IjALIZ.LJJII(String.valueOf(C476230Ilx.LIZ.LJFF), "thermal_value");
        c474500IjALIZ.LJJII(LIZIZ(), "charge_type");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration_since_notice");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJI), "duration_since_start");
        if (jCurrentTimeMillis == -1) {
            i = -1;
        } else if (jCurrentTimeMillis <= 601000) {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_noticed");
        c474500IjALIZ.LIZ();
    }
}
