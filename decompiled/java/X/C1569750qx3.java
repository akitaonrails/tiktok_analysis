package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.vh.SkylightContainerVH$getShowDataDirectly$1", f = "SkylightContainerVH.kt", l = {429}, m = "invokeSuspend")
public final class C1569750qx3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1598650rhf LLILLJJLI;
    public final /* synthetic */ InboxHorizontalTopListCombinePod LLILLL;
    public final /* synthetic */ StoryCacheData LLILZ;
    public final /* synthetic */ List<EnumC1598330rh9> LLILZIL;
    public final /* synthetic */ Function1<List<? extends InterfaceC1891350zJl>, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1569750qx3(C1598650rhf c1598650rhf, InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, StoryCacheData storyCacheData, List<? extends EnumC1598330rh9> list, Function1<? super List<? extends InterfaceC1891350zJl>, Unit> function1, InterfaceC1364105Vn<? super C1569750qx3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1598650rhf;
        this.LLILLL = inboxHorizontalTopListCombinePod;
        this.LLILZ = storyCacheData;
        this.LLILZIL = list;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569750qx3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SkylightContainerVH@6dc0.getShowDataDirectly$1");
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
            SkylightListViewModel skylightListViewModelV5 = this.LLILLJJLI.V5();
            InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LLILLL;
            StoryCacheData storyCacheData = this.LLILZ;
            List<EnumC1598330rh9> list = this.LLILZIL;
            this.LL = 1;
            skylightListViewModelV5.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1597930rgV(skylightListViewModelV5, inboxHorizontalTopListCombinePod, storyCacheData, list, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SkylightContainerVH@6dc0.getShowDataDirectly$1");
                return objLJFF;
            }
        }
        this.LLILZLL.invoke((List<? extends InterfaceC1891350zJl>) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightContainerVH@6dc0.getShowDataDirectly$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
