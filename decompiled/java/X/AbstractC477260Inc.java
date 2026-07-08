package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Inc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC477260Inc implements InterfaceC477270Ind {
    public final Context LIZ;
    public final EnumC471790Ien LIZIZ;
    public BaseListResponse<FeedItem, FeedExtra> LIZJ;
    public ViewGroup LIZLLL;
    public final C01GW LJ = C292401Bi.LIZ(new AwS551S0100000_7(this, 693));
    public final C01GW LJFF = C292401Bi.LIZ(new AwS551S0100000_7(this, 695));
    public final C01GW LJI = C292401Bi.LIZ(new AwS551S0100000_7(this, 694));
    public String LJII;
    public boolean LJIIIIZZ;

    public abstract int LIZIZ();

    @Override // X.InterfaceC477270Ind
    public View LIZ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), LIZIZ(), null, false);
        ViewGroup viewGroup = viewTd instanceof ViewGroup ? (ViewGroup) viewTd : null;
        this.LIZLLL = viewGroup;
        if (viewGroup != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup, new AwS586S0100000_7(this, 433));
        }
        ViewGroup viewGroup2 = this.LIZLLL;
        return viewGroup2 == null ? new View(this.LIZ) : viewGroup2;
    }

    public final void LIZJ() {
        FeedExtra feedExtra;
        FeedBannerContainer feedBannerContainer;
        List<FeedBanner> list;
        FeedBanner feedBanner;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = this.LIZJ;
        if (baseListResponse == null || (feedExtra = (FeedExtra) baseListResponse.extra) == null || (feedBannerContainer = feedExtra.bannerContainer) == null || (list = feedBannerContainer.bannerList) == null || (feedBanner = (FeedBanner) C13LP.LJJJLZIJ(0, list)) == null || this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_activity_banner_show");
        c474500IjALIZ.LJJII(Long.valueOf(feedBanner.id), "activity_name");
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        c474500IjALIZ.LJJII(curUser != null ? Long.valueOf(curUser.getId()) : null, "user_id");
        c474500IjALIZ.LJJII(this.LIZIZ == EnumC471790Ien.ROOM ? "toplive_banner" : "toplive_nearby_banner", "banner_page");
        c474500IjALIZ.LIZ();
    }

    public AbstractC477260Inc(Context context, EnumC471790Ien enumC471790Ien) {
        this.LIZ = context;
        this.LIZIZ = enumC471790Ien;
    }
}
