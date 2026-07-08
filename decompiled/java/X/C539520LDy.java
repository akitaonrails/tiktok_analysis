package X;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.0LDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539520LDy {
    public static final C539520LDy LIZ = new C539520LDy();
    public static final HandlerThread LIZIZ;

    static {
        HandlerThread handlerThread = new HandlerThread("ve-async-utils");
        handlerThread.start();
        LIZIZ = handlerThread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void LIZ(Context context, final String str, final String str2, String str3, float f, VESize vESize, final InterfaceC352610Ds3 interfaceC352610Ds3) throws Throwable {
        int i;
        int i2;
        boolean z;
        int i3;
        C1780100wQK c1780100wQK;
        ?? r1;
        int i4;
        int i5;
        final VEEditor vEEditor = new VEEditor(str3);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        C539280LDa c539280LDaLIZ = mediaUtil.LIZ(context, str);
        if (c539280LDaLIZ.LIZLLL % 180 != 0) {
            i = c539280LDaLIZ.LIZJ;
            i2 = c539280LDaLIZ.LIZIZ;
        } else {
            i = c539280LDaLIZ.LIZIZ;
            i2 = c539280LDaLIZ.LIZJ;
        }
        if (vESize != null && (i4 = vESize.height) != 0 && (i5 = vESize.width) != 0) {
            float f2 = i;
            float f3 = i5 / f2;
            float f4 = i2;
            float f5 = i4 / f4;
            if (f3 > f5) {
                f3 = f5;
            }
            i = (int) (f2 * f3);
            i2 = (int) (f4 * f3);
        }
        int iLJJIFFI = vEEditor.LJJIFFI(new String[]{str}, new int[]{0}, new int[]{-1}, null, null, null, null, null, null, null, EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL);
        if (iLJJIFFI != 0) {
            vEEditor.LJIILIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init ve fail code is ");
            sbLIZ.append(iLJJIFFI);
            interfaceC352610Ds3.onError(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        final C352620Ds4 c352620Ds4 = new C352620Ds4(str, str2, interfaceC352610Ds3, vEEditor);
        interfaceC352610Ds3.LIZIZ(c352620Ds4);
        VEConfig vEConfig = C1779660wPc.LIZ;
        int i6 = mediaUtil.LIZ(context, str).LJFF;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = i6 * 1024;
        } else {
            i3 = (int) (i6 * f * 1024);
        }
        if (vEConfig.hardware) {
            c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LIZIZ.isSupportHWEncoder = true;
            c1780100wQK.LJII(vEConfig.fps);
            int i7 = vEConfig.gopSize;
            c1780100wQK.LIZIZ.gopSize = i7;
            c1780100wQK.LJ(i3);
            c1780100wQK.LJFF(C1779660wPc.LIZ());
            r1 = i7;
            r1 = i7;
            if (i != 0 && i2 != 0) {
                c1780100wQK.LJIIJ(i, i2);
                r1 = i7;
            }
        } else {
            c1780100wQK = new C1780100wQK(2);
            c1780100wQK.LIZIZ.isSupportHWEncoder = false;
            c1780100wQK.LJII(vEConfig.fps);
            int i8 = vEConfig.gopSize;
            c1780100wQK.LIZIZ.gopSize = i8;
            c1780100wQK.LJIIIIZZ(15);
            c1780100wQK.LIZIZ.enableRemuxVideo = false;
            c1780100wQK.LJFF(C1779660wPc.LIZ());
            r1 = i8;
            r1 = i8;
            if (i != 0 && i2 != 0) {
                c1780100wQK.LJIIJ(i, i2);
                r1 = i8;
            }
        }
        vEEditor.LJJIZ(C786410Ut5.W2(LIZIZ));
        synchronized (vEEditor) {
            try {
                try {
                    if (!c352620Ds4.LIZJ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append(".tmp");
                        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        boolean zLJIIJ = vEEditor.LJIIJ(strLIZIZ, null, c1780100wQK.LIZ(), new InterfaceC574560MgA(strLIZIZ, str, str2, vEEditor, c352620Ds4) { // from class: X.0Ds2
                            public final /* synthetic */ String LIZIZ;
                            public final /* synthetic */ String LIZJ;
                            public final /* synthetic */ VEEditor LIZLLL;
                            public final /* synthetic */ C352620Ds4 LJ;

                            @Override // X.InterfaceC574560MgA
                            public final void onCompileDone() {
                                if (this.LJ.LIZJ) {
                                    C2473009ma c2473009ma = C2473009ma.LIZ;
                                    C0VSJ c0vsj = new C0VSJ(this.LIZIZ);
                                    c2473009ma.getClass();
                                    C2473009ma.LJIIIIZZ(c0vsj);
                                } else {
                                    new C0VSJ(this.LIZIZ).renameTo(new C0VSJ(this.LIZJ));
                                    InterfaceC352610Ds3 interfaceC352610Ds32 = this.LIZ;
                                    if (interfaceC352610Ds32 != null) {
                                        interfaceC352610Ds32.onSuccess(this.LIZJ);
                                    }
                                    this.LIZLLL.LJJIZ(null);
                                }
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352590Ds1(this.LIZLLL, null), 2);
                            }

                            @Override // X.InterfaceC574560MgA
                            public final void onCompileProgress(float f6) {
                                InterfaceC352610Ds3 interfaceC352610Ds32 = this.LIZ;
                                if (interfaceC352610Ds32 != null) {
                                    interfaceC352610Ds32.LIZ();
                                }
                            }

                            @Override // X.InterfaceC574560MgA
                            public final void onCompileError(int i9, int i10, float f6, String str4) {
                                C2473009ma c2473009ma = C2473009ma.LIZ;
                                C0VSJ c0vsj = new C0VSJ(this.LIZIZ);
                                c2473009ma.getClass();
                                C2473009ma.LJIIIIZZ(c0vsj);
                                InterfaceC352610Ds3 interfaceC352610Ds32 = this.LIZ;
                                if (interfaceC352610Ds32 != null) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(i9);
                                    sbLIZ3.append('_');
                                    sbLIZ3.append(i10);
                                    interfaceC352610Ds32.onError(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                this.LIZLLL.LJJIZ(null);
                                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C352580Ds0(this.LIZLLL, null), 2);
                            }

                            {
                                this.LIZJ = str2;
                                this.LIZLLL = vEEditor;
                                this.LJ = c352620Ds4;
                            }
                        });
                        if (!zLJIIJ) {
                            interfaceC352610Ds3.onError("-1");
                            vEEditor.LJJIZ(null);
                            vEEditor.LJIILIIL();
                            return;
                        }
                        return;
                    }
                    vEEditor.LJIILIIL();
                } catch (Throwable th) {
                    th = th;
                    r1 = vEEditor;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
