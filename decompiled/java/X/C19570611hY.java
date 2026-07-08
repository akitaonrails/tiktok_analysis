package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19570611hY {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC1635390sev LIZ;
    public final C830490Whz<String, Boolean> LIZIZ = new C830490Whz<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 838));

    public final C19568211hA<C19570211hU, Void> LIZJ() {
        return (C19568211hA) this.LIZJ.getValue();
    }

    public C19570611hY(InterfaceC1635390sev interfaceC1635390sev) {
        this.LIZ = interfaceC1635390sev;
    }

    public final synchronized void LIZ(ComposerBeauty composerBeauty) {
        this.LIZIZ.put(composerBeauty.getEffect().getEffectId(), Boolean.TRUE);
    }

    public final int LIZIZ(ComposerBeauty composerBeauty, boolean z) {
        if (LJ(composerBeauty, z)) {
            return 4;
        }
        if (!LIZJ().LJI(new C19570211hU(composerBeauty)) && !LIZJ().LJFF(new C19570211hU(composerBeauty))) {
            return 2;
        }
        return 8;
    }

    public final boolean LIZLLL(ComposerBeauty composerBeauty, boolean z) {
        if (4 == LIZIZ(composerBeauty, z)) {
            return true;
        }
        return false;
    }

    public final boolean LJ(ComposerBeauty composerBeauty, boolean z) {
        boolean zLJFF;
        if (C19731012Hs.LJIIIIZZ.contains(composerBeauty.getEffect().getEffectId())) {
            return true;
        }
        synchronized (this) {
            zLJFF = Intrinsics.LJFF(this.LIZIZ.get(composerBeauty.getEffect().getEffectId()), Boolean.TRUE);
        }
        if (zLJFF) {
            return true;
        }
        if (z) {
            if (a0.LJJJIL(composerBeauty.getEffect().getUnzipPath())) {
                return false;
            }
            boolean zLJ = C13SB.LJ(composerBeauty.getEffect().getUnzipPath());
            if (zLJ) {
                LIZ(composerBeauty);
            }
            return zLJ;
        }
        boolean zLJIJJLI = this.LIZ.LJIJJLI(composerBeauty.getEffect());
        if (zLJIJJLI) {
            LIZ(composerBeauty);
        }
        return zLJIJJLI;
    }
}
