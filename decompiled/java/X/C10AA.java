package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: X.10AA, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10AA {
    public static final Type LIZ = new TypeToken<List<? extends AwemeHybridLabelModel>>() { // from class: X.10AL
    }.getType();
    public static final Type LIZIZ = new TypeToken<List<? extends AwemeTextLabelModel>>() { // from class: X.10AM
    }.getType();

    public static final boolean LIZ(Aweme aweme) {
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(video.getVideoLength());
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            return commerceVideoAuthInfo.isAdvPromotable();
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        boolean z;
        List<String> geofencingRegions;
        if (aweme != null && (geofencingRegions = aweme.getGeofencingRegions()) != null && !geofencingRegions.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r7, com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings r8) {
        /*
            r4 = 0
            r5 = 1
            if (r8 == 0) goto L9a
            java.lang.Integer r0 = r8.duet
            if (r0 == 0) goto L9a
            int r0 = r0.intValue()
            if (r0 != r5) goto L9a
            r0 = 1
        Lf:
            r0 = r0 ^ 1
            r7.setDuetSetting(r0)
            if (r8 == 0) goto L98
            java.lang.Integer r0 = r8.duet
            if (r0 == 0) goto L98
            int r0 = r0.intValue()
            if (r0 != r5) goto L98
            r0 = 1
        L21:
            r0 = r0 ^ 1
            r7.setReactSetting(r0)
            if (r8 == 0) goto L96
            java.lang.Integer r0 = r8.stitch
            if (r0 == 0) goto L96
            int r0 = r0.intValue()
            if (r0 != r5) goto L96
            r0 = 1
        L33:
            r0 = r0 ^ 1
            r7.setStitchSetting(r0)
            if (r8 == 0) goto L94
            java.lang.Integer r0 = r8.comment
            if (r0 == 0) goto L94
            int r0 = r0.intValue()
            if (r0 != r5) goto L94
            r0 = 1
        L45:
            r6 = 3
            if (r0 == 0) goto L92
            r0 = 0
        L49:
            r7.setCommentSetting(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r7)
            if (r3 == 0) goto L69
            if (r8 == 0) goto L66
            java.lang.Integer r2 = r8.visibility
            if (r2 == 0) goto L66
            int r0 = r2.intValue()
            if (r0 == 0) goto L66
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L79
            r4 = 2
        L66:
            r3.setPrivateStatus(r4)
        L69:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            r0.LLILLL(r7)
            return
        L79:
            int r0 = r2.intValue()
            if (r0 == r5) goto L90
            int r0 = r2.intValue()
            if (r0 != r6) goto L89
            r7.setSubOnlyVideo(r5)
            goto L66
        L89:
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L66
        L90:
            r4 = 1
            goto L66
        L92:
            r0 = 3
            goto L49
        L94:
            r0 = 0
            goto L45
        L96:
            r0 = 0
            goto L33
        L98:
            r0 = 0
            goto L21
        L9a:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10AA.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.tiktok.tpsc.model.VideoItemSettings):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(int r1, com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            if (r1 == 0) goto L1b
            com.ss.android.ugc.aweme.feed.model.PlayListInfo r0 = r2.playlist_info
            if (r0 == 0) goto L9
            r0 = 0
            r2.playlist_info = r0
        L9:
            r0 = 4
            if (r1 != r0) goto L1b
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r2)
            if (r1 == 0) goto L16
            r0 = 1
            r1.setPrivateStatus(r0)
        L16:
            r0 = 0
            r2.setSubOnlyVideo(r0)
            return
        L1b:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r2)
            if (r0 == 0) goto L16
            r0.setPrivateStatus(r1)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10AA.LJFF(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(int r5, int r6, com.ss.android.ugc.aweme.feed.model.Aweme r7, com.ss.android.ugc.tiktok.tpsc.privacy.video.model.VideoPrivateUrlModel r8) {
        /*
            com.ss.android.ugc.aweme.feed.model.PrivateUrlModel r3 = new com.ss.android.ugc.aweme.feed.model.PrivateUrlModel     // Catch: java.lang.Exception -> L5c
            r3.<init>()     // Catch: java.lang.Exception -> L5c
            com.google.gson.Gson r2 = X.C1703730uR9.LIZ()     // Catch: java.lang.Exception -> L5c
            r4 = 0
            if (r8 == 0) goto L45
            java.lang.String r1 = r8.getLabelPrivate()     // Catch: java.lang.Exception -> L5c
        L10:
            java.lang.Class<com.ss.android.ugc.aweme.base.model.UrlModel> r0 = com.ss.android.ugc.aweme.base.model.UrlModel.class
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Exception -> L5c
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0     // Catch: java.lang.Exception -> L5c
            r3.labelPrivate = r0     // Catch: java.lang.Exception -> L5c
            com.google.gson.Gson r2 = X.C1703730uR9.LIZ()     // Catch: java.lang.Exception -> L5c
            if (r8 == 0) goto L43
            java.lang.String r1 = r8.getHybridLabels()     // Catch: java.lang.Exception -> L5c
        L24:
            java.lang.reflect.Type r0 = X.C10AA.LIZ     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = r2.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L5c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L5c
            r3.hybridLabels = r0     // Catch: java.lang.Exception -> L5c
            com.google.gson.Gson r1 = X.C1703730uR9.LIZ()     // Catch: java.lang.Exception -> L5c
            if (r8 == 0) goto L38
            java.lang.String r4 = r8.getTextVideoLabels()     // Catch: java.lang.Exception -> L5c
        L38:
            java.lang.reflect.Type r0 = X.C10AA.LIZIZ     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = r1.LJIIIIZZ(r4, r0)     // Catch: java.lang.Exception -> L5c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L5c
            r3.textVideoLabels = r0     // Catch: java.lang.Exception -> L5c
            goto L47
        L43:
            r1 = r4
            goto L24
        L45:
            r1 = r4
            goto L10
        L47:
            if (r5 == 0) goto L52
            r1 = 1
            if (r5 == r1) goto L53
            r0 = 2
            if (r5 != r0) goto L52
            r1 = 11
            goto L53
        L52:
            r1 = 0
        L53:
            X.0RWb r0 = new X.0RWb     // Catch: java.lang.Exception -> L5c
            r0.<init>(r1, r7, r3)     // Catch: java.lang.Exception -> L5c
            X.C1440005kM.LIZ(r0)     // Catch: java.lang.Exception -> L5c
            return
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10AA.LIZLLL(int, int, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.tiktok.tpsc.privacy.video.model.VideoPrivateUrlModel):void");
    }
}
