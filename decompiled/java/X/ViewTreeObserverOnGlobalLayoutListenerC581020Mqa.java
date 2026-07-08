package X;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC581020Mqa implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC581020Mqa viewTreeObserverOnGlobalLayoutListenerC581020Mqa) {
        C526910KlV c526910KlV = (C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0;
        if (c526910KlV.LLLLLLLLL == 0) {
            c526910KlV.LLLLLLLLL = ((TikTokMediaModel) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l1).clipDuration;
        }
        float f = c526910KlV.LLLLLLLLL / c526910KlV.LLLLLLL;
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX = c526910KlV.LLJLIL;
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = null;
        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX == null) {
            viewTreeObserverOnGlobalLayoutListenerC526930KlX = null;
        }
        float scrollRange = f * viewTreeObserverOnGlobalLayoutListenerC526930KlX.getScrollRange();
        C526910KlV c526910KlV2 = (C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0;
        float f2 = c526910KlV2.LLLLLLJ;
        MediaModel mediaModel = c526910KlV2.LLLLLL;
        if (mediaModel == null) {
            mediaModel = null;
        }
        float f3 = f2 / mediaModel.duration;
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX3 = c526910KlV2.LLJLIL;
        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX3 == null) {
            viewTreeObserverOnGlobalLayoutListenerC526930KlX3 = null;
        }
        int scrollRange2 = (int) (f3 * viewTreeObserverOnGlobalLayoutListenerC526930KlX3.getScrollRange());
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX4 = ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLJLIL;
        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX4 == null) {
            viewTreeObserverOnGlobalLayoutListenerC526930KlX4 = null;
        }
        viewTreeObserverOnGlobalLayoutListenerC526930KlX4.LIZ((int) scrollRange, scrollRange2);
        if (((TikTokMediaModel) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l1).selectIndex >= 0 || ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLIILL.isEditorProReplace) {
            ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).getClass();
            PreviewVideoScene previewVideoSceneLLLLLILLIL = ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLLILLIL();
            if (previewVideoSceneLLLLLILLIL != null) {
                previewVideoSceneLLLLLILLIL.LLLLLLLLL(new Pair<>(Integer.valueOf(((TikTokMediaModel) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l1).startTime), Integer.valueOf((int) (((long) ((TikTokMediaModel) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l1).startTime) + ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLLLLLL))));
            }
            PreviewVideoScene previewVideoSceneLLLLLILLIL2 = ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLLILLIL();
            if (previewVideoSceneLLLLLILLIL2 != null) {
                previewVideoSceneLLLLLILLIL2.LLLLLLIL();
            }
            ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLZLL();
        }
        ViewTreeObserverOnGlobalLayoutListenerC526930KlX viewTreeObserverOnGlobalLayoutListenerC526930KlX5 = ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLJLIL;
        if (viewTreeObserverOnGlobalLayoutListenerC526930KlX5 != null) {
            viewTreeObserverOnGlobalLayoutListenerC526930KlX2 = viewTreeObserverOnGlobalLayoutListenerC526930KlX5;
        }
        C786410Ut5.C3(viewTreeObserverOnGlobalLayoutListenerC526930KlX2.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC581020Mqa);
        C526910KlV c526910KlV3 = (C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0;
        if (c526910KlV3.LLLLIILL.isEditorProReplace && !c526910KlV3.LLLLLLZ) {
            C0LAB c0labLIZ = C375070EnB.LIZ((Bundle) c526910KlV3.LLLLZI.getValue(), String.valueOf(((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLLLLLL));
            if (c0labLIZ != null) {
                C20684815ws.LJIILLIIL("choose_longer_video_replace_preview", c0labLIZ.LIZ);
            }
            ((C526910KlV) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).LLLLLLZ = true;
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC581020Mqa viewTreeObserverOnGlobalLayoutListenerC581020Mqa) {
        if (((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).getWidth() > 0 && ((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).getHeight() > 0) {
            C786410Ut5.C3(((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC581020Mqa);
            ((Function0) viewTreeObserverOnGlobalLayoutListenerC581020Mqa.l1).invoke();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC581020Mqa(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
