package X;

import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853070yK1 implements InterfaceC0148002o {
    public final boolean LL;
    public final List<C1163730gOB> LLILLJJLI;
    public final C1852860yJg LLILLL;
    public List<? extends TikTokMediaModel> LLILZ;
    public final EnumC1853160yKA LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;

    public C1853070yK1() {
        this(null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853070yK1)) {
            return false;
        }
        C1853070yK1 c1853070yK1 = (C1853070yK1) obj;
        return this.LL == c1853070yK1.LL && Intrinsics.LJFF(this.LLILLJJLI, c1853070yK1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1853070yK1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1853070yK1.LLILZ) && this.LLILZIL == c1853070yK1.LLILZIL && this.LLILZLL == c1853070yK1.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1853070yK1.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1853070yK1.LLIZLLLIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        List<C1163730gOB> list = this.LLILLJJLI;
        return ((((((((((((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MenuWindowState(showPermissionGuide=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imageAlbumList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", photoMediaRefresh=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedPhotoMediaList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", currentPermissionState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showAlbum=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", cleanAllBottomInputPicSelect=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onFunctionModeBegin=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1853070yK1(EnumC1853160yKA enumC1853160yKA, int i) {
        C1852860yJg c1852860yJg;
        C13BV c13bv;
        C291001Au c291001Au;
        C291001Au c291001Au2;
        EnumC1853160yKA enumC1853160yKA2 = enumC1853160yKA;
        if ((i & 4) != 0) {
            c1852860yJg = C1853080yK2.LIZ;
        } else {
            c1852860yJg = null;
        }
        if ((i & 8) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        enumC1853160yKA2 = (i & 16) != 0 ? EnumC1853160yKA.DENIED : enumC1853160yKA2;
        if ((i & 64) != 0) {
            c291001Au = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au = null;
        }
        if ((i & 128) != 0) {
            c291001Au2 = new C291001Au(-1);
        } else {
            c291001Au2 = null;
        }
        this(false, null, c1852860yJg, c13bv, enumC1853160yKA2, false, c291001Au, c291001Au2);
    }

    public C1853070yK1(boolean z, List<C1163730gOB> list, C1852860yJg c1852860yJg, List<? extends TikTokMediaModel> list2, EnumC1853160yKA enumC1853160yKA, boolean z2, C291001Au<Boolean> c291001Au, C291001Au<Integer> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = c1852860yJg;
        this.LLILZ = list2;
        this.LLILZIL = enumC1853160yKA;
        this.LLILZLL = z2;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = c291001Au2;
    }

    public static C1853070yK1 LIZ(C1853070yK1 c1853070yK1, List list, C1852860yJg c1852860yJg, List list2, EnumC1853160yKA enumC1853160yKA, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        boolean z;
        C291001Au c291001Au3 = c291001Au2;
        EnumC1853160yKA enumC1853160yKA2 = enumC1853160yKA;
        List list3 = list2;
        C291001Au c291001Au4 = c291001Au;
        C1852860yJg c1852860yJg2 = c1852860yJg;
        List list4 = list;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = c1853070yK1.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            list4 = c1853070yK1.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1852860yJg2 = c1853070yK1.LLILLL;
        }
        if ((i & 8) != 0) {
            list3 = c1853070yK1.LLILZ;
        }
        if ((i & 16) != 0) {
            enumC1853160yKA2 = c1853070yK1.LLILZIL;
        }
        if ((i & 32) != 0) {
            z2 = c1853070yK1.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au4 = c1853070yK1.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au3 = c1853070yK1.LLIZLLLIL;
        }
        c1853070yK1.getClass();
        return new C1853070yK1(z, list4, c1852860yJg2, list3, enumC1853160yKA2, z2, c291001Au4, c291001Au3);
    }
}
