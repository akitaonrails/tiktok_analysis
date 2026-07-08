package X;

import Y.ACListenerS127S0200000_25;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0sfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635790sfZ implements InterfaceC1635690sfP<C1642680sqg, Fragment> {
    public final InterfaceC1636820shE LIZ;
    public final C1635820sfc LIZIZ;
    public final Function0<Unit> LIZJ;
    public final LifecycleOwner LIZLLL;
    public final int LJ;
    public final C01GW LJFF;
    public final MutableLiveData<Unit> LJI;
    public final C01GW LJII;

    @Override // X.InterfaceC1635690sfP
    public final List<Integer> LIZ() {
        return C1641140soC.LIZLLL();
    }

    @Override // X.InterfaceC1635690sfP
    public final InterfaceC1631590sYn<Fragment> LIZJ(int i, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, RecyclerView.RecycledViewPool recycledViewPool) {
        InterfaceC1636820shE interfaceC1636820shE = this.LIZ;
        Function0<Unit> function0 = this.LIZJ;
        SearchStickerViewContainer searchStickerViewContainer = (SearchStickerViewContainer) this.LJII.getValue();
        MutableLiveData<Unit> mutableLiveData = this.LJI;
        SearchStickerFragment searchStickerFragment = new SearchStickerFragment();
        searchStickerFragment.cS(i, c1630880sXe, c1631250sYF, recycledViewPool);
        searchStickerFragment.LLJJI = function0;
        searchStickerFragment.LLJILLL = interfaceC1636820shE;
        searchStickerFragment.LLJILJILJ = searchStickerViewContainer;
        searchStickerFragment.LLJJ = mutableLiveData;
        return searchStickerFragment;
    }

    @Override // X.InterfaceC1635690sfP
    public final C1642680sqg LIZIZ(C19EG c19eg, EffectCategoryModel effectCategoryModel, C19YA c19ya, C1630880sXe c1630880sXe, AwS147S0201000_25 awS147S0201000_25) {
        C1642680sqg c1642680sqgLIZJ = C1641140soC.LIZJ(c19eg, c1630880sXe.LIZ.LJJLIIIJJIZ().LJIILJJIL);
        c1642680sqgLIZJ.setTextVisibility(false);
        c1642680sqgLIZJ.setImage(R.drawable.c7l);
        C786410Ut5.ab(c1642680sqgLIZJ, new ACListenerS127S0200000_25(this, awS147S0201000_25, 8));
        return c1642680sqgLIZJ;
    }

    public C1635790sfZ(C19EG c19eg, InterfaceC1636820shE interfaceC1636820shE, C1630880sXe c1630880sXe, C1635820sfc c1635820sfc, Function0 function0, C19A3 c19a3, int i) {
        this.LIZ = interfaceC1636820shE;
        this.LIZIZ = c1635820sfc;
        this.LIZJ = function0;
        this.LIZLLL = c19a3;
        this.LJ = i;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(c19eg, 1617));
        this.LJI = new MutableLiveData<>();
        this.LJII = C452501pT.LIZ(enumC452301pR, new AwS269S0300000_25(c19eg, this, c1630880sXe, 32));
    }
}
