package X;

/* JADX INFO: renamed from: X.0ODx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615950ODx implements InterfaceC736910SvR<InterfaceC615940ODw> {
    public final C615930ODv LL = new InterfaceC615940ODw() { // from class: X.0ODv
        @Override // X.InterfaceC631520Opq
        public final InterfaceC346201Wa LLJLILLLLZIIL(String str) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615790ODh(str)), "/tiktok/user/highlight_music/delete/v1/", null);
        }

        @Override // X.InterfaceC615940ODw
        public final Object LIZIZ(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0O7A<C0OE0>>> interfaceC1364105Vn) {
            C632120Oqo c632120Oqo = C632120Oqo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OriginMusicListRepositoryOperator getPinnedMusicList, secUid:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c632120Oqo.getClass();
            C632120Oqo.LIZ(strLIZIZ);
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZIZ(new C0OE1(str)), "/tiktok/user/pinned_pgc_music/list/v1/", null);
        }

        @Override // X.InterfaceC631590Opx
        public final InterfaceC346201Wa LLFZ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615900ODs(str, str2)), "/tiktok/user/pinned_pgc_music/delete/v1/", null);
        }

        @Override // X.InterfaceC631590Opx
        public final InterfaceC346201Wa pinMusic(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZ(new C615880ODq(str, str2)), "/tiktok/user/pinned_pgc_music/create/v1/", null);
        }

        @Override // X.InterfaceC615940ODw
        public final InterfaceC346201Wa q(String str, String str2, int i, int i2) {
            C632120Oqo c632120Oqo = C632120Oqo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OriginMusicListRepositoryOperator getOriginMusicList, uid:");
            sbLIZ.append(str);
            sbLIZ.append(", secUid:");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c632120Oqo.getClass();
            C632120Oqo.LIZ(strLIZIZ);
            return C632050Oqh.LIZLLL(C613940O6e.LIZ().LIZIZ(new C0OE2(str, str2, i, i2)), "/aweme/v1/original/music/list/", null);
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
