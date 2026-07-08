package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0wp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795400wp0 {
    public String LIZ;
    public String LIZIZ;
    public List LIZJ;
    public C1795830wph LIZLLL;

    public final C1795840wpi LIZ() {
        List list = this.LIZJ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        List list2 = this.LIZJ;
        if (list2 != null) {
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
        }
        C1795840wpi c1795840wpi = new C1795840wpi(0);
        c1795840wpi.LIZ = ((C1795900wpo) ListProtector.get(this.LIZJ, 0)).LIZIZ.LIZIZ.optString("packageName").isEmpty() ? false : true;
        c1795840wpi.LIZIZ = this.LIZ;
        c1795840wpi.LIZJ = this.LIZIZ;
        c1795840wpi.LIZLLL = this.LIZLLL.LIZ();
        c1795840wpi.LJFF = new ArrayList();
        c1795840wpi.LJI = false;
        List list3 = this.LIZJ;
        c1795840wpi.LJ = list3 != null ? AbstractC19884912r9.zzj(list3) : AbstractC19884912r9.zzk();
        return c1795840wpi;
    }

    public C1795400wp0() {
        C1795830wph c1795830wph = new C1795830wph();
        c1795830wph.LIZJ = true;
        this.LIZLLL = c1795830wph;
    }

    public final void LIZIZ(C1795980wpw c1795980wpw) {
        C1795830wph c1795830wph = new C1795830wph();
        c1795830wph.LIZ = c1795980wpw.LIZ;
        c1795830wph.LIZLLL = c1795980wpw.LIZJ;
        c1795830wph.LIZIZ = c1795980wpw.LIZIZ;
        this.LIZLLL = c1795830wph;
    }
}
