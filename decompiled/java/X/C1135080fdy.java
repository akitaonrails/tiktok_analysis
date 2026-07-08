package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftByteVC1OptResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCropTranscodeResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDegradation264ResourceSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135080fdy implements InterfaceC1138800fjy {
    public static final boolean LIZ;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    static {
        /*
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoDynaPerfScoreOptSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoDynaPerfScoreOptSetting.INSTANCE
            boolean r0 = r0.isEnable()
            java.lang.String r2 = "AssetsDownloadPolicyFactory"
            r3 = 0
            if (r0 == 0) goto L55
            int r0 = com.bytedance.android.livesdk.livesetting.gift.LiveDynamicPerformanceDegradationSetting.getValue()
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L19
            int r0 = com.bytedance.android.livesdk.livesetting.gift.LiveDynamicPerformanceDegradationSetting.getValue()
            if (r0 != r4) goto L55
        L19:
            X.0pOl r0 = com.ss.ugc.clientai.core.api.FeatureServiceManager.Companion
            r0.getClass()
            com.ss.ugc.clientai.core.api.FeatureServiceManager r1 = X.C1510050pOl.LIZ()
            java.lang.String r0 = "f_client_ai"
            r7 = 0
            com.ss.ugc.clientai.core.api.FeatureProducer r5 = com.ss.ugc.clientai.core.api.FeatureServiceManager.getProducer$default(r1, r0, r3, r5, r7)
            if (r5 == 0) goto L61
            java.lang.String r6 = "dynamic_perf_stable_score"
            java.lang.String r8 = "live_gift_video_downgrade"
            r10 = 10
            r9 = r7
            r11 = r7
            java.lang.Object r0 = com.ss.ugc.clientai.core.api.FeatureProducer.getFeature$default(r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L61
            int r0 = r1.length()
            if (r0 == 0) goto L61
            float r1 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r1)     // Catch: java.lang.Exception -> L50
            r0 = 1112539136(0x42500000, float:52.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L61
            goto L5b
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L61
        L55:
            java.lang.String r0 = "enableDynamicPerformanceDegradation second = false"
            X.C20441214yg.LIZIZ(r2, r0)
            goto L73
        L5b:
            int r0 = com.bytedance.android.livesdk.livesetting.gift.LiveDynamicPerformanceDegradationSetting.getValue()
            if (r0 != r4) goto L62
        L61:
            r3 = 1
        L62:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "enableDynamicPerformanceDegradation = "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C20441214yg.LIZIZ(r2, r0)
        L73:
            X.C1135080fdy.LIZ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135080fdy.<clinit>():void");
    }

    @Override // X.InterfaceC1138800fjy
    public final AbstractC1138650fjj LIZ() {
        boolean value = LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue();
        boolean z = LiveGiftDegradation264ResourceSetting.INSTANCE.enableDegradation264() || LIZ;
        LiveGiftCropTranscodeResourceSetting liveGiftCropTranscodeResourceSetting = LiveGiftCropTranscodeResourceSetting.INSTANCE;
        boolean zShouldCrop = liveGiftCropTranscodeResourceSetting.shouldCrop();
        boolean zShouldTranscode = liveGiftCropTranscodeResourceSetting.shouldTranscode();
        boolean zShouldCropTranscode = liveGiftCropTranscodeResourceSetting.shouldCropTranscode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createAssetsManagerSupport, byteVc1OptEnable=");
        sbLIZ.append(value);
        sbLIZ.append(", degradation264Enable=");
        sbLIZ.append(z);
        sbLIZ.append(", shouldCrop=");
        sbLIZ.append(zShouldCrop);
        sbLIZ.append(", shouldTranscode=");
        sbLIZ.append(zShouldTranscode);
        sbLIZ.append(", shouldCropTranscode=");
        sbLIZ.append(zShouldCropTranscode);
        C20441214yg.LJIIIZ("AssetsDownloadPolicyFactory", C2188811AlT.LIZIZ(sbLIZ));
        return zShouldCrop ? new AbstractC1138650fjj() { // from class: X.0fjl
            public static final C01GW<String> LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(218));

            @Override // X.InterfaceC1138810fjz
            public final boolean LIZIZ(AssetsModel assetsModel, Integer num) {
                List listSingletonList;
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, 0, num);
                if (c1139230fkfLJI != null) {
                    listSingletonList = Collections.singletonList(c1139230fkfLJI);
                } else {
                    C1139230fkf c1139230fkfLJ = AbstractC1138650fjj.LJ(0, assetsModel);
                    if (c1139230fkfLJ != null) {
                        listSingletonList = Collections.singletonList(c1139230fkfLJ);
                    } else {
                        C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(0, assetsModel);
                        if (c1139230fkfLIZJ != null) {
                            listSingletonList = Collections.singletonList(c1139230fkfLIZJ);
                        } else {
                            C1139230fkf c1139230fkfLJII = AbstractC1138650fjj.LJII(0, assetsModel);
                            if (c1139230fkfLJII != null) {
                                listSingletonList = Collections.singletonList(c1139230fkfLJII);
                            } else {
                                listSingletonList = C13BV.INSTANCE;
                            }
                        }
                    }
                }
                Iterator it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    if (C1142700fqG.LJFF().LJI((C1139230fkf) it2.next())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1138810fjz
            public final C1139230fkf LIZ(AssetsModel assetsModel, int i, Integer num) {
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, i, num);
                if (c1139230fkfLJI != null) {
                    return c1139230fkfLJI;
                }
                C1139230fkf c1139230fkfLJ = AbstractC1138650fjj.LJ(i, assetsModel);
                if (c1139230fkfLJ != null) {
                    return c1139230fkfLJ;
                }
                C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(i, assetsModel);
                if (c1139230fkfLIZJ != null) {
                    return c1139230fkfLIZJ;
                }
                return AbstractC1138650fjj.LJII(i, assetsModel);
            }
        } : zShouldTranscode ? new AbstractC1138650fjj() { // from class: X.0fjk
            public static final C01GW<String> LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(220));

            /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
            @Override // X.InterfaceC1138810fjz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZIZ(com.bytedance.android.livesdk.gift.assets.AssetsModel r5, java.lang.Integer r6) {
                /*
                    r4 = this;
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r3 = 0
                    X.0fkf r0 = X.AbstractC1138650fjj.LJI(r5, r3, r6)
                    if (r0 == 0) goto L2d
                    r1.add(r0)
                Lf:
                    X.13BV r0 = X.C13BV.INSTANCE
                L11:
                    java.util.Iterator r2 = r0.iterator()
                L15:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L4e
                    java.lang.Object r1 = r2.next()
                    X.0fkf r1 = (X.C1139230fkf) r1
                    X.0fqG r0 = X.C1142700fqG.LJFF()
                    boolean r0 = r0.LJI(r1)
                    if (r0 == 0) goto L15
                    r0 = 1
                    return r0
                L2d:
                    X.0fkf r0 = X.AbstractC1138650fjj.LJIIIIZZ(r3, r5)
                    if (r0 == 0) goto L38
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    goto L11
                L38:
                    X.0fkf r0 = X.AbstractC1138650fjj.LIZJ(r3, r5)
                    if (r0 == 0) goto L43
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    goto L11
                L43:
                    X.0fkf r0 = X.AbstractC1138650fjj.LJII(r3, r5)
                    if (r0 == 0) goto Lf
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    goto L11
                L4e:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1138660fjk.LIZIZ(com.bytedance.android.livesdk.gift.assets.AssetsModel, java.lang.Integer):boolean");
            }

            @Override // X.InterfaceC1138810fjz
            public final C1139230fkf LIZ(AssetsModel assetsModel, int i, Integer num) {
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, i, num);
                if (c1139230fkfLJI != null) {
                    return c1139230fkfLJI;
                }
                C1139230fkf c1139230fkfLJIIIIZZ = AbstractC1138650fjj.LJIIIIZZ(i, assetsModel);
                if (c1139230fkfLJIIIIZZ != null) {
                    return c1139230fkfLJIIIIZZ;
                }
                C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(i, assetsModel);
                if (c1139230fkfLIZJ != null) {
                    return c1139230fkfLIZJ;
                }
                return AbstractC1138650fjj.LJII(i, assetsModel);
            }
        } : zShouldCropTranscode ? new AbstractC1138650fjj() { // from class: X.0fjm
            public static final C01GW<String> LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(221));

            @Override // X.InterfaceC1138810fjz
            public final boolean LIZIZ(AssetsModel assetsModel, Integer num) {
                List listSingletonList;
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, 0, num);
                if (c1139230fkfLJI != null) {
                    listSingletonList = Collections.singletonList(c1139230fkfLJI);
                } else {
                    C1139230fkf c1139230fkfLJIIIZ = AbstractC1138650fjj.LJIIIZ(0, assetsModel);
                    if (c1139230fkfLJIIIZ != null) {
                        listSingletonList = Collections.singletonList(c1139230fkfLJIIIZ);
                    } else {
                        C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(0, assetsModel);
                        if (c1139230fkfLIZJ != null) {
                            listSingletonList = Collections.singletonList(c1139230fkfLIZJ);
                        } else {
                            C1139230fkf c1139230fkfLJII = AbstractC1138650fjj.LJII(0, assetsModel);
                            if (c1139230fkfLJII != null) {
                                listSingletonList = Collections.singletonList(c1139230fkfLJII);
                            } else {
                                listSingletonList = C13BV.INSTANCE;
                            }
                        }
                    }
                }
                Iterator it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    if (C1142700fqG.LJFF().LJI((C1139230fkf) it2.next())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1138810fjz
            public final C1139230fkf LIZ(AssetsModel assetsModel, int i, Integer num) {
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, i, num);
                if (c1139230fkfLJI != null) {
                    return c1139230fkfLJI;
                }
                C1139230fkf c1139230fkfLJIIIZ = AbstractC1138650fjj.LJIIIZ(i, assetsModel);
                if (c1139230fkfLJIIIZ != null) {
                    return c1139230fkfLJIIIZ;
                }
                C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(i, assetsModel);
                if (c1139230fkfLIZJ != null) {
                    return c1139230fkfLIZJ;
                }
                return AbstractC1138650fjj.LJII(i, assetsModel);
            }
        } : z ? new AbstractC1138650fjj() { // from class: X.0fjq
            public static final C01GW<String> LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(219));

            @Override // X.InterfaceC1138810fjz
            public final boolean LIZIZ(AssetsModel assetsModel, Integer num) {
                ArrayList arrayList = new ArrayList();
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, 0, num);
                if (c1139230fkfLJI != null) {
                    arrayList.add(c1139230fkfLJI);
                } else {
                    C1139230fkf c1139230fkfLJFF = AbstractC1138650fjj.LJFF(0, assetsModel);
                    if (c1139230fkfLJFF != null) {
                        arrayList.add(c1139230fkfLJFF);
                    }
                    C1139230fkf c1139230fkfLJII = AbstractC1138650fjj.LJII(0, assetsModel);
                    if (c1139230fkfLJII != null) {
                        arrayList.add(c1139230fkfLJII);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (C1142700fqG.LJFF().LJI((C1139230fkf) it2.next())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1138810fjz
            public final C1139230fkf LIZ(AssetsModel assetsModel, int i, Integer num) {
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, i, num);
                if (c1139230fkfLJI != null) {
                    return c1139230fkfLJI;
                }
                C1139230fkf c1139230fkfLJFF = AbstractC1138650fjj.LJFF(i, assetsModel);
                if (c1139230fkfLJFF != null) {
                    return c1139230fkfLJFF;
                }
                return AbstractC1138650fjj.LJII(i, assetsModel);
            }
        } : value ? new AbstractC1138650fjj() { // from class: X.0fjo
            public final C01GW LIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 447));

            @Override // X.InterfaceC1138810fjz
            public final boolean LIZIZ(AssetsModel assetsModel, Integer num) {
                ArrayList arrayList = new ArrayList();
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, 0, num);
                if (c1139230fkfLJI != null) {
                    arrayList.add(c1139230fkfLJI);
                } else {
                    C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(0, assetsModel);
                    if (c1139230fkfLIZJ != null) {
                        arrayList.add(c1139230fkfLIZJ);
                    }
                    C1139230fkf c1139230fkfLIZLLL = AbstractC1138650fjj.LIZLLL(0, assetsModel);
                    if (c1139230fkfLIZLLL != null) {
                        arrayList.add(c1139230fkfLIZLLL);
                    }
                    C1139230fkf c1139230fkfLJII = AbstractC1138650fjj.LJII(0, assetsModel);
                    if (c1139230fkfLJII != null) {
                        arrayList.add(c1139230fkfLJII);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (C1142700fqG.LJFF().LJI((C1139230fkf) it2.next())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1138810fjz
            public final C1139230fkf LIZ(AssetsModel assetsModel, int i, Integer num) {
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, i, num);
                if (C1142700fqG.LJFF().LJI(c1139230fkfLJI)) {
                    return c1139230fkfLJI;
                }
                C1139230fkf c1139230fkfLJII = AbstractC1138650fjj.LJII(i, assetsModel);
                if (C1142700fqG.LJFF().LJI(c1139230fkfLJII)) {
                    return c1139230fkfLJII;
                }
                C1139230fkf c1139230fkfLIZLLL = AbstractC1138650fjj.LIZLLL(i, assetsModel);
                if (C1142700fqG.LJFF().LJI(c1139230fkfLIZLLL)) {
                    return c1139230fkfLIZLLL;
                }
                C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(i, assetsModel);
                if (c1139230fkfLIZJ != null) {
                    return c1139230fkfLIZJ;
                }
                return c1139230fkfLJII;
            }
        } : new AbstractC1138650fjj() { // from class: X.0fjp
            public final C01GW LIZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 448));

            @Override // X.InterfaceC1138810fjz
            public final boolean LIZIZ(AssetsModel assetsModel, Integer num) {
                ArrayList arrayList = new ArrayList();
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, 0, num);
                if (c1139230fkfLJI != null) {
                    arrayList.add(c1139230fkfLJI);
                } else {
                    C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(0, assetsModel);
                    if (c1139230fkfLIZJ != null) {
                        arrayList.add(c1139230fkfLIZJ);
                    }
                    C1139230fkf c1139230fkfLIZLLL = AbstractC1138650fjj.LIZLLL(0, assetsModel);
                    if (c1139230fkfLIZLLL != null) {
                        arrayList.add(c1139230fkfLIZLLL);
                    }
                    C1139230fkf c1139230fkfLJII = AbstractC1138650fjj.LJII(0, assetsModel);
                    if (c1139230fkfLJII != null) {
                        arrayList.add(c1139230fkfLJII);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (C1142700fqG.LJFF().LJI((C1139230fkf) it2.next())) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1138810fjz
            public final C1139230fkf LIZ(AssetsModel assetsModel, int i, Integer num) {
                C1139230fkf c1139230fkfLJI = AbstractC1138650fjj.LJI(assetsModel, i, num);
                if (C1142700fqG.LJFF().LJI(c1139230fkfLJI)) {
                    return c1139230fkfLJI;
                }
                C1139230fkf c1139230fkfLIZLLL = AbstractC1138650fjj.LIZLLL(i, assetsModel);
                if (C1142700fqG.LJFF().LJI(c1139230fkfLIZLLL)) {
                    return c1139230fkfLIZLLL;
                }
                C1139230fkf c1139230fkfLIZJ = AbstractC1138650fjj.LIZJ(i, assetsModel);
                if (C1142700fqG.LJFF().LJI(c1139230fkfLIZJ)) {
                    return c1139230fkfLIZJ;
                }
                return AbstractC1138650fjj.LJII(i, assetsModel);
            }
        };
    }

    @Override // X.InterfaceC1138800fjy
    public final boolean LIZIZ() {
        return LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC1138800fjy
    public final List<String> LIZJ() {
        return (LiveGiftDegradation264ResourceSetting.INSTANCE.enableDegradation264() || LIZ) ? C1697810uHb.LJIIJJI("h264", "480p") : C1697810uHb.LJIIJJI("h264", "bytevc1opt", "480p", "480p_bvc1", "lowfps", "lowfps_bvc1", "crop_bvc1", "trantor_bvc1", "trantor_crop_bvc1");
    }
}
