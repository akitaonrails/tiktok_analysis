package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884750z97 extends C09AY implements Function1<C1884770z99, C1884770z99> {
    public final /* synthetic */ GameIntroViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884750z97(GameIntroViewModel gameIntroViewModel) {
        super(1);
        this.LL = gameIntroViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final C1884770z99 invoke(C1884770z99 c1884770z99) {
        return C1884770z99.LIZ(c1884770z99, (GameInfoCardModel) this.LL.LLILLL, null, 2);
    }
}
