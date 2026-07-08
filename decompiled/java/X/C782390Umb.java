package X;

import Y.ARunnableS112S0100000_12;
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
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.livesdk.broadcast.schema.BroadcastLiveCenterGrowthTaskEvent;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterNativeShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterShowEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibility;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibilityNew;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0Umb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782390Umb extends FrameLayout implements InterfaceC1141530foN {
    public FrameLayout LL;
    public C1AH6 LLILLJJLI;
    public long LLILLL;
    public final boolean LLILZ;
    public final float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C0UVH LLJILJIL;
    public String LLJILJILJ;
    public final C11NJ LLJILLL;
    public InterfaceC782440Umg LLJJ;
    public VelocityTracker LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public C0UVH LLJJIJIIJIL;
    public DataChannel LLJJIJIL;

    public final FrameLayout getLiveCenterLynxContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mve);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C1AH6 getLiveCenterMainViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mvf);
            this.LLILLJJLI = (C1AH6) callbackFindViewById;
        }
        return (C1AH6) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJILLL.LIZ(C784440Upu.LIZ().LJ(C1086310eNJ.class).LJJLJLI(new AfS181S0100000_12(this, 62)));
        C1548820qPI.LIZLLL("anchor_center_request_room_info", this);
        C1548820qPI.LIZLLL("live_anchor_center_mask_close", this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJILJILJ = null;
        C1548820qPI.LJIIIIZZ("anchor_center_request_room_info", this);
        C1548820qPI.LJIIIIZZ("live_anchor_center_mask_close", this);
        this.LLJILLL.LJ();
        VelocityTracker velocityTracker = this.LLJJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLJJI = null;
        C1AH6 liveCenterMainViewFromXml = getLiveCenterMainViewFromXml();
        if (liveCenterMainViewFromXml != null) {
            liveCenterMainViewFromXml.onDestroy();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LLJJIJIL;
    }

    public static void LJFF(String str) {
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ(str));
        }
    }

    private final void setStatus(C0UVH c0uvh) {
        this.LLJJIJIIJIL = c0uvh;
        DataChannel dataChannel = this.LLJJIJIL;
        if (dataChannel != null) {
            dataChannel.zW(LiveCenterStatusChannel.class, c0uvh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C782390Umb.LIZJ(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        Long lValueOf;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_request_room_info")) {
            JSONObject jSONObject = new JSONObject();
            Room roomLIZ = C162100jj.LIZ(this.LLJJIJIL);
            Boolean boolValueOf = null;
            if (roomLIZ != null) {
                lValueOf = Long.valueOf(roomLIZ.getId());
            } else {
                lValueOf = null;
            }
            jSONObject.put("room_id", String.valueOf(lValueOf));
            DataChannel dataChannel = this.LLJJIJIL;
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
        C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(this, 166));
    }

    public final void setBlockTouchEvent(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        this.LLJJIJIL = dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(dataChannel.LLILZ, LiveCenterShowEvent.class, new AwS591S0100000_12(this, 199));
            DataChannel dataChannel2 = this.LLJJIJIL;
            LifecycleOwner lifecycleOwner3 = null;
            if (dataChannel2 != null) {
                lifecycleOwner = dataChannel2.LLILZ;
            } else {
                lifecycleOwner = null;
            }
            dataChannel.BQ2(lifecycleOwner, LiveCenterDismissEvent.class, new AwS591S0100000_12(this, 200));
            DataChannel dataChannel3 = this.LLJJIJIL;
            if (dataChannel3 != null) {
                lifecycleOwner2 = dataChannel3.LLILZ;
            } else {
                lifecycleOwner2 = null;
            }
            dataChannel.BQ2(lifecycleOwner2, LinkStateForH5Event.class, new AwS591S0100000_12(this, 201));
            DataChannel dataChannel4 = this.LLJJIJIL;
            if (dataChannel4 != null) {
                lifecycleOwner3 = dataChannel4.LLILZ;
            }
            dataChannel.BQ2(lifecycleOwner3, BroadcastLiveCenterGrowthTaskEvent.class, new AwS591S0100000_12(this, 202));
        }
        getLiveCenterMainViewFromXml().LIZ(dataChannel);
    }

    public final void setGestureDetectLayout(InterfaceC782440Umg interfaceC782440Umg) {
        this.LLJJ = interfaceC782440Umg;
    }

    public final void setLiveCenterLynxContainerFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setLiveCenterMainViewFromXml(C1AH6 c1ah6) {
        this.LLILLJJLI = c1ah6;
    }

    public C782390Umb(Context context, AttributeSet attributeSet) {
        int iLJIIZILJ;
        super(context, attributeSet, 0);
        boolean zLJJ = C497740JfY.LJJ();
        this.LLILZ = zLJJ;
        if (zLJJ) {
            iLJIIZILJ = -C497740JfY.LJIIZILJ();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        this.LLILZIL = iLJIIZILJ;
        C0UVH c0uvh = C0UVH.DISMISS;
        this.LLJILJIL = c0uvh;
        this.LLJILLL = new C11NJ();
        this.LLJJIII = "click";
        this.LLJJIJIIJIL = c0uvh;
        FrameLayout.inflate(context, R.layout.hsi, this);
        setFitsSystemWindows(true);
        HandlerHook.viewPost(this, new ARunnableS112S0100000_12(this, 298));
        this.LLJJI = VelocityTracker.obtain();
        setClickable(true);
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            setBackgroundColor(C20736316Cj.LIZIZ(R.attr.exk, C1834150xpV.LJII(context)));
        }
    }

    public final void LIZ(long j, String str, boolean z) {
        DataChannel dataChannel;
        C0UVH c0uvh = this.LLJJIJIIJIL;
        C0UVH c0uvh2 = C0UVH.DISMISS;
        if (c0uvh == c0uvh2) {
            return;
        }
        DataChannel dataChannel2 = this.LLJJIJIL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(LiveCenterNativeShowEvent.class, new C782400Umc(str, null, false, null, 8));
        }
        if (z) {
            C786410Ut5.Pd(ObjectAnimator.ofFloat(this, (Property<C782390Umb, Float>) View.TRANSLATION_X, this.LLILZIL).setDuration(j));
        } else {
            float f = this.LLILZIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(f);
        }
        setStatus(c0uvh2);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        if (this.LLJILJIL != c0uvh2) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_leave");
            c474500IjALIZ.LJIJJLI(this.LLJJIJIL);
            c474500IjALIZ.LJJII(this.LLJJIII, "enter_type");
            c474500IjALIZ.LJJII(Long.valueOf(SystemClock.elapsedRealtime() - this.LLILLL), "duration");
            c474500IjALIZ.LIZ();
        }
        this.LLJILJIL = c0uvh2;
        JSONObject jSONObject = new JSONObject();
        w.LIZ.getClass();
        jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
        C389001fE.LIZ("live_anchor_center_mask_will_disappear", jSONObject, System.currentTimeMillis(), false);
        float translationX = 1.0f - (getTranslationX() / this.LLILZIL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(translationX);
        if (this.LLJIJIL && (dataChannel = this.LLJJIJIL) != null) {
            dataChannel.LC0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        DataChannel dataChannel3 = this.LLJJIJIL;
        if (dataChannel3 != null) {
            dataChannel3.zW(PerceptionMessageChannel.class, new C782080Um6(Boolean.FALSE, -1, null));
        }
        this.LLJ = false;
        this.LLJI = false;
        DataChannel dataChannel4 = this.LLJJIJIL;
        if (dataChannel4 != null) {
            dataChannel4.zW(LiveCenterVisibility.class, Boolean.FALSE);
        }
        DataChannel dataChannel5 = this.LLJJIJIL;
        if (dataChannel5 != null) {
            dataChannel5.zW(LiveCenterVisibilityNew.class, new C782420Ume(false, str));
        }
        LJFF("cues_msg_playbook");
        LJFF("live_swipe_left");
        LJFF("realtime_live_center");
    }

    public final void LIZLLL(long j, String str, boolean z) {
        C0UVH c0uvh = this.LLJJIJIIJIL;
        C0UVH c0uvh2 = C0UVH.SHOWING;
        if (c0uvh == c0uvh2) {
            return;
        }
        setStatus(c0uvh2);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        if (z) {
            C786410Ut5.Pd(ObjectAnimator.ofFloat(this, (Property<C782390Umb, Float>) View.TRANSLATION_X, 0.0f).setDuration(j));
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(0.0f);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LLILLL != 0) {
            C1AH6 liveCenterMainViewFromXml = getLiveCenterMainViewFromXml();
            long j2 = (jElapsedRealtime - liveCenterMainViewFromXml.LLJILJIL) / 1000;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("newDuration: ");
            sbLIZ.append((int) C1AH6.LJ(liveCenterMainViewFromXml));
            sbLIZ.append(',');
            sbLIZ.append(j2);
            sbLIZ.append(", ");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append(", ");
            sbLIZ.append(liveCenterMainViewFromXml.LLJILJIL);
            C20441214yg.LIZIZ("LiveCenterMainView", C2188811AlT.LIZIZ(sbLIZ));
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = liveCenterMainViewFromXml.LLJL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                if (sparkContext != null) {
                    sparkContext.LJJJLZIJ(((int) C1AH6.LJ(liveCenterMainViewFromXml)) + ((int) j2), "duration_after_live_take");
                }
                C0J39.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            }
        }
        this.LLILLL = jElapsedRealtime;
        JSONObject jSONObject = new JSONObject();
        w.LIZ.getClass();
        jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
        C389001fE.LIZ("live_anchor_center_mask_will_appear", jSONObject, System.currentTimeMillis(), false);
        InterfaceC772190UQv.f126m3.LJFF(Boolean.FALSE);
        this.LLJILJIL = c0uvh2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        this.LLJIJIL = true;
        DataChannel dataChannel = this.LLJJIJIL;
        if (dataChannel != null) {
            dataChannel.LC0(LiveCenterAlpha.class, Float.valueOf(getAlpha()));
        }
        DataChannel dataChannel2 = this.LLJJIJIL;
        if (dataChannel2 != null) {
            dataChannel2.zW(LiveCenterVisibility.class, Boolean.TRUE);
        }
        DataChannel dataChannel3 = this.LLJJIJIL;
        if (dataChannel3 != null) {
            dataChannel3.zW(LiveCenterVisibilityNew.class, new C782420Ume(true, str));
        }
    }
}
