package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreviewCardUsePreviewSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.livesetting.watchlive.TtliveSwapMultiStreamDataSetting;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1ACC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACC {
    public static C0IF5 LIZ(FrameLayout frameLayout) {
        KeyEvent.Callback callback;
        if (frameLayout.getChildCount() != 0) {
            Iterator<View> it2 = new C09RD(frameLayout).iterator();
            do {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    callback = (View) c09re.next();
                } else {
                    return null;
                }
            } while (!(callback instanceof C0IF5));
            return (C0IF5) callback;
        }
        return null;
    }

    public static Pair LIZIZ(LiveRoomStruct liveRoomStruct) {
        String multiStreamDefaultQualitySdkKey;
        boolean z;
        String streamData;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.PullData pullData2;
        String multiStreamData = liveRoomStruct.getMultiStreamData();
        EnablePreviewCardUsePreviewSetting enablePreviewCardUsePreviewSetting = EnablePreviewCardUsePreviewSetting.INSTANCE;
        if (enablePreviewCardUsePreviewSetting.getValue() == 1) {
            multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultPreviewQualitySdkKey();
        } else {
            multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
        }
        TtliveSwapMultiStreamDataSetting ttliveSwapMultiStreamDataSetting = TtliveSwapMultiStreamDataSetting.INSTANCE;
        if (!ttliveSwapMultiStreamDataSetting.getValue() || (ttliveSwapMultiStreamDataSetting.getValue() && liveRoomStruct.isMainStreamHorizontal())) {
            z = true;
        } else {
            z = false;
        }
        if (liveRoomStruct.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup() && z) {
            StreamUrlStruct streamUrlStruct = liveRoomStruct.multiStreamUrl;
            if (streamUrlStruct != null && (liveCoreSDKData2 = streamUrlStruct.liveCoreSDKData) != null && (pullData2 = liveCoreSDKData2.getPullData()) != null) {
                streamData = pullData2.getStreamData();
            } else {
                streamData = null;
            }
            if (streamData != null) {
                StreamUrlStruct streamUrlStruct2 = liveRoomStruct.multiStreamUrl;
                if (streamUrlStruct2 != null && (liveCoreSDKData = streamUrlStruct2.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                    multiStreamData = pullData.getStreamData();
                } else {
                    multiStreamData = null;
                }
                if (enablePreviewCardUsePreviewSetting.getValue() == 1) {
                    multiStreamDefaultQualitySdkKey = liveRoomStruct.getLiveStudioExtraStreamDefaultPreviewQualitySdkKey();
                } else {
                    multiStreamDefaultQualitySdkKey = liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("multiStreamUrl in prepare, multiStreamData=");
                sbLIZ.append(multiStreamData);
                C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", "multiStreamUrl invalid for innerPlay");
            }
        }
        return new Pair(multiStreamData, multiStreamDefaultQualitySdkKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.0IF5, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LIZJ(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r5, java.lang.String r6, X.C1A7N r7, boolean r8, X.EnumC1913520ztW r9) {
        /*
            if (r5 == 0) goto Lc5
            boolean r0 = r5.liveTypeAudio
            if (r0 == 0) goto Lc5
            r3 = 1
        L7:
            X.0Tl6 r1 = X.C755980Tl6.LIZ()
            if (r6 != 0) goto L7a
            r1.getClass()
        L10:
            X.1ACw r0 = X.C2175681ACw.LIZ
            r0.getClass()
            X.01GW r0 = X.C0A52.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 24
            if (r0 == 0) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L3e
        L2d:
            X.0ztW r0 = X.EnumC1913520ztW.GAME_PARTNERSHIP
            if (r9 == r0) goto L67
            if (r8 != 0) goto L67
            X.1A7J r0 = new X.1A7J
            r0.<init>(r4)
        L38:
            if (r7 == 0) goto L3d
            r0.setSmoothEnterHandler(r7)
        L3d:
            return r0
        L3e:
            X.01GW r1 = X.C2175681ACw.LIZJ
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.ab.SurfaceViewConfig r0 = (com.ss.android.ugc.aweme.ab.SurfaceViewConfig) r0
            boolean r0 = r0.enable
            if (r0 == 0) goto L67
            if (r6 == 0) goto L67
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.ab.SurfaceViewConfig r0 = (com.ss.android.ugc.aweme.ab.SurfaceViewConfig) r0
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.settings
            java.lang.Object r0 = r0.get(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L67
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L67
            goto L2d
        L67:
            if (r3 != 0) goto L74
            android.content.MutableContextWrapper r1 = new android.content.MutableContextWrapper
            r1.<init>(r4)
            X.1A7E r0 = new X.1A7E
            r0.<init>(r1)
            goto L38
        L74:
            X.1A7G r0 = new X.1A7G
            r0.<init>(r4)
            goto L38
        L7a:
            if (r3 == 0) goto Lb6
            java.util.Map<java.lang.String, android.view.View> r0 = r1.LJFF
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, android.view.View> r0 = r1.LJFF
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.remove(r6)
            android.view.View r0 = (android.view.View) r0
        L8a:
            if (r0 == 0) goto L10
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            int r1 = r0.hashCode()
            r2.append(r1)
            java.lang.String r1 = ""
            r2.append(r1)
            X.C2188811AlT.LIZIZ(r2)
            boolean r1 = r0 instanceof X.InterfaceC464060IHs
            if (r1 == 0) goto La9
            r1 = r0
            X.0IHs r1 = (X.InterfaceC464060IHs) r1
            r1.LIZIZ()
        La9:
            if (r7 == 0) goto Lb5
            boolean r1 = r0 instanceof X.C0IF5
            if (r1 == 0) goto Lb5
            r1 = r0
            X.0IF5 r1 = (X.C0IF5) r1
            r1.setSmoothEnterHandler(r7)
        Lb5:
            return r0
        Lb6:
            java.util.Map<java.lang.String, android.view.View> r0 = r1.LJI
            if (r0 == 0) goto L10
            java.util.Map<java.lang.String, android.view.View> r0 = r1.LJI
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.remove(r6)
            android.view.View r0 = (android.view.View) r0
            goto L8a
        Lc5:
            r3 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACC.LIZJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, java.lang.String, X.1A7N, boolean, X.0ztW):android.view.View");
    }
}
