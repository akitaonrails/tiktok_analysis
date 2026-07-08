package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: renamed from: X.0jJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1276290jJj implements InterfaceC774130UYh, InterfaceC1276300jJk, InterfaceC783280Uo2 {
    public static final String TAG = C1276290jJj.class.getName();
    public InterfaceC783280Uo2 mErrorListener;
    public InterfaceC1276300jJk mListener;
    public boolean mLoop;
    public C774530UZv mMetaData = new TEBundle() { // from class: X.0UZv
    };

    public long getCurrentPlaybackTimeMs() {
        return 0L;
    }

    public float getVolume() {
        return 0.0f;
    }

    @Override // X.InterfaceC774130UYh
    public boolean isPlaying() {
        return false;
    }

    public boolean isSystemMediaPlayer() {
        return false;
    }

    public boolean isTTPlayer() {
        return false;
    }

    @Override // X.InterfaceC774130UYh
    public void pause() {
    }

    @Override // X.InterfaceC774130UYh
    public void prepare() {
    }

    public void prepareAsync() {
    }

    @Override // X.InterfaceC774130UYh
    public void release() {
    }

    public void seekTo(long j) {
    }

    public void setConnectTimeoutMs(long j) {
    }

    @Override // X.InterfaceC774130UYh
    public void setDataSource(Context context, String str) {
    }

    public void setDisplay(Surface surface) {
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    public boolean setExternalNativeAudioRender(long j) {
        return false;
    }

    @Override // X.InterfaceC774130UYh
    public void setMixerEnable(boolean z) {
    }

    public int setOption(Object obj, Object obj2) {
        return -1;
    }

    public void setReconnectCounts(int i) {
    }

    public void setReconnectDelayMaxMs(long j) {
    }

    @Override // X.InterfaceC774130UYh
    public void setVolume(float f) {
    }

    @Override // X.InterfaceC774130UYh
    public void start() {
    }

    @Override // X.InterfaceC774130UYh
    public void stop() {
    }

    public C774530UZv getMetaData() {
        return this.mMetaData;
    }

    public boolean isLoop() {
        return this.mLoop;
    }

    @Override // X.InterfaceC1276300jJk
    public void onCompletion(InterfaceC774130UYh interfaceC774130UYh) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onCompletion(this);
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCompletion this ");
        sbLIZ.append(interfaceC774130UYh);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC774130UYh
    public void setErrorListener(InterfaceC783280Uo2 interfaceC783280Uo2) {
        this.mErrorListener = interfaceC783280Uo2;
    }

    @Override // X.InterfaceC774130UYh
    public void setEventListener(InterfaceC1276300jJk interfaceC1276300jJk) {
        this.mListener = interfaceC1276300jJk;
    }

    @Override // X.InterfaceC774130UYh
    public void setLoop(boolean z) {
        this.mLoop = z;
    }

    @Override // X.InterfaceC1276300jJk
    public void onPause(InterfaceC774130UYh interfaceC774130UYh, int i) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onPause(this, i);
        }
    }

    @Override // X.InterfaceC1276300jJk
    public void onPrepared(InterfaceC774130UYh interfaceC774130UYh, int i) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onPrepared(this, i);
        }
    }

    @Override // X.InterfaceC1276300jJk
    public void onProgress(InterfaceC774130UYh interfaceC774130UYh, long j) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onProgress(this, j);
        }
    }

    @Override // X.InterfaceC1276300jJk
    public void onStarted(InterfaceC774130UYh interfaceC774130UYh, int i) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onStarted(this, i);
        }
    }

    @Override // X.InterfaceC1276300jJk
    public void onStop(InterfaceC774130UYh interfaceC774130UYh, int i) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onStop(this, i);
        }
    }

    @Override // X.InterfaceC783280Uo2
    public void onError(InterfaceC774130UYh interfaceC774130UYh, int i, Exception exc) {
        InterfaceC783280Uo2 interfaceC783280Uo2 = this.mErrorListener;
        if (interfaceC783280Uo2 != null) {
            interfaceC783280Uo2.onError(interfaceC774130UYh, i, exc);
        }
        String str = TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError this ");
        sbLIZ.append(interfaceC774130UYh);
        AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ), exc);
    }

    @Override // X.InterfaceC1276300jJk
    public void onSeeked(InterfaceC774130UYh interfaceC774130UYh, long j, boolean z) {
        InterfaceC1276300jJk interfaceC1276300jJk = this.mListener;
        if (interfaceC1276300jJk != null) {
            interfaceC1276300jJk.onSeeked(this, j, z);
        }
    }
}
