package X;

import Y.AfS2S2210000_27;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808280x9m {
    public static final C1808280x9m LIZ = new C1808280x9m();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(310));
    public static final ConcurrentHashMap<String, C1808300x9o> LIZJ = new ConcurrentHashMap<>();

    public static boolean LJI(String str, String str2) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        if (!a0.LJJJIL(str2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('#');
            sbLIZ2.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = LIZIZ;
        Double d = (Double) ((Map) c01gw.getValue()).get(strLIZIZ2);
        if (d != null || (d = (Double) ((Map) c01gw.getValue()).get("default")) != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue > 0.0d && AbstractC19994813Le.Default.nextDouble() <= dDoubleValue) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C1808300x9o LJII(final long j, final String str, final String str2) {
        if (Build.VERSION.SDK_INT >= 24) {
            C1808300x9o c1808300x9oCompute = LIZJ.compute(str2, new BiFunction(str, str2, j) { // from class: X.0x9p
                public final /* synthetic */ String LIZ;
                public final /* synthetic */ long LIZIZ;

                {
                    this.LIZIZ = j;
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    EnumC1808320x9q enumC1808320x9q;
                    C1808300x9o c1808300x9o = (C1808300x9o) obj2;
                    String str3 = this.LIZ;
                    long j2 = this.LIZIZ;
                    if (c1808300x9o != null) {
                        long j3 = c1808300x9o.LIZJ;
                        long j4 = j2 - j3;
                        EnumC1808320x9q.Companion.getClass();
                        if (j4 >= 0 && j3 != 0) {
                            if (j4 < 100) {
                                enumC1808320x9q = EnumC1808320x9q.DUPLICATED;
                            } else if (j4 < 500) {
                                enumC1808320x9q = EnumC1808320x9q.AGGRESSIVE_RETRY;
                            } else if (j4 < Mp4ScreenVideoLoadTimeout.CONTROL) {
                                enumC1808320x9q = EnumC1808320x9q.RETRY;
                            } else {
                                enumC1808320x9q = EnumC1808320x9q.NORMAL;
                            }
                        } else {
                            enumC1808320x9q = EnumC1808320x9q.NORMAL;
                        }
                        return new C1808300x9o(c1808300x9o.LIZ, enumC1808320x9q, j2, j4);
                    }
                    return new C1808300x9o(str3, EnumC1808320x9q.NORMAL, j2, 0L);
                }
            });
            if (c1808300x9oCompute == null) {
                return new C1808300x9o(str, EnumC1808320x9q.NORMAL, j, 0L);
            }
            return c1808300x9oCompute;
        }
        return null;
    }

    public static void LIZIZ(C1808300x9o c1808300x9o, String str, String str2, Map map) {
        String idStr;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleApiStart apiInfo: ");
        sbLIZ.append(c1808300x9o);
        sbLIZ.append(" showEntrance: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PcsMonitor", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        if (!(curUser instanceof User) || (user = (User) curUser) == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        String strValueOf = String.valueOf(TTNetInit.getEffectiveConnectionType());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_api_general_request");
        c474500IjALIZ.LJJII(Long.valueOf(c1808300x9o.LIZJ), "start_time");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str2, "path");
        c474500IjALIZ.LJJII(idStr, "user_id");
        c474500IjALIZ.LJJII(c1808300x9o.LIZIZ.getType(), "suspect_duplicate_pattern");
        c474500IjALIZ.LJJII(Long.valueOf(c1808300x9o.LIZLLL), "time_since_last_same_path_request_ms");
        c474500IjALIZ.LJJII(strValueOf, "network_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C1808300x9o c1808300x9o, String str, String str2, C470590Icr c470590Icr, Map map) {
        String idStr;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleApiSuccess apiInfo: ");
        sbLIZ.append(c1808300x9o);
        sbLIZ.append(" showEntrance: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PcsMonitor", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis() - c1808300x9o.LIZJ;
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        if (!(curUser instanceof User) || (user = (User) curUser) == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        String str3 = c470590Icr.LIZIZ;
        String strValueOf = String.valueOf(TTNetInit.getEffectiveConnectionType());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_api_general_result");
        c474500IjALIZ.LJJII(Long.valueOf(c1808300x9o.LIZJ), "start_time");
        c474500IjALIZ.LJJII(str, "show_entrance");
        c474500IjALIZ.LJJII(str2, "path");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "cost");
        c474500IjALIZ.LJJII(idStr, "user_id");
        c474500IjALIZ.LJJII(str3, "log_id");
        c474500IjALIZ.LJJII(c1808300x9o.LIZIZ.getType(), "suspect_duplicate_pattern");
        c474500IjALIZ.LJJII(Long.valueOf(c1808300x9o.LIZLLL), "time_since_last_same_path_request_ms");
        c474500IjALIZ.LJJII(strValueOf, "network_type");
        c474500IjALIZ.LJJII("1", "is_success");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static C11NZ LJFF(C11NZ c11nz, String str, final String str2, AnonymousClass0207 anonymousClass0207, int i) {
        Map mapLJ;
        final Function1 function1 = anonymousClass0207;
        String str3 = str;
        if ((i & 1) != 0) {
            str3 = "";
        }
        if ((i & 4) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i & 8) != 0) {
            function1 = AFwS257S0000000_19.get$arr$(774);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        final boolean zLJI = LJI(str2, str3);
        final C1808300x9o c1808300x9oLJII = LJII(jCurrentTimeMillis, str3, str2);
        if (c1808300x9oLJII != null) {
            C11JH c11jhLJJIJIL = c11nz.LJJIJIL(new AfS2S2210000_27(c1808300x9oLJII, str3, str2, mapLJ, zLJI, 0));
            final String str4 = str3;
            final Map map = mapLJ;
            C11JN c11jnLJJIJIIJI = c11jhLJJIJIL.LJJIJIIJIL(new C09JN() { // from class: X.0x9k
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PcsMonitor@2ed9.monitorPcsApi$3");
                    C470590Icr<T> c470590Icr = (C470590Icr) obj;
                    if (function1.invoke(c470590Icr).booleanValue()) {
                        if (zLJI) {
                            C1808280x9m.LIZJ(c1808300x9oLJII, str4, str2, c470590Icr, map);
                        }
                    } else {
                        C501470JlZ c501470JlZ = new C501470JlZ(100010001);
                        c501470JlZ.setLogId(c470590Icr.LIZIZ);
                        C1808280x9m.LIZ(c1808300x9oLJII, str4, str2, c501470JlZ, map, zLJI);
                    }
                    C1C7U.LIZIZ("PcsMonitor@2ed9.monitorPcsApi$3");
                }
            }).LJJIJIIJI(new AfS2S2210000_27(c1808300x9oLJII, str3, str2, mapLJ, zLJI, 1));
            final String str5 = str3;
            final Map map2 = mapLJ;
            return c11jnLJJIJIIJI.LJJIIZ(new InterfaceC781210Ukh() { // from class: X.0x9l
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C1808280x9m.LIZ(c1808300x9oLJII, str5, str2, new Exception(), map2, zLJI);
                }
            });
        }
        return c11nz;
    }

    public static void LIZ(C1808300x9o c1808300x9o, String str, String str2, Throwable th, Map map, boolean z) {
        String idStr;
        String strLIZIZ;
        User user;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleApiFail apiInfo: ");
        sbLIZ.append(c1808300x9o);
        sbLIZ.append(" error: ");
        sbLIZ.append(th);
        C20441214yg.LIZIZ("PcsMonitor", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis() - c1808300x9o.LIZJ;
        InterfaceC2262081DgM curUser = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUser();
        String logId = null;
        if ((curUser instanceof User) && (user = (User) curUser) != null) {
            idStr = user.getIdStr();
        } else {
            idStr = null;
        }
        String str3 = "";
        if (idStr == null) {
            idStr = "";
        }
        if (th instanceof C501470JlZ) {
            logId = ((C501470JlZ) th).getLogId();
        }
        String strValueOf = String.valueOf(TTNetInit.getEffectiveConnectionType());
        int iLJIIIZ = C500260Jjc.LJIIIZ(th);
        String message = th.getMessage();
        if (th instanceof C501470JlZ) {
            strLIZIZ = "ApiServerException";
        } else if (th instanceof C1811850xFX) {
            strLIZIZ = "NetworkErrorException";
        } else if (th instanceof C1494690ozz) {
            strLIZIZ = "CronetIOException";
        } else if (th instanceof C1494450ozb) {
            strLIZIZ = "NetworkNotAvailableException";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unknown: ");
            sbLIZ2.append(th.getClass().getSimpleName());
            sbLIZ2.append(' ');
            sbLIZ2.append(th.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("start_time", String.valueOf(c1808300x9o.LIZJ));
        pairArr[1] = new Pair("show_entrance", str);
        pairArr[2] = new Pair("path", str2);
        pairArr[3] = new Pair("cost", String.valueOf(jCurrentTimeMillis));
        pairArr[4] = new Pair("error_code", String.valueOf(iLJIIIZ));
        pairArr[5] = new Pair("error_detail", String.valueOf(message));
        pairArr[6] = new Pair("error_type", strLIZIZ);
        pairArr[7] = new Pair("user_id", idStr);
        if (logId != null) {
            str3 = logId;
        }
        pairArr[8] = new Pair("log_id", str3);
        pairArr[9] = new Pair("suspect_duplicate_pattern", c1808300x9o.LIZIZ.getType());
        pairArr[10] = new Pair("time_since_last_same_path_request_ms", String.valueOf(c1808300x9o.LIZLLL));
        pairArr[11] = new Pair("network_type", strValueOf);
        pairArr[12] = new Pair("is_success", CardStruct.IStatusCode.DEFAULT);
        Map mapLJIIL = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), map);
        if (z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_api_general_result");
            c474500IjALIZ.LJJIIZI(mapLJIIL);
            c474500IjALIZ.LIZ();
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_pcs_api_general_failed_non_sample");
        c474500IjALIZ2.LJJIIZI(mapLJIIL);
        c474500IjALIZ2.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:28:0x0089, B:31:0x0099, B:33:0x009d, B:36:0x00ad, B:25:0x0074), top: B:43:0x0074 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LIZLLL(java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, kotlin.jvm.functions.Function1<? super X.C470590Icr<T>, java.lang.Boolean> r17, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super X.C470590Icr<T>>, ? extends java.lang.Object> r18, X.InterfaceC1364105Vn<? super X.C470590Icr<T>> r19) throws java.lang.Throwable {
        /*
            r13 = this;
            r8 = r14
            r4 = r19
            r9 = r15
            r11 = r16
            r2 = r17
            boolean r0 = r4 instanceof X.C1808290x9n
            if (r0 == 0) goto L3d
            r6 = r4
            X.0x9n r6 = (X.C1808290x9n) r6
            int r3 = r6.LLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L3d
            int r3 = r3 - r1
            r6.LLJ = r3
        L1a:
            java.lang.Object r1 = r6.LLIZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLJ
            r4 = 2
            r12 = 1
            if (r0 == 0) goto L4f
            if (r0 == r12) goto L6b
            if (r0 != r4) goto L47
            boolean r3 = r6.LLILZLL
            X.0x9o r7 = r6.LLILZIL
            kotlin.jvm.functions.Function1 r2 = r6.LLILZ
            java.lang.Object r11 = r6.LLILLL
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r9 = r6.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            goto L43
        L3d:
            X.0x9n r6 = new X.0x9n
            r6.<init>(r13, r4)
            goto L1a
        L43:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> Lb3
            goto L89
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4f:
            X.C155000ia.LIZIZ(r1)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r3 = LJI(r9, r8)
            X.0x9o r7 = LJII(r0, r8, r9)
            r0 = r18
            if (r7 != 0) goto L6f
            r6.LLJ = r12
            java.lang.Object r1 = r0.invoke(r6)
            if (r1 != r5) goto L6e
            return r5
        L6b:
            X.C155000ia.LIZIZ(r1)
        L6e:
            return r1
        L6f:
            if (r3 == 0) goto L74
            LIZIZ(r7, r8, r9, r11)
        L74:
            r6.LL = r8     // Catch: java.lang.Throwable -> Lb1
            r6.LLILLJJLI = r9     // Catch: java.lang.Throwable -> Lb1
            r6.LLILLL = r11     // Catch: java.lang.Throwable -> Lb1
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> Lb1
            r6.LLILZIL = r7     // Catch: java.lang.Throwable -> Lb1
            r6.LLILZLL = r3     // Catch: java.lang.Throwable -> Lb1
            r6.LLJ = r4     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r1 = r0.invoke(r6)     // Catch: java.lang.Throwable -> Lb1
            if (r1 != r5) goto L89
            return r5
        L89:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r2.invoke(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L9d
            if (r3 == 0) goto Lb0
            LIZJ(r7, r8, r9, r1, r11)     // Catch: java.lang.Throwable -> Lb1
            return r1
        L9d:
            X.0JlZ r10 = new X.0JlZ     // Catch: java.lang.Throwable -> Lb1
            r0 = 100010001(0x5f60811, float:2.3136692E-35)
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lb1
            r10.setLogId(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto Lad
            r12 = 0
        Lad:
            LIZ(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb1
        Lb0:
            return r1
        Lb1:
            r10 = move-exception
            goto Lb4
        Lb3:
            r10 = move-exception
        Lb4:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r10)
            r7 = r7
            r8 = r8
            r9 = r9
            r11 = r11
            r12 = r3
            LIZ(r7, r8, r9, r10, r11, r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1808280x9m.LIZLLL(java.lang.String, java.lang.String, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
