package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Arrays;

/* JADX INFO: renamed from: X.098o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23236098o extends C16F5 {
    public final C054G LLJJ;
    public AnonymousClass0956 LLJJI;

    public final void LJJJJI() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJJI = null;
    }

    public final void LJJJJIZL(long j) {
        long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(j, EnumC19990213Jk.MILLISECONDS);
        setText(C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(C19990113Jj.LJIIJ(jLJIIIIZZ)), Long.valueOf(C19990113Jj.LJIIJJI(jLJIIIIZZ))}, 2)));
    }

    public C23236098o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
    }
}
