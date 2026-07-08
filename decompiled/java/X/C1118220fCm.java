package X;

import Y.AfS186S0100000_17;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.gift.ClearGiftMessageEvent;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.NormalGiftDisplayForVideoEvent;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.live.gift.NormalGiftLayoutBottomMarginUpdateEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ExclusiveGiftUnlockEvent;
import com.bytedance.android.livesdk.GiftDialogSizeChanged;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.ECStartClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEnableStickySendGiftEvent;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS104S0110000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118220fCm {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1118240fCo LIZJ;
    public C21287018Se LIZLLL;
    public final MutableLiveData<Boolean> LJ = new MutableLiveData<>();
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final C11NJ LJIIIIZZ;
    public C1118230fCn LJIIIZ;

    public final boolean LIZ(boolean z) {
        DataChannel dataChannel;
        boolean z2;
        boolean z3;
        RoomAuthOffReasons roomAuthOffReasons;
        String gift;
        DataChannel dataChannel2 = this.LIZ;
        Room room = null;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        }
        if (room == null || (dataChannel = this.LIZ) == null || dataChannel.gg0(UserIsAnchorChannel.class) == null) {
            return false;
        }
        Object objGg0 = this.LIZ.gg0(UserIsAnchorChannel.class);
        Boolean bool = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(objGg0, bool);
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.isEnableGift()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C1118310fCv.LIZIZ(zLJFF, z3, z2) != EnumC1118300fCu.SHOW) {
            if (C1118280fCs.LIZ(zLJFF, z3, z2) == EnumC1118290fCt.TOAST) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null && (roomAuthOffReasons = roomAuthStatus2.getRoomAuthOffReasons()) != null && (gift = roomAuthOffReasons.getGift()) != null && !a0.LJJJIL(gift)) {
                    C766270U4b.LJIIJJI(gift);
                } else {
                    C766270U4b.LIZLLL(2131840914);
                }
                this.LIZ.LC0(LogGiftCloseToastShowEvent.class, bool);
            } else {
                InterfaceC1118240fCo interfaceC1118240fCo = this.LIZJ;
                if (interfaceC1118240fCo != null) {
                    interfaceC1118240fCo.LJL();
                }
            }
            if (!z || z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void LIZIZ(C1121570fIB c1121570fIB) {
        Boolean bool;
        if (this.LIZJ != null) {
            if (LIZ(c1121570fIB.LJIJ)) {
                this.LIZJ.LJLLJ(c1121570fIB);
                return;
            }
            String str = c1121570fIB.LIZJ;
            if (str == null) {
                str = "icon";
            }
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(C0TZM.class);
            } else {
                bool = null;
            }
            C1131070fXV.LJIIJ(3, 0, bool, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fCn] */
    public C1118220fCm(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC1118240fCo interfaceC1118240fCo, boolean z) {
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC1118240fCo;
        C11NJ c11nj = new C11NJ();
        this.LJIIIIZZ = c11nj;
        this.LJIIIZ = new AbstractC1132980faa() { // from class: X.0fCn
            @Override // X.AbstractC1132980faa
            public final void LIZIZ(List<Gift> list) {
            }

            @Override // X.AbstractC1132980faa
            public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
                List<GiftPage> list2;
                ArrayList arrayList;
                if (this.LIZ.LIZJ != null) {
                    if (list == null) {
                        list2 = C13BV.INSTANCE;
                    } else {
                        list2 = list;
                    }
                    for (GiftPage giftPage : list2) {
                        if (giftPage.pageType == 15 && giftPage.display) {
                            for (Gift gift : giftPage.gifts) {
                                GiftLockInfo giftLockInfo = gift.giftSubInfo;
                                if (giftLockInfo != null) {
                                    C1118220fCm c1118220fCm = this.LIZ;
                                    if (giftLockInfo.mLockType == 1 && !giftLockInfo.mLock) {
                                        DataChannel dataChannel2 = c1118220fCm.LIZ;
                                        if (dataChannel2 != null) {
                                            dataChannel2.LC0(ExclusiveGiftUnlockEvent.class, gift);
                                        }
                                        ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).QL(gift.id);
                                    }
                                }
                            }
                        }
                    }
                    InterfaceC1118240fCo interfaceC1118240fCo2 = this.LIZ.LIZJ;
                    if (list != null) {
                        arrayList = new ArrayList(list);
                    } else {
                        arrayList = null;
                    }
                    interfaceC1118240fCo2.LJJIIJZLJL(arrayList);
                }
            }
        };
        AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 595);
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, NormalGiftDisplayStatusEvent.class, new AwS596S0100000_17(this, 600));
            dataChannel.BQ2(lifecycleOwner, KeyboardStatusChannel.class, new AwS596S0100000_17(this, 601));
            dataChannel.BQ2(lifecycleOwner, NormalGiftDisplayForVideoEvent.class, new AwS596S0100000_17(this, 602));
            dataChannel.BQ2(lifecycleOwner, PreShowKeyboardEvent.class, new AwS596S0100000_17(this, 603));
            dataChannel.BQ2(lifecycleOwner, ClearGiftMessageEvent.class, new AwS596S0100000_17(this, 604));
            dataChannel.EQ2(lifecycleOwner, NormalGiftLayoutBottomMarginUpdateEvent.class, new AwS596S0100000_17(this, 605));
            dataChannel.EQ2(lifecycleOwner, MultiLiveRTCLayoutChannel.class, new AwS104S0110000_17(this, z, 1));
        }
        c11nj.LIZ(((C0J1N) C784440Upu.LIZ().LJ(C1120640fGg.class).LIZJ(C11RD.LJ(lifecycleOwner))).LIZJ(new AfS186S0100000_17(this, 151)));
        c11nj.LIZ(C784440Upu.LIZ().LJ(C0IGJ.class).LJJLJLI(new AfS186S0100000_17(this, 152)));
        c11nj.LIZ(C784440Upu.LIZ().LJ(ECStartClearScreenEvent.class).LJJLJLI(new AfS186S0100000_17(this, 148)));
        c11nj.LIZ(C784440Upu.LIZ().LJ(C1118270fCr.class).LJJLJLI(new AfS186S0100000_17(this, 149)));
        ISubscriptionStatusService.LJIIIZ.getClass();
        C21287018Se c21287018SeCp1 = C0K9Q.LIZ().cp1(lifecycleOwner, lifecycleOwner);
        this.LIZLLL = c21287018SeCp1;
        if (c21287018SeCp1 != null) {
            c21287018SeCp1.LIZIZ(lifecycleOwner, new AwS596S0100000_17(this, 596));
        }
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, GiftDialogSizeChanged.class, new AwS596S0100000_17(this, 597));
            dataChannel.BQ2(lifecycleOwner, GiftDialogDismissEvent.class, new AwS596S0100000_17(this, 598));
        }
        if (LiveGiftEnableStickySendGiftEvent.INSTANCE.isStickyEventEnabled()) {
            if (dataChannel != null) {
                dataChannel.DQ2(SendGiftEvent.class, this, awS596S0100000_17);
            }
        } else if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, SendGiftEvent.class, new AwS596S0100000_17(this, 599));
        }
        if (interfaceC1118240fCo != null) {
            interfaceC1118240fCo.LLZZZZ();
        }
    }
}
