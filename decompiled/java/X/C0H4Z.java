package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4Z {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final DynamicIcon LIZLLL;
    public final String LJ;
    public final Function0<Unit> LJFF;
    public final Drawable LJI;
    public final Drawable LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public C0H4Z() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H4Z)) {
            return false;
        }
        C0H4Z c0h4z = (C0H4Z) obj;
        return Intrinsics.LJFF(this.LIZ, c0h4z.LIZ) && this.LIZIZ == c0h4z.LIZIZ && this.LIZJ == c0h4z.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0h4z.LIZLLL) && Intrinsics.LJFF(this.LJ, c0h4z.LJ) && Intrinsics.LJFF(this.LJFF, c0h4z.LJFF) && Intrinsics.LJFF(this.LJI, c0h4z.LJI) && Intrinsics.LJFF(this.LJII, c0h4z.LJII) && this.LJIIIIZZ == c0h4z.LJIIIIZZ && this.LJIIIZ == c0h4z.LJIIIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        DynamicIcon dynamicIcon = this.LIZLLL;
        int iHashCode2 = (iHashCode + (dynamicIcon == null ? 0 : dynamicIcon.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0<Unit> function0 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Drawable drawable = this.LJI;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.LJII;
        return ((((iHashCode5 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public C0H4Z(String str, boolean z, DynamicIcon dynamicIcon, Function0 function0, boolean z2, boolean z3, int i) {
        z = (i & 4) != 0 ? false : z;
        dynamicIcon = (i & 8) != 0 ? null : dynamicIcon;
        function0 = (i & 32) != 0 ? null : function0;
        z2 = (i & 256) != 0 ? true : z2;
        z3 = (i & 512) != 0 ? true : z3;
        this.LIZ = str;
        this.LIZIZ = false;
        this.LIZJ = z;
        this.LIZLLL = dynamicIcon;
        this.LJ = null;
        this.LJFF = function0;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
    }
}
