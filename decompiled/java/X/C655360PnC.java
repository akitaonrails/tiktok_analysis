package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import java.util.List;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0PnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655360PnC implements InterfaceC1010560cP8 {
    public final /* synthetic */ SearchMixLiveCardContentAssem LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    @Override // X.InterfaceC1010560cP8
    public final View LIZIZ() {
        return this.LIZ.up();
    }

    @Override // X.InterfaceC1010560cP8
    public final ViewGroup LIZLLL() {
        return (ViewGroup) this.LIZ.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC1010560cP8
    public final AwS411S0200000_10 LJIIIIZZ() {
        return new AwS411S0200000_10(this, this.LIZ, 106);
    }

    @Override // X.InterfaceC589020N8i
    public final C622570ObP LJIILJJIL() {
        RecyclerView.ViewHolder viewHolderK4;
        C0PF9 c0pf9LJFF;
        List<SearchMixFeed> data;
        SearchMixLiveCardContentAssem searchMixLiveCardContentAssem = this.LIZ;
        Aweme aweme = this.LIZIZ;
        searchMixLiveCardContentAssem.getClass();
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchMixLiveCardContentAssem), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility == null || (viewHolderK4 = searchServiceCenter$CardCommonAbility.k4()) == null || (c0pf9LJFF = C655390PnF.LJFF(viewHolderK4)) == null || (data = c0pf9LJFF.getData()) == null || !C0BIL.LIZIZ) {
            return null;
        }
        return new C622570ObP(C724240Sb0.LJI(searchMixLiveCardContentAssem), aweme, viewHolderK4, C655390PnF.LIZLLL(data));
    }

    @Override // X.InterfaceC1010250cOd
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC1010560cP8
    public final ViewGroup getItemView() {
        View contentView = this.LIZ.getContentView();
        if (contentView instanceof ViewGroup) {
            return (ViewGroup) contentView;
        }
        return null;
    }

    @Override // X.InterfaceC1010250cOd
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    public C655360PnC(SearchMixLiveCardContentAssem searchMixLiveCardContentAssem, Aweme aweme) {
        this.LIZ = searchMixLiveCardContentAssem;
        this.LIZIZ = aweme;
    }
}
