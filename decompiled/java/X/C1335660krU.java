package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0krU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335660krU implements InterfaceC1335470krB {
    public static final Class<?> LJIIIIZZ = C1335660krU.class;
    public static final long LJIIIZ = TimeUnit.MINUTES.toMillis(30);
    public final File LIZ;
    public final boolean LIZIZ;
    public final C0VSJ LIZJ;
    public final C0VSJ LIZLLL;
    public final C0VSJ LJ;
    public final File LJFF;
    public final InterfaceC1331440kkg LJI;
    public final C1335650krT LJII;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    @Override // X.InterfaceC1335470krB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1325500kb6 LIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1335660krU.LIZ():X.0kb6");
    }

    @Override // X.InterfaceC1335470krB
    public final void LIZIZ() {
        C1335730krb.LIZJ(this.LIZ, new InterfaceC1335750krd() { // from class: X.0krW
            public boolean LIZ;

            @Override // X.InterfaceC1335750krd
            public final void LIZ(File file) {
                if (!this.LIZ && file.equals(this.LIZIZ.LIZJ)) {
                    this.LIZ = true;
                }
            }

            @Override // X.InterfaceC1335750krd
            public final void LIZIZ(File file) {
                if (this.LIZ) {
                    C1335690krX c1335690krXLJIILLIIL = this.LIZIZ.LJIILLIIL(file);
                    boolean z = false;
                    if (c1335690krXLJIILLIIL != null) {
                        String str = c1335690krXLJIILLIIL.LIZ;
                        if (str == ".tmp") {
                            long jLastModified = file.lastModified();
                            this.LIZIZ.LJII.getClass();
                            if (jLastModified > System.currentTimeMillis() - C1335660krU.LJIIIZ) {
                                return;
                            }
                        } else {
                            if (str == ".cnt") {
                                z = true;
                            }
                            C1322350kW1.LJFF(z);
                            return;
                        }
                    }
                }
                file.delete();
            }

            @Override // X.InterfaceC1335750krd
            public final void LIZJ(File file) {
                if (!this.LIZIZ.LIZ.equals(file) && !this.LIZ) {
                    file.delete();
                }
                if (this.LIZ && file.equals(this.LIZIZ.LIZJ)) {
                    this.LIZ = false;
                }
            }
        });
    }

    @Override // X.InterfaceC1335470krB
    public final List<InterfaceC1335610krP> LIZLLL() {
        C1335670krV c1335670krV = new C1335670krV(this, EnumC1335720kra.IMAGE_CACHE_FILE);
        C1335730krb.LIZJ(this.LIZJ, c1335670krV);
        return Collections.unmodifiableList(c1335670krV.LIZ);
    }

    @Override // X.InterfaceC1335470krB
    public final Collection LJ() {
        C1335700krY c1335700krY = new C1335700krY(this);
        C1335730krb.LIZJ(this.LIZJ, c1335700krY);
        return Collections.unmodifiableList(c1335700krY.LIZ);
    }

    @Override // X.InterfaceC1335470krB
    public final Collection LJIIIZ() {
        C1335670krV c1335670krV = new C1335670krV(this, EnumC1335720kra.CONFIG_FILE);
        C1335730krb.LIZJ(this.LIZLLL, c1335670krV);
        return Collections.unmodifiableList(c1335670krV.LIZ);
    }

    @Override // X.InterfaceC1335470krB
    public final void clearAll() {
        C1335730krb.LIZ(this.LIZ);
        C1335730krb.LIZ(this.LJFF);
    }

    @Override // X.InterfaceC1335470krB
    public final boolean isExternal() {
        return this.LIZIZ;
    }

    public static long LJIIJJI(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    public static Map LJIIL(C0VSJ c0vsj) throws Throwable {
        HashMap map = new HashMap();
        if (!c0vsj.exists()) {
            return map;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new C0VSF(c0vsj));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line != null) {
                                int iLastIndexOf = line.lastIndexOf("=");
                                map.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                            } else {
                                bufferedReader2.close();
                                bufferedReader2.close();
                                return map;
                            }
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            TryCatchGuardChecker.doCheck(e);
                            C1328570kg3.LJIILL(LJIIIIZZ, "fileToMap: file not found");
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                return map;
                            }
                            return map;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            TryCatchGuardChecker.doCheck(th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (IOException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    public static String LJIJ(int i) {
        return C786410Ut5.k4(null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i)});
    }

    @Override // X.InterfaceC1335470krB
    public final long LIZJ(InterfaceC1335610krP interfaceC1335610krP) {
        return LJIIJJI(((C1335710krZ) interfaceC1335610krP).LIZIZ.LIZ);
    }

    @Override // X.InterfaceC1335470krB
    public final long LJIIIIZZ(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append(strValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str2);
        sbLIZ2.append(str);
        sbLIZ2.append(".cnt");
        LJIIJJI(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)));
        return LJIIJJI(LJIILIIL(str));
    }

    public final C0VSJ LJIILIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIILJJIL(str));
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        sbLIZ.append(".cnt");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String LJIILJJIL(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(File.separator);
        sbLIZ.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0VSJ LJIILL(String str) {
        String strLJIIZILJ = LJIIZILJ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIZILJ);
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        sbLIZ.append(".cnt");
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C1335690krX LJIILLIIL(File file) {
        C1335690krX c1335690krXLIZ = C1335690krX.LIZ(file);
        if (c1335690krXLIZ == null || !new C0VSJ(LJIIZILJ(c1335690krXLIZ.LIZIZ)).equals(file.getParentFile())) {
            return null;
        }
        return c1335690krXLIZ;
    }

    public final String LJIIZILJ(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(File.separator);
        sbLIZ.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1335470krB
    public final long remove(String str) {
        return LJIIJJI(LJIILL(str));
    }

    @Override // X.InterfaceC1335470krB
    public final Map LJFF(Object obj, String str) throws Throwable {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append(strValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str2);
        sbLIZ2.append(str);
        sbLIZ2.append(".cnt");
        Map mapLJIIL = LJIIL(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)));
        ((HashMap) mapLJIIL).putAll(LJIIL(LJIILIIL(str)));
        return mapLJIIL;
    }

    @Override // X.InterfaceC1335470krB
    public final InterfaceC1317730kOZ LJI(Object obj, String str) {
        C0VSJ c0vsjLJIILL = LJIILL(str);
        if (c0vsjLJIILL.exists()) {
            this.LJII.getClass();
            c0vsjLJIILL.setLastModified(System.currentTimeMillis());
            return new C1335740krc(c0vsjLJIILL);
        }
        return null;
    }

    @Override // X.InterfaceC1335470krB
    public final boolean LJII(Object obj, String str) {
        return LJIILL(str).exists();
    }

    @Override // X.InterfaceC1335470krB
    public final InterfaceC1335640krS LJIIJ(Object obj, String str) throws IOException {
        C0VSJ c0vsj = new C0VSJ(LJIIZILJ(str));
        if (!c0vsj.exists()) {
            try {
                C1335490krD.LIZ(c0vsj);
            } catch (C1335550krJ e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJI.getClass();
                throw e;
            }
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(e3.d);
            File fileCreateTempFile = File.createTempFile(C2188811AlT.LIZIZ(sbLIZ), ".tmp", c0vsj);
            LJIJI(obj, str);
            return new C1335480krC(this, str, fileCreateTempFile);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LJI.getClass();
            throw e2;
        }
    }

    public final void LJIJI(Object obj, String str) throws IOException {
        Map<String, String> map;
        if ((obj instanceof C1324710kZp) && (map = ((C1324710kZp) obj).LIZIZ) != null && !map.isEmpty()) {
            C0VSJ c0vsj = new C0VSJ(LJIILJJIL(str));
            if (!c0vsj.exists()) {
                try {
                    C1335490krD.LIZ(c0vsj);
                } catch (C1335550krJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LJI.getClass();
                    throw e;
                }
            }
            C0VSJ c0vsjLJIILIIL = LJIILIIL(str);
            if (!c0vsjLJIILIIL.exists()) {
                c0vsjLJIILIIL.createNewFile();
            }
            StringBuilder sb = new StringBuilder();
            C794210VDn c794210VDn = new C794210VDn((File) c0vsjLJIILIIL, false);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb.append(key);
                sb.append("=");
                sb.append(value);
                sb.append(System.lineSeparator());
            }
            c794210VDn.write(sb.toString());
            c794210VDn.close();
        }
    }

    public C1335660krU(C0VSJ c0vsj, C0VSJ c0vsj2, int i, InterfaceC1331440kkg interfaceC1331440kkg) {
        boolean zContains;
        boolean z;
        File fileW3;
        String canonicalPath;
        this.LIZ = c0vsj;
        this.LJFF = c0vsj2;
        try {
            fileW3 = C786410Ut5.W3();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1331440kkg.getClass();
        }
        if (fileW3 != null) {
            String string = fileW3.toString();
            try {
                canonicalPath = c0vsj.getCanonicalPath();
                try {
                    zContains = canonicalPath.contains(string);
                } catch (IOException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to read folder to check if external: ");
                    sbLIZ.append(canonicalPath);
                    C2188811AlT.LIZIZ(sbLIZ);
                    interfaceC1331440kkg.getClass();
                    zContains = false;
                }
            } catch (IOException e3) {
                e = e3;
                canonicalPath = null;
            }
        } else {
            zContains = false;
        }
        this.LIZIZ = zContains;
        C0VSJ c0vsj3 = new C0VSJ(this.LIZ, LJIJ(i));
        this.LIZJ = c0vsj3;
        File file = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJIJ(i));
        sbLIZ2.append("-config");
        this.LJ = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ2));
        File file2 = this.LJFF;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LJIJ(i));
        sbLIZ3.append("-config");
        this.LIZLLL = new C0VSJ(file2, C2188811AlT.LIZIZ(sbLIZ3));
        this.LJI = interfaceC1331440kkg;
        if (this.LIZ.exists()) {
            if (!c0vsj3.exists()) {
                C1335730krb.LIZIZ(this.LIZ);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (z) {
            try {
                C1335490krD.LIZ(c0vsj3);
            } catch (C1335550krJ e4) {
                TryCatchGuardChecker.doCheck(e4);
                InterfaceC1331440kkg interfaceC1331440kkg2 = this.LJI;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("version directory could not be created: ");
                sbLIZ4.append(this.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ4);
                interfaceC1331440kkg2.getClass();
            }
        }
        if (this.LIZ.exists()) {
            if (!this.LIZJ.exists()) {
                C1335730krb.LIZIZ(this.LIZ);
                C1335490krD.LIZ(this.LIZJ);
            }
        } else {
            try {
                C1335490krD.LIZ(this.LIZJ);
            } catch (C1335550krJ e5) {
                TryCatchGuardChecker.doCheck(e5);
                InterfaceC1331440kkg interfaceC1331440kkg3 = this.LJI;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("version directory could not be created: ");
                sbLIZ5.append(this.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ5);
                interfaceC1331440kkg3.getClass();
            }
        }
        this.LJII = C1335650krT.LIZ;
    }
}
