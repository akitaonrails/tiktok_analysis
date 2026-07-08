package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351590DqP {
    public final NLETrackSlot LIZ;
    public final boolean LIZIZ;
    public final Long LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C351590DqP(boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(null, z2, null, z3, (i & 16) != 0 ? false : z4, false);
    }

    public C351590DqP(NLETrackSlot nLETrackSlot, boolean z, Long l, boolean z2, boolean z3, boolean z4) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = z;
        this.LIZJ = l;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
    }
}
