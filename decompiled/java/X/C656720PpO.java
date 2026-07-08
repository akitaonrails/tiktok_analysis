package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchAdPhotoCardContentAssem;
import kotlin.Unit;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0PpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656720PpO extends C09AY implements InterfaceC1631620sYq<Aweme, String, View, Unit> {
    public final /* synthetic */ SearchAdPhotoCardContentAssem LL;
    public final /* synthetic */ C655710Pnl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C656720PpO(SearchAdPhotoCardContentAssem searchAdPhotoCardContentAssem, C655710Pnl c655710Pnl) {
        super(3);
        this.LL = searchAdPhotoCardContentAssem;
        this.LLILLJJLI = c655710Pnl;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Aweme aweme, String str, View view) {
        C655390PnF.LJ(aweme, str, view, new AwS411S0200000_10(this.LL, this.LLILLJJLI, 115));
        return Unit.LIZ;
    }
}
