package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0khn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329650khn implements InterfaceC1331320kkU {
    public static final Class<?> LJI = C1329650khn.class;
    public final AbstractC1301670jyf LIZ;
    public final InterfaceC1331310kkT LIZIZ;
    public final Bitmap.Config LIZJ;
    public final ExecutorService LIZLLL;
    public final SparseArray<Runnable> LJ = new SparseArray<>();
    public Object LJFF;

    public final void LIZ(final InterfaceC1329690khr interfaceC1329690khr, final InterfaceC1330960kju interfaceC1330960kju, final int i) {
        final int iHashCode = (interfaceC1330960kju.hashCode() * 31) + i;
        synchronized (this.LJ) {
            try {
                if (this.LJ.get(iHashCode) != null) {
                    C1328570kg3.LJIIJJI(LJI, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                } else {
                    if (interfaceC1329690khr.LIZJ(i, interfaceC1330960kju.getImageFormat(), interfaceC1330960kju.LIZ())) {
                        C1328570kg3.LJIIJJI(LJI, "Frame %d is cached already.", Integer.valueOf(i));
                        return;
                    }
                    Runnable runnable = new Runnable(interfaceC1330960kju, interfaceC1329690khr, i, iHashCode) { // from class: X.0khm
                        public final InterfaceC1329690khr LL;
                        public final InterfaceC1330960kju LLILLJJLI;
                        public final int LLILLL;
                        public final int LLILZ;

                        public final void LIZ() {
                            try {
                                if (this.LL.LIZJ(this.LLILLL, this.LLILLJJLI.getImageFormat(), this.LLILLJJLI.LIZ())) {
                                    C1328570kg3.LJIIJJI(C1329650khn.LJI, "Frame %d is cached already.", Integer.valueOf(this.LLILLL));
                                    synchronized (this.LLILZIL.LJ) {
                                        try {
                                            this.LLILZIL.LJ.remove(this.LLILZ);
                                        } finally {
                                        }
                                    }
                                    return;
                                }
                                if (LIZIZ(this.LLILLL, 1)) {
                                    C1328570kg3.LJIIJJI(C1329650khn.LJI, "Prepared frame frame %d.", Integer.valueOf(this.LLILLL));
                                } else {
                                    C1328570kg3.LJ(C1329650khn.LJI, "Could not prepare frame %d.", Integer.valueOf(this.LLILLL));
                                }
                                synchronized (this.LLILZIL.LJ) {
                                    try {
                                        this.LLILZIL.LJ.remove(this.LLILZ);
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                synchronized (this.LLILZIL.LJ) {
                                    try {
                                        this.LLILZIL.LJ.remove(this.LLILZ);
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DefaultBitmapFramePreparer$FrameDecodeRunnable@ae7.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("DefaultBitmapFramePreparer$FrameDecodeRunnable@ae7.run");
                        }

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
                        public final boolean LIZIZ(int i2, int i3) {
                            C1323050kX9 c1323050kX9LJI;
                            int i4 = 2;
                            try {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        return false;
                                    }
                                    try {
                                        if (C1328730kgJ.LJII) {
                                            AbstractC1301670jyf abstractC1301670jyf = this.LLILZIL.LIZ;
                                            int iLJFF = this.LLILLJJLI.LJFF();
                                            int iLJII = this.LLILLJJLI.LJII();
                                            C1329650khn c1329650khn = this.LLILZIL;
                                            c1323050kX9LJI = abstractC1301670jyf.LIZIZ(iLJFF, iLJII, c1329650khn.LIZJ, c1329650khn.LJFF);
                                        } else {
                                            c1323050kX9LJI = this.LLILZIL.LIZ.LIZIZ(this.LLILLJJLI.LJFF(), this.LLILLJJLI.LJII(), this.LLILZIL.LIZJ, null);
                                        }
                                        i4 = -1;
                                    } catch (RuntimeException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C1328570kg3.LJIILLIIL(C1329650khn.LJI, "Failed to create frame bitmap", e);
                                        return false;
                                    }
                                } else {
                                    InterfaceC1329690khr interfaceC1329690khr2 = this.LL;
                                    this.LLILLJJLI.LJFF();
                                    this.LLILLJJLI.LJII();
                                    c1323050kX9LJI = interfaceC1329690khr2.LJI(this.LLILLJJLI.getImageFormat(), this.LLILLJJLI.LIZ());
                                }
                                boolean zLIZJ = LIZJ(i2, c1323050kX9LJI, i3);
                                C1323050kX9.LJII(c1323050kX9LJI);
                                if (!zLIZJ && i4 != -1) {
                                    return LIZIZ(i2, i4);
                                }
                                return zLIZJ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1323050kX9.LJII(null);
                                throw th;
                            }
                        }

                        public final boolean LIZJ(int i2, C1323050kX9<Bitmap> c1323050kX9, int i3) {
                            if (!C1323050kX9.LJIJJ(c1323050kX9)) {
                                return false;
                            }
                            if (!((C1329620khk) this.LLILZIL.LIZIZ).LIZ(i2, c1323050kX9.get())) {
                                return false;
                            }
                            C1328570kg3.LJIIJJI(C1329650khn.LJI, "Frame %d ready.", Integer.valueOf(this.LLILLL));
                            synchronized (this.LLILZIL.LJ) {
                                try {
                                    this.LL.LJFF(this.LLILLL, c1323050kX9, this.LLILLJJLI.getImageFormat(), this.LLILLJJLI.LIZ());
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return true;
                        }

                        {
                            this.LLILLJJLI = interfaceC1330960kju;
                            this.LL = interfaceC1329690khr;
                            this.LLILLL = i;
                            this.LLILZ = iHashCode;
                        }
                    };
                    this.LJ.put(iHashCode, runnable);
                    this.LIZLLL.execute(runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1329650khn(AbstractC1301670jyf abstractC1301670jyf, C1329620khk c1329620khk, Bitmap.Config config, ExecutorService executorService) {
        this.LIZ = abstractC1301670jyf;
        this.LIZIZ = c1329620khk;
        this.LIZJ = config;
        this.LIZLLL = executorService;
    }
}
