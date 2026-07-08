package X;

import Y.ARunnableS118S0100000_18;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveForceRefreshRateSetting;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162900gMq extends C1ADU {
    public final Set<Function1<Float, Unit>> LIZ = new LinkedHashSet();
    public boolean LIZIZ;
    public final InterfaceC1162920gMs LIZJ;
    public volatile double LIZLLL;
    public volatile double LJ;
    public volatile float LJFF;
    public final BPEAHandler LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public final int LJIIIZ;
    public final ARunnableS118S0100000_18 LJIIJ;

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final void LJI() {
        if (this.LIZ.isEmpty() || !this.LIZIZ) {
            return;
        }
        float fLIZJ = LIZJ(15);
        Iterator<Function1<Float, Unit>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(fLIZJ));
        }
    }

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final void destroy() {
        this.LIZJ.stop();
    }

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final void start() {
        this.LIZJ.LIZIZ(new C0VVO() { // from class: X.0gMt
            @Override // X.C0VVO
            public final void LIZIZ(double d) {
                this.LIZ.LIZLLL = d;
            }
        });
        this.LIZIZ = true;
        C786410Ut5.LJJZZIII(this.LJI, this.LJIIJ);
        this.LIZJ.LJ(new C0VVN() { // from class: X.0gMr
            @Override // X.C0VVN
            public final void LIZLLL(JSONObject jSONObject) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1162900gMq c1162900gMq = this.LIZ;
                float f = ((jCurrentTimeMillis - c1162900gMq.LJIIIIZZ) * c1162900gMq.LJIIIZ) / LSPassThroughRecordSizeConfig.DEFAULT;
                Iterator<String> itKeys = jSONObject.keys();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    int iOptInt = jSONObject.optInt(next);
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(next);
                    if (numLJIIJJI != null) {
                        int iIntValue = numLJIIJJI.intValue();
                        if (3 <= iIntValue) {
                            if (iIntValue < 7) {
                                i2 += iIntValue * iOptInt;
                            } else if (7 <= iIntValue) {
                                if (iIntValue < 16) {
                                    i3 += iIntValue * iOptInt;
                                } else if (16 <= iIntValue) {
                                    if (iIntValue < 25) {
                                        i4 += iIntValue * iOptInt;
                                    } else if (25 <= iIntValue) {
                                        if (iIntValue < 41) {
                                            i5 += iIntValue * iOptInt;
                                        } else {
                                            i6 += iIntValue * iOptInt;
                                        }
                                    }
                                }
                            }
                        }
                        i += (iIntValue + 1) * iOptInt;
                    }
                }
                float fMin = Math.min(i / f, 1.0f);
                C1162900gMq c1162900gMq2 = this.LIZ;
                double d = c1162900gMq2.LIZLLL;
                int i7 = this.LIZ.LJIIIZ;
                c1162900gMq2.LJ = ((d - ((double) i7)) * ((double) fMin)) + ((double) i7);
                this.LIZ.LJFF = ((((i2 + i3) + i4) + i5) + i6) / f;
            }
        });
    }

    @Override // X.C1ADU, X.InterfaceC1101140elE
    public final void stop() {
        this.LJI.removeCallbacks(this.LJIIJ);
        this.LJI.removeCallbacksAndMessages(null);
        this.LIZJ.stop();
        this.LIZIZ = false;
        this.LIZLLL = 60.0d;
        this.LJ = 60.0d;
        this.LJFF = 0.0f;
    }

    public C1162900gMq() {
        InterfaceC1162920gMs interfaceC1162920gMsNt0 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).nt0("live_fluency_metric");
        this.LIZJ = interfaceC1162920gMsNt0;
        this.LIZLLL = 60.0d;
        this.LJ = 60.0d;
        this.LJI = new BPEAHandler(Looper.getMainLooper());
        this.LJIIIZ = 60;
        this.LJIIJ = new ARunnableS118S0100000_18(this, 56);
        if (LiveForceRefreshRateSetting.INSTANCE.getValue()) {
            return;
        }
        this.LJIIIZ = interfaceC1162920gMsNt0.LIZ();
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final void LIZ(C1090240eTe c1090240eTe) {
        this.LIZ.add(c1090240eTe);
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LIZIZ(int i) {
        return (float) this.LJ;
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LIZJ(int i) {
        return (float) this.LJ;
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LIZLLL(int i) {
        return this.LJFF;
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LJFF(int i) {
        return (float) this.LJ;
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LJII(int i) {
        return this.LJFF;
    }

    @Override // X.C1ADU, X.InterfaceC1101040el4
    public final float LJIIIIZZ(int i) {
        return this.LJFF;
    }
}
