package X;

import android.util.Pair;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0qSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550970qSl extends AbstractC1552240qUo<Pair<InterfaceC1550870qSb, UpdatePackage>, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    public C1550930qSh LJI;

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        C1550930qSh c1550930qSh;
        Arrays.copyOf(objArr, objArr.length);
        Object obj = objArr[0];
        if (obj instanceof C1550930qSh) {
            c1550930qSh = (C1550930qSh) obj;
        } else {
            c1550930qSh = null;
        }
        this.LJI = c1550930qSh;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.08nG] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.08nG] */
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, Pair<InterfaceC1550870qSb, UpdatePackage> pair) throws Throwable {
        C0VSJ c0vsj;
        File parentFile;
        boolean zLIZIZ;
        Pair<InterfaceC1550870qSb, UpdatePackage> pair2 = pair;
        boolean z = false;
        C1553130qWF.LIZ("gecko-debug-tag-MergeDir", "start merge dir, channel:", ((UpdatePackage) pair2.second).getChannel());
        C1550930qSh c1550930qSh = this.LJI;
        if (c1550930qSh != null) {
            c0vsj = c1550930qSh.LIZ((UpdatePackage) pair2.second);
        } else {
            c0vsj = null;
        }
        InterfaceC1550870qSb interfaceC1550870qSb = (InterfaceC1550870qSb) pair2.first;
        File fileLIZIZ = interfaceC1550870qSb.LIZIZ();
        interfaceC1550870qSb.LIZJ();
        interfaceC1550870qSb.release();
        File parentFile2 = fileLIZIZ.getParentFile();
        if (parentFile2 != null && (parentFile = parentFile2.getParentFile()) != null) {
            UpdatePackage updatePackage = (UpdatePackage) pair2.second;
            if (c0vsj == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(updatePackage.getLocalVersion());
                sbLIZ.append(File.separator);
                sbLIZ.append("res");
                c0vsj = new C0VSJ(parentFile, C2188811AlT.LIZIZ(sbLIZ));
            }
            C0VSJ c0vsj2 = new C0VSJ(fileLIZIZ.getParentFile(), "res");
            C0X9F.LJFF(c0vsj2);
            try {
                try {
                    if (AppSettingsManager.LIZIZ()) {
                        try {
                            new Object() { // from class: X.08nG
                                public static final Map<Integer, String> LJII;
                                public RandomAccessFile LIZIZ;
                                public File LIZJ;
                                public File LIZLLL;
                                public File LJ;
                                public int LJFF;
                                public final Set<String> LIZ = new HashSet();
                                public String LJI = "";

                                static {
                                    HashMap map = new HashMap();
                                    LJII = map;
                                    map.put(1, "modify");
                                    map.put(2, "delete");
                                    map.put(3, "add");
                                    map.put(4, "rename");
                                    map.put(5, "rewrite");
                                    map.put(6, "same");
                                }

                                public final void LIZLLL() throws Throwable {
                                    while (this.LIZIZ.getFilePointer() != this.LIZIZ.length()) {
                                        String utf = this.LIZIZ.readUTF();
                                        if (utf.isEmpty()) {
                                            throw new C2222608nI(1006, "read path is empty");
                                        }
                                        ((HashSet) this.LIZ).add(utf);
                                        C0VSJ c0vsj3 = new C0VSJ(this.LIZJ, utf);
                                        if (!utf.startsWith("__MACOSX/") && !utf.equals(".DS_Store")) {
                                            byte b = this.LIZIZ.readByte();
                                            HashMap map = (HashMap) LJII;
                                            this.LJI = C786410Ut5.j4("patch failed, type:%s, path:%s, detail:", new Object[]{map.get(Integer.valueOf(b)), utf});
                                            switch (b) {
                                                case 1:
                                                    LJ(c0vsj3, utf);
                                                    break;
                                                case 2:
                                                    break;
                                                case 3:
                                                    C0VSJ c0vsj4 = new C0VSJ(this.LIZLLL, utf);
                                                    LIZJ(c0vsj4.getParentFile());
                                                    LJIIIIZZ(c0vsj4);
                                                    if (this.LJFF != 0) {
                                                        continue;
                                                    } else {
                                                        byte[] bArr = new byte[32];
                                                        this.LIZIZ.readFully(bArr);
                                                        String str = new String(bArr);
                                                        String strLIZJ = C08IP.LIZJ(c0vsj4);
                                                        if (!strLIZJ.equals(str)) {
                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                            sbLIZ2.append(this.LJI);
                                                            sbLIZ2.append("md5 check failed, local md5:");
                                                            sbLIZ2.append(strLIZJ);
                                                            sbLIZ2.append(", expect md5:");
                                                            sbLIZ2.append(str);
                                                            throw new C2222608nI(1011, C2188811AlT.LIZIZ(sbLIZ2));
                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                    String utf2 = this.LIZIZ.readUTF();
                                                    if (utf2.isEmpty()) {
                                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                        sbLIZ3.append(this.LJI);
                                                        sbLIZ3.append("read path is nil");
                                                        throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ3));
                                                    }
                                                    LJFF(c0vsj3, utf2);
                                                    break;
                                                case 5:
                                                    String utf3 = this.LIZIZ.readUTF();
                                                    if (utf3.isEmpty()) {
                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                        sbLIZ4.append(this.LJI);
                                                        sbLIZ4.append("read path is nil");
                                                        throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ4));
                                                    }
                                                    this.LJI = C786410Ut5.j4("patch failed, type:%s, path:%s, newPath: %s, detail:", new Object[]{map.get(Integer.valueOf(b)), utf, utf3});
                                                    LJ(c0vsj3, utf3);
                                                    break;
                                                case 6:
                                                    LJFF(c0vsj3, utf);
                                                    break;
                                                default:
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append(this.LJI);
                                                    sbLIZ5.append("not support change type");
                                                    throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ5));
                                            }
                                        }
                                    }
                                }

                                public final void LIZJ(File file) {
                                    try {
                                        C0X9F.LIZLLL(file);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(this.LJI);
                                        sbLIZ2.append(e.getMessage());
                                        throw new C2222608nI(1012, C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                }

                                public final void LJII(File file) throws Throwable {
                                    File[] fileArrListFiles = file.listFiles();
                                    if (fileArrListFiles == null) {
                                        return;
                                    }
                                    for (File file2 : fileArrListFiles) {
                                        if (file2.isFile()) {
                                            String strSubstring = file2.getAbsolutePath().substring(this.LIZJ.getAbsolutePath().length() + 1);
                                            if (!((HashSet) this.LIZ).contains(strSubstring)) {
                                                LIZIZ(file2, new C0VSJ(this.LIZLLL, strSubstring));
                                            }
                                        } else {
                                            LJII(file2);
                                        }
                                    }
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
                                
                                    r1 = (int) r5;
                                    r13.LIZIZ.readFully(r3, 0, r1);
                                    r7.write(r3, 0, r1);
                                 */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LJIIIIZZ(X.C0VSJ r14) throws java.lang.Throwable {
                                    /*
                                        r13 = this;
                                        boolean r0 = r14.exists()
                                        r4 = 1007(0x3ef, float:1.411E-42)
                                        if (r0 == 0) goto L2d
                                        boolean r0 = r14.delete()
                                        if (r0 != 0) goto L2d
                                        X.08nI r2 = new X.08nI
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        java.lang.String r0 = r13.LJI
                                        r1.append(r0)
                                        java.lang.String r0 = "remove old file error: "
                                        r1.append(r0)
                                        java.lang.String r0 = r14.getPath()
                                        r1.append(r0)
                                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                        r2.<init>(r4, r0)
                                        throw r2
                                    L2d:
                                        r5 = 0
                                        java.io.RandomAccessFile r0 = r13.LIZIZ     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                        long r11 = r0.readLong()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                        X.0VSV r7 = new X.0VSV     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                        r7.<init>(r14)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                        r10 = 1048576(0x100000, float:1.469368E-39)
                                        byte[] r3 = new byte[r10]     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        r8 = 0
                                    L3f:
                                        int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                                        if (r0 >= 0) goto L5e
                                        long r5 = r11 - r8
                                        long r1 = (long) r10     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                                        if (r0 < 0) goto L54
                                        long r8 = r8 + r1
                                        java.io.RandomAccessFile r0 = r13.LIZIZ     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        r0.readFully(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        r7.write(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        goto L3f
                                    L54:
                                        java.io.RandomAccessFile r2 = r13.LIZIZ     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        int r1 = (int) r5     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        r0 = 0
                                        r2.readFully(r3, r0, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        r7.write(r3, r0, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                    L5e:
                                        X.C08IQ.LIZ(r7)
                                        return
                                    L62:
                                        r0 = move-exception
                                        r5 = r7
                                        goto L87
                                    L65:
                                        r3 = move-exception
                                        r5 = r7
                                        goto L69
                                    L68:
                                        r3 = move-exception
                                    L69:
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L86
                                        X.08nI r2 = new X.08nI     // Catch: java.lang.Throwable -> L86
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
                                        java.lang.String r0 = r13.LJI     // Catch: java.lang.Throwable -> L86
                                        r1.append(r0)     // Catch: java.lang.Throwable -> L86
                                        java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L86
                                        r1.append(r0)     // Catch: java.lang.Throwable -> L86
                                        java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
                                        r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L86
                                        throw r2     // Catch: java.lang.Throwable -> L86
                                    L86:
                                        r0 = move-exception
                                    L87:
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
                                        X.C08IQ.LIZ(r5)
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C2222408nG.LJIIIIZZ(X.0VSJ):void");
                                }

                                public final void LIZ(File file, C0VSJ c0vsj3) throws Throwable {
                                    Closeable closeable;
                                    LIZJ(c0vsj3.getParentFile());
                                    Closeable closeable2 = null;
                                    try {
                                        try {
                                            C0VSP c0vsp = new C0VSP(file);
                                            try {
                                                C0VSV c0vsv = new C0VSV(c0vsj3);
                                                try {
                                                    byte[] bArr = new byte[1048576];
                                                    while (true) {
                                                        int i = c0vsp.read(bArr);
                                                        if (i != -1) {
                                                            c0vsv.write(bArr, 0, i);
                                                        } else {
                                                            C08IQ.LIZ(c0vsp);
                                                            C08IQ.LIZ(c0vsv);
                                                            return;
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    closeable2 = c0vsv;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(this.LJI);
                                                    sbLIZ2.append(e.getMessage());
                                                    throw new C2222608nI(1012, C2188811AlT.LIZIZ(sbLIZ2));
                                                } catch (Throwable th) {
                                                    th = th;
                                                    closeable2 = c0vsv;
                                                    closeable = closeable2;
                                                    closeable2 = c0vsp;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C08IQ.LIZ(closeable2);
                                                    C08IQ.LIZ(closeable);
                                                    throw th;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        closeable = null;
                                    }
                                }

                                public final void LIZIZ(File file, C0VSJ c0vsj3) throws Throwable {
                                    C0VSV c0vsv;
                                    C0VSP c0vsp;
                                    C0VSV c0vsv2;
                                    FileChannel fileChannel;
                                    FileChannel channel;
                                    if (((Boolean) C2222508nH.LIZ.getValue()).booleanValue()) {
                                        C0VSP c0vsp2 = null;
                                        FileChannel channel2 = null;
                                        FileChannel fileChannel2 = null;
                                        c0vsv = null;
                                        C0VSV c0vsv3 = null;
                                        try {
                                            try {
                                                C0X9F.LIZLLL(c0vsj3.getParentFile());
                                                try {
                                                    c0vsp = new C0VSP(file);
                                                    try {
                                                    } catch (Throwable th) {
                                                        th = th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    c0vsv = null;
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C08IQ.LIZ(c0vsp2);
                                                        C08IQ.LIZ(c0vsv);
                                                        LIZ(file, c0vsj3);
                                                    } catch (Throwable th3) {
                                                        TryCatchGuardChecker.doCheck(th3);
                                                        C08IQ.LIZ(c0vsp2);
                                                        C08IQ.LIZ(c0vsv);
                                                        throw th3;
                                                    }
                                                }
                                            } catch (Exception e) {
                                                try {
                                                    TryCatchGuardChecker.doCheck(e);
                                                    throw new C2222608nI(1012, e.getMessage());
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    c0vsv = null;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C08IQ.LIZ(c0vsp2);
                                                    C08IQ.LIZ(c0vsv);
                                                    LIZ(file, c0vsj3);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                        try {
                                            try {
                                                c0vsv2 = new C0VSV(c0vsj3);
                                                try {
                                                    channel = c0vsp.getChannel();
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    fileChannel = null;
                                                }
                                                try {
                                                    channel2 = c0vsv2.getChannel();
                                                    long size = channel.size();
                                                    long j = 0;
                                                    while (size > 0) {
                                                        long jTransferTo = channel.transferTo(j, size, channel2);
                                                        if (jTransferTo > 0) {
                                                            j += jTransferTo;
                                                            size -= jTransferTo;
                                                        }
                                                    }
                                                    C08IQ.LIZ(channel);
                                                    C08IQ.LIZ(channel2);
                                                    C08IQ.LIZ(c0vsp);
                                                    C08IQ.LIZ(c0vsv2);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    fileChannel = channel2;
                                                    fileChannel2 = channel;
                                                    while (true) {
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C08IQ.LIZ(fileChannel2);
                                                            C08IQ.LIZ(fileChannel);
                                                            throw th;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                c0vsv = c0vsv3;
                                                c0vsp2 = c0vsp;
                                                TryCatchGuardChecker.doCheck(th);
                                                C08IQ.LIZ(c0vsp2);
                                                C08IQ.LIZ(c0vsv);
                                                LIZ(file, c0vsj3);
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            c0vsv3 = c0vsv2;
                                            c0vsv = c0vsv3;
                                            c0vsp2 = c0vsp;
                                            TryCatchGuardChecker.doCheck(th);
                                            C08IQ.LIZ(c0vsp2);
                                            C08IQ.LIZ(c0vsv);
                                            LIZ(file, c0vsj3);
                                        }
                                    } else {
                                        LIZ(file, c0vsj3);
                                    }
                                }

                                public final void LJ(C0VSJ c0vsj3, String str) throws Throwable {
                                    if (c0vsj3.exists()) {
                                        C0VSJ c0vsj4 = new C0VSJ(this.LIZLLL, str);
                                        LIZJ(c0vsj4.getParentFile());
                                        C0VSJ c0vsj5 = new C0VSJ(this.LJ.getParentFile(), "bytepatch_patch_temp_file");
                                        LJIIIIZZ(c0vsj5);
                                        try {
                                            BsPatch.LIZ(c0vsj3, c0vsj5, this.LIZLLL, str);
                                            c0vsj5.delete();
                                            byte[] bArr = new byte[32];
                                            this.LIZIZ.readFully(bArr);
                                            String str2 = new String(bArr);
                                            String strLIZJ = C08IP.LIZJ(c0vsj4);
                                            if (!strLIZJ.equals(str2)) {
                                                if (C08IP.LIZJ(c0vsj3).equals(str2)) {
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(this.LJI);
                                                    sbLIZ2.append("old file is same");
                                                    throw new C2222608nI(1024, C2188811AlT.LIZIZ(sbLIZ2));
                                                }
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(this.LJI);
                                                sbLIZ3.append("md5 check failed, local md5:");
                                                sbLIZ3.append(strLIZJ);
                                                sbLIZ3.append(", expect md5:");
                                                sbLIZ3.append(str2);
                                                throw new C2222608nI(1011, C2188811AlT.LIZIZ(sbLIZ3));
                                            }
                                            return;
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(this.LJI);
                                            sbLIZ4.append("bspatch error:");
                                            sbLIZ4.append(e.getMessage());
                                            throw new C2222608nI(1010, C2188811AlT.LIZIZ(sbLIZ4));
                                        }
                                    }
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(this.LJI);
                                    sbLIZ5.append("path not exists: ");
                                    throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ5));
                                }

                                public final void LJFF(C0VSJ c0vsj3, String str) throws Throwable {
                                    if (c0vsj3.exists()) {
                                        C0VSJ c0vsj4 = new C0VSJ(this.LIZLLL, str);
                                        LIZIZ(c0vsj3, c0vsj4);
                                        if (this.LJFF == 0) {
                                            byte[] bArr = new byte[32];
                                            this.LIZIZ.readFully(bArr);
                                            String str2 = new String(bArr);
                                            String strLIZJ = C08IP.LIZJ(c0vsj4);
                                            if (!strLIZJ.equals(str2)) {
                                                String strLIZJ2 = C08IP.LIZJ(c0vsj3);
                                                if (!strLIZJ2.equals(strLIZJ)) {
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(this.LJI);
                                                    sbLIZ2.append("copy error, old file md5:");
                                                    sbLIZ2.append(strLIZJ2);
                                                    sbLIZ2.append(", new file md5:");
                                                    sbLIZ2.append(strLIZJ);
                                                    sbLIZ2.append(", expect md5:");
                                                    sbLIZ2.append(str2);
                                                    throw new C2222608nI(1013, C2188811AlT.LIZIZ(sbLIZ2));
                                                }
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(this.LJI);
                                                sbLIZ3.append("md5 check failed, local md5:");
                                                sbLIZ3.append(strLIZJ);
                                                sbLIZ3.append(", expect md5:");
                                                sbLIZ3.append(str2);
                                                throw new C2222608nI(1011, C2188811AlT.LIZIZ(sbLIZ3));
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(this.LJI);
                                    sbLIZ4.append("path not exists: ");
                                    throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ4));
                                }

                                public final void LJI(C0VSJ c0vsj3, C0VSJ c0vsj4, File file) {
                                    if (c0vsj3.exists() && !c0vsj3.isFile()) {
                                        if (file.exists() && !file.isDirectory()) {
                                            if (c0vsj4.exists() && c0vsj4.isFile()) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("param dest error,  is a file: ");
                                                sbLIZ2.append(c0vsj4.getPath());
                                                throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ2));
                                            }
                                            if (c0vsj4.exists() && c0vsj4.isDirectory() && !C0X9F.LJFF(c0vsj4)) {
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("param dest error, remove failed: ");
                                                sbLIZ3.append(c0vsj4.getPath());
                                                throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ3));
                                            }
                                            this.LIZJ = c0vsj3;
                                            this.LIZLLL = c0vsj4;
                                            this.LJ = file;
                                            try {
                                                try {
                                                    try {
                                                        RandomAccessFile randomAccessFile = new RandomAccessFile(this.LJ, "rw");
                                                        this.LIZIZ = randomAccessFile;
                                                        byte[] bArr = new byte[8];
                                                        randomAccessFile.readFully(bArr);
                                                        if ("BYTEDIFF".equals(new String(bArr))) {
                                                            byte b = this.LIZIZ.readByte();
                                                            if (b <= 1 && b >= 0) {
                                                                this.LJFF = b;
                                                                LIZLLL();
                                                                this.LJI = "";
                                                                if (b == 0) {
                                                                    LJII(this.LIZJ);
                                                                }
                                                                C08IQ.LIZ(this.LIZIZ);
                                                                return;
                                                            }
                                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                            sbLIZ4.append("unsupported version: ");
                                                            sbLIZ4.append((int) b);
                                                            throw new C2222608nI(1005, C2188811AlT.LIZIZ(sbLIZ4));
                                                        }
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append("not bytediff file: ");
                                                        sbLIZ5.append(new String(bArr));
                                                        throw new C2222608nI(1005, C2188811AlT.LIZIZ(sbLIZ5));
                                                    } catch (Exception e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                        sbLIZ6.append(this.LJI);
                                                        sbLIZ6.append(e.getMessage());
                                                        throw new C2222608nI(1099, C2188811AlT.LIZIZ(sbLIZ6));
                                                    }
                                                } catch (C2222608nI e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                    throw e2;
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                C08IQ.LIZ(this.LIZIZ);
                                                throw th;
                                            }
                                        }
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append("param patch error: ");
                                        sbLIZ7.append(file.getPath());
                                        throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ7));
                                    }
                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                    sbLIZ8.append("param src error: ");
                                    sbLIZ8.append(c0vsj3.getPath());
                                    throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ8));
                                }
                            }.LJI(c0vsj, c0vsj2, fileLIZIZ);
                            fileLIZIZ.delete();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("merge dir failed: ");
                            sbLIZ2.append(updatePackage);
                            C1553130qWF.LJ("gecko-debug-tag-MergeDir", C2188811AlT.LIZIZ(sbLIZ2), e);
                            throw e;
                        }
                    } else {
                        try {
                            zLIZIZ = C0X9L.LIZIZ(parentFile.getAbsolutePath());
                        } catch (Exception e2) {
                            e = e2;
                        }
                        try {
                            if (!zLIZIZ) {
                                C1553130qWF.LIZ("gecko-debug-tag-MergeDir", "merge dir,channel:", parentFile.getAbsolutePath());
                                new Object() { // from class: X.08nG
                                    public static final Map<Integer, String> LJII;
                                    public RandomAccessFile LIZIZ;
                                    public File LIZJ;
                                    public File LIZLLL;
                                    public File LJ;
                                    public int LJFF;
                                    public final Set<String> LIZ = new HashSet();
                                    public String LJI = "";

                                    static {
                                        HashMap map = new HashMap();
                                        LJII = map;
                                        map.put(1, "modify");
                                        map.put(2, "delete");
                                        map.put(3, "add");
                                        map.put(4, "rename");
                                        map.put(5, "rewrite");
                                        map.put(6, "same");
                                    }

                                    public final void LIZLLL() throws Throwable {
                                        while (this.LIZIZ.getFilePointer() != this.LIZIZ.length()) {
                                            String utf = this.LIZIZ.readUTF();
                                            if (utf.isEmpty()) {
                                                throw new C2222608nI(1006, "read path is empty");
                                            }
                                            ((HashSet) this.LIZ).add(utf);
                                            C0VSJ c0vsj3 = new C0VSJ(this.LIZJ, utf);
                                            if (!utf.startsWith("__MACOSX/") && !utf.equals(".DS_Store")) {
                                                byte b = this.LIZIZ.readByte();
                                                HashMap map = (HashMap) LJII;
                                                this.LJI = C786410Ut5.j4("patch failed, type:%s, path:%s, detail:", new Object[]{map.get(Integer.valueOf(b)), utf});
                                                switch (b) {
                                                    case 1:
                                                        LJ(c0vsj3, utf);
                                                        break;
                                                    case 2:
                                                        break;
                                                    case 3:
                                                        C0VSJ c0vsj4 = new C0VSJ(this.LIZLLL, utf);
                                                        LIZJ(c0vsj4.getParentFile());
                                                        LJIIIIZZ(c0vsj4);
                                                        if (this.LJFF != 0) {
                                                            continue;
                                                        } else {
                                                            byte[] bArr = new byte[32];
                                                            this.LIZIZ.readFully(bArr);
                                                            String str = new String(bArr);
                                                            String strLIZJ = C08IP.LIZJ(c0vsj4);
                                                            if (!strLIZJ.equals(str)) {
                                                                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                                sbLIZ22.append(this.LJI);
                                                                sbLIZ22.append("md5 check failed, local md5:");
                                                                sbLIZ22.append(strLIZJ);
                                                                sbLIZ22.append(", expect md5:");
                                                                sbLIZ22.append(str);
                                                                throw new C2222608nI(1011, C2188811AlT.LIZIZ(sbLIZ22));
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        String utf2 = this.LIZIZ.readUTF();
                                                        if (utf2.isEmpty()) {
                                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                            sbLIZ3.append(this.LJI);
                                                            sbLIZ3.append("read path is nil");
                                                            throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ3));
                                                        }
                                                        LJFF(c0vsj3, utf2);
                                                        break;
                                                    case 5:
                                                        String utf3 = this.LIZIZ.readUTF();
                                                        if (utf3.isEmpty()) {
                                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                            sbLIZ4.append(this.LJI);
                                                            sbLIZ4.append("read path is nil");
                                                            throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ4));
                                                        }
                                                        this.LJI = C786410Ut5.j4("patch failed, type:%s, path:%s, newPath: %s, detail:", new Object[]{map.get(Integer.valueOf(b)), utf, utf3});
                                                        LJ(c0vsj3, utf3);
                                                        break;
                                                    case 6:
                                                        LJFF(c0vsj3, utf);
                                                        break;
                                                    default:
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append(this.LJI);
                                                        sbLIZ5.append("not support change type");
                                                        throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ5));
                                                }
                                            }
                                        }
                                    }

                                    public final void LIZJ(File file) {
                                        try {
                                            C0X9F.LIZLLL(file);
                                        } catch (Exception e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                            sbLIZ22.append(this.LJI);
                                            sbLIZ22.append(e3.getMessage());
                                            throw new C2222608nI(1012, C2188811AlT.LIZIZ(sbLIZ22));
                                        }
                                    }

                                    public final void LJII(File file) throws Throwable {
                                        File[] fileArrListFiles = file.listFiles();
                                        if (fileArrListFiles == null) {
                                            return;
                                        }
                                        for (File file2 : fileArrListFiles) {
                                            if (file2.isFile()) {
                                                String strSubstring = file2.getAbsolutePath().substring(this.LIZJ.getAbsolutePath().length() + 1);
                                                if (!((HashSet) this.LIZ).contains(strSubstring)) {
                                                    LIZIZ(file2, new C0VSJ(this.LIZLLL, strSubstring));
                                                }
                                            } else {
                                                LJII(file2);
                                            }
                                        }
                                    }

                                    public final void LJIIIIZZ(C0VSJ v) throws Throwable {
                                        /*
                                            this = this;
                                            boolean r0 = r14.exists()
                                            r4 = 1007(0x3ef, float:1.411E-42)
                                            if (r0 == 0) goto L2d
                                            boolean r0 = r14.delete()
                                            if (r0 != 0) goto L2d
                                            X.08nI r2 = new X.08nI
                                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                            java.lang.String r0 = r13.LJI
                                            r1.append(r0)
                                            java.lang.String r0 = "remove old file error: "
                                            r1.append(r0)
                                            java.lang.String r0 = r14.getPath()
                                            r1.append(r0)
                                            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                                            r2.<init>(r4, r0)
                                            throw r2
                                        L2d:
                                            r5 = 0
                                            java.io.RandomAccessFile r0 = r13.LIZIZ     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                            long r11 = r0.readLong()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                            X.0VSV r7 = new X.0VSV     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                            r7.<init>(r14)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L86
                                            r10 = 1048576(0x100000, float:1.469368E-39)
                                            byte[] r3 = new byte[r10]     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            r8 = 0
                                        L3f:
                                            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                                            if (r0 >= 0) goto L5e
                                            long r5 = r11 - r8
                                            long r1 = (long) r10     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                                            if (r0 < 0) goto L54
                                            long r8 = r8 + r1
                                            java.io.RandomAccessFile r0 = r13.LIZIZ     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            r0.readFully(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            r7.write(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            goto L3f
                                        L54:
                                            java.io.RandomAccessFile r2 = r13.LIZIZ     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            int r1 = (int) r5     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            r0 = 0
                                            r2.readFully(r3, r0, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                            r7.write(r3, r0, r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
                                        L5e:
                                            X.C08IQ.LIZ(r7)
                                            return
                                        L62:
                                            r0 = move-exception
                                            r5 = r7
                                            goto L87
                                        L65:
                                            r3 = move-exception
                                            r5 = r7
                                            goto L69
                                        L68:
                                            r3 = move-exception
                                        L69:
                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L86
                                            X.08nI r2 = new X.08nI     // Catch: java.lang.Throwable -> L86
                                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
                                            java.lang.String r0 = r13.LJI     // Catch: java.lang.Throwable -> L86
                                            r1.append(r0)     // Catch: java.lang.Throwable -> L86
                                            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L86
                                            r1.append(r0)     // Catch: java.lang.Throwable -> L86
                                            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
                                            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L86
                                            throw r2     // Catch: java.lang.Throwable -> L86
                                        L86:
                                            r0 = move-exception
                                        L87:
                                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
                                            X.C08IQ.LIZ(r5)
                                            throw r0
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C2222408nG.LJIIIIZZ(X.0VSJ):void");
                                    }

                                    public final void LIZ(File file, C0VSJ c0vsj3) throws Throwable {
                                        Closeable closeable;
                                        LIZJ(c0vsj3.getParentFile());
                                        Closeable closeable2 = null;
                                        try {
                                            try {
                                                C0VSP c0vsp = new C0VSP(file);
                                                try {
                                                    C0VSV c0vsv = new C0VSV(c0vsj3);
                                                    try {
                                                        byte[] bArr = new byte[1048576];
                                                        while (true) {
                                                            int i = c0vsp.read(bArr);
                                                            if (i != -1) {
                                                                c0vsv.write(bArr, 0, i);
                                                            } else {
                                                                C08IQ.LIZ(c0vsp);
                                                                C08IQ.LIZ(c0vsv);
                                                                return;
                                                            }
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        closeable2 = c0vsv;
                                                        TryCatchGuardChecker.doCheck(e);
                                                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                        sbLIZ22.append(this.LJI);
                                                        sbLIZ22.append(e.getMessage());
                                                        throw new C2222608nI(1012, C2188811AlT.LIZIZ(sbLIZ22));
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        closeable2 = c0vsv;
                                                        closeable = closeable2;
                                                        closeable2 = c0vsp;
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C08IQ.LIZ(closeable2);
                                                        C08IQ.LIZ(closeable);
                                                        throw th;
                                                    }
                                                } catch (Exception e22) {
                                                    e = e22;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Exception e32) {
                                            e = e32;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            closeable = null;
                                        }
                                    }

                                    public final void LIZIZ(File file, C0VSJ c0vsj3) throws Throwable {
                                        C0VSV c0vsv;
                                        C0VSP c0vsp;
                                        C0VSV c0vsv2;
                                        FileChannel fileChannel;
                                        FileChannel channel;
                                        if (((Boolean) C2222508nH.LIZ.getValue()).booleanValue()) {
                                            C0VSP c0vsp2 = null;
                                            FileChannel channel2 = null;
                                            FileChannel fileChannel2 = null;
                                            c0vsv3 = null;
                                            C0VSV c0vsv3 = null;
                                            try {
                                                try {
                                                    C0X9F.LIZLLL(c0vsj3.getParentFile());
                                                    try {
                                                        c0vsp = new C0VSP(file);
                                                        try {
                                                        } catch (Throwable th) {
                                                            th = th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c0vsv = null;
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C08IQ.LIZ(c0vsp2);
                                                            C08IQ.LIZ(c0vsv);
                                                            LIZ(file, c0vsj3);
                                                        } catch (Throwable th3) {
                                                            TryCatchGuardChecker.doCheck(th3);
                                                            C08IQ.LIZ(c0vsp2);
                                                            C08IQ.LIZ(c0vsv);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Exception e3) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(e3);
                                                        throw new C2222608nI(1012, e3.getMessage());
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        c0vsv = null;
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C08IQ.LIZ(c0vsp2);
                                                        C08IQ.LIZ(c0vsv);
                                                        LIZ(file, c0vsj3);
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                            try {
                                                try {
                                                    c0vsv2 = new C0VSV(c0vsj3);
                                                    try {
                                                        channel = c0vsp.getChannel();
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        fileChannel = null;
                                                    }
                                                    try {
                                                        channel2 = c0vsv2.getChannel();
                                                        long size = channel.size();
                                                        long j = 0;
                                                        while (size > 0) {
                                                            long jTransferTo = channel.transferTo(j, size, channel2);
                                                            if (jTransferTo > 0) {
                                                                j += jTransferTo;
                                                                size -= jTransferTo;
                                                            }
                                                        }
                                                        C08IQ.LIZ(channel);
                                                        C08IQ.LIZ(channel2);
                                                        C08IQ.LIZ(c0vsp);
                                                        C08IQ.LIZ(c0vsv2);
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        fileChannel = channel2;
                                                        fileChannel2 = channel;
                                                        while (true) {
                                                            try {
                                                                TryCatchGuardChecker.doCheck(th);
                                                                C08IQ.LIZ(fileChannel2);
                                                                C08IQ.LIZ(fileChannel);
                                                                throw th;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    c0vsv = c0vsv3;
                                                    c0vsp2 = c0vsp;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C08IQ.LIZ(c0vsp2);
                                                    C08IQ.LIZ(c0vsv);
                                                    LIZ(file, c0vsj3);
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                c0vsv3 = c0vsv2;
                                                c0vsv = c0vsv3;
                                                c0vsp2 = c0vsp;
                                                TryCatchGuardChecker.doCheck(th);
                                                C08IQ.LIZ(c0vsp2);
                                                C08IQ.LIZ(c0vsv);
                                                LIZ(file, c0vsj3);
                                            }
                                        } else {
                                            LIZ(file, c0vsj3);
                                        }
                                    }

                                    public final void LJ(C0VSJ c0vsj3, String str) throws Throwable {
                                        if (c0vsj3.exists()) {
                                            C0VSJ c0vsj4 = new C0VSJ(this.LIZLLL, str);
                                            LIZJ(c0vsj4.getParentFile());
                                            C0VSJ c0vsj5 = new C0VSJ(this.LJ.getParentFile(), "bytepatch_patch_temp_file");
                                            LJIIIIZZ(c0vsj5);
                                            try {
                                                BsPatch.LIZ(c0vsj3, c0vsj5, this.LIZLLL, str);
                                                c0vsj5.delete();
                                                byte[] bArr = new byte[32];
                                                this.LIZIZ.readFully(bArr);
                                                String str2 = new String(bArr);
                                                String strLIZJ = C08IP.LIZJ(c0vsj4);
                                                if (!strLIZJ.equals(str2)) {
                                                    if (C08IP.LIZJ(c0vsj3).equals(str2)) {
                                                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                        sbLIZ22.append(this.LJI);
                                                        sbLIZ22.append("old file is same");
                                                        throw new C2222608nI(1024, C2188811AlT.LIZIZ(sbLIZ22));
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append(this.LJI);
                                                    sbLIZ3.append("md5 check failed, local md5:");
                                                    sbLIZ3.append(strLIZJ);
                                                    sbLIZ3.append(", expect md5:");
                                                    sbLIZ3.append(str2);
                                                    throw new C2222608nI(1011, C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append(this.LJI);
                                                sbLIZ4.append("bspatch error:");
                                                sbLIZ4.append(e3.getMessage());
                                                throw new C2222608nI(1010, C2188811AlT.LIZIZ(sbLIZ4));
                                            }
                                        }
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(this.LJI);
                                        sbLIZ5.append("path not exists: ");
                                        throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ5));
                                    }

                                    public final void LJFF(C0VSJ c0vsj3, String str) throws Throwable {
                                        if (c0vsj3.exists()) {
                                            C0VSJ c0vsj4 = new C0VSJ(this.LIZLLL, str);
                                            LIZIZ(c0vsj3, c0vsj4);
                                            if (this.LJFF == 0) {
                                                byte[] bArr = new byte[32];
                                                this.LIZIZ.readFully(bArr);
                                                String str2 = new String(bArr);
                                                String strLIZJ = C08IP.LIZJ(c0vsj4);
                                                if (!strLIZJ.equals(str2)) {
                                                    String strLIZJ2 = C08IP.LIZJ(c0vsj3);
                                                    if (!strLIZJ2.equals(strLIZJ)) {
                                                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                        sbLIZ22.append(this.LJI);
                                                        sbLIZ22.append("copy error, old file md5:");
                                                        sbLIZ22.append(strLIZJ2);
                                                        sbLIZ22.append(", new file md5:");
                                                        sbLIZ22.append(strLIZJ);
                                                        sbLIZ22.append(", expect md5:");
                                                        sbLIZ22.append(str2);
                                                        throw new C2222608nI(1013, C2188811AlT.LIZIZ(sbLIZ22));
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append(this.LJI);
                                                    sbLIZ3.append("md5 check failed, local md5:");
                                                    sbLIZ3.append(strLIZJ);
                                                    sbLIZ3.append(", expect md5:");
                                                    sbLIZ3.append(str2);
                                                    throw new C2222608nI(1011, C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(this.LJI);
                                        sbLIZ4.append("path not exists: ");
                                        throw new C2222608nI(1006, C2188811AlT.LIZIZ(sbLIZ4));
                                    }

                                    public final void LJI(C0VSJ c0vsj3, C0VSJ c0vsj4, File file) {
                                        if (c0vsj3.exists() && !c0vsj3.isFile()) {
                                            if (file.exists() && !file.isDirectory()) {
                                                if (c0vsj4.exists() && c0vsj4.isFile()) {
                                                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                                    sbLIZ22.append("param dest error,  is a file: ");
                                                    sbLIZ22.append(c0vsj4.getPath());
                                                    throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ22));
                                                }
                                                if (c0vsj4.exists() && c0vsj4.isDirectory() && !C0X9F.LJFF(c0vsj4)) {
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("param dest error, remove failed: ");
                                                    sbLIZ3.append(c0vsj4.getPath());
                                                    throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ3));
                                                }
                                                this.LIZJ = c0vsj3;
                                                this.LIZLLL = c0vsj4;
                                                this.LJ = file;
                                                try {
                                                    try {
                                                        try {
                                                            RandomAccessFile randomAccessFile = new RandomAccessFile(this.LJ, "rw");
                                                            this.LIZIZ = randomAccessFile;
                                                            byte[] bArr = new byte[8];
                                                            randomAccessFile.readFully(bArr);
                                                            if ("BYTEDIFF".equals(new String(bArr))) {
                                                                byte b = this.LIZIZ.readByte();
                                                                if (b <= 1 && b >= 0) {
                                                                    this.LJFF = b;
                                                                    LIZLLL();
                                                                    this.LJI = "";
                                                                    if (b == 0) {
                                                                        LJII(this.LIZJ);
                                                                    }
                                                                    C08IQ.LIZ(this.LIZIZ);
                                                                    return;
                                                                }
                                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                sbLIZ4.append("unsupported version: ");
                                                                sbLIZ4.append((int) b);
                                                                throw new C2222608nI(1005, C2188811AlT.LIZIZ(sbLIZ4));
                                                            }
                                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                            sbLIZ5.append("not bytediff file: ");
                                                            sbLIZ5.append(new String(bArr));
                                                            throw new C2222608nI(1005, C2188811AlT.LIZIZ(sbLIZ5));
                                                        } catch (Exception e3) {
                                                            TryCatchGuardChecker.doCheck(e3);
                                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                            sbLIZ6.append(this.LJI);
                                                            sbLIZ6.append(e3.getMessage());
                                                            throw new C2222608nI(1099, C2188811AlT.LIZIZ(sbLIZ6));
                                                        }
                                                    } catch (C2222608nI e22) {
                                                        TryCatchGuardChecker.doCheck(e22);
                                                        throw e22;
                                                    }
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C08IQ.LIZ(this.LIZIZ);
                                                    throw th;
                                                }
                                            }
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append("param patch error: ");
                                            sbLIZ7.append(file.getPath());
                                            throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ7));
                                        }
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("param src error: ");
                                        sbLIZ8.append(c0vsj3.getPath());
                                        throw new C2222608nI(LSPassThroughRecordSizeConfig.DEFAULT, C2188811AlT.LIZIZ(sbLIZ8));
                                    }
                                }.LJI(c0vsj, c0vsj2, fileLIZIZ);
                                C0X9L.LIZLLL(parentFile.getAbsolutePath());
                                fileLIZIZ.delete();
                            } else {
                                throw new RuntimeException("read lock timeout");
                            }
                        } catch (Exception e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("merge dir failed: ");
                            sbLIZ3.append(updatePackage);
                            C1553130qWF.LJ("gecko-debug-tag-MergeDir", C2188811AlT.LIZIZ(sbLIZ3), e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            z = zLIZIZ;
                            TryCatchGuardChecker.doCheck(th);
                            if (!z) {
                                C0X9L.LIZLLL(parentFile.getAbsolutePath());
                            }
                            fileLIZIZ.delete();
                            throw th;
                        }
                    }
                    return interfaceC1552320qUw.proceed(pair2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    fileLIZIZ.delete();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new RuntimeException("channel dir is null");
        }
    }
}
