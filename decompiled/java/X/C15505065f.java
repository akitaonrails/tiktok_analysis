package X;

import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.065f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonCacheManager$triggerNextVideoDataUsePitaya$runPitayaTask$1", f = "QuickShareButtonCacheManager.kt", l = {295}, m = "invokeSuspend")
public final class C15505065f extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15505065f(Aweme aweme, InterfaceC1364105Vn<? super C15505065f> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15505065f(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final long jCurrentTimeMillis;
        List list;
        String str;
        PTYTaskResultCallback pTYTaskResultCallback;
        C1C7U.LIZ("QuickShareButtonCacheManager@1326.triggerNextVideoDataUsePitaya$runPitayaTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        final Aweme aweme = null;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1004770cFn.LIZ(C1004770cFn.LIZ, "first_frame", "homepage_hot", AwemeExtKt.getAuthorUid(this.LLILLL), this.LLILLL.getAid());
            jCurrentTimeMillis = System.currentTimeMillis();
            Aweme aweme2 = this.LLILLL;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            obj = C2296808zG.LJ(new C065W(aweme2, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QuickShareButtonCacheManager@1326.triggerNextVideoDataUsePitaya$runPitayaTask$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            list = (List) pair.getFirst();
        } else {
            list = null;
        }
        Aweme aweme3 = this.LLILLL;
        QuickShareAIInfo quickShareAIInfo = aweme3.getQuickShareAIInfo();
        if (quickShareAIInfo != null) {
            str = quickShareAIInfo.showByCandidateScore;
        } else {
            str = null;
        }
        PTYTaskData pTYTaskDataLIZIZ = C065R.LIZIZ(aweme3, "first_frame", "", str, list);
        if (((Boolean) C1865840yec.LIZIZ.getValue()).booleanValue()) {
            final String aid = this.LLILLL.getAid();
            C1004550cFR.LIZIZ.getClass();
            pTYTaskResultCallback = new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonCacheManager$createPitayaCallback$1
                /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[Catch: JSONException -> 0x00eb, PHI: r12
                  0x0071: PHI (r12v11 java.lang.String) = (r12v2 java.lang.String), (r12v12 java.lang.String) binds: [B:17:0x006f, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[PHI: r12
                  0x007f: PHI (r12v3 java.lang.String) = (r12v2 java.lang.String), (r12v11 java.lang.String), (r12v11 java.lang.String) binds: [B:17:0x006f, B:19:0x0075, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[PHI: r5 r11 r12
                  0x00a1: PHI (r5v0 boolean) = (r5v4 boolean), (r5v4 boolean), (r5v5 boolean) binds: [B:32:0x0097, B:34:0x009f, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
                  0x00a1: PHI (r11v3 java.lang.String) = (r11v7 java.lang.String), (r11v7 java.lang.String), (r11v8 java.lang.String) binds: [B:32:0x0097, B:34:0x009f, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
                  0x00a1: PHI (r12v4 java.lang.String) = (r12v8 java.lang.String), (r12v8 java.lang.String), (r12v9 java.lang.String) binds: [B:32:0x0097, B:34:0x009f, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResult(boolean r24, com.bytedance.pitaya.api.bean.PTYError r25, com.bytedance.pitaya.api.bean.PTYTaskData r26, com.bytedance.pitaya.api.bean.PTYPackageInfo r27) {
                    /*
                        Method dump skipped, instruction units count: 345
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonCacheManager$createPitayaCallback$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYTaskData, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                }
            };
        } else {
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            final String aid2 = this.LLILLL.getAid();
            final Aweme aweme4 = this.LLILLL;
            c1004550cFR.getClass();
            pTYTaskResultCallback = new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonCacheManager$createPitayaCallback$1
                /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[Catch: JSONException -> 0x00eb, PHI: r12
                  0x0071: PHI (r12v11 java.lang.String) = (r12v2 java.lang.String), (r12v12 java.lang.String) binds: [B:17:0x006f, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[PHI: r12
                  0x007f: PHI (r12v3 java.lang.String) = (r12v2 java.lang.String), (r12v11 java.lang.String), (r12v11 java.lang.String) binds: [B:17:0x006f, B:19:0x0075, B:21:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x008d A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00a1 A[PHI: r5 r11 r12
                  0x00a1: PHI (r5v0 boolean) = (r5v4 boolean), (r5v4 boolean), (r5v5 boolean) binds: [B:32:0x0097, B:34:0x009f, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
                  0x00a1: PHI (r11v3 java.lang.String) = (r11v7 java.lang.String), (r11v7 java.lang.String), (r11v8 java.lang.String) binds: [B:32:0x0097, B:34:0x009f, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]
                  0x00a1: PHI (r12v4 java.lang.String) = (r12v8 java.lang.String), (r12v8 java.lang.String), (r12v9 java.lang.String) binds: [B:32:0x0097, B:34:0x009f, B:26:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: JSONException -> 0x00eb, TryCatch #0 {JSONException -> 0x00eb, blocks: (B:6:0x004e, B:8:0x0054, B:12:0x0060, B:14:0x0066, B:18:0x0071, B:20:0x0077, B:28:0x0087, B:31:0x0093, B:33:0x0099, B:39:0x00a8, B:41:0x00ae, B:42:0x00b4, B:45:0x00c0, B:44:0x00ba, B:30:0x008d), top: B:55:0x004e }] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResult(boolean r24, com.bytedance.pitaya.api.bean.PTYError r25, com.bytedance.pitaya.api.bean.PTYTaskData r26, com.bytedance.pitaya.api.bean.PTYPackageInfo r27) {
                    /*
                        Method dump skipped, instruction units count: 345
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonCacheManager$createPitayaCallback$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYTaskData, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                }
            };
        }
        C065R.LIZ().runTask("quick_share_button", pTYTaskDataLIZIZ, new PTYTaskConfig(false, null, 1000.0f), pTYTaskResultCallback);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareButtonCacheManager@1326.triggerNextVideoDataUsePitaya$runPitayaTask$1");
        return unit;
    }
}
