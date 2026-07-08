package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewFixBackDialogBugSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771970UPz {
    public static final C771970UPz LIZ = new C771970UPz();
    public static C0UQ4 LIZIZ;
    public static C19GN LIZJ;

    public static String LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C198800pe.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return C497740JfY.LJIJI(2131843419);
                            }
                            return null;
                        }
                        return C497740JfY.LJIJI(2131842839);
                    }
                    return C497740JfY.LJIJI(2131852510);
                }
                return C497740JfY.LJIJI(2131842805);
            }
            return C497740JfY.LJIJI(2131841086);
        }
        return null;
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        Object objGg0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_phone_verify_exit");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel == null || (objGg0 = dataChannel.gg0(PreviewTitleChannel.class)) == null) {
            objGg0 = "";
        }
        c474500IjALIZ.LJJII(objGg0, "room_title");
        c474500IjALIZ.LJJII(str, "exit_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        Object objGg0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_phone_verify_success");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel == null || (objGg0 = dataChannel.gg0(PreviewTitleChannel.class)) == null) {
            objGg0 = "";
        }
        c474500IjALIZ.LJJII(objGg0, "room_title");
        c474500IjALIZ.LJJII(str, "verify_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(Context context, final DataChannel dataChannel) {
        if (context == null) {
            return;
        }
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        C19GO c19go = new C19GO(context);
        c19go.LJI(2131855744);
        c19go.LIZIZ(2131855743);
        c19go.LJ(2131844008, new DialogInterfaceOnClickListenerC786020UsS(dataChannel, 12), false);
        c19go.LIZJ(2131844009, new DialogInterfaceOnClickListenerC786020UsS(dataChannel, 13), false);
        c19go.LJJIIJ = false;
        C19GN c19gnLIZ = c19go.LIZ();
        if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
            LIZJ = c19gnLIZ;
        }
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZ(c19gnLIZ, C0URF.MIDDLE, new C0UQ3() { // from class: X.0UQ1
            @Override // X.C0UQ3
            public final void LIZ() {
                C0UQX.LJJ(dataChannel, 2, "show");
            }
        }, null);
    }

    public static void LIZLLL(Context context, final DataChannel dataChannel, final int i) {
        final LiveMode liveMode;
        LiveMode liveMode2;
        CharSequence charSequenceFromHtml;
        if (context == null) {
            return;
        }
        switch (i) {
            case 4003205:
                liveMode = LiveMode.SCREEN_RECORD;
                break;
            case 4003206:
                liveMode = LiveMode.VIDEO;
                break;
            case 4003207:
                liveMode = LiveMode.THIRD_PARTY;
                break;
            case 4003208:
                liveMode = LiveMode.LIVE_STUDIO;
                break;
            default:
                liveMode = null;
                break;
        }
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        C19GO c19go = new C19GO(context);
        c19go.LJI(2131844011);
        if (i == 30005) {
            charSequenceFromHtml = C497740JfY.LJIJI(2131844010);
        } else {
            Object[] objArr = new Object[2];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<b>");
            sbLIZ.append(LIZ(liveMode));
            sbLIZ.append("</b>");
            objArr[0] = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("<b>");
            if (dataChannel != null) {
                liveMode2 = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            } else {
                liveMode2 = null;
            }
            sbLIZ2.append(LIZ(liveMode2));
            sbLIZ2.append("</b>");
            objArr[1] = C2188811AlT.LIZIZ(sbLIZ2);
            charSequenceFromHtml = Html.fromHtml(C497740JfY.LJIJJ(2131853009, objArr));
        }
        c19go.LJIIIIZZ = charSequenceFromHtml;
        c19go.LJ(2131844008, new DialogInterface.OnClickListener() { // from class: X.0UPx
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LiveMode liveMode3;
                if (i == 30005) {
                    C0UQX.LJJIFFI(dataChannel, "end_live");
                    C0UQX.LJJ(dataChannel, 1, "end_now");
                } else {
                    C0UQX.LJJIFFI(dataChannel, "end_live");
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        liveMode3 = (LiveMode) dataChannel2.gg0(LiveModeChannel.class);
                    } else {
                        liveMode3 = null;
                    }
                    C0UQX.LJJI("end_now", dataChannel2, liveMode3, liveMode);
                }
                C464950ILd.LJI.getClass();
                C464950ILd.LJ(null, 3);
                DataChannel dataChannel3 = dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.SX0(C0UP3.class, Boolean.TRUE);
                }
                boolean z = C0URD.LJ;
                C0UQ2.LIZ().LIZJ();
                C20441214yg.LIZIZ("PreviewStartLiveExceptionHelper", "end now clicked");
                DataChannel dataChannel4 = dataChannel;
                if (dataChannel4 != null) {
                    dataChannel4.zW(PreviewStartLiveContinueMsgChannel.class, Boolean.TRUE);
                }
            }
        }, false);
        c19go.LIZJ(2131844009, new DialogInterface.OnClickListener() { // from class: X.0UPy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                LiveMode liveMode3;
                if (i == 30005) {
                    C0UQX.LJJIFFI(dataChannel, "back");
                    C0UQX.LJJ(dataChannel, 1, "cancel");
                } else {
                    C0UQX.LJJIFFI(dataChannel, "back");
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        liveMode3 = (LiveMode) dataChannel2.gg0(LiveModeChannel.class);
                    } else {
                        liveMode3 = null;
                    }
                    C0UQX.LJJI("cancel", dataChannel2, liveMode3, liveMode);
                }
                boolean z = C0URD.LJ;
                C0UQ2.LIZ().LIZJ();
            }
        }, false);
        c19go.LJJIIJ = false;
        C19GN c19gnLIZ = c19go.LIZ();
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZ(c19gnLIZ, C0URF.MIDDLE, new C0UQ3() { // from class: X.0UQ0
            @Override // X.C0UQ3
            public final void LIZ() {
                if (i == 30005) {
                    C0UQX.LJJIFFI(dataChannel, "show");
                    C0UQX.LJJ(dataChannel, 1, "show");
                } else {
                    C0UQX.LJJIFFI(dataChannel, "show");
                    DataChannel dataChannel2 = dataChannel;
                    C0UQX.LJJI("show", dataChannel2, dataChannel2 != null ? (LiveMode) dataChannel2.gg0(LiveModeChannel.class) : null, liveMode);
                }
            }
        }, null);
    }

    public static void LJFF(final DataChannel dataChannel, final Fragment fragment, final int i, final String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_phone_verify_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        Object objGg0 = dataChannel.gg0(PreviewTitleChannel.class);
        if (objGg0 == null) {
            objGg0 = "";
        }
        c474500IjALIZ.LJJII(objGg0, "room_title");
        c474500IjALIZ.LIZ();
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        final Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131844642);
        c782110Um9.LJII(2131844641);
        c782110Um9.LJIILIIL(2131844639, new InterfaceC743640TFa() { // from class: X.0UQC
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                Fragment fragment2;
                liveDialog.dismiss();
                C771970UPz c771970UPz = C771970UPz.LIZ;
                DataChannel dataChannel2 = dataChannel;
                c771970UPz.getClass();
                C771970UPz.LIZIZ(dataChannel2, "verify");
                if (i == 4003101) {
                    IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
                    C19EG c19egLJ = C500260Jjc.LJ(context);
                    final DataChannel dataChannel3 = dataChannel;
                    iHostUser.bindMobile(c19egLJ, null, null, null, new InterfaceC207239167p() { // from class: X.0UQD
                        @Override // X.InterfaceC207239167p
                        public final void onCancel() {
                        }

                        @Override // X.InterfaceC207239167p
                        public final void onFailed() {
                        }

                        @Override // X.InterfaceC207239167p
                        public final void onSuccess() {
                            DataChannel dataChannel4 = dataChannel3;
                            if (dataChannel4 != null) {
                                dataChannel4.SX0(C0UQG.class, Boolean.TRUE);
                            }
                            C771970UPz c771970UPz2 = C771970UPz.LIZ;
                            DataChannel dataChannel5 = dataChannel3;
                            c771970UPz2.getClass();
                            C771970UPz.LIZJ(dataChannel5, "bind_phone");
                        }
                    });
                    return;
                }
                IHostUser iHostUser2 = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
                C19EG c19egLJ2 = C500260Jjc.LJ(context);
                String str2 = str;
                final DataChannel dataChannel4 = dataChannel;
                InterfaceC207238167o interfaceC207238167o = new InterfaceC207238167o() { // from class: X.0UQE
                    @Override // X.InterfaceC207238167o
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC207238167o
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC207238167o
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC207238167o
                    public final void onSuccess() {
                        DataChannel dataChannel5 = dataChannel4;
                        if (dataChannel5 != null) {
                            dataChannel5.SX0(C0UQF.class, Boolean.TRUE);
                        }
                        C771970UPz c771970UPz2 = C771970UPz.LIZ;
                        DataChannel dataChannel6 = dataChannel4;
                        c771970UPz2.getClass();
                        C771970UPz.LIZJ(dataChannel6, "code_verify");
                    }
                };
                if (C504210Jpz.LIZ) {
                    fragment2 = fragment;
                } else {
                    fragment2 = null;
                }
                iHostUser2.popCaptchaV2(c19egLJ2, str2, interfaceC207238167o, fragment2);
            }
        });
        c782110Um9.LJIIJ(2131844640, new AcS495S0100000_12(dataChannel, 57));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
