package X;

import Y.ACListenerS121S0200000_18;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.keva.Keva;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204870hSX {
    public final Fragment LIZ;
    public C20515215Pi LIZIZ;
    public boolean LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2696));

    public C1204870hSX(Fragment fragment) {
        this.LIZ = fragment;
    }

    public final void LIZ(ViewGroup viewGroup, EnumC1204660hSC enumC1204660hSC) {
        int i;
        int i2;
        int i3;
        if (this.LIZ != null) {
            C20515215Pi c20515215Pi = new C20515215Pi(viewGroup);
            int[] iArr = C1204830hST.LIZ;
            int i4 = iArr[enumC1204660hSC.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    i = 2131857106;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = 2131837911;
            }
            c20515215Pi.LJII(i);
            int i5 = iArr[enumC1204660hSC.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i2 = 2131857104;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i2 = 2131837913;
            }
            c20515215Pi.LIZJ(i2);
            int i6 = iArr[enumC1204660hSC.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = 2131857105;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i3 = 2131837910;
            }
            c20515215Pi.LIZ(i3);
            int iLIZ = (int) C339190DRl.LIZ(62);
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJII = iLIZ;
            c1057450dcl.LJIILL = true;
            AwS384S0200000_18 awS384S0200000_18 = new AwS384S0200000_18(enumC1204660hSC, this, 265);
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LJIILJJIL = awS384S0200000_18;
            c1057450dcl2.LIZJ = false;
            int iLIZ2 = (int) C339190DRl.LIZ(12);
            C1057450dcl c1057450dcl3 = c20515215Pi.LIZ;
            c1057450dcl3.LJIIIZ = iLIZ2;
            this.LIZIZ = c20515215Pi;
            c1057450dcl3.LJIILIIL = new ACListenerS121S0200000_18(enumC1204660hSC, this, 65);
            C1204820hSS.LIZ(enumC1204660hSC, EnumC586410MzH.DEFAULTTYPE, true);
            C1204890hSZ c1204890hSZ = C1204890hSZ.LIZ;
            PageFinder pageFinder = (PageFinder) this.LIZLLL.getValue();
            c1204890hSZ.getClass();
            int i7 = C1204960hSg.LIZ[enumC1204660hSC.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    C1204890hSZ.LIZIZ(EnumC1204950hSf.SHOW, pageFinder);
                } else {
                    throw new C1954807lC();
                }
            } else {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("banner_type", "gps_card");
                c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
                c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                Map<String, String> map = c2344009Gk.LIZ;
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ("nearby_banner_show", map, c1185050gwZ);
            }
            if (enumC1204660hSC == EnumC1204660hSC.PROMOTE_PRECISE_GPS) {
                C1204790hSP c1204790hSP = C1204790hSP.LIZIZ;
                Keva keva = c1204790hSP.LIZ;
                C01GW c01gw = C1204790hSP.LIZJ;
                c1204790hSP.LIZ.storeInt((String) c01gw.getValue(), keva.getInt((String) c01gw.getValue(), 0) + 1);
            }
            C20515215Pi c20515215Pi2 = this.LIZIZ;
            if (c20515215Pi2 != null) {
                c20515215Pi2.LIZLLL();
            }
            this.LIZJ = true;
        }
    }
}
