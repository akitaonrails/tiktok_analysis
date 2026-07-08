package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.11cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19539611cY extends AbstractC19524211a4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19524011a2
    public final void LJI() {
        AbstractC1219760hqY abstractC1219760hqY = new AbstractC1219760hqY() { // from class: X.11be
            public final String LJIIIZ = "VCCacheCheck";

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
                        String str = (String) LJJIII(interfaceC19526611aS, "VC_LOCAL_PATH");
                        if ((str != null && str.length() > 0) || Intrinsics.LJFF(LJJIII(interfaceC19526611aS, "IS_MUTE"), false)) {
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

            /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
            @Override // X.AbstractC19526011aM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJIJJ(X.InterfaceC19526611aS r13, X.C11ZU r14) {
                /*
                    r12 = this;
                    r11 = 0
                    if (r14 != 0) goto L4
                    return r11
                L4:
                    java.lang.String r0 = "SPEAKER_ID"
                    java.lang.Object r3 = r12.LJJIII(r13, r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto Lf
                    return r11
                Lf:
                    java.lang.String r1 = r13.LJJ()
                    long r9 = android.os.SystemClock.uptimeMillis()
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r14.LIZ
                    java.lang.Object r5 = r0.get(r1)
                    X.11ZT r5 = (X.C11ZT) r5
                    r7 = 1000(0x3e8, double:4.94E-321)
                    r4 = 0
                    if (r5 == 0) goto L53
                    java.lang.Integer r2 = r5.LIZIZ
                    if (r2 != 0) goto L3e
                    T r2 = r5.LIZ
                    boolean r0 = r2 instanceof java.lang.Boolean
                    if (r0 != 0) goto L2f
                    r2 = r4
                L2f:
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
                    r6 = 1
                    if (r0 == 0) goto L55
                    java.lang.String r0 = "IS_MUTE"
                    r12.LJJIJIIJI(r13, r0, r1)
                    return r6
                L3e:
                    long r0 = r5.LIZJ
                    long r9 = r9 - r0
                    int r0 = r2.intValue()
                    long r1 = (long) r0
                    long r1 = r1 * r7
                    int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L53
                    T r2 = r5.LIZ
                    boolean r0 = r2 instanceof java.lang.Boolean
                    if (r0 != 0) goto L2f
                    r2 = r4
                    goto L2f
                L53:
                    r2 = r4
                    goto L2f
                L55:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r0 = r13.LJJ()
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    long r4 = android.os.SystemClock.uptimeMillis()
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r14.LIZ
                    java.lang.Object r3 = r0.get(r1)
                    X.11ZT r3 = (X.C11ZT) r3
                    if (r3 == 0) goto L80
                    java.lang.Integer r2 = r3.LIZIZ
                    if (r2 != 0) goto L81
                    T r1 = r3.LIZ
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 != 0) goto L95
                L80:
                    return r11
                L81:
                    long r0 = r3.LIZJ
                    long r4 = r4 - r0
                    int r0 = r2.intValue()
                    long r1 = (long) r0
                    long r1 = r1 * r7
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L80
                    T r1 = r3.LIZ
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 != 0) goto L95
                    return r11
                L95:
                    if (r1 == 0) goto L80
                    java.lang.String r0 = "VC_LOCAL_PATH"
                    r12.LJJIJIIJI(r13, r0, r1)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19534011be.LJIJJ(X.11aS, X.11ZU):boolean");
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
        abstractC1219760hqY.LJIJ("IS_MUTE", "mute_check_res");
        abstractC1219760hqY.LJIJ("VC_LOCAL_PATH", "res_vc_file_path");
        C19540511ch c19540511ch = new C19540511ch();
        if (c19540511ch instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540511ch).LJII();
        }
        c19540511ch.LJIJ("ORIGINAL_FILE_PATH", "original_file_path");
        c19540511ch.LJIJ("MUTE_CHECK_RESULT", "mute_check_res");
        C19540111cd c19540111cd = new C19540111cd();
        if (c19540111cd instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540111cd).LJII();
        }
        c19540111cd.LJIJ("Original_File_Path", "original_file_path");
        c19540111cd.LJIJ("Set_Extract_File_Path", "extract_file_path");
        c19540111cd.LJIJ("Extract_File_Path", "extract_res_path");
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
        AbstractC19526011aM abstractC19526011aM = new AbstractC19526011aM() { // from class: X.11cS
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
            public final String LJIIIZ = "FetchVC";
            public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchVC");

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C19539011cS.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchVCAbility;", 0);
                C13LE.LIZ.getClass();
                LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.AbstractC19526011aM
            public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                return false;
            }

            @Override // X.AbstractC19526011aM
            public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
            }

            @Override // X.InterfaceC19524311a5
            public final String LJIILLIIL() {
                return this.LJIIIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
            /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0XPV] */
            @Override // X.AbstractC19526011aM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJIJI(X.InterfaceC19526511aR r21, java.util.List<? extends X.InterfaceC19526611aS> r22, java.util.List<? extends X.InterfaceC19526611aS> r23, X.InterfaceC1364105Vn<? super java.lang.String> r24) {
                /*
                    Method dump skipped, instruction units count: 546
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19539011cS.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
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
        C19540011cc c19540011cc = new C19540011cc("DownloadVC");
        if (c19540011cc instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540011cc).LJII();
        }
        c19540011cc.LJIJ("DOWNLOAD_URL", "download_url");
        c19540011cc.LJIJ("SPEAKER_ID", "speaker_id");
        c19540011cc.LJIJ("TARGET_PATH", "set_vc_file_path");
        c19540011cc.LJIJ("VC_FILE_PATH", "res_vc_file_path");
        c19540311cf.LJJIIZ(1, "schedule_item_all");
        c19539911cb.LJJIIJ("schedule_handler_all", C1697810uHb.LJIIJJI(c19540111cd, c19540311cf));
        abstractC19526011aM.LJJIIZ(20, "schedule_item_add_to_max");
        c19540511ch.LJJIIZ(1, "schedule_item_add_to_max");
        LJJIJIIJIL(abstractC1219760hqY, "JUMP_TO_REQUIRE", c19540511ch);
        LJJIJIIJIL(c19540511ch, "_CONNECT_ID_DEFAULT", c19540111cd);
        LJJIJIIJIL(c19540511ch, "_CONNECT_ID_DEFAULT", c19540311cf);
        LJJIJIIJIL(c19540111cd, "_CONNECT_ID_DEFAULT", c19539911cb);
        LJJIJIIJIL(c19540311cf, "_CONNECT_ID_DEFAULT", c19539911cb);
        LJJIJIIJIL(c19539911cb, "_CONNECT_ID_DEFAULT", abstractC19526011aM);
        LJJIJIIJIL(abstractC19526011aM, "_CONNECT_ID_DEFAULT", c19540011cc);
        LJJIZ(C1697810uHb.LJ(abstractC1219760hqY));
        LJJIJLIJ(C1697810uHb.LJIIJJI(new C19524511a7(c19540011cc), new C19524511a7(abstractC1219760hqY, "JUMP_TO_END", false)));
    }

    @Override // X.AbstractC19524211a4
    public final void LJJIJL() {
        C19522911Zr c19522911Zr = new C19522911Zr();
        c19522911Zr.LIZIZ("CheckAudioFile", new C19542111cx());
        c19522911Zr.LIZIZ("DownloadAudioFile", new C19542211cy());
        c19522911Zr.LIZIZ("FetchVC", new InterfaceC19523111Zt<InterfaceC19538811cQ>() { // from class: X.11cP
            @Override // X.InterfaceC19523111Zt
            public final C11ZA LJIIIIZZ() {
                return new InterfaceC19538811cQ() { // from class: X.11cJ
                    @Override // X.InterfaceC19538811cQ
                    public final Object LJIIJ(JSONArray jSONArray, JSONArray jSONArray2, C0XPV c0xpv, C19539111cT c19539111cT) {
                        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c19539111cT));
                        if (jSONArray.length() == 0 || jSONArray2.length() == 0) {
                            C189200o6.m2constructorimpl(null);
                            c23260099m.resumeWith(null);
                        } else {
                            VCAudioResponse vCAudioResponseLIZ = C0XPU.LIZ(jSONArray, jSONArray2, c0xpv);
                            C189200o6.m2constructorimpl(vCAudioResponseLIZ);
                            c23260099m.resumeWith(vCAudioResponseLIZ);
                        }
                        Object objLIZ = c23260099m.LIZ();
                        if (objLIZ == C099R.LJFF()) {
                            C099Q.LIZJ(c19539111cT);
                        }
                        return objLIZ;
                    }
                };
            }
        });
        c19522911Zr.LIZIZ("GetAuthKey", new C19542411d0());
        c19522911Zr.LIZIZ("SingleExtract", new C19542611d2());
        c19522911Zr.LIZIZ("UploadAudio", new C19542711d3());
        this.LIZLLL = c19522911Zr;
    }
}
