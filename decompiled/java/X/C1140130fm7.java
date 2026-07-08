package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0fm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140130fm7 {
    public static C1140310fmP LIZ;
    public static C1140000flu LIZIZ;
    public static C1140290fmN LIZJ;
    public static C1139190fkb LIZLLL;
    public static C1139880fli LJ;
    public static C1139890flj LJFF;
    public static C1140280fmM LJI;
    public static C1140290fmN LJII;
    public static C1140000flu LJIIIIZZ;
    public static C1140310fmP LJIIIZ;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0flj] */
    public static C1140310fmP LIZ() {
        if (LJFF == null) {
            LJFF = new AbstractC1140540fmm() { // from class: X.0flj
                @Override // X.AbstractC1140540fmm
                public final void LIZ(AbstractC1140580fmq abstractC1140580fmq, C1139900flk c1139900flk) {
                    C1138730fjr c1138730fjr;
                    String str;
                    File[] fileArrListFiles;
                    EnumC1138770fjv enumC1138770fjv;
                    EnumC1138770fjv enumC1138770fjv2;
                    EnumC1138770fjv enumC1138770fjv3;
                    C1138730fjr c1138730fjr2;
                    String str2;
                    File[] fileArrListFiles2;
                    EnumC1138770fjv enumC1138770fjv4;
                    EnumC1138770fjv enumC1138770fjv5;
                    EnumC1138770fjv enumC1138770fjv6;
                    ArrayList arrayList = new ArrayList();
                    C1140890fnL.LIZLLL().getClass();
                    C1138630fjh c1138630fjh = C1138630fjh.LIZ;
                    C0VSJ c0vsj = new C0VSJ(C1142700fqG.LJFF().LIZIZ.LIZ.LIZ());
                    long folderSize = 0;
                    if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles2 = c0vsj.listFiles()) != null) {
                        C089E c089e = new C089E(fileArrListFiles2);
                        while (c089e.hasNext()) {
                            File file = (File) c089e.next();
                            if (c1139900flk != null) {
                                enumC1138770fjv4 = c1139900flk.LIZLLL;
                            } else {
                                enumC1138770fjv4 = null;
                            }
                            if (enumC1138770fjv4 == EnumC1138770fjv.DELETE_UNUSED) {
                                if (System.currentTimeMillis() - file.lastModified() > 864000000) {
                                    folderSize += FileUtils.INSTANCE.getFolderSize(file);
                                    arrayList.add(file.getName());
                                    C08QA.LJIIZILJ(file);
                                }
                            } else {
                                if (c1139900flk != null) {
                                    enumC1138770fjv5 = c1139900flk.LIZLLL;
                                } else {
                                    enumC1138770fjv5 = null;
                                }
                                if (enumC1138770fjv5 == EnumC1138770fjv.DELETE_ALL) {
                                    folderSize += FileUtils.INSTANCE.getFolderSize(file);
                                    arrayList.add(file.getName());
                                    C08QA.LJIIZILJ(file);
                                } else {
                                    if (c1139900flk != null) {
                                        enumC1138770fjv6 = c1139900flk.LIZLLL;
                                    } else {
                                        enumC1138770fjv6 = null;
                                    }
                                    if (enumC1138770fjv6 == EnumC1138770fjv.ONLY_CHECK) {
                                        folderSize += FileUtils.INSTANCE.getFolderSize(file);
                                        arrayList.add(file.getName());
                                    }
                                }
                            }
                        }
                    }
                    C1140890fnL.LIZLLL().getClass();
                    C1138630fjh c1138630fjh2 = C1138630fjh.LIZ;
                    InterfaceC1138850fk3 interfaceC1138850fk3 = C1142700fqG.LJFF().LIZIZ.LIZ;
                    if (interfaceC1138850fk3 instanceof C1138730fjr) {
                        c1138730fjr = (C1138730fjr) interfaceC1138850fk3;
                    } else {
                        c1138730fjr = null;
                    }
                    String str3 = "";
                    if (c1138730fjr == null || (str = c1138730fjr.LIZIZ) == null) {
                        str = "";
                    }
                    if (C1533950q1J.LJ(str)) {
                        C1140890fnL.LIZLLL().getClass();
                        InterfaceC1138850fk3 interfaceC1138850fk32 = C1142700fqG.LJFF().LIZIZ.LIZ;
                        if ((interfaceC1138850fk32 instanceof C1138730fjr) && (c1138730fjr2 = (C1138730fjr) interfaceC1138850fk32) != null && (str2 = c1138730fjr2.LIZIZ) != null) {
                            str3 = str2;
                        }
                        C0VSJ c0vsj2 = new C0VSJ(str3);
                        if (c0vsj2.exists() && c0vsj2.isDirectory() && (fileArrListFiles = c0vsj2.listFiles()) != null) {
                            C089E c089e2 = new C089E(fileArrListFiles);
                            while (c089e2.hasNext()) {
                                File file2 = (File) c089e2.next();
                                if (c1139900flk != null) {
                                    enumC1138770fjv = c1139900flk.LIZLLL;
                                } else {
                                    enumC1138770fjv = null;
                                }
                                if (enumC1138770fjv == EnumC1138770fjv.DELETE_UNUSED) {
                                    if (System.currentTimeMillis() - file2.lastModified() > 864000000) {
                                        folderSize += FileUtils.INSTANCE.getFolderSize(file2);
                                        arrayList.add(file2.getName());
                                        C08QA.LJIIZILJ(file2);
                                    }
                                } else {
                                    if (c1139900flk != null) {
                                        enumC1138770fjv2 = c1139900flk.LIZLLL;
                                    } else {
                                        enumC1138770fjv2 = null;
                                    }
                                    if (enumC1138770fjv2 == EnumC1138770fjv.DELETE_ALL) {
                                        folderSize += FileUtils.INSTANCE.getFolderSize(file2);
                                        arrayList.add(file2.getName());
                                        C08QA.LJIIZILJ(file2);
                                    } else {
                                        if (c1139900flk != null) {
                                            enumC1138770fjv3 = c1139900flk.LIZLLL;
                                        } else {
                                            enumC1138770fjv3 = null;
                                        }
                                        if (enumC1138770fjv3 == EnumC1138770fjv.ONLY_CHECK) {
                                            folderSize += FileUtils.INSTANCE.getFolderSize(file2);
                                            arrayList.add(file2.getName());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c1139900flk != null) {
                        c1139900flk.LJIILIIL = arrayList;
                        c1139900flk.LJIIL = folderSize;
                    }
                    abstractC1140580fmq.LIZ(c1139900flk);
                }
            };
        }
        C1139890flj c1139890flj = LJFF;
        if (LJII == null) {
            LJII = new C1140290fmN(c1139890flj);
        }
        C1140290fmN c1140290fmN = LJII;
        if (LJIIIIZZ == null) {
            LJIIIIZZ = new C1140000flu(c1140290fmN);
        }
        C1140000flu c1140000flu = LJIIIIZZ;
        if (LJIIIZ == null) {
            LJIIIZ = new C1140310fmP(c1140000flu);
        }
        return LJIIIZ;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0fkb] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0fmM] */
    public static C1140280fmM LIZIZ() {
        if (LIZLLL == null) {
            LIZLLL = new AbstractC1140540fmm() { // from class: X.0fkb
                /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r6 r8 r9
                  0x0025: PHI (r6v0 java.util.Map<java.lang.String, java.lang.String>) = (r6v3 java.util.Map<java.lang.String, java.lang.String>), (r6v4 java.util.Map<java.lang.String, java.lang.String>) binds: [B:10:0x0023, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
                  0x0025: PHI (r8v1 int) = (r8v7 int), (r8v8 int) binds: [B:10:0x0023, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
                  0x0025: PHI (r9v1 java.lang.Integer) = (r9v14 java.lang.Integer), (r9v15 java.lang.Integer) binds: [B:10:0x0023, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[PHI: r6 r8 r9
                  0x0029: PHI (r6v2 java.util.Map<java.lang.String, java.lang.String>) = (r6v0 java.util.Map<java.lang.String, java.lang.String>), (r6v3 java.util.Map<java.lang.String, java.lang.String>) binds: [B:12:0x0027, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x0029: PHI (r8v6 int) = (r8v1 int), (r8v7 int) binds: [B:12:0x0027, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x0029: PHI (r9v13 java.lang.Integer) = (r9v1 java.lang.Integer), (r9v14 java.lang.Integer) binds: [B:12:0x0027, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
                /* JADX WARN: Type inference failed for: r10v0, types: [X.0fk2, X.0fls] */
                @Override // X.AbstractC1140540fmm
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(final X.AbstractC1140580fmq r20, final X.C1139900flk r21) {
                    /*
                        Method dump skipped, instruction units count: 599
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1139190fkb.LIZ(X.0fmq, X.0flk):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0037 A[PHI: r5 r10
                  0x0037: PHI (r5v5 long) = (r5v2 long), (r5v6 long) binds: [B:41:0x0068, B:26:0x0036] A[DONT_GENERATE, DONT_INLINE]
                  0x0037: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:41:0x0068, B:26:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[PHI: r5 r10
                  0x0041: PHI (r5v4 long) = (r5v2 long), (r5v5 long) binds: [B:41:0x0068, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]
                  0x0041: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:41:0x0068, B:30:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[PHI: r5
                  0x0068: PHI (r5v2 long) = (r5v0 long), (r5v6 long), (r5v6 long), (r5v7 long) binds: [B:40:0x0066, B:23:0x0030, B:25:0x0034, B:21:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static void LIZIZ(com.bytedance.android.livesdk.gift.assets.AssetsModel r16, final X.C1139230fkf r17, final int r18, final java.lang.String r19, final java.util.Map r20) {
                    /*
                        r4 = r17
                        if (r4 == 0) goto L6d
                        long r7 = r4.LIZLLL
                    L6:
                        r1 = r16
                        if (r1 == 0) goto L6b
                        int r14 = r1.resourceType
                    Lc:
                        java.lang.String r10 = ""
                        if (r1 == 0) goto L27
                        com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r1.resourceModel
                        if (r0 == 0) goto L27
                        java.util.List<java.lang.String> r2 = r0.urlList
                        if (r2 == 0) goto L27
                        r0 = 0
                        java.lang.String[] r0 = new java.lang.String[r0]
                        java.lang.Object[] r0 = r2.toArray(r0)
                        if (r0 == 0) goto L27
                        java.lang.String r11 = java.util.Arrays.toString(r0)
                        if (r11 != 0) goto L28
                    L27:
                        r11 = r10
                    L28:
                        if (r4 == 0) goto L61
                        long r5 = r4.LIZIZ
                        if (r1 == 0) goto L68
                    L2e:
                        com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r1.resourceByteVC1Model
                        if (r0 == 0) goto L68
                        java.lang.String r0 = r0.uri
                        if (r0 == 0) goto L68
                        r10 = r0
                    L37:
                        if (r4 == 0) goto L5f
                        java.lang.String r0 = r4.LJ
                    L3b:
                        java.lang.String r9 = r1.getResourceFormat(r0)
                        if (r9 != 0) goto L43
                    L41:
                        java.lang.String r9 = "unknown"
                    L43:
                        if (r1 == 0) goto L5c
                        long r15 = r1.size
                    L47:
                        android.os.Handler r2 = X.C473410IhP.LIZ()
                        X.0fkg r3 = new X.0fkg
                        r17 = r20
                        r13 = r19
                        r12 = r18
                        r3.<init>()
                        r0 = 100
                        X.C786410Ut5.LJLIIL(r0, r2, r3)
                        return
                    L5c:
                        r15 = 0
                        goto L47
                    L5f:
                        r0 = 0
                        goto L3b
                    L61:
                        if (r1 == 0) goto L66
                        long r5 = r1.id
                        goto L2e
                    L66:
                        r5 = 0
                    L68:
                        if (r1 == 0) goto L41
                        goto L37
                    L6b:
                        r14 = -1
                        goto Lc
                    L6d:
                        r7 = -1
                        goto L6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1139190fkb.LIZIZ(com.bytedance.android.livesdk.gift.assets.AssetsModel, X.0fkf, int, java.lang.String, java.util.Map):void");
                }
            };
        }
        C1139190fkb c1139190fkb = LIZLLL;
        if (LJ == null) {
            LJ = new C1139880fli(c1139190fkb);
        }
        C1139880fli c1139880fli = LJ;
        if (LIZJ == null) {
            LIZJ = new C1140290fmN(c1139880fli);
        }
        C1140290fmN c1140290fmN = LIZJ;
        if (LIZIZ == null) {
            LIZIZ = new C1140000flu(c1140290fmN);
        }
        C1140000flu c1140000flu = LIZIZ;
        if (LIZ == null) {
            LIZ = new C1140310fmP(c1140000flu);
        }
        final C1140310fmP c1140310fmP = LIZ;
        if (LJI == null) {
            LJI = new AbstractC1140540fmm(c1140310fmP) { // from class: X.0fmM
                @Override // X.AbstractC1140540fmm
                public final void LIZ(AbstractC1140580fmq abstractC1140580fmq, C1139900flk c1139900flk) {
                    AbstractC1140540fmm abstractC1140540fmm = this.LIZ;
                    if (abstractC1140540fmm != null) {
                        abstractC1140540fmm.LIZ(new AbstractC1140580fmq(abstractC1140580fmq) { // from class: X.0flr
                            @Override // X.AbstractC1140580fmq
                            public final void LIZ(C1139900flk c1139900flk2) {
                                InterfaceC1138820fk0 interfaceC1138820fk0;
                                if (c1139900flk2 != null && (interfaceC1138820fk0 = c1139900flk2.LJFF) != null) {
                                    if (c1139900flk2.LJI) {
                                        interfaceC1138820fk0.LIZJ(c1139900flk2.LJIIJ, c1139900flk2.LJIIIZ);
                                    } else {
                                        EnumC1140010flv enumC1140010flv = c1139900flk2.LJIIIIZZ;
                                        if (enumC1140010flv == EnumC1140010flv.ERROR) {
                                            interfaceC1138820fk0.onFailed(c1139900flk2.LJIIJJI);
                                        } else if (c1139900flk2.LJII) {
                                            interfaceC1138820fk0.onFailed(new Throwable("The request was timeout"));
                                        } else if (enumC1140010flv == EnumC1140010flv.CANCEL) {
                                            interfaceC1138820fk0.LIZ(c1139900flk2.LJIIJ);
                                        }
                                    }
                                }
                                AbstractC1140580fmq abstractC1140580fmq2 = this.LIZ;
                                if (abstractC1140580fmq2 != null) {
                                    abstractC1140580fmq2.LIZ(c1139900flk2);
                                }
                            }
                        }, c1139900flk);
                    }
                }
            };
        }
        return LJI;
    }
}
