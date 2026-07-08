package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390470mHt {
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;
    public final CharSequence LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC878303bx LJ;

    public final void LIZ(C1749280vcc c1749280vcc) {
        if (C0BTC.LIZ()) {
            InterfaceC878303bx interfaceC878303bx = this.LJ;
            if (Intrinsics.LJFF(interfaceC878303bx, C1390480mHu.LIZ) || Intrinsics.LJFF(interfaceC878303bx, C878203bw.LIZ)) {
                C1390460mHs.LIZ.getClass();
                JSONObject jSONObjectLIZ = C1390460mHs.LIZ(this, c1749280vcc);
                C793770VBv.LJII("status_ui_show", null, jSONObjectLIZ, null);
                C20684815ws.LJIJ("status_ui_show", jSONObjectLIZ);
            }
        }
    }

    public C1390470mHt(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, InterfaceC878303bx interfaceC878303bx) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence2;
        this.LIZJ = charSequence3;
        this.LIZLLL = z;
        this.LJ = interfaceC878303bx;
    }
}
