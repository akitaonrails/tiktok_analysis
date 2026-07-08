package X;

import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.MediaInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AIPortraitInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MOC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOC implements InterfaceC535110Kyj {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(486));

    public static long LIZLLL(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j < 1000000000000L ? j * 1000 : j;
    }

    @Override // X.InterfaceC535110Kyj
    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_portrait_album_ai_content_enable", true, true);
    }

    public static C535190Kyr LJ(CameoDraft cameoDraft) {
        MediaInfo mediaInfo;
        List<String> list;
        String str;
        int iLongValue;
        long jLongValue;
        String str2 = cameoDraft.id;
        if (str2 != null) {
            int iLongValue2 = 0;
            if (str2.length() > 0 && (mediaInfo = cameoDraft.cover) != null && (list = mediaInfo.urlList) != null && (str = (String) C13LP.LJJJLL(list)) != null && str.length() > 0) {
                String str3 = cameoDraft.taskId;
                if (str3 == null || str3.length() <= 0) {
                    str3 = str2;
                }
                Long l = mediaInfo.width;
                if (l != null) {
                    iLongValue = (int) l.longValue();
                } else {
                    iLongValue = 0;
                }
                Long l2 = mediaInfo.height;
                if (l2 != null) {
                    iLongValue2 = (int) l2.longValue();
                }
                Long l3 = cameoDraft.createTime;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = 0;
                }
                return new C535190Kyr(iLongValue, iLongValue2, str2, str3, str, false, LIZLLL(jLongValue));
            }
        }
        return null;
    }

    public static C535190Kyr LJFF(Aweme aweme) {
        String taskId;
        UrlModel downloadNoWatermarkAddr;
        List<String> urlList;
        String str;
        int width;
        String taskId2;
        List<Long> imageAIIndexList;
        Long l;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList2;
        String str2;
        String aid = aweme.getAid();
        int height = 0;
        if (aid != null && aid.length() > 0) {
            AIPortraitInfo aIPortraitInfo = aweme.aiPortraitInfo;
            if (aIPortraitInfo == null || (taskId2 = aIPortraitInfo.getTaskId()) == null || taskId2.length() <= 0) {
                taskId2 = aid;
            }
            AIPortraitInfo aIPortraitInfo2 = aweme.aiPortraitInfo;
            if (aIPortraitInfo2 != null && (imageAIIndexList = aIPortraitInfo2.getImageAIIndexList()) != null && (l = (Long) C13LP.LJJJLL(imageAIIndexList)) != null) {
                int iLongValue = (int) l.longValue();
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(iLongValue, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (urlList2 = urlModel.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList2)) != null && str2.length() > 0) {
                    return new C535190Kyr(urlModel.getWidth(), urlModel.getHeight(), aid, taskId2, str2, false, LIZLLL(aweme.getCreateTime()));
                }
            }
        }
        String aid2 = aweme.getAid();
        if (aid2 == null || aid2.length() <= 0) {
            return null;
        }
        AIPortraitInfo aIPortraitInfo3 = aweme.aiPortraitInfo;
        if (aIPortraitInfo3 == null || (taskId = aIPortraitInfo3.getTaskId()) == null || taskId.length() <= 0) {
            taskId = aid2;
        }
        Video video = aweme.getVideo();
        if (video == null || (downloadNoWatermarkAddr = video.getDownloadNoWatermarkAddr()) == null || (urlList = downloadNoWatermarkAddr.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            return null;
        }
        Video video2 = aweme.getVideo();
        if (video2 != null) {
            width = video2.getWidth();
        } else {
            width = 0;
        }
        Video video3 = aweme.getVideo();
        if (video3 != null) {
            height = video3.getHeight();
        }
        return new C535190Kyr(width, height, aid2, taskId, str, true, LIZLLL(aweme.getCreateTime()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    @Override // X.InterfaceC535110Kyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r19, long r20, X.InterfaceC1364105Vn r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MOC.LIZIZ(int, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:26:0x007a, B:28:0x0082, B:30:0x00bb, B:32:0x00c1, B:33:0x00c3, B:34:0x00cc, B:36:0x00d2, B:38:0x00de, B:39:0x00e2, B:42:0x00ff, B:16:0x003f, B:18:0x0057, B:20:0x005d, B:21:0x0061), top: B:54:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[Catch: Exception -> 0x010a, TryCatch #1 {Exception -> 0x010a, blocks: (B:26:0x007a, B:28:0x0082, B:30:0x00bb, B:32:0x00c1, B:33:0x00c3, B:34:0x00cc, B:36:0x00d2, B:38:0x00de, B:39:0x00e2, B:42:0x00ff, B:16:0x003f, B:18:0x0057, B:20:0x005d, B:21:0x0061), top: B:54:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    @Override // X.InterfaceC535110Kyj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r18, long r19, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MOC.LIZJ(int, long, X.05Vn):java.lang.Object");
    }

    public static void LJI(C0MOC c0moc, long j, boolean z, Integer num, Integer num2, String str, int i) {
        InterfaceC528960Koo interfaceC528960KooJ9;
        Integer num3 = num2;
        Integer num4 = num;
        String str2 = null;
        if ((i & 4) != 0) {
            num4 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        if ((i & 16) == 0) {
            str2 = str;
        }
        c0moc.getClass();
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        if (aITheaterProfileService != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
            interfaceC528960KooJ9.LIZIZ(j, z, Boolean.TRUE, num4, num3, str2, C563340M7o.LIZ());
        }
    }

    public static void LJII(C0MOC c0moc, long j, boolean z, String str, Integer num, Integer num2, String str2, int i) {
        InterfaceC528960Koo interfaceC528960KooJ9;
        String str3 = str2;
        Integer num3 = num2;
        Integer num4 = num;
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        c0moc.getClass();
        AITheaterProfileService aITheaterProfileService = (AITheaterProfileService) PluggableExtentionKt.pluggableSpi$default(AITheaterProfileService.class, false, false, false, 14, null);
        if (aITheaterProfileService != null && (interfaceC528960KooJ9 = aITheaterProfileService.j9()) != null) {
            interfaceC528960KooJ9.LIZ(j, num4, num3, str3, str, z);
        }
    }
}
