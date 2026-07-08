package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0E4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358740E4q extends C358770E4t {
    public final NLETrackSlot LIZ;
    public final int LIZIZ;
    public final Long LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final boolean LJFF;

    public C358740E4q(NLETrackSlot nLETrackSlot, int i, Long l, boolean z, int i2, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        l = (i3 & 8) != 0 ? null : l;
        z = (i3 & 16) != 0 ? true : z;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        boolean z2 = (i3 & 64) != 0;
        this.LIZ = nLETrackSlot;
        this.LIZIZ = i;
        this.LIZJ = l;
        this.LIZLLL = z;
        this.LJ = i2;
        this.LJFF = z2;
    }
}
