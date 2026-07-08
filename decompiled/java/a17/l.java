package a17;

import X.InterfaceC1303910k2H;
import com.lynx.canvas.KryptonApp;

/* JADX INFO: loaded from: classes21.dex */
public abstract class l extends u {
    public static String moduleName() {
        return "audio";
    }

    public abstract String engineType();

    public abstract boolean loadAudioEffectModule(String str);

    public abstract boolean loadAudioModule();

    public abstract void setStatusListener(InterfaceC1303910k2H interfaceC1303910k2H);

    public abstract boolean startAudioEngine(KryptonApp kryptonApp);
}
