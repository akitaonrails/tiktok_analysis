package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0UYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC774130UYh {
    boolean isPlaying();

    void pause();

    void prepare();

    void release();

    void setDataSource(Context context, String str);

    void setErrorListener(InterfaceC783280Uo2 interfaceC783280Uo2);

    void setEventListener(InterfaceC1276300jJk interfaceC1276300jJk);

    void setLoop(boolean z);

    void setMixerEnable(boolean z);

    void setVolume(float f);

    void start();

    void stop();
}
