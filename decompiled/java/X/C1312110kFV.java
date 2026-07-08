package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1312110kFV extends AnimatorListenerAdapter {
    public static final Map<String, Object> LLILLL;
    public final WeakReference<LynxBaseUI> LL;
    public final int LLILLJJLI;

    static {
        HashMap map = new HashMap();
        LLILLL = map;
        map.put("animation_type", "transition");
    }

    public final void LIZ(String str) {
        String str2;
        LynxBaseUI lynxBaseUI = this.LL.get();
        if (lynxBaseUI == null) {
            return;
        }
        if (lynxBaseUI instanceof UIShadowProxy) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
        }
        if (lynxBaseUI.getEvents() != null && lynxBaseUI.getEvents().containsKey(str)) {
            Map<String, Object> map = LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("transition-");
            int i = this.LLILLJJLI;
            if (i != 1) {
                if (i != 2) {
                    switch (i) {
                        case 4:
                            str2 = "scaleY";
                            break;
                        case 8:
                            str2 = "scaleXY";
                            break;
                        case 16:
                            str2 = "width";
                            break;
                        case 32:
                            str2 = "height";
                            break;
                        case 64:
                            str2 = "background-color";
                            break;
                        case 128:
                            str2 = "visibility";
                            break;
                        case 256:
                            str2 = "left";
                            break;
                        case 512:
                            str2 = "top";
                            break;
                        case 1024:
                            str2 = "right";
                            break;
                        case SpeechEngineDefines.ASR_WORK_MODE_OFFLINE /* 2048 */:
                            str2 = "bottom";
                            break;
                        case SpeechEngineDefines.TTS_WORK_MODE_BOTH /* 4096 */:
                            str2 = "transform";
                            break;
                        default:
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Unsupported animated property: ");
                            sbLIZ2.append(i);
                            LynxLog.DTHROW(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2)));
                            str2 = "none";
                            break;
                    }
                } else {
                    str2 = "scaleX";
                }
            } else {
                str2 = "opacity";
            }
            sbLIZ.append(str2);
            ((HashMap) map).put("animation_type", C2188811AlT.LIZIZ(sbLIZ));
            lynxBaseUI.mContext.LLIZ.LIZIZ(new C1298700jts(lynxBaseUI.getSign(), str, map));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        LIZ("transitionend");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        LIZ("transitionstart");
    }

    public C1312110kFV(LynxBaseUI lynxBaseUI, int i) {
        this.LL = new WeakReference<>(lynxBaseUI);
        this.LLILLJJLI = i;
    }
}
