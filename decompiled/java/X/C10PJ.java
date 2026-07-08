package X;

import X.C1869040yjm;
import Y.AObserverS188S0200000_28;
import Y.ARunnableS97S0200000_28;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10PJ<T extends C1869040yjm> extends C10P5<T> {
    public final EnumC1284970jXj LJFF;

    public abstract NUJComponentFragment LJI(T t);

    @Override // X.C10P5
    public final EnumC1284970jXj LJFF() {
        return this.LJFF;
    }

    public C10PJ(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
        this.LJFF = EnumC1284970jXj.INTERNAL;
    }

    @Override // X.C10P5, X.C10P7
    public void LIZLLL(C1912470zrp c1912470zrp, T t, Function1<? super C19240810Pe, Unit> function1) {
        super.LIZLLL(c1912470zrp, t, function1);
        NUJComponentFragment nUJComponentFragmentLJI = LJI(t);
        c1912470zrp.LIZ.LJ().invoke(nUJComponentFragmentLJI, Boolean.TRUE);
        AObserverS188S0200000_28 aObserverS188S0200000_28 = new AObserverS188S0200000_28(function1, (View) nUJComponentFragmentLJI, (ViewPagerBottomSheetBehavior<View>) 22);
        nUJComponentFragmentLJI.getClass();
        ARunnableS97S0200000_28 aRunnableS97S0200000_28 = new ARunnableS97S0200000_28(nUJComponentFragmentLJI, aObserverS188S0200000_28, 50);
        if (nUJComponentFragmentLJI.getActivity() != null) {
            aRunnableS97S0200000_28.run();
        } else {
            nUJComponentFragmentLJI.LLILLJJLI.add(aRunnableS97S0200000_28);
        }
        ARunnableS97S0200000_28 aRunnableS97S0200000_282 = new ARunnableS97S0200000_28(nUJComponentFragmentLJI, type(), 49);
        if (nUJComponentFragmentLJI.getActivity() != null) {
            aRunnableS97S0200000_282.run();
        } else {
            nUJComponentFragmentLJI.LLILLJJLI.add(aRunnableS97S0200000_282);
        }
    }
}
