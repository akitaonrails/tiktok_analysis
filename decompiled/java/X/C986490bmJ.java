package X;

/* JADX INFO: renamed from: X.0bmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986490bmJ {
    public static boolean LIZ(InterfaceC986560bmQ interfaceC986560bmQ, int i) {
        return interfaceC986560bmQ.LJ().contains(Integer.valueOf(i));
    }

    public static void LIZJ(InterfaceC986560bmQ interfaceC986560bmQ, EnumC919170a1j enumC919170a1j, boolean z) {
        interfaceC986560bmQ.LIZJ(enumC919170a1j, "game_router", true, z, false);
    }

    public static void LIZIZ(boolean z, EnumC919170a1j enumC919170a1j, boolean z2, String str, boolean z3) {
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C974210bSV c974210bSV = new C974210bSV("open_entrance", null);
        c974210bSV.LJFF = str;
        c974210bSV.LJIIIIZZ = new C974230bSX(enumC919170a1j, str, z, z2, z3);
        c784440UpuLIZ.LIZIZ(c974210bSV);
    }
}
