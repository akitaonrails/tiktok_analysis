package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposedCommentInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service;
import com.ss.android.ugc.aweme.ml.api.SmartCommentConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214941BmW implements InterfaceC2214931BmV {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1512870pTJ());

    public final ISmartPreloadCommentV3Service LJII() {
        return (ISmartPreloadCommentV3Service) this.LIZ.getValue();
    }

    @Override // X.InterfaceC2214931BmV
    public final Integer LIZ(int i, String str) {
        SmartCommentConfig smartCommentConfigLJI;
        ISmartPreloadCommentV3Service iSmartPreloadCommentV3ServiceLJII = LJII();
        if (iSmartPreloadCommentV3ServiceLJII != null && (smartCommentConfigLJI = iSmartPreloadCommentV3ServiceLJII.LJI(i, str)) != null) {
            return smartCommentConfigLJI.getWwanNetLevel();
        }
        return null;
    }

    @Override // X.InterfaceC2214931BmV
    public final Integer LIZIZ(int i, String str) {
        SmartCommentConfig smartCommentConfigLJI;
        ISmartPreloadCommentV3Service iSmartPreloadCommentV3ServiceLJII = LJII();
        if (iSmartPreloadCommentV3ServiceLJII != null && (smartCommentConfigLJI = iSmartPreloadCommentV3ServiceLJII.LJI(i, str)) != null) {
            return smartCommentConfigLJI.getWifiNetLevel();
        }
        return null;
    }

    @Override // X.InterfaceC2214931BmV
    public final int LIZLLL(int i, String str) {
        SmartCommentConfig smartCommentConfigLJI;
        ISmartPreloadCommentV3Service iSmartPreloadCommentV3ServiceLJII = LJII();
        if (iSmartPreloadCommentV3ServiceLJII != null && (smartCommentConfigLJI = iSmartPreloadCommentV3ServiceLJII.LJI(i, str)) != null) {
            return smartCommentConfigLJI.getNetworkType();
        }
        return EnumC993940byK.ONLY_WIFI.getValue();
    }

    @Override // X.InterfaceC2214931BmV
    public final boolean LJ(Aweme aweme, String str) {
        SmartCommentConfig smartCommentConfigLIZ;
        if (C1387940mDo.LIZ(aweme) != 0) {
            return false;
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            SmartCommentConfig smartCommentConfig = (SmartCommentConfig) C1511640pRK.LIZ.getValue();
            if (smartCommentConfig == null) {
                return true;
            }
            return smartCommentConfig.getCanPending();
        }
        if (!C1511580pRE.LIZIZ(str) || (smartCommentConfigLIZ = C1511580pRE.LIZ(str)) == null) {
            return true;
        }
        return smartCommentConfigLIZ.getCanPending();
    }

    @Override // X.InterfaceC2214931BmV
    public final boolean LIZJ(int i, Aweme aweme, String str, C0T07 c0t07) {
        SmartCommentConfig smartCommentConfigLJI;
        if (c0t07.LIZ) {
            C2214861BmO.LIZ.getClass();
            C2214861BmO.LIZJ(2, "comment_preload");
            return false;
        }
        if (aweme != null && C1344730l67.LIZ(aweme)) {
            C2214861BmO.LIZ.getClass();
            C2214861BmO.LIZJ(7, "comment_preload");
            return false;
        }
        int iLIZ = C1387940mDo.LIZ(aweme);
        int i2 = 13;
        if (iLIZ == -1) {
            C2214861BmO.LIZ.getClass();
            C2214861BmO.LIZJ(13, "comment_preload");
            return true;
        }
        ISmartPreloadCommentV3Service iSmartPreloadCommentV3ServiceLJII = LJII();
        if (iSmartPreloadCommentV3ServiceLJII == null || (smartCommentConfigLJI = iSmartPreloadCommentV3ServiceLJII.LJI(iLIZ, str)) == null) {
            return false;
        }
        if (i >= 1) {
            int i3 = 1 << (i - 1);
            if ((smartCommentConfigLJI.getTriggerSceneId() & i3) == i3) {
                if (iLIZ != 2) {
                    i2 = 14;
                }
                C2214861BmO.LIZ.getClass();
                C2214861BmO.LIZJ(i2, "comment_preload");
                return true;
            }
        }
        C2214861BmO.LIZ.getClass();
        C2214861BmO.LIZJ(4, "comment_preload");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.1BmY] */
    @Override // X.InterfaceC2214931BmV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final int r10, final com.ss.android.ugc.aweme.feed.model.Aweme r11, final java.lang.String r12, final X.C2214971BmZ r13) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "aweme.commentConfig.preload: "
            r1.append(r0)
            r2 = 0
            r7 = r11
            if (r7 == 0) goto L1e
            com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig r0 = r7.getCommentConfig()
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.feed.model.CommentPreloadInfo r0 = r0.preload
        L15:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r7 == 0) goto L50
            goto L20
        L1e:
            r0 = r2
            goto L15
        L20:
            com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig r0 = r7.getCommentConfig()     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.feed.model.CommentPreloadInfo r0 = r0.preload     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L50
            java.lang.String r1 = r0.predictConfig     // Catch: java.lang.Exception -> L4c
            if (r1 == 0) goto L50
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L4c
            r0.<init>()     // Catch: java.lang.Exception -> L4c
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r1)     // Catch: java.lang.Exception -> L4c
            com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "click_comment"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L50
            double r0 = r0.LJIIIZ()     // Catch: java.lang.Exception -> L4c
            java.lang.Double r8 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L4c
            goto L51
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L50:
            r8 = r2
        L51:
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r0 = "enter_from"
            r4 = r12
            r3.LJIIIIZZ(r0, r4)
            if (r7 == 0) goto L62
            java.lang.String r2 = r7.getAid()
        L62:
            java.lang.String r0 = "group_id"
            r3.LJIIIIZZ(r0, r2)
            java.lang.String r1 = "type"
            int r0 = X.C1387940mDo.LIZ(r7)
            r3.LIZJ(r0, r1)
            if (r8 == 0) goto L97
            double r1 = r8.doubleValue()
        L76:
            java.lang.String r0 = "server_score"
            r3.LIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "server_comment_preload_type_result"
            X.C20684815ws.LJIILLIIL(r0, r1)
            X.1BmY r2 = new X.1BmY
            r5 = r13
            r6 = r10
            r3 = r9
            r2.<init>()
            int r1 = X.C1387940mDo.LIZ(r7)
            r0 = -1
            if (r1 == r0) goto L9e
            if (r1 == 0) goto L9a
            r2.LIZJ(r1)
            return
        L97:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L76
        L9a:
            r2.LIZ(r1)
            return
        L9e:
            X.C2214961BmY.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2214941BmW.LJFF(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.1BmZ):void");
    }

    public static void LJIIIIZZ(C2214941BmW c2214941BmW, Aweme aweme, String str, boolean z, Double d, Float f, String str2, int i) {
        double dDoubleValue;
        String aid = null;
        if ((i & 16) != 0) {
            f = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        c2214941BmW.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LIZJ(C1387940mDo.LIZ(aweme), "type");
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = -1.0d;
        }
        c2344009Gk.LIZ(dDoubleValue, "server_score");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LJ(f, "ai_score");
        c2344009Gk.LJIIIIZZ("fail_reason", str2);
        C20684815ws.LJIILLIIL("comment_preload_client_ai_result", c2344009Gk.LIZ);
    }

    public final void LJI(Float f, int i, Aweme aweme, String str, int i2, C2214971BmZ c2214971BmZ, String str2, Integer num) {
        int iIntValue;
        SmartCommentConfig smartCommentConfigLIZ;
        Integer numValueOf;
        List<ExposedCommentInfo> exposedCommentInfoList;
        String str3 = null;
        if (i == 7 && aweme != null && (exposedCommentInfoList = aweme.getExposedCommentInfoList()) != null && !exposedCommentInfoList.isEmpty()) {
            str3 = ((ExposedCommentInfo) ListProtector.get(exposedCommentInfoList, 0)).commentId;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            ISmartPreloadCommentV3Service iSmartPreloadCommentV3ServiceLJII = LJII();
            if (iSmartPreloadCommentV3ServiceLJII != null && (smartCommentConfigLIZ = iSmartPreloadCommentV3ServiceLJII.LIZ(str)) != null && (numValueOf = Integer.valueOf(smartCommentConfigLIZ.getTtl() * LSPassThroughRecordSizeConfig.DEFAULT)) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 300000;
            }
        }
        C523420Kfs c523420Kfs = CommentService.LIZ;
        c523420Kfs.getClass();
        C523420Kfs.LIZ().LJIIJ(f, aweme, Integer.valueOf(iIntValue), i, str, "homepage_hot", str3, i2, true, str2);
        if (((Number) C295570BiF.LIZ.getValue()).intValue() == 1) {
            C20152913tH.LIZLLL.getClass();
            if (C20153113tJ.LIZ()) {
                c523420Kfs.getClass();
                C523420Kfs.LIZ().LJIJJ(aweme, c2214971BmZ.LIZJ, str, c2214971BmZ.LIZ, c2214971BmZ.LIZIZ);
            }
        }
        C2214861BmO.LIZ.getClass();
        C2214861BmO.LIZJ(0, "comment_preload");
    }
}
