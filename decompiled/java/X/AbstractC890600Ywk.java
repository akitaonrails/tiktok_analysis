package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ywk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC890600Ywk implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final int LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("top_notice_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    public AbstractC890600Ywk(int i) {
        this.LL = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        AbstractC890600Ywk abstractC890600Ywk;
        if (interfaceC1891350zJl instanceof AbstractC890600Ywk) {
            abstractC890600Ywk = (AbstractC890600Ywk) interfaceC1891350zJl;
        } else {
            abstractC890600Ywk = null;
        }
        if (abstractC890600Ywk == null || this.LL != abstractC890600Ywk.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof AbstractC890600Ywk)) {
            return C1600110rk1.LIZJ();
        }
        if (this.LL == ((AbstractC890600Ywk) interfaceC1891350zJl).LL) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }
}
