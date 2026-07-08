package X;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRegionValiditySetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01SE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01SE extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> implements C01SH {
    public static boolean LLJJI;
    public final Context LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public C11JF LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public Boolean LLJILJIL;
    public C015T LLJILJILJ;
    public String LLJ = "";
    public boolean LLJIJIL = true;
    public final C01SD LLJILLL = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0();
    public final C515301zb LLJJ = new C515301zb(this, 0);

    @Override // X.InterfaceC1124060fMC
    public final String LIZ() {
        return "game_partnership";
    }

    public final void LJJ() {
        MutableLiveData<Drawable> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        this.LLIZLLLIL = true;
        ViewModel viewModel = this.LL;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        if (slotViewModel != null) {
            slotViewModel.LLLIIII = 0.5f;
        }
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) viewModel;
        if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLILZLL) != null) {
            mutableLiveData2.postValue("");
        }
        IIconSlot.SlotViewModel slotViewModel3 = (IIconSlot.SlotViewModel) this.LL;
        if (slotViewModel3 == null || (mutableLiveData = slotViewModel3.LLJ) == null) {
            return;
        }
        mutableLiveData.postValue(C800330VaR.LIZIZ(this.LLILLL, R.drawable.f6v));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<EnumC742820TBw> LJLI() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDispose() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onEvent(Boolean bool) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onMessage(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onPause() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onResume() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStart() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onStop() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[PHI: r1
      0x0046: PHI (r1v6 boolean) = (r1v5 boolean), (r1v7 boolean) binds: [B:22:0x0043, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJJI() {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aLQ> r0 = X.C931380aLQ.class
            java.lang.Object r0 = r1.gg0(r0)
            X.00oi r0 = (X.C193000oi) r0
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L48
            webcast.api.partnership.AnchorInfoResponse$CameraPartnershipInfo r2 = r0.LIZ
            if (r2 == 0) goto L42
            boolean r0 = r2.taskPermission
            if (r0 != r8) goto L42
            r1 = 1
        L17:
            boolean r0 = r2.publishPermission
            if (r0 != r8) goto L46
            r6 = 1
        L1c:
            r0 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            if (r1 == 0) goto L40
            r2 = r4
        L26:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_promotion"
            r1.<init>(r0, r2)
            r5[r7] = r1
            if (r6 != 0) goto L32
            r4 = r3
        L32:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_incentive_program"
            r1.<init>(r0, r4)
            r5[r8] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r5)
            return r0
        L40:
            r2 = r3
            goto L26
        L42:
            r1 = 0
            if (r2 == 0) goto L46
            goto L17
        L46:
            r6 = 0
            goto L1c
        L48:
            r6 = 0
            r1 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01SE.LJJI():java.util.Map");
    }

    public final void LJJIII() {
        if (this.LLJI) {
            return;
        }
        C01SD c01sd = this.LLJILLL;
        if (c01sd != null) {
            c01sd.LIZ(LiveMode.VIDEO);
        }
        C01SD c01sd2 = this.LLJILLL;
        if (c01sd2 != null) {
            c01sd2.LIZIZ(LiveMode.VIDEO, "gamecp_video");
        }
        C197600pS.LIZ().wy(new C5182020e(this.LLILLL, true, 81));
        this.LLJI = true;
    }

    @Override // X.InterfaceC1124060fMC
    public final Object LLILZLL() {
        return new AnonymousClass1818(new InterfaceC752610Tff() { // from class: X.01SF
            @Override // X.InterfaceC752610Tff
            public final void LIZ(View view, String str) {
                String str2;
                MutableLiveData<Boolean> mutableLiveData;
                this.LIZ.LJJIFFI(null);
                C01SE c01se = this.LIZ;
                if (c01se.LLIZLLLIL) {
                    C766270U4b.LJIIJJI(c01se.LLJ);
                    return;
                }
                c01se.LJJIII();
                if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0() != null) {
                    C01SE c01se2 = this.LIZ;
                    Context context = c01se2.LLILLL;
                    Pair[] pairArr = new Pair[6];
                    IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) c01se2.LL;
                    if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                        str2 = "icon";
                    } else {
                        str2 = "add_partnership";
                    }
                    pairArr[0] = new Pair("btn_name", str2);
                    pairArr[1] = new Pair("user_type", "host");
                    pairArr[2] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                    pairArr[3] = new Pair("live_type", "video_live");
                    pairArr[4] = new Pair("page_name", "live_start");
                    pairArr[5] = new Pair("entrance", "partnership_icon_video_live");
                    C01GU.LIZ(context, C2097608Jq.LJIIIIZZ(pairArr));
                }
            }
        });
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final List<Integer> getMessageType() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget
    public final void onAggregateClick() {
        LJJIFFI("business");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        C015V.LJFF(this.LLJJ);
        if (this.LLILZ) {
            C197600pS.LIZ().destroy();
            C197400pQ c197400pQFy0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0();
            if (c197400pQFy0 != null) {
                c197400pQFy0.LIZJ();
            }
        }
        Application application = (Application) C786410Ut5.N3(this.LLILLL);
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.LLJILJILJ);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public C01SE(Context context) {
        this.LLILLL = context;
    }

    public final void LJJIFFI(String str) {
        String str2;
        String str3;
        MutableLiveData<Boolean> mutableLiveData;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
        c474500IjALIZ.LJJII("video_live", "live_type");
        if (str == null) {
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) this.LL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                str2 = "icon";
            } else {
                str2 = "add_partnership";
            }
        } else {
            str2 = str;
        }
        c474500IjALIZ.LJJII(str2, "btn_name");
        c474500IjALIZ.LJJII("host", "user_type");
        c474500IjALIZ.LJJII("live_start", "page_name");
        if (!Intrinsics.LJFF(str, "business")) {
            if (this.LLIZLLLIL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "is_grey");
        }
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJIIZI(LJJI());
        c474500IjALIZ.LIZ();
    }

    public final void LJJII(String str) {
        String str2;
        String str3;
        MutableLiveData<Boolean> mutableLiveData;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
        c474500IjALIZ.LJJII("video_live", "live_type");
        if (str == null) {
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) this.LL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                str2 = "icon";
            } else {
                str2 = "add_partnership";
            }
        } else {
            str2 = str;
        }
        c474500IjALIZ.LJJII(str2, "btn_name");
        c474500IjALIZ.LJJII("host", "user_type");
        c474500IjALIZ.LJJII("live_start", "page_name");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (!Intrinsics.LJFF(str, "business")) {
            if (this.LLIZLLLIL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "is_grey");
        }
        c474500IjALIZ.LJJIIZI(LJJI());
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget
    public final void onAggregateExposure(String str) {
        IIconSlot.SlotViewModel slotViewModel;
        LJJII("business");
        if (this.LLILZ && this.LLILZIL) {
            this.LLILZIL = false;
            ViewModel viewModel = this.LL;
            if ((viewModel instanceof IIconSlot.SlotViewModel) && (slotViewModel = (IIconSlot.SlotViewModel) viewModel) != null) {
                slotViewModel.LLLII = Boolean.TRUE;
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onExposure(String str) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        if (this.LLJIJIL && (slotViewModel = (IIconSlot.SlotViewModel) this.LL) != null && (mutableLiveData = slotViewModel.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            this.LLJIJIL = false;
        } else {
            LJJII(null);
        }
    }

    @Override // X.C01SH
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        MutableLiveData<String> mutableLiveData;
        C11JF c11jf;
        C11JF c11jf2 = this.LLIZ;
        boolean z = true;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLIZ) != null) {
            c11jf.dispose();
        }
        C480460Ism.LIZ().getClass();
        if (((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).removeGamePartnershipBusinessStatus(2).execute().LIZIZ.statusCode != 0) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf.booleanValue()) {
            C197600pS.LIZ().LJFF(0, 2, null);
            this.LLJI = false;
            this.LLILZLL = false;
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) this.LL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
                mutableLiveData.postValue("");
            }
        }
        return boolValueOf;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void LLIZ(ViewModel viewModel, InterfaceC21213717zz interfaceC21213717zz) {
        String strLJIJI;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        this.LL = slotViewModel;
        this.LLILLJJLI = interfaceC21213717zz;
        Boolean bool = Boolean.TRUE;
        slotViewModel.LLLFFI = bool;
        slotViewModel.LLJIJIL.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.ei2));
        slotViewModel.LLJ.setValue(C800330VaR.LIZIZ(interfaceC21213717zz.getContext(), R.drawable.f6v));
        MutableLiveData<String> mutableLiveData = slotViewModel.LLJILJILJ;
        if (GameLivePartnershipRegionValiditySetting.INSTANCE.isInEuRegion()) {
            strLJIJI = C497740JfY.LJIJI(2131855635);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131841775);
        }
        mutableLiveData.setValue(strLJIJI);
        slotViewModel.LLJILLL.setValue(C497740JfY.LJIJI(2131841779));
        if (this.LLIZLLLIL) {
            slotViewModel.LLLIIII = 0.5f;
        }
        slotViewModel.LLILZ.setValue(bool);
        if (Intrinsics.LJFF(this.LLJILJIL, bool)) {
            LJJIII();
        }
        C197600pS.LIZ().init();
        this.LLJILJILJ = new C015T();
        Application application = (Application) C786410Ut5.N3(this.LLILLL);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.LLJILJILJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    @Override // X.InterfaceC1124060fMC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareToShow(java.util.Map<java.lang.String, java.lang.Object> r7, X.InterfaceC756140TlM r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01SE.prepareToShow(java.util.Map, X.0TlM):void");
    }
}
