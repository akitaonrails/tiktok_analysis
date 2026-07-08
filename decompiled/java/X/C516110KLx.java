package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516110KLx {
    public Boolean LIZ;
    public Boolean LIZJ;
    public List<TemplateInfo> LJ;
    public boolean LIZIZ = true;
    public boolean LIZLLL = true;

    public final boolean LIZ() {
        if (this.LIZIZ) {
            if (this.LIZLLL) {
                Boolean bool = this.LIZ;
                if (bool == null || this.LIZJ == null) {
                    return false;
                }
                Boolean bool2 = Boolean.TRUE;
                return Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(this.LIZJ, bool2);
            }
            if (!this.LIZLLL) {
                return Intrinsics.LJFF(this.LIZ, Boolean.TRUE);
            }
        } else if (this.LIZLLL) {
            return Intrinsics.LJFF(this.LIZJ, Boolean.TRUE);
        }
        Boolean bool3 = this.LIZ;
        Boolean bool4 = Boolean.TRUE;
        return Intrinsics.LJFF(bool3, bool4) && Intrinsics.LJFF(this.LIZJ, bool4);
    }

    public final boolean LIZIZ() {
        Boolean bool;
        if (!this.LIZIZ || !this.LIZLLL || (bool = this.LIZ) == null || this.LIZJ == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(this.LIZJ, bool2);
    }

    public final boolean LIZJ() {
        if (this.LIZIZ) {
            if (this.LIZLLL) {
                Boolean bool = this.LIZ;
                Boolean bool2 = Boolean.FALSE;
                return Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(this.LIZJ, bool2);
            }
            if (!this.LIZLLL) {
                return Intrinsics.LJFF(this.LIZ, Boolean.FALSE);
            }
        } else if (this.LIZLLL) {
            return Intrinsics.LJFF(this.LIZJ, Boolean.FALSE);
        }
        Boolean bool3 = this.LIZ;
        Boolean bool4 = Boolean.FALSE;
        return Intrinsics.LJFF(bool3, bool4) || Intrinsics.LJFF(this.LIZJ, bool4);
    }
}
