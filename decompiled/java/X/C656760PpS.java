package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchAdPhotoCardContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656760PpS implements InterfaceC1011350cQP {
    public final C656720PpO LIZ;
    public final /* synthetic */ SearchAdPhotoCardContentAssem LIZIZ;
    public final /* synthetic */ C655710Pnl LIZJ;

    @Override // X.InterfaceC1011350cQP
    public final InterfaceC1631620sYq<Aweme, String, View, Unit> LIZ() {
        throw null;
    }

    @Override // X.InterfaceC1011350cQP
    public final ViewGroup LJFF() {
        throw null;
    }

    @Override // X.InterfaceC1011350cQP
    public final ViewGroup LJIIJJI() {
        throw null;
    }

    @Override // X.InterfaceC1011350cQP
    public final Function0<Unit> LJIIL() {
        return new AwS554S0100000_10(this.LIZIZ, 1298);
    }

    @Override // X.InterfaceC589020N8i
    public final C622570ObP LJIILJJIL() {
        RecyclerView.ViewHolder viewHolderK4;
        C0PF9 c0pf9LJFF;
        List<SearchMixFeed> data;
        SearchAdPhotoCardContentAssem searchAdPhotoCardContentAssem = this.LIZIZ;
        Aweme aweme = this.LIZJ.LLILLJJLI;
        searchAdPhotoCardContentAssem.getClass();
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchAdPhotoCardContentAssem), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility == null || (viewHolderK4 = searchServiceCenter$CardCommonAbility.k4()) == null || (c0pf9LJFF = C655390PnF.LJFF(viewHolderK4)) == null || (data = c0pf9LJFF.getData()) == null || !C0BIL.LIZIZ) {
            return null;
        }
        return new C622570ObP(C724240Sb0.LJI(searchAdPhotoCardContentAssem), aweme, viewHolderK4, C655390PnF.LIZLLL(data));
    }

    @Override // X.InterfaceC1010250cOd
    public final Aweme getAweme() {
        return this.LIZJ.LLILLJJLI;
    }

    @Override // X.InterfaceC1010250cOd
    public final Context getContext() {
        return this.LIZIZ.getContext();
    }

    @Override // X.InterfaceC1011350cQP
    public final ViewGroup getItemView() {
        View contentView = this.LIZIZ.getContentView();
        if (contentView instanceof ViewGroup) {
            return (ViewGroup) contentView;
        }
        return null;
    }

    public C656760PpS(SearchAdPhotoCardContentAssem searchAdPhotoCardContentAssem, C655710Pnl c655710Pnl) {
        this.LIZIZ = searchAdPhotoCardContentAssem;
        this.LIZJ = c655710Pnl;
        this.LIZ = new C656720PpO(searchAdPhotoCardContentAssem, c655710Pnl);
    }
}
