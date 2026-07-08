package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.translation.model.PerfMetric;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1624, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1624 extends C162R<C1869640ykk> {
    public static final AnonymousClass1624 LJ = new AnonymousClass1624();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(28));

    @Override // X.C163A
    public final /* bridge */ /* synthetic */ AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) LJFF.getValue();
    }

    @Override // X.C163A
    public final String LJFF() {
        return "CaptionTranslationRepo";
    }

    @Override // X.C163A
    public final /* bridge */ /* synthetic */ EnumC207100162g LIZLLL(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (aweme2 != null && C20702515zj.LIZLLL(aweme2) != null) {
            return EnumC207100162g.OFFLINE_CAPTIONS;
        }
        return EnumC207100162g.RT_CAPTIONS;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        String str;
        CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
        if (captionItemModelLJIIIIZZ == null || (str = captionItemModelLJIIIIZZ.languageCode) == null) {
            return "";
        }
        return str;
    }

    public static void LJIJJ(String str, String str2, Throwable th) {
        boolean z;
        AnonymousClass1623 anonymousClass1623;
        String str3;
        Integer numValueOf;
        String simpleName;
        C23112093u c23112093u;
        if (str == null) {
            return;
        }
        boolean z2 = th instanceof C0XIR;
        if (z2 && ((C23112093u) th).getErrorCode() == 5) {
            z = true;
            anonymousClass1623 = AnonymousClass1623.RT_TRANSLATION_UNSUPPORTED_LANGUAGE;
            str3 = "rt_translation_unsupported_language";
        } else {
            z = false;
            anonymousClass1623 = AnonymousClass1623.FAILURE;
            str3 = "realtime_caption_network_failure";
        }
        String simpleName2 = null;
        if (z2 && (c23112093u = (C23112093u) th) != null) {
            numValueOf = Integer.valueOf(c23112093u.getErrorCode());
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ET_ACC] rt_translation_fail aid=");
        sbLIZ.append(str);
        sbLIZ.append(" targetLang=");
        sbLIZ.append(str2);
        sbLIZ.append(" errorClass=");
        if (th != null) {
            simpleName2 = th.getClass().getSimpleName();
        }
        sbLIZ.append(simpleName2);
        sbLIZ.append(" statusCode=");
        sbLIZ.append(numValueOf);
        sbLIZ.append(" unsupportedLanguage=");
        sbLIZ.append(z);
        sbLIZ.append(" code=");
        sbLIZ.append(anonymousClass1623.getValue());
        sbLIZ.append(" reason=");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z && ((Number) C277440Au6.LIZ.getValue()).intValue() == 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cla_rt_caption_network_failure aid=");
            sbLIZ2.append(str);
            sbLIZ2.append(" targetLang=");
            sbLIZ2.append(str2);
            sbLIZ2.append(" errorClass=");
            if (th != null) {
                simpleName = th.getClass().getSimpleName();
            } else {
                simpleName = "null";
            }
            sbLIZ2.append(simpleName);
            sbLIZ2.append(" statusCode=");
            sbLIZ2.append(numValueOf);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (th != null) {
                C1AF0.LJFF(th, strLIZIZ);
            } else {
                C1AF0.LIZJ(strLIZIZ);
            }
        }
        ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
        iCLAPerfETServiceLIZ.LJII(str, iCLAPerfETServiceLIZ.LJJI(str2), anonymousClass1623, -1, null, null, null, null, "", str3, null);
    }

    @Override // X.C163A
    public final void LJIIIIZZ(Aweme aweme, C164B c164b, C162U c162u) {
        C1869640ykk c1869640ykk = (C1869640ykk) c164b;
        LJIJJLI(aweme, c1869640ykk.LIZJ, String.valueOf(c1869640ykk.LIZ), String.valueOf(c1869640ykk.LJII), c1869640ykk.LIZLLL, c1869640ykk.LJI, c162u, c1869640ykk.LJIIIZ);
    }

    @Override // X.C163A
    public final void LJIIIZ(Aweme aweme, String str, Throwable th) {
        LJIJJ(aweme.getAid(), str, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[PHI: r15
      0x0069: PHI (r15v5 java.lang.String) = (r15v2 java.lang.String), (r15v6 java.lang.String) binds: [B:27:0x0067, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C163A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r29, X.C162U r30, java.lang.String r31, X.InterfaceC1389740mGi r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1624.LJIILJJIL(java.lang.Object, X.162U, java.lang.String, X.0mGi, java.lang.String):X.11NZ");
    }

    public static C11O8 LJIILLIIL(final long j, final String str, final Aweme aweme, String str2, final C162U c162u, final InterfaceC1389740mGi interfaceC1389740mGi) {
        C11NZ<RealtimeCaptionsTranslationResult> c11nzLJI;
        String str3 = AnonymousClass1628.LIZ;
        String aid = aweme.getAid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AnonymousClass1628.LIZ);
        sbLIZ.append(File.separator);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cla_realtime_[");
        sbLIZ2.append(aid);
        sbLIZ2.append("]_[");
        sbLIZ2.append(str);
        sbLIZ2.append(']');
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (AnonymousClass1628.LIZIZ.LIZJ(strLIZIZ) != null && new C0VSJ(strLIZIZ).exists()) {
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.162A
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Boolean> c09aj) {
                    C1C7U.LIZ("CaptionTranslationRepo@d175.fetchRealtimeTranslations$1");
                    AnonymousClass1624.LJ.LJIJI(aweme, j, str, strLIZIZ, interfaceC1389740mGi, c162u, null, true);
                    c09aj.onNext(Boolean.TRUE);
                    C1C7U.LIZIZ("CaptionTranslationRepo@d175.fetchRealtimeTranslations$1");
                }
            }).LJJJLZIJ(C11S5.LIZ());
        }
        String aid2 = aweme.getAid();
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJI = c161oLIZ.LJI(j, str, aid2, str2)) == null) {
                c11nzLJI = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJI = C11IR.LL;
        }
        return c11nzLJI.LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.1627
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                RealtimeCaptionsTranslationResult realtimeCaptionsTranslationResult = (RealtimeCaptionsTranslationResult) obj;
                String str4 = AnonymousClass1628.LIZ;
                String str5 = strLIZIZ;
                C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                c2137908Zd.LIZLLL(str5);
                if (!c2137908Zd.LJFF(str5)) {
                    c2137908Zd.LIZJ(str5);
                }
                AnonymousClass1628.LIZJ++;
                C603820NmG<String, String> c603820NmG = AnonymousClass1628.LIZIZ;
                c603820NmG.LIZLLL(str5, str5);
                if (AnonymousClass1628.LIZJ >= AnonymousClass1628.LIZLLL) {
                    AnonymousClass1628.LIZJ = 0;
                    C746760TRa.LIZ().LJJIJIL(C13LP.LLIIII(((LinkedHashMap) c603820NmG.LJIIIIZZ()).keySet()));
                }
                if (C2354709Kn.LJJ(str5, realtimeCaptionsTranslationResult.translatedContent)) {
                    return new Pair(strLIZIZ, realtimeCaptionsTranslationResult);
                }
                return new Pair("", realtimeCaptionsTranslationResult);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.1626
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                EnumC207100162g enumC207100162g;
                String str4;
                Integer num;
                Integer num2;
                Pair pair = (Pair) obj;
                String str5 = (String) pair.getFirst();
                RealtimeCaptionsTranslationResult realtimeCaptionsTranslationResult = (RealtimeCaptionsTranslationResult) pair.getSecond();
                boolean z = true;
                if (str5.length() == 0) {
                    PerfMetric perfMetric = realtimeCaptionsTranslationResult.perfMetrics;
                    AnonymousClass1624 anonymousClass1624 = AnonymousClass1624.LJ;
                    Aweme aweme2 = aweme;
                    if (aweme2 != null && C20702515zj.LIZLLL(aweme2) != null) {
                        enumC207100162g = EnumC207100162g.OFFLINE_CAPTIONS;
                    } else {
                        enumC207100162g = EnumC207100162g.RT_CAPTIONS;
                    }
                    C162U c162u2 = c162u;
                    C163W c163w = C163W.CLIENT_ERROR;
                    InterfaceC1389740mGi interfaceC1389740mGi2 = interfaceC1389740mGi;
                    if (perfMetric != null) {
                        str4 = perfMetric.serverCacheType;
                        num = perfMetric.serverTransTime;
                        num2 = perfMetric.aiLabTransTime;
                    } else {
                        str4 = null;
                        num = null;
                        num2 = null;
                    }
                    C163A.LJIIJJI(enumC207100162g, c162u2, "CAPTION_FILE_WRITE_FAILURE", c163w, interfaceC1389740mGi2, str4, num, num2, realtimeCaptionsTranslationResult.variant);
                    AnonymousClass1624.LJIJJ(aweme.getAid(), str, null);
                    z = false;
                } else {
                    AnonymousClass1624.LJ.LJIJI(aweme, j, str, str5, interfaceC1389740mGi, c162u, realtimeCaptionsTranslationResult, false);
                }
                return Boolean.valueOf(z);
            }
        }).LJJJLZIJ(C11S5.LIZ());
    }

    public static void LJIJJLI(Aweme aweme, String str, String str2, String str3, boolean z, boolean z2, C162U c162u, boolean z3) {
        CaptionItemModel captionItemModelLJIIIIZZ;
        AnonymousClass1629 anonymousClass1629;
        EnumC20038913at enumC20038913at;
        if (c162u == null || (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) == null) {
            return;
        }
        String strLIZLLL = c162u.LIZLLL();
        if (Intrinsics.LJFF(strLIZLLL, "land_on_item")) {
            anonymousClass1629 = AnonymousClass1629.LAND_ON_ITEM;
        } else if (Intrinsics.LJFF(strLIZLLL, "translation_toggle_caption")) {
            anonymousClass1629 = AnonymousClass1629.TOGGLE_ENABLE;
        } else {
            anonymousClass1629 = AnonymousClass1629.SWITCH_LANGUAGE;
        }
        if (!z && anonymousClass1629 == AnonymousClass1629.LAND_ON_ITEM && C162B.LIZIZ.Vg(aweme)) {
            return;
        }
        ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
        String str4 = captionItemModelLJIIIIZZ.languageCode;
        if (z) {
            enumC20038913at = EnumC20038913at.REALTIME;
        } else {
            enumC20038913at = EnumC20038913at.OFFLINE;
        }
        iCLAPerfETServiceLIZ.LJIILL(aweme, str2, str3, str, str4, enumC20038913at, anonymousClass1629, z2, true, z3, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.feed.model.Aweme r26, long r27, java.lang.String r29, java.lang.String r30, X.InterfaceC1389740mGi r31, X.C162U r32, com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1624.LJIJI(com.ss.android.ugc.aweme.feed.model.Aweme, long, java.lang.String, java.lang.String, X.0mGi, X.162U, com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult, boolean):void");
    }
}
