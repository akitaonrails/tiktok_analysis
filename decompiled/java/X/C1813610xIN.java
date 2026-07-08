package X;

import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.LiveFragmentDetail;
import tikcast.api.anchor.LiveFragmentShowInfo;

/* JADX INFO: renamed from: X.0xIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813610xIN {
    public final List<C1808830xAf> LIZ = new ArrayList();
    public final List<C1808830xAf> LIZIZ = new ArrayList();

    public static C1808830xAf LJ(LiveFragmentDetail liveFragmentDetail) {
        String str;
        List<String> list;
        LiveFragmentShowInfo liveFragmentShowInfo = liveFragmentDetail.showInfo;
        if (liveFragmentShowInfo == null || (str = liveFragmentShowInfo.name) == null) {
            str = "";
        }
        String str2 = liveFragmentDetail.coverUrl;
        long j = liveFragmentDetail.fragmentId;
        int i = liveFragmentDetail.fragmentType;
        float f = liveFragmentDetail.videoDuration;
        String strValueOf = String.valueOf(j);
        String str3 = liveFragmentDetail.downloadUrl;
        String str4 = liveFragmentDetail.roomIdStr;
        PublishPageParams publishPageParams = liveFragmentDetail.publishPageParams;
        String str5 = null;
        if (publishPageParams != null) {
            str5 = publishPageParams.defaultText;
            list = publishPageParams.challenges;
        } else {
            list = null;
        }
        return new C1808830xAf(str, str4, str2, Long.valueOf(j), Integer.valueOf(i), Float.valueOf(f), strValueOf, str3, str5, list, liveFragmentDetail.witdh, liveFragmentDetail.height, liveFragmentDetail.itemIdStr, liveFragmentDetail.postByScene, liveFragmentDetail.vid);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.AnchorReplaySettingsData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1813580xIK
            if (r0 == 0) goto L47
            r4 = r6
            X.0xIK r4 = (X.C1813580xIK) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            T r0 = r1.data
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi> r0 = com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi.class
            r1.getClass()
            java.lang.Object r1 = X.C480460Ism.LIZIZ(r0)
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi) r1
            r0 = 2
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r4.LLILLL = r2
            java.lang.Object r1 = r1.getLiveReplySettings(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L47:
            X.0xIK r4 = new X.0xIK
            r4.<init>(r5, r6)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813610xIN.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813610xIN.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r6, java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1813570xIJ
            if (r0 == 0) goto L46
            r4 = r9
            X.0xIJ r4 = (X.C1813570xIJ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L4c
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi> r0 = com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi.class
            r1.getClass()
            java.lang.Object r1 = X.C480460Ism.LIZIZ(r0)
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi r1 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayApi) r1
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r4.LLILLL = r2
            java.lang.Object r0 = r1.deletePostedAutoPostFragment(r0, r2, r8, r4)
            if (r0 != r3) goto L22
            return r3
        L46:
            X.0xIJ r4 = new X.0xIJ
            r4.<init>(r5, r9)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813610xIN.LIZ(long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, boolean r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1813590xIL
            if (r0 == 0) goto L49
            r5 = r9
            X.0xIL r5 = (X.C1813590xIL) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L4f
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi> r0 = com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi.class
            r1.getClass()
            java.lang.Object r2 = X.C480460Ism.LIZIZ(r0)
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi r2 = (com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi) r2
            if (r8 == 0) goto L47
            r1 = 1
        L3c:
            r5.LLILLL = r3
            r0 = 18
            java.lang.Object r0 = r2.reportAutoPostPanelStatus(r7, r0, r1, r5)
            if (r0 != r4) goto L22
            return r4
        L47:
            r1 = 2
            goto L3c
        L49:
            X.0xIL r5 = new X.0xIL
            r5.<init>(r6, r9)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813610xIN.LIZLLL(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
