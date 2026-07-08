package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FGT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGT {
    public final Effect LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public EnumC1641420soe LIZLLL;
    public int LJ;
    public Effect LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FGT)) {
            return false;
        }
        C0FGT c0fgt = (C0FGT) obj;
        return Intrinsics.LJFF(this.LIZ, c0fgt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fgt.LIZIZ) && this.LIZJ == c0fgt.LIZJ && this.LIZLLL == c0fgt.LIZLLL && this.LJ == c0fgt.LJ && Intrinsics.LJFF(this.LJFF, c0fgt.LJFF);
    }

    public C0FGT(Effect effect, String str, boolean z, EnumC1641420soe enumC1641420soe, int i, Effect effect2) {
        this.LIZ = effect;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = enumC1641420soe;
        this.LJ = i;
        this.LJFF = effect2;
    }
}
