package X;

import Y.ARunnableS14S0500000_21;
import Y.ARunnableS1S1310000_16;
import Y.ARunnableS54S0300000_21;
import Y.ARunnableS6S1400000_16;
import Y.ARunnableS85S0200000_16;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.minis.settings.MinisPerfConfigSettings;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS117S0400000_21;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS637S0100000_23;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS648S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195041AvW {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r2v10, types: [X.0pFx, X.0yue] */
    /* JADX WARN: Type inference failed for: r2v26, types: [X.0mQK, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [X.0mQJ, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0pFx, X.1Auo] */
    /* JADX WARN: Type inference failed for: r2v31, types: [X.0pFx, X.1Ave] */
    /* JADX WARN: Type inference failed for: r2v33, types: [X.0m9y, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [X.0mGb, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [X.0m9q, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [X.0mGd, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [X.0m9p, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [X.0mGe, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [X.0mCZ, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [X.0mCY, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [X.0m9n, X.0pFx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [X.0pFx, X.1Avd] */
    /* JADX WARN: Type inference failed for: r2v47, types: [X.0pFx, X.153j] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0pFx, X.1Avc] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.0pFx, X.1AvY] */
    public static void LIZ(final WeakReference weakReference, final InterfaceC1177504j7 interfaceC1177504j7, WeakReference weakReference2, C09Z1 c09z1, final Function0 function0, final boolean z, final Function0 function02, final WeakReference weakReference3, int i) {
        EnumC2192711Arl enumC2192711Arl;
        SchemaParserData schemaParserData;
        if ((i & 4) != 0) {
            weakReference2 = null;
        }
        if ((i & 8) != 0) {
            c09z1 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            function02 = null;
        }
        if ((i & 128) != 0) {
            weakReference3 = null;
        }
        C2195081Ava c2195081Ava = new C2195081Ava(interfaceC1177504j7, z);
        c2195081Ava.LJI("showKeyboard", new AwS646S0100000_32(c2195081Ava, 2), c2195081Ava);
        C2195091Avb c2195091Avb = new C2195091Avb(interfaceC1177504j7, z);
        c2195091Avb.LJI("updateKeyboard", new AwS646S0100000_32(c2195091Avb, 3), c2195091Avb);
        C2195071AvZ c2195071AvZ = new C2195071AvZ(interfaceC1177504j7, z);
        c2195071AvZ.LJI("hideKeyboard", new AwS646S0100000_32(c2195071AvZ, 1), c2195071AvZ);
        ?? r2 = new C1504590pFx(interfaceC1177504j7) { // from class: X.1Auo
        };
        r2.LJI("preDownloadSubpackageSync", new AwS648S0100000_34((C2194601Auo) r2, 11), null);
        C2194571Aul c2194571Aul = new C2194571Aul(interfaceC1177504j7, c09z1);
        c2194571Aul.LJI("preDownloadSubpackage", new AwS648S0100000_34(c2194571Aul, 10), null);
        C2194611Aup c2194611Aup = new C2194611Aup(interfaceC1177504j7);
        c2194611Aup.LJI("minis.publishEvent", new AwS623S0100000_9(c2194611Aup, 168), null);
        ?? r22 = new C1504590pFx(interfaceC1177504j7) { // from class: X.1Avc
        };
        r22.LJI("minis.getMenuButtonBoundingClientRect", new AwS646S0100000_32((C2195101Avc) r22, 19), null);
        C2195031AvV c2195031AvV = new C2195031AvV(interfaceC1177504j7, function02);
        c2195031AvV.LJI("minis.getLaunchOptionsSync", new AwS648S0100000_34(c2195031AvV, 9), null);
        C2195021AvU c2195021AvU = new C2195021AvU(interfaceC1177504j7, function02);
        c2195021AvU.LJI("minis.getEnterOptionsSync", new AwS648S0100000_34(c2195021AvU, 8), null);
        ?? r23 = new C1504590pFx(interfaceC1177504j7) { // from class: X.1AvY
        };
        r23.LJI("minis.console", new AwS648S0100000_34((C2195061AvY) r23, 7), null);
        if (function02 != null && (schemaParserData = (SchemaParserData) function02.invoke()) != null) {
            enumC2192711Arl = schemaParserData.minisStage;
        } else {
            enumC2192711Arl = null;
        }
        if (enumC2192711Arl == EnumC2192711Arl.MINIS_STAGE_NATIVE_DEBUG) {
            ?? r24 = new C1504590pFx(interfaceC1177504j7) { // from class: X.153j
            };
            r24.LJI("minis.sendDevWsMsg", new AwS645S0100000_31((C204581153j) r24, 83), null);
        }
        if (MinisPerfConfigSettings.LIZ().enableReportApiPerf) {
            ?? r25 = new C1504590pFx(interfaceC1177504j7) { // from class: X.1Avd
            };
            r25.LJI("minis.reportAPIEvent", new AwS623S0100000_9((C2195111Avd) r25, 166), null);
        }
        ?? r26 = new C1504590pFx(interfaceC1177504j7) { // from class: X.0yue
        };
        r26.LJI("minis.getProperty", new AwS642S0100000_28((C1875780yue) r26, 58), null);
        if (weakReference2 != null) {
            C2195641AwU c2195641AwU = new C2195641AwU(weakReference, interfaceC1177504j7, weakReference2, z);
            c2195641AwU.LJI("jumpOpenAuthPage", new AwS648S0100000_34(c2195641AwU, 32), c2195641AwU);
            C1385440m9m c1385440m9m = new C1385440m9m(weakReference, interfaceC1177504j7, weakReference2, z);
            c1385440m9m.LJI("minis.shareAppMessage", new AwS635S0100000_21(c1385440m9m, 187), c1385440m9m);
            ?? r27 = new C1504590pFx(weakReference, interfaceC1177504j7, weakReference2, z) { // from class: X.0m9n
                public final WeakReference<Activity> LIZJ;
                public final WeakReference<InterfaceC1877250yx1> LIZLLL;
                public final boolean LJ;
                public final InterfaceC1877250yx1 LJFF;

                @Override // X.C1504590pFx
                public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                    super.LIZLLL(number, jSONObject);
                    if (this.LJ) {
                        return C1385490m9r.LIZ(this, number);
                    }
                    if (jSONObject == null) {
                        return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
                    }
                    Activity activity = this.LIZJ.get();
                    if (activity == null) {
                        return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                    }
                    InterfaceC1877250yx1 interfaceC1877250yx1 = this.LIZLLL.get();
                    if (interfaceC1877250yx1 == null) {
                        interfaceC1877250yx1 = this.LJFF;
                    }
                    if (interfaceC1877250yx1 == null) {
                        return C1504590pFx.LIZ(-1, null, "sparkViewDepend is null", new JSONObject());
                    }
                    activity.runOnUiThread(new ARunnableS14S0500000_21(this, jSONObject, activity, interfaceC1877250yx1, number, 1));
                    return C1504590pFx.LIZJ(new JSONObject());
                }

                {
                    super(interfaceC1177504j7);
                    this.LIZJ = weakReference;
                    this.LIZLLL = weakReference2;
                    this.LJ = z;
                    this.LJFF = weakReference2.get();
                }
            };
            r27.LJI("minis.shareToUser", new AwS635S0100000_21((C1385450m9n) r27, 183), r27);
            C1392180mKe c1392180mKe = new C1392180mKe(weakReference, interfaceC1177504j7, z);
            c1392180mKe.LJI("minis.shareCurrentContentToTikTokStory", new AwS635S0100000_21(c1392180mKe, 130), c1392180mKe);
        }
        C2195371Aw3 c2195371Aw3 = new C2195371Aw3(weakReference, interfaceC1177504j7, z);
        c2195371Aw3.LJI("minis.pay", new AwS648S0100000_34(c2195371Aw3, 12), c2195371Aw3);
        C2195311Avx c2195311Avx = new C2195311Avx(weakReference, interfaceC1177504j7, z);
        c2195311Avx.LJI("minis.recharge", new AwS648S0100000_34(c2195311Avx, 13), c2195311Avx);
        C2195541AwK c2195541AwK = new C2195541AwK(weakReference, interfaceC1177504j7);
        c2195541AwK.LJI("minis.checkBalance", new AwS648S0100000_34(c2195541AwK, 14), c2195541AwK);
        C1801790wzJ c1801790wzJ = new C1801790wzJ(weakReference, interfaceC1177504j7, z);
        c1801790wzJ.LJI("minis.openBalance", new AwS641S0100000_27(c1801790wzJ, 92), c1801790wzJ);
        C2194801Av8 c2194801Av8 = new C2194801Av8(weakReference, interfaceC1177504j7, z);
        c2194801Av8.LJI("minis.createRewardedVideoAd", new AwS648S0100000_34(c2194801Av8, 1), c2194801Av8);
        C2194841AvC c2194841AvC = new C2194841AvC(weakReference, interfaceC1177504j7, z);
        c2194841AvC.LJI("minis.rewardedVideoAdShow", new AwS648S0100000_34(c2194841AvC, 3), c2194841AvC);
        C2194701Auy c2194701Auy = new C2194701Auy(weakReference, interfaceC1177504j7, z);
        int i2 = C2187451AjH.LIZ;
        c2194701Auy.LJI("minis.createInterstitialAd", new AwS648S0100000_34(c2194701Auy, 0), c2194701Auy);
        C2194621Auq c2194621Auq = new C2194621Auq(weakReference, interfaceC1177504j7, z);
        c2194621Auq.LJI("minis.interstitialAdShow", new AwS648S0100000_34(c2194621Auq, 2), c2194621Auq);
        C1504750pGD c1504750pGD = new C1504750pGD(weakReference, interfaceC1177504j7);
        c1504750pGD.LJI("minis.clearStorage", new AwS637S0100000_23(c1504750pGD, 9), c1504750pGD);
        C1874280ysE c1874280ysE = new C1874280ysE(weakReference, interfaceC1177504j7);
        c1874280ysE.LJI("minis.getStorageItem", new AwS642S0100000_28(c1874280ysE, 73), c1874280ysE);
        C1874290ysF c1874290ysF = new C1874290ysF(weakReference, interfaceC1177504j7);
        c1874290ysF.LJI("minis.removeStorageItem", new AwS642S0100000_28(c1874290ysF, 74), c1874290ysF);
        C1504700pG8 c1504700pG8 = new C1504700pG8(weakReference, interfaceC1177504j7);
        c1504700pG8.LJI("minis.setStorageItem", new AwS637S0100000_23(c1504700pG8, 10), c1504700pG8);
        C2194421AuW c2194421AuW = new C2194421AuW(weakReference, interfaceC1177504j7);
        c2194421AuW.LJI("minis.userStorageAPI", new AwS642S0100000_28(c2194421AuW, 95), c2194421AuW);
        C1392290mKp c1392290mKp = new C1392290mKp(weakReference, interfaceC1177504j7);
        c1392290mKp.LJI("minis.getEntranceMissionReward", new AwS635S0100000_21(c1392290mKp, 185), c1392290mKp);
        C1801000wy2 c1801000wy2 = new C1801000wy2(weakReference, interfaceC1177504j7);
        c1801000wy2.LJI("minis.getShortcutMissionReward", new AwS641S0100000_27(c1801000wy2, 154), c1801000wy2);
        ?? r28 = new C1504590pFx(weakReference, interfaceC1177504j7, z, function02) { // from class: X.0mQK
            public final WeakReference<Activity> LIZJ;
            public final boolean LIZLLL;
            public final Function0<SchemaParserData> LJ;

            @Override // X.C1504590pFx
            public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                SchemaParserData schemaParserDataInvoke;
                String serverValue;
                super.LIZLLL(number, jSONObject);
                String str = "";
                if (this.LIZLLL) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("canReceiveReward", false);
                    jSONObject2.put(Scene.SCENE_SERVICE, "");
                    jSONObject2.put("rewardScene", "");
                    LJFF(number, jSONObject2);
                    return C1504590pFx.LIZJ(new JSONObject());
                }
                if (this.LIZJ.get() == null) {
                    return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
                }
                C1395710mQL c1395710mQL = C1395710mQL.LIZ;
                Function0<SchemaParserData> function03 = this.LJ;
                c1395710mQL.getClass();
                if (function03 == null || (schemaParserDataInvoke = function03.invoke()) == null) {
                    schemaParserDataInvoke = C2195221Avo.LJII;
                }
                C1898307c5 c1898307c5LIZ = C1395710mQL.LIZ(schemaParserDataInvoke);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("canReceiveReward", c1898307c5LIZ.LIZLLL);
                jSONObject3.put(Scene.SCENE_SERVICE, c1898307c5LIZ.LIZ);
                EnumC1781360wSM enumC1781360wSM = c1898307c5LIZ.LIZIZ;
                if (enumC1781360wSM != null && (serverValue = enumC1781360wSM.getServerValue()) != null) {
                    str = serverValue;
                }
                jSONObject3.put("rewardScene", str);
                LJFF(number, jSONObject3);
                return C1504590pFx.LIZJ(new JSONObject());
            }

            {
                super(interfaceC1177504j7);
                this.LIZJ = weakReference;
                this.LIZLLL = z;
                this.LJ = function02;
            }
        };
        r28.LJI("minis.getRevisitMissionReward", new AwS635S0100000_21((C1395700mQK) r28, 186), r28);
        ?? r29 = new C1504590pFx(weakReference, interfaceC1177504j7, z, function02) { // from class: X.0mQJ
            public final WeakReference<Activity> LIZJ;
            public final boolean LIZLLL;
            public final Function0<SchemaParserData> LJ;

            /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
            @Override // X.C1504590pFx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final org.json.JSONObject LIZLLL(java.lang.Number r22, org.json.JSONObject r23) {
                /*
                    r21 = this;
                    r0 = r23
                    r8 = r22
                    r7 = r21
                    super.LIZLLL(r8, r0)
                    boolean r0 = r7.LIZLLL
                    if (r0 == 0) goto L12
                    org.json.JSONObject r0 = X.C1385490m9r.LIZ(r7, r8)
                    return r0
                L12:
                    java.lang.ref.WeakReference<android.app.Activity> r0 = r7.LIZJ
                    java.lang.Object r5 = r0.get()
                    android.app.Activity r5 = (android.app.Activity) r5
                    r14 = 0
                    if (r5 != 0) goto L2a
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    r1 = -1
                    java.lang.String r0 = "activity is null"
                    org.json.JSONObject r0 = X.C1504590pFx.LIZ(r1, r14, r0, r2)
                    return r0
                L2a:
                    X.0mQL r1 = X.C1395710mQL.LIZ
                    kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.minis.common.SchemaParserData> r0 = r7.LJ
                    r1.getClass()
                    if (r0 == 0) goto L3b
                    java.lang.Object r1 = r0.invoke()
                    com.ss.android.ugc.aweme.minis.common.SchemaParserData r1 = (com.ss.android.ugc.aweme.minis.common.SchemaParserData) r1
                    if (r1 != 0) goto L3d
                L3b:
                    com.ss.android.ugc.aweme.minis.common.SchemaParserData r1 = X.C2195221Avo.LJII
                L3d:
                    X.07c5 r2 = X.C1395710mQL.LIZ(r1)
                    boolean r0 = r2.LIZLLL
                    if (r0 != 0) goto L5d
                    X.07bh r6 = new X.07bh
                    r6.<init>()
                L4a:
                    Y.ARunnableS29S0400000_21 r4 = new Y.ARunnableS29S0400000_21
                    r9 = 6
                    r4.<init>(r5, r6, r7, r8, r9)
                    r5.runOnUiThread(r4)
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    org.json.JSONObject r0 = X.C1504590pFx.LIZJ(r0)
                    return r0
                L5d:
                    X.0mQN r0 = r2.LIZJ
                    if (r0 != 0) goto L67
                    X.07bh r6 = new X.07bh
                    r6.<init>()
                    goto L4a
                L67:
                    java.lang.Class<com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService> r9 = com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService.class
                    r10 = 0
                    r13 = 14
                    r11 = r10
                    r12 = r10
                    java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
                    com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService r3 = (com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService) r3
                    if (r3 == 0) goto Lb7
                    if (r1 == 0) goto Lb5
                    java.lang.String r4 = r1.clientKey
                L7a:
                    java.lang.String r2 = r0.getScene()
                    boolean r4 = r3.LIZJ(r4, r2)
                    r2 = 1
                    if (r4 != r2) goto Lb7
                    X.1AyC r15 = X.C2196701AyC.LIZ
                    r15.getClass()
                    X.0wwJ r4 = r0.getRewardMissionType()
                    X.0wze r17 = X.C2196701AyC.LJJIIJ(r4)
                    if (r17 == 0) goto L9f
                    java.lang.String r16 = "tm_win_reward_edu_result"
                    java.lang.Boolean r18 = java.lang.Boolean.TRUE
                    r19 = 0
                    r20 = 8
                    X.C2196701AyC.LJJIII(r15, r16, r17, r18, r19, r20)
                L9f:
                    X.07bh r6 = new X.07bh
                    if (r2 == 0) goto Lb1
                    if (r3 == 0) goto Lb1
                    if (r1 == 0) goto La9
                    java.lang.String r14 = r1.clientKey
                La9:
                    java.lang.String r0 = r0.getScene()
                    java.lang.String r14 = r3.LJFF(r14, r0)
                Lb1:
                    r6.<init>(r2, r14)
                    goto L4a
                Lb5:
                    r4 = r14
                    goto L7a
                Lb7:
                    r2 = 0
                    goto L9f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1395690mQJ.LIZLLL(java.lang.Number, org.json.JSONObject):org.json.JSONObject");
            }

            {
                super(interfaceC1177504j7);
                this.LIZJ = weakReference;
                this.LIZLLL = z;
                this.LJ = function02;
            }
        };
        r29.LJI("minis.reportMissionRewardGranted", new AwS635S0100000_21((C1395690mQJ) r29, 190), r29);
        C1389450mGF c1389450mGF = new C1389450mGF(weakReference, interfaceC1177504j7, z);
        c1389450mGF.LJI("minis.addShortcut", new AwS635S0100000_21(c1389450mGF, 188), c1389450mGF);
        C1801770wzH c1801770wzH = new C1801770wzH(weakReference, interfaceC1177504j7, z);
        c1801770wzH.LJI("minis.startEntranceMission", new AwS641S0100000_27(c1801770wzH, 153), c1801770wzH);
        C1385550m9x c1385550m9x = new C1385550m9x(weakReference, interfaceC1177504j7);
        c1385550m9x.LJI("minis.sendLog", new AwS635S0100000_21(c1385550m9x, 184), c1385550m9x);
        ?? r210 = new C1504590pFx(interfaceC1177504j7) { // from class: X.1Ave
        };
        r210.LJI("minis.getABSettings", new AwS623S0100000_9((C2195121Ave) r210, 167), null);
        C1801060wy8 c1801060wy8 = new C1801060wy8(weakReference, interfaceC1177504j7);
        c1801060wy8.LJI("minis.updateNotificationSubscriptionState", new AwS641S0100000_27(c1801060wy8, 89), c1801060wy8);
        ?? r211 = new C1504590pFx(interfaceC1177504j7, function0) { // from class: X.0m9y
            public final Function0<Unit> LIZJ;

            {
                this.LIZJ = function0;
            }

            @Override // X.C1504590pFx
            public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                super.LIZLLL(number, jSONObject);
                if (jSONObject != null && jSONObject.optInt("sceneId", -1) == 9999) {
                    Function0<Unit> function03 = this.LIZJ;
                    if (function03 != null) {
                        function03.invoke();
                    }
                    LJFF(number, new JSONObject());
                    return C1504590pFx.LIZJ(new JSONObject());
                }
                LJ(number, new JSONObject());
                return C1504590pFx.LIZ(-1, null, "sceneId is not support", new JSONObject());
            }
        };
        r211.LJI("minis.reportScene", new AwS635S0100000_21((C1385560m9y) r211, 192), r211);
        if (MinisPerfConfigSettings.LIZ().enableNativeUIJsb) {
            C1391380mJM c1391380mJM = new C1391380mJM(weakReference, interfaceC1177504j7, z);
            c1391380mJM.LJI("minis.showModal", new AwS635S0100000_21(c1391380mJM, 140), c1391380mJM);
            ?? r212 = new C1504590pFx(weakReference, interfaceC1177504j7, z) { // from class: X.0mGb
                public static final Set<String> LJ = C13LQ.LJLIIL(new String[]{"success", "error", "loading", "none"});
                public final WeakReference<Activity> LIZJ;
                public final boolean LIZLLL;

                @Override // X.C1504590pFx
                public final JSONObject LIZLLL(final Number number, JSONObject jSONObject) throws JSONException {
                    boolean z2;
                    super.LIZLLL(number, jSONObject);
                    if (this.LIZLLL) {
                        return C1385490m9r.LIZ(this, number);
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String strOptString = jSONObject.optString("title", "");
                    final String strOptString2 = jSONObject.optString("icon", "success");
                    final int iOptInt = jSONObject.optInt("duration", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                    if (strOptString.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error_code", 1);
                        jSONObject2.put("error_msg", "title is required");
                        LJ(number, jSONObject2);
                        return C1504590pFx.LIZ(1, null, "title is required", new JSONObject());
                    }
                    if (!LJ.contains(strOptString2)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("error_code", 1);
                        jSONObject3.put("error_msg", "invalid icon value");
                        LJ(number, jSONObject3);
                        return C1504590pFx.LIZ(1, null, "invalid icon value", new JSONObject());
                    }
                    final Activity activity = this.LIZJ.get();
                    if (activity == null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("error_code", 2);
                        jSONObject4.put("error_msg", "activity is null");
                        LJ(number, jSONObject4);
                        return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                    }
                    if (Intrinsics.LJFF(C1056730dbb.LIZ.getAndSet("toast"), "loading")) {
                        activity.runOnUiThread(new Runnable() { // from class: X.0dbc
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ShowToastMethodNative@e23d.handle$4");
                                try {
                                    C1056730dbb.LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ShowToastMethodNative@e23d.handle$4");
                            }
                        });
                    }
                    activity.runOnUiThread(new Runnable() { // from class: X.0dba
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        public final void LIZ() throws JSONException {
                            try {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJIIJ(strOptString);
                                c1389890mGx.LIZLLL(iOptInt);
                                String str = strOptString2;
                                if (str != null) {
                                    switch (str.hashCode()) {
                                        case -1867169789:
                                            if (str.equals("success")) {
                                                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                                                c1389890mGx.LJII(R.attr.a0i);
                                            }
                                            break;
                                        case 3387192:
                                            str.equals("none");
                                            break;
                                        case 96784904:
                                            if (str.equals("error")) {
                                                c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
                                                c1389890mGx.LJII(R.attr.a16);
                                            }
                                            break;
                                        case 336650556:
                                            if (str.equals("loading")) {
                                                c1389890mGx.LJFF(R.raw.icon_spinner_normal);
                                            }
                                            break;
                                    }
                                }
                                c1389890mGx.LJIIJJI();
                                LJFF(number, new JSONObject());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1056730dbb.LIZIZ("toast");
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("error_code", 2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("show toast failed: ");
                                sbLIZ.append(e.getMessage());
                                jSONObject5.put("error_msg", C2188811AlT.LIZIZ(sbLIZ));
                                LJ(number, jSONObject5);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ShowToastMethodNative@e23d.handle$5");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ShowToastMethodNative@e23d.handle$5");
                        }
                    });
                    return C1504590pFx.LIZJ(new JSONObject());
                }

                {
                    super(interfaceC1177504j7);
                    this.LIZJ = weakReference;
                    this.LIZLLL = z;
                }
            };
            r212.LJI("minis.showToast", new AwS635S0100000_21((C1389670mGb) r212, 141), r212);
            ?? r213 = new C1504590pFx(weakReference, interfaceC1177504j7, z) { // from class: X.0m9q
                public final WeakReference<Activity> LIZJ;
                public final boolean LIZLLL;

                @Override // X.C1504590pFx
                public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                    super.LIZLLL(number, jSONObject);
                    if (this.LIZLLL) {
                        return C1385490m9r.LIZ(this, number);
                    }
                    Activity activity = this.LIZJ.get();
                    if (activity == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error_code", 2);
                        jSONObject2.put("error_msg", "activity is null");
                        LJ(number, jSONObject2);
                        return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                    }
                    activity.runOnUiThread(new ARunnableS85S0200000_16(this, number, 42));
                    return C1504590pFx.LIZJ(new JSONObject());
                }

                {
                    super(interfaceC1177504j7);
                    this.LIZJ = weakReference;
                    this.LIZLLL = z;
                }
            };
            r213.LJI("minis.hideToast", new AwS635S0100000_21((C1385480m9q) r213, 137), r213);
            ?? r214 = new C1504590pFx(weakReference, interfaceC1177504j7, z) { // from class: X.0mGd
                public final WeakReference<Activity> LIZJ;
                public final boolean LIZLLL;

                @Override // X.C1504590pFx
                public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                    super.LIZLLL(number, jSONObject);
                    if (this.LIZLLL) {
                        return C1385490m9r.LIZ(this, number);
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    String strOptString = jSONObject.optString("title", "");
                    boolean zOptBoolean = jSONObject.optBoolean("mask", false);
                    Activity activity = this.LIZJ.get();
                    if (activity == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error_code", 2);
                        jSONObject2.put("error_msg", "activity is null");
                        LJ(number, jSONObject2);
                        return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                    }
                    if (Intrinsics.LJFF(C1056730dbb.LIZ.getAndSet("loading"), "toast")) {
                        activity.runOnUiThread(new Runnable() { // from class: X.0dea
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ShowLoadingMethodNative@70b0.handle$2");
                                try {
                                    try {
                                        C1378370lyN.LIZ.getClass();
                                        C1378370lyN.LIZ();
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ShowLoadingMethodNative@70b0.handle$2");
                            }
                        });
                    }
                    activity.runOnUiThread(new ARunnableS1S1310000_16(activity, this, number, strOptString, zOptBoolean, 1));
                    return C1504590pFx.LIZJ(new JSONObject());
                }

                {
                    super(interfaceC1177504j7);
                    this.LIZJ = weakReference;
                    this.LIZLLL = z;
                }
            };
            r214.LJI("minis.showLoading", new AwS635S0100000_21((C1389690mGd) r214, 139), r214);
            ?? r215 = new C1504590pFx(weakReference, interfaceC1177504j7, z) { // from class: X.0m9p
                public final WeakReference<Activity> LIZJ;
                public final boolean LIZLLL;

                @Override // X.C1504590pFx
                public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                    super.LIZLLL(number, jSONObject);
                    if (this.LIZLLL) {
                        return C1385490m9r.LIZ(this, number);
                    }
                    Activity activity = this.LIZJ.get();
                    if (activity == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error_code", 2);
                        jSONObject2.put("error_msg", "activity is null");
                        LJ(number, jSONObject2);
                        return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                    }
                    activity.runOnUiThread(new ARunnableS85S0200000_16(this, number, 41));
                    return C1504590pFx.LIZJ(new JSONObject());
                }

                {
                    super(interfaceC1177504j7);
                    this.LIZJ = weakReference;
                    this.LIZLLL = z;
                }
            };
            r215.LJI("minis.hideLoading", new AwS635S0100000_21((C1385470m9p) r215, 136), r215);
            ?? r216 = new C1504590pFx(weakReference, interfaceC1177504j7, z) { // from class: X.0mGe
                public final WeakReference<Activity> LIZJ;
                public final boolean LIZLLL;

                @Override // X.C1504590pFx
                public final JSONObject LIZLLL(Number number, JSONObject jSONObject) throws JSONException {
                    super.LIZLLL(number, jSONObject);
                    if (this.LIZLLL) {
                        return C1385490m9r.LIZ(this, number);
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("itemList");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                        if (jSONArrayOptJSONArray.length() > 6) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("error_code", 1);
                            jSONObject2.put("error_msg", "itemList cannot exceed 6 items");
                            LJ(number, jSONObject2);
                            return C1504590pFx.LIZ(1, null, "itemList cannot exceed 6 items", new JSONObject());
                        }
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            arrayList.add(jSONArrayOptJSONArray.optString(i3, ""));
                        }
                        Activity activity = this.LIZJ.get();
                        if (activity == null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("error_code", 2);
                            jSONObject3.put("error_msg", "activity is null");
                            LJ(number, jSONObject3);
                            return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS6S1400000_16(arrayList, this, C1056730dbb.LIZ.getAndSet("actionSheet"), activity, number, 1));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("error_code", 1);
                    jSONObject4.put("error_msg", "itemList is required and cannot be empty");
                    LJ(number, jSONObject4);
                    return C1504590pFx.LIZ(1, null, "itemList is required and cannot be empty", new JSONObject());
                }

                {
                    super(interfaceC1177504j7);
                    this.LIZJ = weakReference;
                    this.LIZLLL = z;
                }
            };
            r216.LJI("minis.showActionSheet", new AwS635S0100000_21((C1389700mGe) r216, 138), r216);
            if (weakReference3 != null) {
                ?? r217 = new C1504590pFx(weakReference3, interfaceC1177504j7) { // from class: X.0mCZ
                    public final WeakReference<MiniGameFragment> LIZJ;

                    {
                        super(interfaceC1177504j7);
                        this.LIZJ = weakReference3;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(final Number number, JSONObject jSONObject) throws JSONException {
                        super.LIZLLL(number, jSONObject);
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        final boolean zOptBoolean = jSONObject.optBoolean("exitDirectly", true);
                        final MiniGameFragment miniGameFragment = this.LIZJ.get();
                        if (miniGameFragment == null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("error_code", 2);
                            jSONObject2.put("error_msg", "fragment is null");
                            LJ(number, jSONObject2);
                            return C1504590pFx.LIZ(2, null, "fragment is null", new JSONObject());
                        }
                        final C19EG activity = miniGameFragment.getActivity();
                        if (activity == null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("error_code", 2);
                            jSONObject3.put("error_msg", "activity is null");
                            LJ(number, jSONObject3);
                            return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new Runnable() { // from class: X.0mCa
                            public final void LIZ() throws JSONException {
                                try {
                                    if (zOptBoolean) {
                                        MiniGameFragment miniGameFragment2 = miniGameFragment;
                                        EnumC2196901AyW enumC2196901AyW = EnumC2196901AyW.BACKPRESS;
                                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MinisFragment.LLLLLLJ;
                                        miniGameFragment2.SR(enumC2196901AyW, false);
                                        LJFF(number, new JSONObject());
                                        return;
                                    }
                                    final C013C c013c = new C013C();
                                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                                    c1397580mTM.LJI("Notice");
                                    c1397580mTM.LIZIZ("Are you sure you want to exit?");
                                    C985403tE.LIZ(c1397580mTM, new AwS117S0400000_21(this, miniGameFragment, number, c013c, 0));
                                    Dialog dialogLJ = new C1397510mTF(c1397580mTM).LJ();
                                    final C1387170mCZ c1387170mCZ = this;
                                    final Number number2 = number;
                                    dialogLJ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: X.0mCb
                                        @Override // android.content.DialogInterface.OnCancelListener
                                        public final void onCancel(DialogInterface dialogInterface) throws JSONException {
                                            C013C c013c2 = c013c;
                                            if (!c013c2.element) {
                                                c013c2.element = true;
                                                JSONObject jSONObject4 = new JSONObject();
                                                jSONObject4.put("error_code", 3);
                                                jSONObject4.put("error_msg", "user cancel");
                                                LJ(number2, jSONObject4);
                                            }
                                        }
                                    });
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("error_code", 2);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("exit mini program failed: ");
                                    sbLIZ.append(e.getMessage());
                                    jSONObject4.put("error_msg", C2188811AlT.LIZIZ(sbLIZ));
                                    LJ(number, jSONObject4);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ExitMiniProgramMethodNative@3587.handle$3");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ExitMiniProgramMethodNative@3587.handle$3");
                            }
                        });
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r217.LJI("minis.exitMiniProgram", new AwS635S0100000_21((C1387170mCZ) r217, 4), r217);
                ?? r218 = new C1504590pFx(weakReference3, interfaceC1177504j7) { // from class: X.0mCY
                    public final WeakReference<MiniGameFragment> LIZJ;

                    {
                        super(interfaceC1177504j7);
                        this.LIZJ = weakReference3;
                    }

                    @Override // X.C1504590pFx
                    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
                        super.LIZLLL(number, jSONObject);
                        MiniGameFragment miniGameFragment = this.LIZJ.get();
                        if (miniGameFragment == null) {
                            return C1504590pFx.LIZ(2, null, "fragment is null", new JSONObject());
                        }
                        C19EG activity = miniGameFragment.getActivity();
                        if (activity == null) {
                            return C1504590pFx.LIZ(2, null, "activity is null", new JSONObject());
                        }
                        activity.runOnUiThread(new ARunnableS54S0300000_21(this, miniGameFragment, number, 1));
                        return C1504590pFx.LIZJ(new JSONObject());
                    }
                };
                r218.LJI("minis.restartMiniProgramSync", new AwS635S0100000_21((C1387160mCY) r218, 5), r218);
            }
        }
    }
}
