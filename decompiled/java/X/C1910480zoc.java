package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0zoc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910480zoc {
    public static final C1910480zoc LIZ = new C1910480zoc();

    public static void LIZIZ(C1331670kl3 c1331670kl3) {
        if (((Boolean) C286650BLj.LIZ.getValue()).booleanValue()) {
            if (C1328130kfL.LJIILIIL().LJIIIIZZ().get("inbox_img_cache") == null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZ("InboxImgOptHelper", "cannot find the cache");
                C20684815ws.onEventV3("inbox_independent_cache_error");
            } else {
                c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3.LJJJJJ = "inbox_img_cache";
            }
        }
    }

    public static UrlModel LIZ(Context context, View view, User user) {
        if (!((Boolean) C279140Awq.LIZIZ.getValue()).booleanValue()) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null) {
                UrlModel avatar168 = user.getAvatar168();
                if (avatar168 == null) {
                    UrlModel avatar300 = user.getAvatar300();
                    if (avatar300 == null) {
                        return user.getAvatarLarger();
                    }
                    return avatar300;
                }
                return avatar168;
            }
            return avatarThumb;
        }
        double d = ((double) context.getResources().getDisplayMetrics().densityDpi) / 160.0d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iMax = (int) (((double) Math.max(C418440Gaw.LJFF(layoutParams.width, context), C418440Gaw.LJFF(layoutParams.height, context))) * d);
        if (120 <= iMax) {
            if (iMax < 235) {
                UrlModel avatar1682 = user.getAvatar168();
                if (avatar1682 == null) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    if (avatarThumb2 == null) {
                        UrlModel avatar3002 = user.getAvatar300();
                        if (avatar3002 == null) {
                            UrlModel avatarMedium = user.getAvatarMedium();
                            if (avatarMedium == null) {
                                return user.getAvatarLarger();
                            }
                            return avatarMedium;
                        }
                        return avatar3002;
                    }
                    return avatarThumb2;
                }
                return avatar1682;
            }
            if (235 <= iMax) {
                if (iMax < 511) {
                    UrlModel avatar3003 = user.getAvatar300();
                    if (avatar3003 != null) {
                        return avatar3003;
                    }
                    UrlModel avatar1683 = user.getAvatar168();
                    if (avatar1683 != null) {
                        return avatar1683;
                    }
                    UrlModel avatarThumb3 = user.getAvatarThumb();
                    if (avatarThumb3 != null) {
                        return avatarThumb3;
                    }
                    UrlModel avatarMedium2 = user.getAvatarMedium();
                    if (avatarMedium2 != null) {
                        return avatarMedium2;
                    }
                    return user.getAvatarLarger();
                }
                if (iMax < 901) {
                    UrlModel avatarMedium3 = user.getAvatarMedium();
                    if (avatarMedium3 != null) {
                        return avatarMedium3;
                    }
                    UrlModel avatar3004 = user.getAvatar300();
                    if (avatar3004 != null) {
                        return avatar3004;
                    }
                    UrlModel avatar1684 = user.getAvatar168();
                    if (avatar1684 != null) {
                        return avatar1684;
                    }
                    UrlModel avatarThumb4 = user.getAvatarThumb();
                    if (avatarThumb4 != null) {
                        return avatarThumb4;
                    }
                    return user.getAvatarLarger();
                }
                UrlModel avatarLarger = user.getAvatarLarger();
                if (avatarLarger != null) {
                    return avatarLarger;
                }
                UrlModel avatarMedium4 = user.getAvatarMedium();
                if (avatarMedium4 != null) {
                    return avatarMedium4;
                }
                UrlModel avatar3005 = user.getAvatar300();
                if (avatar3005 != null) {
                    return avatar3005;
                }
                UrlModel avatar1685 = user.getAvatar168();
                if (avatar1685 != null) {
                    return avatar1685;
                }
                return user.getAvatarThumb();
            }
        }
        UrlModel avatarThumb5 = user.getAvatarThumb();
        if (avatarThumb5 != null) {
            return avatarThumb5;
        }
        UrlModel avatar1686 = user.getAvatar168();
        if (avatar1686 != null) {
            return avatar1686;
        }
        UrlModel avatar3006 = user.getAvatar300();
        if (avatar3006 != null) {
            return avatar3006;
        }
        UrlModel avatarMedium5 = user.getAvatarMedium();
        if (avatarMedium5 != null) {
            return avatarMedium5;
        }
        return user.getAvatarLarger();
    }
}
