package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20525115Td extends C09AY implements Function1<ExploreAwemeList, Unit> {
    public final /* synthetic */ C15TX LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C259800zU<ExploreAwemeList> LLILZLL;
    public final /* synthetic */ Function1<ExploreAwemeList, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20525115Td(C15TX c15tx, boolean z, Aweme aweme, boolean z2, int i, C259800zU<ExploreAwemeList> c259800zU, Function1<? super ExploreAwemeList, Unit> function1) {
        super(1);
        this.LL = c15tx;
        this.LLILLJJLI = z;
        this.LLILLL = aweme;
        this.LLILZ = z2;
        this.LLILZIL = i;
        this.LLILZLL = c259800zU;
        this.LLIZ = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.explore.data.ExploreAwemeList, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ExploreAwemeList exploreAwemeList) {
        List<ExploreCardInsertResultStruct> list;
        List<ExplorePostItem> list2;
        Function1<ExploreAwemeList, Unit> function1;
        ExploreAwemeList exploreAwemeList2 = exploreAwemeList;
        if (exploreAwemeList2.LL) {
            C15TX c15tx = this.LL;
            boolean z = this.LLILLJJLI;
            Aweme aweme = this.LLILLL;
            boolean z2 = this.LLILZ;
            int i = this.LLILZIL;
            c15tx.getClass();
            C15TX.LIZ(exploreAwemeList2, z, aweme, z2, i, true);
            this.LLILZLL.element = exploreAwemeList2;
            if (this.LLILLJJLI) {
                Keva keva = C15UA.LIZ;
                if (keva.getInt("is_first_refresh", 0) == 1) {
                    keva.storeString("request_id", exploreAwemeList2.getRequestId());
                    keva.storeInt("is_first_refresh", 0);
                }
            }
            if (exploreAwemeList2.LLILLJJLI == EnumC20527415Ua.FIRST_FULL_DATA && (function1 = this.LLIZ) != 0) {
                function1.invoke(exploreAwemeList2);
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
        } else {
            C15TX c15tx2 = this.LL;
            boolean z3 = this.LLILLJJLI;
            Aweme aweme2 = this.LLILLL;
            boolean z4 = this.LLILZ;
            int i2 = this.LLILZIL;
            C15TX c15tx3 = C15TX.LLILZLL;
            c15tx2.getClass();
            C15TX.LIZ(exploreAwemeList2, z3, aweme2, z4, i2, false);
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            Function1<ExploreAwemeList, Unit> function12 = this.LLIZ;
            if (function12 != 0) {
                function12.invoke(exploreAwemeList2);
            }
            ExploreAwemeList exploreAwemeList3 = new ExploreAwemeList();
            C259800zU<ExploreAwemeList> c259800zU = this.LLILZLL;
            ArrayList arrayList = new ArrayList();
            ExploreAwemeList exploreAwemeList4 = c259800zU.element;
            if (exploreAwemeList4 != null && (list2 = exploreAwemeList4.items) != null) {
                arrayList.addAll(list2);
            }
            List<ExplorePostItem> list3 = exploreAwemeList2.items;
            if (list3 != null) {
                arrayList.addAll(list3);
            }
            exploreAwemeList3.items = arrayList;
            ArrayList arrayList2 = new ArrayList();
            ExploreAwemeList exploreAwemeList5 = c259800zU.element;
            if (exploreAwemeList5 != null && (list = exploreAwemeList5.cards) != null) {
                arrayList2.addAll(list);
            }
            List<ExploreCardInsertResultStruct> list4 = exploreAwemeList2.cards;
            if (list4 != null) {
                arrayList2.addAll(list4);
            }
            exploreAwemeList3.cards = arrayList2;
            exploreAwemeList3.hasMore = exploreAwemeList2.hasMore;
            exploreAwemeList3.setRequestId(exploreAwemeList2.getRequestId());
            exploreAwemeList3.logPb = exploreAwemeList2.logPb;
            exploreAwemeList3.LLILZ = exploreAwemeList2.LLILZ;
            exploreAwemeList3.preloadInfo = exploreAwemeList2.preloadInfo;
            C15TX c15tx4 = this.LL;
            boolean z5 = this.LLILLJJLI;
            int i3 = this.LLILZIL;
            c15tx4.getClass();
            if (z5 && (i3 == EnumC1568370qup.NO_PREFETCH.getValue() || !c15tx4.LLILLJJLI)) {
                C15T8.LL.getClass();
                C15T8.LIZ(i3, exploreAwemeList3);
                C20524315Sv.LL.getClass();
                C20524315Sv.LJI(exploreAwemeList3);
            }
        }
        return Unit.LIZ;
    }
}
