package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12EL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EL {
    public final String LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final EnumC19367410ps LJI;
    public final String LJII;
    public final Function1<String, Unit> LJIIIIZZ;
    public final Function0<Function1<View, Unit>> LJIIIZ;
    public final C12EP LJIIJ;

    public C12EL() {
        this(null, null, null, null, null, null, null, null, null, AFwS218S0000000_29.get$arr$(6), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12EL)) {
            return false;
        }
        C12EL c12el = (C12EL) obj;
        return Intrinsics.LJFF(this.LIZ, c12el.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12el.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c12el.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c12el.LIZLLL) && Intrinsics.LJFF(this.LJ, c12el.LJ) && Intrinsics.LJFF(this.LJFF, c12el.LJFF) && this.LJI == c12el.LJI && Intrinsics.LJFF(this.LJII, c12el.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c12el.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c12el.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c12el.LJIIJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EnumC19367410ps enumC19367410ps = this.LJI;
        int iHashCode7 = (iHashCode6 + (enumC19367410ps == null ? 0 : enumC19367410ps.hashCode())) * 31;
        String str6 = this.LJII;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Function1<String, Unit> function1 = this.LJIIIIZZ;
        int iHashCode9 = (((iHashCode8 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31;
        C12EP c12ep = this.LJIIJ;
        return iHashCode9 + (c12ep != null ? c12ep.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorTemplateData(aid=" + this.LIZ + ", title=" + this.LIZIZ + ", iconUrl=" + this.LIZJ + ", subTitle=" + this.LIZLLL + ", contentActionKey=" + this.LJ + ", ctaTitle=" + this.LJFF + ", ctaStyle=" + this.LJI + ", ctaActionKey=" + this.LJII + ", onActionKeyCallback=" + this.LJIIIIZZ + ", onContentClickCallbackInvoker=" + this.LJIIIZ + ", hotspotAreaApplier=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12EL(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, EnumC19367410ps enumC19367410ps, String str6, Function1<? super String, Unit> function1, Function0<? extends Function1<? super View, Unit>> function0, C12EP c12ep) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = urlModel;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = enumC19367410ps;
        this.LJII = str6;
        this.LJIIIIZZ = function1;
        this.LJIIIZ = function0;
        this.LJIIJ = c12ep;
    }
}
