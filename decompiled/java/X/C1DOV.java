package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.jni.TEAudioEffectInterface;

/* JADX INFO: renamed from: X.1DOV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOV {
    public final VEEditor LIZ;
    public final TEInterface LIZIZ;
    public final TEAudioEffectInterface LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public C2255181DOq LJII;
    public final C2255131DOl LJIIIIZZ;

    public final void LIZ() {
        try {
            int i = this.LIZ.LLLIIL;
            int[] iArrAddFilters = this.LIZIZ.addFilters(new int[]{0, 0, 0}, new String[]{"color filter", "effect hdr filter", "lens hdr filter"}, new int[]{0, 0, 0}, new int[]{i, i, i}, new int[]{0, 0, 0}, new int[]{7, 16, 33}, new int[]{1, 0, 0});
            this.LIZLLL = iArrAddFilters[0];
            this.LJ = iArrAddFilters[1];
            this.LJFF = iArrAddFilters[2];
            VEEditor vEEditor = this.LIZ;
            InterfaceC2255101DOi interfaceC2255101DOi = vEEditor.LL;
            if (interfaceC2255101DOi == null || !interfaceC2255101DOi.isMVInitialedInternal()) {
                return;
            }
            for (int i2 : iArrAddFilters) {
                vEEditor.LL.addMVFilterInternal(i2);
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new VEException(-1, "init failed: VESDK need to be init");
        }
    }

    public C1DOV(VEEditor vEEditor) {
        this.LIZ = vEEditor;
        TEInterface tEInterface = vEEditor.LLJLLIL;
        this.LIZIZ = tEInterface;
        this.LIZJ = new TEAudioEffectInterface(tEInterface.getNativeHandler());
        this.LJIIIIZZ = new C2255131DOl();
    }
}
