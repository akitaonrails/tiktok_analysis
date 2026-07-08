package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609620Nvc {
    public static final C609620Nvc LIZ = new C609620Nvc();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C609750Nvp());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C609700Nvk());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C609720Nvm());
    public static final C01GW LJ = C452501pT.LIZIZ(new C609650Nvf());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C609670Nvh());
    public static final C01GW LJI = C452501pT.LIZIZ(new C609680Nvi());
    public static final C01GW LJII = C452501pT.LIZIZ(new C609690Nvj());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C609660Nvg());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C609710Nvl());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C609760Nvq());

    public static Keva LIZJ() {
        return (Keva) LJIIJ.getValue();
    }

    public static boolean LIZLLL() {
        return (!C609730Nvn.LIZ().tryInitPitayaOnReceive || PreHostSetupWatcher.INSTANCE.isPreHostSetup() || HostSetupWatcher.INSTANCE.isHostSetup()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC497601wk LIZIZ(Context context) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (context == 0) {
            return C2296808zG.LIZ(C0PEM.LIZJ);
        }
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            return lifecycleScope;
        }
        return C2296808zG.LIZ(C0PEM.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final kotlin.jvm.internal.AwS588S0100000_9 r6, final X.C814730Vxf r7) throws java.lang.Throwable {
        /*
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r1 = X.C2179771ASp.LJIIIZ()
            java.lang.String r0 = "is_music_active"
            r2.put(r0, r1)
            android.content.Context r1 = X.C20642515q3.LIZ()
            java.lang.String r0 = "power"
            java.lang.Object r1 = X.C786410Ut5.H2(r1, r0)
            boolean r0 = r1 instanceof android.os.PowerManager
            r4 = 0
            if (r0 == 0) goto Laa
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            if (r1 == 0) goto Laa
            boolean r0 = r1.isScreenOn()
            r1 = 1
            if (r0 != r1) goto Laa
        L28:
            java.lang.String r0 = "is_screen_on"
            r2.put(r0, r1)
            boolean r1 = X.C20642615q4.LIZIZ()
            java.lang.String r0 = "is_lock_screen"
            r2.put(r0, r1)
            long r0 = r7.rid64
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "rule_id64"
            r2.put(r0, r1)
            android.content.Context r1 = X.C20642515q3.LIZ()
            java.lang.String r0 = "batterymanager"
            java.lang.Object r3 = X.C786410Ut5.H2(r1, r0)
            boolean r0 = r3 instanceof android.os.BatteryManager
            if (r0 == 0) goto La8
            android.os.BatteryManager r3 = (android.os.BatteryManager) r3
        L51:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto La6
            if (r3 == 0) goto La6
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2dv+7a5PH3nxzmANobxXoKP6jm5m7EXW0bZgEaUkQPuSMpHxD12GPtcGW"
            r1.<init>(r0, r4)
            r0 = 6
            int r1 = X.C2204961BRm.LL(r3, r0, r1)
        L65:
            java.lang.String r0 = "cur_battery_status"
            r2.put(r0, r1)
            X.0Vxq r0 = r7.extra
            java.lang.String r1 = r0.notificationChannelId
            java.lang.String r0 = "notification_channel_id"
            r2.put(r0, r1)
            java.lang.String r1 = "reach_type"
            java.lang.String r0 = r7.reachType
            r2.put(r1, r0)
            boolean r1 = X.C2214201BlK.LJIIJJI
            java.lang.String r0 = "is_app_background"
            r2.put(r0, r1)
            X.01GW r0 = X.C609620Nvc.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.pitaya.api.IPitayaCore r5 = com.bytedance.pitaya.api.PitayaCoreFactory.getCore(r0)
            com.bytedance.pitaya.api.bean.PTYTaskData r4 = new com.bytedance.pitaya.api.bean.PTYTaskData
            r4.<init>(r2)
            com.bytedance.pitaya.api.bean.PTYTaskConfig r3 = new com.bytedance.pitaya.api.bean.PTYTaskConfig
            r2 = 0
            r1 = 0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.<init>(r1, r2, r0)
            com.ss.android.ugc.awemepushlib.interaction.IntelligencePushHelper$runIntelligencePushTask$1 r1 = new com.ss.android.ugc.awemepushlib.interaction.IntelligencePushHelper$runIntelligencePushTask$1
            r1.<init>()
            java.lang.String r0 = "intelligence_push"
            r5.runTask(r0, r4, r3, r1)
            return
        La6:
            r1 = -1
            goto L65
        La8:
            r3 = r4
            goto L51
        Laa:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609620Nvc.LJ(kotlin.jvm.internal.AwS588S0100000_9, X.0Vxf):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[Catch: Exception -> 0x0164, TryCatch #2 {Exception -> 0x0164, blocks: (B:47:0x0134, B:23:0x00a3, B:25:0x00a9, B:27:0x00ad, B:29:0x00b3, B:49:0x013a, B:51:0x0148, B:54:0x0152, B:36:0x00c2, B:38:0x00c6, B:40:0x00e0, B:42:0x00f6, B:44:0x010e), top: B:69:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[Catch: Exception -> 0x0164, TryCatch #2 {Exception -> 0x0164, blocks: (B:47:0x0134, B:23:0x00a3, B:25:0x00a9, B:27:0x00ad, B:29:0x00b3, B:49:0x013a, B:51:0x0148, B:54:0x0152, B:36:0x00c2, B:38:0x00c6, B:40:0x00e0, B:42:0x00f6, B:44:0x010e), top: B:69:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: Exception -> 0x0164, TryCatch #2 {Exception -> 0x0164, blocks: (B:47:0x0134, B:23:0x00a3, B:25:0x00a9, B:27:0x00ad, B:29:0x00b3, B:49:0x013a, B:51:0x0148, B:54:0x0152, B:36:0x00c2, B:38:0x00c6, B:40:0x00e0, B:42:0x00f6, B:44:0x010e), top: B:69:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0134 -> B:19:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC497601wk r22, X.C814730Vxf r23, int r24, long r25, kotlin.jvm.functions.Function0<kotlin.Unit> r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609620Nvc.LIZ(X.01wk, X.0Vxf, int, long, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    public static void LJFF(C609620Nvc c609620Nvc, C814730Vxf c814730Vxf, int i, int i2, EnumC609640Nve enumC609640Nve, long j, Function0 function0, String str, PTYError pTYError, int i3) {
        Object obj;
        if ((i3 & 64) != 0) {
            str = "backup_trigger";
        }
        if ((i3 & 128) != 0) {
            pTYError = null;
        }
        c814730Vxf.pitayaTraceID = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zLJI = MethodIDManager.LJI(137761);
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("retry_times", String.valueOf(i2));
        pairArr[1] = new Pair("max_retry_times", String.valueOf(((Number) LIZJ.getValue()).intValue()));
        pairArr[2] = new Pair("show_reason", enumC609640Nve.LL);
        pairArr[3] = new Pair("rule_id", String.valueOf(c814730Vxf.rid64));
        pairArr[4] = new Pair("push_channel", C814710Vxd.LIZLLL(i));
        pairArr[5] = new Pair("o_url", c814730Vxf.openUrl);
        pairArr[6] = new Pair("push_label", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(c814730Vxf.openUrl), "gd_label"));
        String str2 = c814730Vxf.itemType;
        str2.toString();
        pairArr[7] = new Pair("item_type", str2);
        String str3 = c814730Vxf.reachType;
        str3.toString();
        pairArr[8] = new Pair("reach_type", str3);
        pairArr[9] = new Pair("receive_time", String.valueOf(j));
        pairArr[10] = new Pair("show_time", String.valueOf(jCurrentTimeMillis));
        boolean zIsEmpty = c814730Vxf.extra.actionList.isEmpty();
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (!zIsEmpty) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[11] = new Pair("has_button", obj);
        if (!TextUtils.isEmpty(c814730Vxf.extra.bg_color)) {
            str4 = "1";
        }
        pairArr[12] = new Pair("colorized", str4);
        pairArr[13] = new Pair("pitaya_trace_id", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (pTYError != null) {
            mapLJIIJ.put("error_code", String.valueOf(pTYError.getCode()));
            mapLJIIJ.put("error_sub_code", String.valueOf(pTYError.getSubCode()));
            mapLJIIJ.put("error_msg", pTYError.getSummary());
            mapLJIIJ.put("error_domain", pTYError.getDomain());
        }
        C20684815ws.LJIILLIIL("push_intelligence_show", mapLJIIJ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        LIZJ().storeString(String.valueOf(c814730Vxf.rid64), "1");
        function0.invoke();
    }
}
