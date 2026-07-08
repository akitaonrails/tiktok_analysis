package X;

import Y.ACListenerS163S0100000_29;
import Y.AObserverS112S1100000_29;
import Y.AObserverS189S0200000_29;
import Y.ARunnableS129S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastToStoryAnchorCreateStreamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFeedPreviewAddMultiGuestParamsSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.liveshare.LiveShareStickerViewModel;
import com.ss.android.ugc.aweme.live.model.LiveShareStickerStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19625211qM extends AbstractC19588311kP<LiveShareStickerModel> {
    public View LLILZIL;
    public ConstraintLayout LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public C19631511rN LLJILJILJ;
    public final LiveShareStickerViewModel LLJILLL;
    public boolean LLJJ;
    public C1ACD LLJJI;
    public Long LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public C19487011Lw LLJJIJIL;
    public boolean LLJJJ;
    public Boolean LLJJJIL;
    public boolean LLJJJJ;
    public LiveRoomStruct LLJJJJJIL;
    public NewLiveRoomStruct LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public long LLJLIL;
    public final C19625411qO LLJLILLLLZIIL;
    public C1390410mHn LLJLL;
    public C1664680tQA<LiveShareStickerModel> LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;

    private final String getOwnerName() {
        LiveShareStickerStruct liveShareStickerStruct;
        LiveShareStickerModel liveShareStickerModel;
        if (this.LLJJ) {
            C1664680tQA<LiveShareStickerModel> c1664680tQA = this.LLJLLIL;
            if (c1664680tQA == null || (liveShareStickerModel = c1664680tQA.LIZ) == null) {
                return null;
            }
            return liveShareStickerModel.getLiveOwnerName();
        }
        InteractStickerStruct struct = getStruct();
        if (struct == null || (liveShareStickerStruct = struct.getLiveShareStickerStruct()) == null) {
            return null;
        }
        return liveShareStickerStruct.getLiveOwnerName();
    }

    private final String getScene() {
        LiveShareStickerModel liveShareStickerModel;
        LiveRoomStruct liveRoomStruct;
        if (!this.LLJJ) {
            return "story";
        }
        if (this.LLJJJJ) {
            return "edit_page_draft";
        }
        C1664680tQA<LiveShareStickerModel> c1664680tQA = this.LLJLLIL;
        return (c1664680tQA == null || (liveShareStickerModel = c1664680tQA.LIZ) == null || (liveRoomStruct = liveShareStickerModel.getLiveRoomStruct()) == null || liveRoomStruct.getAnchorId() != UserService.getInstance().user().getCurrentUserId()) ? ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().o1() ? "edit_page_guest" : "edit_page_audience" : "edit_page_anchor";
    }

    public final void LIZLLL() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        if (this.LLJJ) {
            return;
        }
        long j = 0;
        if (this.LLJL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_window_duration_v2");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "real_duration");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "stay_duration");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
            LiveRoomStruct liveRoomStruct = this.LLJJJJJIL;
            c474500IjALIZ.LJJII(String.valueOf(liveRoomStruct != null ? Long.valueOf(liveRoomStruct.getAnchorId()) : null), "anchor_id");
            LiveRoomStruct liveRoomStruct2 = this.LLJJJJJIL;
            c474500IjALIZ.LJJII(String.valueOf(liveRoomStruct2 != null ? Long.valueOf(liveRoomStruct2.id) : null), "room_id");
            c474500IjALIZ.LJJII(getEnterMethod(), "enter_method");
            c474500IjALIZ.LJJII("story_live", "enter_from_merge");
            C487710JAr c487710JAr = C487710JAr.LIZ;
            LiveRoomStruct liveRoomStruct3 = this.LLJJJJJIL;
            c487710JAr.getClass();
            c474500IjALIZ.LJJII(String.valueOf(C487710JAr.LIZ(liveRoomStruct3)), "follow_status");
            if (LiveSdkFeedPreviewAddMultiGuestParamsSetting.isEnable()) {
                LiveRoomStruct liveRoomStruct4 = this.LLJJJJJIL;
                if (liveRoomStruct4 != null && (multiLiveUserSettings = liveRoomStruct4.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null) {
                    j = multiGuestLayoutInfo.guestCnt;
                }
                c474500IjALIZ.LJJII(Integer.valueOf((int) j), "guest_cnt");
            }
            c474500IjALIZ.LIZ();
            this.LLJL = -1L;
        }
    }

    private final String getEnterFrom() {
        C705930RmZ c705930RmZ;
        C0R60 c0r60;
        String str;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        return (interactStickerContainerCommonParam == null || (c705930RmZ = interactStickerContainerCommonParam.LJFF) == null || (c0r60 = c705930RmZ.LJIIZILJ) == null || (str = c0r60.LIZ) == null) ? "homepage_hot" : str;
    }

    private final String getEnterPosition() {
        C705930RmZ c705930RmZ;
        C0R60 c0r60;
        String str;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        return (interactStickerContainerCommonParam == null || (c705930RmZ = interactStickerContainerCommonParam.LJFF) == null || (c0r60 = c705930RmZ.LJIIZILJ) == null || (str = c0r60.LIZIZ) == null) ? "feed" : str;
    }

    public final void LIZIZ() {
        float f;
        float f2;
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Context context = getContext();
        Activity activityLIZ = C1388190mED.LIZ(context);
        int iLIZ = (activityLIZ == null || (window2 = activityLIZ.getWindow()) == null || (decorView2 = window2.getDecorView()) == null || decorView2.getWidth() == 0) ? C416070GTd.LIZ(266.0d, context) : decorView2.getWidth();
        Context context2 = getContext();
        Activity activityLIZ2 = C1388190mED.LIZ(context2);
        int iLIZ2 = (activityLIZ2 == null || (window = activityLIZ2.getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getHeight() == 0) ? C416070GTd.LIZ(475.0d, context2) : decorView.getHeight();
        if (iLIZ > iLIZ2) {
            f2 = iLIZ2 * 0.68f;
            f = (266 * f2) / 475;
        } else {
            f = 0.68f * iLIZ;
            f2 = (475 * f) / 266;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sW:");
        sbLIZ.append(iLIZ);
        sbLIZ.append(", sH:");
        sbLIZ.append(iLIZ2);
        sbLIZ.append(" tW:");
        sbLIZ.append(f);
        sbLIZ.append(" tH:");
        sbLIZ.append(f2);
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLILZLL);
            c19mb.LJIILL(frameLayout.getId(), (int) f);
            c19mb.LJIIJJI(frameLayout.getId(), (int) f2);
            c19mb.LIZIZ(this.LLILZLL);
        }
    }

    public final boolean LJFF() {
        C1664680tQA<LiveShareStickerModel> c1664680tQA;
        LiveShareStickerModel liveShareStickerModel;
        LiveRoomStruct liveRoomStruct;
        return BroadcastToStoryAnchorCreateStreamSetting.enable() && this.LLJJ && (c1664680tQA = this.LLJLLIL) != null && (liveShareStickerModel = c1664680tQA.LIZ) != null && (liveRoomStruct = liveShareStickerModel.getLiveRoomStruct()) != null && liveRoomStruct.getAnchorId() == UserService.getInstance().user().getCurrentUserId();
    }

    public final boolean LJIIIZ() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        MutableLiveData<Boolean> mutableLiveData2;
        String ownerName = getOwnerName();
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if ((interactStickerContainerCommonParam == null || (mutableLiveData2 = interactStickerContainerCommonParam.LJIILIIL) == null) ? false : Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showLivingView stateCheck, but current viewHolder not selected, owner name = ");
            sbLIZ.append(ownerName);
            C20441214yg.LJ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        C19591211ks interactStickerContainerCommonParam2 = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam2 == null || (mutableLiveData = interactStickerContainerCommonParam2.LJIIL) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 2) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("showLivingView stateCheck, but current viewHolder on pause, owner name = ");
        sbLIZ2.append(ownerName);
        C20441214yg.LJ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    public final String getEnterMethod() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getEnterFrom());
        sbLIZ.append('+');
        sbLIZ.append(getEnterPosition());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        super.onAttachedToWindow();
        this.LLJLILLLLZIIL.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        String ownerName = getOwnerName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initObserver，ownerName: ");
        sbLIZ.append(ownerName);
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
        C013C c013c = new C013C();
        LiveShareStickerViewModel liveShareStickerViewModel = this.LLJILLL;
        if (liveShareStickerViewModel != null && (mutableLiveData3 = liveShareStickerViewModel.LL) != null) {
            mutableLiveData3.observe(this.LLJLILLLLZIIL, new AObserverS189S0200000_29(this, c013c, 8));
        }
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam != null && (mutableLiveData2 = interactStickerContainerCommonParam.LJIILIIL) != null) {
            mutableLiveData2.observe(this.LLJLILLLLZIIL, new AObserverS112S1100000_29(this, ownerName, 0));
        }
        C19591211ks interactStickerContainerCommonParam2 = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam2 != null && (mutableLiveData = interactStickerContainerCommonParam2.LJIIL) != null) {
            mutableLiveData.observe(this.LLJLILLLLZIIL, new AObserverS112S1100000_29(this, ownerName, 1));
        }
        LiveShareStickerViewModel liveShareStickerViewModel2 = this.LLJILLL;
        if (liveShareStickerViewModel2 != null) {
            liveShareStickerViewModel2.vQ2(this.LLJJIII, getOwnerName(), Boolean.FALSE, null);
        }
        C19631511rN c19631511rN = this.LLJILJILJ;
        if (c19631511rN != null) {
            c19631511rN.LJFF();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        User user;
        InterfaceC2175461ACa interfaceC2175461ACaLJIJJ;
        super.onDetachedFromWindow();
        C19487011Lw c19487011Lw = this.LLJJIJIL;
        if (c19487011Lw != null) {
            c19487011Lw.dispose();
            Long l = this.LLJJIII;
            String string = l != null ? l.toString() : null;
            LiveRoomStruct liveRoomStruct = this.LLJJJJJIL;
            String string2 = liveRoomStruct != null ? Long.valueOf(liveRoomStruct.getAnchorId()).toString() : null;
            String str = this.LLJJIJIIJIL;
            boolean zLJFF = Intrinsics.LJFF(this.LLJJJIL, Boolean.TRUE);
            C1ACD c1acd = this.LLJJI;
            C486660J6q.LJIILIIL((c1acd == null || (interfaceC2175461ACaLJIJJ = c1acd.LJIJJ()) == null) ? 0 : interfaceC2175461ACaLJIJJ.LJJII(), string, string2, str, "page_show", zLJFF);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow, owner name = ");
        LiveRoomStruct liveRoomStruct2 = this.LLJJJJJIL;
        sbLIZ.append((liveRoomStruct2 == null || (user = liveRoomStruct2.owner) == null) ? null : user.getNickname());
        sbLIZ.append(", roomId: ");
        sbLIZ.append(this.LLJJIII);
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLILLLLZIIL.LL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        LiveShareStickerViewModel liveShareStickerViewModel = this.LLJILLL;
        if (liveShareStickerViewModel != null) {
            Long l2 = this.LLJJIII;
            liveShareStickerViewModel.wQ2(Long.valueOf(l2 != null ? l2.longValue() : 0L), getOwnerName());
        }
        C1ACD c1acd2 = this.LLJJI;
        if (c1acd2 != null) {
            c1acd2.LJJIJIL(null, true);
        }
        C19631511rN c19631511rN = this.LLJILJILJ;
        if (c19631511rN != null) {
            c19631511rN.LIZIZ();
        }
    }

    public C19625211qM(Context context) {
        super(0, 14, context, (AttributeSet) null);
        this.LLJJ = true;
        this.LLJL = -1L;
        this.LLJLIL = -1L;
        this.LLJLILLLLZIIL = new C19625411qO();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLJILLL = new LiveShareStickerViewModel();
    }

    public C19625211qM(C19EG c19eg, C19591211ks c19591211ks) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        this.LLJJ = true;
        this.LLJL = -1L;
        this.LLJLIL = -1L;
        this.LLJLILLLLZIIL = new C19625411qO();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLJILLL = new LiveShareStickerViewModel();
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        String uid;
        C705930RmZ c705930RmZ;
        User user;
        this.LLILZ = interactStickerStruct;
        this.LLJJ = false;
        LJ(this, false, null, interactStickerStruct.getLiveShareStickerStruct(), 2);
        long roomId = interactStickerStruct.getLiveShareStickerStruct().getRoomId();
        if (roomId == null) {
            roomId = 0L;
        }
        this.LLJJIII = roomId;
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam == null || (c705930RmZ = interactStickerContainerCommonParam.LJFF) == null || (user = c705930RmZ.LIZJ) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        this.LLJJIJIIJIL = uid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initConsumeScene, authorId:");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(" anchor name:");
        sbLIZ.append(interactStickerStruct.getLiveShareStickerStruct().getLiveOwnerName());
        sbLIZ.append(", roomId:");
        sbLIZ.append(interactStickerStruct.getLiveShareStickerStruct().getRoomId());
        C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJII(LiveRoomStruct liveRoomStruct, NewLiveRoomStruct newLiveRoomStruct) {
        LiveRoomStruct liveRoomStructRoomStructConstructor = liveRoomStruct;
        if (liveRoomStructRoomStructConstructor == null && (newLiveRoomStruct == null || (liveRoomStructRoomStructConstructor = newLiveRoomStruct.roomStructConstructor()) == null)) {
            C20441214yg.LJ("LiveShareSticker", "Failed to realPlay， roomStruct: both liveRoomStruct and newLiveRoomStruct are null.");
            return;
        }
        C1ACD c1acd = this.LLJJI;
        if (c1acd != null) {
            c1acd.LJIILIIL(new C1699360uK6("live_merge", "", "", null, false, true, 40));
        }
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            this.LLJJJ = true;
            C1ACD c1acd2 = this.LLJJI;
            if (c1acd2 != null) {
                c1acd2.LJIILIIL(new C1699360uK6("story_live", getEnterMethod(), null, null, false, false, 56));
            }
            C1ACD c1acd3 = this.LLJJI;
            if (c1acd3 != null) {
                c1acd3.LJJIIJZLJL(C482710IwP.LLJI, liveRoomStructRoomStructConstructor, frameLayout, false, null, "", false, null);
            }
        }
    }

    public final void LJIIIIZZ(Room room, LiveRoomStruct liveRoomStruct) {
        LiveMode streamType;
        boolean z;
        C1ACD c1acd;
        C1664680tQA<LiveShareStickerModel> c1664680tQA;
        C1ACD c1acd2;
        Boolean boolValueOf = null;
        if (liveRoomStruct != null) {
            C20441214yg.LIZIZ("LiveShareSticker", "onObserver , showLivingView");
            if (!LJIIIZ()) {
                return;
            }
            if (!this.LLJJJ && (c1acd2 = this.LLJJI) != null && !c1acd2.LJJII()) {
                LJII(liveRoomStruct, null);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onObserver , showLivingView, but current viewHolder already playing, owner name = ");
            sbLIZ.append(getOwnerName());
            sbLIZ.append(", addedPlayer = ");
            sbLIZ.append(this.LLJJJ);
            sbLIZ.append(", playing = ");
            C1ACD c1acd3 = this.LLJJI;
            if (c1acd3 != null) {
                boolValueOf = Boolean.valueOf(c1acd3.LJJII());
            }
            sbLIZ.append(boolValueOf);
            C20441214yg.LJIIL("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (room != null) {
            streamType = room.getStreamType();
        } else {
            streamType = null;
        }
        if (streamType != LiveMode.LIVE_VOICE) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJL = z;
        if (!this.LLJJ || this.LLJJJJ || LJFF()) {
            C20441214yg.LIZIZ("LiveShareSticker", "on room available , showLivingView");
            if (!LJIIIZ()) {
                return;
            }
            if (!this.LLJJJ && (c1acd = this.LLJJI) != null && !c1acd.LJJII()) {
                NewLiveRoomStruct newLiveRoomStructLIZIZ = C1AEZ.LIZIZ(room);
                if (newLiveRoomStructLIZIZ != null) {
                    if (this.LLJJJJ && (c1664680tQA = this.LLJLLIL) != null) {
                        c1664680tQA.LIZLLL(new AwS608S0100000_29(newLiveRoomStructLIZIZ, 900), true);
                    }
                    LJII(null, newLiveRoomStructLIZIZ);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showLivingView, but current viewHolder already playing, owner name = ");
            sbLIZ2.append(getOwnerName());
            sbLIZ2.append(", addedPlayer = ");
            sbLIZ2.append(this.LLJJJ);
            sbLIZ2.append(", playing = ");
            C1ACD c1acd4 = this.LLJJI;
            if (c1acd4 != null) {
                boolValueOf = Boolean.valueOf(c1acd4.LJJII());
            }
            sbLIZ2.append(boolValueOf);
            C20441214yg.LJIIL("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJI(long j, String str, String str2) {
        if (this.LLJZ) {
            return;
        }
        this.LLJZ = true;
        String scene = getScene();
        boolean z = C486660J6q.LIZ;
        HashMap map = new HashMap();
        map.put("room_id", str);
        map.put("anchor_id", str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("");
        map.put("duration", C2188811AlT.LIZIZ(sbLIZ));
        map.put(Scene.SCENE_SERVICE, scene);
        C20684815ws.LJIILLIIL("livesdk_multi_story_loading_duration", map);
    }

    public static void LJ(final C19625211qM c19625211qM, boolean z, final LiveShareStickerModel liveShareStickerModel, LiveShareStickerStruct liveShareStickerStruct, int i) {
        ConstraintLayout constraintLayout;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewFindViewById2;
        TuxTextView tuxTextView2;
        C1390410mHn c1390410mHn;
        C19631511rN c19631511rN;
        String liveOwnerName;
        Long roomId;
        String liveOwnerName2;
        C1ACD c1acd;
        LiveRoomStruct liveRoomStruct;
        String str;
        String liveOwnerName3;
        Long roomId2 = null;
        if ((i & 2) != 0) {
            liveShareStickerModel = null;
        }
        if ((i & 4) != 0) {
            liveShareStickerStruct = null;
        }
        c19625211qM.getClass();
        C20441214yg.LIZIZ("LiveShareSticker", "initView");
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19625211qM.getContext()), R.layout.dhh, c19625211qM, true);
        c19625211qM.LLILZIL = viewTd;
        if (viewTd != null) {
            constraintLayout = (ConstraintLayout) viewTd.findViewById(R.id.n7k);
        } else {
            constraintLayout = null;
        }
        c19625211qM.LLILZLL = constraintLayout;
        View view = c19625211qM.LLILZIL;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.n7x);
        } else {
            frameLayout = null;
        }
        c19625211qM.LLIZ = frameLayout;
        View view2 = c19625211qM.LLILZIL;
        if (view2 != null) {
            frameLayout2 = (FrameLayout) view2.findViewById(R.id.n7w);
        } else {
            frameLayout2 = null;
        }
        c19625211qM.LLIZLLLIL = frameLayout2;
        View view3 = c19625211qM.LLILZIL;
        if (view3 != null) {
            tuxTextView = (TuxTextView) view3.findViewById(R.id.n7n);
        } else {
            tuxTextView = null;
        }
        c19625211qM.LLJ = tuxTextView;
        View view4 = c19625211qM.LLILZIL;
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.n7l);
        } else {
            viewFindViewById = null;
        }
        c19625211qM.LLJI = viewFindViewById;
        View view5 = c19625211qM.LLILZIL;
        if (view5 != null) {
            viewFindViewById2 = view5.findViewById(R.id.n7u);
        } else {
            viewFindViewById2 = null;
        }
        c19625211qM.LLJIJIL = viewFindViewById2;
        View view6 = c19625211qM.LLILZIL;
        if (view6 != null) {
            tuxTextView2 = (TuxTextView) view6.findViewById(R.id.n7v);
        } else {
            tuxTextView2 = null;
        }
        c19625211qM.LLJILJIL = tuxTextView2;
        View view7 = c19625211qM.LLILZIL;
        if (view7 != null) {
            c1390410mHn = (C1390410mHn) view7.findViewById(R.id.n7m);
        } else {
            c1390410mHn = null;
        }
        c19625211qM.LLJLL = c1390410mHn;
        View view8 = c19625211qM.LLILZIL;
        if (view8 != null) {
            c19631511rN = (C19631511rN) view8.findViewById(R.id.n9p);
        } else {
            c19631511rN = null;
        }
        c19625211qM.LLJILJILJ = c19631511rN;
        FrameLayout frameLayout3 = c19625211qM.LLIZ;
        if (frameLayout3 != null) {
            frameLayout3.setOutlineProvider(new C0IDB(frameLayout3, 12));
            frameLayout3.setClipToOutline(true);
        }
        c19625211qM.LIZIZ();
        c19625211qM.addOnLayoutChangeListener(new C12YD(c19625211qM, 16));
        C1390410mHn c1390410mHn2 = c19625211qM.LLJLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        c19625211qM.LLJLIL = System.currentTimeMillis();
        c19625211qM.LLJJI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.11qN
            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str2) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str2) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str2) {
            }

            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                InterfaceC2175461ACa interfaceC2175461ACaLJIJJ;
                InterfaceC2175461ACa interfaceC2175461ACaLJIJJ2;
                C1ACD c1acd2 = this.LL.LLJJI;
                boolean zLJIJI = false;
                boolean zLJJIII = (c1acd2 == null || (interfaceC2175461ACaLJIJJ2 = c1acd2.LJIJJ()) == null) ? false : interfaceC2175461ACaLJIJJ2.LJJIII();
                C1ACD c1acd3 = this.LL.LLJJI;
                if (c1acd3 != null && (interfaceC2175461ACaLJIJJ = c1acd3.LJIJJ()) != null) {
                    zLJIJI = interfaceC2175461ACaLJIJJ.LJIJI();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("defaultLandscapeAdaptRuleGravity: isMultiGuestInLastScene=");
                sbLIZ.append(zLJJIII);
                sbLIZ.append(" isCohostInLastScene:");
                sbLIZ.append(zLJIJI);
                C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
                return (zLJJIII || zLJIJI) ? null : 17;
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str2) {
                boolean z2;
                String string;
                LiveRoomStruct liveRoomStruct2;
                String string2;
                LiveRoomStruct liveRoomStruct3;
                LiveRoomStruct liveRoomStruct4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playPrepared s:");
                sbLIZ.append(str2);
                C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LLJLIL;
                LiveShareStickerModel liveShareStickerModel2 = liveShareStickerModel;
                if (liveShareStickerModel2 != null && (liveRoomStruct4 = liveShareStickerModel2.getLiveRoomStruct()) != null && liveRoomStruct4.getAnchorId() == UserService.getInstance().user().getCurrentUserId()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LL.LLJL = System.currentTimeMillis();
                LiveShareStickerModel liveShareStickerModel3 = liveShareStickerModel;
                String string3 = "";
                if (liveShareStickerModel3 == null || (liveRoomStruct3 = liveShareStickerModel3.getLiveRoomStruct()) == null || (string = Long.valueOf(liveRoomStruct3.id).toString()) == null) {
                    LiveRoomStruct liveRoomStruct5 = this.LL.LLJJJJJIL;
                    if (liveRoomStruct5 == null) {
                        string = "";
                    } else {
                        string = Long.valueOf(liveRoomStruct5.id).toString();
                    }
                }
                LiveShareStickerModel liveShareStickerModel4 = liveShareStickerModel;
                if (liveShareStickerModel4 != null && (liveRoomStruct2 = liveShareStickerModel4.getLiveRoomStruct()) != null && (string2 = Long.valueOf(liveRoomStruct2.getAnchorId()).toString()) != null) {
                    string3 = string2;
                } else {
                    LiveRoomStruct liveRoomStruct6 = this.LL.LLJJJJJIL;
                    if (liveRoomStruct6 != null) {
                        string3 = Long.valueOf(liveRoomStruct6.getAnchorId()).toString();
                    }
                }
                this.LL.LJI(jCurrentTimeMillis, string, string3);
                if (!z2) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_play");
                    c474500IjALIZ.LJJII(string3, "anchor_id");
                    c474500IjALIZ.LJJII(string, "room_id");
                    c474500IjALIZ.LJJII(this.LL.getEnterMethod(), "enter_method");
                    c474500IjALIZ.LJJII("story_live", "enter_from_merge");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LIZ();
                }
                C473410IhP.LIZIZ(new ARunnableS129S0100000_29(this.LL, 251));
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i2, int i3, View view9) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onVideoSizeChange w:");
                sbLIZ.append(i2);
                sbLIZ.append(" h:");
                sbLIZ.append(i3);
                C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ));
            }
        }, EnumC1913520ztW.SEARCH);
        if (z) {
            TuxTextView tuxTextView3 = c19625211qM.LLJ;
            if (tuxTextView3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                if (liveShareStickerModel != null) {
                    liveOwnerName3 = liveShareStickerModel.getLiveOwnerName();
                } else {
                    liveOwnerName3 = null;
                }
                sbLIZ.append(liveOwnerName3);
                tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (liveShareStickerModel != null && (liveRoomStruct = liveShareStickerModel.getLiveRoomStruct()) != null) {
                String strValueOf = String.valueOf(liveRoomStruct.id);
                String strValueOf2 = String.valueOf(liveRoomStruct.getAnchorId());
                boolean z2 = C486660J6q.LIZ;
                int iLJII = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().LJII();
                HashMap map = new HashMap();
                map.put("room_id", strValueOf);
                map.put("anchor_id", strValueOf2);
                map.put("action_type", "show");
                if (iLJII > 0) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_guest_connection", str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(iLJII);
                sbLIZ2.append("");
                map.put("guest_cnt", C2188811AlT.LIZIZ(sbLIZ2));
                C20684815ws.LJIILLIIL("livesdk_multi_share_story_edit_page", map);
                if (!TextUtils.isEmpty(liveRoomStruct.getMultiStreamData()) || !c19625211qM.LJFF()) {
                    c19625211qM.LJII(liveRoomStruct, null);
                }
            } else {
                c19625211qM.LLJJJJ = true;
            }
            if (!c19625211qM.LLJJJJ && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().LJFF() && (c1acd = c19625211qM.LLJJI) != null) {
                c1acd.LJIILJJIL(true);
            }
        } else {
            TuxTextView tuxTextView4 = c19625211qM.LLJ;
            if (tuxTextView4 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('@');
                if (liveShareStickerStruct != null) {
                    liveOwnerName2 = liveShareStickerStruct.getLiveOwnerName();
                } else {
                    liveOwnerName2 = null;
                }
                sbLIZ3.append(liveOwnerName2);
                tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
            View view9 = c19625211qM.LLILZIL;
            if (view9 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(c19625211qM, 328), view9);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ConsumeScene, need to get room info...  owner name = ");
            if (liveShareStickerStruct != null) {
                liveOwnerName = liveShareStickerStruct.getLiveOwnerName();
            } else {
                liveOwnerName = null;
            }
            sbLIZ4.append(liveOwnerName);
            sbLIZ4.append(", room id = ");
            if (liveShareStickerStruct != null) {
                roomId2 = liveShareStickerStruct.getRoomId();
            }
            sbLIZ4.append(roomId2);
            C20441214yg.LIZIZ("LiveShareSticker", C2188811AlT.LIZIZ(sbLIZ4));
            if (liveShareStickerStruct == null || (roomId = liveShareStickerStruct.getRoomId()) == null || roomId.longValue() == 0) {
                C20441214yg.LJ("LiveShareSticker", "ConsumeScene, roomid is null!!!");
                return;
            }
        }
        C19631511rN c19631511rN2 = c19625211qM.LLJILJILJ;
        if (c19631511rN2 != null) {
            c19631511rN2.LJFF();
        }
    }
}
