package X;

import androidx.compose.foundation.layout.c;
import androidx.fragment.app.Fragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.music.model.report.ReportReviewStatus;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS121S0201000_9;
import kotlin.jvm.internal.AwS128S1000000_25;
import kotlin.jvm.internal.AwS19S1001000_25;
import kotlin.jvm.internal.AwS26S0002000_25;
import kotlin.jvm.internal.AwS3S1202000_25;
import kotlin.jvm.internal.AwS42S0600000_9;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668890tWx {
    public static final void LIZIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1417820280);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685190txF.LIZ(str, C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 2, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i2 & 14) | 102236208, 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 11);
        }
    }

    public static final void LJIIIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1190004316);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685190txF.LIZ(C0MBB.LIZJ(2131839045, new Object[]{Integer.valueOf(i)}, c13zcLJIIJ), C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 2, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, 102236208, 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS26S0002000_25(i, i2, 0);
        }
    }

    public static final void LIZ(C632090Oql c632090Oql, ReportReviewStatus reportReviewStatus, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZIZ;
        int iOrdinal;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1544415389);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632090Oql)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (reportReviewStatus == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = reportReviewStatus.ordinal();
            }
            if (c13zcLJIIJ.LJIJI(iOrdinal)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            MusicModel musicModel = c632090Oql.getMusicModel();
            String strLIZ = C0OY0.LIZ(musicModel.getPresenterDuration());
            if (musicModel.getPresenterDuration() <= 0 || strLIZ == null) {
                strLIZ = "";
            }
            c13zcLJIIJ.LJJIIJZLJL(1875505705);
            if (reportReviewStatus == ReportReviewStatus.REPORT_REVIEW_STATUS_UNDER_REVIEW) {
                strLIZIZ = C0MBB.LIZIZ(2131846325, c13zcLJIIJ);
                if (strLIZ.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(" • ");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                strLIZIZ = strLIZ;
            }
            c13zcLJIIJ.LJJJJL(false);
            C1685190txF.LIZ(strLIZIZ, C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 14, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, 102236208, 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS121S0201000_9(c632090Oql, reportReviewStatus, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C632090Oql r19, kotlin.jvm.functions.Function1<? super X.C632090Oql, kotlin.Unit> r20, X.InterfaceC1680500tpg r21, int r22) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668890tWx.LIZJ(X.0Oql, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    public static final void LJ(C05P1<C631220OpM> c05p1, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String musicId;
        EnumC631410Opf enumC631410Opf;
        Pair pair;
        MusicModel musicModel;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1327422274);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C632090Oql c632090Oql = c05p1.getValue().LL;
            if (c632090Oql != null && (musicModel = c632090Oql.getMusicModel()) != null) {
                musicId = musicModel.getMusicId();
            } else {
                musicId = null;
            }
            if (!Intrinsics.LJFF(musicId, str)) {
                enumC631410Opf = EnumC631410Opf.DEFAULT;
            } else {
                enumC631410Opf = c05p1.getValue().LLILLJJLI;
            }
            c13zcLJIIJ.LJJIIJZLJL(-47509178);
            if (enumC631410Opf == EnumC631410Opf.PLAYING) {
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("music_play");
                mobClickObtain.setLabelName("personal_homepage_list");
                mobClickObtain.setValue(str);
                C20684815ws.onEvent(mobClickObtain);
                pair = new Pair(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 27), C1669660tYC.LLLLLZ);
            } else if (enumC631410Opf == EnumC631410Opf.LOADING) {
                pair = new Pair(C1666440tT0.LIZ(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 27), ((Number) C1675690thv.LIZ(C1675690thv.LIZJ(1, c13zcLJIIJ, null), 0.0f, 359.0f, C1671550tbF.LIZ(C1671550tbF.LIZLLL(6000, 0, C1670400tZO.LIZ(c13zcLJIIJ).LJIIJ, 2), C0N66.Restart, 0L, 4), null, c13zcLJIIJ, 4536, 8).getValue()).floatValue()), C1669660tYC.k);
            } else if (enumC631410Opf == EnumC631410Opf.DEFAULT) {
                pair = new Pair(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 27), C1669660tYC.LJZL);
            } else {
                throw new C1954807lC();
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668930tX1.LIZIZ((C1668880tWw) pair.getSecond(), null, (InterfaceC1685750ty9) pair.getFirst(), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), 0.0f, 0.0f, false, c13zcLJIIJ, 48, 112);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C634430OuX(c05p1, str, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.C632090Oql r23, androidx.fragment.app.Fragment r24, X.InterfaceC1680500tpg r25, int r26) {
        /*
            r0 = -254093386(0xfffffffff0dad7b6, float:-5.418281E29)
            r1 = r25
            X.13ZC r0 = r1.LJIIJ(r0)
            r1 = r26
            r2 = r1 & 6
            r3 = r23
            if (r2 != 0) goto Lc4
            boolean r2 = r0.LJII(r3)
            if (r2 == 0) goto Lc1
            r5 = 4
        L18:
            r5 = r5 | r1
        L19:
            r4 = r1 & 48
            r6 = 16
            r2 = r24
            if (r4 != 0) goto L2a
            boolean r4 = r0.LJII(r2)
            if (r4 == 0) goto Lbd
            r4 = 32
        L29:
            r5 = r5 | r4
        L2a:
            r5 = r5 & 19
            r4 = 18
            if (r5 != r4) goto L48
            boolean r4 = r0.LIZ()
            if (r4 == 0) goto L48
            r0.LIZJ()
        L39:
            X.13Ys r5 = r0.LJJJJZI()
            if (r5 == 0) goto L47
            kotlin.jvm.internal.AwS121S0201000_9 r4 = new kotlin.jvm.internal.AwS121S0201000_9
            r0 = 4
            r4.<init>(r3, r2, r1, r0)
            r5.LIZLLL = r4
        L47:
            return
        L48:
            r4 = 2131846315(0x7f1164ab, float:1.9326076E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r4, r0)
            X.0tyA r9 = X.InterfaceC1685750ty9.LIZ
            float r10 = (float) r6
            r11 = 0
            r14 = 10
            r12 = r10
            r13 = r11
            X.0ty9 r9 = X.C1682520tsw.LJIIL(r9, r10, r11, r12, r13, r14)
            X.0tWy r4 = X.C1670400tZO.LIZJ(r0)
            float r5 = r4.LIZ
            r4 = 7
            X.0tTn r17 = X.C1666920tTm.LIZLLL(r5, r0, r4)
            r18 = 0
            r11 = 0
            r5 = 0
            r26 = 31
            r20 = r18
            r22 = r18
            r24 = r0
            r25 = r5
            X.0tSp r18 = X.C1666340tSq.LIZIZ(r18, r20, r22, r24, r25, r26)
            r4 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r0.LJJIIJZLJL(r4)
            boolean r6 = r0.LJII(r3)
            boolean r4 = r0.LJII(r2)
            r6 = r6 | r4
            java.lang.Object r7 = r0.LJJ()
            if (r6 != 0) goto L97
            X.0tph r4 = X.InterfaceC1680500tpg.LIZ
            r4.getClass()
            X.0tpi r4 = X.C1680510tph.LIZIZ
            if (r7 != r4) goto La1
        L97:
            kotlin.jvm.internal.AwS410S0200000_9 r7 = new kotlin.jvm.internal.AwS410S0200000_9
            r4 = 50
            r7.<init>(r3, r2, r4)
            r0.LJJIJIIJI(r7)
        La1:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r0.LJJJJL(r5)
            r10 = 0
            r14 = 0
            r22 = 384(0x180, float:5.38E-43)
            r24 = 6648(0x19f8, float:9.316E-42)
            r13 = r10
            r15 = r14
            r16 = r14
            r19 = r14
            r20 = r10
            r21 = r0
            r23 = r10
            X.C1673400teE.LIZJ(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L39
        Lbd:
            r4 = 16
            goto L29
        Lc1:
            r5 = 2
            goto L18
        Lc4:
            r5 = r1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668890tWx.LJI(X.0Oql, androidx.fragment.app.Fragment, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.InterfaceC636240OxS<X.C632560OrW> r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668890tWx.LJII(X.0OxS, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJIIIIZZ(String str, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22 = function2;
        String str2 = str;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1865070308);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                str2 = "";
            }
            if (i8 != 0) {
                function22 = null;
            }
            C1668060tVc.LIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).J3(), null, function22, C13Z4.LIZJ(2036907238, new AwS128S1000000_25(str2, 1), c13zcLJIIJ), C13Z4.LIZJ(-2085645977, new AwS639S0100000_25(function0, (Function0<Unit>) 34), c13zcLJIIJ), c13zcLJIIJ, ((i3 << 12) & 458752) | 14155782, 22);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1202000_25(str2, (String) function22, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) function0, (Function0<Unit>) i, i2, 0);
        }
    }

    public static final void LJFF(C632090Oql c632090Oql, ReportReviewStatus reportReviewStatus, C05P1<C631220OpM> c05p1, Function1<? super C632090Oql, Unit> function1, Fragment fragment, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iOrdinal;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1461999419);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632090Oql)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (reportReviewStatus == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = reportReviewStatus.ordinal();
            }
            if (c13zcLJIIJ.LJIJI(iOrdinal)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(fragment)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            MusicModel musicModel = c632090Oql.getMusicModel();
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 8;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1682520tsw.LJIIL(c1685760tyA, 16, f, 0.0f, f, 4), 1.0f);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, 72);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIILIIL);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    int i8 = i2 & 14;
                    int i9 = i2 >> 6;
                    LIZJ(c632090Oql, function1, c13zcLJIIJ, (i9 & 112) | i8);
                    LJ(c05p1, musicModel.getMusicId(), c13zcLJIIJ, i9 & 14);
                    c13zcLJIIJ.LJJJJL(true);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), 12, 0.0f, 0.0f, 0.0f, 14);
                    C1680030tov c1680030tov = C1679930tol.LIZJ;
                    C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
                    C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        String name = musicModel.getName();
                        if (name == null) {
                            name = "";
                        }
                        LIZIZ(0, c13zcLJIIJ, name);
                        LJIIIZ(musicModel.getUserCount(), c13zcLJIIJ, 0);
                        LIZ(c632090Oql, reportReviewStatus, c13zcLJIIJ, (i2 & 112) | i8);
                        c13zcLJIIJ.LJJJJL(true);
                        InterfaceC1668050tVb.LIZ.getClass();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1687980u1k.LIZIZ(c.LJIJJLI(c1685760tyA, C1668040tVa.LJIILJJIL, false), C1668040tVa.LJIIJJI);
                        C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
                        int iLIZ4 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL4 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                            c13zcLJIIJ.LJJIIJZLJL(-1331260165);
                            if (reportReviewStatus != null && reportReviewStatus != ReportReviewStatus.REPORT_REVIEW_STATUS_UNDER_REVIEW) {
                                LJI(c632090Oql, fragment, c13zcLJIIJ, i8 | ((i2 >> 9) & 112));
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJJJL(true);
                            c13zcLJIIJ.LJJJJL(true);
                        } else {
                            C0MXE.LIZIZ();
                            throw null;
                        }
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C632610Orb(c632090Oql, reportReviewStatus, c05p1, function1, fragment, i);
        }
    }

    public static final void LIZLLL(C636330Oxb c636330Oxb, InterfaceC636240OxS<C632560OrW> interfaceC636240OxS, final C1690080u58 c1690080u58, C05P1<C631220OpM> c05p1, Fragment fragment, final Function0<Unit> function0, Function1<? super C632090Oql, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zLJII;
        int i9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2082965875);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c636330Oxb);
            } else {
                zLJII = c13zcLJIIJ.LJII(c636330Oxb);
            }
            if (zLJII) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC636240OxS)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1690080u58)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(fragment)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            AbstractC636210OxP loadMoreState = interfaceC636240OxS.getLoadMoreState();
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII2 = c13zcLJIIJ.LJII(interfaceC636240OxS);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C632640Ore(interfaceC636240OxS, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(loadMoreState, (Function2) objLJJ2, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new InterfaceC20086513iZ() { // from class: X.0tWz
                    @Override // X.InterfaceC20086513iZ
                    public final /* synthetic */ Object LLFII(long j, long j2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        return C1670040tYo.LIZ();
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final /* synthetic */ Object LLILII(long j, InterfaceC1364105Vn interfaceC1364105Vn) {
                        return C1670040tYo.LIZIZ();
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final long LJJJLZIJ(int i10, long j) {
                        return 0L;
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final long LJJLI(int i10, long j, long j2) {
                        if (c05p0.getValue().booleanValue() && Float.intBitsToFloat((int) (4294967295L & j2)) < 0.0f && !c1690080u58.LIZJ()) {
                            function0.invoke();
                            c05p0.setValue(Boolean.FALSE);
                            return 0L;
                        }
                        return 0L;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(C1686320tz4.LIZ(InterfaceC1685750ty9.LIZ, (C1668910tWz) objLJJ3, null));
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJII3 = c13zcLJIIJ.LJII(interfaceC636240OxS);
            if ((i2 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = zLJII3 | z;
            if ((3670016 & i2) == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJII4 = z4 | z2 | c13zcLJIIJ.LJII(fragment);
            if ((458752 & i2) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = zLJII4 | z3;
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z5 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS42S0600000_9((InterfaceC636240OxS) interfaceC636240OxS, (InterfaceC636240OxS<C632560OrW>) c05p1, (C05P1<C631220OpM>) function1, (Function1<? super C632090Oql, Unit>) fragment, (Fragment) function0, (Function0<Unit>) c05p0, (C05P0<Boolean>) 0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            int i10 = 0 | ((i2 >> 3) & 14);
            int i11 = i2 << 6;
            C636360Oxe.LIZ(interfaceC636240OxS, interfaceC1685750ty9LIZLLL, c636330Oxb, null, c1690080u58, null, false, null, null, null, false, null, (Function2) objLJJ4, c13zcLJIIJ, i10 | (i11 & 896) | (i11 & 57344), 0, 4072);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C632630Ord(c636330Oxb, interfaceC636240OxS, c1690080u58, c05p1, fragment, function0, function1, i);
        }
    }
}
