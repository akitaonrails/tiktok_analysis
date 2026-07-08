package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.replay.LiveReplayRemuxApi;
import com.bytedance.android.livesdk.replay.LiveReplayTranscodeApi;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0112, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0112 {
    public static final AnonymousClass0112 LIZ = new AnonymousClass0112();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(224));
    public static boolean LIZJ;

    public static void LIZIZ(Integer num, String str, Function1 function1) {
        C480460Ism.LIZ().getClass();
        LiveReplayRemuxApi liveReplayRemuxApi = (LiveReplayRemuxApi) C480460Ism.LIZLLL(LiveReplayRemuxApi.class);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null) {
            liveReplayRemuxApi.remuxLiveReplayVideo(lLJIILIIL.longValue()).LJIILIIL(new C0UO0()).LJJLL(new C516601zo(num, str, function1, 2), new C516201zk(function1, 113));
        }
    }

    public static void LIZ(final Activity activity, final String str, final String str2, final Function1 function1) {
        String[] strArr;
        if (a0.LJJJIL(str)) {
            function1.invoke(0);
        }
        if (activity == null) {
            function1.invoke(0);
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
        }
        new C0UT9(activity, TokenCert.Companion.with("bpea-remux_live_replay_video_method")).LIZ(new C142V() { // from class: X.0Jad
            @Override // X.C142V
            public final /* synthetic */ void LIZIZ(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LIZLLL(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LJ(String str3, String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LJFF(String... strArr2) {
            }

            @Override // X.C142V
            public final void LIZ(String... strArr2) {
                function1.invoke(2);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_photo_library_permission_cancel");
                c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "anchor_id");
                c474500IjALIZ.LJJII(str, "room_id");
                c474500IjALIZ.LJJII(1, "is_first_request");
                c474500IjALIZ.LIZ();
            }

            @Override // X.C142V
            public final void LIZJ(String... strArr2) {
                AnonymousClass0112 anonymousClass0112 = AnonymousClass0112.LIZ;
                Activity activity2 = activity;
                final Function1<Integer, Unit> function12 = function1;
                final String str3 = str;
                String str4 = str2;
                anonymousClass0112.getClass();
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        if (C804420Vh2.LJI(activity2)) {
                            ((HashSet) AnonymousClass0112.LIZIZ.getValue()).remove(str3);
                            function12.invoke(1);
                            return;
                        }
                        C782110Um9 c782110Um9 = new C782110Um9(activity2);
                        c782110Um9.LJIILLIIL = false;
                        c782110Um9.LJIILL = false;
                        c782110Um9.LJIIZILJ(2131842554);
                        c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131842553, str4));
                        C494720Jag c494720Jag = new C494720Jag();
                        C755620TkW c755620TkW = new C755620TkW();
                        c755620TkW.LIZ = C497740JfY.LJIJI(2131842551);
                        c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.010u
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                AnonymousClass0112.LIZ.getClass();
                                ((HashSet) AnonymousClass0112.LIZIZ.getValue()).add(str3);
                                liveDialog.dismiss();
                                function12.invoke(1);
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_replay_mobile_download_popup_click");
                                c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "anchor_id");
                                c474500IjALIZ.LJJII(str3, "room_id");
                                c474500IjALIZ.LJJII(1, "click_btn");
                                c474500IjALIZ.LIZ();
                            }
                        };
                        c494720Jag.LIZ(new C0TZ2(c755620TkW));
                        C755630TkX c755630TkX = new C755630TkX();
                        c755630TkX.LIZ = C497740JfY.LJIJI(2131842552);
                        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.010t
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                                function12.invoke(3);
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_replay_mobile_download_popup_click");
                                c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "anchor_id");
                                c474500IjALIZ.LJJII(str3, "room_id");
                                c474500IjALIZ.LJJII(0, "click_btn");
                                c474500IjALIZ.LIZ();
                            }
                        };
                        c494720Jag.LIZ(new C0TZ3(c755630TkX));
                        c494720Jag.LIZIZ = 2;
                        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                        C786410Ut5.E4(c782110Um9.LIZ());
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_replay_mobile_download_popup_show");
                        c474500IjALIZ.LJJII(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(str3, "room_id");
                        c474500IjALIZ.LIZ();
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                function12.invoke(0);
            }
        }, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static void LIZJ(int i, Integer num, String str, Function1 function1) {
        LIZJ = C804420Vh2.LJI(C497740JfY.LJII());
        C480460Ism.LIZ().getClass();
        LiveReplayTranscodeApi liveReplayTranscodeApi = (LiveReplayTranscodeApi) C480460Ism.LIZLLL(LiveReplayTranscodeApi.class);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        if (lLJIILIIL != null) {
            liveReplayTranscodeApi.transcodeLiveReplayVideo(lLJIILIIL.longValue(), i).LJIILIIL(new C0UO0()).LJJLL(new C516601zo(num, str, function1, 3), new C516201zk(function1, 114));
        }
    }
}
