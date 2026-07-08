package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19671211xm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_nearby_devices_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII("multi_guest", "toast_type");
        c474500IjALIZ.LJJII(str, "btn_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(final Activity activity, final DataChannel dataChannel, Function0 function0) {
        if (Build.VERSION.SDK_INT >= 31 && !C202002142e.LIZJ(activity, "android.permission.BLUETOOTH_CONNECT")) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.w5;
            if (c20337914i1.LIZIZ().intValue() < 2) {
                boolean zLIZLLL = C202002142e.LIZLLL(activity, "android.permission.BLUETOOTH_CONNECT");
                if (InterfaceC1106030et7.v5.LIZIZ().booleanValue() || zLIZLLL) {
                    c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                    AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(dataChannel, (DataChannel) function0, (Function0<Unit>) 134);
                    final AwS430S0200000_29 awS430S0200000_292 = new AwS430S0200000_29(dataChannel, (DataChannel) function0, (Function0<Unit>) 133);
                    if (C202002142e.LIZIZ(activity, "android.permission.BLUETOOTH_CONNECT").length == 0) {
                        awS430S0200000_29.invoke();
                        return;
                    }
                    C19514511Wl c19514511WlLIZ = C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-bluetooth_connect_when_multiguest")).LIZ(new AbstractC19515011Wq() { // from class: X.11gI
                        @Override // X.AbstractC19515011Wq
                        public final void LIZ(final C19514611Wm c19514611Wm, String... strArr) {
                            Activity activity2 = activity;
                            String strLJIJI = C497740JfY.LJIJI(2131841037);
                            String strLJIJI2 = C497740JfY.LJIJI(2131841036);
                            String strLJIJI3 = C497740JfY.LJIJI(2131841035);
                            String strLJIJI4 = C497740JfY.LJIJI(2131841034);
                            final Function0<Unit> function02 = awS430S0200000_292;
                            InterfaceC784910Uqf interfaceC784910Uqf = new InterfaceC784910Uqf() { // from class: X.11Ww
                                @Override // X.InterfaceC784910Uqf
                                public final void cancel() {
                                    C19514611Wm c19514611Wm2 = c19514611Wm;
                                    if (c19514611Wm2 != null) {
                                        c19514611Wm2.LIZIZ();
                                    }
                                    function02.invoke();
                                }

                                @Override // X.InterfaceC784910Uqf
                                public final void execute() {
                                    C19514611Wm c19514611Wm2 = c19514611Wm;
                                    if (c19514611Wm2 != null) {
                                        c19514611Wm2.LIZJ();
                                    }
                                }
                            };
                            C19GO c19go = new C19GO(activity2);
                            c19go.LIZLLL = strLJIJI;
                            c19go.LJII = strLJIJI2;
                            c19go.LJFF(new C12YK(interfaceC784910Uqf, 7), strLJIJI3, false);
                            c19go.LIZLLL(new DialogInterface.OnClickListener() { // from class: X.0fDG
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            }, strLJIJI4, false);
                            c19go.LJJIJ = new DialogInterface.OnKeyListener() { // from class: X.0fDF
                                @Override // android.content.DialogInterface.OnKeyListener
                                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                    if (i == 4) {
                                        if (keyEvent.getAction() == 1) {
                                            dialogInterface.cancel();
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                            };
                            c19go.LJJIIJ = false;
                            c19go.LJJIJIIJI = new C12YJ(interfaceC784910Uqf, 5);
                            C786410Ut5.M4(c19go.LIZ());
                            DataChannel dataChannel2 = dataChannel;
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_nearby_devices_popup_show");
                            c474500IjALIZ.LJIJJLI(dataChannel2);
                            c474500IjALIZ.LJJII("video_live", "live_type");
                            c474500IjALIZ.LJJII("multi_guest", "toast_type");
                            c474500IjALIZ.LIZ();
                        }
                    });
                    c19514511WlLIZ.LIZIZ("android.permission.BLUETOOTH_CONNECT");
                    c19514511WlLIZ.LIZJ(new C19774212Yi(awS430S0200000_29, awS430S0200000_292, 1));
                    return;
                }
            }
        }
        function0.invoke();
    }
}
