package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459690o5X extends C1459660o5U {
    @Override // X.C1459660o5U
    public final List<C1460620o72> LIZIZ() {
        if (!C1428470nHB.LJJZZI(LIZJ())) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        C1459640o5S c1459640o5SLIZLLL = LIZLLL();
        c1459640o5SLIZLLL.LJIILL(arrayList);
        C1459640o5S.LJJI(Integer.valueOf(R.raw.icon_text_latin_thin), arrayList, true);
        c1459640o5SLIZLLL.LJIJJLI(arrayList);
        C1459640o5S.LJIIJJI(arrayList);
        c1459640o5SLIZLLL.LJIIL(Integer.valueOf(R.raw.icon_crop), arrayList, true);
        c1459640o5SLIZLLL.LJIILLIIL(arrayList, AFwS210S0000000_22.get$arr$(516));
        int size = arrayList.size();
        c1459640o5SLIZLLL.LJIJI(arrayList);
        if (arrayList.size() == size) {
            c1459640o5SLIZLLL.LJIJ(arrayList, true);
        }
        c1459640o5SLIZLLL.LJIILJJIL(arrayList);
        return arrayList;
    }

    public C1459690o5X(LifecycleOwner lifecycleOwner, C1DRG c1drg, Function0<Bundle> function0) {
        super(lifecycleOwner, c1drg, function0);
    }
}
