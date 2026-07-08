package X;

import Y.AfS189S0100000_20;
import Y.AfS3S0100100_7;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageLongIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageSetting;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0jaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286510jaD {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final int LIZ;
    public C11JF LIZIZ;
    public C11JF LIZJ;
    public C11JF LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC769940UIe LJII;
    public long LJIIIIZZ;
    public long LJIIJ;
    public final CopyOnWriteArrayList<Pair<byte[], Long>> LJ = new CopyOnWriteArrayList<>();
    public boolean LJIIIZ = true;

    public final void LIZ() {
        C11JF c11jf;
        this.LJIIIZ = true;
        C20441214yg.LIZIZ("CaptureImageUploadController", "pause");
        C11JF c11jf2 = this.LIZJ;
        if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LIZJ) == null) {
            return;
        }
        c11jf.dispose();
    }

    public final void LIZLLL() {
        long j = this.LJIIJ - 1;
        this.LJIIJ = j;
        if (j > 0) {
            return;
        }
        C11JF c11jf = this.LIZIZ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = this.LIZIZ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LIZIZ = null;
        }
        this.LIZIZ = (C11JF) C11NZ.LJLJJLL(1L, TimeUnit.SECONDS).LJJLJLI(new AfS189S0100000_20(this, 8));
    }

    public final void LJ() {
        if (this.LJI) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJ.size() <= 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("upload start cache size:");
                sbLIZ.append(this.LJ.size());
                C20441214yg.LIZIZ("CaptureImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
                Pair<byte[], Long> pairRemove = this.LJ.remove(0);
                LJFF(pairRemove.getSecond().longValue(), pairRemove.getFirst());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1286510jaD(int i) {
        this.LIZ = i;
    }

    public final void LIZIZ(boolean z) {
        long value;
        if (!this.LJFF || !this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = false;
        C20441214yg.LIZIZ("CaptureImageUploadController", "resume");
        if (z) {
            value = LiveBroadcastUploadVideoImageLongIntervalSetting.INSTANCE.getValue();
        } else {
            value = LiveBroadcastUploadVideoImageIntervalSetting.INSTANCE.getValue();
        }
        this.LIZJ = (C11JF) C19490011Na.LIZJ(value, TimeUnit.SECONDS).LJJIL(new C1339330kxP(this, 0)).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS189S0100000_20(this, 7));
    }

    public final void LJFF(long j, byte[] bArr) {
        C11JF c11jf;
        this.LJI = true;
        C11JF c11jf2 = this.LIZLLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LIZLLL) != null) {
            c11jf.dispose();
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("application/octet-stream", bArr, String.valueOf(System.currentTimeMillis())));
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        this.LIZLLL = (C11JF) C01QD.LIZ().LIZ().uploadOriginScreen(multipartTypedOutput, Long.valueOf(this.LJIIIIZZ), this.LIZ).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS3S0100100_7(j, this, 12), new AfS3S0100100_7(j, this, 13));
    }

    public final void LIZJ(InterfaceC769940UIe interfaceC769940UIe, long j, boolean z) {
        C11JF c11jf;
        this.LJIIJ++;
        if (LiveBroadcastUploadVideoImageSetting.INSTANCE.isDisable()) {
            return;
        }
        C11JF c11jf2 = this.LIZIZ;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LIZIZ) != null) {
            c11jf.dispose();
        }
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C20441214yg.LIZIZ("CaptureImageUploadController", "start");
        this.LJII = interfaceC769940UIe;
        this.LJIIIIZZ = j;
        LIZIZ(z);
    }
}
