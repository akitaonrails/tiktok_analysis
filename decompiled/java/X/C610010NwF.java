package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* JADX INFO: renamed from: X.0NwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610010NwF {
    public DspPlatform LIZ;
    public EnumC2004807tG LIZIZ;
    public C0P0X LIZJ;

    public C610010NwF() {
        this(null, 7);
    }

    public C610010NwF(C0P0X c0p0x, int i) {
        DspPlatform dspPlatform;
        if ((i & 1) != 0) {
            dspPlatform = DspPlatform.UNKNOWN;
        } else {
            dspPlatform = null;
        }
        EnumC2004807tG enumC2004807tG = (i & 2) != 0 ? EnumC2004807tG.NORMAL : null;
        c0p0x = (i & 4) != 0 ? C0P0X.UNKNOWN : c0p0x;
        this.LIZ = dspPlatform;
        this.LIZIZ = enumC2004807tG;
        this.LIZJ = c0p0x;
    }
}
