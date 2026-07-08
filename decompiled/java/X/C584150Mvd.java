package X;

import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Mvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC1294060jmO
public final class C584150Mvd {
    public final Video LIZ;
    public final Audio LIZIZ;
    public final EnumC2281131EQl LIZJ;
    public int LIZLLL;
    public final C581360Mr8 LJ;
    public final C581750Mrl LJFF;
    public final C1479890oc7 LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final int LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public HashMap<String, Object> LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public float LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public C583360MuM LJJIII;
    public boolean LJJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C584150Mvd(Video video, int i, C581360Mr8 c581360Mr8, boolean z, boolean z2, String str, int i2) {
        EnumC2281131EQl enumC2281131EQl;
        boolean z3 = z2;
        boolean z4 = z;
        String str2 = str;
        C581360Mr8 c581360Mr82 = c581360Mr8;
        int i3 = i;
        Video video2 = (i2 & 1) != 0 ? null : video;
        if ((i2 & 4) != 0) {
            enumC2281131EQl = EnumC2281131EQl.SuperHigh;
        } else {
            enumC2281131EQl = null;
        }
        this(video2, null, enumC2281131EQl, (i2 & 8) != 0 ? 0 : i3, (i2 & 16) != 0 ? new C581360Mr8(true, true, true, true, null, null, 0, 123104) : c581360Mr82, null, null, false, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? false : z3, false, false, 0, false, false, false, 0, (i2 & 131072) != 0 ? null : str2, false);
    }

    public C584150Mvd(Video video, Audio audio, EnumC2281131EQl enumC2281131EQl, int i, C581360Mr8 c581360Mr8, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, int i3, String str, boolean z9) {
        this.LIZ = video;
        this.LIZIZ = audio;
        this.LIZJ = enumC2281131EQl;
        this.LIZLLL = i;
        this.LJ = c581360Mr8;
        this.LJFF = c581750Mrl;
        this.LJI = c1479890oc7;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = z5;
        this.LJIIL = i2;
        this.LJIILIIL = z6;
        this.LJIILJJIL = z7;
        this.LJIILL = z8;
        this.LJIILLIIL = i3;
        this.LJIIZILJ = str;
        this.LJIJ = z9;
    }
}
