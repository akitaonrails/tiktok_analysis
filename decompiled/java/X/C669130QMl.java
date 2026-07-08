package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.tako.ui.SearchTakoSugViewHolder$sendShowMob$1", f = "SearchTakoSugViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C669130QMl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C669110QMj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C669130QMl(C669110QMj c669110QMj, InterfaceC1364105Vn<? super C669130QMl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c669110QMj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C669130QMl(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String groupId;
        String str;
        SugExtraInfo sugExtraInfo;
        String takoDesc;
        Word word;
        C1C7U.LIZ("SearchTakoSugViewHolder@7fe6.sendShowMob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ;
        C0Q7O c0q7o = new C0Q7O();
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c0q7o.LJFF("enter_from", "search_sug_tikbot", c2082308Dt);
        c0q7o.LJFF("entrance_type", "search_sug", c2082308Dt);
        c0q7o.LJFF("group_id", str2, c2082308Dt);
        SearchSugEntity searchSugEntity = this.LL.LLIZ;
        String str3 = "";
        if (searchSugEntity == null || (word = searchSugEntity.mWord) == null || (groupId = word.getGroupId()) == null) {
            groupId = "";
        }
        c0q7o.LJFF("word_id", groupId, c2082308Dt);
        c0q7o.LJFF("impr_id", this.LL.LLJ, c2082308Dt);
        c0q7o.LJFF("raw_query", this.LL.LLJI, c2082308Dt);
        SearchSugEntity searchSugEntity2 = this.LL.LLIZ;
        if (searchSugEntity2 == null || (str = searchSugEntity2.content) == null) {
            str = "";
        }
        c0q7o.LJFF("words_content", str, c2082308Dt);
        SearchSugEntity searchSugEntity3 = this.LL.LLIZ;
        if (searchSugEntity3 != null && (sugExtraInfo = searchSugEntity3.sugExtraInfo) != null && (takoDesc = sugExtraInfo.getTakoDesc()) != null) {
            str3 = takoDesc;
        }
        c0q7o.LJFF("words_content_detail", str3, c2082308Dt);
        c0q7o.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchTakoSugViewHolder@7fe6.sendShowMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
