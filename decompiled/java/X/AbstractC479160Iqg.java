package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC479160Iqg implements InterfaceC1891350zJl {
    public final C479170Iqh LL;
    public final String LLILLJJLI = "play_card_feed";

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("[section:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(",topLiveTitle:");
        sbLIZ.append(LIZ().LIZIZ);
        sbLIZ.append(",playTag:");
        sbLIZ.append(LIZ().LIZJ);
        sbLIZ.append(",relationTag:");
        sbLIZ.append(LIZ().LIZLLL);
        sbLIZ.append(",linkedUserList:");
        sbLIZ.append(LIZ().LJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C479170Iqh LIZ() {
        return this.LL;
    }

    public AbstractC479160Iqg(C479170Iqh c479170Iqh) {
        this.LL = c479170Iqh;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!Intrinsics.LJFF(this.LLILLJJLI, "you_may_like")) {
            return Intrinsics.LJFF(interfaceC1891350zJl.getClass(), getClass());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
