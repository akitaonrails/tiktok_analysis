package Y;

import X.C0PAT;
import X.C0PGG;
import X.C0PGI;
import X.C1202104n5;
import X.C13LP;
import X.C1C7U;
import X.C639530P6p;
import X.C647350PaH;
import X.C647500PaW;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS0S2210000_10 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.0PGD, java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v3 */
    public final void LIZ$0() {
        String str;
        String str2;
        String str3;
        String str4;
        C639530P6p c639530P6p = C639530P6p.LIZ;
        Context context = (Context) this.l2;
        Fragment fragment = (Fragment) this.l3;
        String str5 = this.s0;
        String str6 = this.s1;
        boolean z = this.z4;
        c639530P6p.getClass();
        ArrayList arrayList = new ArrayList();
        C0PAT.LIZ.getClass();
        boolean z2 = true;
        int i = 0;
        ?? r14 = 0;
        if (!C0PAT.LJ().isEmpty()) {
            List<String> list = C0PAT.LJFF().predictEnterMethodWhiteList;
            if (list.contains("ALL_ENTER_METHOD") || (str6 != null && !a0.LJJJIL(str6) && list.contains(str6))) {
                List listLIZ = C647350PaH.LIZ(str5);
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj : listLIZ) {
                    C647500PaW.LIZ.getClass();
                    if (C647500PaW.LJIJJ((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                for (String str7 : arrayList2) {
                    C647500PaW c647500PaW = C647500PaW.LIZ;
                    c647500PaW.getClass();
                    String strLJIIJ = C647500PaW.LJIIJ(str7, z2);
                    List listLIZIZ = C647350PaH.LIZIZ(str7);
                    if (!z) {
                        C0PAT.LIZ.getClass();
                        if (!C0PAT.LIZLLL().contains(strLJIIJ)) {
                        }
                    }
                    arrayList.add(str7);
                    if (listLIZIZ != null) {
                        str3 = (String) C13LP.LJJJLZIJ(i, listLIZIZ);
                        str4 = (String) C13LP.LJJJLZIJ(z2 ? 1 : 0, listLIZIZ);
                    } else {
                        str3 = null;
                        str4 = null;
                    }
                    C647500PaW.LJJIFFI(c647500PaW, context, fragment, str7, str3, null, true, C0PGG.LOCAL_CACHE_DATA, null, str4, false, 640);
                    i = 0;
                    z2 = true;
                }
            }
        }
        C0PAT.LIZ.getClass();
        List listLIZJ = C0PAT.LIZJ();
        boolean z3 = true;
        if (!listLIZJ.isEmpty()) {
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj2 : listLIZJ) {
                if (!arrayList.contains(obj2)) {
                    arrayList3.add(obj2);
                }
            }
            for (String str8 : arrayList3) {
                C647500PaW c647500PaW2 = C647500PaW.LIZ;
                c647500PaW2.getClass();
                String strLJIIJ2 = C647500PaW.LJIIJ(str8, z3);
                List listLIZIZ2 = C647350PaH.LIZIZ(str8);
                if (!z) {
                    C0PAT.LIZ.getClass();
                    if (!C0PAT.LIZLLL().contains(strLJIIJ2)) {
                    }
                }
                if (listLIZIZ2 != null) {
                    str = (String) C13LP.LJJJLZIJ(0, listLIZIZ2);
                    str2 = (String) C13LP.LJJJLZIJ(z3 ? 1 : 0, listLIZIZ2);
                } else {
                    str = null;
                    str2 = null;
                }
                C647500PaW.LJJIFFI(c647500PaW2, context, fragment, str8, str, null, true, C0PGG.LOCAL_CACHE_DATA, null, str2, false, 640);
                z3 = true;
            }
        }
        Iterator it2 = C1202104n5.LIZ().LJIIJJI(C0PGI.BEFORE_REQUEST_WORDS, str5).iterator();
        while (it2.hasNext()) {
            context = context;
            fragment = fragment;
            ?? r13 = r14;
            ?? r142 = r14;
            C647500PaW.LJJIFFI(C647500PaW.LIZ, context, fragment, (String) it2.next(), r13, r142, true, C0PGG.LOCAL_CACHE_DATA, r142, r142, false, 896);
            r14 = r142;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S2210000_10.LIZ$1():void");
    }

    public static final void run$0(ARunnableS0S2210000_10 aRunnableS0S2210000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAsyncPreloadLynxHelper@2d8b.preloadFirstScreenLynxCardByConfig$1");
        try {
            aRunnableS0S2210000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAsyncPreloadLynxHelper@2d8b.preloadFirstScreenLynxCardByConfig$1");
    }

    public static final void run$1(ARunnableS0S2210000_10 aRunnableS0S2210000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EasterEggEventKt@4cae.logAsync$1");
        try {
            aRunnableS0S2210000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EasterEggEventKt@4cae.logAsync$1");
    }

    public ARunnableS0S2210000_10(Object obj, Object obj2, String str, String str2, boolean z, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = obj;
        this.l3 = obj2;
        this.z4 = z;
        this.s1 = str2;
    }
}
