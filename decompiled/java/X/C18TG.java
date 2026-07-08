package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPerfModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18TG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18TG extends AbstractC2255721DQs<C18U5> implements C18U5, InterfaceC379610EuV {
    public static final C18TK LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public C18TR<? extends C869590Y9l> LLILZ;
    public C1153740g84 LLILZLL;
    public final C18U5 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public final InterfaceC497601wk LLILZIL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.18TK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18TG.class, "sessionInfo", "getSessionInfo()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.18TK
        };
        LLJ = 8;
    }

    private final boolean H2() {
        String str = C1357150lQ9.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentGenerationInfoState is Generating = ");
        sbLIZ.append(this.LLILZ instanceof C18TN);
        sbLIZ.append("; currentGenerationInfoState is AwaitingGeneration = ");
        sbLIZ.append(this.LLILZ instanceof C18TQ);
        sbLIZ.append("; VPAIChatGenerateServiceProvider.getService().isSuspendCancel() = ");
        sbLIZ.append(C21163117rp.LIZIZ().LJFF());
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (W1()) {
            C18TR<? extends C869590Y9l> c18tr = this.LLILZ;
            return ((c18tr instanceof C18TN) || (c18tr instanceof C18TQ)) && !C21163117rp.LIZIZ().LJFF();
        }
        C18TR<? extends C869590Y9l> c18tr2 = this.LLILZ;
        return (c18tr2 instanceof C18TN) || (c18tr2 instanceof C18TQ);
    }

    public final C18UJ Z1() {
        return (C18UJ) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final boolean W1() {
        AIChatGenChatRoomModel aIChatGenChatRoomModel = Z1().LJ.chatRoomModel;
        return Intrinsics.LJFF(aIChatGenChatRoomModel != null ? aIChatGenChatRoomModel.entranceType : null, "comment") && C0C64.LJIILLIIL().LJIJ(31744, 0, "comment_ai_chat_exit_cancel_generation", true) != 2;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        String str = C18TJ.LIZ;
        String str2 = Z1().LIZJ;
        if (!Intrinsics.LJFF(C18TJ.LIZ, str2)) {
            C18TJ.LIZ = str2;
            C18TJ.LIZIZ.clear();
        }
        C09IC.LJJI(this.LLILZIL, new C861640Xr8(new C18TH(this, null), C21163117rp.LIZIZ().LJ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r7 = this;
            super.onDestroy()
            boolean r0 = r7.H2()
            r4 = 0
            if (r0 == 0) goto L61
            X.18UP r2 = X.C18UP.LIZ
            X.18UJ r6 = r7.Z1()
            X.18TR<? extends X.0Y9l> r0 = r7.LLILZ
            if (r0 == 0) goto L7d
            X.0Zmp r0 = r0.LIZ()
            if (r0 == 0) goto L7d
            X.0Y9l r0 = r0.LIZ
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode r5 = X.C18UO.LIZLLL(r0)
        L22:
            X.18TR<? extends X.0Y9l> r0 = r7.LLILZ
            if (r0 == 0) goto L7b
            X.0Zmp r0 = r0.LIZ()
            if (r0 == 0) goto L7b
            X.0Y9l r0 = r0.LIZ
            if (r0 == 0) goto L7b
            long r0 = r0.getCreatedAt()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L38:
            r2.getClass()
            java.lang.Long r0 = X.C18UP.LIZJ
            if (r0 != 0) goto L67
            if (r1 != 0) goto L68
            r0 = r4
        L42:
            X.C18UP.LIZJ = r4
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            X.C18UP.LIZ(r3, r6)
            X.C18UP.LIZIZ(r3, r5)
            if (r0 == 0) goto L5a
            long r1 = r0.longValue()
            java.lang.String r0 = "waiting_duration"
            r3.LIZIZ(r1, r0)
        L5a:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "vp_generate_leave"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L61:
            X.01wk r0 = r7.LLILZIL
            X.C2296808zG.LIZJ(r0, r4)
            return
        L67:
            r1 = r0
        L68:
            long r2 = r1.longValue()
            X.18U8 r0 = X.C18U8.LIZ
            r0.getClass()
            long r0 = X.C18U8.LIZ()
            long r0 = r0 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L42
        L7b:
            r1 = r4
            goto L38
        L7d:
            r5 = r4
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18TG.onDestroy():void");
    }

    public C18U5 X1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C18TG(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void G2(C18TO<C869590Y9l> c18to) {
        AIChatGenNode aIChatGenNodeLIZLLL;
        String clientTaskId;
        Long lValueOf;
        String string;
        Boolean boolValueOf;
        Long lLIZ;
        String clientTaskId2;
        String uuid;
        C869590Y9l c869590Y9l = c18to.LIZIZ.LIZ;
        AIChatGenPerfModel perfInfo = null;
        if (c869590Y9l != null) {
            aIChatGenNodeLIZLLL = C18UO.LIZLLL(c869590Y9l);
        } else {
            aIChatGenNodeLIZLLL = null;
        }
        C869590Y9l c869590Y9l2 = c18to.LIZIZ.LIZ;
        if (c869590Y9l2 != null && (uuid = c869590Y9l2.getUuid()) != null) {
            C18TJ.LIZIZ.add(uuid);
        }
        if (aIChatGenNodeLIZLLL != null) {
            clientTaskId = aIChatGenNodeLIZLLL.getClientTaskId();
        } else {
            clientTaskId = null;
        }
        C1153740g84 c1153740g84KT = kT(clientTaskId);
        C18UP c18up = C18UP.LIZ;
        C18UJ c18ujZ1 = Z1();
        C869590Y9l c869590Y9l3 = c18to.LIZIZ.LIZ;
        if (c869590Y9l3 != null) {
            lValueOf = Long.valueOf(c869590Y9l3.getCreatedAt());
        } else {
            lValueOf = null;
        }
        C869590Y9l c869590Y9l4 = c18to.LIZIZ.LIZ;
        if (c869590Y9l4 != null) {
            string = Long.valueOf(c869590Y9l4.getMsgId()).toString();
        } else {
            string = null;
        }
        C0NCT c0nct = C0NCT.SUCCESS;
        if (c1153740g84KT != null) {
            boolValueOf = Boolean.valueOf(c1153740g84KT.LIZJ);
            if (aIChatGenNodeLIZLLL != null) {
                clientTaskId2 = aIChatGenNodeLIZLLL.getClientTaskId();
            } else {
                clientTaskId2 = null;
            }
            lLIZ = C1153750g85.LIZ(c1153740g84KT, clientTaskId2);
        } else {
            boolValueOf = null;
            lLIZ = null;
        }
        c18up.getClass();
        C18UP.LJIIIIZZ(c18ujZ1, aIChatGenNodeLIZLLL, lValueOf, string, null, c0nct, boolValueOf, lLIZ);
        C18T2 c18t2 = C18T2.LIZ;
        if (aIChatGenNodeLIZLLL != null) {
            perfInfo = aIChatGenNodeLIZLLL.getPerfInfo();
        }
        c18t2.getClass();
        C18T3 c18t3 = C18T2.LIZIZ.get("ai_chat_image_generation_duration");
        if (c18t3 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c18t3.LIZIZ = jCurrentTimeMillis;
            if (jCurrentTimeMillis - c18t3.LIZ >= 0) {
                C0LAB c0labLIZJ = C18T2.LIZJ();
                c0labLIZJ.LIZIZ(c18t3.LIZIZ - c18t3.LIZ, "duration");
                if (perfInfo != null) {
                    Long clientDurationMs = perfInfo.getClientDurationMs();
                    if (clientDurationMs != null) {
                        c0labLIZJ.LIZIZ(clientDurationMs.longValue(), "client_duration_ms");
                    }
                    if (perfInfo != null) {
                        String serverDurationS = perfInfo.getServerDurationS();
                        if (serverDurationS != null) {
                            if (((Boolean) C268630Aft.LIZ.getValue()).booleanValue()) {
                                Double dLJII = C2327809Ae.LJII(serverDurationS);
                                if (dLJII != null) {
                                    c0labLIZJ.LIZ((int) (dLJII.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), "server_duration_s");
                                }
                            } else {
                                c0labLIZJ.LJ("server_duration_s", serverDurationS);
                            }
                        }
                        String serverIntentionDurationS = perfInfo.getServerIntentionDurationS();
                        if (serverIntentionDurationS != null) {
                            if (((Boolean) C268630Aft.LIZ.getValue()).booleanValue()) {
                                Double dLJII2 = C2327809Ae.LJII(serverIntentionDurationS);
                                if (dLJII2 != null) {
                                    c0labLIZJ.LIZ((int) (dLJII2.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), "server_intention_duration_s");
                                }
                            } else {
                                c0labLIZJ.LJ("server_intention_duration_s", serverIntentionDurationS);
                            }
                        }
                        String serverGenerateDurationS = perfInfo.getServerGenerateDurationS();
                        if (serverGenerateDurationS != null) {
                            if (((Boolean) C268630Aft.LIZ.getValue()).booleanValue()) {
                                Double dLJII3 = C2327809Ae.LJII(serverGenerateDurationS);
                                if (dLJII3 != null) {
                                    c0labLIZJ.LIZ((int) (dLJII3.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), "server_generate_duration_s");
                                }
                            } else {
                                c0labLIZJ.LJ("server_generate_duration_s", serverGenerateDurationS);
                            }
                        }
                    }
                }
                C20684815ws.LJIILLIIL("ai_chat_image_generation_duration", c0labLIZJ.LIZ);
            }
        }
    }

    @Override // X.C18U5
    public void eT1(String str) {
        if ((C21138217no.LIZ() & 8) != 0) {
            synchronized (this) {
                try {
                    this.LLILZLL = new C1153740g84(12, Long.valueOf(SystemClock.uptimeMillis()), null, str, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C18U5
    public C1153740g84 kT(String str) {
        boolean z;
        String str2;
        if ((C21138217no.LIZ() & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        synchronized (this) {
            try {
                C1153740g84 c1153740g84 = this.LLILZLL;
                if (c1153740g84 != null) {
                    str2 = c1153740g84.LIZ;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str, str2)) {
                    return null;
                }
                return this.LLILZLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C18U5
    public void lK2(String str) {
        String str2;
        C1153740g84 c1153740g84;
        if ((C21138217no.LIZ() & 8) != 0) {
            synchronized (this) {
                try {
                    C1153740g84 c1153740g842 = this.LLILZLL;
                    Long l = null;
                    if (c1153740g842 != null) {
                        str2 = c1153740g842.LIZ;
                    } else {
                        str2 = null;
                    }
                    if (!Intrinsics.LJFF(str, str2)) {
                        c1153740g84 = new C1153740g84(2, null, Long.valueOf(SystemClock.uptimeMillis()), str, true);
                    } else {
                        C1153740g84 c1153740g843 = this.LLILZLL;
                        if (c1153740g843 != null) {
                            l = c1153740g843.LIZIZ;
                        }
                        c1153740g84 = new C1153740g84(l, Long.valueOf(SystemClock.uptimeMillis()), str, true);
                    }
                    this.LLILZLL = c1153740g84;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void o2(C909930Zmp c909930Zmp) {
        AIChatGenNode aIChatGenNodeLIZLLL;
        String clientTaskId;
        Long lValueOf;
        String string;
        Boolean boolValueOf;
        String uuid;
        C869590Y9l c869590Y9l = c909930Zmp.LIZ;
        Long lLIZ = null;
        String clientTaskId2 = null;
        if (c869590Y9l != null) {
            aIChatGenNodeLIZLLL = C18UO.LIZLLL(c869590Y9l);
        } else {
            aIChatGenNodeLIZLLL = null;
        }
        C869590Y9l c869590Y9l2 = c909930Zmp.LIZ;
        if (c869590Y9l2 != null && (uuid = c869590Y9l2.getUuid()) != null) {
            C18TJ.LIZIZ.add(uuid);
        }
        if (aIChatGenNodeLIZLLL != null) {
            clientTaskId = aIChatGenNodeLIZLLL.getClientTaskId();
        } else {
            clientTaskId = null;
        }
        C1153740g84 c1153740g84KT = kT(clientTaskId);
        C18UP c18up = C18UP.LIZ;
        C18UJ c18ujZ1 = Z1();
        C869590Y9l c869590Y9l3 = c909930Zmp.LIZ;
        if (c869590Y9l3 != null) {
            lValueOf = Long.valueOf(c869590Y9l3.getCreatedAt());
        } else {
            lValueOf = null;
        }
        C869590Y9l c869590Y9l4 = c909930Zmp.LIZ;
        if (c869590Y9l4 != null) {
            string = Long.valueOf(c869590Y9l4.getMsgId()).toString();
        } else {
            string = null;
        }
        C0NCT c0nct = C0NCT.CANCELED;
        if (c1153740g84KT != null) {
            boolValueOf = Boolean.valueOf(c1153740g84KT.LIZJ);
            if (aIChatGenNodeLIZLLL != null) {
                clientTaskId2 = aIChatGenNodeLIZLLL.getClientTaskId();
            }
            lLIZ = C1153750g85.LIZ(c1153740g84KT, clientTaskId2);
        } else {
            boolValueOf = null;
        }
        c18up.getClass();
        C18UP.LJIIIIZZ(c18ujZ1, aIChatGenNodeLIZLLL, lValueOf, string, "cancel", c0nct, boolValueOf, lLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w2(X.C909930Zmp r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18TG.w2(X.0Zmp):void");
    }
}
