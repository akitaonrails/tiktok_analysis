package X;

import android.graphics.Canvas;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Ecw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC368720Ecw {
    public static final C367890Ebb LJLLLLLL = C367890Ebb.LIZ;

    boolean LIZ();

    void LIZIZ(int i);

    void LIZJ(int i);

    void LIZLLL(boolean z);

    boolean LJ();

    int LJI();

    void LJII(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, C0E6E c0e6e);

    void LJIIIIZZ(int i);

    void destroy();

    View getView();

    void setClipping(boolean z);

    void setDrawDivider(boolean z);

    void setItemSelected(boolean z);

    void setSegment(NLETrackSlot nLETrackSlot);

    void setTimelineScale(float f);
}
