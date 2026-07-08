package X;

import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.Arrays;
import java.util.Collections;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1891940zKi extends AbstractC1906720ziY {
    public final Class<? extends PowerCell<?>>[] LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 836));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 835));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 834));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 837));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 833));

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        Class<? extends PowerCell<?>>[] clsArr = this.LLIZLLLIL;
        LJIILIIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public C1891940zKi(Class<? extends PowerCell<?>>... clsArr) {
        this.LLIZLLLIL = clsArr;
    }

    public final void LJJ(boolean z) {
        if (z) {
            LIZ((View) this.LLJIJIL.getValue());
            return;
        }
        Object value = this.LLJIJIL.getValue();
        if (value == null) {
            return;
        }
        LJIIJ().LJIIL(Collections.singletonList(value));
    }

    public final void LJJI(boolean z) {
        if (z) {
            LJII((View) this.LLJI.getValue());
        } else {
            LJIJJLI((View) this.LLJI.getValue());
        }
    }
}
