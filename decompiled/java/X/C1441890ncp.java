package X;

import Y.AObserverS173S0200000_8;
import Y.AObserverS225S0100000_22;
import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import dmt.av.video.VEPreviewParams;

/* JADX INFO: renamed from: X.0ncp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441890ncp extends C1441880nco {
    public NLETrack LJIIL;

    public C1441890ncp(int i, boolean z, int i2) {
        super(i, z, i2);
    }

    public final void LIZ(Context context, LifecycleOwner lifecycleOwner, SurfaceView surfaceView) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = surfaceView;
        LiveData<VEPreviewParams> liveData = this.LIZLLL;
        if (liveData != null) {
            liveData.observe(lifecycleOwner, new AObserverS173S0200000_8(lifecycleOwner, this, 7));
        }
        LiveData<C1452730nuJ> liveData2 = this.LJ;
        if (liveData2 != null) {
            liveData2.observe(lifecycleOwner, new AObserverS225S0100000_22(this, 157));
        }
        this.LIZIZ = lifecycleOwner;
        this.LIZ = context;
        this.LIZJ = surfaceView;
        if (this.LJIIJ) {
            this.LJIIIIZZ.observe(lifecycleOwner, new AObserverS225S0100000_22(this, 158));
        }
    }
}
