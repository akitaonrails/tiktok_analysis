package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671260QUq {
    public final boolean LIZ;
    public final Bitmap LIZIZ;
    public final EnumC671240QUo LIZJ;
    public final EnumC671270QUr LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final InterfaceC680760Qn4 LJI;
    public final InterfaceC680770Qn5 LJII;

    public C671260QUq() {
        this(false, null, null, null, false, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C671260QUq)) {
            return false;
        }
        C671260QUq c671260QUq = (C671260QUq) obj;
        return this.LIZ == c671260QUq.LIZ && Intrinsics.LJFF(this.LIZIZ, c671260QUq.LIZIZ) && this.LIZJ == c671260QUq.LIZJ && this.LIZLLL == c671260QUq.LIZLLL && this.LJ == c671260QUq.LJ && this.LJFF == c671260QUq.LJFF && Intrinsics.LJFF(this.LJI, c671260QUq.LJI) && Intrinsics.LJFF(this.LJII, c671260QUq.LJII);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Bitmap bitmap = this.LIZIZ;
        int iHashCode = (((((((((iZ2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        InterfaceC680760Qn4 interfaceC680760Qn4 = this.LJI;
        int iHashCode2 = (iHashCode + (interfaceC680760Qn4 == null ? 0 : interfaceC680760Qn4.hashCode())) * 31;
        InterfaceC680770Qn5 interfaceC680770Qn5 = this.LJII;
        return iHashCode2 + (interfaceC680770Qn5 != null ? interfaceC680770Qn5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAFPlaceholderConfig(enabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", screenBitmap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lifecycleStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lifecycleEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dismissDelayMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", autoRecycleBitmap=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", firstDrawCallback=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C671260QUq(boolean z, Bitmap bitmap, EnumC671240QUo enumC671240QUo, EnumC671270QUr enumC671270QUr, boolean z2, C0QL7 c0ql7, C0QIX c0qix, int i) {
        z = (i & 1) != 0 ? false : z;
        bitmap = (i & 2) != 0 ? null : bitmap;
        enumC671240QUo = (i & 4) != 0 ? EnumC671240QUo.ON_NAVIGATE_CALLED : enumC671240QUo;
        enumC671270QUr = (i & 8) != 0 ? EnumC671270QUr.ON_TO_FRAGMENT_RESUMED : enumC671270QUr;
        z2 = (i & 32) != 0 ? true : z2;
        c0ql7 = (i & 64) != 0 ? null : c0ql7;
        c0qix = (i & 128) != 0 ? null : c0qix;
        this.LIZ = z;
        this.LIZIZ = bitmap;
        this.LIZJ = enumC671240QUo;
        this.LIZLLL = enumC671270QUr;
        this.LJ = 0L;
        this.LJFF = z2;
        this.LJI = c0ql7;
        this.LJII = c0qix;
    }
}
