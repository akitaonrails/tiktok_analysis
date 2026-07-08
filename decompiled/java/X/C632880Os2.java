package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0Os2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632880Os2 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final List<C632960OsA> LJIIIIZZ;

    public C632880Os2() {
        this("", "", "", "", "", 0, false, false, C13BV.INSTANCE);
    }

    public final EnumC632860Os0 LIZIZ() {
        C632870Os1 c632870Os1 = EnumC632860Os0.Companion;
        int i = this.LJFF;
        c632870Os1.getClass();
        return (i == -1 || i == 0) ? EnumC632860Os0.TO_FOLLOW : (i == 1 || i == 2) ? EnumC632860Os0.FOLLOWING : i != 4 ? EnumC632860Os0.TO_FOLLOW : EnumC632860Os0.REQUESTED;
    }

    public final String LIZJ() {
        List<C632960OsA> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C632960OsA> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        return C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS240S0000000_9.get$arr$(937), 31);
    }

    public static C632880Os2 LIZ(C632880Os2 c632880Os2, String str, int i, int i2) {
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        int i3 = i;
        String str6 = str;
        if ((i2 & 1) != 0) {
            str6 = c632880Os2.LIZ;
        }
        List<C632960OsA> list = null;
        if ((i2 & 2) != 0) {
            str2 = c632880Os2.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = c632880Os2.LIZJ;
        } else {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            str4 = c632880Os2.LIZLLL;
        } else {
            str4 = null;
        }
        if ((i2 & 16) != 0) {
            str5 = c632880Os2.LJ;
        } else {
            str5 = null;
        }
        if ((i2 & 32) != 0) {
            i3 = c632880Os2.LJFF;
        }
        if ((i2 & 64) != 0) {
            z = c632880Os2.LJI;
        } else {
            z = false;
        }
        if ((i2 & 128) != 0) {
            z2 = c632880Os2.LJII;
        } else {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            list = c632880Os2.LJIIIIZZ;
        }
        c632880Os2.getClass();
        return new C632880Os2(str6, str2, str3, str4, str5, i3, z, z2, list);
    }

    public C632880Os2(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, List<C632960OsA> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = list;
    }
}
