package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0yZV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862670yZV implements C14FD {
    public final Fragment LIZ;
    public final IMessageAbility LIZIZ;
    public final TakoEnterParams LIZJ;
    public final List<ITakoProcessorProtocol> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1640));
    public final C1862660yZU LJFF = new C1862660yZU(false, false, false, false, false, false, false, false, null, false);

    public final C1862660yZU LIZIZ() {
        C1862660yZU c1862660yZU = this.LJFF;
        boolean z = c1862660yZU.LIZ;
        boolean z2 = c1862660yZU.LIZIZ;
        boolean z3 = c1862660yZU.LIZJ;
        boolean z4 = c1862660yZU.LIZLLL;
        boolean z5 = c1862660yZU.LJ;
        boolean z6 = c1862660yZU.LJFF;
        boolean z7 = c1862660yZU.LJI;
        boolean z8 = c1862660yZU.LJII;
        Function0<Unit> function0 = c1862660yZU.LJIIIIZZ;
        boolean z9 = c1862660yZU.LJIIIZ;
        c1862660yZU.getClass();
        return new C1862660yZU(z, z2, z3, z4, z5, z6, z7, z8, function0, z9);
    }

    @Override // X.C14FD
    public final void LIZ(ITakoProcessorProtocol iTakoProcessorProtocol) {
        int iIndexOf;
        List list = (List) this.LJ.getValue();
        if (list != null && list.contains(iTakoProcessorProtocol) && (iIndexOf = list.indexOf(iTakoProcessorProtocol) + 1) < list.size()) {
            LIZJ(this.LIZJ, list.subList(iIndexOf, list.size()));
        }
    }

    public final void LIZJ(TakoEnterParams takoEnterParams, List<? extends ITakoProcessorProtocol> list) {
        if (takoEnterParams != null && list != null) {
            for (ITakoProcessorProtocol iTakoProcessorProtocol : list) {
                if (iTakoProcessorProtocol.Xw(this.LIZIZ, takoEnterParams) && iTakoProcessorProtocol.TS(this.LIZ, takoEnterParams, this.LJFF, this.LIZIZ, this)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1862670yZV(Fragment fragment, IMessageAbility iMessageAbility, TakoEnterParams takoEnterParams, List<? extends ITakoProcessorProtocol> list) {
        this.LIZ = fragment;
        this.LIZIZ = iMessageAbility;
        this.LIZJ = takoEnterParams;
        this.LIZLLL = list;
    }
}
