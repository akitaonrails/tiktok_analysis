package X;

import android.graphics.Typeface;
import android.os.Build;
import com.lynx.canvas.CanvasFontRegistry;
import com.lynx.canvas.Krypton;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300770jxD {
    public static final C1300770jxD LIZ = new C1300770jxD();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("proximanova-bold", "'proximanova-bold'", "\"proximanova-bold\"", "tiktokfont-bold", "'tiktokfont-bold'", "\"tiktokfont-bold\"");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("proximanova-semibold", "'proximanova-semibold'", "\"proximanova-semibold\"", "tiktokfont-semibold", "'tiktokfont-semibold'", "\"tiktokfont-semibold\"");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("proximanova-regular", "'proximanova-regular'", "\"proximanova-regular\"", "tiktokfont-regular", "'tiktokfont-regular'", "\"tiktokfont-regular\"");
    public static final List<String> LJ = C1697810uHb.LJIIJJI("tiktokdisplayfont-bold", "'tiktokdisplayfont-bold'", "\"tiktokdisplayfont-bold\"");
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("tiktokdisplayfont-semibold", "'tiktokdisplayfont-semibold'", "\"tiktokdisplayfont-semibold\"");
    public static final List<String> LJI = C1697810uHb.LJIIJJI("tiktokdisplayfont-regular", "'tiktokdisplayfont-regular'", "\"tiktokdisplayfont-regular\"");
    public static final List<String> LJII = C1697810uHb.LJIIJJI("tiktoksans", "'tiktoksans'", "\"tiktoksans\"");
    public static volatile boolean LJIIIIZZ;
    public static volatile boolean LJIIIZ;

    public final synchronized void LIZ() {
        if (!LJIIIIZZ) {
            C1300980jxY.LIZ(new InterfaceC1300810jxH() { // from class: X.0jxB
                @Override // X.InterfaceC1300810jxH
                public final Typeface LIZ(int i, String str) {
                    C1300760jxC c1300760jxCLIZIZ;
                    boolean z;
                    int i2;
                    float f;
                    String lowerCase = str.toLowerCase(Locale.ENGLISH);
                    boolean z2 = false;
                    if (C1300770jxD.LJII.contains(lowerCase)) {
                        if ((i & 1) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((i & 2) != 0) {
                            z2 = true;
                        }
                        if (z) {
                            i2 = OppoPermissionPopupMaskDelayExp.DEFAULT;
                        } else {
                            i2 = 400;
                        }
                        if (z2) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        return C1697580uHE.LIZIZ(0.0f, i2, 17.0f, f, null, 0.0f, 0, null, 240);
                    }
                    if (C1300770jxD.LIZIZ.contains(lowerCase)) {
                        c1300760jxCLIZIZ = C1300770jxD.LIZIZ(3, false);
                    } else if (C1300770jxD.LIZJ.contains(lowerCase)) {
                        c1300760jxCLIZIZ = C1300770jxD.LIZIZ(2, false);
                    } else if (C1300770jxD.LIZLLL.contains(lowerCase)) {
                        c1300760jxCLIZIZ = C1300770jxD.LIZIZ(1, false);
                    } else if (C1300770jxD.LJ.contains(lowerCase)) {
                        c1300760jxCLIZIZ = C1300770jxD.LIZIZ(3, true);
                    } else if (C1300770jxD.LJFF.contains(lowerCase)) {
                        c1300760jxCLIZIZ = C1300770jxD.LIZIZ(2, true);
                    } else {
                        if (!C1300770jxD.LJI.contains(lowerCase)) {
                            return null;
                        }
                        c1300760jxCLIZIZ = C1300770jxD.LIZIZ(1, true);
                    }
                    if (c1300760jxCLIZIZ == null) {
                        return null;
                    }
                    return C1697580uHE.LIZIZ(0.0f, c1300760jxCLIZIZ.LIZ, c1300760jxCLIZIZ.LIZIZ, 0.0f, null, 0.0f, 0, null, 240);
                }
            });
            ((ArrayList) C1301040jxe.LIZIZ).add(new InterfaceC1301020jxc() { // from class: X.0jxa
                @Override // X.InterfaceC1301020jxc
                public final void LIZ() {
                    synchronized (C1300770jxD.LIZ) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            C1300980jxY.LJI();
                            C1301010jxb.LIZ.LIZ.evictAll();
                        }
                    }
                }
            });
            LJIIIIZZ = true;
        }
    }

    public final synchronized void LIZJ() {
        if (!LJIIIZ) {
            Krypton kryptonLIZIZ = Krypton.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("assets://");
            sbLIZ.append(C1697600uHG.LIZ(3, false));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            kryptonLIZIZ.getClass();
            Krypton.LIZLLL(OppoPermissionPopupMaskDelayExp.DEFAULT, "tiktokfont-bold", strLIZIZ);
            Krypton kryptonLIZIZ2 = Krypton.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("assets://");
            sbLIZ2.append(C1697600uHG.LIZ(2, false));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            kryptonLIZIZ2.getClass();
            Krypton.LIZLLL(OppoPermissionPopupMaskDelayExp.DEFAULT, "tiktokfont-semibold", strLIZIZ2);
            Krypton kryptonLIZIZ3 = Krypton.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("assets://");
            sbLIZ3.append(C1697600uHG.LIZ(1, false));
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            kryptonLIZIZ3.getClass();
            Krypton.LIZLLL(400, "tiktokfont-regular", strLIZIZ3);
            Krypton kryptonLIZIZ4 = Krypton.LIZIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("assets://");
            sbLIZ4.append(C1697600uHG.LIZ(3, true));
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            kryptonLIZIZ4.getClass();
            Krypton.LIZLLL(OppoPermissionPopupMaskDelayExp.DEFAULT, "tiktokdisplayfont-bold", strLIZIZ4);
            Krypton kryptonLIZIZ5 = Krypton.LIZIZ();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("assets://");
            sbLIZ5.append(C1697600uHG.LIZ(2, true));
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
            kryptonLIZIZ5.getClass();
            Krypton.LIZLLL(OppoPermissionPopupMaskDelayExp.DEFAULT, "tiktokdisplayfont-semibold", strLIZIZ5);
            Krypton kryptonLIZIZ6 = Krypton.LIZIZ();
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("assets://");
            sbLIZ6.append(C1697600uHG.LIZ(1, true));
            String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
            kryptonLIZIZ6.getClass();
            Krypton.LIZLLL(400, "tiktokdisplayfont-regular", strLIZIZ6);
            Krypton.LIZIZ().getClass();
            Krypton.LIZLLL(400, "TikTokSans", "assets://font/TikTokSans-VF.otf");
            Krypton.LIZIZ().getClass();
            CanvasFontRegistry.LIZ().LIZJ();
            LJIIIZ = true;
        }
    }

    public static final C1300760jxC LIZIZ(int i, boolean z) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                if (z) {
                    return new C1300760jxC(28.0f, OppoPermissionPopupMaskDelayExp.DEFAULT);
                }
                return new C1300760jxC(17.0f, OppoPermissionPopupMaskDelayExp.DEFAULT);
            }
            if (z) {
                return new C1300760jxC(28.0f, 600);
            }
            return new C1300760jxC(17.0f, 600);
        }
        if (z) {
            return new C1300760jxC(28.0f, 400);
        }
        return new C1300760jxC(17.0f, 400);
    }
}
