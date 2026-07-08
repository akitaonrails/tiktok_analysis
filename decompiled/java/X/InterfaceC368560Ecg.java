package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Ecg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC368560Ecg {
    void LIZIZ(int i);

    void LJI(Canvas canvas);

    boolean LJII();

    int getBgColor();

    RectF getClipRectF();

    float getClipStart();

    void setBgColor(int i);

    void setBgRadius(int i);

    void setClipLength(float f);

    void setClipRectF(RectF rectF);

    void setClipStart(float f);

    void setClipping(boolean z);

    void setDrawDivider(boolean z);

    void setItemSelected(boolean z);

    void setSegment(NLETrackSlot nLETrackSlot);

    void setTimelineScale(float f);

    void setTrackStyle(C0E6E c0e6e);
}
