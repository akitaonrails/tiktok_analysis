package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.router.SmartRoute;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191680h7G {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function1<SmartRoute, Unit> LIZLLL;
    public final Function1<Integer, Integer> LJ;
    public final Function2<View, View, Unit> LJFF;
    public final Function1<Context, Drawable> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191680h7G)) {
            return false;
        }
        C1191680h7G c1191680h7G = (C1191680h7G) obj;
        return Intrinsics.LJFF(this.LIZ, c1191680h7G.LIZ) && this.LIZIZ == c1191680h7G.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1191680h7G.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1191680h7G.LIZLLL) && Intrinsics.LJFF(this.LJ, c1191680h7G.LJ) && Intrinsics.LJFF(this.LJFF, c1191680h7G.LJFF) && Intrinsics.LJFF(this.LJI, c1191680h7G.LJI) && this.LJII == c1191680h7G.LJII && this.LJIIIIZZ == c1191680h7G.LJIIIIZZ && this.LJIIIZ == c1191680h7G.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1191680h7G.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        Function1<SmartRoute, Unit> function1 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<Integer, Integer> function12 = this.LJ;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function2<View, View, Unit> function2 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1<Context, Drawable> function13 = this.LJI;
        return ((((((((iHashCode4 + (function13 != null ? function13.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "ImageGridConfig(mobPage=" + this.LIZ + ", pauseFeedOnImageClick=" + this.LIZIZ + ", extraIsTopProvider=" + this.LIZJ + ", attachExtraGalleryParams=" + this.LIZLLL + ", imageSizeOverride=" + this.LJ + ", onContainerLayoutCreated=" + this.LJFF + ", morePictureBackgroundProvider=" + this.LJI + ", morePictureCountWithPlusPrefix=" + this.LJII + ", morePictureContainerFillsImageOnUxOpt=" + this.LJIIIIZZ + ", applyCellUxOptMutations=" + this.LJIIIZ + ", galleryEnterMethod=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1191680h7G(String str, boolean z, Function0 function0, Function1 function1, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        Function1 function12 = function1;
        Function0 function02 = (i & 4) != 0 ? AFwS206S0000000_18.get$arr$(727) : function0;
        function12 = (i & 8) != 0 ? null : function12;
        if ((i & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 512) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this(str, z, function02, function12, null, null, null, z2, z3, z4, (i & 1024) != 0 ? "review" : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191680h7G(String str, boolean z, Function0<Boolean> function0, Function1<? super SmartRoute, Unit> function1, Function1<? super Integer, Integer> function12, Function2<? super View, ? super View, Unit> function2, Function1<? super Context, ? extends Drawable> function13, boolean z2, boolean z3, boolean z4, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = function0;
        this.LIZLLL = function1;
        this.LJ = function12;
        this.LJFF = function2;
        this.LJI = function13;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        this.LJIIJ = str2;
    }
}
