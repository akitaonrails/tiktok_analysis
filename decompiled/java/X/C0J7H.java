package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J7H, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget$trySendViewPagerPreload$1$1", f = "LivePreviewPlayerWidget.kt", l = {318}, m = "invokeSuspend")
public final class C0J7H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J7H(Fragment fragment, InterfaceC1364105Vn<? super C0J7H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J7H(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IViewPagerAbility iViewPagerAbility;
        C1C7U.LIZ("LivePreviewPlayerWidget@e362.trySendViewPagerPreload$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(4000L, this) == objLJFF) {
                C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.trySendViewPagerPreload$1$1");
                return objLJFF;
            }
        }
        C0J89 c0j89 = C0J89.LIZ;
        int iHashCode = this.LLILLJJLI.hashCode();
        c0j89.getClass();
        Set<Integer> set = C0J89.LJIIJJI;
        if (!set.contains(Integer.valueOf(iHashCode))) {
            set.add(Integer.valueOf(iHashCode));
            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LLILLJJLI);
            if (interfaceC665370Q7zLJ != null && (iViewPagerAbility = (IViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) != null) {
                iViewPagerAbility.bY1();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.trySendViewPagerPreload$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
