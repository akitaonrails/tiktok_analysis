package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329550Cvx extends AbstractC1588960rS2<Aweme, SearchProsConsRepo> {
    public final C329660Cw8 LL;
    public final SearchProsConsRepo LLILLJJLI;
    public final Function1<List<? extends Aweme>, Unit> LLILLL;
    public final ArrayList<Aweme> LLILZ;
    public boolean LLILZIL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C329530Cvv(this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public C329550Cvx(C329660Cw8 c329660Cw8, SearchProsConsRepo searchProsConsRepo, Function1<? super List<? extends Aweme>, Unit> function1) {
        Collection<? extends Aweme> collection;
        List<InterfaceC329670Cw9> list;
        this.LL = c329660Cw8;
        this.LLILLJJLI = searchProsConsRepo;
        this.LLILLL = function1;
        ArrayList<Aweme> arrayList = new ArrayList<>();
        this.LLILZ = arrayList;
        this.LLILZIL = true;
        C329560Cvy c329560Cvy = searchProsConsRepo.LIZ.get(c329660Cw8);
        if (c329560Cvy != null && (list = c329560Cvy.LIZJ) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC329670Cw9> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getAweme());
            }
            this.LLILLL.invoke(arrayList2);
            collection = arrayList2;
        } else {
            collection = C13BV.INSTANCE;
        }
        arrayList.addAll(collection);
        this.LLILZIL = c329560Cvy != null ? c329560Cvy.LIZIZ : true;
    }
}
