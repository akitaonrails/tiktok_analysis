package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0e6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075830e6P implements InterfaceC1261750iwH {
    public static final /* synthetic */ int LLJI = 0;
    public final boolean LL;
    public final InterfaceC1073860e3E LLILLJJLI;
    public final int LLILLL;
    public final C1265270j1x LLILZ;
    public boolean LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public final C01GW LLIZ;
    public Fragment LLIZLLLIL;
    public String LLJ;

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    public final AbstractC1263550izB LIZ() {
        return (AbstractC1263550izB) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        if ((abstractC1261460ivo instanceof C1261480ivq) && (abstractC1261460ivo.LIZ instanceof C1261860iwS)) {
            this.LLILZ.getClass();
            C1265270j1x.LIZ().storeInt("following_exp_ff_c", 0);
            C1265270j1x.LIZ().storeLong("following_h_ff_t", -1L);
        }
    }

    public final void LIZIZ(Function1<? super Integer, Unit> function1) {
        C1262970iyF c1262970iyF = (C1262970iyF) LIZ();
        C1075800e6M currentState = c1262970iyF.getCurrentState();
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = currentState.LIZ;
        AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk2 = currentState.LIZJ;
        if ((abstractC1623806Xk instanceof C1623606Xi) && (abstractC1623806Xk2 instanceof C1623606Xi)) {
            if (function1 != null) {
                function1.invoke(Integer.valueOf(((List) ((C1623606Xi) abstractC1623806Xk2).LIZ).size()));
            }
        } else {
            if (function1 != null) {
                this.LLILZLL = function1;
            }
            if (abstractC1623806Xk instanceof C1623706Xj) {
                return;
            }
            c1262970iyF.LLFZ(false);
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        Function1<? super Integer, Unit> function1;
        if ((c1075800e6M.LIZ instanceof C1623606Xi) && (c1075800e6M.LIZJ instanceof C1623606Xi) && (function1 = this.LLILZLL) != null) {
            function1.invoke(Integer.valueOf(c1075800e6M.LIZLLL));
        }
    }

    public C1075830e6P(boolean z, InterfaceC1073860e3E interfaceC1073860e3E) {
        int followingCount;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            followingCount = curUser.getFollowingCount();
        } else {
            followingCount = 0;
        }
        C1265270j1x c1265270j1x = C1265270j1x.LIZ;
        this.LL = z;
        this.LLILLJJLI = interfaceC1073860e3E;
        this.LLILLL = followingCount;
        this.LLILZ = c1265270j1x;
        this.LLILZIL = followingCount < 20;
        this.LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 628));
        this.LLIZLLLIL = new Fragment();
        this.LLJ = "";
    }
}
