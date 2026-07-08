package X;

/* JADX INFO: renamed from: X.0ODy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615960ODy implements InterfaceC736910SvR<C0OE6> {
    public final C615920ODu LL = new C0OE6() { // from class: X.0ODu
        @Override // X.C0OE6
        public final InterfaceC346201Wa LLLLIL(String str, String str2) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZIZ(new C0OE7(str, str2)), "/tiktok/user/pgc_music/query/v1/", null);
        }

        @Override // X.InterfaceC631590Opx
        public final InterfaceC346201Wa LLFZ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615900ODs(str, str2)), "/tiktok/user/pinned_pgc_music/delete/v1/", null);
        }

        @Override // X.InterfaceC631590Opx
        public final InterfaceC346201Wa pinMusic(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615880ODq(str, str2)), "/tiktok/user/pinned_pgc_music/create/v1/", null);
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
