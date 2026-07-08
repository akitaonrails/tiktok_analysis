package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.AwemeACLStruct;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0m0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379790m0f {
    public static final C1379790m0f LIZ = new C1379790m0f();

    public static boolean LIZ(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && aweme.getAuthor().getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(final int i, final Aweme aweme, final String str, final String str2) {
        if (aweme != null) {
            C15O7.LIZJ(new Callable() { // from class: X.0m0g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    User author;
                    List<PhotoModeImageUrlModel> imageList;
                    C1C7U.LIZ("DownloadVideoSafeMonitor@c4bf.monitorSafeDownloadVideo$1$1");
                    if (!((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme))) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C1379790m0f.LIZ.getClass();
                        c2344009Gk.LJ(Boolean.FALSE, "is_author");
                        c2344009Gk.LJ(Boolean.valueOf(C1379790m0f.LIZ(aweme)), "is_friend");
                        c2344009Gk.LJFF("click_btn", str);
                        c2344009Gk.LJFF("gid", aweme.getAid());
                        c2344009Gk.LJFF("download_addr", str2);
                        Aweme aweme2 = aweme;
                        StringBuilder sb = new StringBuilder();
                        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme2);
                        if (statusSafety != null && statusSafety.getReviewStatus() == 1) {
                            sb.append("1,");
                        }
                        AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme2);
                        if (statusSafety2 != null && statusSafety2.isDelete()) {
                            sb.append("2,");
                        }
                        if (C10EU.LJIILL(aweme2.getAuthor(), ((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme2)))) {
                            sb.append("3,");
                        }
                        AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme2);
                        if (statusSafety3 != null && statusSafety3.getReviewStatus() == 2) {
                            sb.append("4,");
                        }
                        if (AwemeExtKt.isPrivate(aweme2)) {
                            sb.append("5,");
                        }
                        AwemeStatus statusSafety4 = AwemeExtKt.getStatusSafety(aweme2);
                        if (statusSafety4 != null && statusSafety4.getPrivateStatus() == 2 && !C1379790m0f.LIZ(aweme2)) {
                            sb.append("6,");
                        }
                        VideoControl videoControl = aweme2.getVideoControl();
                        if ((videoControl != null && videoControl.preventDownloadType == 3) || ((author = aweme2.getAuthor()) != null && author.getDownloadSetting() == 3)) {
                            sb.append("7,");
                        }
                        String string = sb.toString();
                        if (sb.length() > 0) {
                            string = sb.substring(0, sb.length() - 1);
                        }
                        c2344009Gk.LJFF("monitor_type", string);
                        c2344009Gk.LJFF("server_ctx", C08JS.LIZLLL(new AwemeACLStruct.ServerExtra().buildServerExtraJson(aweme)));
                        if (C621180OYa.LIZIZ.LJIILJJIL(aweme)) {
                            c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
                            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                            c2344009Gk.LJ((photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) ? null : Integer.valueOf(imageList.size()), "pic_cnt");
                            c2344009Gk.LIZJ(i, "download_pic_cnt");
                        }
                        C20684815ws.LJIILLIIL("download_tns", c2344009Gk.LIZ);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DownloadVideoSafeMonitor@c4bf.monitorSafeDownloadVideo$1$1");
                    return unit;
                }
            });
        }
    }
}
