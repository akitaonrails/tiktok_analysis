package X;

import Y.ARunnableS112S0100000_12;
import Y.ATListenerS446S0100000_12;
import Y.AfS181S0100000_12;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterNativeShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0UmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782360UmY extends FrameLayout implements InterfaceC1141530foN {
    public C1AH6 LL;
    public long LLILLJJLI;
    public final boolean LLILLL;
    public final float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public C0UVH LLJ;
    public String LLJI;
    public final C11NJ LLJIJIL;
    public InterfaceC782440Umg LLJILJIL;
    public VelocityTracker LLJILJILJ;
    public String LLJILLL;
    public final FrameLayout LLJJ;
    public DataChannel LLJJI;
    public C0UVH LLJJIII;

    public final C1AH6 getLiveCenterMainViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mvf);
            this.LL = (C1AH6) callbackFindViewById;
        }
        return (C1AH6) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJIJIL.LIZ(C784440Upu.LIZ().LJ(C1086310eNJ.class).LJJLJLI(new AfS181S0100000_12(this, 63)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJI = null;
        C1548820qPI.LJIIIIZZ("anchor_center_request_room_info", this);
        C1548820qPI.LJIIIIZZ("live_anchor_center_mask_close", this);
        this.LLJIJIL.LJ();
        VelocityTracker velocityTracker = this.LLJILJILJ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLJILJILJ = null;
        C1AH6 liveCenterMainViewFromXml = getLiveCenterMainViewFromXml();
        if (liveCenterMainViewFromXml != null) {
            liveCenterMainViewFromXml.onDestroy();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LLJJI;
    }

    private final void setStatus(C0UVH c0uvh) {
        this.LLJJIII = c0uvh;
        DataChannel dataChannel = this.LLJJI;
        if (dataChannel != null) {
            dataChannel.zW(LiveCenterStatusChannel.class, c0uvh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782360UmY.LIZJ(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        Long lValueOf;
        Room room;
        RoomAuthStatus roomAuthStatus;
        Boolean boolValueOf = null;
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_request_room_info")) {
            JSONObject jSONObject = new JSONObject();
            Room roomLIZ = C162100jj.LIZ(this.LLJJI);
            if (roomLIZ != null) {
                lValueOf = Long.valueOf(roomLIZ.getId());
            } else {
                lValueOf = null;
            }
            jSONObject.put("room_id", String.valueOf(lValueOf));
            DataChannel dataChannel = this.LLJJI;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                boolValueOf = Boolean.valueOf(roomAuthStatus.isEnableGift());
            }
            jSONObject.put("gift_permission", boolValueOf);
            jSONObject.put("live_sub_only", C494680Jac.LJIILIIL());
            C389001fE.LIZ("anchor_center_response_room_info", jSONObject, System.currentTimeMillis(), false);
            return;
        }
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_anchor_center_mask_close")) {
            return;
        }
        LIZ(300L, null, true);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJJI = dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(dataChannel.LLILZ, LiveCenterShowEvent.class, new AwS591S0100000_12(this, 205));
            dataChannel.BQ2(dataChannel.LLILZ, LiveCenterDismissEvent.class, new AwS591S0100000_12(this, 206));
            dataChannel.BQ2(dataChannel.LLILZ, LinkStateForH5Event.class, new AwS591S0100000_12(this, 207));
        }
        getLiveCenterMainViewFromXml().LIZ(dataChannel);
    }

    public final void setGestureDetectLayout(InterfaceC782440Umg interfaceC782440Umg) {
        this.LLJILJIL = interfaceC782440Umg;
        if (interfaceC782440Umg != null) {
            interfaceC782440Umg.L(new ATListenerS446S0100000_12(this, 7));
            interfaceC782440Umg.v(new ATListenerS446S0100000_12(this, 8));
        }
    }

    public final void setLiveCenterMainViewFromXml(C1AH6 c1ah6) {
        this.LL = c1ah6;
    }

    public C782360UmY(Context context, AttributeSet attributeSet) {
        int iLJIIZILJ;
        super(context, attributeSet, 0);
        boolean zLJJ = C497740JfY.LJJ();
        this.LLILLL = zLJJ;
        if (zLJJ) {
            iLJIIZILJ = -C497740JfY.LJIIZILJ();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        this.LLILZ = iLJIIZILJ;
        C0UVH c0uvh = C0UVH.DISMISS;
        this.LLJ = c0uvh;
        this.LLJIJIL = new C11NJ();
        this.LLJILLL = "click";
        addView(C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hsi, this, false, null, false, 60));
        HandlerHook.viewPost(this, new ARunnableS112S0100000_12(this, 299));
        this.LLJJ = (FrameLayout) findViewById(R.id.mve);
        C1548820qPI.LIZLLL("anchor_center_request_room_info", this);
        C1548820qPI.LIZLLL("live_anchor_center_mask_close", this);
        this.LLJILJILJ = VelocityTracker.obtain();
        setClickable(true);
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            setBackgroundColor(C20736316Cj.LIZIZ(R.attr.exk, C1834150xpV.LJII(context)));
        }
        this.LLJJIII = c0uvh;
    }

    public final void LIZLLL(String str, boolean z) {
        DataChannel dataChannel = this.LLJJI;
        if (dataChannel != null) {
            dataChannel.LC0(LiveCenterNativeShowEvent.class, new C782400Umc(str, null, z, null, 12));
        }
    }

    public final void LIZ(long j, String str, boolean z) {
        C0UVH c0uvh = this.LLJJIII;
        C0UVH c0uvh2 = C0UVH.DISMISS;
        if (c0uvh == c0uvh2) {
            return;
        }
        LIZLLL(str, false);
        if (z) {
            C786410Ut5.Pd(ObjectAnimator.ofFloat(this, (Property<C782360UmY, Float>) View.TRANSLATION_X, this.LLILZ).setDuration(j));
        } else {
            float f = this.LLILZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(f);
        }
        setStatus(c0uvh2);
        if (this.LLJ != c0uvh2) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_leave");
            c474500IjALIZ.LJIJJLI(this.LLJJI);
            c474500IjALIZ.LJJII(this.LLJILLL, "enter_type");
            c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - this.LLILLJJLI), "duration");
            c474500IjALIZ.LIZ();
        }
        this.LLJ = c0uvh2;
        JSONObject jSONObject = new JSONObject();
        w.LIZ.getClass();
        jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
        C389001fE.LIZ("live_anchor_center_mask_will_disappear", jSONObject, System.currentTimeMillis(), false);
        float translationX = 1.0f - (getTranslationX() / this.LLILZ);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(translationX);
        DataChannel dataChannel = this.LLJJI;
        if (dataChannel != null) {
            dataChannel.LC0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        DataChannel dataChannel2 = this.LLJJI;
        if (dataChannel2 != null) {
            dataChannel2.zW(PerceptionMessageChannel.class, new C782080Um6(Boolean.FALSE, -1, null));
        }
    }

    public final void LJ(long j, String str, boolean z) {
        C0UVH c0uvh = this.LLJJIII;
        C0UVH c0uvh2 = C0UVH.SHOWING;
        if (c0uvh == c0uvh2) {
            return;
        }
        if (z) {
            C786410Ut5.Pd(ObjectAnimator.ofFloat(this, (Property<C782360UmY, Float>) View.TRANSLATION_X, 0.0f).setDuration(j));
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(0.0f);
        }
        setStatus(c0uvh2);
        this.LLILLJJLI = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject();
        w.LIZ.getClass();
        jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
        C389001fE.LIZ("live_anchor_center_mask_will_appear", jSONObject, System.currentTimeMillis(), false);
        InterfaceC772190UQv.f126m3.LJFF(Boolean.FALSE);
        this.LLJ = c0uvh2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        DataChannel dataChannel = this.LLJJI;
        if (dataChannel != null) {
            dataChannel.LC0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
    }
}
