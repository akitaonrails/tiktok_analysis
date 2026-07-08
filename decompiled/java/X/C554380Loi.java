package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.CacheQuota;
import com.ss.android.ugc.aweme.services.external.IAILiveServiceKt;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Loi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554380Loi {
    public static final /* synthetic */ int LJFF = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(339));
    public final Map<String, InterfaceC554410Lol> LIZIZ;
    public final C054G LIZJ;
    public final Map<String, C09AE> LIZLLL;
    public boolean LJ;

    public C554380Loi() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        this.LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LIZLLL = new LinkedHashMap();
        this.LJ = true;
        linkedHashMap.put(Source.EDIT_AI_LIVE_PHOTO.getSource(), new InterfaceC554410Lol() { // from class: X.0Lok
            public final String LIZ;
            public final int LIZIZ;
            public final Pair<String, String> LIZJ;
            public CacheQuota LIZLLL;

            {
                Object objFromJson;
                String source = Source.EDIT_AI_LIVE_PHOTO.getSource();
                this.LIZ = source;
                int iLIZ = C290650BaJ.LIZ();
                this.LIZIZ = iLIZ;
                this.LIZJ = new Pair<>("image2video", "camera_aigc");
                Keva keva = C554430Lon.LIZ;
                Integer numValueOf = Integer.valueOf(iLIZ);
                Keva keva2 = C554430Lon.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(source);
                sbLIZ.append((String) C554430Lon.LIZIZ.getValue());
                String string = keva2.getString(C2188811AlT.LIZIZ(sbLIZ), "");
                Gson gson = new Gson();
                if (string == null || string.length() == 0) {
                    objFromJson = null;
                } else {
                    try {
                        objFromJson = GsonProtectorUtils.fromJson(gson, string, (Class<Object>) CacheQuota.class);
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        objFromJson = null;
                    }
                }
                CacheQuota cacheQuota = (CacheQuota) objFromJson;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (cacheQuota != null) {
                        cacheQuota.setQuota(iIntValue);
                        cacheQuota.setFromLocal(true);
                        Keva keva3 = C554430Lon.LIZ;
                        cacheQuota.setQuotaRemain(Math.min(cacheQuota.quotaRemain, cacheQuota.quota));
                    }
                } else if (cacheQuota != null) {
                    cacheQuota.setFromLocal(true);
                    Keva keva32 = C554430Lon.LIZ;
                    cacheQuota.setQuotaRemain(Math.min(cacheQuota.quotaRemain, cacheQuota.quota));
                }
                this.LIZLLL = cacheQuota;
            }

            @Override // X.InterfaceC554410Lol
            public final int LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC554410Lol
            public final CacheQuota LIZLLL() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC554410Lol
            public final Pair<String, String> getBusiness() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC554410Lol
            public final boolean LIZ(RefreshQuotaScene refreshQuotaScene) {
                CacheQuota cacheQuota;
                List<String> list = C554420Lom.LIZ;
                List list2 = (List) C0C64.LJIILLIIL().LJJII(List.class, C554420Lom.LIZ, "studio_ai_alive_quota_refresh_scene", true);
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                if (!list2.contains(refreshQuotaScene.getScene())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", disable scene, ");
                    sbLIZ.append(refreshQuotaScene);
                    C201955140j.LIZIZ("AILiveQuotaImpl", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_quota_force_refresh", true) > 0 || IAILiveServiceKt.forceRefreshScene(refreshQuotaScene) || (cacheQuota = this.LIZLLL) == null || cacheQuota.isFromLocal()) {
                    return true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(", no need force refresh, ");
                sbLIZ2.append(refreshQuotaScene);
                C201955140j.LIZIZ("AILiveQuotaImpl", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }

            @Override // X.InterfaceC554410Lol
            public final void LIZJ(CacheQuota cacheQuota) {
                String json;
                this.LIZLLL = cacheQuota;
                Keva keva = C554430Lon.LIZ;
                String str = this.LIZ;
                cacheQuota.setQuotaRemain(Math.min(cacheQuota.quotaRemain, cacheQuota.quota));
                Keva keva2 = C554430Lon.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append((String) C554430Lon.LIZIZ.getValue());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    json = GsonProtectorUtils.toJson(new Gson(), cacheQuota);
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    json = null;
                }
                keva2.storeString(strLIZIZ, json);
            }
        });
    }

    public final InterfaceC554410Lol LIZLLL(String str) {
        return (InterfaceC554410Lol) C08L9.LIZ(this.LIZIZ, str, null);
    }

    public final boolean LJ(String str) {
        CacheQuota cacheQuotaLIZLLL;
        String curUserId;
        String str2;
        boolean z;
        AccountUserService accountUserServiceLJIIJ;
        InterfaceC554410Lol interfaceC554410LolLIZLLL = LIZLLL(str);
        if (interfaceC554410LolLIZLLL != null && (cacheQuotaLIZLLL = interfaceC554410LolLIZLLL.LIZLLL()) != null) {
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            } else {
                curUserId = "";
            }
            if ((C1533950q1J.LJ(curUserId) && !Intrinsics.LJFF(cacheQuotaLIZLLL.userId, curUserId)) || (str2 = cacheQuotaLIZLLL.cacheTime) == null) {
                return false;
            }
            C0M8O.LIZ.getClass();
            Date dateLIZ = C0M8O.LIZ();
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Date date = null;
            if (!z) {
                try {
                    date = C0M8O.LJFF.parse(str2);
                } catch (ParseException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (dateLIZ != null && date != null && C562340M3s.LIZJ(date, dateLIZ)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r12 = this;
            r4 = r13
            boolean r0 = r14 instanceof X.C554370Loh
            if (r0 == 0) goto L71
            r3 = r14
            X.0Loh r3 = (X.C554370Loh) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L13:
            java.lang.Object r2 = r3.LLILZ
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r6 = 1
            r11 = 0
            if (r0 == 0) goto L51
            if (r0 != r6) goto L78
            long r7 = r3.LLILLL
            java.lang.Object r5 = r3.LLILLJJLI
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r3.LL
            java.lang.String r4 = (java.lang.String) r4
            X.C155000ia.LIZIZ(r2)
        L2e:
            com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult r2 = (com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult) r2
            if (r2 == 0) goto L4f
            java.lang.Integer r9 = r2.errorCode
        L34:
            X.0Loo r0 = X.C554440Loo.LIZ
            if (r9 == 0) goto L39
            r6 = 0
        L39:
            if (r2 == 0) goto L4d
            java.lang.String r10 = r2.errorMsg
        L3d:
            r0.getClass()
            X.C554440Loo.LIZIZ(r4, r5, r6, r7, r9, r10, r11)
            if (r9 == 0) goto L77
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = r2.errorMsg
            r1.<init>(r9, r0)
            return r1
        L4d:
            r10 = r11
            goto L3d
        L4f:
            r9 = r11
            goto L34
        L51:
            X.C155000ia.LIZIZ(r2)
            long r7 = java.lang.System.currentTimeMillis()
            X.0Loo r0 = X.C554440Loo.LIZ
            r0.getClass()
            java.lang.String r5 = "Quota"
            X.C554440Loo.LIZJ(r4, r5, r11)
            r3.LL = r4
            r3.LLILLJJLI = r5
            r3.LLILLL = r7
            r3.LLILZLL = r6
            java.lang.Object r2 = r12.LIZJ(r4, r3)
            if (r2 != r1) goto L2e
            return r1
        L71:
            X.0Loh r3 = new X.0Loh
            r3.<init>(r12, r14)
            goto L13
        L77:
            return r11
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554380Loi.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C0LXX
            if (r0 == 0) goto La9
            r6 = r14
            X.0LXX r6 = (X.C0LXX) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La9
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            r7 = 0
            if (r0 == 0) goto L73
            if (r0 != r4) goto Lb0
            java.lang.Object r13 = r6.LL
            java.lang.String r13 = (java.lang.String) r13
            X.C155000ia.LIZIZ(r2)
        L27:
            com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult r2 = (com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult) r2
            if (r2 == 0) goto La4
            java.lang.Integer r1 = r2.quotaRemain
            java.lang.Integer r0 = r2.quota
            java.lang.Integer r9 = r2.errorCode
            java.lang.String r10 = r2.errorMsg
        L33:
            if (r1 == 0) goto L65
            if (r0 == 0) goto L65
            int r0 = r1.intValue()
            if (r0 > 0) goto L44
            r0 = 5
            java.lang.Integer r9 = X.C2286608xc.LJ(r0)
            java.lang.String r10 = "quota limit"
        L44:
            if (r2 == 0) goto L63
            java.lang.Integer r0 = r2.quotaRemain
            if (r0 == 0) goto L60
            java.lang.Integer r1 = r2.quota
            java.lang.Integer r0 = r2.quotaRemain
            r12.LIZ(r13, r1, r0)
        L51:
            java.lang.Integer r8 = r2.quota
            java.lang.Integer r7 = r2.quotaRemain
        L55:
            if (r10 != 0) goto L59
            java.lang.String r10 = ""
        L59:
            com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult r6 = new com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L60:
            if (r2 == 0) goto L63
            goto L51
        L63:
            r8 = r7
            goto L55
        L65:
            if (r9 != 0) goto L6e
            r0 = -47368(0xffffffffffff46f8, float:NaN)
            java.lang.Integer r9 = X.C2286608xc.LJ(r0)
        L6e:
            if (r10 != 0) goto L44
            java.lang.String r10 = "quota null"
            goto L44
        L73:
            X.C155000ia.LIZIZ(r2)
            X.0Lol r0 = r12.LIZLLL(r13)
            if (r0 == 0) goto Lb8
            kotlin.Pair r3 = r0.getBusiness()
            if (r3 == 0) goto Lb8
            X.01GW r0 = r12.LIZ
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = (com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager) r2
            if (r2 == 0) goto La3
            java.lang.Object r1 = r3.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r3.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r6.LL = r13
            r6.LLILZ = r4
            java.lang.Object r2 = r2.LJIIZILJ(r7, r1, r0, r6)
            if (r2 != r5) goto L27
            return r5
        La3:
            r2 = r7
        La4:
            r1 = r7
            r0 = r7
            r9 = r7
            r10 = r7
            goto L33
        La9:
            X.0LXX r6 = new X.0LXX
            r6.<init>(r12, r14)
            goto L12
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C554380Loi.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJFF(String str, RefreshQuotaScene refreshQuotaScene) {
        Boolean boolValueOf;
        CacheQuota cacheQuotaLIZLLL;
        int i;
        C09AE c09ae;
        if (str.length() != 0 && LIZLLL(str) != null) {
            Map<String, C09AE> map = this.LIZLLL;
            if (map != null && (c09ae = (C09AE) C08L9.LIZ(map, str, null)) != null && c09ae.isActive()) {
                return;
            }
            InterfaceC554410Lol interfaceC554410LolLIZLLL = LIZLLL(str);
            if (interfaceC554410LolLIZLLL != null) {
                boolValueOf = Boolean.valueOf(interfaceC554410LolLIZLLL.LIZ(refreshQuotaScene));
            } else {
                boolValueOf = null;
            }
            InterfaceC554410Lol interfaceC554410LolLIZLLL2 = LIZLLL(str);
            if (interfaceC554410LolLIZLLL2 != null) {
                cacheQuotaLIZLLL = interfaceC554410LolLIZLLL2.LIZLLL();
            } else {
                cacheQuotaLIZLLL = null;
            }
            C554440Loo c554440Loo = C554440Loo.LIZ;
            String scene = refreshQuotaScene.getScene();
            int i2 = -1;
            if (cacheQuotaLIZLLL != null) {
                i = cacheQuotaLIZLLL.quotaRemain;
                i2 = cacheQuotaLIZLLL.quota;
            } else {
                i = -1;
            }
            Boolean bool = Boolean.TRUE;
            boolean zLJFF = Intrinsics.LJFF(boolValueOf, bool);
            c554440Loo.getClass();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("business", str);
            c543670LTx.LIZ.put(Scene.SCENE_SERVICE, scene);
            c543670LTx.LIZ.put("remain_cnt", Integer.valueOf(i));
            c543670LTx.LIZ.put("total_cnt", Integer.valueOf(i2));
            c543670LTx.LIZ.put("force_refresh", Integer.valueOf(zLJFF ? 1 : 0));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aigc_get_quota, ");
            sbLIZ.append(c543670LTx.LJ());
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZIZ("aigc_get_quota", c543670LTx.LJ());
            if (!Intrinsics.LJFF(boolValueOf, bool)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(", disable refreshQuotaCache, ");
                sbLIZ2.append(refreshQuotaScene);
                C201955140j.LIZIZ("AIGCQuotaManager", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZJ, null, null, new C0LXW(str, refreshQuotaScene, this, null), 3);
            Map<String, C09AE> map2 = this.LIZLLL;
            if (map2 == null) {
                return;
            }
            map2.put(str, anonymousClass0956LIZLLL);
        }
    }

    public final void LIZ(String str, Integer num, Integer num2) {
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        int iLIZIZ = 0;
        if (str.length() != 0 && num2 != null && LIZLLL(str) != null) {
            synchronized (this) {
                try {
                    if (num != null) {
                        iLIZIZ = num.intValue();
                    } else {
                        InterfaceC554410Lol interfaceC554410LolLIZLLL = LIZLLL(str);
                        if (interfaceC554410LolLIZLLL != null) {
                            iLIZIZ = interfaceC554410LolLIZLLL.LIZIZ();
                        }
                    }
                    int iIntValue = num2.intValue();
                    C0M8O.LIZ.getClass();
                    String strLIZLLL = C0M8O.LIZLLL();
                    IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                    if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                        curUserId = accountUserServiceLJIIJ.getCurUserId();
                    } else {
                        curUserId = "";
                    }
                    CacheQuota cacheQuota = new CacheQuota(iLIZIZ, iIntValue, strLIZLLL, curUserId, false);
                    InterfaceC554410Lol interfaceC554410LolLIZLLL2 = LIZLLL(str);
                    if (interfaceC554410LolLIZLLL2 != null) {
                        interfaceC554410LolLIZLLL2.LIZJ(cacheQuota);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(", cacheQuota: ");
                    sbLIZ.append(cacheQuota);
                    sbLIZ.append(", ");
                    C201955140j.LIZIZ("AIGCQuotaManager", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
