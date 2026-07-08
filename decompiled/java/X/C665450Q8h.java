package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Q8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew$onVoiceSearchSuccess$1", f = "SearchResultFragmentNew.kt", l = {}, m = "invokeSuspend")
public final class C665450Q8h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchResultFragmentNew LL;
    public final /* synthetic */ C665460Q8i LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665450Q8h(SearchResultFragmentNew searchResultFragmentNew, C665460Q8i c665460Q8i, InterfaceC1364105Vn<? super C665450Q8h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchResultFragmentNew;
        this.LLILLJJLI = c665460Q8i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C665450Q8h(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        Long endToEndSession;
        String searchSessionId;
        C1C7U.LIZ("SearchResultFragmentNew@2882.onVoiceSearchSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.AT();
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(this.LLILLJJLI.LIZ);
        searchResultParam.setEnterMethod("voice_input");
        searchResultParam.setSearchFrom("voice_input");
        boolean z = false;
        searchResultParam.setOpenNewSearchContainer(false);
        searchResultParam.setEnterFromSecond(this.LLILLJJLI.LIZLLL);
        if (this.LLILLJJLI.LIZJ == 2) {
            z = true;
        }
        searchResultParam.setIsSongRecognition(z);
        C665460Q8i c665460Q8i = this.LLILLJJLI;
        if (c665460Q8i.LIZJ == 2) {
            searchResultParam.setSongID(c665460Q8i.LIZIZ);
        }
        SearchResultFragmentNew searchResultFragmentNew = this.LL;
        C0QER c0qerLIZJ = C640270P9l.LIZJ(searchResultFragmentNew, searchResultFragmentNew.getActivity());
        long jLongValue = 0;
        if (c0qerLIZJ != null && (searchSessionId = c0qerLIZJ.getSearchSessionId()) != null) {
            j = CastLongProtector.parseLong(searchSessionId);
        } else {
            j = 0;
        }
        searchResultParam.setSearchSession(j);
        SearchResultFragmentNew searchResultFragmentNew2 = this.LL;
        C0QER c0qerLIZJ2 = C640270P9l.LIZJ(searchResultFragmentNew2, searchResultFragmentNew2.getActivity());
        if (c0qerLIZJ2 != null && (endToEndSession = c0qerLIZJ2.getEndToEndSession()) != null) {
            jLongValue = endToEndSession.longValue();
        }
        searchResultParam.setEndToEndSession(jLongValue);
        SearchStartViewModel searchStartViewModel = this.LL.LLJLL;
        if (searchStartViewModel != null && (str = searchStartViewModel.LLJLL) != null) {
            searchResultParam.setBlankPageID(str);
        }
        SearchResultFragmentNew searchResultFragmentNew3 = this.LL;
        searchResultFragmentNew3.kT(searchResultFragmentNew3.getContext(), searchResultFragmentNew3, searchResultParam);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchResultFragmentNew@2882.onVoiceSearchSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
