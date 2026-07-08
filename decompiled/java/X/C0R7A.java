package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R7A, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R7A extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C690210R5n LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ ViewStub LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ View LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ View LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R7A(String str, C690210R5n c690210R5n, Context context, ViewStub viewStub, int i, View view, View view2, View view3, View view4) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c690210R5n;
        this.LLILLL = context;
        this.LLILZ = viewStub;
        this.LLILZIL = i;
        this.LLILZLL = view;
        this.LLIZ = view2;
        this.LLIZLLLIL = view3;
        this.LLJ = view4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        int i;
        int i2;
        InterfaceC690020R4u interfaceC690020R4u;
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        ReferralFeedBanner referralFeedBannerLJII = C0T82.LIZJ(this.LLILLJJLI.LIZ).LJII(str);
        int i3 = referralFeedBannerLJII != null ? referralFeedBannerLJII.bannerType : 0;
        if (this.LLILLL == null) {
            C1620370sGh.LIZIZ(1, i3, "context null");
        } else {
            C690210R5n c690210R5n = this.LLILLJJLI;
            ViewStub viewStub = this.LLILZ;
            if (c690210R5n.LIZIZ == null) {
                viewStub.setLayoutResource(R.layout.fwu);
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                c690210R5n.LIZIZ = viewLJLLLL;
                c690210R5n.LIZJ = viewLJLLLL != null ? (ViewStub) viewLJLLLL.findViewById(R.id.ygj) : null;
                View view = c690210R5n.LIZIZ;
                c690210R5n.LIZLLL = view != null ? (ViewStub) view.findViewById(R.id.ygi) : null;
                View view2 = c690210R5n.LIZIZ;
                c690210R5n.LJ = view2 != null ? (ViewStub) view2.findViewById(R.id.ygk) : null;
                View view3 = c690210R5n.LIZIZ;
                c690210R5n.LJFF = view3 != null ? (ViewStub) view3.findViewById(R.id.ygm) : null;
                View view4 = c690210R5n.LIZIZ;
                c690210R5n.LJI = view4 != null ? (ViewStub) view4.findViewById(R.id.ygl) : null;
            }
            this.LLILLJJLI.getClass();
            if (i3 != 100) {
                switch (i3) {
                    case 8:
                        i = 1;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        i = 2;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 4;
            }
            C690210R5n c690210R5n2 = this.LLILLJJLI;
            ViewStub viewStub2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? c690210R5n2.LIZJ : c690210R5n2.LJI : c690210R5n2.LJFF : c690210R5n2.LJ : c690210R5n2.LIZLLL;
            if (viewStub2 == null) {
                C1620370sGh.LIZIZ(2, i3, "innerStub null");
            } else {
                if (c690210R5n2.LJIIIIZZ != i && (interfaceC690020R4u = c690210R5n2.LJIIIZ) != null) {
                    interfaceC690020R4u.LIZJ();
                }
                View view5 = this.LLILLJJLI.LIZIZ;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(0, view5);
                }
                HashMap<Integer, InterfaceC690020R4u> map = this.LLILLJJLI.LJII;
                Integer numValueOf = Integer.valueOf(i);
                C690210R5n c690210R5n3 = this.LLILLJJLI;
                InterfaceC690020R4u c1897280zTK = map.get(numValueOf);
                if (c1897280zTK == null) {
                    ReferralFeedBanner referralFeedBannerLJII2 = C0T82.LIZJ(c690210R5n3.LIZ).LJII(str);
                    if (referralFeedBannerLJII2 == null || (i2 = referralFeedBannerLJII2.bannerType) == 1 || i2 == 2) {
                        c1897280zTK = new C1897280zTK();
                    } else if (i2 != 100) {
                        switch (i2) {
                            case 8:
                                c1897280zTK = new C1897300zTM();
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c1897280zTK = new C1896360zRq();
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c1897280zTK = new C1897290zTL();
                                break;
                            default:
                                c1897280zTK = new C1897280zTK();
                                break;
                        }
                    } else {
                        c1897280zTK = new C1894460zOm();
                    }
                    map.put(numValueOf, c1897280zTK);
                }
                InterfaceC690020R4u interfaceC690020R4u2 = c1897280zTK;
                C690210R5n c690210R5n4 = this.LLILLJJLI;
                c690210R5n4.LJIIIZ = interfaceC690020R4u2;
                c690210R5n4.LJIIIIZZ = i;
                interfaceC690020R4u2.LIZ(viewStub2, str, this.LLILLL, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, c690210R5n4.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
