package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkyLightBridge$handlePagedDiskCache$1", f = "SkyLightBridge.kt", l = {577}, m = "invokeSuspend")
public final class C1569800qx8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ SkylightListViewModel LLILLL;
    public final /* synthetic */ InboxHorizontalTopListCombinePod LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569800qx8(SkylightListViewModel skylightListViewModel, InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod, InterfaceC1364105Vn<? super C1569800qx8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = skylightListViewModel;
        this.LLILZ = inboxHorizontalTopListCombinePod;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569800qx8(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("SkyLightBridge@845d.handlePagedDiskCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            SkylightListViewModel skylightListViewModel = this.LLILLL;
            InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LLILZ;
            List listSingletonList = Collections.singletonList(EnumC1598330rh9.GENERAL);
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            skylightListViewModel.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1597930rgV(skylightListViewModel, inboxHorizontalTopListCombinePod, null, listSingletonList, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SkyLightBridge@845d.handlePagedDiskCache$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePagedDiskCache: processAndGetCacheData cost=");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append("ms, mufItems=");
        sbLIZ.append(list.size());
        C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ));
        if (!C1598660rhg.LJFF && (!list.isEmpty())) {
            C1598660rhg.LIZ.getClass();
            C1600450rkZ c1600450rkZLJI = C1598660rhg.LJI();
            if (c1600450rkZLJI != null && (state = c1600450rkZLJI.getState()) != null) {
                state.LIZLLL(list, null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkyLightBridge@845d.handlePagedDiskCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
