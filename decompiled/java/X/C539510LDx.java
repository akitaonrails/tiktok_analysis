package X;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539510LDx {
    public static final C539510LDx LIZ = new C539510LDx();
    public static VEEditor LIZIZ;
    public static final HandlerThread LIZJ;

    static {
        HandlerThread handlerThread = new HandlerThread("ve-async-utils");
        handlerThread.start();
        LIZJ = handlerThread;
    }

    public static void LIZ(Context context, String str, int i, int i2, InterfaceC352560Dry interfaceC352560Dry, String str2, C2473609mg c2473609mg) {
        String str3;
        if (interfaceC352560Dry != null) {
            interfaceC352560Dry.LIZJ(new C352570Drz(str, str2, interfaceC352560Dry, null));
            interfaceC352560Dry.onProgress(C19994513Lb.LIZIZ(System.currentTimeMillis()).nextInt(90) / 100.0f);
        }
        try {
            Pair pairLIZ = C2473209mc.LIZ(context, str, str2, Math.max(i, i2), c2473609mg);
            if (interfaceC352560Dry != null) {
                if (((Number) pairLIZ.getFirst()).intValue() > 0 && ((Number) pairLIZ.getSecond()).intValue() > 0) {
                    str3 = str2;
                } else {
                    str3 = str;
                }
                interfaceC352560Dry.LJJI(str, str3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (interfaceC352560Dry != null) {
                interfaceC352560Dry.LIZ(str, str2, String.valueOf(th.getMessage()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    public static VEEditor LIZLLL(Context context, final String str, int i, int i2, final InterfaceC352560Dry interfaceC352560Dry, final String str2, String str3, Integer num, int[] iArr, int[] iArr2) throws Throwable {
        int i3;
        int i4;
        int iIntValue;
        C1780100wQK c1780100wQK;
        ?? r2;
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        final VEEditor vEEditor = new VEEditor(str3);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        C539280LDa c539280LDaLIZ = mediaUtil.LIZ(context, str);
        if (c539280LDaLIZ.LIZLLL % 180 != 0) {
            i3 = c539280LDaLIZ.LIZJ;
            i4 = c539280LDaLIZ.LIZIZ;
        } else {
            i3 = c539280LDaLIZ.LIZIZ;
            i4 = c539280LDaLIZ.LIZJ;
        }
        float f = i3;
        float f2 = i / f;
        float f3 = i4;
        float f4 = i2 / f3;
        if (f2 > f4) {
            f2 = f4;
        }
        int i5 = (int) (f * f2);
        int i6 = (int) (f3 * f2);
        String[] strArr = {str};
        if (iArr4 == null) {
            iArr4 = new int[]{0};
        }
        if (iArr3 == null) {
            iArr3 = new int[]{-1};
        }
        int iLJJIFFI = vEEditor.LJJIFFI(strArr, iArr4, iArr3, null, null, null, null, null, null, null, EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL);
        if (iLJJIFFI != 0) {
            vEEditor.LJIILIIL();
            if (interfaceC352560Dry != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("init ve fail code is ");
                sbLIZ.append(iLJJIFFI);
                interfaceC352560Dry.LIZ(str, "", C2188811AlT.LIZIZ(sbLIZ));
            }
            return vEEditor;
        }
        final C352570Drz c352570Drz = new C352570Drz(str, str2, interfaceC352560Dry, vEEditor);
        if (interfaceC352560Dry != null) {
            interfaceC352560Dry.LIZJ(c352570Drz);
        }
        VEConfig vEConfig = C1779660wPc.LIZ;
        int i7 = mediaUtil.LIZ(context, str).LJFF;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = vEConfig.bpsGenerator.invoke(1).intValue();
        }
        if (i7 <= iIntValue) {
            i7 = iIntValue;
        }
        if (vEConfig.hardware) {
            c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LIZIZ.isSupportHWEncoder = true;
            c1780100wQK.LJII(vEConfig.fps);
            int i8 = vEConfig.gopSize;
            c1780100wQK.LIZIZ.gopSize = i8;
            c1780100wQK.LJ(i7);
            c1780100wQK.LJFF(C1779660wPc.LIZ());
            r2 = i8;
            r2 = i8;
            if (i5 != 0 && i6 != 0) {
                c1780100wQK.LJIIJ(i5, i6);
                r2 = i8;
            }
        } else {
            c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LIZIZ.isSupportHWEncoder = false;
            c1780100wQK.LJII(vEConfig.fps);
            c1780100wQK.LIZIZ.gopSize = vEConfig.gopSize;
            c1780100wQK.LJIIIIZZ(15);
            VEVideoEncodeSettings vEVideoEncodeSettings = c1780100wQK.LIZIZ;
            vEVideoEncodeSettings.enableRemuxVideo = false;
            c1780100wQK.LJFF(C1779660wPc.LIZ());
            r2 = vEVideoEncodeSettings;
            r2 = vEVideoEncodeSettings;
            if (i5 != 0 && i6 != 0) {
                c1780100wQK.LJIIJ(i5, i6);
                r2 = vEVideoEncodeSettings;
            }
        }
        vEEditor.LJJIZ(C786410Ut5.W2(LIZJ));
        synchronized (vEEditor) {
            try {
                try {
                    if (!c352570Drz.LJ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append(".tmp");
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        boolean zLJIIJ = vEEditor.LJIIJ(strLIZIZ, null, c1780100wQK.LIZ(), new InterfaceC574560MgA() { // from class: X.0Drx
                            @Override // X.InterfaceC574560MgA
                            public final void onCompileDone() {
                                if (c352570Drz.LJ) {
                                    C2473009ma c2473009ma = C2473009ma.LIZ;
                                    C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                                    c2473009ma.getClass();
                                    C2473009ma.LJIIIIZZ(c0vsj);
                                } else {
                                    new C0VSJ(strLIZIZ).renameTo(new C0VSJ(str2));
                                    InterfaceC352560Dry interfaceC352560Dry2 = interfaceC352560Dry;
                                    if (interfaceC352560Dry2 != null) {
                                        interfaceC352560Dry2.LJJI(str, str2);
                                    }
                                    vEEditor.LJJIZ(null);
                                }
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352540Drw(vEEditor, null), 2);
                            }

                            @Override // X.InterfaceC574560MgA
                            public final void onCompileProgress(float f5) {
                                InterfaceC352560Dry interfaceC352560Dry2 = interfaceC352560Dry;
                                if (interfaceC352560Dry2 != null) {
                                    interfaceC352560Dry2.onProgress(f5);
                                }
                            }

                            @Override // X.InterfaceC574560MgA
                            public final void onCompileError(int i9, int i10, float f5, String str4) {
                                C2473009ma c2473009ma = C2473009ma.LIZ;
                                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                                c2473009ma.getClass();
                                C2473009ma.LJIIIIZZ(c0vsj);
                                InterfaceC352560Dry interfaceC352560Dry2 = interfaceC352560Dry;
                                if (interfaceC352560Dry2 != null) {
                                    String str5 = str;
                                    String str6 = str2;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(i9);
                                    sbLIZ3.append('_');
                                    sbLIZ3.append(i10);
                                    interfaceC352560Dry2.LIZ(str5, str6, C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                vEEditor.LJJIZ(null);
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352530Drv(vEEditor, null), 2);
                            }
                        });
                        if (!zLJIIJ) {
                            if (interfaceC352560Dry != null) {
                                interfaceC352560Dry.LIZ(str, str2, "-1");
                            }
                            vEEditor.LJJIZ(null);
                            vEEditor.LJIILIIL();
                        }
                        return vEEditor;
                    }
                    vEEditor.LJIILIIL();
                    return vEEditor;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = vEEditor;
            }
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static void LIZIZ(Context context, String str, String str2, int i, int i2, String str3, Integer num, int[] iArr, int[] iArr2, InterfaceC352560Dry interfaceC352560Dry, C2473609mg c2473609mg) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352520Dru(context, str, i, i2, interfaceC352560Dry, str2, c2473609mg, str3, num, iArr, iArr2, null), 2);
    }
}
