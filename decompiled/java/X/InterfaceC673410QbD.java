package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.List;

/* JADX INFO: renamed from: X.0QbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC673410QbD extends InterfaceC149400hg {
    ListenableFuture LJIJI();

    Object LJJL(C0QER c0qer, boolean z, String str, C0QWI c0qwi, boolean z2, ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew, Integer num, Integer num2, boolean z3, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility, String str2, InterfaceC1364105Vn interfaceC1364105Vn);

    ListenableFuture LJLLLLLL(C0QER c0qer, boolean z, String str, C0QWI c0qwi, boolean z2, ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew, Integer num, Integer num2, boolean z3, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility, String str2);

    String LLLFZ(C0QWJ c0qwj, boolean z, boolean z2, C0QWI c0qwi, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility);

    List<SearchHistory> LLLIL(C0QER c0qer, boolean z, C0QWI c0qwi, ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility);

    void LLLLLILLIL(C0QWJ c0qwj, String str, boolean z);
}
