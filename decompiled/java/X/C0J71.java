package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0J71, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J71 implements C0J9E {
    public final Context LIZ;
    public final View LIZIZ;
    public final C0J5L LIZJ;
    public C0P0T LIZLLL;
    public final ArrayList<C0J5M> LJ = new ArrayList<>();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS551S0100000_7(this, 319));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 318));

    @Override // X.C0J9E
    public final void LLZZ() {
        C0P0T c0p0t = this.LIZLLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.C0J9E
    public final boolean isShowing() {
        C0P0T c0p0t = this.LIZLLL;
        if (c0p0t != null) {
            return c0p0t.isShowing();
        }
        return false;
    }

    public final void LIZIZ(C0J5M c0j5m) {
        this.LJ.remove(c0j5m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0295  */
    @Override // X.C0J9E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J71.LIZ(int, int):void");
    }

    public C0J71(C19EG c19eg, View view, C0J5L c0j5l) {
        this.LIZ = c19eg;
        this.LIZIZ = view;
        this.LIZJ = c0j5l;
    }
}
