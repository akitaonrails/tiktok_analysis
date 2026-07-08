package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;

/* JADX INFO: renamed from: X.11AF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11AF extends View {
    public abstract void LIZ(int i, int i2);

    public abstract void LIZIZ(AVMusicWaveBean aVMusicWaveBean, int i);

    public abstract int getMovableWidth();

    public abstract int getStopPosition();

    public abstract void setOnProgressChangeListener(InterfaceC19457511An interfaceC19457511An);

    public abstract void setPastPosition(int i);

    public abstract void setProgress(int i);

    public abstract void setStopPosition(int i);

    public abstract void setTotalTime(long j);

    public abstract void setWavForm(Bitmap bitmap);

    public C11AF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C11AF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }
}
