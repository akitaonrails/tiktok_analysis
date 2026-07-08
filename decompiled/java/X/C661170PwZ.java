package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchPhotoCommentAnchorViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem$recordViewShow$1", f = "SearchVideoPhotoCommentAnchorAssem.kt", l = {421}, m = "invokeSuspend")
public final class C661170PwZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchVideoPhotoCommentAnchorAssem<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C661170PwZ(SearchVideoPhotoCommentAnchorAssem<T> searchVideoPhotoCommentAnchorAssem, InterfaceC1364105Vn<? super C661170PwZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchVideoPhotoCommentAnchorAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C661170PwZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Comment comment;
        C1C7U.LIZ("SearchVideoPhotoCommentAnchorAssem@43e1.recordViewShow$1");
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
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("SearchVideoPhotoCommentAnchorAssem@43e1.recordViewShow$1");
                return objLJFF;
            }
        }
        SearchPhotoCommentAnchorViewModel searchPhotoCommentAnchorViewModelIp = this.LLILLJJLI.ip();
        SearchVideoPhotoCommentAnchorAssem<T> searchVideoPhotoCommentAnchorAssem = this.LLILLJJLI;
        String str = searchVideoPhotoCommentAnchorAssem.LLJLL;
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(searchVideoPhotoCommentAnchorAssem.LJJIJL());
        C661190Pwb state = searchPhotoCommentAnchorViewModelIp.getState();
        Aweme aweme = state.LLILZ;
        if (aweme != null && (comment = state.LL) != null) {
            C448210Hhr c448210Hhr = new C448210Hhr(comment, aweme);
            C661330Pwp.LIZ(c448210Hhr, state.LLILZ, str, iSearchContextAbilityLIZ);
            c448210Hhr.LJIJI("enter_method", "show");
            c448210Hhr.LJIILJJIL();
        }
        this.LLILLJJLI.LLJLILLLLZIIL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoPhotoCommentAnchorAssem@43e1.recordViewShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
