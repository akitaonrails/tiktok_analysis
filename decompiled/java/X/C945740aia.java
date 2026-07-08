package X;

import Y.ALAdapterS11S0100000_15;
import Y.AfS184S0100000_15;
import Y.AkS477S0100000_15;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnhanceInviteSenseSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945740aia extends C1295960jpS {
    public C11JF LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public final HashMap<String, Boolean> LLILZIL;
    public final String LLILZLL;

    public final synchronized void play() {
        if (this.LLILZ) {
            super.playAnimation();
        }
    }

    public final boolean LJ() {
        Boolean bool = this.LLILZIL.get("image_0");
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) || !Intrinsics.LJFF(this.LLILZIL.get("image_1"), bool2)) {
            return false;
        }
        C934690aQl c934690aQl = C934690aQl.LIZ;
        return c934690aQl.LIZJ("image_0") && c934690aQl.LIZJ("image_1");
    }

    public final void LJFF() {
        int i = this.LLILLL;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            setMinAndMaxProgress(0.884058f, 1.0f);
            setRepeatCount(0);
            play();
        } else {
            setMinAndMaxProgress(0.0f, 0.23188405f);
            setRepeatCount(0);
            LJII();
        }
        this.LLILLL = 0;
    }

    public final void LJI() {
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (this.LLILLL == 1) {
            return;
        }
        setMinAndMaxProgress(0.36231884f, 0.85507244f);
        setRepeatCount(-1);
        LJII();
        this.LLILLL = 1;
    }

    public final void LJII() {
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LL = (C11JF) C11NZ.LJIJJLI(new C987240bnW(this, 4)).LJJJ(new AkS477S0100000_15(this, 3), false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS184S0100000_15(this, 49), new AfS184S0100000_15(this, 50));
    }

    public final LinkPlayerInfo getAnchorInfo() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return null;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId:");
        sbLIZ.append(room.getId());
        sbLIZ.append(", roomOwner:");
        sbLIZ.append(room.getOwner().getId());
        C20441214yg.LIZIZ("MultiGuestV3ApplyInfoView", C2188811AlT.LIZIZ(sbLIZ));
        linkPlayerInfo.LIZ = 2;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.mUser = owner;
        return linkPlayerInfo;
    }

    @Override // X.C1295960jpS
    public final void playAnimation() {
        if (this.LLILLJJLI) {
            cancelAnimation();
            this.LLILLJJLI = false;
        }
        super.playAnimation();
        this.LLILLJJLI = true;
    }

    @Override // X.C1295960jpS, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C20597815iq.LIZ(this);
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C945740aia(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C945740aia(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        this.LLILLL = -1;
        this.LLILZIL = new HashMap<>();
        if (MultiGuestEnhanceInviteSenseSetting.isEnabled()) {
            str = "live_audience_link_mic_panel_apply_lottie_v2.zip";
        } else {
            str = "live_audience_link_mic_panel_apply_lottie.zip";
        }
        this.LLILZLL = str;
        addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0aib
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                C934690aQl c934690aQl = C934690aQl.LIZ;
                if (c934690aQl.LIZJ("image_0") && c934690aQl.LIZJ("image_1")) {
                    this.LL.updateBitmap("image_0", C934690aQl.LIZ("image_0", true));
                    this.LL.updateBitmap("image_1", C934690aQl.LIZ("image_1", true));
                }
            }
        });
        addAnimatorListener(new ALAdapterS11S0100000_15(this, 2));
    }

    public final void LJIIIIZZ(ImageModel imageModel, String str, Function1<? super Boolean, Unit> function1) {
        if (C934690aQl.LIZ.LIZJ(str)) {
            HashMap<String, Boolean> map = this.LLILZIL;
            Boolean bool = Boolean.TRUE;
            map.put(str, bool);
            function1.invoke(bool);
            return;
        }
        C934690aQl.LJFF(imageModel, str, 192.0f, true, C497740JfY.LJJ(), new C1934207hs(this, str, function1));
    }
}
