package X;

/* JADX INFO: renamed from: X.0irP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258730irP extends C1260870iur<C1258790irV, InterfaceC1259130is3> {
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        if (this.LLILLJJLI == 0 || this.LL == 0) {
            return;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemDelete ");
        sbLIZ.append((String) this.LL.getData());
        c2276411E8h.LIZJ("common_feed", 6, "DeleteAweme", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC1259130is3) this.LLILLJJLI).RO2((String) this.LL.getData());
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC1259130is3) k).Q50(exc);
        }
    }
}
