package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679080QkM extends AbstractC679110QkP {
    @Override // X.AbstractC679110QkP
    public final String LIZ() {
        return "v_search_third_layer";
    }

    public C679080QkM(C679100QkO c679100QkO) {
        super(c679100QkO);
    }

    @Override // X.AbstractC679110QkP
    public final boolean LIZJ(AbstractC679120QkQ abstractC679120QkQ) {
        if (Intrinsics.LJFF(abstractC679120QkQ.LJFF(), "show_bottom_tips")) {
            return this.LIZ.LIZLLL(abstractC679120QkQ);
        }
        return true;
    }
}
