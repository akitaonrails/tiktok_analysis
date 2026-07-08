package X;

import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupEmptyCell;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupRowCell;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupSectionCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS228S0300000_19;

/* JADX INFO: renamed from: X.0i4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228420i4W extends AbstractC1906720ziY {
    public final Function1<C1225220hzM, Unit> LLIZLLLIL;
    public final Function1<C1225220hzM, Unit> LLJ;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(FanGroupChooseGroupSectionCell.class, FanGroupChooseGroupRowCell.class, FanGroupChooseGroupEmptyCell.class);
    }

    public C1228420i4W(AwS228S0300000_19 awS228S0300000_19, AwS228S0300000_19 awS228S0300000_192) {
        this.LLIZLLLIL = awS228S0300000_19;
        this.LLJ = awS228S0300000_192;
    }
}
