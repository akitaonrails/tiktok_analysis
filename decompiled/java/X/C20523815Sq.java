package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel$onShow$1", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C20523815Sq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LL;
    public final /* synthetic */ AbstractC1158440gFe LLILLJJLI;
    public final /* synthetic */ ExploreLynxParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20523815Sq(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, AbstractC1158440gFe abstractC1158440gFe, ExploreLynxParams exploreLynxParams, InterfaceC1364105Vn<? super C20523815Sq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exploreTopicGeneralFeedListViewModel;
        this.LLILLJJLI = abstractC1158440gFe;
        this.LLILLL = exploreLynxParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20523815Sq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Aweme awemeLLILLL;
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel = this.LL;
        C1158430gFd c1158430gFd = (C1158430gFd) this.LLILLJJLI;
        ExploreAwemeList exploreAwemeList = c1158430gFd.LIZIZ;
        long j = c1158430gFd.LIZJ;
        exploreTopicGeneralFeedListViewModel.LLJLILLLLZIIL.clear();
        List<ExplorePostItem> list = exploreAwemeList.items;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            List<ExplorePostItem> list2 = exploreAwemeList.items;
            if (list2 != null) {
                arrayList = new ArrayList();
                Iterator<ExplorePostItem> it2 = list2.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = it2.next().aweme;
                    if (aweme != null && iAwemeService != null && (awemeLLILLL = iAwemeService.LLILLL(aweme)) != null) {
                        arrayList.add(new C20526015Tm(awemeLLILLL, awemeLLILLL.isLike(), exploreAwemeList.getRequestId(), exploreAwemeList.logPb, false, C15TI.UG_CARD.getValue(), true, 0L, null, null, null, null, null, null, 130960));
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            C15TI c15ti = C15TI.UG_CARD;
            Integer num = exploreAwemeList.hasMore;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            exploreTopicGeneralFeedListViewModel.QQ2(arrayList, c15ti, false, z);
            exploreTopicGeneralFeedListViewModel.LLILLJJLI = Long.valueOf(j);
        }
        this.LL.vQ2(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
