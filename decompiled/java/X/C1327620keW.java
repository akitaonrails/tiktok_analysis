package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0keW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327620keW {
    public final ContentResolver LIZ;
    public final C1327640keY LIZIZ;
    public InterfaceC1328710kgH LIZJ;
    public final boolean LIZLLL;
    public final C1325570kbD LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC1327160kdm LJIIIZ;
    public C1327850ket LJIIJ;
    public C1327350ke5 LJIIJJI;
    public C1327350ke5 LJIIL;
    public C1327350ke5 LJIILIIL;
    public C1327860keu LJIILJJIL;
    public C1327860keu LJIILL;
    public C1327890kex LJIILLIIL;
    public C1327890kex LJIIZILJ;
    public InterfaceC1327390ke9<C1328480kfu> LJIJ;
    public C1327860keu LJIJI;
    public C1327850ket LJIJJ;
    public C1327850ket LJIJJLI;
    public C1327850ket LJIL;
    public C1327850ket LJJ;
    public C1327850ket LJJI;
    public C1327850ket LJJIFFI;
    public C1327850ket LJJII;
    public C1327850ket LJJIII;
    public C1327850ket LJJIIJ;
    public final Map<InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>, InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>> LJJIIJZLJL = new HashMap();
    public final Map<InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>, InterfaceC1327390ke9<Void>> LJJIIZ = new HashMap();
    public final Map<InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>, InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>> LJJIIZI = new HashMap();
    public final boolean LJ = false;

    public final synchronized InterfaceC1327390ke9<C1328480kfu> LIZ() {
        C1336010ks3.LIZIZ();
        if (this.LJIILIIL == null) {
            C1336010ks3.LIZIZ();
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            C1327680kec c1327680kecLJJIIZ = LJJIIZ(new C1327190kdp(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ, c1327640keY.LIZ));
            C1327640keY c1327640keY2 = this.LIZIZ;
            C1325570kbD c1325570kbD = this.LJFF;
            c1327640keY2.getClass();
            this.LJIILIIL = new C1327350ke5(c1327680kecLJJIIZ, c1325570kbD);
            C1336010ks3.LIZIZ();
        }
        C1336010ks3.LIZIZ();
        return this.LJIILIIL;
    }

    public final synchronized InterfaceC1327390ke9<C1328480kfu> LIZIZ() {
        C1336010ks3.LIZIZ();
        if (this.LJIIJJI == null) {
            C1336010ks3.LIZIZ();
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            C1327680kec c1327680kecLJJIIZ = LJJIIZ(new C1327240kdu(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ));
            C1327640keY c1327640keY2 = this.LIZIZ;
            C1325570kbD c1325570kbD = this.LJFF;
            c1327640keY2.getClass();
            this.LJIIJJI = new C1327350ke5(c1327680kecLJJIIZ, c1325570kbD);
            C1336010ks3.LIZIZ();
        }
        C1336010ks3.LIZIZ();
        return this.LJIIJJI;
    }

    public final synchronized InterfaceC1327390ke9<C1328480kfu> LIZJ() {
        C1336010ks3.LIZIZ();
        if (this.LJIIL == null) {
            C1336010ks3.LIZIZ();
            C1327640keY c1327640keY = this.LIZIZ;
            InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9LJFF = LJFF();
            C1325570kbD c1325570kbD = this.LJFF;
            c1327640keY.getClass();
            this.LJIIL = new C1327350ke5(interfaceC1327390ke9LJFF, c1325570kbD);
            C1336010ks3.LIZIZ();
        }
        C1336010ks3.LIZIZ();
        return this.LJIIL;
    }

    public final synchronized InterfaceC1327390ke9<C1328480kfu> LJFF() {
        C1336010ks3.LIZIZ();
        if (this.LJIJ == null) {
            C1336010ks3.LIZIZ();
            C1327640keY c1327640keY = this.LIZIZ;
            InterfaceC1328710kgH interfaceC1328710kgH = this.LIZJ;
            c1327640keY.getClass();
            C1327970kf5 c1327970kf5 = new C1327970kf5(LJJIIZ(new C1328500kfw(c1327640keY.LJIIJ, c1327640keY.LIZLLL, interfaceC1328710kgH)));
            this.LJIJ = c1327970kf5;
            this.LJIJ = this.LIZIZ.LIZ(c1327970kf5, this.LIZLLL && !this.LJI, this.LJIIIZ);
            C1336010ks3.LIZIZ();
        }
        C1336010ks3.LIZIZ();
        return this.LJIJ;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJI() {
        if (this.LJJIII == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            final InterfaceC1327440keE interfaceC1327440keE = c1327640keY.LJIIJ;
            AbstractC1327410keB abstractC1327410keB = new AbstractC1327410keB(interfaceC1327440keE) { // from class: X.0kdq
                @Override // X.AbstractC1327410keB
                public final String LJ() {
                    return "DataFetchProducer";
                }

                {
                    C822700WPc c822700WPc = C822700WPc.LL;
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
                @Override // X.AbstractC1327410keB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C1328480kfu LIZLLL(X.C1325710kbR r7) {
                    /*
                        r6 = this;
                        android.net.Uri r0 = r7.LIZIZ
                        java.lang.String r5 = r0.toString()
                        r0 = 5
                        r4 = 0
                        java.lang.String r1 = r5.substring(r4, r0)
                        java.lang.String r0 = "data:"
                        boolean r0 = r1.equals(r0)
                        X.C1322350kW1.LIZIZ(r0)
                        r0 = 44
                        int r2 = r5.indexOf(r0)
                        int r1 = r2 + 1
                        int r0 = r5.length()
                        java.lang.String r3 = r5.substring(r1, r0)
                        java.lang.String r2 = r5.substring(r4, r2)
                        java.lang.String r1 = ";"
                        boolean r0 = r2.contains(r1)
                        if (r0 == 0) goto L51
                        java.lang.String[] r1 = r2.split(r1)
                        int r0 = r1.length
                        int r0 = r0 + (-1)
                        r1 = r1[r0]
                        java.lang.String r0 = "base64"
                        boolean r0 = r1.equals(r0)
                        if (r0 == 0) goto L51
                        byte[] r0 = android.util.Base64.decode(r3, r4)
                    L46:
                        java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                        r1.<init>(r0)
                        int r0 = r0.length
                        X.0kfu r0 = r6.LIZJ(r1, r0)
                        return r0
                    L51:
                        java.lang.String r0 = android.net.Uri.decode(r3)
                        byte[] r0 = r0.getBytes()
                        goto L46
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1327200kdq.LIZLLL(X.0kbR):X.0kfu");
                }
            };
            boolean z = C1328690kgF.LIZ;
            this.LJJIII = LJJII(this.LIZIZ.LIZ(new C1327970kf5(abstractC1327410keB), true, this.LJIIIZ));
        }
        return this.LJJIII;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIIIZ() {
        if (this.LJIJJLI == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            this.LJIJJLI = LJJIII(new C1327240kdu(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ));
        }
        return this.LJIJJLI;
    }

    public final synchronized InterfaceC1327390ke9 LJIIJ() {
        if (this.LJIL == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            this.LJIL = LJJIII(new C1327190kdp(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ, c1327640keY.LIZ));
        }
        return this.LJIL;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIILIIL() {
        if (this.LJJII == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            final Executor executorLJ = c1327640keY.LJIIIZ.LJ();
            final InterfaceC1327440keE interfaceC1327440keE = c1327640keY.LJIIJ;
            final AssetManager assetManager = c1327640keY.LIZJ;
            this.LJJII = LJJIIJ(new AbstractC1327410keB(executorLJ, interfaceC1327440keE, assetManager) { // from class: X.0kds
                public final AssetManager LIZJ;

                @Override // X.AbstractC1327410keB
                public final String LJ() {
                    return "LocalAssetFetchProducer";
                }

                @Override // X.AbstractC1327410keB
                public final C1328480kfu LIZLLL(C1325710kbR c1325710kbR) throws IOException {
                    int length;
                    InputStream inputStreamOpen = this.LIZJ.open(c1325710kbR.LIZIZ.getPath().substring(1), 2);
                    AssetFileDescriptor assetFileDescriptorOpenFd = null;
                    try {
                        try {
                            assetFileDescriptorOpenFd = this.LIZJ.openFd(c1325710kbR.LIZIZ.getPath().substring(1));
                            length = (int) assetFileDescriptorOpenFd.getLength();
                            try {
                                assetFileDescriptorOpenFd.close();
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                    throw th;
                                } catch (IOException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        if (assetFileDescriptorOpenFd != null) {
                            try {
                                assetFileDescriptorOpenFd.close();
                            } catch (IOException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                            }
                        }
                        length = -1;
                    }
                    return LIZJ(inputStreamOpen, length);
                }

                {
                    this.LIZJ = assetManager;
                }
            });
        }
        return this.LJJII;
    }

    public final InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> LJIILJJIL() {
        synchronized (this) {
            try {
                C1336010ks3.LIZIZ();
                if (this.LJIJI == null) {
                    C1336010ks3.LIZIZ();
                    this.LJIJI = new C1327860keu(LIZ());
                    C1336010ks3.LIZIZ();
                }
                C1336010ks3.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LJIJI;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIILL() {
        if (this.LJJI == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            C1327190kdp c1327190kdp = new C1327190kdp(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ, c1327640keY.LIZ);
            C1327640keY c1327640keY2 = this.LIZIZ;
            c1327640keY2.getClass();
            C1327640keY c1327640keY3 = this.LIZIZ;
            c1327640keY3.getClass();
            this.LJJI = LJJIIJZLJL(c1327190kdp, new InterfaceC1327290kdz[]{new C1327260kdw(c1327640keY2.LJIIIZ.LJ(), c1327640keY2.LJIIJ, c1327640keY2.LIZ), new C1327360ke6(c1327640keY3.LJIIIZ.LJ(), c1327640keY3.LJIIJ, c1327640keY3.LIZ)});
        }
        return this.LJJI;
    }

    public final synchronized C1327850ket LJIILLIIL() {
        C1327640keY c1327640keY;
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("Unreachable exception. Just to make linter happy");
        }
        c1327640keY = this.LIZIZ;
        c1327640keY.getClass();
        return LJJIFFI(new C1327510keL(c1327640keY.LJIIIZ.LIZ(), c1327640keY.LIZ));
    }

    public final InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> LJIIZILJ() {
        synchronized (this) {
            try {
                C1336010ks3.LIZIZ();
                if (this.LJIILJJIL == null) {
                    C1336010ks3.LIZIZ();
                    this.LJIILJJIL = new C1327860keu(LIZIZ());
                    C1336010ks3.LIZIZ();
                }
                C1336010ks3.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LJIILJJIL;
    }

    public final synchronized InterfaceC1327390ke9<Void> LJIJ() {
        C1336010ks3.LIZIZ();
        if (this.LJIILLIIL == null) {
            C1336010ks3.LIZIZ();
            this.LJIILLIIL = new C1327890kex(LIZIZ());
            C1336010ks3.LIZIZ();
        }
        C1336010ks3.LIZIZ();
        return this.LJIILLIIL;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIJI() {
        if (this.LJJIFFI == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            final Executor executorLJ = c1327640keY.LJIIIZ.LJ();
            final InterfaceC1327440keE interfaceC1327440keE = c1327640keY.LJIIJ;
            final Resources resources = c1327640keY.LIZIZ;
            this.LJJIFFI = LJJIIJ(new AbstractC1327410keB(executorLJ, interfaceC1327440keE, resources) { // from class: X.0kdr
                public final Resources LIZJ;

                @Override // X.AbstractC1327410keB
                public final String LJ() {
                    return "LocalResourceFetchProducer";
                }

                @Override // X.AbstractC1327410keB
                public final C1328480kfu LIZLLL(C1325710kbR c1325710kbR) {
                    int length;
                    InputStream inputStreamOpenRawResource = this.LIZJ.openRawResource(Integer.parseInt(c1325710kbR.LIZIZ.getPath().substring(1)));
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
                    try {
                        try {
                            assetFileDescriptorOpenRawResourceFd = this.LIZJ.openRawResourceFd(Integer.parseInt(c1325710kbR.LIZIZ.getPath().substring(1)));
                            length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
                            try {
                                assetFileDescriptorOpenRawResourceFd.close();
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Resources.NotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            if (assetFileDescriptorOpenRawResourceFd != null) {
                                try {
                                    assetFileDescriptorOpenRawResourceFd.close();
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                            length = -1;
                        }
                        return LIZJ(inputStreamOpenRawResource, length);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (assetFileDescriptorOpenRawResourceFd != null) {
                            try {
                                assetFileDescriptorOpenRawResourceFd.close();
                                throw th;
                            } catch (IOException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                throw th;
                            }
                        }
                        throw th;
                    }
                }

                {
                    this.LIZJ = resources;
                }
            });
        }
        return this.LJJIFFI;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIJJ() {
        if (this.LJJ == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            this.LJJ = LJJIFFI(new C1327480keI(c1327640keY.LJIIIZ.LIZLLL(), c1327640keY.LJIIIZ.LIZIZ(), c1327640keY.LIZ));
        }
        return this.LJJ;
    }

    public final InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> LJIJJLI() {
        synchronized (this) {
            try {
                C1336010ks3.LIZIZ();
                if (this.LJIILL == null) {
                    C1336010ks3.LIZIZ();
                    this.LJIILL = new C1327860keu(LIZJ());
                    C1336010ks3.LIZIZ();
                }
                C1336010ks3.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LJIILL;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIL() {
        C1336010ks3.LIZIZ();
        if (this.LJIIJ == null) {
            C1336010ks3.LIZIZ();
            this.LJIIJ = LJJII(LJFF());
            C1336010ks3.LIZIZ();
        }
        C1336010ks3.LIZIZ();
        return this.LJIIJ;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJJ() {
        if (this.LJJIIJ == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            final Executor executorLJ = c1327640keY.LJIIIZ.LJ();
            final InterfaceC1327440keE interfaceC1327440keE = c1327640keY.LJIIJ;
            final ContentResolver contentResolver = c1327640keY.LIZ;
            this.LJJIIJ = LJJIIJ(new AbstractC1327410keB(executorLJ, interfaceC1327440keE, contentResolver) { // from class: X.0kdt
                public final ContentResolver LIZJ;

                @Override // X.AbstractC1327410keB
                public final String LJ() {
                    return "QualifiedResourceFetchProducer";
                }

                @Override // X.AbstractC1327410keB
                public final C1328480kfu LIZLLL(C1325710kbR c1325710kbR) {
                    return LIZJ(C09NT.LJ(this.LIZJ, c1325710kbR.LIZIZ), -1);
                }

                {
                    this.LIZJ = contentResolver;
                }
            });
        }
        return this.LJJIIJ;
    }

    public static String LJJI(Uri uri) {
        String strValueOf = String.valueOf(uri);
        if (strValueOf.length() > 30) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strValueOf.substring(0, 30));
            sbLIZ.append("...");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strValueOf;
    }

    public final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LIZLLL(C1325710kbR c1325710kbR) {
        Uri uri;
        int i;
        C1327850ket c1327850ket;
        try {
            C1336010ks3.LIZIZ();
            c1325710kbR.getClass();
            uri = c1325710kbR.LIZIZ;
            C1322350kW1.LIZLLL(uri, "Uri is null.");
            i = c1325710kbR.LIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                case BdTuring.TYPE_ECAF /* 9 */:
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIJJ = LJIJJ();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJIJJ;
                case 3:
                    if (c1325710kbR.LIZLLL()) {
                        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIIIZ = LJIIIZ();
                        C1336010ks3.LIZIZ();
                        return interfaceC1327390ke9LJIIIZ;
                    }
                    synchronized (this) {
                        if (this.LJIJJ == null) {
                            C1327640keY c1327640keY = this.LIZIZ;
                            c1327640keY.getClass();
                            this.LJIJJ = LJJIIJ(new C1327240kdu(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ));
                        }
                        c1327850ket = this.LJIJJ;
                    }
                    C1336010ks3.LIZIZ();
                    return c1327850ket;
                case 4:
                    String type = this.LIZ.getType(uri);
                    if (type != null && type.startsWith("video/")) {
                        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIJJ2 = LJIJJ();
                        C1336010ks3.LIZIZ();
                        return interfaceC1327390ke9LJIJJ2;
                    }
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIILL = LJIILL();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJIILL;
                case 5:
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIILIIL = LJIILIIL();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJIILIIL;
                case 6:
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIJI = LJIJI();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJIJI;
                case 7:
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJI = LJI();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJI;
                case 8:
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJJ = LJJ();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJJ;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    if (Build.VERSION.SDK_INT >= 29 && c1325710kbR.LJIIIZ) {
                        C1327850ket c1327850ketLJIILLIIL = LJIILLIIL();
                        C1336010ks3.LIZIZ();
                        return c1327850ketLJIILLIIL;
                    }
                    if (c1325710kbR.LIZLLL()) {
                        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIIJ = LJIIJ();
                        C1336010ks3.LIZIZ();
                        return interfaceC1327390ke9LJIIJ;
                    }
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIILL2 = LJIILL();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJIILL2;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unsupported uri scheme! Uri is: ");
                    sbLIZ.append(LJJI(uri));
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LJIL = LJIL();
        C1336010ks3.LIZIZ();
        return interfaceC1327390ke9LJIL;
    }

    public final synchronized InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJ(final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9) {
        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke92;
        interfaceC1327390ke92 = (InterfaceC1327390ke9) ((HashMap) this.LJJIIZI).get(interfaceC1327390ke9);
        if (interfaceC1327390ke92 == null) {
            C1327640keY c1327640keY = this.LIZIZ;
            c1327640keY.getClass();
            final int i = c1327640keY.LJIJI;
            final int i2 = c1327640keY.LJIJJ;
            final boolean z = c1327640keY.LJIJJLI;
            interfaceC1327390ke92 = new InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>(interfaceC1327390ke9, i, i2, z) { // from class: X.0kez
                public final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LIZ;
                public final int LIZIZ;
                public final int LIZJ;
                public final boolean LIZLLL;

                @Override // X.InterfaceC1327390ke9
                public final void LIZIZ(final InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
                    if (interfaceC1327930kf1.LJI() && !this.LIZLLL) {
                        this.LIZ.LIZIZ(interfaceC1328020kfA, interfaceC1327930kf1);
                        return;
                    }
                    InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke93 = this.LIZ;
                    final int i3 = this.LIZIZ;
                    final int i4 = this.LIZJ;
                    interfaceC1327390ke93.LIZIZ(new AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>>(interfaceC1328020kfA, i3, i4) { // from class: X.0kf0
                        public final int LIZJ;
                        public final int LIZLLL;

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
                        @Override // X.AbstractC1327820keq
                        public final void LJII(int i5, Object obj) {
                            AbstractC1327750kej abstractC1327750kej;
                            Bitmap underlyingBitmap;
                            int rowBytes;
                            C1323050kX9 c1323050kX9 = (C1323050kX9) obj;
                            if (c1323050kX9 != null && c1323050kX9.LJIILLIIL() && (abstractC1327750kej = (AbstractC1327750kej) c1323050kX9.get()) != null && !abstractC1327750kej.isClosed() && (abstractC1327750kej instanceof C1325120kaU) && (underlyingBitmap = ((AbstractC1325130kaV) abstractC1327750kej).getUnderlyingBitmap()) != null && (rowBytes = underlyingBitmap.getRowBytes() * underlyingBitmap.getHeight()) >= this.LIZJ && rowBytes <= this.LIZLLL) {
                                underlyingBitmap.prepareToDraw();
                            }
                            this.LIZIZ.LIZJ(i5, c1323050kX9);
                        }

                        {
                            this.LIZJ = i3;
                            this.LIZLLL = i4;
                        }
                    }, interfaceC1327930kf1);
                }

                {
                    boolean z2;
                    if (i <= i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1322350kW1.LIZIZ(z2);
                    interfaceC1327390ke9.getClass();
                    this.LIZ = interfaceC1327390ke9;
                    this.LIZIZ = i;
                    this.LIZJ = i2;
                    this.LIZLLL = z;
                }
            };
            ((HashMap) this.LJJIIZI).put(interfaceC1327390ke9, interfaceC1327390ke92);
        }
        return interfaceC1327390ke92;
    }

    public final InterfaceC1327390ke9<Void> LJII(C1325710kbR c1325710kbR) {
        InterfaceC1327390ke9<Void> interfaceC1327390ke9;
        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LIZLLL = LIZLLL(c1325710kbR);
        if (this.LJII) {
            interfaceC1327390ke9LIZLLL = LJ(interfaceC1327390ke9LIZLLL);
        }
        synchronized (this) {
            if (!((HashMap) this.LJJIIZ).containsKey(interfaceC1327390ke9LIZLLL)) {
                ((HashMap) this.LJJIIZ).put(interfaceC1327390ke9LIZLLL, new C1327890kex(interfaceC1327390ke9LIZLLL));
            }
            interfaceC1327390ke9 = (InterfaceC1327390ke9) ((HashMap) this.LJJIIZ).get(interfaceC1327390ke9LIZLLL);
        }
        return interfaceC1327390ke9;
    }

    public final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LJIIIIZZ(C1325710kbR c1325710kbR) {
        C1336010ks3.LIZIZ();
        InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> interfaceC1327390ke9LIZLLL = LIZLLL(c1325710kbR);
        if (c1325710kbR.LJIJJ != null) {
            synchronized (this) {
                if (!((HashMap) this.LJJIIJZLJL).containsKey(interfaceC1327390ke9LIZLLL)) {
                    C1327640keY c1327640keY = this.LIZIZ;
                    c1327640keY.getClass();
                    final C1327790ken c1327790ken = new C1327790ken(interfaceC1327390ke9LIZLLL, c1327640keY.LJIJ, c1327640keY.LJIIIZ.LIZ());
                    C1327640keY c1327640keY2 = this.LIZIZ;
                    c1327640keY2.getClass();
                    final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX = c1327640keY2.LJIILL;
                    final InterfaceC1325590kbF interfaceC1325590kbF = c1327640keY2.LJIIZILJ;
                    ((HashMap) this.LJJIIJZLJL).put(interfaceC1327390ke9LIZLLL, new InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>>(interfaceC1325150kaX, interfaceC1325590kbF, c1327790ken) { // from class: X.0keU
                        public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LIZ;
                        public final C1325170kaZ LIZIZ;
                        public final InterfaceC1325590kbF LIZJ;
                        public final InterfaceC1327390ke9<C1323050kX9<AbstractC1327750kej>> LIZLLL;

                        @Override // X.InterfaceC1327390ke9
                        public final void LIZIZ(InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
                            boolean z;
                            C1325170kaZ c1325170kaZ;
                            InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
                            String id = interfaceC1327930kf1.getId();
                            C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
                            Object objLIZJ = interfaceC1327930kf1.LIZJ();
                            InterfaceC1291910jiv interfaceC1291910jiv = c1325710kbRLJFF.LJIJJ;
                            if (interfaceC1291910jiv != null && interfaceC1291910jiv.getPostprocessorCacheKey() != null) {
                                interfaceC1325690kbPLIZ.LJI(id, "PostprocessedBitmapMemoryCacheProducer");
                                C1324660kZk c1324660kZkLIZIZ = this.LIZJ.LIZIZ(c1325710kbRLJFF, objLIZJ);
                                C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LIZ.get(c1324660kZkLIZIZ);
                                if (c1323050kX9 == null && C1328130kfL.LJIILIIL().LJJIIJ && (c1325170kaZ = this.LIZIZ) != null) {
                                    c1323050kX9 = c1325170kaZ.get(c1324660kZkLIZIZ);
                                }
                                Map<String, String> mapOf = null;
                                if (c1323050kX9 != null) {
                                    if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                                        mapOf = C19871212ow.of("cached_value_found", "true");
                                    }
                                    interfaceC1325690kbPLIZ.LIZIZ(id, "PostprocessedBitmapMemoryCacheProducer", mapOf);
                                    interfaceC1325690kbPLIZ.LJIIIZ(id, "PostprocessedBitmapMemoryCacheProducer", true);
                                    interfaceC1328020kfA.LIZ(1.0f);
                                    interfaceC1328020kfA.LIZJ(1, c1323050kX9);
                                    c1323050kX9.close();
                                    return;
                                }
                                boolean z2 = interfaceC1291910jiv instanceof InterfaceC1328080kfG;
                                if (interfaceC1327930kf1.LJFF().LJIJI && (!"SRPostProcessor".equalsIgnoreCase(interfaceC1291910jiv.getName()) || C1328730kgJ.LJ)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>> abstractC1328840kgU = new AbstractC1328840kgU<C1323050kX9<AbstractC1327750kej>, C1323050kX9<AbstractC1327750kej>>(interfaceC1328020kfA, c1324660kZkLIZIZ, z2, this.LIZ, z) { // from class: X.0keT
                                    public final InterfaceC1324680kZm LIZJ;
                                    public final boolean LIZLLL;
                                    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LJ;
                                    public final C1325170kaZ LJFF;
                                    public final boolean LJI;

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
                                    @Override // X.AbstractC1327820keq
                                    public final void LJII(int i, Object obj) {
                                        C1323050kX9 c1323050kX92 = (C1323050kX9) obj;
                                        C1323050kX9 c1323050kX9LJ = null;
                                        if (c1323050kX92 == null) {
                                            if (AbstractC1327820keq.LIZLLL(i)) {
                                                this.LIZIZ.LIZJ(i, null);
                                                return;
                                            }
                                            return;
                                        }
                                        if (AbstractC1327820keq.LJ(i) && !this.LIZLLL) {
                                            return;
                                        }
                                        if (this.LJI) {
                                            if (C1328130kfL.LJIILIIL().LJJIIJ && c1323050kX92.get() != null && ((AbstractC1327750kej) c1323050kX92.get()).getSizeInBytes() > C1328130kfL.LJIILIIL().LJJIIJZLJL) {
                                                c1323050kX9LJ = this.LJFF.LJ(this.LIZJ, c1323050kX92);
                                            } else {
                                                c1323050kX9LJ = this.LJ.LJ(this.LIZJ, c1323050kX92);
                                            }
                                        }
                                        try {
                                            this.LIZIZ.LIZ(1.0f);
                                            InterfaceC1328020kfA<O> interfaceC1328020kfA2 = this.LIZIZ;
                                            if (c1323050kX9LJ != null) {
                                                c1323050kX92 = c1323050kX9LJ;
                                            }
                                            interfaceC1328020kfA2.LIZJ(i, c1323050kX92);
                                            C1323050kX9.LJII(c1323050kX9LJ);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C1323050kX9.LJII(c1323050kX9LJ);
                                            throw th;
                                        }
                                    }

                                    {
                                        C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJFF;
                                        this.LIZJ = c1324660kZkLIZIZ;
                                        this.LIZLLL = z2;
                                        this.LJ = interfaceC1325150kaX;
                                        if (C1328130kfL.LJIILIIL().LJJIIJ) {
                                            c1325170kaZLJFF = C1328130kfL.LJIILIIL().LJFF();
                                        } else {
                                            c1325170kaZLJFF = null;
                                        }
                                        this.LJFF = c1325170kaZLJFF;
                                        this.LJI = z;
                                    }
                                };
                                if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                                    mapOf = C19871212ow.of("cached_value_found", "false");
                                }
                                interfaceC1325690kbPLIZ.LIZIZ(id, "PostprocessedBitmapMemoryCacheProducer", mapOf);
                                this.LIZLLL.LIZIZ(abstractC1328840kgU, interfaceC1327930kf1);
                                return;
                            }
                            this.LIZLLL.LIZIZ(interfaceC1328020kfA, interfaceC1327930kf1);
                        }

                        {
                            C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJFF;
                            this.LIZ = interfaceC1325150kaX;
                            if (C1328130kfL.LJIILIIL().LJJIIJ) {
                                c1325170kaZLJFF = C1328130kfL.LJIILIIL().LJFF();
                            } else {
                                c1325170kaZLJFF = null;
                            }
                            this.LIZIZ = c1325170kaZLJFF;
                            this.LIZJ = interfaceC1325590kbF;
                            this.LIZLLL = c1327790ken;
                        }
                    });
                }
                interfaceC1327390ke9LIZLLL = (InterfaceC1327390ke9) ((HashMap) this.LJJIIJZLJL).get(interfaceC1327390ke9LIZLLL);
            }
        }
        if (this.LJII) {
            interfaceC1327390ke9LIZLLL = LJ(interfaceC1327390ke9LIZLLL);
        }
        C1336010ks3.LIZIZ();
        return interfaceC1327390ke9LIZLLL;
    }

    public final InterfaceC1327390ke9<Void> LJIIJJI(C1325710kbR c1325710kbR) {
        boolean z;
        C1327890kex c1327890kex;
        c1325710kbR.getClass();
        if (c1325710kbR.LJIILLIIL.getValue() <= EnumC1320950kTl.ENCODED_MEMORY_CACHE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        int i = c1325710kbR.LIZLLL;
        if (i != 0) {
            if (i != 2 && i != 3) {
                Uri uri = c1325710kbR.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported uri scheme for encoded image fetch! Uri is: ");
                sbLIZ.append(LJJI(uri));
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return LJIJ();
        }
        synchronized (this) {
            C1336010ks3.LIZIZ();
            if (this.LJIIZILJ == null) {
                C1336010ks3.LIZIZ();
                this.LJIIZILJ = new C1327890kex(LIZJ());
                C1336010ks3.LIZIZ();
            }
            C1336010ks3.LIZIZ();
            c1327890kex = this.LJIIZILJ;
        }
        return c1327890kex;
    }

    public final InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> LJIIL(C1325710kbR c1325710kbR) {
        boolean z;
        try {
            C1336010ks3.LIZIZ();
            c1325710kbR.getClass();
            if (c1325710kbR.LJIILLIIL.getValue() <= EnumC1320950kTl.ENCODED_MEMORY_CACHE.getValue()) {
                z = true;
            } else {
                z = false;
            }
            C1322350kW1.LIZIZ(z);
            Uri uri = c1325710kbR.LIZIZ;
            int i = c1325710kbR.LIZLLL;
            if (i != 0) {
                if (i != 2 && i != 3) {
                    if (i != 4 && i != 9 && i != 10) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported uri scheme for encoded image fetch! Uri is: ");
                        sbLIZ.append(LJJI(uri));
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> interfaceC1327390ke9LJIILJJIL = LJIILJJIL();
                    C1336010ks3.LIZIZ();
                    return interfaceC1327390ke9LJIILJJIL;
                }
                InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> interfaceC1327390ke9LJIIZILJ = LJIIZILJ();
                C1336010ks3.LIZIZ();
                return interfaceC1327390ke9LJIIZILJ;
            }
            InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> interfaceC1327390ke9LJIJJLI = LJIJJLI();
            C1336010ks3.LIZIZ();
            return interfaceC1327390ke9LJIJJLI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0ket] */
    public final C1327850ket LJJIFFI(InterfaceC1327390ke9 interfaceC1327390ke9) {
        C1327640keY c1327640keY = this.LIZIZ;
        c1327640keY.getClass();
        final C1327610keV c1327610keV = new C1327610keV(c1327640keY.LJIILL, c1327640keY.LJIIZILJ, interfaceC1327390ke9);
        C1327640keY c1327640keY2 = this.LIZIZ;
        c1327640keY2.getClass();
        final InterfaceC1325590kbF interfaceC1325590kbF = c1327640keY2.LJIIZILJ;
        AbstractC1328850kgV<Pair<InterfaceC1324680kZm, String>, C1323050kX9<AbstractC1327750kej>> abstractC1328850kgV = new AbstractC1328850kgV<Pair<InterfaceC1324680kZm, String>, C1323050kX9<AbstractC1327750kej>>(interfaceC1325590kbF, c1327610keV) { // from class: X.0keb
            public final InterfaceC1325590kbF LIZJ;

            @Override // X.AbstractC1328850kgV
            public final Closeable LIZJ(Closeable closeable) {
                return C1323050kX9.LJFF((C1323050kX9) closeable);
            }

            @Override // X.AbstractC1328850kgV
            public final Closeable LIZLLL(Closeable closeable) {
                C1323050kX9 c1323050kX9 = (C1323050kX9) closeable;
                if (c1323050kX9 != null && c1323050kX9.get() != null) {
                    return C1323050kX9.LJIJJLI(((AbstractC1327750kej) c1323050kX9.get()).cloneOrNull());
                }
                return null;
            }

            @Override // X.AbstractC1328850kgV
            public final C1330000kiM LJI(Closeable closeable) {
                C1323050kX9 c1323050kX9 = (C1323050kX9) closeable;
                if (c1323050kX9 != null && c1323050kX9.get() != null) {
                    return ((AbstractC1327750kej) c1323050kX9.get()).getImageFormat();
                }
                return null;
            }

            @Override // X.AbstractC1328850kgV
            public final Pair<InterfaceC1324680kZm, String> LJII(InterfaceC1327930kf1 interfaceC1327930kf1) {
                String strValueOf;
                C1324660kZk c1324660kZkLIZJ = this.LIZJ.LIZJ(interfaceC1327930kf1.LJFF(), interfaceC1327930kf1.LIZJ());
                if (!interfaceC1327930kf1.LJFF().LJJI) {
                    strValueOf = interfaceC1327930kf1.getId();
                } else {
                    strValueOf = String.valueOf(interfaceC1327930kf1.LIZIZ().getValue());
                }
                return Pair.create(c1324660kZkLIZJ, strValueOf);
            }

            {
                super(c1327610keV);
                this.LIZJ = interfaceC1325590kbF;
            }
        };
        C1327640keY c1327640keY3 = this.LIZIZ;
        C1325570kbD c1325570kbD = this.LJFF;
        c1327640keY3.getClass();
        final C1327350ke5 c1327350ke5 = new C1327350ke5(abstractC1328850kgV, c1325570kbD);
        C1327640keY c1327640keY4 = this.LIZIZ;
        c1327640keY4.getClass();
        final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX = c1327640keY4.LJIILL;
        final InterfaceC1325590kbF interfaceC1325590kbF2 = c1327640keY4.LJIIZILJ;
        return new C1327610keV(interfaceC1325150kaX, interfaceC1325590kbF2, c1327350ke5) { // from class: X.0ket
            @Override // X.C1327610keV
            public final String LIZJ() {
                return "BitmapMemoryCacheGetProducer";
            }

            @Override // X.C1327610keV
            public final InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> LIZLLL(InterfaceC1328020kfA<C1323050kX9<AbstractC1327750kej>> interfaceC1328020kfA, InterfaceC1324680kZm interfaceC1324680kZm, boolean z) {
                return interfaceC1328020kfA;
            }
        };
    }

    public final C1327850ket LJJII(InterfaceC1327390ke9 interfaceC1327390ke9) {
        C1336010ks3.LIZIZ();
        C1327640keY c1327640keY = this.LIZIZ;
        c1327640keY.getClass();
        C1327850ket c1327850ketLJJIFFI = LJJIFFI(new C1328550kg1(c1327640keY.LIZLLL, c1327640keY.LJIIIZ.LIZLLL(), c1327640keY.LJ, c1327640keY.LJFF, c1327640keY.LJI, c1327640keY.LJII, c1327640keY.LJIIIIZZ, interfaceC1327390ke9, c1327640keY.LJIL, c1327640keY.LJJ));
        C1336010ks3.LIZIZ();
        return c1327850ketLJJIFFI;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.0ker] */
    public final C1327850ket LJJIII(AbstractC1327410keB abstractC1327410keB) {
        C1327640keY c1327640keY = this.LIZIZ;
        c1327640keY.getClass();
        C1327640keY c1327640keY2 = this.LIZIZ;
        c1327640keY2.getClass();
        InterfaceC1327290kdz[] interfaceC1327290kdzArr = {new C1327260kdw(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ, c1327640keY.LIZ), new C1327360ke6(c1327640keY2.LJIIIZ.LJ(), c1327640keY2.LJIIJ, c1327640keY2.LIZ)};
        C1327970kf5 c1327970kf5 = new C1327970kf5(LJJIIZ(abstractC1327410keB));
        C1327640keY c1327640keY3 = this.LIZIZ;
        InterfaceC1327160kdm interfaceC1327160kdm = this.LJIIIZ;
        c1327640keY3.getClass();
        C1328090kfH c1328090kfH = new C1328090kfH(c1327640keY3.LJIIIZ.LIZ(), c1327640keY3.LJIIJ, c1327970kf5, interfaceC1327160kdm, c1327640keY3.LJIIJJI, c1327640keY3.LJIIL, c1327640keY3.LJIILIIL, c1327640keY3.LJIIZILJ);
        C1327640keY c1327640keY4 = this.LIZIZ;
        c1327640keY4.getClass();
        C1328600kg6 c1328600kg6 = new C1328600kg6(c1327640keY4.LJIIIZ.LIZJ(), c1328090kfH);
        this.LIZIZ.getClass();
        C1327400keA c1327400keA = new C1327400keA(interfaceC1327290kdzArr);
        C1327640keY c1327640keY5 = this.LIZIZ;
        InterfaceC1327160kdm interfaceC1327160kdm2 = this.LJIIIZ;
        c1327640keY5.getClass();
        final C1327580keS c1327580keS = new C1327580keS(new C1328090kfH(c1327640keY5.LJIIIZ.LIZ(), c1327640keY5.LJIIJ, c1327400keA, interfaceC1327160kdm2, c1327640keY5.LJIIJJI, c1327640keY5.LJIIL, c1327640keY5.LJIILIIL, c1327640keY5.LJIIZILJ), c1328600kg6);
        C1327640keY c1327640keY6 = this.LIZIZ;
        c1327640keY6.getClass();
        final C1326950kdR c1326950kdR = c1327640keY6.LJIIJJI;
        final C1326950kdR c1326950kdR2 = c1327640keY6.LJIIL;
        final Map<String, C1326950kdR> map = c1327640keY6.LJIILIIL;
        final InterfaceC1325590kbF interfaceC1325590kbF = c1327640keY6.LJIIZILJ;
        final InterfaceC1327440keE interfaceC1327440keE = c1327640keY6.LJIIJ;
        final ?? r2 = new C1327710kef(c1326950kdR, c1326950kdR2, map, interfaceC1325590kbF, c1327580keS, interfaceC1327440keE) { // from class: X.0ker
            @Override // X.C1327710kef
            public final boolean LJ(InterfaceC1327930kf1 interfaceC1327930kf1) {
                return interfaceC1327930kf1.LJFF().LIZLLL();
            }

            @Override // X.C1327710kef
            public final InterfaceC1324680kZm LIZLLL(InterfaceC1325590kbF interfaceC1325590kbF2, InterfaceC1327930kf1 interfaceC1327930kf1) {
                C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
                interfaceC1327930kf1.LIZJ();
                return interfaceC1325590kbF2.LIZLLL(c1325710kbRLJFF);
            }
        };
        C1327640keY c1327640keY7 = this.LIZIZ;
        c1327640keY7.getClass();
        final InterfaceC1325590kbF interfaceC1325590kbF2 = c1327640keY7.LJIIZILJ;
        return LJJII(new C1327680kec(interfaceC1325590kbF2, r2) { // from class: X.0kep
            public final InterfaceC1325590kbF LIZLLL;

            @Override // X.C1327680kec, X.AbstractC1328850kgV
            public final /* bridge */ /* synthetic */ Pair<InterfaceC1324680kZm, String> LJII(InterfaceC1327930kf1 interfaceC1327930kf1) {
                return LJII(interfaceC1327930kf1);
            }

            @Override // X.C1327680kec
            /* JADX INFO: renamed from: LJIIIZ */
            public final Pair<InterfaceC1324680kZm, String> LJII(InterfaceC1327930kf1 interfaceC1327930kf1) {
                String strValueOf;
                C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
                InterfaceC1325590kbF interfaceC1325590kbF3 = this.LIZLLL;
                interfaceC1327930kf1.LIZJ();
                C1291300jhw c1291300jhwLIZLLL = interfaceC1325590kbF3.LIZLLL(c1325710kbRLJFF);
                if (!interfaceC1327930kf1.LJFF().LJJI) {
                    strValueOf = interfaceC1327930kf1.getId();
                } else {
                    strValueOf = String.valueOf(interfaceC1327930kf1.LIZIZ().getValue());
                }
                return Pair.create(c1291300jhwLIZLLL, strValueOf);
            }

            {
                super(interfaceC1325590kbF2, r2);
                this.LIZLLL = interfaceC1325590kbF2;
            }
        });
    }

    public final C1327850ket LJJIIJ(AbstractC1327410keB abstractC1327410keB) {
        C1327640keY c1327640keY = this.LIZIZ;
        c1327640keY.getClass();
        return LJJIIJZLJL(abstractC1327410keB, new InterfaceC1327290kdz[]{new C1327360ke6(c1327640keY.LJIIIZ.LJ(), c1327640keY.LJIIJ, c1327640keY.LIZ)});
    }

    public final C1327680kec LJJIIZ(InterfaceC1327390ke9 interfaceC1327390ke9) {
        InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke92;
        final InterfaceC1327390ke9 c1327710kef = interfaceC1327390ke9;
        boolean z = C1328690kgF.LIZ;
        if (this.LJIIIIZZ) {
            C1336010ks3.LIZIZ();
            if (this.LJ) {
                C1327640keY c1327640keY = this.LIZIZ;
                c1327640keY.getClass();
                final C1327730keh c1327730keh = new C1327730keh(c1327640keY.LJIIJJI, c1327640keY.LJIIZILJ, c1327640keY.LJIIJ, c1327640keY.LIZLLL, c1327710kef);
                C1327640keY c1327640keY2 = this.LIZIZ;
                c1327640keY2.getClass();
                final C1326950kdR c1326950kdR = c1327640keY2.LJIIJJI;
                final C1326950kdR c1326950kdR2 = c1327640keY2.LJIIL;
                final Map<String, C1326950kdR> map = c1327640keY2.LJIILIIL;
                final InterfaceC1325590kbF interfaceC1325590kbF = c1327640keY2.LJIIZILJ;
                final InterfaceC1327440keE interfaceC1327440keE = c1327640keY2.LJIIJ;
                interfaceC1327390ke92 = new InterfaceC1327390ke9<C1328480kfu>(c1326950kdR, c1326950kdR2, map, interfaceC1325590kbF, c1327730keh, interfaceC1327440keE) { // from class: X.0ked
                    public final C1326950kdR LIZ;
                    public final C1326950kdR LIZIZ;
                    public final Map<String, C1326950kdR> LIZJ;
                    public final InterfaceC1325590kbF LIZLLL;
                    public final InterfaceC1327390ke9<C1328480kfu> LJ;
                    public final InterfaceC1327440keE LJFF;

                    @Override // X.InterfaceC1327390ke9
                    public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
                        if (interfaceC1327930kf1.LIZIZ().getValue() >= EnumC1320950kTl.DISK_CACHE.getValue()) {
                            interfaceC1328020kfA.LIZJ(1, null);
                            return;
                        }
                        final C1326950kdR c1326950kdR3 = this.LIZ;
                        final C1326950kdR c1326950kdR4 = this.LIZIZ;
                        final Map<String, C1326950kdR> map2 = this.LIZJ;
                        final InterfaceC1325590kbF interfaceC1325590kbF2 = this.LIZLLL;
                        final boolean z2 = interfaceC1327930kf1.LJFF().LJIIZILJ;
                        final InterfaceC1327440keE interfaceC1327440keE2 = this.LJFF;
                        this.LJ.LIZIZ(new AbstractC1328840kgU<C1328480kfu, C1328480kfu>(interfaceC1328020kfA, interfaceC1327930kf1, c1326950kdR3, c1326950kdR4, map2, interfaceC1325590kbF2, z2, interfaceC1327440keE2) { // from class: X.0kee
                            public final InterfaceC1327930kf1 LIZJ;
                            public final C1326950kdR LIZLLL;
                            public final C1326950kdR LJ;
                            public final Map<String, C1326950kdR> LJFF;
                            public final InterfaceC1325590kbF LJI;
                            public final boolean LJII;
                            public String LJIIIIZZ;
                            public final InterfaceC1327440keE LJIIIZ;

                            /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: all -> 0x0153, TryCatch #1 {all -> 0x0153, blocks: (B:29:0x0075, B:31:0x0087, B:32:0x008e, B:35:0x0098, B:37:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00ec, B:42:0x00f1, B:44:0x0120, B:45:0x0124, B:46:0x012d, B:48:0x0131, B:50:0x0139, B:52:0x0145, B:53:0x0149), top: B:64:0x0075 }] */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x0153, TRY_LEAVE, TryCatch #1 {all -> 0x0153, blocks: (B:29:0x0075, B:31:0x0087, B:32:0x008e, B:35:0x0098, B:37:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00ec, B:42:0x00f1, B:44:0x0120, B:45:0x0124, B:46:0x012d, B:48:0x0131, B:50:0x0139, B:52:0x0145, B:53:0x0149), top: B:64:0x0075 }] */
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
                            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x006b
                                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                                */
                            @Override // X.AbstractC1327820keq
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJII(int r12, java.lang.Object r13) {
                                /*
                                    Method dump skipped, instruction units count: 353
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1327700kee.LJII(int, java.lang.Object):void");
                            }

                            {
                                this.LIZJ = interfaceC1327930kf1;
                                this.LIZLLL = c1326950kdR3;
                                this.LJ = c1326950kdR4;
                                this.LJFF = map2;
                                this.LJI = interfaceC1325590kbF2;
                                this.LJII = z2;
                                this.LJIIIZ = interfaceC1327440keE2;
                            }
                        }, interfaceC1327930kf1);
                    }

                    {
                        this.LIZ = c1326950kdR;
                        this.LIZIZ = c1326950kdR2;
                        this.LIZJ = map;
                        this.LIZLLL = interfaceC1325590kbF;
                        this.LJ = c1327730keh;
                        this.LJFF = interfaceC1327440keE;
                    }
                };
            } else {
                C1327640keY c1327640keY3 = this.LIZIZ;
                c1327640keY3.getClass();
                final C1326950kdR c1326950kdR3 = c1327640keY3.LJIIJJI;
                final C1326950kdR c1326950kdR4 = c1327640keY3.LJIIL;
                final Map<String, C1326950kdR> map2 = c1327640keY3.LJIILIIL;
                final InterfaceC1325590kbF interfaceC1325590kbF2 = c1327640keY3.LJIIZILJ;
                final InterfaceC1327440keE interfaceC1327440keE2 = c1327640keY3.LJIIJ;
                interfaceC1327390ke92 = new InterfaceC1327390ke9<C1328480kfu>(c1326950kdR3, c1326950kdR4, map2, interfaceC1325590kbF2, c1327710kef, interfaceC1327440keE2) { // from class: X.0ked
                    public final C1326950kdR LIZ;
                    public final C1326950kdR LIZIZ;
                    public final Map<String, C1326950kdR> LIZJ;
                    public final InterfaceC1325590kbF LIZLLL;
                    public final InterfaceC1327390ke9<C1328480kfu> LJ;
                    public final InterfaceC1327440keE LJFF;

                    @Override // X.InterfaceC1327390ke9
                    public final void LIZIZ(final InterfaceC1328020kfA interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
                        if (interfaceC1327930kf1.LIZIZ().getValue() >= EnumC1320950kTl.DISK_CACHE.getValue()) {
                            interfaceC1328020kfA.LIZJ(1, null);
                            return;
                        }
                        final C1326950kdR c1326950kdR32 = this.LIZ;
                        final C1326950kdR c1326950kdR42 = this.LIZIZ;
                        final Map map22 = this.LIZJ;
                        final InterfaceC1325590kbF interfaceC1325590kbF22 = this.LIZLLL;
                        final boolean z2 = interfaceC1327930kf1.LJFF().LJIIZILJ;
                        final InterfaceC1327440keE interfaceC1327440keE22 = this.LJFF;
                        this.LJ.LIZIZ(new AbstractC1328840kgU<C1328480kfu, C1328480kfu>(interfaceC1328020kfA, interfaceC1327930kf1, c1326950kdR32, c1326950kdR42, map22, interfaceC1325590kbF22, z2, interfaceC1327440keE22) { // from class: X.0kee
                            public final InterfaceC1327930kf1 LIZJ;
                            public final C1326950kdR LIZLLL;
                            public final C1326950kdR LJ;
                            public final Map<String, C1326950kdR> LJFF;
                            public final InterfaceC1325590kbF LJI;
                            public final boolean LJII;
                            public String LJIIIIZZ;
                            public final InterfaceC1327440keE LJIIIZ;

                            /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: all -> 0x0153, TryCatch #1 {all -> 0x0153, blocks: (B:29:0x0075, B:31:0x0087, B:32:0x008e, B:35:0x0098, B:37:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00ec, B:42:0x00f1, B:44:0x0120, B:45:0x0124, B:46:0x012d, B:48:0x0131, B:50:0x0139, B:52:0x0145, B:53:0x0149), top: B:64:0x0075 }] */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x0153, TRY_LEAVE, TryCatch #1 {all -> 0x0153, blocks: (B:29:0x0075, B:31:0x0087, B:32:0x008e, B:35:0x0098, B:37:0x00c7, B:38:0x00cb, B:39:0x00d4, B:41:0x00ec, B:42:0x00f1, B:44:0x0120, B:45:0x0124, B:46:0x012d, B:48:0x0131, B:50:0x0139, B:52:0x0145, B:53:0x0149), top: B:64:0x0075 }] */
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
                            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x006b
                                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                                */
                            @Override // X.AbstractC1327820keq
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJII(int r12, java.lang.Object r13) {
                                /*
                                    Method dump skipped, instruction units count: 353
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1327700kee.LJII(int, java.lang.Object):void");
                            }

                            {
                                this.LIZJ = interfaceC1327930kf1;
                                this.LIZLLL = c1326950kdR32;
                                this.LJ = c1326950kdR42;
                                this.LJFF = map22;
                                this.LJI = interfaceC1325590kbF22;
                                this.LJII = z2;
                                this.LJIIIZ = interfaceC1327440keE22;
                            }
                        }, interfaceC1327930kf1);
                    }

                    {
                        this.LIZ = c1326950kdR3;
                        this.LIZIZ = c1326950kdR4;
                        this.LIZJ = map2;
                        this.LIZLLL = interfaceC1325590kbF2;
                        this.LJ = c1327710kef;
                        this.LJFF = interfaceC1327440keE2;
                    }
                };
            }
            C1327640keY c1327640keY4 = this.LIZIZ;
            c1327640keY4.getClass();
            c1327710kef = new C1327710kef(c1327640keY4.LJIIJJI, c1327640keY4.LJIIL, c1327640keY4.LJIILIIL, c1327640keY4.LJIIZILJ, interfaceC1327390ke92, c1327640keY4.LJIIJ);
            C1336010ks3.LIZIZ();
        }
        C1327640keY c1327640keY5 = this.LIZIZ;
        c1327640keY5.getClass();
        final InterfaceC1325150kaX<InterfaceC1324680kZm, InterfaceC1327060kdc> interfaceC1325150kaX = c1327640keY5.LJIILJJIL;
        final InterfaceC1325590kbF interfaceC1325590kbF3 = c1327640keY5.LJIIZILJ;
        InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke93 = new InterfaceC1327390ke9<C1328480kfu>(interfaceC1325150kaX, interfaceC1325590kbF3, c1327710kef) { // from class: X.0keX
            public final InterfaceC1325150kaX<InterfaceC1324680kZm, InterfaceC1327060kdc> LIZ;
            public final InterfaceC1325590kbF LIZIZ;
            public final InterfaceC1327390ke9<C1328480kfu> LIZJ;

            @Override // X.InterfaceC1327390ke9
            public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
                int iIntValue;
                int iIntValue2;
                Map<String, String> mapOf;
                Uri uri;
                C1322050kVX c1322050kVX;
                Pair<Integer, Integer> pairLIZIZ;
                try {
                    C1336010ks3.LIZIZ();
                    String id = interfaceC1327930kf1.getId();
                    InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
                    interfaceC1325690kbPLIZ.LJI(id, "EncodedMemoryCacheProducer");
                    C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
                    final C592490NLr c592490NLrLIZ = this.LIZIZ.LIZ(c1325710kbRLJFF, interfaceC1327930kf1.LIZJ());
                    if (c1325710kbRLJFF != null && (c1322050kVX = c1325710kbRLJFF.LJJ) != null && c1322050kVX.LIZIZ() != null && (pairLIZIZ = c1322050kVX.LIZIZ()) != null) {
                        iIntValue2 = ((Integer) pairLIZIZ.first).intValue();
                        iIntValue = ((Integer) pairLIZIZ.second).intValue();
                    } else {
                        iIntValue = 0;
                        iIntValue2 = 0;
                    }
                    C1323050kX9<InterfaceC1327060kdc> c1323050kX9 = this.LIZ.get(c592490NLrLIZ);
                    Map<String, String> mapOf2 = null;
                    try {
                        if (c1323050kX9 != null) {
                            C1328480kfu c1328480kfu = new C1328480kfu(c1323050kX9);
                            if (c1325710kbRLJFF != null && (uri = c1325710kbRLJFF.LIZIZ) != null) {
                                c1328480kfu.LLJJJJLIIL = uri.toString();
                            }
                            c1328480kfu.LLJJL = iIntValue2;
                            c1328480kfu.LLJJLIIIJLLLLLLLZ = iIntValue;
                            try {
                                if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                                    mapOf2 = C19871212ow.of("cached_value_found", "true");
                                }
                                interfaceC1325690kbPLIZ.LIZIZ(id, "EncodedMemoryCacheProducer", mapOf2);
                                interfaceC1325690kbPLIZ.LJIIIZ(id, "EncodedMemoryCacheProducer", true);
                                interfaceC1328020kfA.LIZ(1.0f);
                                interfaceC1328020kfA.LIZJ(1, c1328480kfu);
                                C1328480kfu.LIZIZ(c1328480kfu);
                                C1323050kX9.LJII(c1323050kX9);
                                C1336010ks3.LIZIZ();
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1328480kfu.LIZIZ(c1328480kfu);
                                throw th;
                            }
                        }
                        if (interfaceC1327930kf1.LIZIZ().getValue() >= EnumC1320950kTl.ENCODED_MEMORY_CACHE.getValue()) {
                            if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                                mapOf = C19871212ow.of("cached_value_found", "false");
                            } else {
                                mapOf = null;
                            }
                            interfaceC1325690kbPLIZ.LIZIZ(id, "EncodedMemoryCacheProducer", mapOf);
                            interfaceC1325690kbPLIZ.LJIIIZ(id, "EncodedMemoryCacheProducer", false);
                            interfaceC1328020kfA.LIZJ(1, null);
                            C1323050kX9.LJII(c1323050kX9);
                            C1336010ks3.LIZIZ();
                            return;
                        }
                        final boolean z2 = interfaceC1327930kf1.LJFF().LJIJI;
                        final InterfaceC1325150kaX<InterfaceC1324680kZm, InterfaceC1327060kdc> interfaceC1325150kaX2 = this.LIZ;
                        AbstractC1328840kgU<C1328480kfu, C1328480kfu> abstractC1328840kgU = new AbstractC1328840kgU<C1328480kfu, C1328480kfu>(interfaceC1328020kfA, interfaceC1325150kaX2, c592490NLrLIZ, z2) { // from class: X.0kea
                            public final InterfaceC1325150kaX<InterfaceC1324680kZm, InterfaceC1327060kdc> LIZJ;
                            public final InterfaceC1324680kZm LIZLLL;
                            public final boolean LJ;

                            /* JADX WARN: Removed duplicated region for block: B:34:0x0066 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0002, B:6:0x000d, B:8:0x0011, B:10:0x001a, B:16:0x002e, B:19:0x003b, B:21:0x004a, B:24:0x0052, B:25:0x0055, B:28:0x005a, B:29:0x005d, B:34:0x0066, B:32:0x0062, B:33:0x0065, B:35:0x006c, B:18:0x0033, B:20:0x003e, B:12:0x0020, B:14:0x0024), top: B:42:0x0002, inners: #1, #2, #3 }] */
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
                            @Override // X.AbstractC1327820keq
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJII(int r4, java.lang.Object r5) {
                                /*
                                    r3 = this;
                                    X.0kfu r5 = (X.C1328480kfu) r5
                                    X.C1336010ks3.LIZIZ()     // Catch: java.lang.Throwable -> L75
                                    boolean r0 = X.AbstractC1327820keq.LJ(r4)     // Catch: java.lang.Throwable -> L75
                                    if (r0 != 0) goto L6c
                                    if (r5 == 0) goto L6c
                                    r0 = r4 & 10
                                    if (r0 != 0) goto L6c
                                    r5.LJIJJLI()     // Catch: java.lang.Throwable -> L75
                                    X.0kiM r1 = r5.LLILLL     // Catch: java.lang.Throwable -> L75
                                    X.0kiM r0 = X.C1330000kiM.LIZJ     // Catch: java.lang.Throwable -> L75
                                    if (r1 == r0) goto L6c
                                    X.0kX9 r2 = r5.LJFF()     // Catch: java.lang.Throwable -> L75
                                    if (r2 == 0) goto L66
                                    boolean r0 = r3.LJ     // Catch: java.lang.Throwable -> L5e
                                    if (r0 == 0) goto L2d
                                    X.0kaX<X.0kZm, X.0kdc> r1 = r3.LIZJ     // Catch: java.lang.Throwable -> L5e
                                    X.0kZm r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L5e
                                    X.0kX9 r1 = r1.LJ(r0, r2)     // Catch: java.lang.Throwable -> L5e
                                    goto L2e
                                L2d:
                                    r1 = 0
                                L2e:
                                    X.C1323050kX9.LJII(r2)     // Catch: java.lang.Throwable -> L75
                                    if (r1 == 0) goto L66
                                    X.0kfu r2 = new X.0kfu     // Catch: java.lang.Throwable -> L56
                                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L56
                                    r2.LIZLLL(r5)     // Catch: java.lang.Throwable -> L56
                                    X.C1323050kX9.LJII(r1)     // Catch: java.lang.Throwable -> L75
                                    X.0kfA<O> r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L4e
                                    r0 = 1065353216(0x3f800000, float:1.0)
                                    r1.LIZ(r0)     // Catch: java.lang.Throwable -> L4e
                                    X.0kfA<O> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L4e
                                    r0.LIZJ(r4, r2)     // Catch: java.lang.Throwable -> L4e
                                    X.C1328480kfu.LIZIZ(r2)     // Catch: java.lang.Throwable -> L75
                                    goto L71
                                L4e:
                                    r0 = move-exception
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4e
                                    X.C1328480kfu.LIZIZ(r2)     // Catch: java.lang.Throwable -> L75
                                    throw r0     // Catch: java.lang.Throwable -> L75
                                L56:
                                    r0 = move-exception
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L56
                                    X.C1323050kX9.LJII(r1)     // Catch: java.lang.Throwable -> L75
                                    throw r0     // Catch: java.lang.Throwable -> L75
                                L5e:
                                    r0 = move-exception
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5e
                                    X.C1323050kX9.LJII(r2)     // Catch: java.lang.Throwable -> L75
                                    throw r0     // Catch: java.lang.Throwable -> L75
                                L66:
                                    X.0kfA<O> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L75
                                    r0.LIZJ(r4, r5)     // Catch: java.lang.Throwable -> L75
                                    goto L71
                                L6c:
                                    X.0kfA<O> r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L75
                                    r0.LIZJ(r4, r5)     // Catch: java.lang.Throwable -> L75
                                L71:
                                    X.C1336010ks3.LIZIZ()
                                    return
                                L75:
                                    r0 = move-exception
                                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L75
                                    X.C1336010ks3.LIZIZ()
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1327660kea.LJII(int, java.lang.Object):void");
                            }

                            {
                                this.LIZJ = interfaceC1325150kaX2;
                                this.LIZLLL = c592490NLrLIZ;
                                this.LJ = z2;
                            }
                        };
                        if (interfaceC1325690kbPLIZ.LJIIJ(id)) {
                            mapOf2 = C19871212ow.of("cached_value_found", "false");
                        }
                        interfaceC1325690kbPLIZ.LIZIZ(id, "EncodedMemoryCacheProducer", mapOf2);
                        this.LIZJ.LIZIZ(abstractC1328840kgU, interfaceC1327930kf1);
                        C1323050kX9.LJII(c1323050kX9);
                        C1336010ks3.LIZIZ();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1323050kX9.LJII(c1323050kX9);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C1336010ks3.LIZIZ();
                    throw th3;
                }
            }

            {
                this.LIZ = interfaceC1325150kaX;
                this.LIZIZ = interfaceC1325590kbF3;
                this.LIZJ = c1327710kef;
            }
        };
        C1327640keY c1327640keY6 = this.LIZIZ;
        c1327640keY6.getClass();
        return new C1327680kec(c1327640keY6.LJIIZILJ, interfaceC1327390ke93);
    }

    public final C1327850ket LJJIIJZLJL(AbstractC1327410keB abstractC1327410keB, InterfaceC1327290kdz[] interfaceC1327290kdzArr) {
        C1327980kf6 c1327980kf6LIZ = this.LIZIZ.LIZ(new C1327970kf5(LJJIIZ(abstractC1327410keB)), true, this.LJIIIZ);
        C1327640keY c1327640keY = this.LIZIZ;
        c1327640keY.getClass();
        C1328600kg6 c1328600kg6 = new C1328600kg6(c1327640keY.LJIIIZ.LIZJ(), c1327980kf6LIZ);
        this.LIZIZ.getClass();
        return LJJII(new C1327580keS(this.LIZIZ.LIZ(new C1327400keA(interfaceC1327290kdzArr), true, this.LJIIIZ), c1328600kg6));
    }

    public C1327620keW(ContentResolver contentResolver, C1327640keY c1327640keY, InterfaceC1328710kgH interfaceC1328710kgH, boolean z, C1325570kbD c1325570kbD, boolean z2, boolean z3, boolean z4, C1327140kdk c1327140kdk) {
        this.LIZ = contentResolver;
        this.LIZIZ = c1327640keY;
        this.LIZJ = interfaceC1328710kgH;
        this.LIZLLL = z;
        this.LJFF = c1325570kbD;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = c1327140kdk;
    }
}
