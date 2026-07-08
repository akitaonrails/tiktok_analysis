package X;

import com.bytedance.android.livesdk.gift.model.MusicGiftListPaginationResponse;
import com.bytedance.android.livesdk.gift.model.MusicGiftListResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147760fyQ extends C09AY implements Function1<MusicGiftListPaginationResponse.Data, C1147330fxj> {
    public final /* synthetic */ C1147690fyJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147760fyQ(C1147690fyJ c1147690fyJ) {
        super(1);
        this.LL = c1147690fyJ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1147330fxj invoke(MusicGiftListPaginationResponse.Data data) {
        C1147750fyP c1147750fyP = this.LL.LIZIZ;
        MusicGiftListResponse.Data.Tab tab = data.tab;
        if (tab == null) {
            tab = new MusicGiftListResponse.Data.Tab();
        }
        c1147750fyP.getClass();
        return C1147750fyP.LIZ(tab);
    }
}
