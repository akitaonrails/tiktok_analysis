package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18u6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21432018u6 implements InterfaceC21447718wd {
    public final List<AbstractC21442818vq> LIZ = new ArrayList(3);
    public final List<InterfaceC21444318w5> LIZIZ = new ArrayList(3);
    public boolean LIZJ;

    public final C21432018u6 LIZ(AbstractC21442818vq abstractC21442818vq) {
        ((ArrayList) this.LIZ).add(abstractC21442818vq);
        return this;
    }

    public final C21432018u6 LIZIZ(Class cls) {
        int size = ((ArrayList) this.LIZ).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (cls.equals(ListProtector.get(this.LIZ, i).getClass())) {
                ListProtector.remove(this.LIZ, i);
                break;
            }
            i++;
        }
        return this;
    }
}
