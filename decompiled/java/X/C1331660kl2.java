package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.File;

/* JADX INFO: renamed from: X.0kl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331660kl2 {
    public static final InterfaceC1331720kl8 LIZ;
    public static volatile C1332160klq LIZIZ;
    public static volatile InterfaceC1329940kiG LIZJ;
    public static volatile boolean LIZLLL;
    public static String LJ;
    public static final int LJFF;

    static {
        InterfaceC1331720kl8 interfaceC1331720kl8;
        boolean z = false;
        try {
            interfaceC1331720kl8 = (InterfaceC1331720kl8) Class.forName("com.bytedance.lighten.loader.FrescoImageLoaderDelegate").asSubclass(InterfaceC1331720kl8.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (interfaceC1331720kl8 == null) {
            try {
                interfaceC1331720kl8 = (InterfaceC1331720kl8) Class.forName("com.bytedance.lighten.loader.GlideImageLoaderDelegate").asSubclass(InterfaceC1331720kl8.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (interfaceC1331720kl8 == null) {
                try {
                    interfaceC1331720kl8 = (InterfaceC1331720kl8) Class.forName("com.bytedance.lighten.loader.PicassoImageLoaderDelegate").asSubclass(InterfaceC1331720kl8.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                if (interfaceC1331720kl8 == null) {
                    interfaceC1331720kl8 = new InterfaceC1331720kl8() { // from class: X.0klI
                        @Override // X.InterfaceC1330030kiP
                        public final void display(C1331510kkn c1331510kkn) {
                        }

                        @Override // X.InterfaceC1330030kiP
                        public final void download(C1331510kkn c1331510kkn) {
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final InterfaceC1325460kb2 getCache() {
                            return null;
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final void init(InterfaceC1329940kiG interfaceC1329940kiG) {
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final void init(C1332160klq c1332160klq) {
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final C1331670kl3 load(int i) {
                            return null;
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final C1331670kl3 load(C03IT c03it) {
                            return null;
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final C1331670kl3 load(Uri uri) {
                            return null;
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final C1331670kl3 load(File file) {
                            return null;
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final C1331670kl3 load(Object obj) {
                            return null;
                        }

                        @Override // X.InterfaceC1331720kl8
                        public final C1331670kl3 load(String str) {
                            return null;
                        }

                        @Override // X.InterfaceC1330030kiP
                        public final void loadBitmap(C1331510kkn c1331510kkn) {
                        }

                        @Override // X.InterfaceC1330030kiP
                        public final void trimDisk(int i) {
                        }

                        @Override // X.InterfaceC1330030kiP
                        public final void trimMemory(int i) {
                        }
                    };
                }
            }
        }
        LIZ = interfaceC1331720kl8;
        LIZIZ = (C1332160klq) C1334400kpS.LJJIJL.getValue();
        C01GW c01gw = C1334400kpS.LJJIL;
        if (c01gw.getValue() != null && ((Boolean) c01gw.getValue()).booleanValue()) {
            z = true;
        }
        LIZLLL = z;
        LJ = (String) C1334400kpS.LJJIJLIJ.getValue();
        LJFF = -1;
    }

    public static InterfaceC1325460kb2 LIZJ() {
        return !LIZLLL ? new InterfaceC1325460kb2() { // from class: X.0HXk
            @Override // X.InterfaceC1325460kb2
            public final void LIZ() {
            }

            @Override // X.InterfaceC1325460kb2
            public final Bitmap LIZIZ(C03IT c03it) {
                return null;
            }

            @Override // X.InterfaceC1325460kb2
            public final void LIZJ(Uri uri, C0H9P c0h9p) {
            }

            @Override // X.InterfaceC1325460kb2
            public final File LIZLLL(Uri uri) {
                return null;
            }

            @Override // X.InterfaceC1325460kb2
            public final Bitmap LJ(Uri uri) {
                return null;
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJFF(Uri uri) {
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJI(Bitmap bitmap, Uri uri) {
            }

            @Override // X.InterfaceC1325460kb2
            public final C1325430kaz LJII(String str) {
                return null;
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJIIIIZZ(Uri uri, InterfaceC442640HXi<File> interfaceC442640HXi) {
            }

            @Override // X.InterfaceC1325460kb2
            public final boolean LJIIIZ(Uri uri) {
                return false;
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJIIJ(C03IT c03it, C0H9O c0h9o) {
            }

            @Override // X.InterfaceC1325460kb2
            public final Bitmap LJIIJJI(ImageUrlModel imageUrlModel) {
                return null;
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJIIL(Uri uri, InterfaceC442640HXi<Boolean> interfaceC442640HXi) {
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC1325460kb2
            public final void LJIILJJIL(String str) {
            }
        } : LIZ.getCache();
    }

    public static C1332160klq LIZLLL() {
        if (LIZIZ == null) {
            if (LIZJ == null) {
                throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
            }
            LIZIZ = LIZJ.LIZJ();
        }
        return LIZIZ;
    }

    public static void LIZ(C1331510kkn c1331510kkn) {
        if (!LIZLLL) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJ("display, lighten is not initialized, call Lighten.init");
            return;
        }
        if (c1331510kkn == null) {
            int i2 = C2187451AjH.LIZ;
            C1330590kjJ.LJ("display failed, LightenImageRequest is null");
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request =>");
        sbLIZ.append(c1331510kkn);
        C1330590kjJ.LIZ(c1331510kkn.hashCode(), "Lighten", "display", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1331950klV interfaceC1331950klV = (InterfaceC1331950klV) LIZLLL().LIZIZ.LJJJJLI.LIZ();
        if (interfaceC1331950klV == null || !interfaceC1331950klV.display(c1331510kkn)) {
            LIZ.display(c1331510kkn);
        }
    }

    public static void LIZIZ(C1331510kkn c1331510kkn) {
        boolean zLJI = MethodIDManager.LJI(137337);
        if (!LIZLLL) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (c1331510kkn == null) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("Lighten", "download", "request is null");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        c1331510kkn.LJJJJJL = true;
        if (LIZLLL().LJIILIIL()) {
            c1331510kkn.LJJLIIIIJ = true;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request =>");
        sbLIZ.append(c1331510kkn);
        C1330590kjJ.LIZ(c1331510kkn.hashCode(), "Lighten", "download", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1331950klV interfaceC1331950klV = (InterfaceC1331950klV) LIZLLL().LIZIZ.LJJJJLI.LIZ();
        if (interfaceC1331950klV == null || !interfaceC1331950klV.download(c1331510kkn)) {
            LIZ.download(c1331510kkn);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJ(C1332160klq c1332160klq) {
        if (LIZLLL) {
            return;
        }
        LIZIZ = c1332160klq;
        LJ = c1332160klq.LJFF().getPackageName();
        LIZ.init(c1332160klq);
        LIZLLL = true;
    }

    public static C1331670kl3 LJFF(int i) {
        C1331670kl3 c1331670kl3Load = LIZ.load(i);
        c1331670kl3Load.LJIILJJIL = LJFF;
        return c1331670kl3Load;
    }

    public static C1331670kl3 LJI(Uri uri) {
        C1331670kl3 c1331670kl3Load = LIZ.load(uri);
        c1331670kl3Load.LJIILJJIL = LJFF;
        return c1331670kl3Load;
    }

    public static C1331670kl3 LJII(File file) {
        if (!file.exists()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load, illegal file, not exist, ");
            sbLIZ.append(file);
            C1330590kjJ.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return C1331670kl3.LJIJI();
        }
        C1331670kl3 c1331670kl3Load = LIZ.load(file);
        c1331670kl3Load.LJIILJJIL = LJFF;
        return c1331670kl3Load;
    }

    public static C1331670kl3 LJIIIIZZ(Object obj) {
        C1331670kl3 c1331670kl3Load = LIZ.load(obj);
        c1331670kl3Load.LJIILJJIL = LJFF;
        return c1331670kl3Load;
    }

    public static C1331670kl3 LJIIIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJ("load, empty url");
            return C1331670kl3.LJIJI();
        }
        C1331670kl3 c1331670kl3Load = LIZ.load(str);
        c1331670kl3Load.LJIILJJIL = LJFF;
        return c1331670kl3Load;
    }

    public static C1331670kl3 LJIIJ(C03IT c03it) {
        C1331670kl3 c1331670kl3Load = LIZ.load(c03it);
        c1331670kl3Load.LJIILJJIL = LJFF;
        return c1331670kl3Load;
    }

    public static void LJIIJJI(C1331510kkn c1331510kkn) {
        if (!LIZLLL) {
            return;
        }
        if (c1331510kkn == null) {
            int i = C2187451AjH.LIZ;
            C1330590kjJ.LJFF("Lighten", "loadBitmap", "request is null");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request =>");
        sbLIZ.append(c1331510kkn);
        C1330590kjJ.LIZ(c1331510kkn.hashCode(), "Lighten", "loadBitmap", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZLLL().LJIILIIL()) {
            c1331510kkn.LJJLIIIIJ = true;
        }
        InterfaceC1331950klV interfaceC1331950klV = (InterfaceC1331950klV) LIZLLL().LIZIZ.LJJJJLI.LIZ();
        if (interfaceC1331950klV == null || !interfaceC1331950klV.loadBitmap(c1331510kkn)) {
            LIZ.loadBitmap(c1331510kkn);
        }
    }
}
