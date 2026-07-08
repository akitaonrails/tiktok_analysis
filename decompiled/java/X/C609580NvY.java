package X;

import X.C609580NvY;
import X.C609590NvZ;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS52S0310000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609580NvY {
    public static final C609580NvY LIZ = new C609580NvY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(271));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(280));

    public static boolean LJ() {
        LIZLLL(AFwS195S0000000_9.get$arr$(273));
        return (!C609600Nva.LIZ().tryInitPitayaBeforeProcess || PreHostSetupWatcher.INSTANCE.isPreHostSetup() || HostSetupWatcher.INSTANCE.isHostSetup()) ? false : true;
    }

    public static void LIZJ(Function0 function0) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("intelligent_popup", (String) function0.invoke());
    }

    public static void LIZLLL(Function0 function0) {
        int i = C2187451AjH.LIZ;
        function0.invoke();
    }

    public static void LIZIZ(C1917290zzb c1917290zzb, final AwS588S0100000_9 awS588S0100000_9) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", c1917290zzb.LIZLLL);
        jSONObject.put("popup_up_type", c1917290zzb.LIZ);
        PitayaCoreFactory.getCore((String) LIZIZ.getValue()).runTask("permission_trigger", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.notification.utils.IntelligentPopupHelper$doRunIntelligentPopupTask$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                C609580NvY c609580NvY = C609580NvY.LIZ;
                AwS52S0310000_9 awS52S0310000_9 = new AwS52S0310000_9(z, pTYError, pTYTaskData, pTYPackageInfo, 0);
                c609580NvY.getClass();
                C609580NvY.LIZJ(awS52S0310000_9);
                Function1<C609590NvZ, Unit> function1 = awS588S0100000_9;
                if (function1 != null) {
                    function1.invoke(new C609590NvZ(z, pTYError, pTYTaskData, pTYPackageInfo));
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(Context context, C1917290zzb c1917290zzb, Function1 function1) {
        InterfaceC497601wk interfaceC497601wkLIZ;
        LifecycleOwner lifecycleOwner;
        LIZLLL(new AwS553S0100000_9(c1917290zzb, 1367));
        if (!C609600Nva.LIZ().enable) {
            LIZLLL(AFwS195S0000000_9.get$arr$(274));
            function1.invoke(Boolean.TRUE);
            return;
        }
        if (context == 0 || !(context instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) context) == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C0NFG(c1917290zzb, function1, null), 2);
        LIZLLL(AFwS195S0000000_9.get$arr$(279));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:32:0x0081, B:34:0x0087, B:42:0x009c, B:46:0x00a3, B:50:0x00af, B:57:0x00c3), top: B:102:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1917290zzb r26, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609580NvY.LIZ(X.0zzb, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJFF(X.C609580NvY r4, X.C1917290zzb r5, boolean r6, java.lang.String r7, com.bytedance.pitaya.api.bean.PTYError r8, java.lang.String r9, kotlin.jvm.functions.Function1 r10, X.C592940NNk r11, int r12) throws java.lang.Throwable {
        /*
            r0 = r12 & 4
            if (r0 == 0) goto L6
            java.lang.String r7 = "backup_trigger"
        L6:
            r0 = r12 & 8
            r2 = 0
            if (r0 == 0) goto Lc
            r8 = r2
        Lc:
            r0 = r12 & 16
            if (r0 == 0) goto L11
            r9 = r2
        L11:
            r4.getClass()
            r0 = 6
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            if (r6 == 0) goto Lc0
            java.lang.String r3 = "1"
        L1b:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_show"
            r1.<init>(r0, r3)
            r0 = 0
            r4[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "pitaya_trace_id"
            r1.<init>(r0, r7)
            r0 = 1
            r4[r0] = r1
            java.lang.String r3 = r5.LIZ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "pop_up_type"
            r1.<init>(r0, r3)
            r0 = 2
            r4[r0] = r1
            java.lang.String r3 = r5.LIZLLL
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "trigger"
            r1.<init>(r0, r3)
            r0 = 3
            r4[r0] = r1
            java.lang.String r3 = r5.LIZIZ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_from"
            r1.<init>(r0, r3)
            r0 = 4
            r4[r0] = r1
            java.lang.String r3 = r5.LIZJ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "enter_method"
            r1.<init>(r0, r3)
            r0 = 5
            r4[r0] = r1
            java.util.Map r3 = X.C2097608Jq.LJIIJ(r4)
            java.lang.String r4 = "error_msg"
            if (r8 == 0) goto L9c
            int r0 = r8.getCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)
            int r0 = r8.getSubCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "error_sub_code"
            r3.put(r0, r1)
            java.lang.String r0 = r8.getSummary()
            java.lang.String r1 = ""
            if (r0 != 0) goto L8a
            r0 = r1
        L8a:
            r3.put(r4, r0)
            java.lang.String r0 = r8.getDomain()
            if (r0 == 0) goto L94
            r1 = r0
        L94:
            java.lang.String r0 = "error_domain"
            java.lang.Object r0 = r3.put(r0, r1)
            if (r0 != 0) goto La7
        L9c:
            if (r9 == 0) goto La7
            int r0 = r9.length()
            if (r0 <= 0) goto La7
            r3.put(r4, r9)
        La7:
            java.lang.String r0 = "intelligent_popup_result"
            X.C20684815ws.LJIILLIIL(r0, r3)
            X.08ps r1 = X.C2108208Ns.LIZ
            X.0NEs r0 = new X.0NEs
            r0.<init>(r2, r10, r6)
            java.lang.Object r1 = X.C23250099c.LJI(r11, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto Lbf
            kotlin.Unit r1 = kotlin.Unit.LIZ
        Lbf:
            return r1
        Lc0:
            java.lang.String r3 = "0"
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609580NvY.LJFF(X.0NvY, X.0zzb, boolean, java.lang.String, com.bytedance.pitaya.api.bean.PTYError, java.lang.String, kotlin.jvm.functions.Function1, X.0NNk, int):java.lang.Object");
    }
}
