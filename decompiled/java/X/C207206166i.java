package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import org.json.JSONException;

/* JADX INFO: renamed from: X.166i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207206166i {
    public static final C207206166i LIZ = new C207206166i();

    public static final C0VSJ LIZIZ(C207207166j c207207166j) {
        try {
            return LIZLLL(c207207166j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final C19476611Hw LIZJ(C207207166j c207207166j) {
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config = ");
        sbLIZ.append(c207207166j);
        C0UND.LIZ("BitmapFileUtil#saveBitmapToFileAsyncV2", C2188811AlT.LIZIZ(sbLIZ));
        return C11NZ.LJIJJLI(new C786340Usy(c207207166j, 0)).LJL(C11S5.LIZ());
    }

    public static C0VSJ LIZLLL(C207207166j c207207166j) throws JSONException {
        String strLIZJ;
        String fullPath;
        if (c207207166j.LJIIIZ == null) {
            return null;
        }
        try {
            EnumC771350UNp enumC771350UNp = c207207166j.LIZIZ;
            EnumC771350UNp enumC771350UNp2 = EnumC771350UNp.DCIM_DIR;
            if (enumC771350UNp != enumC771350UNp2 && (fullPath = enumC771350UNp.getFullPath()) != null) {
                C2355009Kq.LIZJ(new C0VSJ(fullPath));
            }
            if (enumC771350UNp2 != c207207166j.LIZIZ && (strLIZJ = C771370UNr.LIZJ(c207207166j)) != null) {
                C2355009Kq.LIZJ(new C0VSJ(strLIZJ));
            }
            C0VSJ c0vsj = new C0VSJ(C771370UNr.LIZLLL(c207207166j));
            c0vsj.createNewFile();
            C0VSV c0vsv = new C0VSV(c0vsj);
            C0UNC.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveBitmapToFileAsyncV2 config = ");
            sbLIZ.append(c207207166j);
            C0UND.LIZ("BitmapFileUtil#saveFileInternal", C2188811AlT.LIZIZ(sbLIZ));
            try {
                try {
                    Bitmap bitmap = c207207166j.LJIIIZ;
                    if (bitmap != null) {
                        bitmap.compress(c207207166j.LJIIJJI, c207207166j.LJIIL, c0vsv);
                    }
                    c0vsv.flush();
                    c0vsv.close();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c0vsv.flush();
                c0vsv.close();
                if (c207207166j.LJIIJ) {
                    Bitmap bitmap2 = c207207166j.LJIIIZ;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
                    }
                    c207207166j.LJIIIZ = null;
                }
                C207211166n c207211166nLIZ = C207208166k.LIZ(c207207166j);
                if (c207211166nLIZ != null) {
                    c207211166nLIZ.LIZIZ.put("file_status", 0);
                    C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ.LIZIZ, c207211166nLIZ.LIZJ, c207211166nLIZ.LIZLLL);
                }
                return c0vsj;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsv.flush();
                c0vsv.close();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            String localizedMessage = th2.getLocalizedMessage();
            C207211166n c207211166nLIZ2 = C207208166k.LIZ(c207207166j);
            if (c207211166nLIZ2 != null) {
                c207211166nLIZ2.LIZIZ.put("file_status", 1);
            } else {
                c207211166nLIZ2 = null;
            }
            if (localizedMessage != null) {
                if (c207211166nLIZ2 != null) {
                    c207211166nLIZ2.LIZIZ.put("error_code", 0);
                    c207211166nLIZ2.LIZLLL.put("error_msg", localizedMessage);
                    C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ2.LIZIZ, c207211166nLIZ2.LIZJ, c207211166nLIZ2.LIZLLL);
                }
            } else if (c207211166nLIZ2 != null) {
                C1CC2.LJ("ttlive_file_monitor", c207211166nLIZ2.LIZIZ, c207211166nLIZ2.LIZJ, c207211166nLIZ2.LIZLLL);
            }
            return null;
        }
    }

    public static final Object LIZ(Uri uri, C1329360khK c1329360khK, C2328909Ap c2328909Ap) {
        boolean z;
        if (uri.toString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        if (c1329360khK != null) {
            c1325700kbQLIZLLL.LJFF = c1329360khK;
        }
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), null);
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c2328909Ap));
        ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0Hg5
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn = c23260099m;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn.resumeWith(null);
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                if (bitmap != null) {
                    InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(bitmap);
                    interfaceC1364105Vn.resumeWith(bitmap);
                } else {
                    InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                }
            }
        }, C822690WPb.LIZ());
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c2328909Ap);
        }
        return objLIZ;
    }
}
