package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123210fKp extends FrameLayout implements InterfaceC1123150fKj {
    public LiveIconView LL;
    public C1123100fKe LLILLJJLI;
    public C1126220fPg LLILLL;
    public Gift LLILZ;
    public boolean LLILZIL;
    public C20743416Fc LLILZLL;
    public long LLIZ;
    public final C11NJ LLIZLLLIL;
    public DataChannel LLJ;
    public EnumC1102980eoC LLJI;
    public final AwS596S0100000_17 LLJIJIL;
    public final ARunnableS117S0100000_17 LLJILJIL;
    public final C1123210fKp LLJILJILJ;

    @Override // X.InterfaceC1123150fKj
    public final void LIZIZ() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLJ = null;
    }

    @Override // X.InterfaceC1123150fKj
    public final void LJ() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C780690Ujr.class), Boolean.TRUE)) {
            performClick();
            return;
        }
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            liveIconView.performClick();
        }
    }

    public final void LJIIIZ() {
        C20743416Fc c20743416Fc;
        C1126220fPg c1126220fPg = this.LLILLL;
        if (c1126220fPg != null) {
            C500260Jjc.LJIILIIL(c1126220fPg);
        }
        C1126220fPg c1126220fPg2 = this.LLILLL;
        if (c1126220fPg2 != null) {
            c1126220fPg2.LJFF();
        }
        if (this.LLILZIL && (c20743416Fc = this.LLILZLL) != null) {
            C500260Jjc.LLFFF(c20743416Fc);
        }
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(FastGiftClickChannel.class, Boolean.FALSE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C1123100fKe c1123100fKe = this.LLILLJJLI;
        if (c1123100fKe != null) {
            c1123100fKe.LIZLLL.LJ();
            c1123100fKe.LIZ = null;
        }
        this.LLILLJJLI = null;
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJIL);
        this.LLIZLLLIL.LJ();
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC1123150fKj
    public final ViewGroup LJFF() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123210fKp.LJIIIIZZ():void");
    }

    @Override // X.InterfaceC1123150fKj
    public View getCurrentView() {
        return this.LLJILJILJ;
    }

    public C1123210fKp(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = new C11NJ();
        this.LLJI = EnumC1102980eoC.DEFAULT;
        this.LLJIJIL = new AwS596S0100000_17(this, 338);
        this.LLJILJIL = new ARunnableS117S0100000_17(this, 167);
        this.LLJILJILJ = this;
    }

    public final void LIZLLL(View view) {
        if (view == null) {
            return;
        }
        C1098990ehl.LIZIZ(view, new ACListenerS152S0100000_17(this, 98), new ACListenerS152S0100000_17(this, 99));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0fKr
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return true;
            }
        });
    }

    public final void LJII(boolean z) {
        Object objLLFF;
        Object obj;
        List list;
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_click");
        c474500IjALIZ.LJIJJLI(this.LLJ);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            objLLFF = C500260Jjc.LLFF(dataChannel);
        } else {
            objLLFF = null;
        }
        c474500IjALIZ.LJJII(objLLFF, "user_type");
        EnumC1102740eno enumC1102740eno = EnumC1102740eno.FAST_GIFT;
        c474500IjALIZ.LJJII(enumC1102740eno.getScene(this.LLJ), "button_scene");
        c474500IjALIZ.LJJII(enumC1102740eno.getIdentifier(), "button_name");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_false_trigger");
        String str2 = "portrait";
        if (C497740JfY.LJIL()) {
            obj = "portrait";
        } else {
            obj = "landscape";
        }
        c474500IjALIZ.LJJII(obj, "room_orientation");
        c474500IjALIZ.LIZ();
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != null && (list = (List) dataChannel2.gg0(C1102520enS.class)) != null && list.contains(enumC1102740eno)) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_toolbar_highlight_button_click");
            c474500IjALIZ2.LJIJJLI(this.LLJ);
            c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            if (C500260Jjc.LJIIZILJ(this.LLJ)) {
                str = "anchor";
            } else if (C01C5.LIZ(this.LLJ)) {
                str = "admin";
            } else {
                str = "viewer";
            }
            c474500IjALIZ2.LJJII(str, "user_type");
            c474500IjALIZ2.LJJII(enumC1102740eno.getIdentifier(), "button_name");
            c474500IjALIZ2.LJJII(Integer.valueOf(z ? 1 : 0), "is_false_trigger");
            if (!C497740JfY.LJIL()) {
                str2 = "landscape";
            }
            c474500IjALIZ2.LJJII(str2, "room_orientation");
            c474500IjALIZ2.LIZ();
        }
    }

    @Override // X.InterfaceC1123150fKj
    public void setBottomColorStyle(EnumC1102980eoC enumC1102980eoC) {
        DataChannel dataChannel;
        Room room;
        this.LLJI = enumC1102980eoC;
        C1123100fKe c1123100fKe = this.LLILLJJLI;
        if (c1123100fKe != null && (dataChannel = c1123100fKe.LIZIZ) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            long id = room.getId();
            c1123100fKe.LIZ(GiftManager.inst().getFastGift(id), GiftManager.inst().getFastGiftGreyIcon(id), GiftManager.inst().getFastGiftColorfulIcon(id));
        }
    }

    @Override // X.InterfaceC1123150fKj
    public void setImageDrawable(int i) {
        LiveIconView liveIconView = this.LL;
        if (liveIconView != null) {
            liveIconView.setIcon(i);
        }
    }

    @Override // X.InterfaceC1123150fKj
    public final void LIZJ(DataChannel dataChannel, boolean z) {
        C20743416Fc c20743416Fc;
        DataChannel dataChannel2 = this.LLJ;
        if (dataChannel2 != dataChannel && dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        this.LLJ = dataChannel;
        LJIIIZ();
        if (dataChannel != null) {
            dataChannel.CQ2(FastGiftCombEvent.class, this, this.LLJIJIL);
            this.LLILZIL = Intrinsics.LJFF(Boolean.TRUE, dataChannel.gg0(C780690Ujr.class));
        }
        setBackground(C1106260etU.LIZIZ(getContext()));
        if (this.LLILZIL && (c20743416Fc = this.LLILZLL) != null) {
            C500260Jjc.LJIILIIL(c20743416Fc);
        }
        HandlerHook.viewRemoveCallbacks(this, this.LLJILJIL);
        setClipChildren(false);
        LJI(dataChannel, z);
    }

    public final void LJI(DataChannel dataChannel, boolean z) {
        this.LLILZ = null;
        C1123100fKe c1123100fKe = this.LLILLJJLI;
        if (c1123100fKe != null) {
            c1123100fKe.LIZLLL.LJ();
            c1123100fKe.LIZ = null;
        }
        this.LLILLJJLI = new C1123100fKe(this, dataChannel);
        if (!z) {
            if (C1125270fO9.LIZ().Ev1()) {
                C1125270fO9.LIZ().Sb1(dataChannel, "show", "gift", false);
            } else {
                HandlerHook.viewPostDelay(this, this.LLJILJIL, 1500L);
            }
        }
        if (dataChannel != null) {
            dataChannel.gg0(RoomChannel.class);
        }
        this.LLIZLLLIL.LJ();
        this.LLIZLLLIL.LIZ(C784440Upu.LIZ().LJ(C1123270fKv.class).LJJLJLI(new AfS186S0100000_17(this, 92)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        if (!this.LLILZIL && getBackground() != null) {
            if (LiveToolbarUIConfig.expandContainer() && C497740JfY.LJIL()) {
                f = 38.0f;
            } else {
                f = 36.0f;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) C497740JfY.LIZIZ(f), 1073741824);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.String] */
    @Override // X.InterfaceC1123150fKj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.model.Gift r6, com.bytedance.android.live.base.model.ImageModel r7, com.bytedance.android.live.base.model.ImageModel r8) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123210fKp.LIZ(com.bytedance.android.livesdk.model.Gift, com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.live.base.model.ImageModel):void");
    }
}
