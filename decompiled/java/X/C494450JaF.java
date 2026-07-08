package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLivePreviewSettingDialogVM;
import com.bytedance.android.livesdk.dataChannel.BroadcastDisableSubOnlyTrialLiveEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494450JaF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogVM LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494450JaF(SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVM, boolean z, Context context, boolean z2) {
        super(0);
        this.LL = subOnlyLivePreviewSettingDialogVM;
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!C494680Jac.LJIILJJIL(this.LL.vQ2().LLILLJJLI)) {
            this.LL.setState(new C494510JaL(this.LLILLJJLI));
        } else if (!this.LLILLJJLI) {
            final SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVM = this.LL;
            Context context = this.LLILLL;
            boolean z = this.LLILZ;
            subOnlyLivePreviewSettingDialogVM.getClass();
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIIZILJ(2131844227);
            c782110Um9.LJII(z ? 2131856629 : 2131844246);
            c782110Um9.LJIILIIL(2131844225, new InterfaceC743640TFa() { // from class: X.0JaE
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    final SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVM2 = subOnlyLivePreviewSettingDialogVM;
                    final Room room = subOnlyLivePreviewSettingDialogVM2.vQ2().LLILLJJLI;
                    if (room != null) {
                        C480460Ism.LIZ().getClass();
                        ((RoomSwitchApi) C480460Ism.LIZLLL(RoomSwitchApi.class)).updateSwitch(room.getId(), 11, true, 0L).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0JaH
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubOnlyLivePreviewSettingDialogVM@408f.callUpdateSwitchDisableTrialApi$1");
                                if (((BaseResponse) obj).statusCode == 0) {
                                    room.disablePreviewSubOnly = 1L;
                                    subOnlyLivePreviewSettingDialogVM2.setState(new C494530JaN());
                                    DataChannel dataChannel = subOnlyLivePreviewSettingDialogVM2.vQ2().LLILLL;
                                    if (dataChannel != null) {
                                        dataChannel.FQ2(BroadcastDisableSubOnlyTrialLiveEvent.class);
                                    }
                                } else {
                                    subOnlyLivePreviewSettingDialogVM2.setState(new C494540JaO());
                                    C766270U4b.LIZLLL(2131842705);
                                }
                                C1C7U.LIZIZ("SubOnlyLivePreviewSettingDialogVM@408f.callUpdateSwitchDisableTrialApi$1");
                            }
                        }, new C09JN() { // from class: X.0JaI
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubOnlyLivePreviewSettingDialogVM@408f.callUpdateSwitchDisableTrialApi$2");
                                subOnlyLivePreviewSettingDialogVM2.setState(new C494550JaP());
                                C766270U4b.LIZLLL(2131842705);
                                C1C7U.LIZIZ("SubOnlyLivePreviewSettingDialogVM@408f.callUpdateSwitchDisableTrialApi$2");
                            }
                        });
                        C492670JTt.LIZIZ(subOnlyLivePreviewSettingDialogVM2.vQ2().LLILLL, subOnlyLivePreviewSettingDialogVM2.vQ2().LL, room, EnumC492680JTu.CONTINUE);
                    }
                }
            });
            c782110Um9.LJIIJ(2131844224, new InterfaceC743640TFa() { // from class: X.0JaG
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVM2 = subOnlyLivePreviewSettingDialogVM;
                    subOnlyLivePreviewSettingDialogVM2.getClass();
                    subOnlyLivePreviewSettingDialogVM2.setState(new C494570JaR());
                    C494430JaD c494430JaDVQ2 = subOnlyLivePreviewSettingDialogVM2.vQ2();
                    Room room = c494430JaDVQ2.LLILLJJLI;
                    if (room != null) {
                        C492670JTt.LIZIZ(c494430JaDVQ2.LLILLL, c494430JaDVQ2.LL, room, EnumC492680JTu.CANCEL);
                    }
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0JaJ
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    SubOnlyLivePreviewSettingDialogVM subOnlyLivePreviewSettingDialogVM2 = subOnlyLivePreviewSettingDialogVM;
                    subOnlyLivePreviewSettingDialogVM2.getClass();
                    subOnlyLivePreviewSettingDialogVM2.setState(new C494570JaR());
                }
            };
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
            C494430JaD c494430JaDVQ2 = subOnlyLivePreviewSettingDialogVM.vQ2();
            if (c494430JaDVQ2.LLILLJJLI != null) {
                DataChannel dataChannel = subOnlyLivePreviewSettingDialogVM.vQ2().LLILLL;
                String str = subOnlyLivePreviewSettingDialogVM.vQ2().LL;
                Room room = c494430JaDVQ2.LLILLJJLI;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_preview_turn_off_popup_show");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(str, "show_entrance");
                c474500IjALIZ.LJJII(str, "click_position");
                c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
                C492670JTt.LIZJ(c474500IjALIZ, room);
                c474500IjALIZ.LIZ();
            }
            this.LL.setState(new C494560JaQ());
            C494430JaD c494430JaDVQ22 = this.LL.vQ2();
            Room room2 = c494430JaDVQ22.LLILLJJLI;
            if (room2 != null) {
                DataChannel dataChannel2 = c494430JaDVQ22.LLILLL;
                String str2 = c494430JaDVQ22.LL;
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_sub_only_live_preview_allow_click");
                c474500IjALIZ2.LJIJJLI(dataChannel2);
                c474500IjALIZ2.LJJII(str2, "click_position");
                c474500IjALIZ2.LJJII(Long.valueOf(room2.getOwnerUserId()), "anchor_id");
                C492670JTt.LIZJ(c474500IjALIZ2, room2);
                c474500IjALIZ2.LJJII("close", "click_type");
                c474500IjALIZ2.LIZ();
            }
        } else if (this.LLILZ) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856622));
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844229));
        }
        return Unit.LIZ;
    }
}
