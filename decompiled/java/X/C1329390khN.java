package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0khN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329390khN implements InterfaceC1331330kkV {
    public static final InterfaceC1330350kiv LIZJ = LJFF("com.facebook.animated.gif.GifImage");
    public static final InterfaceC1330350kiv LIZLLL = LJFF("com.facebook.animated.webp.WebPImage");
    public static final InterfaceC1330350kiv LJ = LJFF("com.bytedance.fresco.animatedheif.HeifImage");
    public final InterfaceC1330360kiw LIZ;
    public final AbstractC1301670jyf LIZIZ;

    public static InterfaceC1330350kiv LJFF(String str) {
        try {
            return (InterfaceC1330350kiv) Class.forName(str).newInstance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C1329390khN(C1329570khf c1329570khf, AbstractC1301670jyf abstractC1301670jyf) {
        this.LIZ = c1329570khf;
        this.LIZIZ = abstractC1301670jyf;
    }

    public final List<C1323050kX9<Bitmap>> LIZJ(InterfaceC1329600khi interfaceC1329600khi, Bitmap.Config config) {
        C1329590khh c1329590khhLIZ = this.LIZ.LIZ(new C1329440khS(interfaceC1329600khi), null);
        final ArrayList arrayList = new ArrayList(c1329590khhLIZ.getFrameCount());
        C1329790ki1 c1329790ki1 = new C1329790ki1(c1329590khhLIZ, new InterfaceC1329880kiA() { // from class: X.0khX
            @Override // X.InterfaceC1329880kiA
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1329880kiA
            public final C1323050kX9<Bitmap> LIZ(int i, C1330000kiM c1330000kiM, boolean z) {
                return C1323050kX9.LJFF((C1323050kX9) arrayList.get(i));
            }
        });
        for (int i = 0; i < c1329590khhLIZ.getFrameCount(); i++) {
            C1323050kX9<Bitmap> c1323050kX9LIZ = LIZ(c1329590khhLIZ.getWidth(), c1329590khhLIZ.getHeight(), config);
            c1329790ki1.LIZLLL(i, c1323050kX9LIZ.get());
            arrayList.add(c1323050kX9LIZ);
        }
        return arrayList;
    }

    public final C1323050kX9<Bitmap> LIZ(int i, int i2, Bitmap.Config config) {
        C1323050kX9<Bitmap> c1323050kX9LJFF = this.LIZIZ.LJFF(i, i2, config);
        c1323050kX9LJFF.get().eraseColor(0);
        c1323050kX9LJFF.get().setHasAlpha(true);
        return c1323050kX9LJFF;
    }

    public final C1323050kX9<Bitmap> LIZIZ(InterfaceC1329600khi interfaceC1329600khi, Bitmap.Config config, int i) {
        C1323050kX9<Bitmap> c1323050kX9LIZ = LIZ(interfaceC1329600khi.getWidth(), interfaceC1329600khi.getHeight(), config);
        new C1329790ki1(this.LIZ.LIZ(new C1329440khS(interfaceC1329600khi), null), new InterfaceC1329880kiA() { // from class: X.0khb
            @Override // X.InterfaceC1329880kiA
            public final C1323050kX9<Bitmap> LIZ(int i2, C1330000kiM c1330000kiM, boolean z) {
                return null;
            }

            @Override // X.InterfaceC1329880kiA
            public final void LIZIZ() {
            }
        }).LIZLLL(i, c1323050kX9LIZ.get());
        return c1323050kX9LIZ;
    }

    public final List<C1323050kX9<Bitmap>> LIZLLL(InterfaceC1329600khi interfaceC1329600khi, Bitmap.Config config, int i) {
        C1329590khh c1329590khhLIZ = this.LIZ.LIZ(new C1329440khS(interfaceC1329600khi), null);
        int frameCount = c1329590khhLIZ.getFrameCount();
        if (i > frameCount) {
            i = frameCount;
        }
        c1329590khhLIZ.LJIIIIZZ = 1;
        final ArrayList arrayList = new ArrayList(i);
        C1329790ki1 c1329790ki1 = new C1329790ki1(c1329590khhLIZ, new InterfaceC1329880kiA() { // from class: X.0khY
            @Override // X.InterfaceC1329880kiA
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1329880kiA
            public final C1323050kX9<Bitmap> LIZ(int i2, C1330000kiM c1330000kiM, boolean z) {
                return C1323050kX9.LJFF((C1323050kX9) arrayList.get(i2));
            }
        });
        for (int i2 = 0; i2 < i; i2++) {
            C1323050kX9<Bitmap> c1323050kX9LIZ = LIZ(c1329590khhLIZ.getWidth(), c1329590khhLIZ.getHeight(), config);
            try {
                c1329790ki1.LIZLLL(i2, c1323050kX9LIZ.get());
                arrayList.add(c1323050kX9LIZ);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                Object[] objArr = new Object[0];
                if (C1328570kg3.LIZ.LIZIZ(5)) {
                    C1328570kg3.LIZ.w("AnimatedImageFactoryImp", C786410Ut5.k4(null, "preview decode failed", objArr), e);
                }
            }
        }
        return arrayList;
    }

    public final AbstractC1327750kej LJ(C1329360khK c1329360khK, InterfaceC1329600khi interfaceC1329600khi, C1330000kiM c1330000kiM) throws Throwable {
        List<C1323050kX9<Bitmap>> listLIZLLL;
        int frameCount;
        C1323050kX9<Bitmap> c1323050kX9LJFF = null;
        try {
            if (c1329360khK.LIZLLL) {
                frameCount = interfaceC1329600khi.getFrameCount() - 1;
            } else {
                frameCount = 0;
            }
            if (c1329360khK.LJFF) {
                return new C1325120kaU(LIZIZ(interfaceC1329600khi, c1329360khK.LJII, frameCount), C1328060kfE.LIZLLL, 0);
            }
            try {
                if (!C1328580kg4.LIZIZ(c1330000kiM)) {
                    if (c1329360khK.LJ) {
                        listLIZLLL = LIZJ(interfaceC1329600khi, c1329360khK.LJII);
                        ArrayList arrayList = (ArrayList) listLIZLLL;
                        if (arrayList.size() > frameCount) {
                            c1323050kX9LJFF = C1323050kX9.LJFF((C1323050kX9) arrayList.get(frameCount));
                        }
                    } else {
                        int i = c1329360khK.LIZJ;
                        if (i > 0) {
                            listLIZLLL = LIZLLL(interfaceC1329600khi, c1329360khK.LJII, i);
                            ArrayList arrayList2 = (ArrayList) listLIZLLL;
                            if (arrayList2.size() > frameCount) {
                                c1323050kX9LJFF = C1323050kX9.LJFF((C1323050kX9) arrayList2.get(frameCount));
                            }
                        } else {
                            listLIZLLL = null;
                        }
                    }
                    if (c1329360khK.LIZIZ && c1323050kX9LJFF == null) {
                        c1323050kX9LJFF = LIZIZ(interfaceC1329600khi, c1329360khK.LJII, frameCount);
                    }
                } else {
                    listLIZLLL = null;
                }
                C1329460khU c1329460khU = new C1329460khU(interfaceC1329600khi);
                c1329460khU.LIZIZ = C1323050kX9.LJFF(c1323050kX9LJFF);
                c1329460khU.LIZLLL = frameCount;
                c1329460khU.LIZJ = C1323050kX9.LIZIZ(listLIZLLL);
                c1329460khU.LJ = c1329360khK.LJIILJJIL;
                C1329380khM c1329380khM = new C1329380khM(c1329460khU.LIZ(), c1329360khK, c1330000kiM);
                C1323050kX9.LJII(c1323050kX9LJFF);
                C1323050kX9.LJI(listLIZLLL);
                return c1329380khM;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        C1323050kX9.LJI(listLIZLLL);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            listLIZLLL = null;
        }
    }
}
