package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20557115cH {
    public static final boolean LIZ(View view, VideoAdaptionResult videoAdaptionResult) {
        float fFloatValue;
        int height = videoAdaptionResult.getHeight();
        int width = videoAdaptionResult.getWidth();
        Float translateX = videoAdaptionResult.getTranslateX();
        float fFloatValue2 = 0.0f;
        if (translateX != null) {
            fFloatValue = translateX.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Float translateY = videoAdaptionResult.getTranslateY();
        if (translateY != null) {
            fFloatValue2 = translateY.floatValue();
        }
        if (view.getHeight() == height && view.getWidth() == width && ((int) view.getTranslationX()) == ((int) fFloatValue) && ((int) view.getTranslationY()) == ((int) fFloatValue2)) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void LIZIZ(View view, VideoAdaptionResult videoAdaptionResult, final Function0 function0) {
        Float translateY;
        if (C295540BiC.LIZIZ) {
            if (!Intrinsics.LIZ(view.getTranslationY(), videoAdaptionResult.getTranslateY()) && (translateY = videoAdaptionResult.getTranslateY()) != null) {
                C786410Ut5.ed(view, translateY.floatValue());
            }
        } else {
            Float translateX = videoAdaptionResult.getTranslateX();
            if (translateX != null) {
                C786410Ut5.Jc(view, translateX.floatValue());
            }
            Float translateY2 = videoAdaptionResult.getTranslateY();
            if (translateY2 != null) {
                C786410Ut5.ed(view, translateY2.floatValue());
            }
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.15ck
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.removeOnLayoutChangeListener(this);
                function0.invoke();
            }
        });
        int width = videoAdaptionResult.getWidth();
        int height = videoAdaptionResult.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height == height && layoutParams.width == width) {
                return;
            }
            layoutParams.height = height;
            layoutParams.width = width;
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
