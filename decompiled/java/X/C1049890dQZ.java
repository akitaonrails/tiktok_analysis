package X;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049890dQZ extends AbstractC1050010dQl implements InterfaceC1049880dQY {
    public InterfaceC1049750dQL LJII;

    @Override // X.InterfaceC1049880dQY
    public final void LIZJ() {
        this.LIZ.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
    }

    public C1049890dQZ(Context context) {
        super(context);
    }

    @Override // X.AbstractC1050010dQl
    public final boolean LJ(Object... objArr) {
        C1049840dQU c1049840dQU = this.LIZIZ.LLLLZLLLI;
        if (c1049840dQU != null) {
            InterfaceC1049750dQL interfaceC1049750dQLLIZ = c1049840dQU.LIZ(this.LJ);
            this.LJII = interfaceC1049750dQLLIZ;
            if (interfaceC1049750dQLLIZ != null) {
                interfaceC1049750dQLLIZ.LIZ(this);
                return false;
            }
            String str = this.LJ;
            C1049850dQV c1049850dQV = new C1049850dQV();
            if (((HashMap) c1049840dQU.LIZ).containsKey(str) && ((HashMap) c1049840dQU.LIZ).get(str) != null) {
                return false;
            }
            ((HashMap) c1049840dQU.LIZ).put(str, c1049850dQV);
            return false;
        }
        return false;
    }
}
