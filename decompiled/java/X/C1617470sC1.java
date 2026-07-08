package X;

import Y.AfS193S0100000_24;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi;
import com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoRequest;
import com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoResponse;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sC1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617470sC1 {
    public static final /* synthetic */ C1617470sC1 LIZ = new C1617470sC1();
    public static final C01GW<MiniDramaVideoApi> LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(236));

    public static void LIZ(List list, Integer num, Function1 function1) {
        EnumC1574730r55 enumC1574730r55 = EnumC1574730r55.AWEME_PRELOAD;
        Map<String, MiniDramaPreloadMonitor.MiniDramaPreloadEvent> map = MiniDramaPreloadMonitor.LIZ;
        String value = enumC1574730r55.getValue();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object miniDramaPreloadEvent = linkedHashMap.get(value);
        if (miniDramaPreloadEvent == null) {
            miniDramaPreloadEvent = new MiniDramaPreloadMonitor.MiniDramaPreloadEvent();
            linkedHashMap.put(value, miniDramaPreloadEvent);
        }
        MiniDramaPreloadMonitor.MiniDramaPreloadEvent miniDramaPreloadEvent2 = (MiniDramaPreloadMonitor.MiniDramaPreloadEvent) miniDramaPreloadEvent;
        miniDramaPreloadEvent2.preloadType = enumC1574730r55.getValue();
        C1617550sC9.LIZ.getClass();
        miniDramaPreloadEvent2.stage = C1617550sC9.LIZIZ;
        miniDramaPreloadEvent2.LIZ = SystemClock.elapsedRealtime();
        C1163504gr.LIZIZ.onEventV3("mini_drama_preload_action_event", new JSONObject(JsonParseUtils.LJ(miniDramaPreloadEvent2)));
        TiktokV1PaidContentMiniDramaVideoRequest tiktokV1PaidContentMiniDramaVideoRequest = new TiktokV1PaidContentMiniDramaVideoRequest(list, num);
        C01GW<MiniDramaVideoApi> c01gw = LIZIZ;
        if (c01gw.getValue() == null) {
            function1.invoke(null);
            MiniDramaPreloadMonitor.LIZJ(enumC1574730r55, AFwS264S0000000_24.get$arr$(221));
            return;
        }
        MiniDramaVideoApi value2 = c01gw.getValue();
        if (value2 != null) {
            IDramaSharedApiPathService.LIZ.getClass();
            C11NZ<TiktokV1PaidContentMiniDramaVideoResponse> miniDramaVideoList = value2.getMiniDramaVideoList(C1573560r3C.LIZ().LIZ(EnumC1578460rB6.MINI_DRAMA_VIDEO), tiktokV1PaidContentMiniDramaVideoRequest);
            if (miniDramaVideoList != null) {
                miniDramaVideoList.LJJIJIL(new C09JN() { // from class: X.0sC2
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MiniDramaVideoApi$Companion@f8f1.fetchMiniDramaVideoList$observable$1");
                        EnumC1574730r55 enumC1574730r552 = EnumC1574730r55.AWEME_PRELOAD;
                        MiniDramaPreloadMonitor.MiniDramaPreloadEvent miniDramaPreloadEvent3 = (MiniDramaPreloadMonitor.MiniDramaPreloadEvent) ((LinkedHashMap) MiniDramaPreloadMonitor.LIZ).get(enumC1574730r552.getValue());
                        if (miniDramaPreloadEvent3 != null) {
                            MiniDramaPreloadMonitor.MiniDramaPreloadEvent miniDramaPreloadEvent4 = new MiniDramaPreloadMonitor.MiniDramaPreloadEvent();
                            miniDramaPreloadEvent4.preloadType = enumC1574730r552.getValue();
                            C1617530sC7.LIZ.getClass();
                            miniDramaPreloadEvent4.stage = C1617530sC7.LIZIZ;
                            miniDramaPreloadEvent4.stageDuration = SystemClock.elapsedRealtime() - miniDramaPreloadEvent3.LIZ;
                            C1163504gr.LIZIZ.onEventV3("mini_drama_preload_action_event", new JSONObject(JsonParseUtils.LJ(miniDramaPreloadEvent4)));
                        }
                        C1C7U.LIZIZ("MiniDramaVideoApi$Companion@f8f1.fetchMiniDramaVideoList$observable$1");
                    }
                }).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS193S0100000_24(function1, 12), new AfS193S0100000_24(function1, 13));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: Exception -> 0x00b1, TryCatch #0 {Exception -> 0x00b1, blocks: (B:22:0x007f, B:23:0x0082, B:26:0x0088, B:28:0x008c, B:33:0x0098, B:35:0x00a2, B:15:0x0048, B:17:0x0057, B:19:0x006c), top: B:40:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: Exception -> 0x00b1, TryCatch #0 {Exception -> 0x00b1, blocks: (B:22:0x007f, B:23:0x0082, B:26:0x0088, B:28:0x008c, B:33:0x0098, B:35:0x00a2, B:15:0x0048, B:17:0x0057, B:19:0x006c), top: B:40:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List r10, java.lang.String r11, java.lang.String r12, X.InterfaceC1364105Vn r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C1617500sC4
            if (r0 == 0) goto L25
            r3 = r13
            X.0sC4 r3 = (X.C1617500sC4) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r4 = r3.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2b
            java.lang.Object r11 = r3.LL
            java.lang.String r11 = (java.lang.String) r11
            goto L7f
        L25:
            X.0sC4 r3 = new X.0sC4
            r3.<init>(r9, r13)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r4)
            X.0r55 r8 = X.EnumC1574730r55.COMPONENT_PRELOAD
            X.0sC9 r4 = X.C1617550sC9.LIZ
            kotlin.jvm.internal.AwS74S1000000_24 r1 = new kotlin.jvm.internal.AwS74S1000000_24
            r0 = 4
            r1.<init>(r12, r0)
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r11, r8, r4, r1)
            com.ss.android.ugc.aweme.minidrama.common.model.TiktokV1PaidContentMiniDramaVideoByIdsRequest r7 = new com.ss.android.ugc.aweme.minidrama.common.model.TiktokV1PaidContentMiniDramaVideoByIdsRequest
            r7.<init>(r10)
            X.0sC7 r0 = X.C1617530sC7.LIZ     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r11, r8, r0, r5)     // Catch: java.lang.Exception -> Lb1
            X.01GW<com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi> r0 = X.C1617470sC1.LIZIZ     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi r4 = (com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi) r4     // Catch: java.lang.Exception -> Lb1
            if (r4 == 0) goto L85
            X.0r3C r0 = com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService.LIZ     // Catch: java.lang.Exception -> Lb1
            r0.getClass()     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService r1 = X.C1573560r3C.LIZ()     // Catch: java.lang.Exception -> Lb1
            X.0rB6 r0 = X.EnumC1578460rB6.MINI_DRAMA_VIDEO_BY_IDS     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = r1.LIZ(r0)     // Catch: java.lang.Exception -> Lb1
            X.11NZ r1 = r4.getMiniDramaVideoListByIds(r0, r7)     // Catch: java.lang.Exception -> Lb1
            if (r1 == 0) goto L85
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Exception -> Lb1
            X.11Hw r0 = r1.LJL(r0)     // Catch: java.lang.Exception -> Lb1
            r3.LL = r11     // Catch: java.lang.Exception -> Lb1
            r3.LLILZ = r2     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r4 = X.C11UD.LIZJ(r0, r3)     // Catch: java.lang.Exception -> Lb1
            if (r4 != r6) goto L82
            return r6
        L7f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> Lb1
        L82:
            com.ss.android.ugc.aweme.minidrama.common.model.TiktokV1PaidContentMiniDramaVideoByIdsResponse r4 = (com.ss.android.ugc.aweme.minidrama.common.model.TiktokV1PaidContentMiniDramaVideoByIdsResponse) r4     // Catch: java.lang.Exception -> Lb1
            goto L86
        L85:
            r4 = r5
        L86:
            if (r4 == 0) goto L95
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo> r0 = r4.videoList     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto L95
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> Lb1
            r0 = r0 ^ 1
            if (r0 != r2) goto L95
            goto L96
        L95:
            r2 = 0
        L96:
            if (r2 == 0) goto La2
            X.0r55 r1 = X.EnumC1574730r55.COMPONENT_PRELOAD     // Catch: java.lang.Exception -> Lb1
            X.0sC8 r0 = X.C1617540sC8.LIZ     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r11, r1, r0, r5)     // Catch: java.lang.Exception -> Lb1
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo> r5 = r4.videoList     // Catch: java.lang.Exception -> Lb1
            return r5
        La2:
            X.0r55 r3 = X.EnumC1574730r55.COMPONENT_PRELOAD     // Catch: java.lang.Exception -> Lb1
            X.0sC6 r2 = X.C1617520sC6.LIZ     // Catch: java.lang.Exception -> Lb1
            kotlin.jvm.internal.AwS603S0100000_24 r1 = new kotlin.jvm.internal.AwS603S0100000_24     // Catch: java.lang.Exception -> Lb1
            r0 = 146(0x92, float:2.05E-43)
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r11, r3, r2, r1)     // Catch: java.lang.Exception -> Lb1
            return r5
        Lb1:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0r55 r3 = X.EnumC1574730r55.COMPONENT_PRELOAD
            X.0sC6 r2 = X.C1617520sC6.LIZ
            kotlin.jvm.internal.AwS603S0100000_24 r1 = new kotlin.jvm.internal.AwS603S0100000_24
            r0 = 147(0x93, float:2.06E-43)
            r1.<init>(r4, r0)
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r11, r3, r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1617470sC1.LIZJ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: Exception -> 0x00b1, TryCatch #0 {Exception -> 0x00b1, blocks: (B:22:0x007f, B:23:0x0082, B:26:0x0088, B:28:0x008c, B:33:0x0098, B:35:0x00a2, B:15:0x0048, B:17:0x0057, B:19:0x006c), top: B:40:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[Catch: Exception -> 0x00b1, TryCatch #0 {Exception -> 0x00b1, blocks: (B:22:0x007f, B:23:0x0082, B:26:0x0088, B:28:0x008c, B:33:0x0098, B:35:0x00a2, B:15:0x0048, B:17:0x0057, B:19:0x006c), top: B:40:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r10, java.util.List<java.lang.Long> r11, java.lang.Integer r12, java.lang.String r13, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof X.C1617490sC3
            if (r0 == 0) goto L25
            r3 = r14
            X.0sC3 r3 = (X.C1617490sC3) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r4 = r3.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2b
            java.lang.Object r10 = r3.LL
            java.lang.String r10 = (java.lang.String) r10
            goto L7f
        L25:
            X.0sC3 r3 = new X.0sC3
            r3.<init>(r9, r14)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r4)
            X.0r55 r8 = X.EnumC1574730r55.COMPONENT_PRELOAD
            X.0sC9 r4 = X.C1617550sC9.LIZ
            kotlin.jvm.internal.AwS74S1000000_24 r1 = new kotlin.jvm.internal.AwS74S1000000_24
            r0 = 1
            r1.<init>(r13, r0)
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r10, r8, r4, r1)
            com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoRequest r7 = new com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoRequest
            r7.<init>(r11, r12)
            X.0sC7 r0 = X.C1617530sC7.LIZ     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r10, r8, r0, r5)     // Catch: java.lang.Exception -> Lb1
            X.01GW<com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi> r0 = X.C1617470sC1.LIZIZ     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi r4 = (com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi) r4     // Catch: java.lang.Exception -> Lb1
            if (r4 == 0) goto L85
            X.0r3C r0 = com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService.LIZ     // Catch: java.lang.Exception -> Lb1
            r0.getClass()     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService r1 = X.C1573560r3C.LIZ()     // Catch: java.lang.Exception -> Lb1
            X.0rB6 r0 = X.EnumC1578460rB6.MINI_DRAMA_VIDEO     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = r1.LIZ(r0)     // Catch: java.lang.Exception -> Lb1
            X.11NZ r1 = r4.getMiniDramaVideoList(r0, r7)     // Catch: java.lang.Exception -> Lb1
            if (r1 == 0) goto L85
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Exception -> Lb1
            X.11Hw r0 = r1.LJL(r0)     // Catch: java.lang.Exception -> Lb1
            r3.LL = r10     // Catch: java.lang.Exception -> Lb1
            r3.LLILZ = r2     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r4 = X.C11UD.LIZJ(r0, r3)     // Catch: java.lang.Exception -> Lb1
            if (r4 != r6) goto L82
            return r6
        L7f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> Lb1
        L82:
            com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoResponse r4 = (com.ss.android.ugc.aweme.minidrama.common.preload.TiktokV1PaidContentMiniDramaVideoResponse) r4     // Catch: java.lang.Exception -> Lb1
            goto L86
        L85:
            r4 = r5
        L86:
            if (r4 == 0) goto L95
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo> r0 = r4.videoList     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto L95
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> Lb1
            r0 = r0 ^ 1
            if (r0 != r2) goto L95
            goto L96
        L95:
            r2 = 0
        L96:
            if (r2 == 0) goto La2
            X.0r55 r1 = X.EnumC1574730r55.COMPONENT_PRELOAD     // Catch: java.lang.Exception -> Lb1
            X.0sC8 r0 = X.C1617540sC8.LIZ     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r10, r1, r0, r5)     // Catch: java.lang.Exception -> Lb1
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo> r5 = r4.videoList     // Catch: java.lang.Exception -> Lb1
            return r5
        La2:
            X.0r55 r3 = X.EnumC1574730r55.COMPONENT_PRELOAD     // Catch: java.lang.Exception -> Lb1
            X.0sC6 r2 = X.C1617520sC6.LIZ     // Catch: java.lang.Exception -> Lb1
            kotlin.jvm.internal.AwS603S0100000_24 r1 = new kotlin.jvm.internal.AwS603S0100000_24     // Catch: java.lang.Exception -> Lb1
            r0 = 141(0x8d, float:1.98E-43)
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> Lb1
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r10, r3, r2, r1)     // Catch: java.lang.Exception -> Lb1
            return r5
        Lb1:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0r55 r3 = X.EnumC1574730r55.COMPONENT_PRELOAD
            X.0sC6 r2 = X.C1617520sC6.LIZ
            kotlin.jvm.internal.AwS603S0100000_24 r1 = new kotlin.jvm.internal.AwS603S0100000_24
            r0 = 142(0x8e, float:1.99E-43)
            r1.<init>(r4, r0)
            com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor.LIZ(r10, r3, r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1617470sC1.LIZIZ(java.lang.String, java.util.List, java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }
}
