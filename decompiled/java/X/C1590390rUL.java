package X;

import Y.AComparatorS43S0000000_24;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0rUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1590390rUL {
    public final List<C1590430rUP> LIZ = new ArrayList();
    public InterfaceC1590450rUR LIZIZ;

    public final C1590400rUM LIZJ(FragmentManager fragmentManager) {
        int size;
        List<C1590430rUP> list = this.LIZ;
        if (C086I.LIZIZ(list)) {
            size = 0;
        } else {
            HashSet hashSet = new HashSet();
            for (C1590430rUP c1590430rUP : (ArrayList) list) {
                if (c1590430rUP != null) {
                    hashSet.add(Integer.valueOf(c1590430rUP.LJ));
                }
            }
            size = hashSet.size();
        }
        C1590400rUM c1590400rUM = new C1590400rUM(fragmentManager, size);
        c1590400rUM.LLJILJIL = this.LIZIZ;
        List<C1590430rUP> list2 = this.LIZ;
        c1590400rUM.LLIZ = list2;
        if (!C086I.LIZIZ(list2)) {
            c1590400rUM.LLIZLLLIL = new HashMap<>(c1590400rUM.LLIZ.size());
            c1590400rUM.LLJ = new ArrayList();
            for (C1590430rUP c1590430rUP2 : c1590400rUM.LLIZ) {
                if (c1590430rUP2 != null) {
                    c1590400rUM.LLIZLLLIL.put(c1590430rUP2.LIZIZ, c1590430rUP2);
                    int i = c1590430rUP2.LJ;
                    if (i >= ((ArrayList) c1590400rUM.LLJ).size()) {
                        ListProtector.add(c1590400rUM.LLJ, i, c1590430rUP2);
                    }
                }
            }
            InterfaceC1590450rUR interfaceC1590450rUR = c1590400rUM.LLJILJIL;
            if (interfaceC1590450rUR != null) {
                interfaceC1590450rUR.LIZJ(c1590400rUM.LLJ);
            }
            ((ArrayList) c1590400rUM.LLJ).size();
        }
        return c1590400rUM;
    }

    public final void LIZ(Bundle bundle, Class cls) {
        int i;
        if (C086I.LIZIZ(this.LIZ)) {
            i = 0;
        } else {
            Collections.sort(this.LIZ, new AComparatorS43S0000000_24(4));
            i = 1;
            for (int i2 = 1; i2 < ((ArrayList) this.LIZ).size(); i2++) {
                if (((C1590430rUP) ListProtector.get(this.LIZ, i2 - 1)).LJ != ((C1590430rUP) ListProtector.get(this.LIZ, i2)).LJ) {
                    i++;
                }
            }
        }
        LIZIZ(cls, "page_profile", i, 1.0f, bundle);
    }

    public final void LIZIZ(Class cls, String str, int i, float f, Bundle bundle) {
        ((ArrayList) this.LIZ).add(new C1590430rUP(cls, str, i, f, bundle));
    }
}
