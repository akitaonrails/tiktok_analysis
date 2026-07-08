package X;

import Y.ARunnableS12S0000100_12;
import android.os.SystemClock;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeLaunchBroadcastOptSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0URd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C772270URd extends C2217421BqW implements Function1<Room, Unit> {
    public C772270URd(Object obj) {
        super(1, obj, C772260URc.class, "jumpToLive", "jumpToLive(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Room room) throws Throwable {
        long jElapsedRealtime;
        C772290URf c772290URfLJI;
        InterfaceC20622815ms interfaceC20622815msLIZ;
        Room room2 = room;
        C772260URc c772260URc = (C772260URc) this.receiver;
        C500260Jjc.LJJLIIIJL(c772260URc.LLILZ);
        C486790J7d.LIZ(new ARunnableS12S0000100_12(System.currentTimeMillis(), 3));
        Creator creator = room2.creator;
        if (creator != null && creator.roomContinue == 0) {
            C772780UTc.LJ(LiveMode.VIDEO, c772260URc.LL, Long.valueOf(room2.getId()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_practice_stay");
        if (C0UQK.LIZ > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - C0UQK.LIZ;
        } else {
            jElapsedRealtime = -1;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "stay_duration");
        c474500IjALIZ.LJJII("go_live", "quit_type");
        c474500IjALIZ.LJJII(c772260URc.LLIZLLLIL, "leave_from");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930990aKn.class), "has_enter_trymode");
        c474500IjALIZ.LJJII(c772260URc.LLIZLLLIL, "leave_from");
        if (Intrinsics.LJFF(c772260URc.LLIZLLLIL, "countdown_end")) {
            c474500IjALIZ.LJJII(c772260URc.LLJI, "countdown_type");
            c474500IjALIZ.LJJII(Integer.valueOf(c772260URc.LLJIJIL), "countdown_window");
        }
        c474500IjALIZ.LIZ();
        Boolean bool = Boolean.TRUE;
        dataChannelGlobal.JQ2(C931470aLZ.class, new Pair(bool, Long.valueOf(room2.getId())));
        dataChannelGlobal.JQ2(C951930asZ.class, 3);
        dataChannelGlobal.JQ2(C1148130fz1.class, Long.valueOf(System.currentTimeMillis()));
        C0UQX.LJIIJJI(room2, LiveMode.VIDEO, c772260URc.LL, 0, true, c772260URc.LLIZLLLIL, c772260URc.LLJ, c772260URc.LLJI, c772260URc.LLJIJIL);
        dataChannelGlobal.JQ2(C930940aKi.class, room2);
        C0UWG.LIZIZ(c772260URc.LLILLJJLI);
        C1276890jKh.LIZLLL();
        if (LiveTryModeLaunchBroadcastOptSetting.INSTANCE.enable() || ((c772290URfLJI = C0UF5.LJI()) != null && c772290URfLJI.LIZ)) {
            c772260URc.LIZJ();
        } else {
            C776270Ucj.LIZ.getClass();
            if (C776270Ucj.LJIL(room2)) {
                c772260URc.LL.zW(TryModeGoLiveChannel.class, bool);
                if (C504210Jpz.LIZ && (interfaceC20622815msLIZ = C520010KaN.LIZ(C1388190mED.LIZIZ(c772260URc.LLILLJJLI))) != null) {
                    C520010KaN.LJIILLIIL(interfaceC20622815msLIZ);
                }
            } else {
                C772290URf c772290URfLJI2 = C0UF5.LJI();
                if (c772290URfLJI2 != null) {
                    c772290URfLJI2.LIZ = true;
                }
                c772260URc.LIZJ();
            }
        }
        return Unit.LIZ;
    }
}
