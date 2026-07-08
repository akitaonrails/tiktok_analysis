package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0659, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.MainPageFragment$onTabSwitched$1$1", f = "MainPageFragment.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0659 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MainPageFragment LL;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0659(MainPageFragment mainPageFragment, Fragment fragment, InterfaceC1364105Vn<? super AnonymousClass0659> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mainPageFragment;
        this.LLILLJJLI = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0659(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("MainPageFragment@c096.onTabSwitched$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MainPageFragment mainPageFragment = this.LL;
        Fragment fragment = this.LLILLJJLI;
        mainPageFragment.getClass();
        if (fragment != null) {
            IPlaybackControlService iPlaybackControlServiceLJIIIZ = C1D0F.LIZ.LJIIIZ();
            if (!(fragment instanceof InterfaceC1564520qoc) && !(fragment instanceof MainFragment)) {
                z = false;
            } else {
                z = true;
            }
            iPlaybackControlServiceLJIIIZ.LIZLLL(mainPageFragment, z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainPageFragment@c096.onTabSwitched$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
