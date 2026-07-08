package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0pUc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513680pUc implements InterfaceC2179601ARy {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ C0N0Y LIZJ;

    @Override // X.InterfaceC2179601ARy
    public final void LIZ() {
    }

    @Override // X.InterfaceC2179601ARy
    public final void LIZJ() {
    }

    @Override // X.InterfaceC2179601ARy
    public final Bitmap LIZLLL() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_tiktok_dark_square;
        return C376710Epp.LIZ(c419910GdJ.LIZ(this.LIZ), (int) (((double) C497820Jfg.LIZIZ(this.LIZ)) * 0.7d), (int) (((double) C497820Jfg.LIZIZ(this.LIZ)) * 0.7d), Bitmap.Config.RGB_565);
    }

    public final String LJ() {
        return this.LIZ.getString(R.string.drg);
    }

    public final String LJFF() {
        UrlModel cover;
        List<String> urlList;
        Video video = this.LIZIZ.getVideo();
        if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || !(!urlList.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(urlList, 0);
    }

    public final InterfaceC1483670oiD LJI() {
        return this.LIZJ.LJIILL();
    }

    public final String LJII() {
        UrlModel avatarMedium;
        List<String> urlList;
        User author = this.LIZIZ.getAuthor();
        if (author == null || (avatarMedium = author.getAvatarMedium()) == null || (urlList = avatarMedium.getUrlList()) == null || !(!urlList.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(urlList, 0);
    }

    public final String LJIIIIZZ() {
        User author = this.LIZIZ.getAuthor();
        if (author != null) {
            return author.getNickname();
        }
        return null;
    }

    public final String LJIIIZ() {
        return this.LIZIZ.getDesc();
    }

    public final Long LJIIJ() {
        if (this.LIZIZ.getVideo() != null) {
            return Long.valueOf(r0.getDuration());
        }
        return null;
    }

    @Override // X.InterfaceC2179601ARy
    public final Activity LIZIZ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            return null;
        }
        return C1388190mED.LIZ(activityLIZIZ);
    }

    public C1513680pUc(Context context, Aweme aweme, C0N0Y c0n0y) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = c0n0y;
    }
}
