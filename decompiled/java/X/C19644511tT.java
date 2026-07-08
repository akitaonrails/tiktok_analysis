package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19644511tT {
    public final ViewGroup LIZ;
    public final String LIZIZ;
    public AbstractC19644711tV<?> LIZJ;
    public C19639211sc LIZLLL;
    public Function2<? super Integer, ? super Integer, Unit> LJ;
    public final C19644611tU LJFF = new C19644611tU(this);
    public final C01GW<C19644811tW> LJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 875));
    public final C01GW<C19644911tX> LJII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 872));

    public final void LIZ(AwS643S0100000_29 awS643S0100000_29) {
        AbstractC19644711tV<?> abstractC19644711tV;
        this.LJ = awS643S0100000_29;
        if (awS643S0100000_29 != null && (abstractC19644711tV = this.LIZJ) != null) {
            int iLIZLLL = abstractC19644711tV.LIZLLL();
            AbstractC19644711tV<?> abstractC19644711tV2 = this.LIZJ;
            if (abstractC19644711tV2 != null) {
                awS643S0100000_29.invoke(Integer.valueOf(iLIZLLL), Integer.valueOf(abstractC19644711tV2.LJ()));
            }
        }
    }

    public final void LIZIZ(Function2<? super Integer, ? super Integer, Unit> function2) {
        FragmentManager supportFragmentManager;
        AbstractC19644711tV<?> abstractC19644711tV;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ.getContext());
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (abstractC19644711tV = this.LIZJ) != null) {
            AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29((Function2) function2, (Function2<? super Integer, ? super Integer, Unit>) abstractC19644711tV, (AbstractC19644711tV<?>) 91);
            TuxSheet tuxSheet = abstractC19644711tV.LIZ;
            if (tuxSheet != null) {
                tuxSheet.show(supportFragmentManager, abstractC19644711tV.LJFF());
            }
            abstractC19644711tV.LJIIJ(new AwS430S0200000_29(awS430S0200000_29, abstractC19644711tV, 92));
        }
    }

    public C19644511tT(String str, C19639311sd c19639311sd) {
        this.LIZ = c19639311sd;
        this.LIZIZ = str;
    }
}
