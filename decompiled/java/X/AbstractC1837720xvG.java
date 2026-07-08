package X;

import fi1.m;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0xvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837720xvG<DATA_GLOBAL extends m> extends AbstractC1837630xv7<DATA_GLOBAL> {
    public final Class<DATA_GLOBAL> LLILZ;
    public DATA_GLOBAL LLILZIL;
    public C1792750wkj LLILZLL;

    @Override // X.AbstractC1837630xv7, X.AbstractC1837840xvS
    public final void LJI(C1404610meh c1404610meh) {
        Object next;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next == null || (next instanceof C1792750wkj)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLILZLL = (C1792750wkj) next;
        this.LLILZIL = (AbstractC1837610xv5) C1837820xvQ.LIZ(c1404610meh, this.LLILZ);
        super.LJI(c1404610meh);
    }

    public AbstractC1837720xvG(Class cls, EnumC1837330xud enumC1837330xud) {
        super(enumC1837330xud);
        this.LLILZ = cls;
    }
}
