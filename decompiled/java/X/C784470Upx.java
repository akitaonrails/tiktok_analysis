package X;

import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.widget.pipguide.PipGuideConfigApi;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.livesetting.other.LiveShowWebChargePipGuideDialogSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0Upx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784470Upx {
    public final DataChannel LIZ;
    public final InterfaceC1077620e9I LIZIZ;
    public final Activity LIZJ;
    public final Handler LIZLLL;
    public boolean LJFF;
    public int LJI;
    public C11JF LJIIIIZZ;
    public final C01GW LJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 804));
    public int LJII = 1;

    public final void LIZJ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mini_window_pop_up_show");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJI), "is_new_popup");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJII), "popup_count");
        c474500IjALIZ.LIZ();
    }

    public final void LJ() {
        DataChannel dataChannel;
        User owner;
        if (this.LJFF || (dataChannel = this.LIZ) == null) {
            return;
        }
        Object objGg0 = dataChannel.gg0(C749320TaM.class);
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(objGg0, bool) || this.LJ.getValue() == null) {
            return;
        }
        Room room = (Room) this.LJ.getValue();
        if (room == null || room.getOwner() == null) {
            return;
        }
        Room room2 = (Room) this.LJ.getValue();
        if (((room2 == null || (owner = room2.getOwner()) == null) ? null : Integer.valueOf(owner.getSecret())) != 1) {
            InterfaceC1077620e9I interfaceC1077620e9I = this.LIZIZ;
            if (interfaceC1077620e9I != null) {
                Room room3 = (Room) this.LJ.getValue();
                if (interfaceC1077620e9I.LIZ(room3 != null ? Long.valueOf(room3.getId()) : null)) {
                    return;
                }
            }
            if (Intrinsics.LJFF(this.LIZ.gg0(FullScreenSurveyShowing.class), bool)) {
                return;
            }
            if (!LiveShowWebChargePipGuideDialogSetting.getValue()) {
                LJFF();
                return;
            }
            if (!C464170IId.LIZ().LJIIIZ() || C469950Ibp.LIZJ() >= 3) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Double dLIZ = InterfaceC1106030et7.h5.LIZ();
            if (jCurrentTimeMillis - (dLIZ != null ? (long) dLIZ.doubleValue() : 0L) > 86400000) {
                new C469950Ibp();
                if (C469950Ibp.LIZJ() != 0) {
                    C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS112S0100000_12(this, 320));
                    return;
                }
                AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 909);
                C480460Ism.LIZ().getClass();
                this.LJIIIIZZ = (C11JF) ((PipGuideConfigApi) C480460Ism.LIZLLL(PipGuideConfigApi.class)).getPipConfig().LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(awS591S0100000_12, 186), new C516201zk(awS591S0100000_12, 180));
            }
        }
    }

    public final void LJFF() {
        C469950Ibp c469950IbpLIZ = C464170IId.LIZ();
        c469950IbpLIZ.getClass();
        if (InterfaceC1106030et7.d5.LIZIZ().booleanValue() || !c469950IbpLIZ.LJIIIZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS112S0100000_12(this, 319));
    }

    public final void LIZ(Function0<Unit> function0) {
        Activity activity = this.LIZJ;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        Room room = (Room) this.LJ.getValue();
        if (room != null && room.isVariantCard()) {
            return;
        }
        function0.invoke();
    }

    public final void LIZIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mini_window_pop_up_click");
        c474500IjALIZ.LJJII(str, "click_icon");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJI), "is_new_popup");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJII), "popup_count");
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL(DialogInterface dialogInterface) {
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.c5;
        Boolean bool = Boolean.TRUE;
        c20337914i1.LJFF(bool);
        InterfaceC1106030et7.e5.LJFF(bool);
        if (!C472950Igf.LIZLLL()) {
            Activity activity = this.LIZJ;
            if (Build.VERSION.SDK_INT >= 28) {
                C0W78.LJIIIIZZ(activity, "android.settings.PICTURE_IN_PICTURE_SETTINGS");
            } else {
                C0W78.LJII(activity);
            }
        }
        LIZIZ("allow");
        dialogInterface.dismiss();
    }

    public C784470Upx(DataChannel dataChannel, InterfaceC1077620e9I interfaceC1077620e9I, C19EG c19eg, WeakHandler weakHandler) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC1077620e9I;
        this.LIZJ = c19eg;
        this.LIZLLL = weakHandler;
    }
}
