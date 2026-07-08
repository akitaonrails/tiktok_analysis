package X;

import Y.AfS2S0200100_7;
import Y.AfS3S0100100_7;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubTaskPageInitSetting;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveTitleWidget;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.SuperFansGuideEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS408S0200000_7;

/* JADX INFO: renamed from: X.0KdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521750KdB implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            case 2:
                return handleMessage$2(this, message);
            case 3:
                return handleMessage$3(this, message);
            case 4:
                return handleMessage$4(this, message);
            default:
                return false;
        }
    }

    public C521750KdB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(C521750KdB c521750KdB, Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                C427340GpI c427340GpI = ((ProgrammedLiveTitleWidget) c521750KdB.l0).LLILLJJLI;
                if (c427340GpI != null) {
                    c427340GpI.setSingleLine(false);
                    c427340GpI.setMaxLines(2);
                    c427340GpI.setEllipsize(TextUtils.TruncateAt.END);
                }
                LiveIconView liveIconView = ((ProgrammedLiveTitleWidget) c521750KdB.l0).LLILLL;
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.f97);
                }
            }
        } else {
            C427340GpI c427340GpI2 = ((ProgrammedLiveTitleWidget) c521750KdB.l0).LLILLJJLI;
            if (c427340GpI2 != null) {
                c427340GpI2.LJJJJI();
                return true;
            }
        }
        return true;
    }

    public static final boolean handleMessage$1(C521750KdB c521750KdB, Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ((ProgrammedLiveFollowCardWidget) c521750KdB.l0).A1(C0K9V.SEE_MORE, true, false);
                        }
                    } else {
                        ((ProgrammedLiveFollowCardWidget) c521750KdB.l0).A1(C0K9V.CLICK_FOLLOW, true, false);
                        return true;
                    }
                } else {
                    ((ProgrammedLiveFollowCardWidget) c521750KdB.l0).A1(C0K9V.AUTO, true, false);
                    return true;
                }
            } else {
                ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = (ProgrammedLiveFollowCardWidget) c521750KdB.l0;
                Pair<FollowCardMessage, Boolean> pair = programmedLiveFollowCardWidget.LLJILLL;
                if (pair != null && !pair.getSecond().booleanValue()) {
                    Handler handlerC1 = programmedLiveFollowCardWidget.C1();
                    Message message2 = new Message();
                    message2.what = 0;
                    message2.obj = pair.getFirst();
                    message2.arg1 = 100;
                    Long l = pair.getFirst().maxRandom;
                    long jNextLong = 0;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        if (jLongValue > 0) {
                            jNextLong = AbstractC19994813Le.Default.nextLong(jLongValue);
                        }
                    }
                    C786410Ut5.LJLJLJ(handlerC1, message2, jNextLong);
                    return true;
                }
            }
        } else if (HandlerHook.getMessageObj(message.obj) instanceof FollowCardMessage) {
            AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7((ProgrammedLiveFollowCardWidget) c521750KdB.l0, message, 7);
            ((ProgrammedLiveFollowCardWidget) c521750KdB.l0).getClass();
            if (C916790Zxt.LIZ(8)) {
                awS408S0200000_7.invoke();
                return true;
            }
            C513000K9y c513000K9y = C513000K9y.LIZ;
            ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget2 = (ProgrammedLiveFollowCardWidget) c521750KdB.l0;
            if (c513000K9y.LJII(programmedLiveFollowCardWidget2.LLJJLIIIJLLLLLLLZ, programmedLiveFollowCardWidget2.dataChannel)) {
                awS408S0200000_7.invoke();
                return true;
            }
            ((ProgrammedLiveFollowCardWidget) c521750KdB.l0).A1(C0K9V.CONFLICT_CONTROLLED, true, false);
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$2(C521750KdB c521750KdB, Message message) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        Room room;
        User owner;
        String secUid;
        int i = message.what;
        if (i == 1) {
            FansClubViewModel fansClubViewModel = (FansClubViewModel) c521750KdB.l0;
            fansClubViewModel.getClass();
            if (FansClubTaskPageInitSetting.INSTANCE.getValue() && (dataChannel2 = fansClubViewModel.getDataChannel()) != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C480460Ism.LIZ().getClass();
                ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getTaskInfoWithParameter(secUid).LJFF(new C0UO0()).LJJIIZ(new AfS2S0200100_7(jCurrentTimeMillis, fansClubViewModel, room, 15), new AfS3S0100100_7(jCurrentTimeMillis, room, 17));
            }
        } else if (i == 2) {
            DataChannel dataChannel3 = ((FansClubViewModel) c521750KdB.l0).getDataChannel();
            if (dataChannel3 != null) {
                dataChannel3.LC0(FansClubEvent.class, C1095310ebp.LIZ);
                return true;
            }
        } else if (i == 3 && (dataChannel = ((FansClubViewModel) c521750KdB.l0).getDataChannel()) != null) {
            dataChannel.FQ2(SuperFansGuideEvent.class);
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$3(C521750KdB c521750KdB, Message message) {
        ((C517770KSh) c521750KdB.l0).LL = false;
        return true;
    }

    public static final boolean handleMessage$4(C521750KdB c521750KdB, Message message) {
        C0J40 c0j40 = (C0J40) HandlerHook.getMessageObj(message.obj);
        if (c0j40.LJI == null || c0j40.LIZ == null) {
            return true;
        }
        try {
            if (c0j40.LJ == null) {
                if (c0j40.LIZLLL == 0) {
                    if (c0j40.LJIIIZ) {
                        c0j40.LJ = C786410Ut5.Td(((C0J4A) c521750KdB.l0).LIZ.cloneInContext(new C485820J3k(((C0J4A) c521750KdB.l0).LIZ.getContext())), c0j40.LIZJ, c0j40.LIZIZ, false);
                    } else {
                        c0j40.LJ = C786410Ut5.Td(((C0J4A) c521750KdB.l0).LIZ, c0j40.LIZJ, c0j40.LIZIZ, false);
                    }
                } else {
                    Context context = ((C0J4A) c521750KdB.l0).LIZ.getContext();
                    if (c0j40.LJIIIZ) {
                        context = new C485820J3k(context);
                    }
                    c0j40.LJ = C786410Ut5.Td(((C0J4A) c521750KdB.l0).LIZ.cloneInContext(new ContextThemeWrapper(context, c0j40.LIZLLL)), c0j40.LIZJ, c0j40.LIZIZ, false);
                }
            }
            C0IR4 c0ir4 = c0j40.LJI;
            if (c0ir4 != null) {
                c0ir4.onInflateFinished(c0j40.LJ, c0j40.LIZJ, c0j40.LIZIZ);
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!LayeredElementConfiguration.INSTANCE.getDebug()) {
                LayeredElementConfiguration.reportException("AsyncLayoutInflater", e);
            } else {
                throw e;
            }
        }
        ((C0J4A) c521750KdB.l0).LIZJ.LJ(c0j40);
        return true;
    }
}
