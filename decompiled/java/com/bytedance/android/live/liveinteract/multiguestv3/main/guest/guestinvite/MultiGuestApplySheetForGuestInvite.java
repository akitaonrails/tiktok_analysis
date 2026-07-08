package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite;

import X.AbstractC923750a97;
import X.AbstractC929640aIc;
import X.C0184003y;
import X.C01GW;
import X.C0IMT;
import X.C0UTD;
import X.C1119170fEJ;
import X.C12ES;
import X.C1555540qa8;
import X.C1697810uHb;
import X.C16F5;
import X.C197039127h;
import X.C20441214yg;
import X.C2217371BqR;
import X.C305801Gm;
import X.C418440Gaw;
import X.C439101nJ;
import X.C452501pT;
import X.C475510Ikn;
import X.C476100Ilk;
import X.C476110Ill;
import X.C497740JfY;
import X.C520010KaN;
import X.C753800Tha;
import X.C786410Ut5;
import X.C814420VxA;
import X.C917750ZzR;
import X.C917930Zzj;
import X.C922680a7O;
import X.C922760a7W;
import X.C924630aAX;
import X.C924790aAn;
import X.C924980aB6;
import X.C925600aC6;
import X.C925640aCA;
import X.C925770aCN;
import X.C927010aEN;
import X.C929620aIa;
import X.C929810aIt;
import X.C930540aK4;
import X.C930940aKi;
import X.C931680aLu;
import X.C956790b0P;
import X.InterfaceC665370Q7z;
import X.InterfaceC925780aCO;
import X.InterfaceC928000aFy;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AutoOpenGuestApplyDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestApplySheetForGuestInvite extends LiveSheetFragment implements InterfaceC925780aCO {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZygmLTY4ZygmLTY4ICElITEpZwImJDElDjo2OzENOT8/MRYkLConDio+Djo2OzEFJzk6PCA=";
    public C927010aEN LLJLLL;
    public C476100Ilk LLJZ;
    public FrameLayout LLJZIJLIL;
    public LiveIconView LLL;
    public C16F5 LLLF;
    public C16F5 LLLFF;
    public C197039127h LLLFFI;
    public C197039127h LLLFZ;
    public boolean LLLI;
    public C0UTD LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C929620aIa LLLIILIL;

    public MultiGuestApplySheetForGuestInvite() {
        this(null);
    }

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void BP(Throwable th) {
    }

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void Kh(Throwable th) {
    }

    @Override // X.InterfaceC925780aCO
    public final LiveDialogFragment getDialog() {
        return null;
    }

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void ht() {
    }

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void oE() {
    }

    @Override // X.InterfaceC925780aCO
    public final /* synthetic */ void zo(Throwable th) {
    }

    public final void BS() {
        int i;
        AssemViewModel assemViewModel = (AssemViewModel) this.LLLIIL.getValue();
        Integer num = null;
        C917930Zzj c917930Zzj = assemViewModel != null ? (C917930Zzj) assemViewModel.getState() : null;
        C16F5 c16f5 = this.LLLFF;
        if (c16f5 != null) {
            if (c917930Zzj != null) {
                i = c917930Zzj.LL;
                num = c917930Zzj.LLILLJJLI;
            } else {
                i = 0;
            }
            c16f5.setText(C917750ZzR.LIZLLL(i, num));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final void yS() {
        AbstractC929640aIc abstractC929640aIc;
        C931680aLu state;
        C0184003y c0184003y;
        Long l;
        boolean z = true;
        if (this.LLLII == null) {
            this.LLLII = new C0UTD(C520010KaN.LJJIIZI(getContext(), true), C475510Ikn.LJ(this), new AwS594S0100000_15(this, 317), AFwS203S0000000_15.get$arr$(91), 0, 48);
        }
        C0UTD c0utd = this.LLLII;
        if (c0utd != null && (((InterfaceC928000aFy) this.LLLIIII.getValue()).LIZ(c0utd, false) || ((InterfaceC928000aFy) this.LLLIIIIL.getValue()).LIZ(c0utd, false))) {
            C20441214yg.LIZIZ("MultiGuestApplySheetForGuestInvite", "sendRequest by Intercepted");
            return;
        }
        C924630aAX.LJIJJLI();
        C925600aC6.LIZ = "invited_by_guest";
        C927010aEN c927010aEN = this.LLJLLL;
        if (c927010aEN == null || (abstractC929640aIc = c927010aEN.LIZ) == null) {
            return;
        }
        GuestInviteViewModel guestInviteViewModelUS = uS();
        long jLongValue = (guestInviteViewModelUS == null || (state = guestInviteViewModelUS.getState()) == null || (c0184003y = state.LL) == null || (l = c0184003y.LIZ) == null) ? 0L : l.longValue();
        C0UTD c0utd2 = this.LLLII;
        if (c0utd2 == null || c0utd2.LJFF != 101) {
            z = false;
        }
        abstractC929640aIc.LIZLLL(new C925770aCN(null, 0, 11, z, 0, false, 3, jLongValue, null, 0L, null, 7411));
    }

    @Override // X.InterfaceC925780aCO
    public final void ZK() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        int i;
        DataChannel dataChannelLJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        WeakReference<AbstractC923750a97> weakReference;
        WeakReference<AbstractC923750a97> weakReference2;
        C305801Gm.LIZIZ(2131842112);
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.LC0(LinkInRoomGuestApplySucceedEvent.class, new Pair("", Boolean.FALSE));
        }
        close(1);
        if (C922760a7W.LIZLLL()) {
            C927010aEN c927010aEN = this.LLJLLL;
            AbstractC923750a97 abstractC923750a97 = null;
            if (((c927010aEN == null || (weakReference2 = c927010aEN.LIZIZ) == null) ? null : weakReference2.get()) instanceof C922680a7O) {
                return;
            }
            C927010aEN c927010aEN2 = this.LLJLLL;
            if (c927010aEN2 != null && (weakReference = c927010aEN2.LIZIZ) != null) {
                abstractC923750a97 = weakReference.get();
            }
            if (((abstractC923750a97 instanceof C922680a7O) || !C929810aIt.LIZ()) && !C930540aK4.LJJIJ()) {
                MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
                if (multiGuestDataHolderLJJIFFI == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLJJIFFI.LIZIZ()) == null) {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) {
                        return;
                    } else {
                        i = (int) multiLiveUserApplyPermission.applierSortSetting;
                    }
                } else {
                    i = multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting;
                }
                if (i != 1 || (dataChannelLJ = C475510Ikn.LJ(this)) == null) {
                    return;
                }
                dataChannelLJ.FQ2(AutoOpenGuestApplyDialogEvent.class);
            }
        }
    }

    public final GuestInviteViewModel uS() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        IGuestInviteAbility iGuestInviteAbility;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannelLJ.gg0(C956790b0P.class)) == null || (iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null)) == null) {
            return null;
        }
        return iGuestInviteAbility.getViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zS() {
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null) {
            if (num.intValue() == 1) {
                C197039127h c197039127h = this.LLLFZ;
                if (c197039127h != null) {
                    C439101nJ.LJI(c197039127h);
                }
                C197039127h c197039127h2 = this.LLLFFI;
                if (c197039127h2 != null) {
                    c197039127h2.setText(C497740JfY.LJIJI(2131840602));
                }
                C197039127h c197039127h3 = this.LLLFFI;
                if (c197039127h3 != null) {
                    c197039127h3.setButtonVariant(1);
                    return;
                }
                return;
            }
            if (num.intValue() == -1 || num.intValue() == 0) {
                C197039127h c197039127h4 = this.LLLFZ;
                if (c197039127h4 != null) {
                    C12ES.LJIILL(0, c197039127h4);
                }
                C197039127h c197039127h5 = this.LLLFFI;
                if (c197039127h5 != null) {
                    c197039127h5.setText(C497740JfY.LJIJI(2131843977));
                }
                C197039127h c197039127h6 = this.LLLFFI;
                if (c197039127h6 != null) {
                    c197039127h6.setButtonVariant(0);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0aIa] */
    public MultiGuestApplySheetForGuestInvite(C927010aEN c927010aEN) {
        this.LLJLLL = c927010aEN;
        this.LLLIIII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(89));
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(90));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 263));
        this.LLLIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 264));
        this.LLLIILIL = new C0IMT() { // from class: X.0aIa
            @Override // X.C0IMT
            public final void onChanged(Object obj) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("linkInRoomStateObserver, state = ");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("MultiGuestApplySheetForGuestInvite", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.zS();
            }
        };
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        sheetOptions.canceledOnTouchOutside = true;
        return sheetOptions;
    }

    public final void wS(String str) {
        C925640aCA.LJIIZILJ(str, System.currentTimeMillis() - System.currentTimeMillis(), 0L, "apply", null, null, 0, 0, null, null, C475510Ikn.LJ(this), 1012);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C927010aEN c927010aEN;
        Function0<Unit> function0;
        if (!this.LLLI && (c927010aEN = this.LLJLLL) != null && (function0 = c927010aEN.LIZJ) != null) {
            function0.invoke();
        }
        this.LLLI = false;
        this.LLJLLL = null;
        GuestInviteViewModel guestInviteViewModelUS = uS();
        if (guestInviteViewModelUS != null) {
            C20441214yg.LIZIZ("GuestInviteViewModel", "reset vm State");
            guestInviteViewModelUS.setState(AFwS250S0000000_15.get$arr$(4));
        }
        C924790aAn.LIZLLL().LIZJ(this.LLLIILIL);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageModel imageModel;
        AbstractC929640aIc abstractC929640aIc;
        ImageModel imageModel2;
        C931680aLu state;
        C0184003y c0184003y;
        C931680aLu state2;
        C0184003y c0184003y2;
        DataChannel dataChannelLJ;
        Object objGg0;
        C931680aLu state3;
        C0184003y c0184003y3;
        super.onViewCreated(view, bundle);
        this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.ib6);
        this.LLL = (LiveIconView) view.findViewById(R.id.lic);
        this.LLLFZ = (C197039127h) view.findViewById(R.id.csi);
        this.LLLFFI = (C197039127h) view.findViewById(R.id.cua);
        this.LLLF = (C16F5) view.findViewById(R.id.nx2);
        this.LLLFF = (C16F5) view.findViewById(R.id.wgz);
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            this.LLJZ = new C476100Ilk(frameLayout, new C476110Ill(false, 32.0f, 1.0f, 14.0f, 8));
        }
        C16F5 c16f5 = this.LLLF;
        if (c16f5 != null) {
            Object[] objArr = new Object[1];
            GuestInviteViewModel guestInviteViewModelUS = uS();
            if ((guestInviteViewModelUS == null || (state3 = guestInviteViewModelUS.getState()) == null || (c0184003y3 = state3.LL) == null || (objGg0 = c0184003y3.LIZIZ) == null) && ((dataChannelLJ = C475510Ikn.LJ(this)) == null || (objGg0 = dataChannelLJ.gg0(C753800Tha.class)) == null)) {
                objGg0 = "";
            }
            objArr[0] = objGg0;
            c16f5.setText(C497740JfY.LJIJJ(2131852859, objArr));
        }
        BS();
        GuestInviteViewModel guestInviteViewModelUS2 = uS();
        if (guestInviteViewModelUS2 == null || (state2 = guestInviteViewModelUS2.getState()) == null || (c0184003y2 = state2.LL) == null || (imageModel = c0184003y2.LIZJ) == null) {
            imageModel = new ImageModel();
        }
        C20441214yg.LIZIZ("MultiGuestApplySheetForGuestInvite", String.valueOf(imageModel));
        C476100Ilk c476100Ilk = this.LLJZ;
        if (c476100Ilk != null) {
            ImageModel[] imageModelArr = new ImageModel[2];
            GuestInviteViewModel guestInviteViewModelUS3 = uS();
            if (guestInviteViewModelUS3 == null || (state = guestInviteViewModelUS3.getState()) == null || (c0184003y = state.LL) == null || (imageModel2 = c0184003y.LIZJ) == null) {
                imageModel2 = new ImageModel();
            }
            imageModelArr[0] = imageModel2;
            imageModelArr[1] = UserService.getInstance().user().LJIJJLI().getAvatarThumb();
            c476100Ilk.LIZJ(C1697810uHb.LJIIJJI(imageModelArr));
        }
        zS();
        C927010aEN c927010aEN = this.LLJLLL;
        if (c927010aEN != null && (abstractC929640aIc = c927010aEN.LIZ) != null) {
            abstractC929640aIc.LIZ(this);
        }
        LiveIconView liveIconView = this.LLL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 2));
        }
        C197039127h c197039127h = this.LLLFZ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS150S0100000_15(this, 3));
        }
        C197039127h c197039127h2 = this.LLLFFI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS150S0100000_15(this, 4));
        }
        C924790aAn.LIZLLL().LIZ(this.LLLIILIL);
        MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel = (MultiGuestGuestShareRevenueViewModel) this.LLLIIL.getValue();
        if (multiGuestGuestShareRevenueViewModel != null) {
            MultiGuestGuestShareRevenueViewModel.BQ2(multiGuestGuestShareRevenueViewModel, new C2217371BqR() { // from class: X.0aGN
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C917930Zzj) obj).LL);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C917930Zzj) obj).LL = ((Number) obj2).intValue();
                }
            }, this, new AwS594S0100000_15(this, 1), 2);
        }
        MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel2 = (MultiGuestGuestShareRevenueViewModel) this.LLLIIL.getValue();
        if (multiGuestGuestShareRevenueViewModel2 != null) {
            MultiGuestGuestShareRevenueViewModel.BQ2(multiGuestGuestShareRevenueViewModel2, new C2217371BqR() { // from class: X.0aGT
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C917930Zzj) obj).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C917930Zzj) obj).LLILLJJLI = (Integer) obj2;
                }
            }, this, new AwS594S0100000_15(this, 2), 2);
        }
        MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel3 = (MultiGuestGuestShareRevenueViewModel) this.LLLIIL.getValue();
        if (multiGuestGuestShareRevenueViewModel3 != null) {
            multiGuestGuestShareRevenueViewModel3.vQ2();
        }
        C925600aC6.LIZ = "invited_by_guest";
        C924980aB6.LIZ(0, 0, null, null, null, "inviteByGuestV", "show", null, 144);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdq, viewGroup, false);
    }
}
