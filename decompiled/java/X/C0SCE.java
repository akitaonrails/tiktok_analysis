package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SCE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SCE extends C09AY implements Function1<C0S9P, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ PhotoAdCarouselComponent LLILLJJLI;
    public final /* synthetic */ TuxIconView LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SCE(int i, PhotoAdCarouselComponent photoAdCarouselComponent, TuxIconView tuxIconView, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = photoAdCarouselComponent;
        this.LLILLL = tuxIconView;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0S9P c0s9p) {
        C0S9P c0s9p2 = c0s9p;
        if (this.LL > C12ES.LIZJ(110.0f, this.LLILLJJLI.getContext())) {
            this.LLILLJJLI.LLL = true;
            TuxIconView tuxIconView = this.LLILLL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_tick_cirlce_fill);
            }
        } else if (this.LL < C12ES.LIZJ(110.0f, this.LLILLJJLI.getContext()) && this.LL > 0) {
            this.LLILLJJLI.LLL = false;
            TuxIconView tuxIconView2 = this.LLILLL;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_arrow_left_circle_ltr);
            }
        }
        int i = this.LLILZ;
        int i2 = c0s9p2.LL;
        if (i == i2) {
            this.LLILLJJLI.LLLFFI = 1;
        } else if (i == i2 - 1) {
            this.LLILLJJLI.LLLFFI = 2;
        }
        return Unit.LIZ;
    }
}
