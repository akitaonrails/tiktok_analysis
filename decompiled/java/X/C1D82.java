package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS117S1200000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D82, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D82 {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public volatile C1D8B LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public volatile boolean LJFF;
    public volatile boolean LJIIIIZZ;
    public C1D8F LJIIIZ;
    public final Object LJIIL;
    public final Function0<C1D8B> LJIILIIL;
    public final C2250851D7z LIZ = new C2250851D7z(this);
    public C1D8I LIZIZ = C1D8I.LIZ;
    public final String LJI = UUID.randomUUID().toString();
    public final boolean LJII = true;
    public InterfaceC20334914hX LJIIJ = C556280Lrm.LIZ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 10));

    public final InterfaceC2250781D7s<AbstractC2250861D8a> LIZLLL() {
        return (InterfaceC2250781D7s) this.LJIIJJI.getValue();
    }

    public final boolean LJ() {
        C2250851D7z c2250851D7z = this.LIZ;
        if (c2250851D7z.LIZJ) {
            return false;
        }
        Set<C1D82> set = c2250851D7z.LIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<C1D82> it2 = set.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJ()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJII() {
        Set<C1D82> set = this.LIZ.LIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<C1D82> it2 = set.iterator();
            while (it2.hasNext()) {
                if (!(it2.next().LIZJ() instanceof C1D8N)) {
                    return;
                }
            }
        }
        LIZLLL().start();
    }

    public final AbstractC2250861D8a LIZJ() {
        return (AbstractC2250861D8a) LIZLLL().getState();
    }

    public final void LIZ(C1D82... c1d82Arr) {
        LIZIZ(false, (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length));
    }

    public final void LJFF(Object obj) {
        LJIIIIZZ("onMsg", new AwS401S0200000_35(this, obj, 1));
    }

    public final boolean LJI(C1D82... c1d82Arr) {
        C2250851D7z c2250851D7z = this.LIZ;
        C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
        C1D80 c1d80 = c2250851D7z.LIZLLL;
        if (c1d80 != null) {
            c1d80.LIZJ();
        }
        for (C1D82 c1d82 : c1d82Arr2) {
            c2250851D7z.LIZ.remove(c1d82);
            c1d82.LIZ.LIZIZ.remove(c2250851D7z.LJ);
        }
        return true;
    }

    public C1D82(Function0 function0, Object obj) {
        this.LJIIL = obj;
        this.LJIILIIL = function0;
    }

    public final boolean LIZIZ(boolean z, C1D82... c1d82Arr) {
        C2250851D7z c2250851D7z = this.LIZ;
        C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
        C1D80 c1d80 = c2250851D7z.LIZLLL;
        if (c1d80 != null && c1d80.LIZJ().LIZIZ && !z) {
            C1D84 c1d84 = c2250851D7z.LIZLLL.LJIILJJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c2250851D7z.LJ.LJIIL);
            sbLIZ.append(" add depend failed cause net is started");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1D8K c1d8k = c1d84.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("WaveKey: ");
            sbLIZ2.append(strLIZIZ);
            c1d8k.log(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        for (C1D82 c1d82 : c1d82Arr2) {
            c2250851D7z.LIZ.add(c1d82);
            c1d82.LIZ.LIZIZ.add(c2250851D7z.LJ);
        }
        return true;
    }

    public final void LJIIIIZZ(String str, Function1<? super C556300Lro, Unit> function1) {
        Executor executor;
        C2250851D7z c2250851D7z = this.LIZ;
        AwS117S1200000_35 awS117S1200000_35 = new AwS117S1200000_35(this, function1, str, 0);
        C1D8I c1d8i = c2250851D7z.LJ.LIZIZ;
        if (Intrinsics.LJFF(c1d8i, C1D8I.LIZ)) {
            executor = c2250851D7z.LIZLLL.LJ;
        } else {
            if (!Intrinsics.LJFF(c1d8i, new C1D8H() { // from class: X.1D8J
            })) {
                if (c1d8i instanceof C1D8M) {
                    c1d8i.getClass();
                } else {
                    throw new C1954807lC();
                }
            }
            executor = null;
        }
        c2250851D7z.LIZLLL.getClass();
        C1D80.LJ(executor, awS117S1200000_35);
    }
}
