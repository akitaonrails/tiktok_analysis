package X;

import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272130jD1 implements InterfaceC1267860j68 {
    public final InterfaceC1272120jD0 LL;
    public final AudioDeviceModule LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final Object LLILZIL = new Object();
    public boolean LLILZLL;
    public boolean LLIZ;
    public final Handler LLIZLLLIL;

    public C1272130jD1(C1267500j5Y c1267500j5Y, InterfaceC1272120jD0 interfaceC1272120jD0, AudioDeviceModule audioDeviceModule) {
        Handler handlerLIZLLL;
        this.LL = interfaceC1272120jD0;
        this.LLILLJJLI = audioDeviceModule;
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZLLL = c1268700j7U.LIZLLL();
        } else {
            handlerLIZLLL = null;
        }
        this.LLIZLLLIL = handlerLIZLLL;
    }

    @Override // X.InterfaceC1267860j68
    public final void LLILLIZIL(Buffer buffer, int i, int i2, int i3, long j) {
        InterfaceC1272120jD0 interfaceC1272120jD0;
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        if ((buffer instanceof ByteBuffer) && ((ByteBuffer) buffer).isDirect()) {
            if (i * 100 == i2) {
                if (!this.LLILLL) {
                    return;
                }
                synchronized (this.LLILZIL) {
                    try {
                        InterfaceC1272120jD0 interfaceC1272120jD02 = this.LL;
                        if (interfaceC1272120jD02 != null) {
                            interfaceC1272120jD02.effectAudioProcessDataV2((ByteBuffer) buffer, i, i2, i3);
                        }
                        if (this.LLILZ && !this.LLILZLL && (interfaceC1272120jD0 = this.LL) != null && (effectAudioRender = interfaceC1272120jD0.getEffectAudioRender()) != null) {
                            effectAudioRender.onData(buffer, 441, 44100, i3, j);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            throw new AndroidRuntimeException("Audio data should be 10ms per frame!");
        }
        throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
    }
}
