package X;

import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgePayRequestPaymentDetails;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712870uft implements InterfaceC335280DCk {
    public static final Type LJIIZILJ = new TypeToken<AgentBridgePayRequestPaymentDetails>() { // from class: X.0ug6
    }.getType();
    public static final List<String> LJIJ = C1697810uHb.LJIIJJI("PAYMENT_METHOD", "STORED_PAYMENT_METHOD", "CASHIER_DISPLAY_INFO", "ELEMENT", "SESSION", "BANK_CARD_RULE_LIST");
    public static final C1711970ueR LJIJI = new ThreadLocal<SimpleDateFormat>() { // from class: X.0ueR
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };
    public final EnumC1709240ua2 LIZ;
    public final Gson LIZIZ;
    public final C054G LIZJ;
    public final Context LIZLLL;
    public final InterfaceC1192660h8q LJ;
    public C1712960ug2 LJFF;
    public Context LJI;
    public View LJII;
    public Fragment LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public C1712990ug5 LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public C1712850ufr LJIILJJIL;
    public C1712970ug3 LJIILL;
    public InterfaceC1713010ug7 LJIILLIIL;

    @Override // X.InterfaceC335280DCk
    public final C335760DEg LIZIZ() {
        C1193620hAO c1193620hAOLJ;
        String str;
        C1195240hD0 c1195240hD0;
        String strLIZ;
        InterfaceC1192660h8q interfaceC1192660h8q = this.LJ;
        if (interfaceC1192660h8q == null || (c1193620hAOLJ = interfaceC1192660h8q.LJ(true)) == null || (str = c1193620hAOLJ.LJII) == null || !(true ^ a0.LJJJIL(str)) || (c1195240hD0 = c1193620hAOLJ.LJFF) == null || (strLIZ = AnonymousClass0517.LIZ(c1195240hD0.LIZ, c1195240hD0.LIZIZ)) == null) {
            return null;
        }
        C335760DEg c335760DEg = new C335760DEg(strLIZ, Intrinsics.LJFF(c1195240hD0.LIZ, "pm_pi_ptw_googlepay_c_d") ? EnumC335980DFc.GOOGLEPAY : EnumC335980DFc.CCDC, c1195240hD0.LIZLLL, c1195240hD0.LJ);
        this.LJIIJJI = str;
        C1195240hD0 c1195240hD02 = c1193620hAOLJ.LJFF;
        this.LJIIL = c1195240hD02 != null ? c1195240hD02.LIZ : null;
        this.LJIILIIL = c1195240hD02 != null ? c1195240hD02.LIZIZ : null;
        return c335760DEg;
    }

    @Override // X.InterfaceC335280DCk
    public final C335850DEp LIZLLL() {
        InterfaceC1192660h8q interfaceC1192660h8q = this.LJ;
        if (interfaceC1192660h8q != null) {
            return interfaceC1192660h8q.LJII(false);
        }
        throw new IllegalStateException("cashier bridge is destroyed");
    }

    public final n LJIJJLI() {
        String strLJIJ;
        Object c098200Yq;
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService == null || (strLJIJ = iPIPOCashierService.LJIJ()) == null) {
            strLJIJ = "";
        }
        if (a0.LJJJIL(strLJIJ)) {
            return null;
        }
        try {
            n nVar = (n) this.LIZIZ.LJII(strLJIJ, n.class);
            c098200Yq = nVar != null ? nVar.LJJIJ("configuration") : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (n) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public static boolean LJIIJJI(C1712960ug2 c1712960ug2) {
        String str;
        String str2;
        if (!LJIIL(c1712960ug2) || (str = c1712960ug2.LIZIZ) == null || a0.LJJJIL(str) || (str2 = c1712960ug2.LIZJ) == null || a0.LJJJIL(str2)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(C1712960ug2 c1712960ug2) {
        String str;
        String str2;
        if ((!a0.LJJJIL(c1712960ug2.LIZ)) && (str = c1712960ug2.LJ) != null && !a0.LJJJIL(str) && (str2 = c1712960ug2.LIZLLL) != null && !a0.LJJJIL(str2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC335280DCk
    public final boolean LIZ(C335430DCz c335430DCz) {
        boolean z;
        C1712960ug2 c1712960ug2 = this.LJFF;
        if (c1712960ug2 != null && LJIIJJI(c1712960ug2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c335430DCz.invoke(EnumC336190DFx.EXCEPTION_ERROR, null, "agent bridge request params are incomplete");
            return false;
        }
        InterfaceC1192660h8q interfaceC1192660h8q = this.LJ;
        if (interfaceC1192660h8q == null) {
            c335430DCz.invoke(EnumC336190DFx.EXCEPTION_ERROR, null, "cashier bridge is destroyed");
            return false;
        }
        interfaceC1192660h8q.LJFF(new AwS392S0200000_26(this, c335430DCz, 61));
        return true;
    }

    @Override // X.InterfaceC335280DCk
    public final void LJFF(C335380DCu c335380DCu) {
        this.LJIILLIIL = c335380DCu;
    }

    @Override // X.InterfaceC335280DCk
    public final View LJII(View view) {
        InterfaceC1192660h8q interfaceC1192660h8q = this.LJ;
        if (interfaceC1192660h8q != null) {
            return interfaceC1192660h8q.LIZJ();
        }
        throw new IllegalStateException("cashier bridge is destroyed");
    }

    public final C1712990ug5 LJIIJ(C1712960ug2 c1712960ug2) {
        C1712990ug5 c1712990ug5 = this.LJIIJ;
        if (c1712990ug5 == null || !Intrinsics.LJFF(c1712990ug5.LIZ, c1712960ug2.LIZ) || !Intrinsics.LJFF(c1712990ug5.LIZIZ, c1712960ug2.LJ) || !Intrinsics.LJFF(c1712990ug5.LIZJ, c1712960ug2.LIZLLL) || System.currentTimeMillis() >= c1712990ug5.LJI || c1712990ug5.LIZLLL.length() <= 0 || c1712990ug5.LJ.length() <= 0) {
            return null;
        }
        return c1712990ug5;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C336160DFu LJIJI(X.C0X52<java.lang.Object> r16) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712870uft.LJIJI(X.0X52):X.0DFu");
    }

    public static String LJIJ(String str, Map map) {
        Object c098200Yq;
        String str2;
        JSONObject jSONObject;
        if (map.isEmpty()) {
            return str;
        }
        try {
            if (!(!a0.LJJJIL(str))) {
                str2 = null;
            } else {
                str2 = str;
            }
            if (str2 == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str2);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if ((!a0.LJJJIL(str3)) && !jSONObject.has(str3)) {
                    jSONObject.put(str3, str4);
                }
            }
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = str;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    @Override // X.InterfaceC335280DCk
    public final void LJ(C1712960ug2 c1712960ug2, C0DFG c0dfg) {
        this.LJFF = c1712960ug2;
        if (!LJIIJJI(c1712960ug2)) {
            c0dfg.invoke(new C0DFT(C0DFQ.FAIL, null, "agent bridge request params are incomplete", 2));
            return;
        }
        Context context = this.LIZLLL;
        if (context == null) {
            c0dfg.invoke(new C0DFT(C0DFQ.FAIL, null, "cashier bridge is destroyed", 2));
        } else {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C1712860ufs(c0dfg, context, this, c1712960ug2, null), 3);
        }
    }

    @Override // X.InterfaceC335280DCk
    public final boolean LJI(Context context, InterfaceC1631620sYq<? super EnumC336190DFx, ? super C0DD3, ? super String, Unit> interfaceC1631620sYq) {
        String str = this.LJIIJJI;
        if (str == null) {
            interfaceC1631620sYq.invoke(EnumC336190DFx.EXCEPTION_ERROR, null, "confirmed selection handle is missing");
            return false;
        }
        InterfaceC1192660h8q interfaceC1192660h8q = this.LJ;
        if (interfaceC1192660h8q == null) {
            interfaceC1631620sYq.invoke(EnumC336190DFx.EXCEPTION_ERROR, null, "cashier bridge is destroyed");
            return false;
        }
        return interfaceC1192660h8q.LJIJ(context, str, new AwS488S0200000_26(this, (C1712870uft) interfaceC1631620sYq, (InterfaceC1631620sYq<? super EnumC336190DFx, ? super C0DD3, ? super String, Unit>) 0));
    }

    @Override // X.InterfaceC335280DCk
    public final void LJIIIIZZ(C1712960ug2 c1712960ug2, AwS583S0100000_4 awS583S0100000_4) {
        LJIJJ(c1712960ug2, awS583S0100000_4);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C1712960ug2 r9, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1712940ug0
            if (r0 == 0) goto L6a
            r6 = r10
            X.0ug0 r6 = (X.C1712940ug0) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r7 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            java.lang.String r3 = "browser_user_agent"
            r2 = 0
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L7c
            X.0ug2 r9 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L27:
            if (r7 != 0) goto L70
            return r2
        L2a:
            X.C155000ia.LIZIZ(r7)
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "pipo_cashier_agent_bridge_browser_user_agent_risk_info_enable"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)
            if (r0 != 0) goto L3f
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.LJIIJ
            return r0
        L3f:
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.LJIIJ
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L54
            java.util.Map<java.lang.String, java.lang.String> r1 = r9.LJIIJ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L84
            return r1
        L54:
            android.content.Context r1 = r8.LIZLLL
            if (r1 != 0) goto L5d
            android.content.Context r1 = r8.LJI
            if (r1 != 0) goto L5d
            return r2
        L5d:
            X.0DKf r0 = X.C337310DKf.LIZ
            r6.LL = r9
            r6.LLILZ = r4
            java.lang.Object r7 = r0.LIZJ(r1, r6)
            if (r7 != r5) goto L27
            return r5
        L6a:
            X.0ug0 r6 = new X.0ug0
            r6.<init>(r8, r10)
            goto L12
        L70:
            java.util.Map<java.lang.String, java.lang.String> r1 = r9.LJIIJ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r7)
            java.util.Map r0 = X.C2097608Jq.LJIILIIL(r1, r0)
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712870uft.LJIIIZ(X.0ug2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[Catch: all -> 0x01bd, TryCatch #1 {all -> 0x01bd, blocks: (B:69:0x0184, B:70:0x0187, B:46:0x0105, B:47:0x0108, B:49:0x0110, B:51:0x0116, B:53:0x011e, B:56:0x0124, B:58:0x012a, B:62:0x0152, B:64:0x0158, B:66:0x0160, B:71:0x0195, B:72:0x019e, B:73:0x019f, B:74:0x01b4, B:61:0x0147, B:75:0x01b5, B:76:0x01bc, B:37:0x00ac, B:38:0x00af, B:40:0x00b3, B:42:0x00b9, B:28:0x008b, B:29:0x008e, B:31:0x0092, B:33:0x0098, B:24:0x006d, B:59:0x0131), top: B:88:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[Catch: all -> 0x01bd, TryCatch #1 {all -> 0x01bd, blocks: (B:69:0x0184, B:70:0x0187, B:46:0x0105, B:47:0x0108, B:49:0x0110, B:51:0x0116, B:53:0x011e, B:56:0x0124, B:58:0x012a, B:62:0x0152, B:64:0x0158, B:66:0x0160, B:71:0x0195, B:72:0x019e, B:73:0x019f, B:74:0x01b4, B:61:0x0147, B:75:0x01b5, B:76:0x01bc, B:37:0x00ac, B:38:0x00af, B:40:0x00b3, B:42:0x00b9, B:28:0x008b, B:29:0x008e, B:31:0x0092, B:33:0x0098, B:24:0x006d, B:59:0x0131), top: B:88:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110 A[Catch: all -> 0x01bd, TryCatch #1 {all -> 0x01bd, blocks: (B:69:0x0184, B:70:0x0187, B:46:0x0105, B:47:0x0108, B:49:0x0110, B:51:0x0116, B:53:0x011e, B:56:0x0124, B:58:0x012a, B:62:0x0152, B:64:0x0158, B:66:0x0160, B:71:0x0195, B:72:0x019e, B:73:0x019f, B:74:0x01b4, B:61:0x0147, B:75:0x01b5, B:76:0x01bc, B:37:0x00ac, B:38:0x00af, B:40:0x00b3, B:42:0x00b9, B:28:0x008b, B:29:0x008e, B:31:0x0092, B:33:0x0098, B:24:0x006d, B:59:0x0131), top: B:88:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116 A[Catch: all -> 0x01bd, TryCatch #1 {all -> 0x01bd, blocks: (B:69:0x0184, B:70:0x0187, B:46:0x0105, B:47:0x0108, B:49:0x0110, B:51:0x0116, B:53:0x011e, B:56:0x0124, B:58:0x012a, B:62:0x0152, B:64:0x0158, B:66:0x0160, B:71:0x0195, B:72:0x019e, B:73:0x019f, B:74:0x01b4, B:61:0x0147, B:75:0x01b5, B:76:0x01bc, B:37:0x00ac, B:38:0x00af, B:40:0x00b3, B:42:0x00b9, B:28:0x008b, B:29:0x008e, B:31:0x0092, B:33:0x0098, B:24:0x006d, B:59:0x0131), top: B:88:0x0026, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.C1712960ug2 r23, X.InterfaceC1364105Vn<? super java.lang.Boolean> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712870uft.LJIILJJIL(X.0ug2, X.05Vn):java.lang.Object");
    }

    public final void LJIJJ(C1712960ug2 c1712960ug2, AwS583S0100000_4 awS583S0100000_4) {
        this.LJFF = c1712960ug2;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIIZ = C23250099c.LIZLLL(this.LIZJ, null, null, new C337560DLe(this, awS583S0100000_4, c1712960ug2, null), 3);
    }

    public C1712870uft(Context context, EnumC1709270ua5 enumC1709270ua5, EnumC1709240ua2 enumC1709240ua2) {
        Context contextN3;
        this.LIZ = enumC1709240ua2;
        C1227904rF.LIZ.getClass();
        this.LIZIZ = C1227904rF.LIZLLL();
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZLLL = context;
        String string = UUID.randomUUID().toString();
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService != null) {
            C1709430uaL c1709430uaLLJIL = iPIPOCashierService.LJIL(context, string, "", enumC1709270ua5);
            this.LJ = c1709430uaLLJIL;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_cashier_agent_bridge_browser_user_agent_risk_info_enable", true) && context != null && (contextN3 = C786410Ut5.N3(context)) != null && C337310DKf.LIZIZ() == null && C337310DKf.LIZLLL == null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0100000_4(contextN3, 33));
            }
            if (c1709430uaLLJIL != null) {
                c1709430uaLLJIL.LJIILLIIL(new InterfaceC1709520uaU() { // from class: X.0ug1
                    @Override // X.InterfaceC1709520uaU
                    public final C1192680h8s LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1709520uaU
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1709520uaU
                    public final void c3() {
                        InterfaceC1713010ug7 interfaceC1713010ug7 = this.LIZ.LJIILLIIL;
                        if (interfaceC1713010ug7 != null) {
                            interfaceC1713010ug7.c3();
                        }
                    }

                    @Override // X.InterfaceC1709520uaU
                    public final void LIZJ(EnumC1155070gAD enumC1155070gAD) {
                        C0DJX c0djx;
                        InterfaceC1713010ug7 interfaceC1713010ug7 = this.LIZ.LJIILLIIL;
                        if (interfaceC1713010ug7 != null) {
                            int i = C1155080gAE.LIZ[enumC1155070gAD.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    c0djx = C0DJX.NEW_BIND;
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                c0djx = C0DJX.DEFAULT;
                            }
                            interfaceC1713010ug7.d3(c0djx);
                        }
                        C1712870uft c1712870uft = this.LIZ;
                        C1712960ug2 c1712960ug2 = c1712870uft.LJFF;
                        if (c1712960ug2 != null) {
                            c1712870uft.LJIJJ(c1712960ug2, null);
                        }
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("IPIPOCashierService not found");
    }

    @Override // X.InterfaceC335280DCk
    public final void LIZJ(Context context, View view, Fragment fragment) {
        this.LJI = context;
        this.LJII = view;
        this.LJIIIIZZ = fragment;
        InterfaceC1192660h8q interfaceC1192660h8q = this.LJ;
        if (interfaceC1192660h8q != null) {
            interfaceC1192660h8q.LJIILIIL(view, fragment);
            return;
        }
        throw new IllegalStateException("cashier bridge is destroyed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi r14, X.C1712960ug2 r15, X.InterfaceC1364105Vn<? super X.C1712990ug5> r16) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712870uft.LJIILL(com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi, X.0ug2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi r14, X.C1712990ug5 r15, com.ss.android.ugc.aweme.pipo.cashier.agentbridge.DelegatePaymentRequest r16, X.InterfaceC1364105Vn<? super X.C336160DFu> r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C1712920ufy
            if (r0 == 0) goto L24
            r8 = r3
            X.0ufy r8 = (X.C1712920ufy) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r8.LLILZ = r2
        L14:
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.0uft r0 = r8.LL
            goto L51
        L24:
            X.0ufy r8 = new X.0ufy
            r8.<init>(r13, r3)
            goto L14
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r15.LJ     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r15.LIZLLL     // Catch: java.lang.Throwable -> L5e
            r8.LL = r13     // Catch: java.lang.Throwable -> L5e
            r8.LLILZ = r1     // Catch: java.lang.Throwable -> L5e
            r7 = r16
            r3 = r14
            java.lang.Object r3 = r3.delegatePayment(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            if (r3 != r2) goto L4f
            return r2
        L4f:
            r0 = r13
            goto L54
        L51:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L5e
        L54:
            X.0X52 r3 = (X.C0X52) r3     // Catch: java.lang.Throwable -> L5e
            X.0DFu r3 = r0.LJIJI(r3)     // Catch: java.lang.Throwable -> L5e
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L6a:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r2 == 0) goto L96
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L97
            X.0DFu r3 = new X.0DFu
            r4 = 0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "delegate_payment request failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r11 = X.C2188811AlT.LIZIZ(r1)
            r12 = 127(0x7f, float:1.78E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L96:
            return r3
        L97:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712870uft.LJIILIIL(com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi, X.0ug5, com.ss.android.ugc.aweme.pipo.cashier.agentbridge.DelegatePaymentRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C1712960ug2 r24, X.C1712840ufq r25, X.C336160DFu r26, X.InterfaceC1364105Vn<? super X.C336160DFu> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1712870uft.LJIILLIIL(X.0ug2, X.0ufq, X.0DFu, X.05Vn):java.lang.Object");
    }

    public final void LJIIZILJ(EnumC336190DFx enumC336190DFx, String str, String str2, boolean z, InterfaceC1631620sYq<? super EnumC336190DFx, ? super C0DD3, ? super String, Unit> interfaceC1631620sYq) {
        if (enumC336190DFx == EnumC336190DFx.SUCCESS && str != null && str.length() != 0) {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C336170DFv(interfaceC1631620sYq, this, str, z, null), 3);
        } else {
            interfaceC1631620sYq.invoke(enumC336190DFx, null, str2);
        }
    }
}
