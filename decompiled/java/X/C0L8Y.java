package X;

import Y.AObjectS349S0100000_5;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0L8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L8Y {
    public volatile boolean LIZ;
    public C352570Drz LIZIZ;

    public static String LIZ(String str, String str2) {
        boolean z;
        boolean zLJJIIZI;
        String strSubstring;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str2;
        }
        if (str != null) {
            zLJJIIZI = a0.LJJIIZI(str, File.separator, false);
        } else {
            zLJJIIZI = false;
        }
        if (zLJJIIZI) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('.');
                if (str == null) {
                    strSubstring = null;
                } else {
                    strSubstring = str.substring(a0.LJJJJI(str, File.separator, 0, 6) + 1);
                }
                sbLIZ.append(strSubstring);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ.equals(".jpeg")) {
                    return ".jpg";
                }
                return strLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str2;
    }

    public static boolean LIZIZ(Context context, C0L8Q c0l8q) {
        VEConfig vEConfig = C1779660wPc.LIZ;
        int i = vEConfig.featureConfig.importResolutionRatio;
        int i2 = c0l8q.LIZIZ;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            int iLIZIZ = C2474309mn.LIZIZ(context, c0l8q.LIZ);
            C539280LDa c539280LDaLIZ = MediaUtil.LIZ.LIZ(context, c0l8q.LIZ);
            if (Intrinsics.LJFF("h265", c539280LDaLIZ.LJIIIZ)) {
                return true;
            }
            int i3 = c539280LDaLIZ.LJI;
            if ((i3 < 60 || iLIZIZ < 8847360) && iLIZIZ <= i && !u.LJIIZILJ(c0l8q.LIZ, "avi", true) && i3 <= vEConfig.featureConfig.importFps) {
                return false;
            }
            return true;
        }
        if (C2474309mn.LIZ(context, c0l8q.LIZ) <= i) {
            return false;
        }
        return true;
    }

    public final void LIZJ(final int i, final Context context, final List list, final Function0 function0, final Function1 function1, final Function1 function12) throws Throwable {
        String strLIZIZ;
        String strLIZIZ2;
        String strLJ;
        final C0L8Q c0l8q = (C0L8Q) ListProtector.get(list, i);
        String str = c0l8q.LIZ;
        if (a0.LJJJJI(str, File.separator, 0, 6) > 0) {
            C2473009ma.LIZ.getClass();
            if (C2473009ma.LJI(str)) {
                Uri uri = UriProtector.parse(str);
                if (a0.LJJIIZI(str, "image", false)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    C2473009ma.LIZLLL(context, UriProtector.parse(str), new AObjectS349S0100000_5(options, 0));
                    String strLIZ = LIZ(options.outMimeType, ".png");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C2117808Rk.LIZIZ(context, uri));
                    sbLIZ.append(strLIZ);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    MediaMetadataRetriever mediaMetadataRetrieverLJ = C2473009ma.LJ(context, str);
                    try {
                        try {
                            strLJ = C20144413ru.LJ(mediaMetadataRetrieverLJ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                mediaMetadataRetrieverLJ.release();
                                throw th;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw th;
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        strLJ = null;
                    }
                    try {
                        mediaMetadataRetrieverLJ.release();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    String strLIZ2 = LIZ(strLJ, ".mp4");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C2117808Rk.LIZIZ(context, uri));
                    sbLIZ2.append(strLIZ2);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C2117808Rk.LIZJ(str));
                sbLIZ3.append(str.substring(a0.LJJJJ(str, '.', 0, 6)));
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(C353030Dsj.LIZ);
            sbLIZ4.append(File.separator);
            sbLIZ4.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getOutputPath: value = ");
            sbLIZ5.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ5);
        } else {
            strLIZIZ = "";
        }
        if (this.LIZ) {
            return;
        }
        if (C0L8X.LIZ.LIZJ(strLIZIZ)) {
            c0l8q.LIZJ = true;
            c0l8q.LIZ = strLIZIZ;
            if (function0 != null) {
                function0.invoke();
            }
            int i2 = i + 1;
            if (i2 < list.size()) {
                LIZJ(i2, context, list, function0, function1, function12);
                return;
            } else {
                function12.invoke(Boolean.TRUE);
                return;
            }
        }
        C539510LDx c539510LDx = C539510LDx.LIZ;
        String str2 = C353030Dsj.LIZ;
        InterfaceC352560Dry interfaceC352560Dry = new InterfaceC352560Dry() { // from class: X.0L8U
            @Override // X.InterfaceC352560Dry
            public final void LIZJ(C352570Drz c352570Drz) {
                C0L8Y c0l8y = this.LIZ;
                c0l8y.LIZIZ = c352570Drz;
                if (c0l8y.LIZ) {
                    c352570Drz.LIZ();
                }
            }

            @Override // X.InterfaceC352560Dry
            public final void onProgress(float f) {
                Function1<Float, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(Float.valueOf(f));
                }
            }

            @Override // X.InterfaceC352560Dry
            public final void LIZIZ(String str3, String str4) {
                C2473009ma c2473009ma = C2473009ma.LIZ;
                C0VSJ c0vsj = new C0VSJ(str4);
                c2473009ma.getClass();
                C2473009ma.LJIIIIZZ(c0vsj);
            }

            @Override // X.InterfaceC352560Dry
            public final void LJJI(String str3, String str4) throws Throwable {
                C0L8Q c0l8q2 = c0l8q;
                c0l8q2.LIZJ = true;
                c0l8q2.LIZ = str4;
                C0L8X.LIZ.LIZ(str4);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
                int i3 = i + 1;
                if (i3 < list.size()) {
                    this.LIZ.LIZJ(i3, context, list, function0, function1, function12);
                    return;
                }
                function12.invoke(Boolean.TRUE);
            }

            @Override // X.InterfaceC352560Dry
            public final void LIZ(String str3, String str4, String str5) {
                C2473009ma c2473009ma = C2473009ma.LIZ;
                C0VSJ c0vsj = new C0VSJ(str4);
                c2473009ma.getClass();
                C2473009ma.LJIIIIZZ(c0vsj);
                function12.invoke(Boolean.FALSE);
            }
        };
        c539510LDx.getClass();
        C539510LDx.LIZIZ(context, str, strLIZIZ, 1920, 1920, str2, null, null, null, interfaceC352560Dry, null);
    }
}
