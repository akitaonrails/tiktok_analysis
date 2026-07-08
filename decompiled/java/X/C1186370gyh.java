package X;

import android.os.SystemClock;
import android.view.View;
import com.google.gson.s;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;

/* JADX INFO: renamed from: X.0gyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186370gyh extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1174010gel, InterfaceC1181500gqq {
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final List<InterfaceC1186470gyr> LLJI = Collections.synchronizedList(new ArrayList());
    public final Set<String> LLJIJIL = new LinkedHashSet();
    public final Set<String> LLJILJIL = new LinkedHashSet();

    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJFF(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJI(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJII(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJIIJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJ(InterfaceC1173990gej<?> interfaceC1173990gej, View view) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onAttach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDetach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onHiddenChanged(boolean z) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onPause() {
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC1181500gqq
    public final void onResume() {
        this.LLILLJJLI = false;
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStart() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStop() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
    }

    public final Map<String, Object> LJJIIJ() {
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null) {
            return interfaceC1181010gq3.BO1();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0177 A[PHI: r3
      0x0177: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v9 java.lang.String) binds: [B:99:0x0173, B:55:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    @Override // X.InterfaceC1181500gqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186370gyh.onCreate():void");
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIIJ() {
        LJJIFFI();
        this.LL = null;
    }

    public final void LJJIFFI() {
        Map<String, Object> mapLJJIIJ = LJJIIJ();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLJI);
        this.LLJI.clear();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1186380gyi(arrayList, mapLJJIIJ, this, null), 3);
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
        String str2;
        C1181930grX c1181930grXPu2;
        C1180170goh.LIZLLL().LIZIZ("SlashPlugin", new AwS102S1000000_18(str, 2));
        LJJIFFI();
        if (this.LLIZ) {
            this.LLIZ = false;
            C1187670h0n c1187670h0n = C1187670h0n.LIZ;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            if (interfaceC1181010gq3 != null && (c1181930grXPu2 = interfaceC1181010gq3.Pu2()) != null) {
                str2 = c1181930grXPu2.LIZJ;
            } else {
                str2 = null;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZ;
            Map<String, Object> mapLJJIIJ = LJJIIJ();
            c1187670h0n.getClass();
            C1187670h0n.LJ(jElapsedRealtime, str2, str, mapLJJIIJ, true);
        }
        this.LLIZLLLIL = false;
    }

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
        C1180170goh.LIZLLL().LIZIZ("SlashPlugin", new AwS102S1000000_18(str, 1));
        this.LLILZ = SystemClock.elapsedRealtime();
        this.LLILZLL = true;
        this.LLIZ = true;
        this.LLIZLLLIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    @Override // X.InterfaceC1174010gel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.InterfaceC1173990gej<?> r8, com.ss.android.ugc.aweme.slash.component.BaseComponentData r9) {
        /*
            r7 = this;
            X.0h0n r1 = X.C1187670h0n.LIZ
            X.0gq3 r0 = r7.LL
            r6 = 0
            if (r0 == 0) goto L59
            X.0grX r0 = r0.Pu2()
            if (r0 == 0) goto L59
            java.lang.String r5 = r0.LIZJ
        Lf:
            java.lang.String r4 = r8.S2()
            if (r9 == 0) goto L55
            X.0goZ r0 = r9.componentType
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.LIZ
        L1b:
            java.lang.String r6 = r9.updateType
        L1d:
            r1.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = "key"
            java.lang.String r0 = "component_exposure"
            r2.put(r1, r0)
            java.lang.String r1 = ""
            if (r5 != 0) goto L31
            r5 = r1
        L31:
            java.lang.String r0 = "biz"
            r2.put(r0, r5)
            if (r4 != 0) goto L39
            r4 = r1
        L39:
            java.lang.String r0 = "instance_id"
            r2.put(r0, r4)
            if (r3 != 0) goto L41
            r3 = r1
        L41:
            java.lang.String r0 = "component_type"
            r2.put(r0, r3)
            if (r6 != 0) goto L4a
            java.lang.String r6 = "page_refresh"
        L4a:
            java.lang.String r0 = "data_update_type"
            r2.put(r0, r6)
            java.lang.String r0 = "local_service_slash_track"
            X.C20684815ws.LJIILLIIL(r0, r2)
            return
        L55:
            r3 = r6
            if (r9 == 0) goto L1d
            goto L1b
        L59:
            r5 = r6
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186370gyh.LJJI(X.0gej, com.ss.android.ugc.aweme.slash.component.BaseComponentData):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        if (r5 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    @Override // X.InterfaceC1181380gqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a9(com.ss.android.ugc.aweme.slash.data.SlashApiResponse r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186370gyh.a9(com.ss.android.ugc.aweme.slash.data.SlashApiResponse, java.lang.String):void");
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
        List<C1180920gpu> listLJ;
        String str2;
        C1181930grX c1181930grXPu2;
        String str3;
        C1181930grX c1181930grXPu22;
        C1180170goh.LIZLLL().LIZIZ("SlashPlugin", new AwS102S1000000_18(str, 0));
        if (this.LLJ) {
            this.LLJ = false;
            List<InterfaceC1186470gyr> list = this.LLJI;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            if (interfaceC1181010gq3 != null && (c1181930grXPu22 = interfaceC1181010gq3.Pu2()) != null) {
                str3 = c1181930grXPu22.LIZJ;
            } else {
                str3 = null;
            }
            list.add(new C1186420gym(str3, SystemClock.elapsedRealtime() - this.LLILZIL));
        }
        if (str == null && c1180620gpQ != null && c1180620gpQ.LLILLJJLI && (listLJ = c1180620gpQ.LJ()) != null) {
            for (C1180920gpu c1180920gpu : listLJ) {
                if (!this.LLJIJIL.contains(c1180920gpu.LIZ) && this.LLJILJIL.contains(c1180920gpu.LIZ)) {
                    InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
                    if (!C1180170goh.LIZ(c1180920gpu, c1180620gpQ.LLILLJJLI)) {
                        this.LLJIJIL.add(c1180920gpu.LIZ);
                        C1187670h0n c1187670h0n = C1187670h0n.LIZ;
                        InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
                        if (interfaceC1181010gq32 != null && (c1181930grXPu2 = interfaceC1181010gq32.Pu2()) != null) {
                            str2 = c1181930grXPu2.LIZJ;
                        } else {
                            str2 = null;
                        }
                        String str4 = c1180920gpu.LIZ;
                        Map<String, Object> mapLJJIIJ = LJJIIJ();
                        c1187670h0n.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("key", "node_empty");
                        if (str2 == null) {
                            str2 = "";
                        }
                        linkedHashMap.put("biz", str2);
                        linkedHashMap.put("node_key", str4);
                        if (mapLJJIIJ != null) {
                            for (Map.Entry<String, Object> entry : mapLJJIIJ.entrySet()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                            }
                        }
                        C20684815ws.LJIILLIIL("local_service_slash_track", linkedHashMap);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
        this.LLJ = true;
        this.LLILZIL = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
        C1181930grX c1181930grXPu2;
        String str2;
        int i;
        int cronetInternalErrorCode;
        int i2;
        C1181930grX c1181930grXPu22;
        C1180170goh.LIZLLL().LIZIZ("SlashPlugin", new AwS167S1100000_18(str, th, 0));
        LJJIFFI();
        String str3 = null;
        if (this.LLILZLL) {
            this.LLILZLL = false;
            C1187670h0n c1187670h0n = C1187670h0n.LIZ;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            if (interfaceC1181010gq3 != null && (c1181930grXPu22 = interfaceC1181010gq3.Pu2()) != null) {
                str2 = c1181930grXPu22.LIZJ;
            } else {
                str2 = null;
            }
            if (th instanceof C0XIR) {
                cronetInternalErrorCode = ((C23112093u) th).getErrorCode();
                i2 = 90000000;
            } else {
                if (!(th instanceof C0XIO) && !(th.getCause() instanceof C0XIO) && !(th instanceof s) && !(th.getCause() instanceof s)) {
                    if (th instanceof IllegalArgumentException) {
                        i = 70000000;
                    } else if (th instanceof IllegalStateException) {
                        i = 70000001;
                    } else if (th instanceof C1494690ozz) {
                        C1494690ozz c1494690ozz = (C1494690ozz) th;
                        int statusCode = c1494690ozz.getStatusCode();
                        if (statusCode > 0) {
                            i = statusCode + 60000000;
                        } else {
                            cronetInternalErrorCode = c1494690ozz.getCronetInternalErrorCode();
                            if (cronetInternalErrorCode < 0) {
                                cronetInternalErrorCode = -cronetInternalErrorCode;
                            }
                            i2 = 50000000;
                        }
                    } else if (th instanceof C1494430ozZ) {
                        int statusCode2 = ((C1494430ozZ) th).getStatusCode();
                        if (statusCode2 > 0) {
                            i = statusCode2 + 60000000;
                        } else {
                            i = 0;
                        }
                    } else if (th instanceof IOException) {
                        i = 10000001;
                    } else {
                        i = 10000000;
                    }
                } else {
                    i = 80000000;
                }
                Map<String, Object> mapLJJIIJ = LJJIIJ();
                c1187670h0n.getClass();
                C1187670h0n.LIZLLL(i, str2, str, mapLJJIIJ);
            }
            i = cronetInternalErrorCode + i2;
            Map<String, Object> mapLJJIIJ2 = LJJIIJ();
            c1187670h0n.getClass();
            C1187670h0n.LIZLLL(i, str2, str, mapLJJIIJ2);
        }
        if (this.LLIZ) {
            this.LLIZ = false;
            C1187670h0n c1187670h0n2 = C1187670h0n.LIZ;
            InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
            if (interfaceC1181010gq32 != null && (c1181930grXPu2 = interfaceC1181010gq32.Pu2()) != null) {
                str3 = c1181930grXPu2.LIZJ;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZ;
            Map<String, Object> mapLJJIIJ3 = LJJIIJ();
            c1187670h0n2.getClass();
            C1187670h0n.LJ(jElapsedRealtime, str3, str, mapLJJIIJ3, false);
        }
        this.LLIZLLLIL = false;
    }
}
