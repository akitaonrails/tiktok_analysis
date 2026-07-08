package X;

import X.AbstractC1837700xvE;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0xv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837650xv9<FETCH_DATA extends AbstractC1837700xvE> extends AbstractC1837630xv7<FETCH_DATA> {
    public final Class<FETCH_DATA> LLILZ;
    public C1837750xvJ LLILZIL;

    @Override // X.AbstractC1837630xv7, X.AbstractC1837840xvS
    public final void LJI(C1404610meh c1404610meh) {
        this.LLILLL = (FETCH_DATA) C1837820xvQ.LIZ(c1404610meh, this.LLILZ);
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1837750xvJ) {
                if (next != null) {
                    this.LLILZIL = (C1837750xvJ) next;
                    super.LJI(c1404610meh);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.comp.api.pcs.infra.payment.model.IapFetchParamContainer");
    }

    public AbstractC1837650xv9(Class cls, EnumC1837330xud enumC1837330xud) {
        super(enumC1837330xud);
        this.LLILZ = cls;
    }
}
