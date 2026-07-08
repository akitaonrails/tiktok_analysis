package X;

import Y.AfS172S0100000_3;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275808vs extends AbstractC2289508y5 {
    public final C1921207fm LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public final C01GW LJJIIJ;
    public final String LJJIIJZLJL;
    public final C11NJ LJJIIZ;

    @Override // X.AbstractC2289508y5
    public final String LJIIJJI() {
        return "origin_image";
    }

    @Override // X.AbstractC2289508y5
    public final String LJIL() {
        return "OriginImageUploadFrameTask";
    }

    @Override // X.AbstractC2289508y5
    public final long LJJ() {
        return 300000L;
    }

    @Override // X.AbstractC2289508y5
    public final int LJIIIZ() {
        return this.LJJI.LIZ.size();
    }

    @Override // X.AbstractC2289508y5
    public final void LJIJJLI() {
        if (this.LJJI.LIZ.isEmpty()) {
            LIZJ("", "param.imageList.isEmpty");
            return;
        }
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start origin_image upload count=");
        sbLIZ.append(this.LJJI.LIZ.size());
        sbLIZ.append(" compressLongSide=");
        sbLIZ.append(this.LJJI.LIZIZ);
        C201955140j.LIZLLL(c201962140q, "AIMusic", C2188811AlT.LIZIZ(sbLIZ));
        super.LJIJJLI();
    }

    public final String LJJI() {
        return (String) this.LJJIIJ.getValue();
    }

    @Override // X.AbstractC2289508y5
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJJIIZ.dispose();
        C2286708xd.LJIILLIIL(new C0VSJ(LJJI()));
    }

    @Override // X.AbstractC2289508y5
    public final String LJFF() {
        return this.LJJII;
    }

    @Override // X.AbstractC2289508y5
    public final String LJI() {
        return this.LJJIFFI;
    }

    @Override // X.AbstractC2289508y5
    public final String LJII() {
        return this.LJJIII;
    }

    @Override // X.AbstractC2289508y5
    public final Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        ArrayList arrayList;
        boolean z;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1921207fm c1921207fm = this.LJJI;
        int i = c1921207fm.LIZIZ;
        BitmapFactory.Options options = null;
        int i2 = 0;
        if (i > 0) {
            List<String> list = c1921207fm.LIZ;
            arrayList = new ArrayList();
            boolean zLIZ = C2276008vu.LIZ();
            if (zLIZ) {
                str = ".webp";
            } else {
                str = ".jpg";
            }
            for (String str2 : list) {
                int i3 = i2 + 1;
                if (C2286708xd.LIZJ(str2)) {
                    try {
                        Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str2, options);
                        if (bitmapLIZLLL != null) {
                            Pair pairLIZ = C2275108vl.LIZ(i, bitmapLIZLLL);
                            Bitmap bitmapLIZIZ = C476901tP.LIZIZ(bitmapLIZLLL, ((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue());
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(this.LJJIIJZLJL);
                            sbLIZ.append('_');
                            sbLIZ.append(i2);
                            sbLIZ.append(str);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            boolean zLIZJ = C476901tP.LIZJ(bitmapLIZIZ, LJJI(), strLIZIZ, zLIZ);
                            if (!bitmapLIZIZ.isRecycled()) {
                                bitmapLIZIZ.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZIZ);
                            }
                            if (zLIZJ) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(LJJI());
                                sbLIZ2.append(File.separator);
                                sbLIZ2.append(strLIZIZ);
                                arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("saveBitmapToSD returned false src=");
                                sbLIZ3.append(str2);
                                LJIILL(-2, C2188811AlT.LIZIZ(sbLIZ3), "");
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        String message = e.getMessage();
                        if (message == null) {
                            message = "resizeImages exception";
                        }
                        LJIILL(-2, message, "");
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("OriginImageUploadFrameTask resizeImages fail err: ");
                        sbLIZ4.append(e);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                i2 = i3;
                options = null;
            }
        } else {
            List<String> list2 = c1921207fm.LIZ;
            arrayList = new ArrayList();
            int i4 = 0;
            for (String str3 : list2) {
                int i5 = i4 + 1;
                if (C2286708xd.LIZJ(str3)) {
                    try {
                        String strLJIJ = C08QA.LJIJ(new C0VSJ(str3));
                        if (strLJIJ.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            strLJIJ = "jpg";
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(LJJI());
                        sbLIZ5.append(File.separator);
                        sbLIZ5.append(this.LJJIIJZLJL);
                        sbLIZ5.append('_');
                        sbLIZ5.append(i4);
                        sbLIZ5.append('.');
                        sbLIZ5.append(strLJIJ);
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ5));
                        if (C2286708xd.LJFF(str3, c0vsj.getAbsolutePath())) {
                            arrayList.add(c0vsj.getAbsolutePath());
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("copyFile returned false src=");
                            sbLIZ6.append(str3);
                            LJIILL(-2, C2188811AlT.LIZIZ(sbLIZ6), "");
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        String message2 = e2.getMessage();
                        if (message2 == null) {
                            message2 = "copyOriginals exception";
                        }
                        LJIILL(-2, message2, "");
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("OriginImageUploadFrameTask copyOriginals fail err: ");
                        sbLIZ7.append(e2);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ7));
                    }
                }
                i4 = i5;
            }
        }
        LJIILIIL(System.currentTimeMillis() - jCurrentTimeMillis, -1L);
        if (arrayList.isEmpty()) {
            LJIILL(-2, "origin image result list empty", "");
            return null;
        }
        return LJIIZILJ(LJJI(), arrayList);
    }

    public C2275808vs(C1921207fm c1921207fm, String str, String str2, String str3) {
        super(c1921207fm);
        this.LJJI = c1921207fm;
        this.LJJIFFI = str;
        this.LJJII = str2;
        this.LJJIII = str3;
        this.LJJIIJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1617));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin_");
        sbLIZ.append(System.nanoTime());
        this.LJJIIJZLJL = C2188811AlT.LIZIZ(sbLIZ);
        C11NJ c11nj = new C11NJ();
        this.LJJIIZ = c11nj;
        c11nj.LIZ(LJIILJJIL().LJJLL(new AfS172S0100000_3(this, 90), C19487811Me.LIZLLL));
    }
}
