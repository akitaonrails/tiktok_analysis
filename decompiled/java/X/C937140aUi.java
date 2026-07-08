package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937140aUi extends AbstractC960460b6K<C936690aTz, C937150aUj> {
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final EnumC928480aGk LIZLLL;
    public final Map<String, String> LJ;

    @Override // X.C0J8P
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C21569819bE c21569819bEL5 = ((C937150aUj) viewHolder).L5();
        if (c21569819bEL5 != null) {
            c21569819bEL5.LJFF();
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C937150aUj(C786410Ut5.Td(layoutInflater, R.layout.he5, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C937140aUi(Function0 function0, C929660aIe c929660aIe, EnumC928480aGk enumC928480aGk, Map map) {
        this.LIZIZ = function0;
        this.LIZJ = c929660aIe;
        this.LIZLLL = enumC928480aGk;
        this.LJ = map;
    }
}
