package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.1BKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203151BKn implements InterfaceC2190731AoZ {
    public final /* synthetic */ AbstractC2203141BKm LIZ;

    public C2203151BKn(AbstractC2203141BKm abstractC2203141BKm) {
        this.LIZ = abstractC2203141BKm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C1BTZ c1btz) {
        AbstractC2203141BKm abstractC2203141BKm = this.LIZ;
        abstractC2203141BKm.LIZ = c1btz;
        Iterator<InterfaceC2203171BKp> it2 = abstractC2203141BKm.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        this.LIZ.LIZJ.clear();
        this.LIZ.LIZIZ = null;
    }
}
