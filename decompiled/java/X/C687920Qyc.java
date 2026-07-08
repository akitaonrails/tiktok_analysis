package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687920Qyc {
    public final EnumC682580Qq0 LIZ;
    public final EnumC687950Qyf LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final WeakReference<Activity> LJIIJJI;
    public final WeakReference<Fragment> LJIIL;
    public final InterfaceC687970Qyh LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C687920Qyc)) {
            return false;
        }
        C687920Qyc c687920Qyc = (C687920Qyc) obj;
        return this.LIZ == c687920Qyc.LIZ && this.LIZIZ == c687920Qyc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c687920Qyc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c687920Qyc.LIZLLL) && Intrinsics.LJFF(this.LJ, c687920Qyc.LJ) && Intrinsics.LJFF(this.LJFF, c687920Qyc.LJFF) && this.LJI == c687920Qyc.LJI && this.LJII == c687920Qyc.LJII && this.LJIIIIZZ == c687920Qyc.LJIIIIZZ && this.LJIIIZ == c687920Qyc.LJIIIZ && this.LJIIJ == c687920Qyc.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c687920Qyc.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c687920Qyc.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c687920Qyc.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return ((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode();
    }

    public final String toString() {
        return "GpsPopupContext(source=" + this.LIZ + ", permissionType=" + this.LIZIZ + ", enterFrom=" + this.LIZJ + ", enterMethod=" + this.LIZLLL + ", searchId=" + this.LJ + ", searchKeyword=" + this.LJFF + ", popupDelayMs=" + this.LJI + ", cooldownDays=" + this.LJII + ", upgradeDays=" + this.LJIIIIZZ + ", upgradeThreshold=" + this.LJIIIZ + ", useNewFreqControl=" + this.LJIIJ + ", activityRef=" + this.LJIIJJI + ", fragmentRef=" + this.LJIIL + ", callback=" + this.LJIILIIL + ')';
    }

    public C687920Qyc(EnumC682580Qq0 enumC682580Qq0, EnumC687950Qyf enumC687950Qyf, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, boolean z, WeakReference<Activity> weakReference, WeakReference<Fragment> weakReference2, InterfaceC687970Qyh interfaceC687970Qyh) {
        this.LIZ = enumC682580Qq0;
        this.LIZIZ = enumC687950Qyf;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = z;
        this.LJIIJJI = weakReference;
        this.LJIIL = weakReference2;
        this.LJIILIIL = interfaceC687970Qyh;
    }
}
