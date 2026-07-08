package X;

import android.graphics.Bitmap;
import com.bytedance.bmf_mods_api.VideoSuperResolutionAPI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0kgh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328970kgh implements InterfaceC1328980kgi {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static VideoSuperResolutionAPI LIZJ;
    public static InterfaceC1330010kiN LIZLLL;
    public static int LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static String LJIIJJI;
    public static int LJIILJJIL;
    public static int LJIILL;
    public static final ReadWriteLock LJ = new ReentrantReadWriteLock();
    public static final byte[] LJFF = new byte[0];
    public static int LJIIIZ = 1440;
    public static int LJIIJ = 1440;
    public static boolean LJIIL = false;
    public static int LJIILIIL = 4;

    @Override // X.InterfaceC1328980kgi
    public final String getSRType() {
        return "BMFSR";
    }

    public C1328970kgh() {
        LJI = 7;
        LJIIIIZZ = 3;
        LJII = 32768;
    }

    public static Object LIZ(int i) {
        String str;
        if (i == 0) {
            str = "com.bytedance.bmf_mods.";
        } else {
            str = "com.bytedance.bmf_mods_lite.";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("VideoSuperResolution");
        return Class.forName(C2188811AlT.LIZIZ(sbLIZ)).newInstance();
    }

    public static String LIZIZ(int i) {
        String str;
        String str2;
        String strLIZIZ;
        int iInit;
        String strLIZIZ2;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) LJ;
        reentrantReadWriteLock.readLock().lock();
        if (i == 0 && LIZ) {
            reentrantReadWriteLock.readLock().unlock();
            return "success";
        }
        boolean z = true;
        if (i == 1 && LIZIZ) {
            reentrantReadWriteLock.readLock().unlock();
            return "success";
        }
        reentrantReadWriteLock.readLock().unlock();
        reentrantReadWriteLock.writeLock().lock();
        String str3 = "SuperResolutionLiteApi";
        String str4 = "VideoSuperResolutionAPI";
        try {
            if (i == 0) {
                LIZJ = (VideoSuperResolutionAPI) LIZ(i);
            } else {
                LIZLLL = (InterfaceC1330010kiN) LIZ(i);
            }
            strLIZIZ = "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (i != 0) {
                str = "SuperResolutionLiteApi";
            } else {
                str = "VideoSuperResolutionAPI";
            }
            sbLIZ.append(str);
            sbLIZ.append(" class not found, ");
            sbLIZ.append(e.getMessage());
            C1328570kg3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            if (i != 0) {
                str2 = "SuperResolutionLiteApi";
            } else {
                str2 = "VideoSuperResolutionAPI";
            }
            sbLIZ2.append(str2);
            sbLIZ2.append(" class not found, ");
            sbLIZ2.append(e.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (i == 0) {
            if (LIZJ == null) {
                C1328570kg3.LJIIIZ("VideoSuperResolutionAPI is null after initialization");
                String str5 = strLIZIZ + "VideoSuperResolutionAPI is null after initialization";
                ((ReentrantReadWriteLock) LJ).writeLock().unlock();
                return str5;
            }
        } else if (LIZLLL == null) {
            C1328570kg3.LJIIIZ("SuperResolutionLiteApi is null after initialization");
            String str6 = strLIZIZ + "SuperResolutionLiteApi is null after initialization";
            ((ReentrantReadWriteLock) LJ).writeLock().unlock();
            return str6;
        }
        if (i == 0) {
            iInit = LIZJ.Init(LJI, LJIIIIZZ, LJII, 6, "", "", LJIIJJI, LJIIIZ, LJIIJ, 1);
            if (iInit != 0) {
                z = false;
            }
            LIZ = z;
        } else {
            iInit = LIZLLL.Init(4, LJIIIIZZ, LJII, 6, "", "", LJIIJJI, LJIIIZ, LJIIJ, 1);
            if (iInit != 0) {
                z = false;
            }
            LIZIZ = z;
        }
        if (iInit == 0) {
            if (i != 0) {
                str4 = "SuperResolutionLiteApi initialization success";
            }
            C1328570kg3.LJIIIZ(str4);
        } else {
            if (i == 0) {
                strLIZIZ2 = "VideoSuperResolutionAPI";
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SuperResolutionLiteApi initialization error, res = ");
                sbLIZ3.append(iInit);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            C1328570kg3.LJFF("BMFSR", strLIZIZ2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            if (i == 0) {
                str3 = "VideoSuperResolutionAPI";
            }
            sbLIZ4.append(str3);
            sbLIZ4.append(" initialization error, res = ");
            sbLIZ4.append(iInit);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        ((ReentrantReadWriteLock) LJ).writeLock().unlock();
        if (i == 0) {
            if (LIZ) {
                return "success";
            }
        } else if (LIZIZ) {
            return "success";
        }
        return strLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kkD] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1328980kgi
    public final C1323050kX9<Bitmap> processMultiScaleBitmap(int i, Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf, final int i2) throws Exception {
        InterfaceC1330010kiN interfaceC1330010kiN = LIZLLL;
        if (interfaceC1330010kiN == null || i2 == -1) {
            return null;
        }
        if (LJIIL && interfaceC1330010kiN.GetQueuingTaskNum() > LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Do not do SRProcess because the current number of sr tasks:");
            sbLIZ.append(LIZJ.GetQueuingTaskNum());
            sbLIZ.append(", mQueuingTaskNum:");
            sbLIZ.append(LJIILIIL);
            throw new C1330300kiq(-200000, C2188811AlT.LIZIZ(sbLIZ));
        }
        ?? r1 = new Object(i2) { // from class: X.0kkD
            public final int LIZ;

            {
                this.LIZ = i2;
            }
        };
        if ((i & 2) > 0) {
            Bitmap bitmapProcessMultiScaleBitmap = LIZLLL.ProcessMultiScaleBitmap(bitmap, i, r1, null);
            if (bitmapProcessMultiScaleBitmap != null) {
                return C1323050kX9.LJJIZ(bitmapProcessMultiScaleBitmap, C1323090kXD.LIZIZ());
            }
            throw new Exception("ProcessMultiScaleBitmap2 result is null!");
        }
        Bitmap bitmapProcessMultiScaleBitmap2 = LIZLLL.ProcessMultiScaleBitmap(bitmap, i, r1, null);
        if (bitmapProcessMultiScaleBitmap2 != null) {
            return abstractC1301670jyf.LIZJ(bitmapProcessMultiScaleBitmap2);
        }
        throw new Exception("ProcessMultiScaleBitmap2 result is null!");
    }

    public static void LIZJ(int i, int i2, int i3, String str, int i4) {
        int i5;
        boolean z;
        C1330270kin.LIZ = i;
        C1330270kin.LJ = str;
        if (i3 <= 0) {
            i3 = 1440;
        }
        LJIIIZ = i3;
        if (i4 <= 0) {
            i4 = 1440;
        }
        LJIIJ = i4;
        C1330270kin.LIZIZ = i3;
        C1330270kin.LIZJ = i4;
        LJIIJJI = str;
        boolean z2 = true;
        if (i == 1) {
            i5 = 4;
        } else {
            i5 = 7;
        }
        LJI = i5;
        LJIIIIZZ = 3;
        LJII = 32768;
        LJIIL = false;
        LJIILIIL = 4;
        LJIILJJIL = i;
        LJIILL = i2;
        if (i == 1) {
            if ((i2 & 1) > 0) {
                z = true;
            } else {
                z = false;
            }
            C1328730kgJ.LJJ = z;
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            C1328730kgJ.LJ = z2;
        }
        LIZIZ(i);
    }

    @Override // X.InterfaceC1328980kgi
    public final C1323050kX9<Bitmap> processMultiScaleBitmap(boolean z, Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf, int i, int i2) throws Exception {
        C1323050kX9<Bitmap> c1323050kX9LIZJ;
        VideoSuperResolutionAPI videoSuperResolutionAPI = LIZJ;
        if (videoSuperResolutionAPI != null && i2 != -1) {
            if (z) {
                if (LJIIL && videoSuperResolutionAPI.GetQueuingTaskNum() > LJIILIIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Do not do SRProcess because the current number of sr tasks:");
                    sbLIZ.append(LIZJ.GetQueuingTaskNum());
                    sbLIZ.append(", mQueuingTaskNum:");
                    sbLIZ.append(LJIILIIL);
                    throw new C1330300kiq(-200000, C2188811AlT.LIZIZ(sbLIZ));
                }
                Bitmap bitmapProcessMultiScaleBitmap = LIZJ.ProcessMultiScaleBitmap(bitmap, i, i2);
                if (bitmapProcessMultiScaleBitmap != null) {
                    return abstractC1301670jyf.LIZJ(bitmapProcessMultiScaleBitmap);
                }
                throw new Exception("ProcessMultiScaleBitmap result is null!");
            }
            synchronized (LJFF) {
                try {
                    Bitmap bitmapProcessMultiScaleBitmap2 = LIZJ.ProcessMultiScaleBitmap(bitmap, i, i2);
                    if (bitmapProcessMultiScaleBitmap2 != null) {
                        c1323050kX9LIZJ = abstractC1301670jyf.LIZJ(bitmapProcessMultiScaleBitmap2);
                    } else {
                        throw new Exception("ProcessMultiScaleBitmap result is null!");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1323050kX9LIZJ;
        }
        return null;
    }
}
