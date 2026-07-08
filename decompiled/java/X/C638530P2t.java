package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.components.tabs.TabChildParams;
import com.ss.android.ugc.aweme.components.tabs.TabParams;
import com.ss.android.ugc.aweme.components.tabs.TabsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0P2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.layout.VerticalComponentLayoutKt$VerticalComponentLayout$2$1$2$1", f = "VerticalComponentLayout.kt", l = {}, m = "invokeSuspend")
public final class C638530P2t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FragmentManager LL;
    public final /* synthetic */ TabParams LLILLJJLI;
    public final /* synthetic */ C20247014Ke LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638530P2t(FragmentManager fragmentManager, TabParams tabParams, C20247014Ke c20247014Ke, InterfaceC1364105Vn<? super C638530P2t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragmentManager;
        this.LLILLJJLI = tabParams;
        this.LLILLL = c20247014Ke;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C638530P2t(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerticalComponentLayoutKt@2a78.VerticalComponentLayout$2$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TabsFragment tabsFragment = new TabsFragment();
        List<TabChildParams> list = this.LLILLJJLI.tabs;
        ((ArrayList) tabsFragment.LLILLJJLI).clear();
        ((ArrayList) tabsFragment.LLILLJJLI).addAll(list);
        C638540P2u c638540P2u = tabsFragment.LL;
        if (c638540P2u != null) {
            c638540P2u.LLJ.clear();
            c638540P2u.LLJ.addAll(list);
            c638540P2u.notifyDataSetChanged();
        }
        FragmentManager fragmentManager = this.LL;
        C20247014Ke c20247014Ke = this.LLILLL;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(c20247014Ke.getId(), tabsFragment, null);
        c19ehLJIIJ.LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VerticalComponentLayoutKt@2a78.VerticalComponentLayout$2$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
