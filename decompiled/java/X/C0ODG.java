package X;

/* JADX INFO: renamed from: X.0ODG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ODG implements InterfaceC736910SvR<InterfaceC597750NcT> {
    public final C0ODH LL = new InterfaceC597750NcT() { // from class: X.0ODH
        @Override // X.InterfaceC597750NcT
        public final InterfaceC346201Wa v0(String str) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C0ODI(str)), "/tiktok/user/not_my_song_submit_request/v1/", null);
        }

        @Override // X.InterfaceC597750NcT
        public final InterfaceC346201Wa LLIILII(int i, int i2, int i3) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZIZ(new C0ODL(i, i2, i3)), "/tiktok/user/not_my_song_review_list/v1/", null);
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
