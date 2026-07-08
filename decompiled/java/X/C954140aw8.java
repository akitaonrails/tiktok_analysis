package X;

import Y.AAListenerS267S0200000_15;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954140aw8 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZJ() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            return 0L;
        }
        return room.getId();
    }

    public static long LIZIZ() {
        String strU3;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
            return 0L;
        }
        return CastLongProtector.parseLong(strU3);
    }

    public static void LIZLLL(C1105630esT c1105630esT) {
        if (c1105630esT != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1105630esT, "scaleX", 1.0f, 1.3f);
            objectAnimatorOfFloat.setDuration(250L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1105630esT, "scaleX", 1.3f, 1.0f);
            objectAnimatorOfFloat2.setDuration(250L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1105630esT, "scaleY", 1.0f, 1.3f);
            objectAnimatorOfFloat3.setDuration(250L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1105630esT, "scaleY", 1.3f, 1.0f);
            objectAnimatorOfFloat4.setDuration(250L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat3);
            animatorSet.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4).after(objectAnimatorOfFloat);
            animatorSet.start();
        }
    }

    public static void LIZ(View view, Function0 function0) {
        C786410Ut5.T4(view, 0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.play(objectAnimatorOfFloat2).after(objectAnimatorOfFloat);
        animatorSet.addListener(new AAListenerS267S0200000_15(function0, function0, 10));
        animatorSet.start();
    }
}
