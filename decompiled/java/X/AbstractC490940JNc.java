package X;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC490940JNc extends C0JN0 implements C0JN1, C0JO2 {
    public C491160JNy LLILLL;

    public abstract int getSeekbarDefaultPlayMode();

    @Override // X.C0JO2
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public final C491160JNy getSeekbarContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ujo);
            this.LLILLL = (C491160JNy) callbackFindViewById;
        }
        return (C491160JNy) callbackFindViewById;
    }

    @Override // X.C0JN0
    public void LIZ() {
        C23250099c.LIZLLL(getCoroutineScope(), null, null, new C490960JNe(this, null), 3);
    }

    @Override // X.C0JN0
    public void LIZIZ() {
        int seekbarDefaultPlayMode = getSeekbarDefaultPlayMode();
        C491160JNy seekbarContainer = getSeekbarContainer();
        if (seekbarContainer != null) {
            seekbarContainer.setSeekbarChangeListener(this);
        }
        C491160JNy seekbarContainer2 = getSeekbarContainer();
        if (seekbarContainer2 != null) {
            seekbarContainer2.setDefaultPlayMode(seekbarDefaultPlayMode);
        }
        C491160JNy seekbarContainer3 = getSeekbarContainer();
        if (seekbarContainer3 != null) {
            seekbarContainer3.setSeekbarShowType(seekbarDefaultPlayMode);
        }
        C491160JNy seekbarContainer4 = getSeekbarContainer();
        if (seekbarContainer4 != null) {
            seekbarContainer4.setDuration(getPlayerChannel().LIZIZ());
        }
    }

    public final void LIZLLL() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.setRequestedOrientation(C500260Jjc.LJJII(getPlayerChannel().LJIIJ.getValue().intValue()) ? 1 : 0);
    }

    public AbstractC490940JNc(Context context) {
        super(context, null);
    }

    @Override // X.C0JO2
    public void onStartTrackingTouch(SeekBar seekBar) {
        getPlayerChannel().LJII.setValue(Boolean.TRUE);
    }

    @Override // X.C0JO2
    public void onStopTrackingTouch(SeekBar seekBar) {
        C23250099c.LIZLLL(getCoroutineScope(), null, null, new C490950JNd(seekBar, this, null), 3);
    }

    public final void setSeekbarContainer(C491160JNy c491160JNy) {
        this.LLILLL = c491160JNy;
    }
}
