package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.search.gameinfo.SearchGameInfoCard;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880420z28 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SearchGameInfoCard LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880420z28(SearchGameInfoCard searchGameInfoCard, boolean z, C013C c013c) {
        super(0);
        this.LL = searchGameInfoCard;
        this.LLILLJJLI = z;
        this.LLILLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C197039127h c197039127h = this.LL.LLJJJ;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        if (this.LLILLJJLI) {
            final SearchGameInfoCard searchGameInfoCard = this.LL;
            boolean z = this.LLILLL.element;
            final Fragment fragment = searchGameInfoCard.LLILLL.getHost().getFragment();
            if (fragment != null) {
                Runnable runnable = new Runnable() { // from class: X.0z2e
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchGameInfoCard@d14.onUnRegisterSuccess$1$task$1");
                        try {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                            c1389890mGx.LJIIIZ(2131852533);
                            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                            c1389890mGx.LJI(-1);
                            c1389890mGx.LIZ.LIZ.LJIIJ = ((int) C497740JfY.LJJI(searchGameInfoCard.LLILZLL != null ? r0.getWidth() : 0)) - 58;
                            c1389890mGx.LJIIJJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchGameInfoCard@d14.onUnRegisterSuccess$1$task$1");
                    }
                };
                if (z) {
                    searchGameInfoCard.LLJJJIL = runnable;
                } else {
                    searchGameInfoCard.LLJJJIL = null;
                    runnable.run();
                }
            }
        } else {
            final SearchGameInfoCard searchGameInfoCard2 = this.LL;
            boolean z2 = this.LLILLL.element;
            final Fragment fragment2 = searchGameInfoCard2.LLILLL.getHost().getFragment();
            if (fragment2 != null) {
                Runnable runnable2 = new Runnable() { // from class: X.0z2d
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchGameInfoCard@d14.onRegisterSuccess$1$task$1");
                        try {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragment2);
                            c1389890mGx.LJIIIZ(2131852543);
                            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                            c1389890mGx.LJI(-1);
                            c1389890mGx.LIZ.LIZ.LJIIJ = ((int) C497740JfY.LJJI(searchGameInfoCard2.LLILZLL != null ? r0.getWidth() : 0)) - 58;
                            c1389890mGx.LJIIJJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchGameInfoCard@d14.onRegisterSuccess$1$task$1");
                    }
                };
                if (z2) {
                    searchGameInfoCard2.LLJJJIL = runnable2;
                } else {
                    searchGameInfoCard2.LLJJJIL = null;
                    runnable2.run();
                }
            }
        }
        return Unit.LIZ;
    }
}
