package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05zK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1532805zK extends C09AY implements Function0<C1532705zJ> {
    public C1532805zK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1532705zJ invoke() {
        return new InterfaceC1369450ljz() { // from class: X.05zJ
            @Override // X.InterfaceC1369450ljz
            public final void LJI(String str) {
                String str2;
                C0I0B.LJFF.LIZIZ();
                if (Intrinsics.LJFF(str, "show")) {
                    str2 = "show_undo_create_group";
                } else {
                    str2 = "click_undo_create_group";
                }
                C20684815ws.LJIILLIIL(str2, C2097908Jt.LIZJ(new Pair("enter_from", "share")));
            }
        };
    }
}
