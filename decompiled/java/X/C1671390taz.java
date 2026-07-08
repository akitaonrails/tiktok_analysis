package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS121S0201000_9;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS176S0101000_9;
import kotlin.jvm.internal.AwS19S1001000_25;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0taz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671390taz {
    public static final C1669400tXm LIZ = C1669050tXD.LIZIZ(4);

    public static final void LJIIIIZZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        float f;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1315394450);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f2 = 4;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, f2, 0.0f, 0.0f, 0.0f, 14);
            float f3 = (float) 0.5d;
            long jV2 = C1670400tZO.LIZIZ(c13zcLJIIJ).V2();
            if (C1670400tZO.LIZIZ(c13zcLJIIJ).X3()) {
                f = 0.2f;
            } else {
                f = 0.28f;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1675890tiF.LIZ(interfaceC1685750ty9LJIIL, f3, C1685910tyP.LIZJ(f, jV2), C1669050tXD.LIZIZ(f2));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131839295, c13zcLJIIJ), C1682520tsw.LJIIIZ(c1685760tyA, f2, 0), C1670400tZO.LIZIZ(c13zcLJIIJ).V2(), C1670400tZO.LJ(c13zcLJIIJ).LJIJI, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, 102236208, 0, 1712);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 3);
        }
    }

    public static final void LJIILJJIL(AddSongEntranceViewModel addSongEntranceViewModel, C0P08 c0p08) {
        DspPlatform displayedDsp;
        String string;
        if (addSongEntranceViewModel == null || (displayedDsp = addSongEntranceViewModel.getDisplayedDsp()) == null) {
            displayedDsp = DspPlatform.UNKNOWN;
        }
        DspPlatform dspPlatform = DspPlatform.UNKNOWN;
        int i = R.raw.icon_list_add;
        if (displayedDsp != dspPlatform) {
            c0p08.setFallbackEnabled(true);
            c0p08.setFallbackText(C0P2V.LIZIZ(displayedDsp));
            Context context = c0p08.getContext();
            if (context != null) {
                string = context.getString(2131824949, C0P2V.LIZIZ(displayedDsp));
            } else {
                string = null;
            }
            c0p08.setText(string);
            c0p08.LJJJJJ();
            switch (C638390P2f.LIZ[displayedDsp.ordinal()]) {
                case 1:
                    i = R.raw.icon_color_apple_music;
                    break;
                case 2:
                    i = R.raw.icon_color_amazon_music;
                    break;
                case 3:
                    i = R.raw.icon_color_spotify_icon;
                    break;
                case 4:
                    i = R.raw.icon_color_melon;
                    break;
                case 5:
                    i = R.raw.icon_color_deezer_icon;
                    break;
                case 6:
                    i = R.raw.icon_color_soundcloud;
                    break;
                case 7:
                    i = R.raw.icon_color_youtube_music_icon;
                    break;
                case 8:
                    i = R.raw.icon_color_anghami;
                    break;
            }
            c0p08.setButtonStartIcon(Integer.valueOf(i));
            return;
        }
        c0p08.LJJLIIIIJ();
        c0p08.setText(2131824948);
        c0p08.setButtonStartIcon(Integer.valueOf(R.raw.icon_list_add));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:18:0x003d, B:22:0x0064, B:24:0x006a, B:27:0x007d, B:26:0x0073), top: B:35:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.InterfaceC1680500tpg r17, int r18) {
        /*
            r0 = 746518311(0x2c7ef727, float:3.6232768E-12)
            r1 = r17
            X.13ZC r15 = r1.LJIIJ(r0)
            r0 = r18
            r2 = r0 & 6
            r4 = 2
            r3 = 4
            r1 = r16
            if (r2 != 0) goto La4
            boolean r2 = r15.LJII(r1)
            if (r2 == 0) goto La1
            r5 = 4
        L1a:
            r5 = r5 | r0
        L1b:
            r2 = r5 & 3
            if (r2 != r4) goto L38
            boolean r2 = r15.LIZ()
            if (r2 == 0) goto L38
            r15.LIZJ()
        L28:
            X.13Ys r4 = r15.LJJJJZI()
            if (r4 == 0) goto L37
            kotlin.jvm.internal.AwS181S0101000_25 r3 = new kotlin.jvm.internal.AwS181S0101000_25
            r2 = 23
            r3.<init>(r0, r1, r2)
            r4.LIZLLL = r3
        L37:
            return
        L38:
            java.lang.String r2 = "zprofile_music_tab:cell:detail_icon"
            android.os.Trace.beginSection(r2)
            X.0tWw r7 = X.C1669660tYC.LLLIL     // Catch: java.lang.Throwable -> La7
            java.lang.String r8 = "Detail icon"
            X.0tyA r9 = X.InterfaceC1685750ty9.LIZ     // Catch: java.lang.Throwable -> La7
            float r11 = (float) r3     // Catch: java.lang.Throwable -> La7
            r2 = 16
            float r10 = (float) r2     // Catch: java.lang.Throwable -> La7
            r12 = 0
            r14 = 12
            r13 = r12
            X.0ty9 r4 = X.C1682520tsw.LJIIL(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> La7
            r2 = 24
            float r2 = (float) r2     // Catch: java.lang.Throwable -> La7
            X.0ty9 r6 = androidx.compose.foundation.layout.c.LJIILIIL(r4, r2)     // Catch: java.lang.Throwable -> La7
            r2 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r2)     // Catch: java.lang.Throwable -> La7
            r2 = r5 & 14
            r5 = 0
            if (r2 != r3) goto L63
            r2 = 1
            goto L64
        L63:
            r2 = 0
        L64:
            java.lang.Object r4 = r15.LJJ()     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto L73
            X.0tph r2 = X.InterfaceC1680500tpg.LIZ     // Catch: java.lang.Throwable -> La7
            r2.getClass()     // Catch: java.lang.Throwable -> La7
            X.0tpi r2 = X.C1680510tph.LIZIZ     // Catch: java.lang.Throwable -> La7
            if (r4 != r2) goto L7d
        L73:
            kotlin.jvm.internal.AwS569S0100000_25 r4 = new kotlin.jvm.internal.AwS569S0100000_25     // Catch: java.lang.Throwable -> La7
            r2 = 202(0xca, float:2.83E-43)
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> La7
            r15.LJJIJIIJI(r4)     // Catch: java.lang.Throwable -> La7
        L7d:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4     // Catch: java.lang.Throwable -> La7
            r15.LJJJJL(r5)     // Catch: java.lang.Throwable -> La7
            r3 = 7
            r2 = 0
            X.0ty9 r9 = X.C634380OuS.LIZJ(r6, r5, r2, r4, r3)     // Catch: java.lang.Throwable -> La7
            X.1ETK r2 = X.C1670400tZO.LIZIZ(r15)     // Catch: java.lang.Throwable -> La7
            long r10 = r2.K3()     // Catch: java.lang.Throwable -> La7
            r2 = 22
            float r12 = (float) r2     // Catch: java.lang.Throwable -> La7
            r14 = 0
            r16 = 221232(0x36030, float:3.10012E-40)
            r17 = 64
            r13 = r12
            X.C1668930tX1.LIZIZ(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> La7
            android.os.Trace.endSection()
            goto L28
        La1:
            r5 = 2
            goto L1a
        La4:
            r5 = r0
            goto L1b
        La7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La7
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LIZIZ(kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LIZLLL(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1605485895);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 5);
        }
    }

    public static final void LJI(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-262644719);
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
            Trace.beginSection("zprofile_music_tab:cell:fresco");
            try {
                Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                Object obj = objLJJ;
                if (objLJJ == c1680520tpi) {
                    Drawable drawable = C1671410tb1.LIZ;
                    Drawable drawable2 = drawable;
                    if (drawable == null) {
                        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.czo);
                        if (drawableLIZIZ != null) {
                            C1671410tb1.LIZ = drawableLIZIZ;
                            drawable2 = drawableLIZIZ;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    c13zcLJIIJ.LJJIJIIJI(drawable2);
                    obj = drawable2;
                }
                Drawable drawable3 = (Drawable) obj;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                Object obj2 = objLJJ2;
                if (objLJJ2 == c1680520tpi) {
                    Drawable drawable4 = C1671410tb1.LIZIZ;
                    Drawable drawable5 = drawable4;
                    if (drawable4 == null) {
                        Drawable drawableLIZIZ2 = C800330VaR.LIZIZ(context, R.drawable.cyv);
                        if (drawableLIZIZ2 != null) {
                            C1671410tb1.LIZIZ = drawableLIZIZ2;
                            drawable5 = drawableLIZIZ2;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    c13zcLJIIJ.LJJIJIIJI(drawable5);
                    obj2 = drawable5;
                }
                c13zcLJIIJ.LJJJJL(false);
                C1175204ik c1175204ik = new C1175204ik(str);
                C989460br6 c989460br6 = new C989460br6(drawable3);
                C989460br6 c989460br62 = new C989460br6((Drawable) obj2);
                long jT2 = C1670400tZO.LIZIZ(c13zcLJIIJ).T2();
                C1669400tXm c1669400tXm = LIZ;
                C1670600tZi.LIZ(c1175204ik, "Music album cover", C1667200tUE.LIZ(C1675890tiF.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), (float) 0.5d, jT2, c1669400tXm), c1669400tXm), null, null, c989460br6, c989460br62, null, null, null, c13zcLJIIJ, 48, 920);
                Trace.endSection();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 6);
        }
    }

    public static final void LJIIIZ(EnumC631410Opf enumC631410Opf, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        Pair pair;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(929589427);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC631410Opf.ordinal())) {
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
            Trace.beginSection("zprofile_music_tab:cell:play_icon");
            try {
                c13zcLJIIJ.LJJIIJZLJL(-17752533);
                if (enumC631410Opf == EnumC631410Opf.PLAYING) {
                    pair = new Pair(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 27), C1669660tYC.LLLLLZ);
                } else if (enumC631410Opf == EnumC631410Opf.LOADING) {
                    pair = new Pair(C1666440tT0.LIZ(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 27), ((Number) C1675690thv.LIZ(C1675690thv.LIZJ(0, c13zcLJIIJ, "music_play_icon"), 0.0f, 359.0f, C1671550tbF.LIZ(C1671550tbF.LIZLLL(6000, 0, C1670400tZO.LIZ(c13zcLJIIJ).LJIIJ, 2), C0N66.Restart, 0L, 4), "music_play_icon", c13zcLJIIJ, 29112, 0).getValue()).floatValue()), C1669660tYC.k);
                } else if (enumC631410Opf == EnumC631410Opf.DEFAULT) {
                    pair = new Pair(c.LJIILIIL(InterfaceC1685750ty9.LIZ, 27), C1669660tYC.LJZL);
                } else {
                    throw new C1954807lC();
                }
                c13zcLJIIJ.LJJJJL(false);
                C1668930tX1.LIZIZ((C1668880tWw) pair.getSecond(), "Music play icon", (InterfaceC1685750ty9) pair.getFirst(), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), 0.0f, 0.0f, true, c13zcLJIIJ, 1572912, 48);
                Trace.endSection();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS176S0101000_9(enumC631410Opf, i, 1);
        }
    }

    public static final void LJIIL(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1829597849);
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
            C1685190txF.LIZ(str, C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 2, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i2 & 14) | 102236208, 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0142 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178 A[Catch: all -> 0x0295, TryCatch #0 {all -> 0x0295, blocks: (B:24:0x0052, B:26:0x0062, B:27:0x006b, B:96:0x027d, B:97:0x0282, B:36:0x00bb, B:98:0x0283, B:99:0x0288, B:45:0x00e3, B:100:0x0289, B:101:0x028e, B:53:0x0129, B:102:0x028f, B:103:0x0294, B:61:0x014e, B:63:0x0178, B:65:0x0186, B:67:0x0194, B:81:0x01e9, B:83:0x01ee, B:87:0x0234, B:91:0x0246, B:90:0x023c, B:82:0x01ec, B:68:0x019a, B:70:0x01a8, B:72:0x01b6, B:73:0x01bc, B:75:0x01c6, B:77:0x01d4, B:79:0x01e2), top: B:108:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a A[Catch: all -> 0x0295, TryCatch #0 {all -> 0x0295, blocks: (B:24:0x0052, B:26:0x0062, B:27:0x006b, B:96:0x027d, B:97:0x0282, B:36:0x00bb, B:98:0x0283, B:99:0x0288, B:45:0x00e3, B:100:0x0289, B:101:0x028e, B:53:0x0129, B:102:0x028f, B:103:0x0294, B:61:0x014e, B:63:0x0178, B:65:0x0186, B:67:0x0194, B:81:0x01e9, B:83:0x01ee, B:87:0x0234, B:91:0x0246, B:90:0x023c, B:82:0x01ec, B:68:0x019a, B:70:0x01a8, B:72:0x01b6, B:73:0x01bc, B:75:0x01c6, B:77:0x01d4, B:79:0x01e2), top: B:108:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc A[Catch: all -> 0x0295, TryCatch #0 {all -> 0x0295, blocks: (B:24:0x0052, B:26:0x0062, B:27:0x006b, B:96:0x027d, B:97:0x0282, B:36:0x00bb, B:98:0x0283, B:99:0x0288, B:45:0x00e3, B:100:0x0289, B:101:0x028e, B:53:0x0129, B:102:0x028f, B:103:0x0294, B:61:0x014e, B:63:0x0178, B:65:0x0186, B:67:0x0194, B:81:0x01e9, B:83:0x01ee, B:87:0x0234, B:91:0x0246, B:90:0x023c, B:82:0x01ec, B:68:0x019a, B:70:0x01a8, B:72:0x01b6, B:73:0x01bc, B:75:0x01c6, B:77:0x01d4, B:79:0x01e2), top: B:108:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9 A[Catch: all -> 0x0295, TryCatch #0 {all -> 0x0295, blocks: (B:24:0x0052, B:26:0x0062, B:27:0x006b, B:96:0x027d, B:97:0x0282, B:36:0x00bb, B:98:0x0283, B:99:0x0288, B:45:0x00e3, B:100:0x0289, B:101:0x028e, B:53:0x0129, B:102:0x028f, B:103:0x0294, B:61:0x014e, B:63:0x0178, B:65:0x0186, B:67:0x0194, B:81:0x01e9, B:83:0x01ee, B:87:0x0234, B:91:0x0246, B:90:0x023c, B:82:0x01ec, B:68:0x019a, B:70:0x01a8, B:72:0x01b6, B:73:0x01bc, B:75:0x01c6, B:77:0x01d4, B:79:0x01e2), top: B:108:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec A[Catch: all -> 0x0295, TryCatch #0 {all -> 0x0295, blocks: (B:24:0x0052, B:26:0x0062, B:27:0x006b, B:96:0x027d, B:97:0x0282, B:36:0x00bb, B:98:0x0283, B:99:0x0288, B:45:0x00e3, B:100:0x0289, B:101:0x028e, B:53:0x0129, B:102:0x028f, B:103:0x0294, B:61:0x014e, B:63:0x0178, B:65:0x0186, B:67:0x0194, B:81:0x01e9, B:83:0x01ee, B:87:0x0234, B:91:0x0246, B:90:0x023c, B:82:0x01ec, B:68:0x019a, B:70:0x01a8, B:72:0x01b6, B:73:0x01bc, B:75:0x01c6, B:77:0x01d4, B:79:0x01e2), top: B:108:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023c A[Catch: all -> 0x0295, TryCatch #0 {all -> 0x0295, blocks: (B:24:0x0052, B:26:0x0062, B:27:0x006b, B:96:0x027d, B:97:0x0282, B:36:0x00bb, B:98:0x0283, B:99:0x0288, B:45:0x00e3, B:100:0x0289, B:101:0x028e, B:53:0x0129, B:102:0x028f, B:103:0x0294, B:61:0x014e, B:63:0x0178, B:65:0x0186, B:67:0x0194, B:81:0x01e9, B:83:0x01ee, B:87:0x0234, B:91:0x0246, B:90:0x023c, B:82:0x01ec, B:68:0x019a, B:70:0x01a8, B:72:0x01b6, B:73:0x01bc, B:75:0x01c6, B:77:0x01d4, B:79:0x01e2), top: B:108:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(boolean r25, kotlin.jvm.functions.Function0<java.lang.Boolean> r26, X.InterfaceC1680500tpg r27, int r28) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LIZ(boolean, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LIZJ(EnumC1563010qmB enumC1563010qmB, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(546313130);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1563010qmB.ordinal())) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 24;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c.LJIILIIL(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 4, 0.0f, 0.0f, 13), f), false, null, function0, 7);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f2 = 1;
                float f3 = 20;
                boolean z = false;
                C1668930tX1.LIZIZ(C1669660tYC.LLJILJILJ, "Feature video icon", C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, f2, f2, 3), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), f3, f3, false, c13zcLJIIJ, 221232, 64);
                c13zcLJIIJ.LJJIIJZLJL(38974952);
                if (enumC1563010qmB == EnumC1563010qmB.NOT_PINNED) {
                    z = false;
                    c13zcLJIIJ = c13zcLJIIJ;
                    C1668930tX1.LIZIZ(C1669660tYC.LLF, "Feature video icon red dot", null, 0L, f, f, false, c13zcLJIIJ, 221232, 76);
                }
                c13zcLJIIJ.LJJJJL(z);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(enumC1563010qmB, (EnumC1563010qmB) function0, (Function0<Unit>) i, 28);
        }
    }

    public static final void LJIIJJI(EnumC631610Opz enumC631610Opz, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        C1668880tWw c1668880tWw;
        long jK3;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1457329263);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC631610Opz.ordinal())) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            EnumC631610Opz enumC631610Opz2 = EnumC631610Opz.PINNED;
            if (enumC631610Opz == enumC631610Opz2) {
                c1668880tWw = C1669660tYC.LLLZL;
            } else {
                c1668880tWw = C1669660tYC.LLLZIL;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c.LJIILIIL(C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 16, 4, 0.0f, 0.0f, 12), 24), false, null, function0, 7);
            if (enumC631610Opz != enumC631610Opz2 && enumC631610Opz != EnumC631610Opz.ENABLE_PINNED) {
                c13zcLJIIJ.LJJIIJZLJL(-334066494);
                jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).Q3();
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-334067432);
                jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
            }
            c13zcLJIIJ.LJJJJL(false);
            float f = 20;
            C1668930tX1.LIZIZ(c1668880tWw, "Pin icon", interfaceC1685750ty9LIZJ, jK3, f, f, false, c13zcLJIIJ, 221232, 64);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS121S0201000_9(enumC631610Opz, (EnumC631610Opz) function0, (Function0<Unit>) i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.base.model.UrlModel r30, java.lang.String r31, boolean r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, X.InterfaceC1680500tpg r34, int r35) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LJ(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, boolean, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, X.InterfaceC1680500tpg r30, int r31) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LJII(java.lang.String, java.lang.String, boolean, boolean, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL(int r27, int r28, X.InterfaceC1680500tpg r29, java.lang.String r30, java.lang.String r31, kotlin.jvm.functions.Function0 r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LJIILL(int, int, X.0tpg, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, boolean):void");
    }

    public static final void LJIILLIIL(String str, EnumC631610Opz enumC631610Opz, Boolean bool, String str2, String str3, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(937268260);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC631610Opz.ordinal())) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(bool)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str3)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 14, 0.0f, 0.0f, 13);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i2 & 14) | 102236160, 0, 1714);
                c13zcLJIIJ.LJJIIJZLJL(793617536);
                if (enumC631610Opz == EnumC631610Opz.PINNED && !z2) {
                    LJIIIIZZ(c13zcLJIIJ, 0);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(793620911);
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    int i10 = i2 >> 9;
                    LJII(str2, str3, z, z2, c13zcLJIIJ, (i10 & 7168) | (i10 & 14) | (i10 & 112) | (i10 & 896));
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C632750Orp(str, enumC631610Opz, bool, str2, str3, z, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(boolean r31, com.ss.android.ugc.aweme.music.model.DspPlatform r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.C05P1<X.C233800vI> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, com.ss.android.ugc.aweme.music.model.Music r37, com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel r38, X.InterfaceC1680500tpg r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LJIILIIL(boolean, com.ss.android.ugc.aweme.music.model.DspPlatform, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.05P1, kotlin.jvm.functions.Function0, com.ss.android.ugc.aweme.music.model.Music, com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel, X.0tpg, int, int):void");
    }

    public static final void LJFF(MusicModel musicModel, C631940OqW c631940OqW, boolean z, boolean z2, EnumC631410Opf enumC631410Opf, C05P1<C1556770qc7> c05p1, Function0<Unit> function0, Function0<Unit> function02, C05P1<C631690Oq7> c05p12, Function0<Boolean> function03, Function0<Unit> function04, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        String picPremium;
        boolean z3;
        MusicModel.CollectionType collectionType;
        Boolean boolValueOf;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1682353740);
        int i15 = 4;
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(musicModel)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c631940OqW)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i3 |= i12;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i11 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC631410Opf.ordinal())) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p12)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        if ((i2 & 6) == 0) {
            if (!c13zcLJIIJ.LJII(function04)) {
                i15 = 2;
            }
            i4 = i2 | i15;
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, c1296880jqw, c13zcLJIIJ, 0);
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
                c13zcLJIIJ.LJJIIJZLJL(632247527);
                Trace.beginSection("zprofile_music_tab:cell:cover");
                try {
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
                        String name = "";
                        if (!C123100dR.LIZ(musicModel.getPicPremium())) {
                            if (!C123100dR.LIZ(musicModel.getPicBig())) {
                                picPremium = "";
                            } else {
                                picPremium = musicModel.getPicBig();
                            }
                        } else {
                            picPremium = musicModel.getPicPremium();
                        }
                        LJI(0, c13zcLJIIJ, picPremium);
                        LJIIIZ(enumC631410Opf, c13zcLJIIJ, (i3 >> 12) & 14);
                        c13zcLJIIJ.LJJJJL(true);
                        Trace.endSection();
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(632262788);
                        Trace.beginSection("zprofile_music_tab:cell:text");
                        try {
                            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), 12, 0.0f, 0.0f, 0.0f, 14);
                            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
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
                                if (C123100dR.LIZ(musicModel.getName())) {
                                    name = musicModel.getName();
                                }
                                LIZLLL(0, c13zcLJIIJ, name);
                                LJIIL(0, c13zcLJIIJ, C0MBB.LIZJ(2131839045, new Object[]{C0OY0.LIZIZ(Integer.valueOf(musicModel.getUserCount()))}, c13zcLJIIJ));
                                c13zcLJIIJ.LJJIIJZLJL(-836249751);
                                if (musicModel.getPresenterDuration() > 0) {
                                    String strLIZ = C0OY0.LIZ(musicModel.getPresenterDuration());
                                    EnumC631610Opz enumC631610Opz = c631940OqW.pinStatus;
                                    MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
                                    if (musicReleaseInfo != null) {
                                        boolValueOf = Boolean.valueOf(musicReleaseInfo.isNewReleaseSong());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    LJIILLIIL(strLIZ, enumC631610Opz, boolValueOf, musicModel.getMusicId(), musicModel.getAwemeId(), z, c631940OqW.isHighlighted(), c13zcLJIIJ, (i3 << 9) & 458752);
                                }
                                c13zcLJIIJ.LJJJJL(false);
                                c13zcLJIIJ.LJJJJL(true);
                                Trace.endSection();
                                c13zcLJIIJ.LJJJJL(false);
                                c13zcLJIIJ.LJJIIJZLJL(632291397);
                                Trace.beginSection("zprofile_music_tab:cell:icons");
                                try {
                                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c.LIZIZ(c1685760tyA, 1.0f);
                                    C1688120u1y c1688120u1yLIZ2 = C1665750tRt.LIZ(c1679920tok, c1296880jqw, c13zcLJIIJ, 0);
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
                                        C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ2, aFwS311S0000000_25);
                                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                                        }
                                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                                        if (z2) {
                                            c13zcLJIIJ.LJJIIJZLJL(-1718594250);
                                            if (Intrinsics.LJFF(c05p1.getValue().LL, musicModel.getMusicId())) {
                                                musicModel.setPinnedVideoStatus(c05p1.getValue().LLILLJJLI.getValue());
                                            }
                                            EnumC1563010qmB enumC1563010qmBLIZ = C1576570r83.LIZ(musicModel.getPinnedVideoStatus());
                                            c13zcLJIIJ.LJJIIJZLJL(221665592);
                                            if (C2277881EDy.LIZIZ.enableShowFeatureVideoEntrance() && enumC1563010qmBLIZ != EnumC1563010qmB.NOT_ALLOWED_SHOWN) {
                                                LIZJ(enumC1563010qmBLIZ, function0, c13zcLJIIJ, (i3 >> 15) & 112);
                                            }
                                            c13zcLJIIJ.LJJJJL(false);
                                            if (!c631940OqW.isSimilarMusic() && !c631940OqW.isHighlighted()) {
                                                LJIIJJI(c631940OqW.pinStatus, function02, c13zcLJIIJ, (i3 >> 18) & 112);
                                            }
                                            c13zcLJIIJ.LJJJJL(false);
                                        } else {
                                            c13zcLJIIJ.LJJIIJZLJL(-1717888845);
                                            if (Intrinsics.LJFF(c05p12.getValue().LL, musicModel.getMusicId())) {
                                                if (c05p12.getValue().LLILLJJLI) {
                                                    collectionType = MusicModel.CollectionType.COLLECTED;
                                                } else {
                                                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                                }
                                                musicModel.setCollectionType(collectionType);
                                            }
                                            if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            LIZ(z3, function03, c13zcLJIIJ, (i3 >> 24) & 112);
                                            c13zcLJIIJ.LJJJJL(false);
                                        }
                                        LIZIZ(function04, c13zcLJIIJ, i4 & 14);
                                        c13zcLJIIJ.LJJJJL(true);
                                        Trace.endSection();
                                        c13zcLJIIJ.LJJJJL(false);
                                        c13zcLJIIJ.LJJJJL(true);
                                    } else {
                                        C0MXE.LIZIZ();
                                        throw null;
                                    }
                                } finally {
                                }
                            } else {
                                C0MXE.LIZIZ();
                                throw null;
                            }
                        } finally {
                        }
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    Trace.endSection();
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C632720Orm(musicModel, c631940OqW, z, z2, enumC631410Opf, c05p1, function0, function02, c05p12, function03, function04, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039b A[Catch: all -> 0x069c, TryCatch #2 {all -> 0x069c, blocks: (B:162:0x039b, B:164:0x03a1, B:166:0x03c8, B:168:0x03cf, B:170:0x03d5, B:172:0x03d8, B:171:0x03d7, B:167:0x03cc, B:173:0x03e1, B:127:0x01f7, B:129:0x01fd, B:131:0x0203, B:133:0x0263, B:135:0x0267, B:136:0x026c, B:138:0x0277, B:140:0x0287, B:141:0x02b6, B:142:0x02c0, B:143:0x02cf, B:145:0x02e9, B:146:0x02ed, B:148:0x031b, B:150:0x032d, B:151:0x0345, B:152:0x034d, B:154:0x0367, B:155:0x036b, B:157:0x0381, B:158:0x0387, B:160:0x038d, B:161:0x0394), top: B:255:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05bf  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0tpg, X.13ZC] */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(X.C632090Oql r52, X.C631640Oq2 r53, X.EnumC631410Opf r54, kotlin.Pair<java.lang.Integer, java.lang.Integer> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.C05P1<X.C1556770qc7> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, X.C05P1<X.C631690Oq7> r62, kotlin.jvm.functions.Function0<java.lang.Boolean> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, X.C05P1<X.C233800vI> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, kotlin.jvm.functions.Function0<kotlin.Unit> r68, X.InterfaceC1680500tpg r69, int r70, int r71) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671390taz.LJIIJ(X.0Oql, X.0Oq2, X.0Opf, kotlin.Pair, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.05P1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.05P1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.05P1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
