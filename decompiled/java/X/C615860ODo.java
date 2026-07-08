package X;

/* JADX INFO: renamed from: X.0ODo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615860ODo implements InterfaceC736910SvR<InterfaceC615870ODp> {
    public final C615850ODn LL = new InterfaceC615870ODp() { // from class: X.0ODn
        @Override // X.InterfaceC631520Opq
        public final InterfaceC346201Wa LLZLLIL(String str) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZIZ(new C615810ODj(str)), "/tiktok/user/new_release_music/list/v1/", null);
        }

        @Override // X.InterfaceC631520Opq
        public final InterfaceC346201Wa LJLZ(String str, String str2) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615820ODk(str, str2)), "/tiktok/user/highlight_music/set/v1/", null);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
