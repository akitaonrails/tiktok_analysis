package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCard;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880380z24 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ SearchGameInfoCard LL;
    public final /* synthetic */ C013C LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880380z24(SearchGameInfoCard searchGameInfoCard, C013C c013c) {
        super(1);
        this.LL = searchGameInfoCard;
        this.LLILLJJLI = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C197039127h c197039127h = this.LL.LLJJJ;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        final Fragment fragment = this.LL.LLILLL.getHost().getFragment();
        if (fragment != null) {
            C013C c013c = this.LLILLJJLI;
            final SearchGameInfoCard searchGameInfoCard = this.LL;
            Runnable runnable = new Runnable() { // from class: X.0z2f
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchGameInfoCard@d14.requestRegister$3$1$task$1");
                    try {
                        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                        c1389890mGx.LJFF(R.raw.icon_x_mark_circle_fill);
                        c1389890mGx.LJI(-1);
                        c1389890mGx.LJIIIZ(2131855694);
                        c1389890mGx.LIZ.LIZ.LJIIJ = ((int) C497740JfY.LJJI(searchGameInfoCard.LLILZLL != null ? r0.getWidth() : 0)) - 58;
                        c1389890mGx.LJIIJJI();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchGameInfoCard@d14.requestRegister$3$1$task$1");
                }
            };
            if (c013c.element) {
                searchGameInfoCard.LLJJJIL = runnable;
            } else {
                searchGameInfoCard.LLJJJIL = null;
                runnable.run();
            }
        }
        return Unit.LIZ;
    }
}
