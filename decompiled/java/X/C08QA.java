package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08QA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08QA extends C08QB {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIIZILJ(File file) {
        C08QK c08qk = new C08QK(new C08QE(file, FileWalkDirection.BOTTOM_UP, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 32, 0 == true ? 1 : 0));
        while (true) {
            boolean z = true;
            while (c08qk.hasNext()) {
                File next = c08qk.next();
                if (next.delete() || !next.exists()) {
                    if (z) {
                        break;
                    }
                    z = false;
                } else {
                    z = false;
                }
            }
            return z;
        }
    }

    public static final String LJIJ(File file) {
        return a0.LJJLJ('.', file.getName(), "");
    }

    public static final String LJIJI(File file) {
        String name = file.getName();
        return a0.LJL(name, e3.d, name);
    }

    public static final C2085708Fb LJIJJ(C2085708Fb c2085708Fb) {
        File file = c2085708Fb.LIZ;
        List<File> list = c2085708Fb.LIZIZ;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!Intrinsics.LJFF(name, e3.d)) {
                if (Intrinsics.LJFF(name, "..")) {
                    if (!arrayList.isEmpty() && !Intrinsics.LJFF(((File) C13LP.LJJLIIIJJI(arrayList)).getName(), "..")) {
                        ListProtector.remove(arrayList, arrayList.size() - 1);
                    } else {
                        arrayList.add(file2);
                    }
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return new C2085708Fb(file, arrayList);
    }

    public static final File LJIJJLI(File file, File file2) {
        if (C08DM.LIZ(file2.getPath()) > 0) {
            return file2;
        }
        String string = file.toString();
        if (string.length() != 0 && !a0.LJJIJIIJIL(string, File.separatorChar)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(File.separatorChar);
            sbLIZ.append(file2);
            return new File(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(file2);
        return new File(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final File LJIL(File file, String str) {
        return LJIJJLI(file, new File(str));
    }

    public static final File LJJ(File file, String str) {
        File file2;
        File file3 = new File(str);
        C2085708Fb c2085708FbLIZIZ = C08DM.LIZIZ(file);
        if (c2085708FbLIZIZ.LIZ() == 0) {
            file2 = new File("..");
        } else {
            int iLIZ = c2085708FbLIZIZ.LIZ() - 1;
            if (iLIZ >= 0 && iLIZ <= c2085708FbLIZIZ.LIZ()) {
                file2 = new File(C13LP.LJJLIIIJ(c2085708FbLIZIZ.LIZIZ.subList(0, iLIZ), File.separator, null, null, 0, null, null, 62));
            } else {
                throw new IllegalArgumentException();
            }
        }
        return LJIJJLI(LJIJJLI(c2085708FbLIZIZ.LIZ, file2), file3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJJI(java.io.File r10, java.io.File r11) {
        /*
            X.08Fb r0 = X.C08DM.LIZIZ(r10)
            X.08Fb r8 = LJIJJ(r0)
            X.08Fb r0 = X.C08DM.LIZIZ(r11)
            X.08Fb r9 = LJIJJ(r0)
            java.io.File r1 = r8.LIZ
            java.io.File r0 = r9.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r4 = 0
            if (r0 == 0) goto L88
            int r7 = r9.LIZ()
            int r6 = r8.LIZ()
            int r2 = java.lang.Math.min(r6, r7)
            r5 = 0
        L28:
            if (r5 >= r2) goto L3f
            java.util.List<java.io.File> r0 = r8.LIZIZ
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            java.util.List<java.io.File> r0 = r9.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3f
            int r5 = r5 + 1
            goto L28
        L3f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r2 = r7 + (-1)
            if (r5 > r2) goto L6b
        L48:
            java.util.List<java.io.File> r0 = r9.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ".."
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L88
            r3.append(r1)
            if (r2 == r5) goto L66
            char r0 = java.io.File.separatorChar
            r3.append(r0)
        L66:
            if (r2 == r5) goto L6b
            int r2 = r2 + (-1)
            goto L48
        L6b:
            if (r5 >= r6) goto L81
            if (r5 >= r7) goto L74
            char r0 = java.io.File.separatorChar
            r3.append(r0)
        L74:
            java.util.List<java.io.File> r0 = r8.LIZIZ
            java.util.List r2 = X.C13LP.LJJJJIZL(r0, r5)
            java.lang.String r1 = java.io.File.separator
            r0 = 124(0x7c, float:1.74E-43)
            X.C13LP.LJJLIIIIJ(r2, r3, r1, r4, r0)
        L81:
            java.lang.String r0 = r3.toString()
            if (r0 == 0) goto L88
            return r0
        L88:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "this and base files have different roots: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r11)
            r0 = 46
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08QA.LJJI(java.io.File, java.io.File):java.lang.String");
    }

    public static final boolean LJIILJJIL(File file, File file2, boolean z, final Function2<? super File, ? super IOException, ? extends C08QG> function2) throws Throwable {
        if (!file.exists()) {
            if (function2.invoke(file, new C08NM(file, null, "The source file doesn't exist.", 2, null)) != C08QG.TERMINATE) {
                return true;
            }
            return false;
        }
        try {
            C08QE c08qeLJIILIIL = C08QB.LJIILIIL(file);
            C08QK c08qk = new C08QK(new C08QE(c08qeLJIILIIL.LIZ, c08qeLJIILIIL.LIZIZ, c08qeLJIILIIL.LIZJ, c08qeLJIILIIL.LIZLLL, new Function2() { // from class: X.08QC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws C08NJ {
                    File file3 = (File) obj;
                    if (function2.invoke(file3, obj2) != C08QG.TERMINATE) {
                        return Unit.LIZ;
                    }
                    throw new C08NJ(file3) { // from class: X.08NK
                    };
                }
            }, c08qeLJIILIIL.LJFF));
            while (c08qk.hasNext()) {
                File next = c08qk.next();
                if (!next.exists()) {
                    if (function2.invoke(next, new C08NM(next, null, "The source file doesn't exist.", 2, null)) == C08QG.TERMINATE) {
                        return false;
                    }
                } else {
                    File file3 = new File(file2, LJJI(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z) {
                            if (file3.isDirectory()) {
                                if (!LJIIZILJ(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (function2.invoke(file3, new C08NL(next, file3, "The destination file already exists.")) == C08QG.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        LJIILLIIL(next, file3, z, 4);
                        if (file3.length() != next.length() && function2.invoke(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == C08QG.TERMINATE) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } catch (C08NK e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static /* synthetic */ boolean LJIILL(File file, File file2, boolean z, int i) {
        C08QD c08qd;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c08qd = new Function2() { // from class: X.08QD
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return LIZ((File) obj, (IOException) obj2);
                }

                public static final Void LIZ(File file3, IOException iOException) throws IOException {
                    throw iOException;
                }
            };
        } else {
            c08qd = null;
        }
        return LJIILJJIL(file, file2, z, c08qd);
    }

    public static void LJIILLIIL(File file, File file2, boolean z, int i) throws Throwable {
        int i2;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            i2 = 8192;
        } else {
            i2 = 0;
        }
        if (file.exists()) {
            if (file2.exists()) {
                if (z) {
                    if (!file2.delete()) {
                        throw new C08NL(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new C08NL(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!file2.mkdirs()) {
                    throw new C08NJ(file, file2, "Failed to create target directory.");
                }
                return;
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[i2];
                    for (int i3 = fileInputStream.read(bArr); i3 >= 0; i3 = fileInputStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i3);
                    }
                    C2107108Nh.LIZ(fileOutputStream, null);
                    C2107108Nh.LIZ(fileInputStream, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(fileOutputStream, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(fileInputStream, th);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        } else {
            throw new C08NM(file, null, "The source file doesn't exist.", 2, null);
        }
    }
}
