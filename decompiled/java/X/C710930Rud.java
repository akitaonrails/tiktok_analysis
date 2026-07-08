package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Rud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710930Rud {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.base.model.UrlModel LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            if (r2 == 0) goto L21
            boolean r1 = X.C729510SjV.LJIJI(r2)
            r0 = 1
            if (r1 != r0) goto Le
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = LJ(r2)
            return r0
        Le:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r2.getPhotoModeImageInfo()
            if (r0 == 0) goto L21
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L21
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel) r0
            goto L22
        L21:
            r0 = 0
        L22:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = LIZJ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C710930Rud.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.base.model.UrlModel LIZJ(com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L2e
            java.util.List<com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo> r1 = r5.bitrateImages
            if (r1 == 0) goto L31
            java.util.Iterator r4 = r1.iterator()
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo r1 = (com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo) r1
            java.lang.String r2 = r1.name
            X.01GW r1 = X.C2249961D4o.LIZJ
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 == 0) goto Lb
        L26:
            com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo r3 = (com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo) r3
            if (r3 == 0) goto L31
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.image
            if (r0 == 0) goto L31
        L2e:
            return r0
        L2f:
            r3 = r0
            goto L26
        L31:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.displayImageNoWatermark
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C710930Rud.LIZJ(com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel):com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    public static final UrlModel LIZLLL(Aweme aweme) {
        int iIntValue;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        C1517550par c1517550par;
        C1517520pao c1517520pao;
        Integer num;
        C1C1T c1c1t = C2203191BKr.LIZ(aweme).socialBlob;
        if (c1c1t != null && (c1517550par = c1c1t.reveal_story_blob) != null && (c1517520pao = c1517550par.blurred_image_info) != null && (num = c1517520pao.index) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(iIntValue, imageList)) != null) {
            return LIZJ(photoModeImageUrlModel);
        }
        return null;
    }

    public static final UrlModel LJ(Aweme aweme) {
        int iIntValue;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        C1517550par c1517550par;
        C1517520pao c1517520pao;
        Integer num;
        C1C1T c1c1t = C2203191BKr.LIZ(aweme).socialBlob;
        if (c1c1t != null && (c1517550par = c1c1t.reveal_story_blob) != null && (c1517520pao = c1517550par.clear_image_info) != null && (num = c1517520pao.index) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(iIntValue, imageList)) != null) {
            return LIZJ(photoModeImageUrlModel);
        }
        return null;
    }

    public static final boolean LJII(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory() || aweme.getAwemeType() != 152) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        if (aweme == null || !aweme.getIsTikTokStory()) {
            return false;
        }
        if (aweme.getAwemeType() != 152 && aweme.getAwemeType() != 180 && aweme.getAwemeType() != 46) {
            return false;
        }
        return true;
    }

    public static final String LJIIIZ(String str) {
        if (str == null) {
            return "";
        }
        if (!u.LJJIIJZLJL(str, "file://", false) && !u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static final boolean LJFF(Aweme aweme, Aweme aweme2) {
        String batchId;
        if (aweme == null || !LJII(aweme) || !LJII(aweme2)) {
            return false;
        }
        String batchId2 = null;
        if (aweme2 == null || (batchId = aweme2.getBatchId()) == null || batchId.length() == 0) {
            return false;
        }
        String batchId3 = aweme.getBatchId();
        if (aweme2 != null) {
            batchId2 = aweme2.getBatchId();
        }
        if (!Intrinsics.LJFF(batchId3, batchId2)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(String str, String str2) {
        Aweme awemeLLILZ = null;
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        Aweme awemeLLILZ2 = null;
        if (iAwemeService != null) {
            awemeLLILZ = iAwemeService.LLILZ(str);
        }
        IAwemeService iAwemeService2 = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService2 != null) {
            awemeLLILZ2 = iAwemeService2.LLILZ(str2);
        }
        return LJFF(awemeLLILZ, awemeLLILZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C437040HBu LIZ(android.content.Context r13, X.C428600GrK r14, int r15, android.view.View r16, androidx.fragment.app.Fragment r17) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C710930Rud.LIZ(android.content.Context, X.0GrK, int, android.view.View, androidx.fragment.app.Fragment):X.0HBu");
    }
}
