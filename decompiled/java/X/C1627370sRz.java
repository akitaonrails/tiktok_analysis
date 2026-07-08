package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627370sRz extends AbstractC1627380sS0 {
    public final Effect LIZ;
    public final int LIZIZ;
    public final EnumC1448980noG LIZJ;
    public final boolean LIZLLL;
    public final Bundle LJ;
    public final int LJFF;
    public final Long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627370sRz)) {
            return false;
        }
        C1627370sRz c1627370sRz = (C1627370sRz) obj;
        return Intrinsics.LJFF(this.LIZ, c1627370sRz.LIZ) && this.LIZIZ == c1627370sRz.LIZIZ && this.LIZJ == c1627370sRz.LIZJ && this.LIZLLL == c1627370sRz.LIZLLL && Intrinsics.LJFF(this.LJ, c1627370sRz.LJ) && this.LJFF == c1627370sRz.LJFF && Intrinsics.LJFF(this.LJI, c1627370sRz.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Bundle bundle = this.LJ;
        int iHashCode2 = (((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.LJFF) * 31;
        Long l = this.LJI;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return C318530CeB.LIZ("SelectedStickerHandleSession", this.LIZ, new Pair("clickPosition", Integer.valueOf(this.LIZIZ)), new Pair("requestSource", this.LIZJ), new Pair("interceptLoad", Boolean.valueOf(this.LIZLLL)), new Pair("extraData", this.LJ), new Pair("effectDownloadTime", Integer.valueOf(this.LJFF)), new Pair("veRecorderStartEffectApplyTimeStamp", this.LJI));
    }

    @Override // X.AbstractC1627380sS0
    public final Effect LIZ() {
        return this.LIZ;
    }

    public static C1627370sRz LIZIZ(C1627370sRz c1627370sRz) {
        Effect effect = c1627370sRz.LIZ;
        int i = c1627370sRz.LIZIZ;
        EnumC1448980noG enumC1448980noG = c1627370sRz.LIZJ;
        Bundle bundle = c1627370sRz.LJ;
        int i2 = c1627370sRz.LJFF;
        Long l = c1627370sRz.LJI;
        c1627370sRz.getClass();
        return new C1627370sRz(effect, i, enumC1448980noG, true, bundle, i2, l);
    }

    public /* synthetic */ C1627370sRz(Effect effect, int i, EnumC1448980noG enumC1448980noG, Bundle bundle, int i2, int i3) {
        this(effect, i, enumC1448980noG, false, (i3 & 16) != 0 ? null : bundle, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? 0L : null);
    }

    public C1627370sRz(Effect effect, int i, EnumC1448980noG enumC1448980noG, boolean z, Bundle bundle, int i2, Long l) {
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = enumC1448980noG;
        this.LIZLLL = z;
        this.LJ = bundle;
        this.LJFF = i2;
        this.LJI = l;
    }
}
