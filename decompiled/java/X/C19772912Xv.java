package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.LoadingCell;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.ResultV1Cell;

/* JADX INFO: renamed from: X.12Xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19772912Xv extends ViewOutlineProvider {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            case 2:
                getOutline$2(this, view, outline);
                break;
            case 3:
                getOutline$3(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C19772912Xv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C19772912Xv c19772912Xv, View view, Outline outline) {
        float aspectRatio = ((C11FN) c19772912Xv.l0).getAspectRatio();
        float height = ((C11FN) c19772912Xv.l0).getHeight();
        float width = ((C11FN) c19772912Xv.l0).getWidth();
        if (height != 0.0f) {
            float f = height * aspectRatio;
            float f2 = (width - f) / 2;
            outline.setRoundRect((int) f2, 0, (int) (f2 + f), ((C11FN) c19772912Xv.l0).getBottom(), C12ES.LIZJ(4.3f, ((C11FN) c19772912Xv.l0).getContext()));
        }
    }

    public static final void getOutline$1(C19772912Xv c19772912Xv, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Number) ((LoadingCell) c19772912Xv.l0).LLJ.getValue()).floatValue());
    }

    public static final void getOutline$2(C19772912Xv c19772912Xv, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((Number) ((ResultV1Cell) c19772912Xv.l0).LLILZ.getValue()).floatValue());
    }

    public static final void getOutline$3(C19772912Xv c19772912Xv, View view, Outline outline) {
        float aspectRatio = ((C11FO) c19772912Xv.l0).getAspectRatio();
        float height = ((C11FO) c19772912Xv.l0).getHeight();
        float width = ((C11FO) c19772912Xv.l0).getWidth();
        if (height != 0.0f) {
            float f = height * aspectRatio;
            float f2 = (width - f) / 2;
            outline.setRoundRect((int) f2, 0, (int) (f2 + f), ((C11FO) c19772912Xv.l0).getBottom(), C12ES.LIZJ(4.3f, ((C11FO) c19772912Xv.l0).getContext()));
        }
    }
}
