package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.0jD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272210jD9 implements InterfaceC1272460jDY {
    public final InterfaceC1268820j7g LIZ;
    public final InterfaceC1272460jDY LIZIZ;
    public final AudioDeviceModule LIZJ;
    public float LIZLLL;
    public volatile int LJ = -100;

    @Override // X.InterfaceC1272460jDY
    public final void LIZ(Exception exc) {
        InterfaceC1272460jDY interfaceC1272460jDY = this.LIZIZ;
        if (interfaceC1272460jDY != null) {
            interfaceC1272460jDY.LIZ(exc);
        }
    }

    public C1272210jD9(InterfaceC1268820j7g interfaceC1268820j7g, InterfaceC1272460jDY interfaceC1272460jDY, AudioDeviceModule audioDeviceModule) {
        this.LIZJ = audioDeviceModule;
        this.LIZIZ = interfaceC1272460jDY;
        if (interfaceC1268820j7g != null) {
            this.LIZ = interfaceC1268820j7g;
            interfaceC1268820j7g.start();
        } else {
            this.LIZ = null;
        }
    }

    @Override // X.InterfaceC1272460jDY
    public final void LIZJ(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (byteBuffer == null || i <= 0 || i2 <= 0 || (i3 != 1 && i3 != 2)) {
            this.LJ = C386801es.DEFAULT;
        } else {
            if (byteBuffer.capacity() < i * i3 * 2) {
                this.LJ = C386801es.DEFAULT;
            } else {
                float f = this.LIZLLL + ((i * 1000.0f) / i2);
                this.LIZLLL = f;
                if (f > 2000.0f) {
                    ByteOrder byteOrderOrder = byteBuffer.order();
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    double d = 0.0d;
                    double d2 = 0.0d;
                    for (int i4 = 0; i4 < i; i4++) {
                        int i5 = i4 * 2 * i3;
                        try {
                            double d3 = byteBuffer.getShort(i5);
                            d += d3 * d3;
                            if (2 == i3) {
                                double d4 = byteBuffer.getShort(i5 + 2);
                                d2 += d4 * d4;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            byteBuffer.order(byteOrderOrder);
                            this.LIZLLL = 0.0f;
                            throw th;
                        }
                    }
                    double d5 = i;
                    int iLog10 = (int) (Math.log10(((d / d5) / 1.073676289E9d) + 1.0E-20d) * (-10.0d));
                    int i6 = 127;
                    if (iLog10 > 127) {
                        iLog10 = 127;
                    }
                    if (2 == i3) {
                        int iLog102 = (int) (Math.log10(((d2 / d5) / 1.073676289E9d) + 1.0E-20d) * (-10.0d));
                        if (iLog102 <= 127) {
                            i6 = iLog102;
                        }
                    } else {
                        i6 = iLog10;
                    }
                    this.LJ = iLog10 + (i6 * LSPassThroughRecordSizeConfig.DEFAULT);
                    byteBuffer.order(byteOrderOrder);
                    this.LIZLLL = 0.0f;
                }
            }
        }
        InterfaceC1268820j7g interfaceC1268820j7g = this.LIZ;
        if (interfaceC1268820j7g != null) {
            interfaceC1268820j7g.LIZIZ();
        }
        AudioDeviceModule audioDeviceModule = this.LIZJ;
        if (audioDeviceModule != null) {
            audioDeviceModule.pushOuterAudioFarend(byteBuffer, i, i2, i3, j);
        }
        InterfaceC1272460jDY interfaceC1272460jDY = this.LIZIZ;
        if (interfaceC1272460jDY != null) {
            interfaceC1272460jDY.LIZJ(byteBuffer, i, i2, i3, j);
        }
    }
}
