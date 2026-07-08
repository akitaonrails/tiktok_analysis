package X;

import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Brv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218291Brv implements InterfaceC1499700p84 {
    public final WeakReference<InterfaceC739770T0d> LIZIZ;
    public boolean LIZ = true;
    public final WeakReference<C2218281Bru> LIZJ = new WeakReference<>(new C2218281Bru());

    @Override // X.InterfaceC1499700p84
    public final void LIZ() {
        this.LIZ = true;
        C2218281Bru c2218281Bru = this.LIZJ.get();
        if (c2218281Bru == null) {
            return;
        }
        C201955140j.LIZIZ("FeedAudioMetrics", "checkAudioCloseAndReport");
        if (c2218281Bru.LJIIIIZZ) {
            C2218311Brx c2218311Brx = new C2218311Brx();
            c2218311Brx.LIZIZ = 4;
            if (c2218281Bru.LJIILIIL) {
                c2218281Bru.LJII.add(c2218311Brx);
            }
            C201955140j.LIZIZ("FeedAudioMetrics", "getSamiCoreCheckResultAndReport  end");
        }
    }

    @Override // X.InterfaceC1499700p84
    public final void LIZIZ() {
    }

    public C2218291Brv(InterfaceC739770T0d interfaceC739770T0d) {
        this.LIZIZ = new WeakReference<>(interfaceC739770T0d);
    }

    @Override // X.InterfaceC1499700p84
    public final void LIZJ(ByteBuffer[] byteBufferArr, int i, long j) {
        C2218281Bru c2218281Bru = this.LIZJ.get();
        if (c2218281Bru != null && c2218281Bru.LJIIIIZZ) {
            C2218311Brx c2218311Brx = new C2218311Brx();
            c2218311Brx.LIZIZ = 1;
            ArrayList<float[]> arrayList = new ArrayList<>();
            for (ByteBuffer byteBuffer : byteBufferArr) {
                if (byteBuffer != null) {
                    FloatBuffer floatBufferAsFloatBuffer = byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
                    float[] fArr = new float[floatBufferAsFloatBuffer.capacity()];
                    floatBufferAsFloatBuffer.get(fArr);
                    arrayList.add(fArr);
                }
            }
            c2218311Brx.LJIIIIZZ = arrayList;
            c2218311Brx.LJI = i;
            c2218311Brx.LJII = j;
            if (c2218281Bru.LJIILIIL) {
                c2218281Bru.LJII.add(c2218311Brx);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    @Override // X.InterfaceC1499700p84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2218291Brv.LIZLLL(int, int, int):void");
    }
}
