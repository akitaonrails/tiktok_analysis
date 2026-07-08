package X;

import X.InterfaceC1262230ix3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1261840iwQ<T extends InterfaceC1262230ix3> implements InterfaceC1891350zJl, InterfaceC1261590iw1, InterfaceC1890700zIi {
    public InterfaceC1263010iyJ LL;

    public abstract T LIZIZ();

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        return LIZIZ().hashCode();
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rec_");
        sbLIZ.append(LIZIZ().getElementId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C895430ZAv.LIZIZ;
    }

    @Override // X.InterfaceC1261590iw1
    public final InterfaceC1263010iyJ getSection() {
        return this.LL;
    }

    @Override // X.InterfaceC1261590iw1
    public final void LIZ(InterfaceC1263010iyJ interfaceC1263010iyJ) {
        this.LL = interfaceC1263010iyJ;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        AbstractC1261840iwQ abstractC1261840iwQ;
        InterfaceC1262230ix3 interfaceC1262230ix3LIZIZ = null;
        if ((interfaceC1891350zJl instanceof AbstractC1261840iwQ) && (abstractC1261840iwQ = (AbstractC1261840iwQ) interfaceC1891350zJl) != null) {
            interfaceC1262230ix3LIZIZ = abstractC1261840iwQ.LIZIZ();
        }
        return Intrinsics.LJFF(interfaceC1262230ix3LIZIZ, LIZIZ());
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        AbstractC1261840iwQ abstractC1261840iwQ;
        InterfaceC1262230ix3 interfaceC1262230ix3LIZIZ;
        String elementId = null;
        if ((interfaceC1891350zJl instanceof AbstractC1261840iwQ) && (abstractC1261840iwQ = (AbstractC1261840iwQ) interfaceC1891350zJl) != null && (interfaceC1262230ix3LIZIZ = abstractC1261840iwQ.LIZIZ()) != null) {
            elementId = interfaceC1262230ix3LIZIZ.getElementId();
        }
        return Intrinsics.LJFF(elementId, LIZIZ().getElementId());
    }

    public boolean equals(Object obj) {
        return Intrinsics.LJFF(LIZIZ(), obj);
    }

    public C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (areContentsTheSame(interfaceC1891350zJl)) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }
}
