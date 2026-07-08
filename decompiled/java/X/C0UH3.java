package X;

import android.text.TextUtils;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;

/* JADX INFO: renamed from: X.0UH3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UH3 implements C0UH6 {
    public final C0UH4 LIZ;

    @Override // X.C0UH6
    public final EffectImageInfo LIZLLL() {
        if (this.LIZ == null || TextUtils.isEmpty("navi_capture")) {
            return null;
        }
        return this.LIZ.LJ();
    }

    public C0UH3(C0UHA c0uha) {
        this.LIZ = c0uha;
    }

    @Override // X.C0UH6
    public final void LIZ(C0UHE c0uhe) {
        C0UH4 c0uh4 = this.LIZ;
        if (c0uh4 != null) {
            c0uh4.LJIIIZ(c0uhe);
        }
    }

    @Override // X.C0UH6
    public final int LIZIZ(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            return ((C0UHA) this.LIZ).LIZIZ(str);
        }
        return 0;
    }

    @Override // X.C0UH6
    public final void LIZJ(C0UHE c0uhe) {
        C0UH4 c0uh4 = this.LIZ;
        if (c0uh4 != null) {
            c0uh4.LJIIL(c0uhe);
        }
    }

    @Override // X.C0UH6
    public final int setEffect(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            return ((C0UHA) this.LIZ).setEffect(str);
        }
        return 0;
    }

    @Override // X.C0UH6
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        C0UH4 c0uh4 = this.LIZ;
        if (c0uh4 != null) {
            c0uh4.LJFF(i, (int) j, (int) j2, str);
        }
    }
}
