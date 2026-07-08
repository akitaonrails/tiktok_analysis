package X;

import android.os.ParcelUuid;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302410jzr implements Comparable<C1302410jzr> {
    public final CharSequence LL;
    public final int LLILLJJLI;
    public final ParcelUuid LLILLL;
    public String LLILZ = "-1";

    public final int hashCode() {
        return Objects.hash(this.LL, Integer.valueOf(this.LLILLJJLI), this.LLILLL);
    }

    public final boolean LIZJ() {
        return this.LLILLJJLI == 2;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallEndpoint(name=[");
        sbLIZ.append((Object) this.LL);
        sbLIZ.append("],type=[");
        sbLIZ.append(C1302460jzw.LIZ(this.LLILLJJLI));
        sbLIZ.append("],identifier=[");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append("])");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1302410jzr c1302410jzr) {
        int i;
        C1302410jzr c1302410jzr2 = c1302410jzr;
        int i2 = this.LLILLJJLI;
        int i3 = 5;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            i = 5;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = 1;
            }
        } else {
            i = 3;
        }
        int i4 = c1302410jzr2.LLILLJJLI;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            i3 = 4;
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
        } else {
            i3 = 3;
        }
        int iLJI = Intrinsics.LJI(i, i3);
        if (iLJI == 0) {
            return this.LL.toString().compareTo(c1302410jzr2.LL.toString());
        }
        return iLJI;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1302410jzr) {
            C1302410jzr c1302410jzr = (C1302410jzr) obj;
            if (Intrinsics.LJFF(this.LL, c1302410jzr.LL) && this.LLILLJJLI == c1302410jzr.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1302410jzr.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1302410jzr(CharSequence charSequence, int i, ParcelUuid parcelUuid) {
        this.LL = charSequence;
        this.LLILLJJLI = i;
        this.LLILLL = parcelUuid;
    }
}
