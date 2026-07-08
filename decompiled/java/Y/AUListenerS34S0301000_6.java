package Y;

import X.C013C;
import X.C13LZ;
import X.C19ME;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2441009hQ;
import X.C416760GVu;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.tools.chat.room.scene.AiChatRoomRootScene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS34S0301000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS34S0301000_6 aUListenerS34S0301000_6, ValueAnimator valueAnimator) {
        AiChatRoomRootScene aiChatRoomRootScene = (AiChatRoomRootScene) aUListenerS34S0301000_6.l0;
        View view = aiChatRoomRootScene.mView;
        if (view != null) {
            C786410Ut5.ed(view, ((Number) aiChatRoomRootScene.LLJJJJLIIL.getValue()).floatValue() - (((Number) ((AiChatRoomRootScene) aUListenerS34S0301000_6.l0).LLJJJJLIIL.getValue()).floatValue() * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C13LZ.LIZLLL(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f, 1.0f) * aUListenerS34S0301000_6.i3);
        Integer num = (Integer) aUListenerS34S0301000_6.l1;
        if (num != null) {
            View view2 = (View) aUListenerS34S0301000_6.l2;
            num.intValue();
            if (view2 != null) {
                view2.setBackgroundColor(C2441009hQ.LJIIL(num.intValue(), iLIZIZ));
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS34S0301000_6 aUListenerS34S0301000_6, ValueAnimator valueAnimator) {
        Drawable drawableMutate;
        CharSequence charSequenceLIZIZ;
        if (valueAnimator.getAnimatedFraction() >= 0.8f) {
            C013C c013c = (C013C) aUListenerS34S0301000_6.l0;
            if (c013c.element) {
                c013c.element = false;
                TextView textView = (TextView) aUListenerS34S0301000_6.l1;
                View view = (View) aUListenerS34S0301000_6.l2;
                int i = aUListenerS34S0301000_6.i3;
                if (i > 0 && textView != null) {
                    C500260Jjc.LLFFF(textView);
                    C786410Ut5.S4(0.0f, textView);
                    C19ME c19me = (C19ME) textView.getLayoutParams();
                    if (view != null) {
                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = 0;
                        C786410Ut5.g6(textView, c19me);
                    }
                    if (view == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('+');
                        sbLIZ.append(i);
                        charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('+');
                        sbLIZ2.append(i);
                        sbLIZ2.append(" _");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
                        if (drawableLJIIJ != null && (drawableMutate = drawableLJIIJ.mutate()) != null) {
                            drawableMutate.setBounds(0, 0, C439101nJ.LIZ(16), C439101nJ.LIZ(16));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
                            int length = spannableStringBuilder.length() - 1;
                            C786410Ut5.q2(spannableStringBuilder, new C416760GVu(drawableMutate), length, length + 1, 17);
                            charSequenceLIZIZ = spannableStringBuilder;
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append('+');
                            sbLIZ3.append(i);
                            charSequenceLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    }
                    textView.setText(charSequenceLIZIZ);
                    HandlerHook.viewPost(textView, new ARunnableS39S0300000_6(view, textView, c19me, 16));
                }
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS34S0301000_6 aUListenerS34S0301000_6, ValueAnimator valueAnimator) {
        ((Matrix) aUListenerS34S0301000_6.l0).setTranslate(((valueAnimator.getAnimatedFraction() * 3) - 2) * ((C21415018rM) aUListenerS34S0301000_6.l1).getWidth() * aUListenerS34S0301000_6.i3, 0.0f);
        ((LinearGradient) aUListenerS34S0301000_6.l2).setLocalMatrix((Matrix) aUListenerS34S0301000_6.l0);
        ((C21415018rM) aUListenerS34S0301000_6.l1).invalidate();
    }

    public AUListenerS34S0301000_6(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
