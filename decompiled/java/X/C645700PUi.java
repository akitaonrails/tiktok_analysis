package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C645700PUi extends AbstractC648060PbQ {
    public final List<AbstractC648060PbQ> LLILLJJLI;

    @Override // X.AbstractC648060PbQ
    public final void LJ() {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((AbstractC648060PbQ) it2.next()).LJ();
        }
    }

    public C645700PUi(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        this.LLILLJJLI = new ArrayList();
    }
}
