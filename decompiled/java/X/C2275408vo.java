package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.08vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275408vo extends AbstractC2289508y5 {
    public final C2275508vp LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public final C01GW LJJIIJ;

    @Override // X.AbstractC2289508y5
    public final String LJIIJJI() {
        return "photo_mode";
    }

    @Override // X.AbstractC2289508y5
    public final String LJIL() {
        return "PhotoModeUploadFrameTask";
    }

    @Override // X.AbstractC2289508y5
    public final void LJIJJLI() {
        if (this.LJJI.LIZ.isEmpty()) {
            LIZJ("", "imageList.isEmpty");
        } else {
            C201955140j.LIZLLL(C201962140q.LIZIZ, "AIMusic", "start photo_mode upload");
            super.LJIJJLI();
        }
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
        String str;
        float fIntValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList(this.LJJI.LIZ);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (String str2 : arrayList) {
            int i2 = i + 1;
            if (C2286708xd.LIZJ(str2)) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                try {
                    if (!C2276008vu.LIZ() && !this.LJJI.LIZJ) {
                        str = ".jpg";
                    } else {
                        str = ".webp";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) this.LJJIIJ.getValue());
                    sbLIZ.append(File.separator);
                    sbLIZ.append(C08QA.LJIJI(new C0VSJ(str2)));
                    sbLIZ.append(str);
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                    if (C2286708xd.LIZJ(c0vsj.getAbsolutePath())) {
                        C0VSJ c0vsjLIZLLL = AbstractC2289508y5.LIZLLL(i, LJ());
                        arrayList2.add(c0vsjLIZLLL.getAbsolutePath());
                        C2286708xd.LJFF(c0vsj.getAbsolutePath(), c0vsjLIZLLL.getAbsolutePath());
                        C201962140q c201962140q = C201962140q.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("resizePicturesForAI copy index start:");
                        sbLIZ2.append(jCurrentTimeMillis2);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                        sbLIZ2.append("\n ");
                        sbLIZ2.append(c0vsjLIZLLL.getAbsolutePath());
                        sbLIZ2.append(" \n");
                        sbLIZ2.append(c0vsj.getAbsolutePath());
                        C201955140j.LIZLLL(c201962140q, "MAL_FF", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str2, null);
                        int i3 = this.LIZIZ;
                        float fIntValue2 = i3;
                        if (bitmapLIZLLL != null) {
                            try {
                                Pair pairLIZ = C2275108vl.LIZ(i3, bitmapLIZLLL);
                                if (((Boolean) C424401kw.LIZ.getValue()).booleanValue()) {
                                    fIntValue2 = ((Number) pairLIZ.getFirst()).intValue();
                                    fIntValue = ((Number) pairLIZ.getSecond()).intValue();
                                } else {
                                    fIntValue = fIntValue2;
                                }
                                C0VSJ c0vsjLJIJI = LJIJI(C476901tP.LIZIZ(bitmapLIZLLL, fIntValue2, fIntValue), i, str2);
                                arrayList2.add(c0vsjLJIJI.getAbsolutePath());
                                C2286708xd.LJFF(c0vsjLJIJI.getAbsolutePath(), c0vsj.getAbsolutePath());
                                C201962140q c201962140q2 = C201962140q.LIZIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("resizePicturesForAI resize index start:");
                                sbLIZ3.append(jCurrentTimeMillis2);
                                sbLIZ3.append(' ');
                                sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                sbLIZ3.append("\n ");
                                sbLIZ3.append(c0vsjLJIJI.getAbsolutePath());
                                sbLIZ3.append(" \n");
                                sbLIZ3.append(c0vsj.getAbsolutePath());
                                C201955140j.LIZLLL(c201962140q2, "MAL_FF", C2188811AlT.LIZIZ(sbLIZ3));
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "resizePicturesForAI exception";
                                }
                                LJIILL(-2, message, "");
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("resizePicturesForAI fail err: ");
                                sbLIZ4.append(e);
                                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            i = i2;
        }
        LJIILIIL(System.currentTimeMillis() - jCurrentTimeMillis, -1L);
        return LJIIZILJ(LJ(), arrayList2);
    }

    public C2275408vo(C2275508vp c2275508vp, String str, String str2, String str3) {
        super(c2275508vp);
        this.LJJI = c2275508vp;
        this.LJJIFFI = str;
        this.LJJII = str2;
        this.LJJIII = str3;
        this.LJJIIJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 163));
    }
}
