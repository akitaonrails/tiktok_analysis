package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.game.broadcast.widget.PhoneAsCameraSurfaceWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Usk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786200Usk implements InterfaceC1142670fqD {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(C786200Usk c786200Usk) {
    }

    public static final void LIZ$1(C786200Usk c786200Usk) {
    }

    public static final void LIZ$3(C786200Usk c786200Usk) {
    }

    public static final void LIZ$4(C786200Usk c786200Usk) {
    }

    public static final void LIZIZ$0(C786200Usk c786200Usk, Animatable animatable) {
    }

    public static final void LIZIZ$1(C786200Usk c786200Usk, Animatable animatable) {
    }

    public static final void LIZIZ$3(C786200Usk c786200Usk, Animatable animatable) {
    }

    public static final void LIZIZ$4(C786200Usk c786200Usk, Animatable animatable) {
    }

    public static final void LIZJ$0(C786200Usk c786200Usk, int i, int i2, String str) {
    }

    public static final void LIZLLL$3(C786200Usk c786200Usk, String str, Exception exc) {
    }

    public static final void LIZLLL$4(C786200Usk c786200Usk, String str, Exception exc) {
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, animatable);
                break;
            case 1:
                LIZIZ$1(this, animatable);
                break;
            case 2:
                C20441214yg.LIZIZ("EffectMonitor#image", "onHandleAnim");
                break;
            case 3:
                LIZIZ$3(this, animatable);
                break;
            case 4:
                LIZIZ$4(this, animatable);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, i, i2, str);
                break;
            case 1:
                LIZJ$1(this, i, i2, str);
                break;
            case 2:
                LIZJ$2(this, i, i2, str);
                break;
            case 3:
                LIZJ$3(this, i, i2, str);
                break;
            case 4:
                LIZJ$4(this, i, i2, str);
                break;
        }
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, exc);
                break;
            case 1:
                LIZLLL$1(this, str, exc);
                break;
            case 2:
                LIZLLL$2(this, str, exc);
                break;
            case 3:
                LIZLLL$3(this, str, exc);
                break;
            case 4:
                LIZLLL$4(this, str, exc);
                break;
        }
    }

    public static final void LIZ$2(C786200Usk c786200Usk) {
        String strLJJLIIIJ;
        List<String> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStart ");
        UrlModel icon = ((LiveEffect) c786200Usk.l0).getIcon();
        if (icon != null && (list = icon.urlList) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS245S0000000_12.get$arr$(101), 31);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        C20441214yg.LIZIZ("EffectMonitor#image", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C786200Usk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C786200Usk c786200Usk, String str, Exception exc) {
        C1CC2.LIZ("CommunityFlagCommentAvatarLoad", exc);
        ((C759320TqU) c786200Usk.l0).LLIZ.setActualImageResource(R.drawable.el9);
    }

    public static final void LIZLLL$1(C786200Usk c786200Usk, String str, Exception exc) {
        String message;
        String strLIZ = C0TBM.LIZ(106);
        if (exc != null) {
            message = exc.getMessage();
        } else {
            message = null;
        }
        C1AZW.LJFF(strLIZ, "load banner failed,", message, null);
    }

    public static final void LIZLLL$2(C786200Usk c786200Usk, String str, Exception exc) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFail: ");
        sbLIZ.append(str);
        sbLIZ.append(", exception: ");
        if (exc != null) {
            message = exc.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("EffectMonitor#image", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ$1(C786200Usk c786200Usk, int i, int i2, String str) {
        C500260Jjc.LJLJLJ((View) ((C930070aJJ) c786200Usk.l0).LLILZIL.getValue(), true);
    }

    public static final void LIZJ$2(C786200Usk c786200Usk, int i, int i2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuc: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("EffectMonitor#image", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ$3(C786200Usk c786200Usk, int i, int i2, String str) {
        ((PhoneAsCameraSurfaceWidget) c786200Usk.l0).LLIZLLLIL = true;
    }

    public static final void LIZJ$4(C786200Usk c786200Usk, int i, int i2, String str) {
        if (!LiveBroadcastPictureMemOpt.fitStickerPanelImageSize() && Intrinsics.LJFF(((C0U6K) c786200Usk.l0).itemView.getTag(), 2)) {
            C0U6K c0u6k = (C0U6K) c786200Usk.l0;
            HandlerHook.viewPost(c0u6k.itemView, new RunnableC514801zW(c0u6k, 161));
        }
    }
}
