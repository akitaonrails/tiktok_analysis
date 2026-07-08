package X;

import X.C11UL;
import com.ss.android.ugc.aweme.shortvideo.model.MemeSongModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11UX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UX<T extends C11UL> implements C11UV<T> {
    public final C01GW LIZ;

    public C11UX() {
        this(null);
    }

    public final C19568211hA<T, Void> LIZJ() {
        return (C19568211hA) this.LIZ.getValue();
    }

    public C11UX(Function2<? super T, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        this.LIZ = C452501pT.LIZIZ(new AwS573S0100000_29(function2, (Function2<? super List<MemeSongModel>, ? super String, Unit>) 797));
    }

    @Override // X.C11UV
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final int LIZ(T t) {
        if (t.LIZIZ() || t.LIZ()) {
            return 4;
        }
        if (!LIZJ().LJI(t) && !LIZJ().LJFF(t)) {
            t.downloaded = C2223808nU.LIZ(t.effect);
            if (t.LIZ()) {
                return 4;
            }
            return 2;
        }
        return 8;
    }

    public final void LIZLLL(T t, InterfaceC19568511hD<T, Void> interfaceC19568511hD) {
        C19568211hA<T, Void> c19568211hALIZJ = LIZJ();
        c19568211hALIZJ.getClass();
        c19568211hALIZJ.LJIIIIZZ(new AwS273S0300000_29(c19568211hALIZJ, (C19568211hA<Object, Object>) t, interfaceC19568511hD, (InterfaceC19568511hD<Object, Object>) 16));
    }
}
