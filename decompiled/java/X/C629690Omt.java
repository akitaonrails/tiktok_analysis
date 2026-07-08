package X;

import android.view.View;
import com.bytedance.forest.Forest;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0Omt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC20647615qs("music_detail_revisit_guide")
public final class C629690Omt extends AbstractC20659715sp<TuxPanel> {
    public final C19EG LL;
    public final Map<String, Object> LLILLJJLI;

    @Override // X.AbstractC20656215sG
    public final String getPopupEnterFrom() {
        return "single_song";
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        User currentUser;
        UrlModel avatarLarger;
        C1529660puO c1529660puO;
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LIZ = true;
        c1391960mKI.LJI = 2;
        c1391960mKI.LJII = this.LL.getString(2131835437);
        c1391960mKI.LJIIIIZZ = this.LL.getString(2131835436);
        C19EG c19eg = this.LL;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.dpx, null, false);
        C1295960jpS c1295960jpS = (C1295960jpS) viewTd.findViewById(R.id.yag);
        if (C295070BhR.LIZ()) {
            if (C960203pA.LIZIZ(c19eg)) {
                c1529660puO = C629640Omo.LIZLLL;
            } else {
                c1529660puO = C629640Omo.LIZJ;
            }
            C0TCH.LIZ.getClass();
            Forest forestLIZ = C0TCH.LIZIZ;
            if (forestLIZ == null) {
                forestLIZ = C0T1N.LIZ();
                C0TCH.LIZIZ = forestLIZ;
            }
            C740100T1k c740100T1k = new C740100T1k(c1529660puO, forestLIZ);
            c740100T1k.LJ = new WeakReference<>(c1295960jpS);
            c740100T1k.LIZLLL = new WeakReference<>(this.LL);
            c740100T1k.LJFF = true;
            c740100T1k.LIZ(null, null);
        } else if (C960203pA.LIZIZ(c19eg)) {
            c1295960jpS.setAnimation(R.raw.tux_lottie_common_infrastructure_profile_save_dark);
        } else {
            c1295960jpS.setAnimation(R.raw.tux_lottie_common_infrastructure_profile_save_light);
        }
        RemoteImageView remoteImageView = (RemoteImageView) viewTd.findViewById(R.id.user_avatar);
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            if (currentUser.getAvatarThumb() != null) {
                avatarLarger = currentUser.getAvatarThumb();
            } else if (currentUser.getAvatarMedium() != null) {
                avatarLarger = currentUser.getAvatarMedium();
            } else if (currentUser.getAvatarLarger() != null) {
                C2344809Gs.LIZ(new IllegalStateException("Your avatar image is too large !"));
                avatarLarger = currentUser.getAvatarLarger();
            }
            if (avatarLarger != null) {
                C1324840ka2.LJFF(remoteImageView, avatarLarger);
            }
        }
        c1391960mKI.LJFF = viewTd;
        c1391960mKI.LIZIZ(this.LL.getString(2131835435), new AwS623S0100000_9(this, 187));
        return c1391960mKI.LIZ().LIZ;
    }

    public C629690Omt(C634040Otu c634040Otu, C19EG c19eg, Map map) {
        super(c634040Otu);
        this.LL = c19eg;
        this.LLILLJJLI = map;
    }
}
