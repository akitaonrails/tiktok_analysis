package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0J3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485720J3a extends LayoutInflater {
    public final LayoutInflater LIZ;

    public C485720J3a(LayoutInflater layoutInflater) {
        super(layoutInflater, layoutInflater.getContext());
        this.LIZ = layoutInflater;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        C485720J3a c485720J3a = new C485720J3a(this.LIZ.cloneInContext(context));
        if (C786410Ut5.Rd(c485720J3a) == null && C786410Ut5.Rd(this) != null) {
            LayoutInflater.Factory2 factory2Rd = C786410Ut5.Rd(this);
            try {
                if (NxRewordManager.LJIILIIL) {
                    LayoutInflater.Factory2 factory2 = c485720J3a.getFactory2();
                    if (!(c485720J3a instanceof C0J4J)) {
                        Field field = C0J43.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("layoutInflateLancet setFactory2 : ");
                        sbLIZ.append(factory2Rd);
                        sbLIZ.append("----nxFactory: ");
                        sbLIZ.append(factory2);
                        sbLIZ.append(" inflate : ");
                        sbLIZ.append(c485720J3a);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (factory2 instanceof C0J4G) {
                            ((C0J4G) factory2).LIZIZ(factory2Rd);
                            return c485720J3a;
                        }
                        factory2Rd = new C0J4G(null, factory2Rd);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream = System.err;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                Field field2 = C0J43.LIZ;
                sbLIZ2.append("NxReword/inflateLancet");
                sbLIZ2.append("layoutInflateLancet setFactory2: ");
                sbLIZ2.append(e.toString());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            c485720J3a.setFactory2(factory2Rd);
        }
        return c485720J3a;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        if (NxRewordManager.LJIILIIL) {
            C0J43.LIZIZ(this);
        }
        C1114110f69.LIZIZ(i);
        View viewTd = C786410Ut5.Td(this.LIZ, i, viewGroup, z);
        C1114110f69.LIZ(i);
        return viewTd;
    }
}
