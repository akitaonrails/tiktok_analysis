package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS30S1110000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362000EHe implements InterfaceC359850E8x {
    public final C1664680tQA<C0EJ5> LIZ;
    public final C0EHW LIZIZ;

    @Override // X.InterfaceC359850E8x
    public final void LJI() {
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ("bottom_item_root_caption");
        C0EHW c0ehw = this.LIZIZ;
        for (C361980EHc c361980EHc : c0ehw.LIZ) {
            if (c361980EHc.LJI == "bottom_item_root_caption") {
                if (c361980EHc == null || !c0ehw.LIZ.remove(c361980EHc) || c361980EHcLIZ == null) {
                    return;
                }
                this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHcLIZ, 1075), true);
                return;
            }
        }
    }

    @Override // X.InterfaceC359850E8x
    public final C361980EHc LJIL() {
        return (C361980EHc) this.LIZ.LIZ(new C2217381BqS() { // from class: X.0EHg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJFF;
            }
        }).LIZJ();
    }

    @Override // X.InterfaceC359850E8x
    public final void LIZIZ(C361980EHc c361980EHc) {
        C0EHW c0ehw = this.LIZIZ;
        c0ehw.LIZJ = 0;
        int iLIZJ = c0ehw.LIZJ(c361980EHc);
        C361980EHc c361980EHc2 = (C361980EHc) this.LIZ.LIZ(new C2217381BqS() { // from class: X.0EHf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EJ5) obj).LJFF;
            }
        }).LIZJ();
        this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHc, iLIZJ, 1065), true);
        this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHc2, 1066), true);
        this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHc, 1067), true);
    }

    @Override // X.InterfaceC359850E8x
    public final void LIZLLL(String[] strArr) {
        for (String str : strArr) {
            LJIJI(str, true);
        }
    }

    @Override // X.InterfaceC359850E8x
    public final C361980EHc LJ(String str) {
        return this.LIZIZ.LIZ(str);
    }

    @Override // X.InterfaceC359850E8x
    public final void LJFF(C362080EHm c362080EHm) {
        ArrayList<C361980EHc> arrayListLJFF = c362080EHm.LJFF(false);
        C0EHW c0ehw = this.LIZIZ;
        c0ehw.LIZ = arrayListLJFF;
        c0ehw.LIZIZ.LIZLLL(arrayListLJFF);
        this.LIZ.LIZLLL(new AwS584S0100000_5((ArrayList) arrayListLJFF, (ArrayList<Bitmap>) 1074), true);
        this.LIZ.LIZLLL(AFwS234S0000000_5.get$arr$(513), true);
    }

    @Override // X.InterfaceC359850E8x
    public final C361980EHc LJIIIIZZ(C361980EHc c361980EHc) {
        if (c361980EHc == null) {
            return null;
        }
        C0EHW c0ehw = this.LIZIZ;
        c0ehw.getClass();
        C361980EHc c361980EHc2 = c361980EHc.LIZIZ;
        if (!(c361980EHc2 instanceof C361980EHc) || c361980EHc2 == null) {
            return C0EHW.LIZIZ(c0ehw.LIZIZ, c361980EHc);
        }
        return c361980EHc2;
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIIIZ(String str) {
        LJIILJJIL(new String[]{str});
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIIJJI(C361980EHc c361980EHc) {
        this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHc, 1072), true);
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIIL(String str) {
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ(str);
        if (c361980EHcLIZ != null) {
            LIZIZ(c361980EHcLIZ);
        }
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIILJJIL(String[] strArr) {
        for (String str : strArr) {
            LJIJI(str, false);
        }
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIILLIIL(String str) {
        LIZLLL(new String[]{str});
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIJ(Drawable drawable) {
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ("bottom_item_root_sound_sync");
        if (c361980EHcLIZ != null) {
            c361980EHcLIZ.LJ = drawable;
            this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHcLIZ, 1077), true);
        }
    }

    public C362000EHe(C1664680tQA<C0EJ5> c1664680tQA, C0EHW c0ehw) {
        this.LIZ = c1664680tQA;
        this.LIZIZ = c0ehw;
    }

    @Override // X.InterfaceC359850E8x
    public final void LIZ(Object obj, String str) {
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ(str);
        if (c361980EHcLIZ != null) {
            if (obj != null) {
                c361980EHcLIZ.LJIIJJI.put("small_icon_res_id", obj);
            } else {
                c361980EHcLIZ.LJIIJJI.remove("small_icon_res_id");
            }
            this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHcLIZ, 1076), true);
        }
    }

    @Override // X.InterfaceC359850E8x
    public final int LJII(String str, String str2) {
        C361980EHc c361980EHcLJ;
        C361980EHc c361980EHcLJ2 = LJ(str);
        if (c361980EHcLJ2 != null && (c361980EHcLJ = LJ(str2)) != null) {
            return ((ArrayList) c361980EHcLJ2.LIZ).indexOf(c361980EHcLJ);
        }
        return -1;
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIIJ(String str, String str2) {
        C361980EHc c361980EHcLJ;
        C361980EHc c361980EHcLJ2 = LJ(str);
        if (c361980EHcLJ2 != null && (c361980EHcLJ = LJ(str2)) != null && ((ArrayList) c361980EHcLJ2.LIZ).contains(c361980EHcLJ)) {
            ((ArrayList) c361980EHcLJ2.LIZ).remove(c361980EHcLJ);
        }
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIILL(String str, List<C361980EHc> list) {
        String str2;
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ(str);
        if (c361980EHcLIZ != null) {
            ((ArrayList) c361980EHcLIZ.LIZ).clear();
            ((ArrayList) c361980EHcLIZ.LIZ).addAll(list);
            C361980EHc c361980EHcLJIL = LJIL();
            String str3 = null;
            if (c361980EHcLJIL != null) {
                str2 = c361980EHcLJIL.LJI;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                C0EHW c0ehw = this.LIZIZ;
                c0ehw.LIZJ = 0;
                int iLIZJ = c0ehw.LIZJ(c361980EHcLIZ);
                C361980EHc c361980EHc = (C361980EHc) this.LIZ.LIZ(new C2217381BqS() { // from class: X.0EHh
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0EJ5) obj).LJFF;
                    }
                }).LIZJ();
                if (c361980EHc != null) {
                    str3 = c361980EHc.LJI;
                }
                if (Intrinsics.LJFF(str3, str)) {
                    this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHcLIZ, iLIZJ, 1069), true);
                    this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHc, 1070), true);
                    this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHcLIZ, 1071), true);
                }
            }
        }
    }

    public final void LJIJI(String str, boolean z) {
        boolean z2;
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ(str);
        if (c361980EHcLIZ != null) {
            if (c361980EHcLIZ.LJII != z) {
                c361980EHcLIZ.LJII = z;
                z2 = true;
            } else {
                z2 = false;
                if (c361980EHcLIZ == null) {
                    return;
                }
            }
            ArrayList arrayListLJ = C1697810uHb.LJ(c361980EHcLIZ);
            C0EI3 c0ei3 = C0EI3.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = arrayListLJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            C361980EHc c361980EHc = (C361980EHc) C13LP.LJJJLL(arrayList);
            if (c361980EHc != null && z2) {
                this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHc, 1068), true);
            }
        }
    }

    @Override // X.InterfaceC359850E8x
    public final void LIZJ(String str, C361980EHc c361980EHc, boolean z) {
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ(str);
        if (c361980EHcLIZ != null) {
            C0EHW c0ehw = this.LIZIZ;
            c0ehw.getClass();
            C361980EHc c361980EHcLIZIZ = c361980EHcLIZ.LIZIZ;
            if (!(c361980EHcLIZIZ instanceof C361980EHc) || c361980EHcLIZIZ == null) {
                c361980EHcLIZIZ = C0EHW.LIZIZ(c0ehw.LIZIZ, c361980EHcLIZ);
            }
            boolean z2 = false;
            if (c361980EHcLIZIZ != null) {
                int iIndexOf = ((ArrayList) c361980EHcLIZIZ.LIZ).indexOf(c361980EHcLIZ);
                if (((ArrayList) c361980EHcLIZIZ.LIZ).remove(c361980EHcLIZ) && iIndexOf != -1) {
                    ListProtector.add(c361980EHcLIZIZ.LIZ, iIndexOf, c361980EHc);
                    z2 = true;
                }
                if (c0ehw.LIZ.contains(c361980EHcLIZ)) {
                    int iIndexOf2 = c0ehw.LIZ.indexOf(c361980EHcLIZ);
                    c0ehw.LIZ.remove(c361980EHcLIZ);
                    ListProtector.add(c0ehw.LIZ, iIndexOf2, c361980EHc);
                    c0ehw.LIZIZ.LIZLLL(c0ehw.LIZ);
                }
                if (z2) {
                    this.LIZ.LIZLLL(new AwS30S1110000_5(str, c361980EHc, z, 2), true);
                }
            }
        }
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIIZILJ(String str, C353890Du7 c353890Du7, boolean z) {
        C361980EHc c361980EHcLIZ;
        if (C353850Du3.LIZ(str) && (c361980EHcLIZ = this.LIZIZ.LIZ(str)) != null) {
            if (!Intrinsics.LJFF(c361980EHcLIZ.LJIILLIIL, c353890Du7) || z) {
                c361980EHcLIZ.LJIILLIIL = c353890Du7;
                this.LIZ.LIZLLL(new AwS584S0100000_5(c361980EHcLIZ, 1073), true);
            }
        }
    }

    @Override // X.InterfaceC359850E8x
    public final void LJIILIIL(String str, C361980EHc c361980EHc, int i, boolean z) {
        C361980EHc c361980EHcLIZ = this.LIZIZ.LIZ(str);
        if (c361980EHcLIZ != null && !c361980EHcLIZ.LIZ(c361980EHc)) {
            this.LIZIZ.getClass();
            ArrayList arrayList = (ArrayList) c361980EHcLIZ.LIZ;
            if (!arrayList.isEmpty()) {
                if (i >= 0 && i <= arrayList.size()) {
                    ListProtector.add(arrayList, i, c361980EHc);
                } else {
                    return;
                }
            } else if (i < 0 || i > arrayList.size()) {
                return;
            } else {
                ListProtector.add(arrayList, i, c361980EHc);
            }
            this.LIZ.LIZLLL(new AwS584S0100000_5(this, z, 1064), true);
        }
    }
}
