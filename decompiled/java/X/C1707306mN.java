package X;

import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06mN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1707306mN implements InterfaceC1707406mO {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1009));

    @Override // X.InterfaceC1707406mO
    public final Object LIZ(String str, InterfaceC898340ZMa interfaceC898340ZMa) {
        C1706906mJ c1706906mJ;
        String str2;
        if ((interfaceC898340ZMa instanceof C1706906mJ) && (c1706906mJ = (C1706906mJ) interfaceC898340ZMa) != null) {
            if (Intrinsics.LJFF(str, "preshown_stickers_score_updating_action")) {
                str2 = c1706906mJ.LIZLLL;
            } else if (Intrinsics.LJFF(str, "preshown_stickers_scene_id")) {
                str2 = c1706906mJ.LJ;
            }
            if (str2 != null) {
                return str2;
            }
        }
        InterfaceC1707406mO interfaceC1707406mO = (InterfaceC1707406mO) this.LIZ.getValue();
        if (interfaceC1707406mO == null) {
            return null;
        }
        return interfaceC1707406mO.LIZ(str, interfaceC898340ZMa);
    }
}
