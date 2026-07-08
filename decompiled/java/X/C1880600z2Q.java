package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameProfileIntroCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z2Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880600z2Q extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GameProfileIntroCard LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880600z2Q(GameProfileIntroCard gameProfileIntroCard, boolean z, C013C c013c, Fragment fragment) {
        super(0);
        this.LL = gameProfileIntroCard;
        this.LLILLJJLI = z;
        this.LLILLL = c013c;
        this.LLILZ = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C197039127h c197039127h = this.LL.LLJJIJIL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        if (this.LLILLJJLI) {
            GameProfileIntroCard gameProfileIntroCard = this.LL;
            gameProfileIntroCard.LLJJIJI = false;
            gameProfileIntroCard.LJJJLIIL(1);
        } else {
            GameProfileIntroCard gameProfileIntroCard2 = this.LL;
            gameProfileIntroCard2.LLJJIJI = true;
            gameProfileIntroCard2.LJJJLIIL(2);
            C1880680z2Y c1880680z2Y = new C1880680z2Y(this.LLILZ, this.LL);
            if (this.LLILLL.element) {
                this.LL.LLJJL = c1880680z2Y;
            } else {
                this.LL.LLJJL = null;
                c1880680z2Y.invoke();
            }
        }
        return Unit.LIZ;
    }
}
