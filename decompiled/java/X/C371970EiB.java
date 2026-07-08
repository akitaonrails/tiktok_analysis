package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371970EiB extends AbstractC365870EWb {
    public final C554970Lpf LIZ;
    public final boolean LIZIZ = !C297640Bla.LIZ();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();
    public final Pair<List<String>, Map<String, List<String>>> LJ = new Pair<>(new ArrayList(), new HashMap());

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 3;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 200;
    }

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C371970EiB(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C371960EiA(this, null));
    }

    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C371940Ei8(this, null));
    }
}
