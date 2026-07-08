package X;

import Y.AObserverS223S0100000_19;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.ss.android.ugc.aweme.notification.module.cell.HeaderCell;
import com.ss.android.ugc.aweme.notification.module.cell.LoadMoreCell;
import com.ss.android.ugc.aweme.notification.module.cell.TemplateCell;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iR3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242390iR3 extends AbstractC1906720ziY {
    public final C1242310iQv LLIZLLLIL;
    public final C01GW LLJ = C0DTR.LIZJ(new AwS563S0100000_19(this, 1627));
    public final C01GW LLJI = C0DTR.LIZJ(new AwS563S0100000_19(this, 1628));

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(HeaderCell.class, TemplateCell.class, LoadMoreCell.class);
        LJIIJ().LIZ(new C1242300iQu(this, (NotificationChunkVM) this.LLJI.getValue()), C1242300iQu.class);
        ((NextLiveData) LJJ().LLILLL.getValue()).observe(this.LLIZLLLIL, new AObserverS223S0100000_19(this, 28), true);
        ((LiveData) ((NotificationChunkVM) this.LLJI.getValue()).LLJILJILJ.getValue()).observe(this.LLIZLLLIL, new AObserverS223S0100000_19(this, 29));
    }

    public final C1242400iR4 LJJ() {
        return (C1242400iR4) this.LLJ.getValue();
    }

    public C1242390iR3(C1242310iQv c1242310iQv) {
        this.LLIZLLLIL = c1242310iQv;
    }
}
