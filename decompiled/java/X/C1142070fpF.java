package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS131S1100000_17;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS32S0000100_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS68S1000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0fpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142070fpF {
    public static final C1142070fpF LIZ = new C1142070fpF();
    public static final C054G LIZIZ;
    public static final Object LIZJ;
    public static final C2252321DDq LIZLLL;
    public static final C1142080fpG LJ;
    public static AnonymousClass0956 LJFF;
    public static AnonymousClass0956 LJI;
    public static String LJII;
    public static AnonymousClass0956 LJIIIIZZ;
    public static AnonymousClass0956 LJIIIZ;
    public static boolean LJIIJ;
    public static volatile boolean LJIIJJI;
    public static final C1142060fpE LJIIL;
    public static final AnonymousClass0951 LJIILIIL;
    public static final C1142090fpH LJIILJJIL;
    public static final C1142010fp9 LJIILL;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0fpE] */
    static {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        LIZJ = new Object();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1142020fpA(null, null, null, 0L, 0L, 0, null, null, 0.0f, 0, null, null, 4095));
        LIZLLL = c2252321DDqLIZ;
        LJ = new C1142080fpG();
        LJII = "";
        LJIIL = new InterfaceC1147550fy5() { // from class: X.0fpE
            @Override // X.InterfaceC1147550fy5
            public final void LIZ() {
                C1142070fpF.LIZ.getClass();
                C1142070fpF.LJIL();
            }

            @Override // X.InterfaceC1147550fy5
            public final boolean LIZLLL(C1142100fpI c1142100fpI) {
                EnumC1142040fpC enumC1142040fpC;
                C1142070fpF.LIZ.getClass();
                C1136870fgr c1136870fgrLJJI = C1142070fpF.LJJI(c1142100fpI);
                if (c1136870fgrLJJI != null) {
                    if (!C1142070fpF.LIZJ(c1136870fgrLJJI, "prepare paused")) {
                        C1142070fpF.LJIL();
                    } else {
                        C1142070fpF.LIZLLL();
                        C1142070fpF.LJ();
                        AnonymousClass0956 anonymousClass0956 = C1142070fpF.LJFF;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        AnonymousClass0956 anonymousClass09562 = C1142070fpF.LJI;
                        if (anonymousClass09562 != null) {
                            anonymousClass09562.LIZIZ(null);
                        }
                        C1142070fpF.LJI = null;
                        C1142070fpF.LJII = "";
                        C1142070fpF.LJIJ("prepare paused");
                        C2209808lE c2209808lE = C2209808lE.LIZ;
                        String str = c1136870fgrLJJI.LJFF;
                        c2209808lE.getClass();
                        List listLIZ = C2209808lE.LIZ(str);
                        if (a0.LJJJIL(c1136870fgrLJJI.LJFF)) {
                            enumC1142040fpC = EnumC1142040fpC.ERROR;
                        } else if (listLIZ != null && !listLIZ.isEmpty()) {
                            enumC1142040fpC = EnumC1142040fpC.READY;
                        } else {
                            enumC1142040fpC = EnumC1142040fpC.LOADING;
                        }
                        C1142070fpF.LJJII(new AwS226S0300000_17(c1136870fgrLJJI, (C1136870fgr) listLIZ, (List<C2209908lF>) enumC1142040fpC, (EnumC1142040fpC) 11));
                        C1142070fpF.LJIILL(c1136870fgrLJJI);
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC1147550fy5
            public final boolean LIZIZ(Context context, C1142100fpI c1142100fpI) {
                C1142070fpF.LIZ.getClass();
                C1136870fgr c1136870fgrLJJI = C1142070fpF.LJJI(c1142100fpI);
                if (c1136870fgrLJJI != null) {
                    return C1142070fpF.LJJIFFI(c1136870fgrLJJI, context);
                }
                return false;
            }

            @Override // X.InterfaceC1147550fy5
            public final boolean LIZJ(Context context, C1142100fpI c1142100fpI) {
                Context contextN3;
                C1142070fpF.LIZ.getClass();
                C1136870fgr c1136870fgrLJJI = C1142070fpF.LJJI(c1142100fpI);
                if (c1136870fgrLJJI != null && C1142070fpF.LIZJ(c1136870fgrLJJI, "select")) {
                    C1142070fpF.LIZLLL();
                    if (context != null && (contextN3 = C786410Ut5.N3(context)) != null) {
                        context = contextN3;
                    }
                    return C1142070fpF.LJIJJLI(c1136870fgrLJJI, context);
                }
                return false;
            }
        };
        LJIILIIL = C09IC.LIZIZ(c2252321DDqLIZ);
        LJIILJJIL = new C1142090fpH();
        LJIILL = C1142010fp9.LIZ;
    }

    public static void LIZLLL() {
        AnonymousClass0956 anonymousClass0956 = LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJIIIIZZ = null;
    }

    public static void LJ() {
        AnonymousClass0956 anonymousClass0956 = LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJIIIZ = null;
    }

    public static IMusicGiftService LJIILIIL() {
        return (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
    }

    public static void LJFF() {
        long jLongValue;
        LJ();
        AnonymousClass0956 anonymousClass0956 = LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1142080fpG c1142080fpG = LJ;
        long jLIZ = c1142080fpG.LIZ();
        Long lValueOf = Long.valueOf(c1142080fpG.LIZIZ());
        if (lValueOf.longValue() > 0) {
            jLongValue = lValueOf.longValue();
        } else {
            Long lValueOf2 = Long.valueOf(jLIZ);
            jLongValue = lValueOf2.longValue() > 0 ? lValueOf2.longValue() : LJIJI(0L);
        }
        LJIJ("completion");
        LJJII(new AwS32S0000100_17(jLongValue, 3));
        StringBuilder sb = new StringBuilder("preview completed giftId=");
        C1136870fgr c1136870fgr = ((C1142020fpA) LIZLLL.getValue()).LIZ;
        sb.append(c1136870fgr != null ? c1136870fgr.LIZ : 0L);
        C20441214yg.LIZIZ("MusicGiftPreviewPlayer", sb.toString());
    }

    public static void LJIILLIIL() {
        Object c098200Yq;
        LIZLLL();
        LJ();
        AnonymousClass0956 anonymousClass0956 = LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        try {
            C1142080fpG c1142080fpG = LJ;
            TTVideoEngine tTVideoEngine = c1142080fpG.LIZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.pause();
            }
            c1142080fpG.LIZJ.LIZJ(true);
            C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", "pause playback");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("MusicGiftPreviewPlayer", "pause failed", thM5exceptionOrNullimpl);
        }
        LJJII(new AwS596S0100000_17(EnumC1142140fpM.PAUSED, 402));
        C1143590frh c1143590frh = new C1143590frh(0.0f, 0.0f, 0.0f);
        IMusicGiftService iMusicGiftServiceLJIILIIL = LJIILIIL();
        if (iMusicGiftServiceLJIILIIL != null) {
            iMusicGiftServiceLJIILIIL.Hk0(c1143590frh);
        }
    }

    public static void LJIL() {
        LIZLLL();
        LJJ();
    }

    public static void LJJ() {
        LJ();
        AnonymousClass0956 anonymousClass0956 = LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = LJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        LJI = null;
        LJII = "";
        LJIJ("stop");
        LJJII(AFwS254S0000000_17.get$arr$(148));
    }

    public static String LJI(C1136870fgr c1136870fgr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1136870fgr.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(c1136870fgr.LIZLLL);
        sbLIZ.append('_');
        sbLIZ.append(SystemClock.uptimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(android.content.Context r8) {
        /*
            boolean r0 = X.C1142070fpF.LJIIJ
            if (r0 != 0) goto L7e
            android.content.Context r7 = X.C497740JfY.LJII()
            X.0fpG r4 = X.C1142070fpF.LJ
            if (r8 == 0) goto L90
            android.content.Context r0 = X.C786410Ut5.N3(r8)
            if (r0 == 0) goto L13
            r8 = r0
        L13:
            r7 = r8
        L14:
            com.ss.ttvideoengine.TTVideoEngine r0 = r4.LIZ
            r3 = 1
            if (r0 != 0) goto L7c
            android.content.Context r0 = X.C786410Ut5.N3(r7)
            if (r0 == 0) goto L20
            r7 = r0
        L20:
            com.bytedance.android.livesdk.gift.model.GiftConfigInfo$RoleConfig r0 = X.C1133150far.LIZ
            if (r0 == 0) goto L8e
            java.lang.String r0 = r0.gifter
        L26:
            int r1 = X.C1133150far.LIZ(r0)
            r0 = -1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L8b
            if (r1 == 0) goto L8b
            double r5 = (double) r1
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r5 = r5 / r0
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r5 = java.lang.Math.pow(r0, r5)
            float r1 = (float) r5
        L3c:
            r0 = 0
            float r0 = X.C13LZ.LIZLLL(r1, r0, r2)
            r4.LJ = r0
            com.ss.ttvideoengine.TTVideoEngine r2 = new com.ss.ttvideoengine.TTVideoEngine
            r0 = 0
            r2.<init>(r7, r0)
            X.0fpK r0 = r4.LJIIIIZZ
            r2.LLI(r0)
            X.0fyX r0 = r4.LIZJ
            r2.LJJII(r0)
            r0 = 415(0x19f, float:5.82E-43)
            r2.LIZJ(r0, r3)
            float r1 = r2.LJJLJLI()
            float r0 = r2.LJJLJLI()
            r2.LJIILLIIL(r1, r0)
            r4.LIZ = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "init music gift preview audio player volume="
            r1.append(r0)
            float r0 = r4.LJ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MusicGiftPreviewAudioPlayer"
            X.C20441214yg.LIZIZ(r0, r1)
        L7c:
            X.C1142070fpF.LJIIJ = r3
        L7e:
            X.0fpG r2 = X.C1142070fpF.LJ
            X.0fpH r0 = X.C1142070fpF.LJIILJJIL
            r2.LIZIZ = r0
            X.0fp9 r1 = X.C1142070fpF.LJIILL
            X.0fyX r0 = r2.LIZJ
            r0.LJ = r1
            return
        L8b:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L3c
        L8e:
            r0 = 0
            goto L26
        L90:
            android.content.Context r8 = X.C786410Ut5.N3(r7)
            if (r8 != 0) goto L13
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142070fpF.LJIIIIZZ(android.content.Context):void");
    }

    public static void LJIIIZ(String str) {
        LJ();
        AnonymousClass0956 anonymousClass0956 = LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJIJ("error");
        LJJII(new AwS68S1000000_17(str, 5));
        if (a0.LJJJIL(str)) {
            str = "unknown player error";
        }
        C20441214yg.LJ("MusicGiftPreviewPlayer", "preview failed: ".concat(str));
    }

    public static boolean LJIILJJIL(long j) {
        C1142020fpA c1142020fpA = (C1142020fpA) LIZLLL.getValue();
        C1136870fgr c1136870fgr = c1142020fpA.LIZ;
        if (c1136870fgr != null && c1136870fgr.LIZ == j) {
            EnumC1142140fpM enumC1142140fpM = c1142020fpA.LIZJ;
            if (enumC1142140fpM == EnumC1142140fpM.LOADING || enumC1142140fpM == EnumC1142140fpM.PLAYING) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJIILL(C1136870fgr c1136870fgr) {
        String string = a0.LJLIIIL(c1136870fgr.LJFF).toString();
        if (!a0.LJJJIL(string)) {
            C2209808lE.LIZ.getClass();
            if (C2209808lE.LIZ(string) != null && (!r0.isEmpty())) {
                return;
            }
            if (!Intrinsics.LJFF(LJII, string)) {
                AnonymousClass0956 anonymousClass0956 = LJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                LJI = null;
                LJII = string;
            }
            AnonymousClass0956 anonymousClass09562 = LJI;
            if (anonymousClass09562 != null && anonymousClass09562.isActive()) {
                return;
            }
            LJI = C23250099c.LIZLLL(LIZIZ, null, null, new C2210308lJ(string, null), 3);
        }
    }

    public static void LJIJ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release audio player reason=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MusicGiftPreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
        try {
            LJ.LJ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stop before release failed reason=");
            sbLIZ2.append(str);
            C20441214yg.LJFF("MusicGiftPreviewPlayer", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
        }
        try {
            LJ.LIZJ();
            LJIIJ = false;
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("release failed reason=");
            sbLIZ3.append(str);
            C20441214yg.LJFF("MusicGiftPreviewPlayer", C2188811AlT.LIZIZ(sbLIZ3), thM5exceptionOrNullimpl2);
        }
        C1143590frh c1143590frh = new C1143590frh(0.0f, 0.0f, 0.0f);
        IMusicGiftService iMusicGiftServiceLJIILIIL = LJIILIIL();
        if (iMusicGiftServiceLJIILIIL != null) {
            iMusicGiftServiceLJIILIIL.Hk0(c1143590frh);
        }
    }

    public static long LJIJI(long j) {
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() <= 0 && 0 == 0) {
            Long lValueOf2 = Long.valueOf(((C1142020fpA) LIZLLL.getValue()).LJ);
            if (lValueOf2.longValue() > 0) {
                return lValueOf2.longValue();
            }
            return 15000L;
        }
        return lValueOf.longValue();
    }

    public static C1136870fgr LJJI(C1142100fpI c1142100fpI) {
        String str;
        EnumC1142180fpQ enumC1142180fpQ;
        if (c1142100fpI.LIZ > 0 && (str = c1142100fpI.LJ) != null && !a0.LJJJIL(str)) {
            long j = c1142100fpI.LIZ;
            long j2 = c1142100fpI.LIZIZ;
            long j3 = c1142100fpI.LIZJ;
            long j4 = c1142100fpI.LIZLLL;
            String str2 = c1142100fpI.LJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c1142100fpI.LJFF;
            if (str4 != null) {
                str3 = str4;
            }
            String str5 = c1142100fpI.LJI;
            String str6 = c1142100fpI.LJII;
            int i = C1142130fpL.LIZJ[c1142100fpI.LJIIIIZZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC1142180fpQ = EnumC1142180fpQ.UNKNOWN;
                    } else {
                        enumC1142180fpQ = EnumC1142180fpQ.SECONDARY_PAGE;
                    }
                } else {
                    enumC1142180fpQ = EnumC1142180fpQ.TOP_BANNER;
                }
            } else {
                enumC1142180fpQ = EnumC1142180fpQ.PANEL_ITEM;
            }
            return new C1136870fgr(j, j2, j3, j4, str2, str3, str5, str6, enumC1142180fpQ);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(kotlin.jvm.functions.Function1 r46) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142070fpF.LJJII(kotlin.jvm.functions.Function1):void");
    }

    public static boolean LIZJ(C1136870fgr c1136870fgr, String str) {
        EnumC1142180fpQ enumC1142180fpQ;
        if (!LJIIJJI) {
            if (c1136870fgr != null) {
                enumC1142180fpQ = c1136870fgr.LJIIIIZZ;
            } else {
                enumC1142180fpQ = null;
            }
            if (enumC1142180fpQ != EnumC1142180fpQ.SECONDARY_PAGE) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ignore ");
                sbLIZ.append(str);
                sbLIZ.append(" because gift panel is inactive");
                C20441214yg.LIZIZ("MusicGiftPreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
            return true;
        }
        return true;
    }

    public static C1136870fgr LJII(AbstractC1126600fQI abstractC1126600fQI, EnumC1142180fpQ enumC1142180fpQ) {
        Object obj;
        Gift gift;
        Gift.MusicGiftInfo musicGiftInfo;
        Gift.MusicGiftInfo.AudioResource audioResource;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Gift) || (gift = (Gift) obj) == null || !abstractC1126600fQI.LJIJJLI() || (musicGiftInfo = gift.musicInfo) == null || (audioResource = musicGiftInfo.resource) == null) {
            return null;
        }
        long j = gift.id;
        long j2 = musicGiftInfo.songId;
        long j3 = musicGiftInfo.moodId;
        long j4 = audioResource.snippetId;
        String str = audioResource.audioUrl;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = audioResource.lyricsUrl;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = musicGiftInfo.songName;
        if (a0.LJJJIL(str4) && (str4 = gift.name) == null) {
            str4 = "";
        }
        String str5 = musicGiftInfo.artistName;
        if (str5 != null) {
            str2 = str5;
        }
        return new C1136870fgr(j, j2, j3, j4, str, str3, str4, str2, enumC1142180fpQ);
    }

    public static int LJIIJ(long j, List list) {
        int iNextIndex;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (j >= ((C2209908lF) listIterator.previous()).LIZ) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(iNextIndex);
        if (numValueOf.intValue() < 0) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public static String LJIIL(int i, List list) {
        boolean z;
        C2209908lF c2209908lF;
        String str;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c2209908lF = (C2209908lF) C13LP.LJJJLZIJ(i, list)) == null || (str = c2209908lF.LIZJ) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIJJ(C1136870fgr c1136870fgr, Context context) {
        Context contextN3;
        if (!LIZJ(c1136870fgr, "select deferred")) {
            return false;
        }
        LIZLLL();
        if (context != null && (contextN3 = C786410Ut5.N3(context)) != null) {
            context = contextN3;
        }
        if (c1136870fgr.LIZ(((C1142020fpA) LIZLLL.getValue()).LIZ)) {
            C259800zU c259800zU = new C259800zU();
            LJJII(new AwS383S0200000_17(c1136870fgr, (C1136870fgr) c259800zU, (C259800zU<C1136870fgr>) 78));
            C1136870fgr c1136870fgr2 = (C1136870fgr) c259800zU.element;
            if (c1136870fgr2 != null) {
                LJIILL(c1136870fgr2);
            }
            return true;
        }
        LJIIIIZZ = C23250099c.LIZLLL(LIZIZ, null, null, new C2210508lL(c1136870fgr, context, null), 3);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJIJJLI(C1136870fgr c1136870fgr, Context context) {
        if (!LIZJ(c1136870fgr, "select internal")) {
            return false;
        }
        if (c1136870fgr.LIZ(((C1142020fpA) LIZLLL.getValue()).LIZ)) {
            C259800zU c259800zU = new C259800zU();
            LJJII(new AwS383S0200000_17(c1136870fgr, (C1136870fgr) c259800zU, (C259800zU<C1136870fgr>) 78));
            C1136870fgr c1136870fgr2 = (C1136870fgr) c259800zU.element;
            if (c1136870fgr2 != null) {
                LJIILL(c1136870fgr2);
            }
            return true;
        }
        LJIIZILJ(c1136870fgr, context, false);
        return true;
    }

    public static boolean LJJIFFI(C1136870fgr c1136870fgr, Context context) {
        Context contextN3;
        if (!LIZJ(c1136870fgr, "toggle source")) {
            return false;
        }
        LIZLLL();
        if (context != null && (contextN3 = C786410Ut5.N3(context)) != null) {
            context = contextN3;
        }
        C1142020fpA c1142020fpA = (C1142020fpA) LIZLLL.getValue();
        if (!c1136870fgr.LIZ(c1142020fpA.LIZ)) {
            LJIIZILJ(c1136870fgr, context, false);
            return true;
        }
        switch (C1142130fpL.LIZ[c1142020fpA.LIZJ.ordinal()]) {
            case 1:
            case 2:
                LJIILLIIL();
                return true;
            case 3:
                LJIIZILJ(c1136870fgr, context, true);
                return true;
            case 4:
            case 5:
            case 6:
                LJIIZILJ(c1136870fgr, context, false);
                return true;
            default:
                throw new C1954807lC();
        }
    }

    public static int LIZ(int i, long j, List list) {
        C2209908lF c2209908lF;
        if (list == null || list.isEmpty() || (c2209908lF = (C2209908lF) C13LP.LJJJLZIJ(i, list)) == null) {
            return 0;
        }
        long j2 = c2209908lF.LIZ;
        long jLJIIJJI = LJIIJJI(j2, i, j, list) - j2;
        if (jLJIIJJI < 1) {
            jLJIIJJI = 1;
        } else if (jLJIIJJI > 2147483647L) {
            jLJIIJJI = 2147483647L;
        }
        return (int) jLJIIJJI;
    }

    public static void LJIIZILJ(C1136870fgr c1136870fgr, Context context, boolean z) {
        boolean z2;
        String strLJI;
        long j;
        long j2;
        long jLongValue;
        EnumC1142040fpC enumC1142040fpC;
        Object c098200Yq;
        if (!LIZJ(c1136870fgr, "play")) {
            return;
        }
        if (z && LJIIJ && ((C1142020fpA) LIZLLL.getValue()).LIZIZ != null) {
            z2 = true;
            strLJI = ((C1142020fpA) LIZLLL.getValue()).LIZIZ;
            if (strLJI == null) {
                strLJI = LJI(c1136870fgr);
            }
        } else {
            z2 = false;
            strLJI = LJI(c1136870fgr);
        }
        if (a0.LJJJIL(c1136870fgr.LJ)) {
            AnonymousClass0956 anonymousClass0956 = LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJIJ("empty audio url");
            LJJII(new AwS131S1100000_17(c1136870fgr, strLJI, 6));
            C20441214yg.LJ("MusicGiftPreviewPlayer", "preview failed: audio url is empty");
            return;
        }
        if (z2) {
            j = ((C1142020fpA) LIZLLL.getValue()).LIZLLL;
            j2 = ((C1142020fpA) LIZLLL.getValue()).LJ;
        } else {
            j = 0;
            j2 = 0;
        }
        Long lValueOf = Long.valueOf(j2);
        if (lValueOf.longValue() > 0) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 15000;
        }
        LJ();
        AnonymousClass0956 anonymousClass09562 = LJFF;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C2209808lE c2209808lE = C2209808lE.LIZ;
        String str = c1136870fgr.LJFF;
        c2209808lE.getClass();
        List listLIZ = C2209808lE.LIZ(str);
        if (a0.LJJJIL(c1136870fgr.LJFF)) {
            enumC1142040fpC = EnumC1142040fpC.ERROR;
        } else if (listLIZ != null && !listLIZ.isEmpty()) {
            enumC1142040fpC = EnumC1142040fpC.READY;
        } else {
            enumC1142040fpC = EnumC1142040fpC.LOADING;
        }
        String str2 = strLJI;
        LJJII(new C1142050fpD(c1136870fgr, strLJI, j, j2, LJIIJ(j, listLIZ), listLIZ, jLongValue, enumC1142040fpC));
        LJIILL(c1136870fgr);
        try {
            LJIIIIZZ(context);
            if (z2) {
                C1142080fpG c1142080fpG = LJ;
                TTVideoEngine tTVideoEngine = c1142080fpG.LIZ;
                if (tTVideoEngine != null) {
                    tTVideoEngine.play();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resume playback ");
                sbLIZ.append(C1142080fpG.LJFF(c1142080fpG.LIZLLL));
                C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", C2188811AlT.LIZIZ(sbLIZ));
                AnonymousClass0956 anonymousClass09563 = LJIIIZ;
                if (anonymousClass09563 != null) {
                    anonymousClass09563.LIZIZ(null);
                }
                LJIIIZ = C23250099c.LIZLLL(LIZIZ, null, null, new C1141990fp7(str2, c1136870fgr, null), 3);
            } else {
                C1142080fpG c1142080fpG2 = LJ;
                c1142080fpG2.LJ();
                String str3 = c1136870fgr.LJ;
                c1142080fpG2.LIZLLL = str3;
                TTVideoEngine tTVideoEngine2 = c1142080fpG2.LIZ;
                if (tTVideoEngine2 != null) {
                    if (!u.LJJIIJZLJL(str3, "http://", true) && !u.LJJIIJZLJL(str3, "https://", true)) {
                        tTVideoEngine2.LJIJ(str3);
                    } else {
                        tTVideoEngine2.LJIJI(str3);
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set source ");
                sbLIZ2.append(C1142080fpG.LJFF(str3));
                C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                c1142080fpG2.LIZLLL();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("preview start requested giftId=");
            sbLIZ3.append(c1136870fgr.LIZ);
            sbLIZ3.append(", songId=");
            sbLIZ3.append(c1136870fgr.LIZIZ);
            sbLIZ3.append(", moodId=");
            sbLIZ3.append(c1136870fgr.LIZJ);
            sbLIZ3.append(", snippetId=");
            sbLIZ3.append(c1136870fgr.LIZLLL);
            sbLIZ3.append(", resume=");
            sbLIZ3.append(z);
            sbLIZ3.append(", effectiveResume=");
            sbLIZ3.append(z2);
            C20441214yg.LIZIZ("MusicGiftPreviewPlayer", C2188811AlT.LIZIZ(sbLIZ3));
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1142070fpF c1142070fpF = LIZ;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            c1142070fpF.getClass();
            LJIIIZ(message);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[PHI: r4
      0x0072: PHI (r4v1 java.lang.Long) = (r4v0 java.lang.Long), (r4v2 java.lang.Long) binds: [B:6:0x0012, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1142020fpA LJJIII(X.C1142020fpA r16, long r17, long r19) {
        /*
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            long r1 = r4.longValue()
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L77
            r0 = 1
        Lf:
            r1 = 0
            r5 = r16
            if (r0 != 0) goto L72
            long r2 = r5.LJ
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            long r2 = r4.longValue()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L72
            r10 = 15000(0x3a98, double:7.411E-320)
        L24:
            r6 = r17
            long r8 = X.C13LZ.LJFF(r6, r8, r10)
            X.0fgr r0 = r5.LIZ
            if (r0 == 0) goto L3b
            java.lang.String r2 = r0.LJFF
            if (r2 == 0) goto L3b
            X.08lE r0 = X.C2209808lE.LIZ
            r0.getClass()
            java.util.List r1 = X.C2209808lE.LIZ(r2)
        L3b:
            int r12 = LJIIJ(r8, r1)
            r6 = 0
            java.lang.String r13 = LJIIL(r12, r1)
            int r0 = r12 + 1
            java.lang.String r14 = LJIIL(r0, r1)
            r15 = r8
            r17 = r12
            r18 = r10
            r20 = r1
            float r15 = LIZIZ(r15, r17, r18, r20)
            int r16 = LIZ(r12, r10, r1)
            if (r1 == 0) goto L6f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6f
            X.0fpC r0 = X.EnumC1142040fpC.READY
        L63:
            r19 = 2055(0x807, float:2.88E-42)
            r7 = r6
            r17 = r0
            r18 = r6
            X.0fpA r0 = X.C1142020fpA.LIZ(r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L6f:
            X.0fpC r0 = r5.LJIIJ
            goto L63
        L72:
            long r10 = r4.longValue()
            goto L24
        L77:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142070fpF.LJJIII(X.0fpA, long, long):X.0fpA");
    }

    public static float LIZIZ(long j, int i, long j2, List list) {
        boolean z;
        C2209908lF c2209908lF;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || (c2209908lF = (C2209908lF) C13LP.LJJJLZIJ(i, list)) == null) {
            return 0.0f;
        }
        long j3 = c2209908lF.LIZ;
        long jLJIIJJI = LJIIJJI(j3, i, j2, list) - j3;
        if (jLJIIJJI < 1) {
            jLJIIJJI = 1;
        }
        return C13LZ.LIZLLL((j - j3) / jLJIIJJI, 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[PHI: r3
      0x005a: PHI (r3v1 java.lang.Long) = (r3v0 java.lang.Long), (r3v2 java.lang.Long) binds: [B:16:0x0046, B:18:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIIJJI(long r6, int r8, long r9, java.util.List r11) {
        /*
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r8, r11)
            X.08lF r0 = (X.C2209908lF) r0
            if (r0 == 0) goto L2f
            long r0 = r0.LIZIZ
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            long r1 = r3.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2f
            long r0 = r3.longValue()
        L1a:
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            long r3 = r5.longValue()
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 <= 0) goto L5f
            long r3 = r5.longValue()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5f
            return r3
        L2f:
            int r0 = r8 + 1
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r11)
            X.08lF r0 = (X.C2209908lF) r0
            if (r0 == 0) goto L3c
            long r0 = r0.LIZ
            goto L1a
        L3c:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            long r1 = r3.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L5a
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            long r1 = r3.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L5a
            r0 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0 + r6
            goto L1a
        L5a:
            long r0 = r3.longValue()
            goto L1a
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142070fpF.LJIIJJI(long, int, long, java.util.List):long");
    }
}
