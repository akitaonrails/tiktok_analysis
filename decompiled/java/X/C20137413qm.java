package X;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.util.LruCache;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.13qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20137413qm {
    public static final C20137413qm LIZ = new C20137413qm();
    public static final LruCache<String, C1452610nu7> LIZIZ = new LruCache<>(500);
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[][] LJ;

    static {
        new LruCache(500);
        LIZJ = new byte[]{82, 73, 70, 70};
        LIZLLL = new byte[]{87, 69, 66, 80};
        LJ = new byte[][]{new byte[]{-1, -40}, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10}, new byte[]{71, 73, 70, 56, 55, 97}, new byte[]{71, 73, 70, 56, 57, 97}, new byte[]{66, 77}, new byte[]{0, 0, 0, 24, 102, 116, 121, 112, 104, 101, 105, 99}};
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public static boolean LIZJ(java.lang.String r10) {
        /*
            java.lang.String r4 = "MediaUtil"
            X.08Pn r0 = X.C2112908Pn.LIZ
            boolean r0 = X.C2112908Pn.LIZ(r10)
            r3 = 0
            if (r0 != 0) goto Lc
            return r3
        Lc:
            r6 = 12
            byte[] r8 = new byte[r6]     // Catch: java.lang.Exception -> L94
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Exception -> L94
            r5.<init>(r10)     // Catch: java.lang.Exception -> L94
            r2 = 0
            r5.read(r8)     // Catch: java.lang.Throwable -> L81
            X.C2107108Nh.LIZ(r5, r2)     // Catch: java.lang.Exception -> L94
            byte[] r1 = X.C20137413qm.LIZJ     // Catch: java.lang.Exception -> L94
            r0 = 4
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r3, r0)     // Catch: java.lang.Exception -> L94
            byte[] r0 = X.C13LQ.LJJLI(r8, r0)     // Catch: java.lang.Exception -> L94
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch: java.lang.Exception -> L94
            r9 = 1
            if (r0 == 0) goto L41
            byte[] r1 = X.C20137413qm.LIZLLL     // Catch: java.lang.Exception -> L94
            r0 = 8
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r0, r6)     // Catch: java.lang.Exception -> L94
            byte[] r0 = X.C13LQ.LJJLI(r8, r0)     // Catch: java.lang.Exception -> L94
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L41
            return r9
        L41:
            byte[][] r7 = X.C20137413qm.LJ     // Catch: java.lang.Exception -> L94
            int r6 = r7.length     // Catch: java.lang.Exception -> L94
            r5 = 0
        L45:
            if (r5 >= r6) goto L60
            r2 = r7[r5]     // Catch: java.lang.Exception -> L94
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange     // Catch: java.lang.Exception -> L94
            int r0 = r2.length     // Catch: java.lang.Exception -> L94
            int r0 = r0 + (-1)
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L94
            byte[] r0 = X.C13LQ.LJJLI(r8, r1)     // Catch: java.lang.Exception -> L94
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L5c
            goto L5f
        L5c:
            int r5 = r5 + 1
            goto L45
        L5f:
            return r9
        L60:
            java.lang.String r1 = " "
            r0 = 348(0x15c, float:4.88E-43)
            kotlin.jvm.internal.AFwS274S0000000_30 r0 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r0)     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = X.C13LQ.LJJIJIL(r8, r1, r0)     // Catch: java.lang.Exception -> L94
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L94
            r1.<init>()     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = "file header: "
            r1.append(r0)     // Catch: java.lang.Exception -> L94
            r1.append(r2)     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L94
            X.C355090Dw3.LIZIZ(r4, r0)     // Catch: java.lang.Exception -> L94
            return r3
        L81:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L89
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            r2 = r1
            goto L8a
        L89:
            r0 = move-exception
        L8a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r0 = move-exception
            goto L8a
        L90:
            X.C2107108Nh.LIZ(r5, r2)     // Catch: java.lang.Exception -> L94
            throw r0     // Catch: java.lang.Exception -> L94
        L94:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isImage "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " error "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C355090Dw3.LIZLLL(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20137413qm.LIZJ(java.lang.String):boolean");
    }

    public final synchronized C1452610nu7 LIZ(String str) {
        C20137413qm c20137413qm;
        C1452610nu7 c1452610nu7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        try {
            c1452610nu7 = LIZIZ.get(str);
            if (c1452610nu7 == null) {
                if (LIZJ(str)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    int iLIZ = C383690F2p.LIZ(str);
                    Size size = new Size(options.outWidth, options.outHeight);
                    c1452610nu7 = new C1452610nu7(str, size.getWidth(), size.getHeight(), iLIZ, C538540LAe.LLJJJIL, 0, 0, "image", 1504);
                } else {
                    int[] iArr = new int[11];
                    int videoFileInfo = VEUtils.getVideoFileInfo(str, iArr);
                    if (videoFileInfo == 0 && iArr[0] > 0 && iArr[1] > 0 && iArr[10] > 0) {
                        int i7 = iArr[0];
                        int i8 = iArr[1];
                        int i9 = iArr[2];
                        int i10 = iArr[10];
                        int i11 = iArr[6];
                        int i12 = iArr[7];
                        int i13 = iArr[8];
                        c1452610nu7 = new C1452610nu7(str, i7, i8, i9, i10, i11, i12, i13, iArr[3], VEUtils.getVideoEncodeTypeByID(i13), iArr[9]);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VEUtils.getVideoFileInfo ");
                        sbLIZ.append(str);
                        sbLIZ.append(": ");
                        sbLIZ.append(videoFileInfo);
                        C355090Dw3.LIZLLL("MediaUtil", C2188811AlT.LIZIZ(sbLIZ));
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever.setDataSource(str);
                                String strLJII = C20144413ru.LJII(mediaMetadataRetriever);
                                if (strLJII != null) {
                                    i = Integer.parseInt(strLJII);
                                } else {
                                    i = 0;
                                }
                                String strLJFF = C20144413ru.LJFF(mediaMetadataRetriever);
                                if (strLJFF != null) {
                                    i2 = Integer.parseInt(strLJFF);
                                } else {
                                    i2 = 0;
                                }
                                String strLJI = C20144413ru.LJI(mediaMetadataRetriever);
                                if (strLJI != null) {
                                    i3 = Integer.parseInt(strLJI);
                                } else {
                                    i3 = 0;
                                }
                                String strLIZJ = C20144413ru.LIZJ(mediaMetadataRetriever);
                                if (strLIZJ != null) {
                                    i4 = Integer.parseInt(strLIZJ);
                                } else {
                                    i4 = 0;
                                }
                                String strLIZ = C20144413ru.LIZ(mediaMetadataRetriever);
                                if (strLIZ != null) {
                                    i5 = Integer.parseInt(strLIZ);
                                } else {
                                    i5 = 0;
                                }
                                String strLIZIZ = C20144413ru.LIZIZ(mediaMetadataRetriever);
                                if (strLIZIZ != null) {
                                    i6 = Integer.parseInt(strLIZIZ);
                                } else {
                                    i6 = 0;
                                }
                                String strLJ = C20144413ru.LJ(mediaMetadataRetriever);
                                if (strLJ == null) {
                                    strLJ = "unknown";
                                }
                                c1452610nu7 = new C1452610nu7(str, i, i2, i3, i4, i5, i6, strLJ, 1408);
                            } catch (Throwable th) {
                                th = th;
                                c20137413qm = this;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            mediaMetadataRetriever.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("MediaMetadataRetriever ");
                            sbLIZ2.append(str);
                            sbLIZ2.append("   ");
                            sbLIZ2.append(e);
                            C355090Dw3.LIZLLL("MediaUtil", C2188811AlT.LIZIZ(sbLIZ2));
                            c1452610nu7 = new C1452610nu7(str, 0, 0, 0, 0, 0, 0, null, 2016);
                        }
                        mediaMetadataRetriever.release();
                    }
                }
                LIZIZ.put(str, c1452610nu7);
            }
        } catch (Throwable th4) {
            th = th4;
            c20137413qm = this;
        }
        return c1452610nu7;
    }

    public final Size LIZIZ(int i, String str) {
        int i2;
        int i3 = 0;
        try {
            C1452610nu7 c1452610nu7LIZ = LIZ(str);
            i2 = c1452610nu7LIZ.LIZ;
            try {
                i3 = c1452610nu7LIZ.LIZIZ;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MediaMetadataRetriever exception ");
                sbLIZ.append(e);
                C355090Dw3.LIZLLL("MediaUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e2) {
            e = e2;
            i2 = 0;
        }
        if (i2 > i3) {
            return new Size(-1, i);
        }
        return new Size(i, -1);
    }
}
