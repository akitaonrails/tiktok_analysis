package X;

import Y.ARunnableS112S0100000_12;
import Y.AfS148S0200000_12;
import android.content.Context;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectHouseInfoRequestTimeoutSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS51S0200100_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: renamed from: X.0UDG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDG extends LinearLayout {
    public final String LL;
    public LiveEffect LLILLJJLI;
    public Function0<Unit> LLILLL;
    public boolean LLILZ;
    public final ImageView LLILZIL;
    public final View LLILZLL;
    public final C427340GpI LLIZ;
    public boolean LLIZLLLIL;
    public final ARunnableS112S0100000_12 LLJ;

    public final void LIZ() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_info_show");
        c474500IjALIZ.LJIL();
        LiveEffect liveEffect = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEffect != null ? Long.valueOf(liveEffect.getEffectId()) : null, "sticker_id");
        LiveEffect liveEffect2 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEffect2 != null ? liveEffect2.getResourceId() : null, "resource_id");
        LiveEffect liveEffect3 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(liveEffect3 != null ? liveEffect3.getName() : null, "sticker_name");
        LiveEffect liveEffect4 = this.LLILLJJLI;
        c474500IjALIZ.LJJII(Integer.valueOf(liveEffect4 != null ? liveEffect4.getSource() : 0), "source");
        c474500IjALIZ.LJJII(this.LLILZ ? "done" : "failed", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ() {
        this.LLILZIL.clearAnimation();
        this.LLILZIL.setImageResource(R.drawable.efv);
    }

    public final void LIZIZ(final LiveEffect liveEffect) {
        boolean z;
        String name;
        this.LLILLJJLI = liveEffect;
        if (liveEffect == null) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        this.LLILZ = false;
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        if (C760060Trg.LIZ(liveEffect)) {
            this.LLILZIL.setImageResource(R.drawable.eg7);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(2000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.LLILZIL.startAnimation(rotateAnimation);
            HandlerHook.viewRemoveCallbacks(this, this.LLJ);
            HandlerHook.viewPostDelay(this, this.LLJ, LiveEffectHouseInfoRequestTimeoutSetting.INSTANCE.getTimeoutMs());
            final AwS51S0200100_12 awS51S0200100_12 = new AwS51S0200100_12(System.currentTimeMillis(), this, liveEffect, 0);
            final String strLJJLIIIJL = liveEffect.LJJLIIIJL();
            if (strLJJLIIIJL == null || strLJJLIIIJL.length() == 0) {
                return;
            }
            ConcurrentHashMap<String, C0UDJ> concurrentHashMap = C0UDI.LIZ;
            if (concurrentHashMap.containsKey(strLJJLIIIJL)) {
                awS51S0200100_12.invoke(liveEffect, concurrentHashMap.get(strLJJLIIIJL));
                return;
            } else {
                UserService.getInstance().user().LJIJJ(CastLongProtector.parseLong(strLJJLIIIJL), "EffectHouseHelper_getUserInfoById").LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0UDH
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("EffectHouseHelper@db0c.getDesignerInfo$ignored$1");
                        User user = (User) obj;
                        String strLIZ = C0KVU.LIZ(user);
                        user.getAvatarThumb();
                        C0UDJ c0udj = new C0UDJ(strLIZ);
                        C0UDI.LIZ.put(strLJJLIIIJL, c0udj);
                        Function2<LiveEffect, C0UDJ, Unit> function2 = awS51S0200100_12;
                        if (function2 != null) {
                            function2.invoke(liveEffect, c0udj);
                        }
                        C1C7U.LIZIZ("EffectHouseHelper@db0c.getDesignerInfo$ignored$1");
                    }
                }, new AfS148S0200000_12(awS51S0200100_12, liveEffect, 10));
                return;
            }
        }
        if (liveEffect.getSource() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LLILZ = true;
            LIZJ();
            if (C767250U7v.LJ(liveEffect)) {
                name = liveEffect.LJJIJLIJ();
            } else {
                name = liveEffect.getName();
            }
            if (name == null) {
                this.LLIZ.setText(C497740JfY.LJIJI(2131841503));
            } else {
                this.LLIZ.setText(C497740JfY.LJIJJ(2131841504, BidiFormatter.getInstance(C497740JfY.LJJ()).unicodeWrap(name), BidiFormatter.getInstance(C497740JfY.LJJ()).unicodeWrap(this.LL)));
            }
            this.LLIZ.LJJJJI();
            LIZ();
            return;
        }
        this.LLILZ = true;
        LIZJ();
        this.LLIZ.setText(C497740JfY.LJIJI(2131841503));
        this.LLIZ.LJJJJI();
        LIZ();
    }

    public final void setClickListener(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public C0UDG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = "TikTok";
        LinearLayout.inflate(context, R.layout.geo, this);
        this.LLILZIL = (ImageView) findViewById(R.id.w1a);
        View viewFindViewById = findViewById(R.id.gwn);
        this.LLILZLL = viewFindViewById;
        this.LLIZ = (C427340GpI) findViewById(R.id.gwo);
        C786410Ut5.I7(new AbS694S0100000_12(this, 26), viewFindViewById);
        this.LLJ = new ARunnableS112S0100000_12(this, 244);
    }
}
