package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import webcast.api.sub.DMInfo;
import webcast.api.sub.FormInfo;
import webcast.api.sub.PreviewDisplay;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0xWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822290xWN {
    public static final /* synthetic */ int LIZ = 0;

    public static C1822300xWO LIZLLL(SMBPreviewResponse.ResponseData responseData) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        C1822300xWO c1822300xWO = new C1822300xWO(null);
        C490590JLt c490590JLt = C490590JLt.LIZ;
        DMInfo dMInfo = responseData.dmInfo;
        if (dMInfo == null || (str = dMInfo.capsuleSchema) == null) {
            str = "";
        }
        c490590JLt.getClass();
        String strLJIIIIZZ = C490590JLt.LJIIIIZZ(str, "ServicePlusCommentIdentifyEntrance", true);
        PreviewDisplay previewDisplay = responseData.displaySwitch;
        boolean z5 = false;
        if (previewDisplay != null) {
            z = previewDisplay.hasSuggestedQuestion;
        } else {
            z = false;
        }
        c1822300xWO.LIZ = z;
        if (previewDisplay != null) {
            z2 = previewDisplay.hasForm;
        } else {
            z2 = false;
        }
        c1822300xWO.LIZIZ = z2;
        if (previewDisplay != null) {
            z3 = previewDisplay.hasSub;
        } else {
            z3 = false;
        }
        c1822300xWO.LIZJ = z3;
        if (responseData.subscriptionType == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        c1822300xWO.LIZLLL = z4;
        c1822300xWO.LJ = !responseData.courseList.isEmpty();
        c1822300xWO.LJFF = !responseData.bookingInfoList.isEmpty();
        PreviewDisplay previewDisplay2 = responseData.displaySwitch;
        if (previewDisplay2 != null) {
            z5 = previewDisplay2.hasThirdPartyLink;
        }
        c1822300xWO.LJI = z5;
        if (previewDisplay2 != null) {
            j = previewDisplay2.activeSkuCount;
        } else {
            j = 0;
        }
        c1822300xWO.LJII = j;
        c1822300xWO.LJIIIZ = responseData.verificationInfo;
        c1822300xWO.LJIIJ = responseData.formInfoList;
        c1822300xWO.LJIIIIZZ = strLJIIIIZZ;
        return c1822300xWO;
    }

    public static String LIZJ(FormInfo formInfo, String str) {
        String strRj;
        Uri uri = UriProtector.parse(formInfo.schema);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title_key");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (iHostSubscription != null) {
            strRj = iHostSubscription.Rj(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        } else {
            strRj = null;
        }
        return builderBuildUpon.appendQueryParameter("title", strRj).appendQueryParameter("avatar", str).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0163 A[PHI: r4
      0x0163: PHI (r4v20 java.lang.String) = (r4v17 java.lang.String), (r4v21 java.lang.String) binds: [B:101:0x0161, B:99:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167 A[PHI: r4
      0x0167: PHI (r4v19 java.lang.String) = (r4v17 java.lang.String), (r4v20 java.lang.String) binds: [B:101:0x0161, B:103:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0319 A[PHI: r14
      0x0319: PHI (r14v5 java.lang.String) = (r14v2 java.lang.String), (r14v6 java.lang.String) binds: [B:176:0x0317, B:174:0x0313] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031d A[PHI: r14
      0x031d: PHI (r14v4 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String) binds: [B:176:0x0317, B:178:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[PHI: r5
      0x0024: PHI (r5v17 java.lang.String) = (r5v0 java.lang.String), (r5v18 java.lang.String) binds: [B:16:0x0022, B:14:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0378 A[PHI: r4
      0x0378: PHI (r4v7 java.lang.String) = (r4v4 java.lang.String), (r4v8 java.lang.String) binds: [B:189:0x0376, B:187:0x0372] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037c A[PHI: r4
      0x037c: PHI (r4v6 java.lang.String) = (r4v4 java.lang.String), (r4v7 java.lang.String) binds: [B:189:0x0376, B:191:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b8 A[PHI: r2
      0x03b8: PHI (r2v8 java.lang.String) = (r2v5 java.lang.String), (r2v9 java.lang.String) binds: [B:208:0x03b6, B:206:0x03b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03bc A[PHI: r2
      0x03bc: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:208:0x03b6, B:210:0x03ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[PHI: r5
      0x002c: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v17 java.lang.String), (r5v17 java.lang.String) binds: [B:16:0x0022, B:18:0x0026, B:20:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030 A[PHI: r5 r6
      0x0030: PHI (r5v16 java.lang.String) = (r5v1 java.lang.String), (r5v17 java.lang.String) binds: [B:22:0x002e, B:20:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:22:0x002e, B:20:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038 A[PHI: r5 r6
      0x0038: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v16 java.lang.String), (r5v16 java.lang.String) binds: [B:22:0x002e, B:24:0x0032, B:26:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0038: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String), (r6v4 java.lang.String) binds: [B:22:0x002e, B:24:0x0032, B:26:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063 A[PHI: r14
      0x0063: PHI (r14v11 java.lang.String) = (r14v8 java.lang.String), (r14v12 java.lang.String) binds: [B:39:0x0061, B:37:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b A[PHI: r14
      0x006b: PHI (r14v9 java.lang.String) = (r14v8 java.lang.String), (r14v11 java.lang.String), (r14v11 java.lang.String) binds: [B:39:0x0061, B:41:0x0065, B:43:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116 A[PHI: r17
      0x0116: PHI (r17v10 java.lang.String) = (r17v5 java.lang.String), (r17v11 java.lang.String) binds: [B:83:0x0114, B:81:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122 A[PHI: r17
      0x0122: PHI (r17v6 java.lang.String) = (r17v5 java.lang.String), (r17v10 java.lang.String), (r17v10 java.lang.String) binds: [B:83:0x0114, B:85:0x011a, B:87:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126 A[PHI: r17 r19
      0x0126: PHI (r17v9 java.lang.String) = (r17v6 java.lang.String), (r17v10 java.lang.String) binds: [B:89:0x0124, B:87:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r19v8 java.lang.String) = (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:89:0x0124, B:87:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a A[PHI: r17 r19
      0x013a: PHI (r17v7 java.lang.String) = (r17v6 java.lang.String), (r17v9 java.lang.String), (r17v9 java.lang.String) binds: [B:89:0x0124, B:91:0x012a, B:93:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r19v6 java.lang.String) = (r19v5 java.lang.String), (r19v8 java.lang.String), (r19v8 java.lang.String) binds: [B:89:0x0124, B:91:0x012a, B:93:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r20v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v26, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(webcast.api.sub.SMBPreviewResponse.ResponseData r30, java.lang.String r31, X.C1822330xWR r32) {
        /*
            Method dump skipped, instruction units count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1822290xWN.LIZ(webcast.api.sub.SMBPreviewResponse$ResponseData, java.lang.String, X.0xWR):java.util.List");
    }

    public static String LIZIZ(SMBPreviewResponse.ResponseData responseData, SMBCourse sMBCourse, String str) {
        String secUid;
        long id;
        String str2;
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Long lValueOf = null;
        if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        User user = responseData.anchorData;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        if (room != null) {
            id = room.getId();
        } else {
            id = -1;
        }
        Uri.Builder builderPath = new Uri.Builder().scheme("sslocal").authority("webcast_pcs").path("course/detail");
        if (str == null) {
            str = "live_detail_service_plus";
        }
        Uri.Builder builderAppendQueryParameter = builderPath.appendQueryParameter("show_entrance", str).appendQueryParameter("course_id", String.valueOf(sMBCourse.courseId)).appendQueryParameter("anchor_id", String.valueOf(lValueOf));
        if (sMBCourse.isPurchased) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        return builderAppendQueryParameter.appendQueryParameter("has_purchased", str2).appendQueryParameter("sec_anchor_id", secUid).appendQueryParameter("is_full_page", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("room_id", String.valueOf(id)).build().toString();
    }
}
