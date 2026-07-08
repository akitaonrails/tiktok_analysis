package X;

import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11cZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19539711cZ extends AbstractC19524211a4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19524011a2
    public final void LJI() {
        AbstractC1219760hqY abstractC1219760hqY = new AbstractC1219760hqY() { // from class: X.11bg
            public final String LJIIIZ = "SCCacheCheck";

            @Override // X.AbstractC19526011aM
            public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
            }

            @Override // X.InterfaceC19524311a5
            public final String LJIILLIIL() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC1219760hqY
            public final Object LJJIJL(List list) {
                boolean z;
                boolean z2;
                Iterator it2 = list.iterator();
                loop0: while (true) {
                    z = true;
                    while (it2.hasNext()) {
                        InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                        String str = (String) LJJIII(interfaceC19526611aS, "SC_LOCAL_PATH");
                        if (str != null && str.length() > 0 && LJJIII(interfaceC19526611aS, "TIME_WARP") != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z || !z2) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    return "JUMP_TO_END";
                }
                return "JUMP_TO_REQUIRE";
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
            @Override // X.AbstractC19526011aM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJIJJ(X.InterfaceC19526611aS r12, X.C11ZU r13) {
                /*
                    r11 = this;
                    r10 = 0
                    if (r13 != 0) goto L4
                    return r10
                L4:
                    java.lang.String r0 = "SPEAKER_ID"
                    java.lang.Object r5 = r11.LJJIII(r12, r0)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 != 0) goto Lf
                    return r10
                Lf:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = r12.LJJ()
                    r1.append(r0)
                    r1.append(r5)
                    java.lang.String r4 = "TIME_WARP"
                    r1.append(r4)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    long r6 = android.os.SystemClock.uptimeMillis()
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r13.LIZ
                    java.lang.Object r3 = r0.get(r1)
                    X.11ZT r3 = (X.C11ZT) r3
                    r8 = 1000(0x3e8, double:4.94E-321)
                    if (r3 == 0) goto L40
                    java.lang.Integer r2 = r3.LIZIZ
                    if (r2 != 0) goto L41
                    T r3 = r3.LIZ
                    boolean r0 = r3 instanceof java.util.List
                    if (r0 != 0) goto L55
                L40:
                    return r10
                L41:
                    long r0 = r3.LIZJ
                    long r6 = r6 - r0
                    int r0 = r2.intValue()
                    long r1 = (long) r0
                    long r1 = r1 * r8
                    int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L40
                    T r3 = r3.LIZ
                    boolean r0 = r3 instanceof java.util.List
                    if (r0 != 0) goto L55
                    return r10
                L55:
                    if (r3 == 0) goto L40
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r0 = r12.LJJ()
                    r1.append(r0)
                    r1.append(r5)
                    java.lang.String r1 = r1.toString()
                    long r6 = android.os.SystemClock.uptimeMillis()
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r13.LIZ
                    java.lang.Object r5 = r0.get(r1)
                    X.11ZT r5 = (X.C11ZT) r5
                    if (r5 == 0) goto L82
                    java.lang.Integer r2 = r5.LIZIZ
                    if (r2 != 0) goto L83
                    T r1 = r5.LIZ
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 != 0) goto L97
                L82:
                    return r10
                L83:
                    long r0 = r5.LIZJ
                    long r6 = r6 - r0
                    int r0 = r2.intValue()
                    long r1 = (long) r0
                    long r1 = r1 * r8
                    int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L82
                    T r1 = r5.LIZ
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 != 0) goto L97
                    return r10
                L97:
                    if (r1 == 0) goto L82
                    java.lang.String r0 = "SC_LOCAL_PATH"
                    r11.LJJIJIIJI(r12, r0, r1)
                    r11.LJJIJIIJI(r12, r4, r3)
                    r0 = 1
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19534211bg.LJIJJ(X.11aS, X.11ZU):boolean");
            }

            @Override // X.AbstractC1219760hqY
            public final Object LJJIJIL(InterfaceC19526511aR interfaceC19526511aR, InterfaceC19526611aS interfaceC19526611aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return Unit.LIZ;
            }
        };
        if (abstractC1219760hqY instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) abstractC1219760hqY).LJII();
        }
        abstractC1219760hqY.LJIJ("SPEAKER_ID", "speaker_id");
        abstractC1219760hqY.LJIJ("TIME_WARP", "time_warp");
        abstractC1219760hqY.LJIJ("SC_LOCAL_PATH", "res_vc_file_path");
        AbstractC1219760hqY abstractC1219760hqY2 = new AbstractC1219760hqY() { // from class: X.11ce
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
            public final String LJIIIZ = "ExtractAudio";
            public final C19523211Zu LJIIJ = new C19523211Zu(this, "MultipleExtract");

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C19540211ce.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPMultipleExtractAbility;", 0);
                C13LE.LIZ.getClass();
                LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.InterfaceC19524311a5
            public final String LJIILLIIL() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC1219760hqY
            public final Object LJJIJL(List list) {
                boolean z;
                String str;
                Iterator it2 = list.iterator();
                loop0: while (true) {
                    z = true;
                    while (it2.hasNext()) {
                        InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                        if (!z || (str = (String) LJJIII(interfaceC19526611aS, "Extract_File_Path")) == null || str.length() <= 0) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    return "_CONNECT_ID_DEFAULT";
                }
                return "_CONNECT_ID_TERMINATION_ERROR";
            }

            @Override // X.AbstractC19526011aM
            public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                if (c11zu == null) {
                    return false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC19526611aS.LJJ());
                sbLIZ.append("Extract_File_Path");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                long jUptimeMillis = SystemClock.uptimeMillis();
                C11ZT<?> c11zt = c11zu.LIZ.get(strLIZIZ);
                Object obj = null;
                if (c11zt != null) {
                    Integer num = c11zt.LIZIZ;
                    if (num == null) {
                        Object obj2 = c11zt.LIZ;
                        if (obj2 instanceof String) {
                            obj = obj2;
                        }
                    } else if (jUptimeMillis - c11zt.LIZJ < ((long) num.intValue()) * 1000) {
                        Object obj3 = c11zt.LIZ;
                        if (obj3 instanceof String) {
                            obj = obj3;
                        }
                    }
                }
                LJJIJIIJI(interfaceC19526611aS, "Extract_File_Path", obj);
                if (obj == null) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC19526011aM
            public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                Object objLJJIII;
                if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "Extract_File_Path")) == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC19526611aS.LJJ());
                sbLIZ.append("Extract_File_Path");
                c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), objLJJIII);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
            @Override // X.AbstractC1219760hqY
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r15, X.InterfaceC19526611aS r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
                /*
                    r14 = this;
                    r3 = r17
                    r6 = r16
                    boolean r0 = r3 instanceof X.C19541311cp
                    r5 = r14
                    if (r0 == 0) goto L95
                    r13 = r3
                    X.11cp r13 = (X.C19541311cp) r13
                    int r2 = r13.LLILZIL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L95
                    int r2 = r2 - r1
                    r13.LLILZIL = r2
                L17:
                    java.lang.Object r3 = r13.LLILLL
                    java.lang.Object r2 = X.C099R.LJFF()
                    int r0 = r13.LLILZIL
                    r1 = 1
                    if (r0 == 0) goto L49
                    if (r0 != r1) goto L9c
                    java.lang.Object r8 = r13.LLILLJJLI
                    X.11aS r6 = r13.LL
                    X.C155000ia.LIZIZ(r3)
                L2b:
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r7 = r3.intValue()
                L31:
                    java.lang.String r0 = "Extract_File_Path"
                    if (r7 != 0) goto L3b
                    r5.LJJIJIIJI(r6, r0, r8)
                L38:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L3b:
                    r10 = 0
                    r5.LJJIJIIJI(r6, r0, r10)
                    java.lang.String r8 = "extract error"
                    java.lang.String r9 = r5.LJIIIZ
                    X.11YJ r11 = X.C11YJ.VE_SDK
                    r5.LJJIIZI(r6, r7, r8, r9, r10, r11)
                    goto L38
                L49:
                    X.C155000ia.LIZIZ(r3)
                    java.lang.String r0 = "NleModel"
                    java.lang.Object r9 = r5.LJJIII(r6, r0)
                    com.bytedance.ies.nle.editor_jni.NLEModel r9 = (com.bytedance.ies.nle.editor_jni.NLEModel) r9
                    if (r9 != 0) goto L59
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                L59:
                    java.lang.String r0 = "Set_Extract_File_Path"
                    java.lang.Object r8 = r5.LJJIII(r6, r0)
                    java.lang.String r8 = (java.lang.String) r8
                    if (r8 != 0) goto L65
                    java.lang.String r8 = ""
                L65:
                    X.11Zu r4 = r5.LJIIJ
                    X.1Bqa<java.lang.Object>[] r3 = X.C19540211ce.LJIIJJI
                    r0 = 0
                    r0 = r3[r0]
                    java.lang.Object r7 = r4.getValue(r5, r0)
                    X.11d5 r7 = (X.InterfaceC19542911d5) r7
                    if (r7 == 0) goto L93
                    com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig r0 = X.C1461100o7o.LIZ()
                    int r10 = r0.channels
                    com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig r0 = X.C1461100o7o.LIZ()
                    int r11 = r0.bitRate
                    com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig r0 = X.C1461100o7o.LIZ()
                    int r12 = r0.sampleRate
                    r13.LL = r6
                    r13.LLILLJJLI = r8
                    r13.LLILZIL = r1
                    java.lang.Object r3 = r7.LJIIL(r8, r9, r10, r11, r12, r13)
                    if (r3 != r2) goto L2b
                    return r2
                L93:
                    r7 = -1
                    goto L31
                L95:
                    X.11cp r13 = new X.11cp
                    r13.<init>(r5, r3)
                    goto L17
                L9c:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19540211ce.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
            }
        };
        if (abstractC1219760hqY2 instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) abstractC1219760hqY2).LJII();
        }
        abstractC1219760hqY2.LJIJ("NleModel", "original_nle_model");
        abstractC1219760hqY2.LJIJ("Set_Extract_File_Path", "extract_file_path");
        abstractC1219760hqY2.LJIJ("Extract_File_Path", "extract_res_path");
        C19540311cf c19540311cf = new C19540311cf();
        if (c19540311cf instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540311cf).LJII();
        }
        c19540311cf.LJIJ("AUTH_KEY", "authKey");
        C19539911cb c19539911cb = new C19539911cb();
        if (c19539911cb instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19539911cb).LJII();
        }
        c19539911cb.LJIJ("AUTH_KEY", "authKey");
        c19539911cb.LJIJ("Extract_File_Path", "extract_res_path");
        c19539911cb.LJIJ("VID", "original_vid");
        AbstractC19526011aM abstractC19526011aM = new AbstractC19526011aM() { // from class: X.11ca
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
            public final String LJIIIZ = "FetchSC";
            public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchSC_SDK");

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C19539811ca.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchSCBySDKAbility;", 0);
                C13LE.LIZ.getClass();
                LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.AbstractC19526011aM
            public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                return false;
            }

            @Override // X.InterfaceC19524311a5
            public final String LJIILLIIL() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC19526011aM
            public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                Object objLJJIII;
                String str;
                if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "TIME_WARP")) == null || (str = (String) LJJIII(interfaceC19526611aS, "SpeakerId")) == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(interfaceC19526611aS.LJJ());
                sbLIZ.append(str);
                sbLIZ.append("TIME_WARP");
                c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), objLJJIII);
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
            @Override // X.AbstractC19526011aM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJIJI(X.InterfaceC19526511aR r17, java.util.List<? extends X.InterfaceC19526611aS> r18, java.util.List<? extends X.InterfaceC19526611aS> r19, X.InterfaceC1364105Vn<? super java.lang.String> r20) {
                /*
                    Method dump skipped, instruction units count: 275
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19539811ca.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
            }
        };
        if (abstractC19526011aM instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) abstractC19526011aM).LJII();
        }
        abstractC19526011aM.LJIJ("VID", "original_vid");
        abstractC19526011aM.LJIJ("SpeakerId", "speaker_id");
        abstractC19526011aM.LJIJ("SamiRequestCommonData", "request_common_data");
        abstractC19526011aM.LJIJ("DOWNLOAD_URL", "download_url");
        abstractC19526011aM.LJIJ("LOG_ID", "server_log_id");
        abstractC19526011aM.LJIJ("TIME_WARP", "time_warp");
        C19540011cc c19540011cc = new C19540011cc("DownloadSC");
        if (c19540011cc instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540011cc).LJII();
        }
        c19540011cc.LJIJ("DOWNLOAD_URL", "download_url");
        c19540011cc.LJIJ("SPEAKER_ID", "speaker_id");
        c19540011cc.LJIJ("TARGET_PATH", "set_vc_file_path");
        c19540011cc.LJIJ("VC_FILE_PATH", "res_vc_file_path");
        c19540311cf.LJJIIZ(1, "schedule_item_all");
        c19539911cb.LJJIIJ("schedule_handler_all", C1697810uHb.LJIIJJI(abstractC1219760hqY2, c19540311cf));
        LJJIJIIJIL(abstractC1219760hqY, "JUMP_TO_REQUIRE", abstractC1219760hqY2);
        LJJIJIIJIL(abstractC1219760hqY, "JUMP_TO_REQUIRE", c19540311cf);
        LJJIJIIJIL(abstractC1219760hqY2, "_CONNECT_ID_DEFAULT", c19539911cb);
        LJJIJIIJIL(c19540311cf, "_CONNECT_ID_DEFAULT", c19539911cb);
        LJJIJIIJIL(c19539911cb, "_CONNECT_ID_DEFAULT", abstractC19526011aM);
        LJJIJIIJIL(abstractC19526011aM, "_CONNECT_ID_DEFAULT", c19540011cc);
        LJJIZ(C1697810uHb.LJ(abstractC1219760hqY));
        LJJIJLIJ(C1697810uHb.LJIIJJI(new C19524511a7(c19540011cc), new C19524511a7(abstractC1219760hqY, "JUMP_TO_END", false)));
    }

    @Override // X.AbstractC19524211a4
    public final void LJJIJL() {
        C19522911Zr c19522911Zr = new C19522911Zr();
        c19522911Zr.LIZIZ("MultipleExtract", new InterfaceC19523111Zt<InterfaceC19542911d5>() { // from class: X.11d1
            @Override // X.InterfaceC19523111Zt
            public final C11ZA LJIIIIZZ() {
                return new InterfaceC19542911d5() { // from class: X.0o7l
                    @Override // X.InterfaceC19542911d5
                    public final Object LJIIL(String str, NLEModel nLEModel, int i, int i2, int i3, C19541311cp c19541311cp) {
                        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19541311cp));
                        Integer numLJ = C2286608xc.LJ(C1461020o7g.LIZIZ(C1461020o7g.LIZ, str, nLEModel, i, i2, i3, true, false, 192).ordinal());
                        C189200o6.m2constructorimpl(numLJ);
                        c23260099m.resumeWith(numLJ);
                        Object objLIZ = c23260099m.LIZ();
                        if (objLIZ == C099R.LJFF()) {
                            C099Q.LIZJ(c19541311cp);
                        }
                        return objLIZ;
                    }
                };
            }
        });
        c19522911Zr.LIZIZ("DownloadAudioFile", new C19542211cy());
        c19522911Zr.LIZIZ("FetchSC_SDK", new InterfaceC19523111Zt<InterfaceC19543411dA>() { // from class: X.11cz
            @Override // X.InterfaceC19523111Zt
            public final C11ZA LJIIIIZZ() {
                return new InterfaceC19543411dA() { // from class: X.09TT
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
                    @Override // X.InterfaceC19543411dA
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LIZ(java.lang.String r11, java.lang.String r12, X.C19541211co r13) {
                        /*
                            Method dump skipped, instruction units count: 327
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C09TT.LIZ(java.lang.String, java.lang.String, X.11co):java.lang.Object");
                    }
                };
            }
        });
        c19522911Zr.LIZIZ("GetAuthKey", new C19542411d0());
        c19522911Zr.LIZIZ("UploadAudio", new C19542711d3());
        this.LIZLLL = c19522911Zr;
    }
}
