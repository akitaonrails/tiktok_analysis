package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.12Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19763912Uj extends FrameLayout implements InterfaceC19767412Vs {
    public boolean LL;

    public abstract /* synthetic */ int getCurrentRotate();

    public abstract /* synthetic */ float getCurrentSpeed();

    public abstract /* synthetic */ int getEditState();

    public abstract View getEndSlide();

    public abstract /* synthetic */ long getLeftSeekingValue();

    public abstract /* synthetic */ long getMaxCutDuration();

    public abstract /* synthetic */ long getMultiPlayingPosition();

    public abstract /* synthetic */ long getMultiSeekTime();

    public abstract /* synthetic */ C0WIY<Long, Long> getPlayBoundary();

    public abstract /* synthetic */ long getPlayingPosition();

    public abstract /* synthetic */ long getRightSeekingValue();

    public abstract /* synthetic */ float getSelectedTime();

    public abstract /* synthetic */ long getSinglePlayingPosition();

    public abstract /* synthetic */ long getSingleSeekTime();

    public abstract /* synthetic */ C0WIY<Float, Float> getSlideX();

    public abstract View getStartSlide();

    public abstract /* synthetic */ void setCanEdit(boolean z);

    public abstract /* synthetic */ void setCurrentRotate(int i);

    public abstract /* synthetic */ void setDefaultMode(boolean z);

    public void setEditViewHeight(boolean z) {
    }

    public abstract /* synthetic */ void setExtractFramesInRoughMode(boolean z);

    public abstract /* synthetic */ void setLoadThumbnailDirectly(boolean z);

    public abstract /* synthetic */ void setMaxVideoLength(long j);

    public abstract /* synthetic */ void setMinVideoLength(long j);

    public abstract /* synthetic */ void setMultiEditEnableForStickPointMode(boolean z);

    public abstract /* synthetic */ void setUseCustomMaxVideoLengthDirectly(boolean z);

    public AbstractC19763912Uj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC19763912Uj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
