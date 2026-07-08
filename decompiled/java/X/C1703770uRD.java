package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import com.ss.android.ugc.aweme.setting.model.AuthAppInfoListResponse;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703770uRD extends C11SY {
    public final C1726230v1R LIZJ = new AbstractC1639260slA<LinkedHashMap<String, String>, AuthAppInfoListResponse>() { // from class: X.0v1R
        public final AuthListApi LIZ;

        {
            AuthListApi.LIZ.getClass();
            this.LIZ = C1726240v1S.LIZ();
        }

        @Override // X.C11T3
        public final C11NZ requestActual(Object obj) {
            Object obj2;
            LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
            Object obj3 = null;
            if (linkedHashMap.containsKey(Scene.SCENE_SERVICE) && this != null) {
                obj2 = linkedHashMap.get(Scene.SCENE_SERVICE);
            } else {
                obj2 = null;
            }
            if (linkedHashMap.containsKey("teen_sec_uid") && this != null) {
                obj3 = linkedHashMap.get("teen_sec_uid");
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestActual, scene:");
            String str = (String) obj2;
            sbLIZ.append(str);
            sbLIZ.append(", teenSecUid:");
            String str2 = (String) obj3;
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            return this.LIZ.LIZ(str, str2).LJL(C11S5.LIZ());
        }
    };
    public final C1726250v1T LIZLLL = new AbstractC1639260slA<LinkedHashMap<String, String>, BaseResponse>() { // from class: X.0v1T
        public final InterfaceC1726260v1U LIZ;

        {
            InterfaceC1726260v1U.LIZ.getClass();
            InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
            this.LIZ = (InterfaceC1726260v1U) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC1726260v1U.class) : null);
        }

        @Override // X.C11T3
        public final C11NZ requestActual(Object obj) {
            LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap) obj;
            try {
                JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(linkedHashMap));
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AuthAppDeleteFetcher, requestActual, req:");
                sbLIZ.append(jSONObject);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Intrinsics.LJFF(linkedHashMap.get("is_single_app_auth"), "true")) {
                linkedHashMap.remove("is_single_app_auth");
                return this.LIZ.LIZIZ(linkedHashMap).LJL(C11S5.LIZ());
            }
            return this.LIZ.LIZ(linkedHashMap).LJL(C11S5.LIZ());
        }
    };
    public AuthListApi LJ;

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1703480uQk
            if (r0 == 0) goto L5c
            r5 = r7
            X.0uQk r5 = (X.C1703480uQk) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L62
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.lang.Class<com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService> r0 = com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService.class
            r2 = 0
            java.lang.Object r0 = X.C04TD.LIZ(r0, r2)
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService r0 = (com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService) r0
        L3b:
            if (r0 == 0) goto L28
            r5.LLILLL = r3
            java.lang.Object r1 = r0.LIZ(r5)
            if (r1 != r4) goto L22
            return r4
        L46:
            com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl r0 = X.C04TD.LLD
            if (r0 != 0) goto L59
            java.lang.Class<com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService> r1 = com.ss.android.ugc.aweme.amazon.service.IAmazonCheckoutAdService.class
            monitor-enter(r1)
            com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl r0 = X.C04TD.LLD     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L58
            com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl r0 = new com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            X.C04TD.LLD = r0     // Catch: java.lang.Throwable -> L6a
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
        L59:
            com.ss.android.ugc.aweme.amazon.service.AmazonCheckoutAdServiceImpl r0 = X.C04TD.LLD
            goto L3b
        L5c:
            X.0uQk r5 = new X.0uQk
            r5.<init>(r6, r7)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1703770uRD.LJJIJIL(X.05Vn):java.lang.Object");
    }
}
