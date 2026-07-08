package X;

import Y.AObserverS216S0100000_12;
import Y.AcS495S0100000_12;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.publicscreen.api.BackToAppEvent;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.broadcast.GameMultiDeviceInterruptionOptimize;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideData;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ufo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778180Ufo implements InterfaceC776570UdD, InterfaceC777850UfH {
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final InterfaceC778270Ufx LLILLL;
    public boolean LLILZ;
    public LiveDialog LLILZIL;
    public LiveDialog LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final String LLJ;
    public final Boolean LLJI;
    public SparkContext LLJIJIL;
    public C776320Uco LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(356));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(355));

    @Override // X.InterfaceC776570UdD
    public final void LIZ() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZIZ() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        this.LLJILJIL = null;
        SparkContext sparkContext = this.LLJIJIL;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        LiveDialog liveDialog = this.LLILZIL;
        if (liveDialog != null) {
            C500260Jjc.LJJLIIIJL(liveDialog);
        }
        LiveDialog liveDialog2 = this.LLILZLL;
        if (liveDialog2 != null) {
            C500260Jjc.LJJLIIIJL(liveDialog2);
        }
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJI(EnumC777480Ueg.INTERRUPTED, this);
        }
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZJ() {
        this.LLILZ = false;
    }

    @Override // X.InterfaceC776570UdD
    public final void LJ() {
        this.LLIZ = true;
    }

    @Override // X.InterfaceC776570UdD
    public final void onPause() {
    }

    @Override // X.InterfaceC776570UdD
    public final void LIZLLL() {
        LiveDialog liveDialog = this.LLILZLL;
        if (liveDialog != null) {
            C500260Jjc.LJJLIIIJL(liveDialog);
        }
        LiveDialog liveDialog2 = this.LLILZIL;
        if (liveDialog2 != null) {
            C500260Jjc.LJJLIIIJL(liveDialog2);
        }
    }

    public final String LJIIIIZZ() {
        return (String) this.LLJILLL.getValue();
    }

    public final InterfaceC777420Uea LJIIIZ() {
        return this.LL.isAdded() ? ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ea0(ViewModelProviders.of(this.LL)) : new C513220KAu();
    }

    public final String LJIIJ() {
        int i = this.LLIZLLLIL;
        return i != 1 ? i != 2 ? i != 3 ? "none" : "frontend" : "backend" : "hover";
    }

    public final long LJIIJJI() {
        return ((Number) this.LLJILJILJ.getValue()).longValue();
    }

    public final void LJIILIIL() {
        if (this.LLIZLLLIL == 0) {
            this.LLIZLLLIL = 1;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_click");
        c474500IjALIZ.LJJII(LJIIIIZZ(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(LJIIJJI()), "room_id");
        c474500IjALIZ.LJJII("hover", "event_page");
        c474500IjALIZ.LIZ();
    }

    public final void LJIILJJIL() {
        if (this.LL.getActivity() == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(this.LL.getActivity());
        c782110Um9.LJ(new C753520Th8(C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_game_demand_1"), "game_live_interrupt_dialog_image.png"), 2.3f);
        c782110Um9.LJIIZILJ(2131840709);
        c782110Um9.LJII(2131840701);
        c782110Um9.LJIILIIL(2131840702, new AcS495S0100000_12(this, 48));
        c782110Um9.LJIIJ(2131840703, new AcS495S0100000_12(this, 49));
        c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 27);
        c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0Ufs
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.LL.getClass();
                C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.N;
                Boolean bool = Boolean.FALSE;
                c20337914i1.LJFF(bool);
                InterfaceC772390URp.f128O.LJFF(bool);
                C778180Ufo c778180Ufo = this.LL;
                C776320Uco c776320Uco = c778180Ufo.LLJILJIL;
                if (c776320Uco != null) {
                    c776320Uco.LJFF(c778180Ufo.LJIIJJI(), EnumC778210Ufr.LIVE_POPUP, EnumC778250Ufv.IN_LIVE);
                }
            }
        };
        c782110Um9.LJIILL = false;
        this.LLILZLL = c782110Um9.LIZ();
        LJIIIZ().addToShow(51, this.LL, new AObserverS216S0100000_12(this, 77));
    }

    @Override // X.InterfaceC776570UdD
    public final void onResume() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        if (C500260Jjc.LJJIJIIJIL((Boolean) this.LLILLJJLI.gg0(C755590TkT.class))) {
            return;
        }
        if (this.LLILZ) {
            if (!C778190Ufp.LJ() && !C500260Jjc.LJJIJIIJIL(this.LLJI)) {
                LJIILJJIL();
            } else if (InterfaceC772390URp.N.LIZIZ().booleanValue()) {
                this.LLILLL.LJ();
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    C777840UfG.LIZJ(EnumC777480Ueg.INTERRUPTED, "error");
                } else {
                    this.LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR.ordinal(), null, "", null, false);
                }
            } else {
                LJIIL(2);
            }
            this.LLILZ = false;
            return;
        }
        LiveDialog liveDialog = this.LLILZLL;
        if (C500260Jjc.LJJJI(liveDialog != null ? Boolean.valueOf(liveDialog.isShowing()) : null) && C778190Ufp.LJ()) {
            SparkContext sparkContext = this.LLJIJIL;
            if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
                interfaceC1059280dfiLJJIJLIJ.close();
            }
            LiveDialog liveDialog2 = this.LLILZLL;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
                C785410UrT.LIZ(liveDialog2);
            }
            C776320Uco c776320Uco = this.LLJILJIL;
            if (c776320Uco != null) {
                c776320Uco.LIZLLL(LJIIJJI(), EnumC778210Ufr.LIVE_POPUP, EnumC778250Ufv.IN_LIVE);
            }
            this.LLILLL.LJ();
        }
    }

    @Override // X.InterfaceC776570UdD
    public final void LJFF(boolean z) {
        this.LLILZ = z;
        if (!C500260Jjc.LJJIJIIJIL(this.LLJI) && C778190Ufp.LIZJ()) {
            InterfaceC772390URp.N.LJFF(Boolean.TRUE);
            if (!z) {
                LJIILJJIL();
                return;
            }
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LJII(new C778230Uft("guide"));
            } else {
                this.LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR_GUIDE_IMPROVE.ordinal(), null, C497740JfY.LJIJI(2131840704), null, true);
            }
            C766270U4b.LJ(2131840704, 1, GlobalContext.getApplicationContext());
            C776320Uco c776320Uco = this.LLJILJIL;
            if (c776320Uco == null) {
                return;
            }
            c776320Uco.LJFF(LJIIJJI(), EnumC778210Ufr.RED_TOAST, EnumC778250Ufv.IN_LIVE);
            return;
        }
        if (!z) {
            LJIIL(3);
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131841807);
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJII(new C778230Uft("error"));
        } else {
            this.LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR.ordinal(), null, strLJIJI, null, true);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_show");
        c474500IjALIZ.LJJII(LJIIIIZZ(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(LJIIJJI()), "room_id");
        c474500IjALIZ.LJJII("hover", "event_page");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        if ((abstractC777950UfR instanceof C778230Uft) && Intrinsics.LJFF(((C778230Uft) abstractC777950UfR).LJ, "error")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_show");
            c474500IjALIZ.LJJII(LJIIIIZZ(), "anchor_id");
            c474500IjALIZ.LJJII("screen_share", "live_type");
            c474500IjALIZ.LJJII(Long.valueOf(LJIIJJI()), "room_id");
            c474500IjALIZ.LJJII("hover", "event_page");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIL(int i) {
        if (this.LLIZLLLIL == 0) {
            this.LLIZLLLIL = i;
        }
        if (this.LL.getActivity() != null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.LL.getActivity());
            c782110Um9.LJIIZILJ(2131841808);
            c782110Um9.LJII(2131841805);
            c782110Um9.LJIILIIL(2131841809, new AcS495S0100000_12(this, 50));
            c782110Um9.LJIIJ(2131841806, new AcS495S0100000_12(this, 51));
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 28);
            c782110Um9.LJIILL = false;
            this.LLILZIL = c782110Um9.LIZ();
        }
        LJIIIZ().addToShow(50, this.LL, new AObserverS216S0100000_12(this, 76));
    }

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
        if ((abstractC777950UfR instanceof C778230Uft) && enumC778130Ufj == EnumC778130Ufj.USER_CLICK) {
            if (Intrinsics.LJFF(((C778230Uft) abstractC777950UfR).LJ, "error")) {
                LJIILIIL();
            } else {
                C776320Uco c776320Uco = this.LLJILJIL;
                if (c776320Uco != null) {
                    c776320Uco.LJ(LJIIJJI(), EnumC778210Ufr.RED_TOAST, null, EnumC778250Ufv.IN_LIVE);
                }
            }
            this.LLILLJJLI.FQ2(BackToAppEvent.class);
        }
    }

    public C778180Ufo(Fragment fragment, DataChannel dataChannel, InterfaceC778270Ufx interfaceC778270Ufx) {
        boolean z;
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC778270Ufx;
        MultiDeviceInterruptGuideData data = MultiDeviceInterruptGuideSetting.INSTANCE.getData();
        Integer num = data.enable;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        this.LLJI = Boolean.valueOf(z);
        this.LLJ = data.guideUrl;
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.INTERRUPTED, this);
        }
        if (GameMultiDeviceInterruptionOptimize.INSTANCE.isDefault()) {
            dataChannel.EQ2(fragment, GameBroadcastStateChannel.class, new AwS591S0100000_12(this, 908));
        }
    }
}
