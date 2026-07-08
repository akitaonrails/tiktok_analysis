package X;

import Y.AkS468S0100000_3;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900090zXr {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(551));

    public final String LIZIZ(String str, String str2) {
        C1900100zXs c1900100zXs = (C1900100zXs) this.LIZ.getValue();
        if (c1900100zXs != null) {
            return c1900100zXs.LIZJ(str, str2);
        }
        return null;
    }

    public final C0VSP LIZJ(String str, String str2, String str3) {
        C1900100zXs c1900100zXs = (C1900100zXs) this.LIZ.getValue();
        if (c1900100zXs != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(".json");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1900100zXs.LIZJ(str, str2));
            sbLIZ2.append(File.separator);
            sbLIZ2.append(strLIZIZ);
            try {
                return new C0VSP(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public final void LIZ(final String str, final String str2, final String str3, InterfaceC1900110zXt interfaceC1900110zXt) {
        File[] fileArrListFiles;
        C1900100zXs c1900100zXs = (C1900100zXs) this.LIZ.getValue();
        c1900100zXs.getClass();
        C0VSJ c0vsj = new C0VSJ(c1900100zXs.LIZLLL(str, str3));
        C0VSJ c0vsj2 = new C0VSJ(c1900100zXs.LIZJ(str, str3));
        if (c0vsj.exists() && c0vsj2.exists() && c0vsj2.isDirectory() && (fileArrListFiles = c0vsj2.listFiles()) != null && fileArrListFiles.length != 0 && c0vsj.exists() && TextUtils.equals(C08HM.LIZIZ(c0vsj), str3)) {
            interfaceC1900110zXt.LIZIZ(2);
            return;
        }
        final C1900100zXs c1900100zXs2 = (C1900100zXs) this.LIZ.getValue();
        if (c1900100zXs2 == null) {
            return;
        }
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zXp
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C1C7U.LIZ("LottieFileManager@13c.downloadFile$1");
                C801320Vc2.LIZ(c1900100zXs2.LIZ(str));
                String strLIZJ = c1900100zXs2.LIZJ(str, str3);
                if (!TextUtils.isEmpty(strLIZJ)) {
                    C0VSJ c0vsj3 = new C0VSJ(strLIZJ);
                    if (!c0vsj3.exists()) {
                        c0vsj3.mkdirs();
                    }
                }
                final C1900100zXs c1900100zXs3 = c1900100zXs2;
                final String str4 = str;
                final String str5 = str3;
                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                C1B8G c1b8g = new C1B8G() { // from class: X.0zXq
                    @Override // X.C1B8G
                    public final void LIZ() {
                    }

                    @Override // X.C1B8G
                    public final void LIZIZ() {
                    }

                    @Override // X.C1B8G
                    public final void LJ(C1897470zTd c1897470zTd) {
                    }

                    @Override // X.C1B8G
                    public final void onCanceled() {
                    }

                    @Override // X.C1B8G
                    public final void LIZJ(C1897470zTd c1897470zTd) {
                        Throwable th;
                        Throwable th2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("download fail, ");
                        if (c1897470zTd != null) {
                            th = c1897470zTd.LIZJ;
                        } else {
                            th = null;
                        }
                        sbLIZ.append(th);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C09AJ<String> c09aj2 = c19482611Ke;
                        if (c1897470zTd == null || (th2 = c1897470zTd.LIZJ) == null) {
                            th2 = new Throwable("download failed");
                        }
                        c09aj2.onError(th2);
                    }

                    @Override // X.C1B8G
                    public final void LIZLLL(C1897470zTd c1897470zTd) {
                        String strLIZLLL = c1900100zXs3.LIZLLL(str4, str5);
                        C0VSJ c0vsj4 = new C0VSJ(strLIZLLL);
                        C1900100zXs c1900100zXs4 = c1900100zXs3;
                        String str6 = str5;
                        c1900100zXs4.getClass();
                        if (c0vsj4.exists() && TextUtils.equals(C08HM.LIZIZ(c0vsj4), str6)) {
                            c19482611Ke.onNext(strLIZLLL);
                            return;
                        }
                        C09AJ<String> c09aj2 = c19482611Ke;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FIle in  ");
                        c1900100zXs3.getClass();
                        sbLIZ.append(0);
                        sbLIZ.append(" doesnot match md5");
                        c09aj2.onError(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                    }
                };
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    String str6 = str2;
                    String strLIZ = c1900100zXs2.LIZ(str);
                    C1900100zXs c1900100zXs4 = c1900100zXs2;
                    String str7 = str3;
                    c1900100zXs4.getClass();
                    interfaceC1897260zTILIZIZ.LJIIIIZZ(0, c1b8g, str6, strLIZ, C1900100zXs.LIZIZ(str7, true), "legacy_lottie_file", false);
                }
                C1C7U.LIZIZ("LottieFileManager@13c.downloadFile$1");
            }
        }).LJJJ(new AkS468S0100000_3(c1900100zXs2, 12), false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(interfaceC1900110zXt, 5));
    }
}
