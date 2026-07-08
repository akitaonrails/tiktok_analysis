package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0SKO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKO {
    public static final C720110SMn LIZ(Aweme aweme, String str, boolean z) {
        String title;
        String[] strArr;
        boolean z2;
        boolean z3;
        PoiAnchorInfo poiAnchorInfo;
        List<PoiSubTag> list;
        JSONArray jSONArray;
        int length;
        Float fValueOf = null;
        if (aweme == null) {
            return null;
        }
        String aid = aweme.getAid();
        boolean zIsAdTraffic = AwemeExtKt.isAdTraffic(aweme);
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null) {
            title = photoModeImageInfo.getTitle();
        } else {
            title = null;
        }
        String desc = aweme.getDesc();
        try {
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (aweme.getContentDesc() != null && (length = (jSONArray = new JSONArray(aweme.getContentDesc())).length()) > 0) {
            strArr = new String[length];
            int i = 0;
            do {
                Object obj = jSONArray.get(i);
                if (obj != null) {
                    strArr[i] = obj.toString();
                } else {
                    strArr[i] = "";
                }
                i++;
            } while (i < length);
        } else {
            strArr = null;
        }
        String descWithHashTagTruncation = AwemeBizExtKt.getDescWithHashTagTruncation(aweme);
        boolean zLIZ = C582980Mtk.LIZ(aweme);
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 != null) {
            C720360SNm.LIZLLL(photoModeImageInfo2);
            fValueOf = Float.valueOf(photoModeImageInfo2.getMinAspectRatio());
        }
        if (!C866950Xzh.LIZIZ(aweme.getAnchors()) && !Intrinsics.LJFF(C613020O2q.LIZ(aweme), Boolean.TRUE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null && (list = poiAnchorInfo.subTags) != null && !list.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zLIZ2 = C0SKN.LIZ(aweme, str, z);
        C0SKN.LJ(aweme, str, z);
        return new C720110SMn(aid, zIsAdTraffic, title, desc, strArr, descWithHashTagTruncation, zLIZ, fValueOf, z2, z3, zLIZ2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0SN0 LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19, java.lang.String r20, boolean r21, com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo r22) {
        /*
            r10 = 0
            r1 = r18
            if (r1 != 0) goto L6
            return r10
        L6:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r1.getPhotoModeImageInfo()
            if (r0 == 0) goto Lad
            java.util.List r8 = X.C720360SNm.LIZLLL(r0)
            if (r8 == 0) goto Lae
            int r2 = r8.size()
        L16:
            X.0SN0 r3 = new X.0SN0
            java.lang.String r4 = r1.getAid()
            boolean r5 = X.C582980Mtk.LIZ(r1)
            r0 = 1
            r6 = r19
            if (r6 < 0) goto Lab
            int r2 = r2 - r0
            if (r6 > r2) goto Lab
            if (r8 == 0) goto Lab
            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r6)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r7 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImage) r7
        L30:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r1.getPhotoModeImageInfo()
            if (r0 == 0) goto La9
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r9 = r0.getMinImage()
        L3a:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r1.getPhotoModeImageInfo()
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r10 = r0.getMaxImage()
        L44:
            r0 = r21
            r13 = r20
            boolean r11 = X.C0SKN.LIZ(r1, r13, r0)
            r2 = r22
            if (r2 == 0) goto La6
            int r14 = r2.titleLines
            int r15 = r2.descriptionLines
        L54:
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getReviewDetailUrl(r1)
            if (r2 == 0) goto L97
            int r2 = r2.length()
            if (r2 <= 0) goto L97
        L60:
            r2 = 1
        L61:
            boolean r18 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r1)
            boolean r19 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r1)
            boolean r20 = X.C582980Mtk.LIZ(r1)
            boolean r21 = X.C720360SNm.LJIIJJI(r1)
            if (r0 == 0) goto L94
            if (r2 != 0) goto L94
            r22 = 1
        L77:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r1.getPhotoModeImageInfo()
            if (r0 == 0) goto L92
            X.C720360SNm.LIZLLL(r0)
            float r0 = r0.getMaxAspectRatio()
        L84:
            java.lang.Float r16 = java.lang.Float.valueOf(r0)
            r17 = r13
            boolean r12 = X.C0SKN.LIZLLL(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L92:
            r0 = 0
            goto L84
        L94:
            r22 = 0
            goto L77
        L97:
            java.lang.String r2 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getVideoDetailNotice(r1)
            if (r2 == 0) goto La4
            int r2 = r2.length()
            if (r2 <= 0) goto La4
            goto L60
        La4:
            r2 = 0
            goto L61
        La6:
            r14 = 0
            r15 = 0
            goto L54
        La9:
            r9 = r10
            goto L3a
        Lab:
            r7 = r10
            goto L30
        Lad:
            r8 = r10
        Lae:
            r2 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SKO.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, int, java.lang.String, boolean, com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo):X.0SN0");
    }
}
