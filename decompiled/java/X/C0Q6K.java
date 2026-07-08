package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;

/* JADX INFO: renamed from: X.0Q6K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6K {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        if (aweme == null || !C07H8.LIZIZ() || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null || list.isEmpty() || aweme.isAd()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[PHI: r8
      0x004c: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:18:0x004a, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[PHI: r8
      0x0050: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:18:0x004a, B:20:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r15, com.ss.android.ugc.aweme.feed.model.CaptionItemModel r16, boolean r17, boolean r18, int r19) {
        /*
            r14 = r18
            r0 = r19 & 4
            if (r0 == 0) goto L8
            r17 = 0
        L8:
            r0 = r19 & 8
            if (r0 == 0) goto Ld
            r14 = 1
        Ld:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "sendCaptionLoadStartEvent "
            r1.append(r0)
            r6 = r15
            java.lang.String r0 = r6.getAid()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r4 = X.C20703515zt.LJIIIIZZ(r6)
            if (r4 == 0) goto L65
            com.ss.android.ugc.aweme.service.ICLAPerfETService r5 = X.C1485670olR.LIZ()
            r3 = r16
            if (r3 == 0) goto L69
            int r0 = r3.subId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L35:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r2 = ""
            if (r3 == 0) goto L49
            long r0 = r3.claSubtitleId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r8 = r0.toString()
            if (r8 != 0) goto L4c
        L49:
            r8 = r2
            if (r3 == 0) goto L50
        L4c:
            java.lang.String r9 = r3.languageCode
            if (r9 != 0) goto L51
        L50:
            r9 = r2
        L51:
            java.lang.String r10 = r4.languageCode
            if (r17 == 0) goto L66
            X.13at r11 = X.EnumC20038913at.REALTIME
        L57:
            X.1629 r12 = X.AnonymousClass1629.LAND_ON_ITEM
            boolean r13 = X.C1485670olR.LIZIZ(r3)
            r15 = 0
            r16 = r15
            r17 = r15
            r5.LJIILL(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L65:
            return
        L66:
            X.13at r11 = X.EnumC20038913at.OFFLINE
            goto L57
        L69:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Q6K.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.CaptionItemModel, boolean, boolean, int):void");
    }
}
