package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.bitmap.cache.FrescoFrameCache;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0khH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329330khH implements InterfaceC1320130kSR {
    public final InterfaceC1330360kiw LIZ;
    public final ScheduledExecutorService LIZIZ;
    public final ExecutorService LIZJ;
    public final InterfaceC1331160kkE LIZLLL;
    public final AbstractC1301670jyf LJ;
    public final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LJFF;
    public final C1325080kaQ<InterfaceC1324680kZm, Bitmap> LJI;
    public final InterfaceC1320070kSL<Integer> LJII;
    public final InterfaceC1320070kSL<Integer> LJIIIIZZ;

    @Override // X.InterfaceC1320130kSR
    public final boolean LIZIZ(AbstractC1327750kej abstractC1327750kej) {
        return abstractC1327750kej instanceof C1329380khM;
    }

    public final C1325020kaK LIZLLL(C1329440khS c1329440khS) {
        int iHashCode;
        int size;
        if (TextUtils.isEmpty(c1329440khS.LJ)) {
            iHashCode = c1329440khS.hashCode();
        } else {
            iHashCode = c1329440khS.LJ.hashCode();
        }
        C1325020kaK c1325020kaK = new C1325020kaK(new C1322470kWD(iHashCode), this.LJFF);
        synchronized (c1329440khS) {
            List<C1323050kX9<Bitmap>> list = c1329440khS.LIZLLL;
            if (list != null) {
                size = ((ArrayList) list).size();
            } else {
                size = 0;
            }
        }
        if (size > 0) {
            int i = 0;
            do {
                if (c1329440khS.LIZJ(i)) {
                    C1323050kX9 c1323050kX9LJIJJLI = null;
                    try {
                        c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(new C1325120kaU(c1329440khS.LIZIZ(i), C1328060kfE.LIZLLL, 0));
                        c1325020kaK.LIZ(c1323050kX9LJIJJLI, i);
                        C1323050kX9.LJII(c1323050kX9LJIJJLI);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJIJJLI);
                        throw th;
                    }
                }
                i++;
            } while (i < size);
        }
        return c1325020kaK;
    }

    public final C1324930kaB LJ(C1329440khS c1329440khS) {
        int iHashCode;
        if (TextUtils.isEmpty(c1329440khS.LJ)) {
            iHashCode = c1329440khS.hashCode();
        } else {
            iHashCode = c1329440khS.LJ.hashCode();
        }
        return new C1324930kaB(new C1322470kWD(iHashCode), this.LJI);
    }

    @Override // X.InterfaceC1320130kSR
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final AnimatedDrawable2 LIZJ(AbstractC1327750kej abstractC1327750kej) {
        InterfaceC1329690khr frescoFrameCache;
        C1329660kho c1329660kho;
        C1329650khn c1329650khn;
        C1329380khM c1329380khM = (C1329380khM) abstractC1327750kej;
        C1329440khS c1329440khSLIZIZ = c1329380khM.LIZIZ();
        C1330000kiM imageFormat = null;
        if (c1329440khSLIZIZ.LIZ.getFrameCount() <= 0) {
            return null;
        }
        int iIntValue = this.LJII.get().intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    frescoFrameCache = new C1329920kiE();
                } else {
                    frescoFrameCache = new InterfaceC1329690khr() { // from class: X.0kaR
                        public int LIZ = -1;
                        public C1323050kX9<Bitmap> LIZIZ;

                        @Override // X.InterfaceC1329690khr
                        public final synchronized C1323050kX9 LIZIZ() {
                            return C1323050kX9.LJFF(this.LIZIZ);
                        }

                        @Override // X.InterfaceC1329690khr
                        public final void LJFF(int i, C1323050kX9 c1323050kX9, C1330000kiM c1330000kiM, boolean z) {
                        }

                        public final synchronized void LJII() {
                            C1323050kX9.LJII(this.LIZIZ);
                            this.LIZIZ = null;
                            this.LIZ = -1;
                        }

                        @Override // X.InterfaceC1329690khr
                        public final synchronized void LIZ(C1330000kiM c1330000kiM, boolean z) {
                            LJII();
                        }

                        @Override // X.InterfaceC1329690khr
                        public final synchronized C1323050kX9 LJI(C1330000kiM c1330000kiM, boolean z) {
                            C1323050kX9 c1323050kX9LJFF;
                            try {
                                c1323050kX9LJFF = C1323050kX9.LJFF(this.LIZIZ);
                                LJII();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                LJII();
                                throw th;
                            }
                            return c1323050kX9LJFF;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
                        @Override // X.InterfaceC1329690khr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final synchronized boolean LIZJ(int r2, X.C1330000kiM r3, boolean r4) {
                            /*
                                r1 = this;
                                monitor-enter(r1)
                                int r0 = r1.LIZ     // Catch: java.lang.Throwable -> L13
                                if (r2 != r0) goto Le
                                X.0kX9<android.graphics.Bitmap> r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L13
                                boolean r0 = X.C1323050kX9.LJIJJ(r0)     // Catch: java.lang.Throwable -> L13
                                if (r0 == 0) goto Le
                                goto L10
                            Le:
                                r0 = 0
                                goto L11
                            L10:
                                r0 = 1
                            L11:
                                monitor-exit(r1)
                                return r0
                            L13:
                                r0 = move-exception
                                monitor-exit(r1)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1325090kaR.LIZJ(int, X.0kiM, boolean):boolean");
                        }

                        @Override // X.InterfaceC1329690khr
                        public final synchronized C1323050kX9<Bitmap> LIZLLL(int i, C1330000kiM c1330000kiM, boolean z) {
                            if (this.LIZ == i) {
                                return C1323050kX9.LJFF(this.LIZIZ);
                            }
                            return null;
                        }

                        @Override // X.InterfaceC1329690khr
                        public final synchronized void LJ(int i, C1323050kX9 c1323050kX9, C1330000kiM c1330000kiM, boolean z) {
                            if (c1323050kX9 != null) {
                                if (this.LIZIZ != null && ((Bitmap) c1323050kX9.get()).equals(this.LIZIZ.get())) {
                                    return;
                                }
                                C1323050kX9.LJII(this.LIZIZ);
                                this.LIZIZ = C1323050kX9.LJFF(c1323050kX9);
                                this.LIZ = i;
                                return;
                            }
                            C1323050kX9.LJII(this.LIZIZ);
                            this.LIZIZ = C1323050kX9.LJFF(c1323050kX9);
                            this.LIZ = i;
                            return;
                        }
                    };
                }
            } else {
                frescoFrameCache = new FrescoFrameCache(LIZLLL(c1329440khSLIZIZ), LJ(c1329440khSLIZIZ), false);
            }
        } else {
            frescoFrameCache = new FrescoFrameCache(LIZLLL(c1329440khSLIZIZ), LJ(c1329440khSLIZIZ), true);
        }
        int decodeStatus = c1329440khSLIZIZ.LIZ.getDecodeStatus();
        C1329440khS c1329440khSLIZIZ2 = c1329380khM.LIZIZ();
        InterfaceC1329600khi interfaceC1329600khi = c1329440khSLIZIZ2.LIZ;
        C1329590khh c1329590khhLIZ = this.LIZ.LIZ(c1329440khSLIZIZ2, new Rect(0, 0, interfaceC1329600khi.getWidth(), interfaceC1329600khi.getHeight()));
        C1329620khk c1329620khk = new C1329620khk(frescoFrameCache, c1329590khhLIZ);
        int iIntValue2 = c1329380khM.LLILLJJLI.LIZJ;
        if (iIntValue2 <= 0) {
            iIntValue2 = this.LJIIIIZZ.get().intValue();
        }
        C1332310km5 c1332310km5 = C1328130kfL.LJIILIIL().LIZIZ.LIZ().LIZ.LJJIIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        ((Boolean) c1332310km5.LIZ()).booleanValue();
        if (iIntValue2 > 0 && (!C1328580kg4.LIZIZ(c1329380khM.getImageFormat()) || C1328130kfL.LJIILIIL().LJJI() || C1328130kfL.LJIILIIL().LJJIFFI())) {
            c1329660kho = new C1329660kho(iIntValue2);
            C1329360khK c1329360khK = c1329380khM.LLILLJJLI;
            c1329650khn = new C1329650khn(this.LJ, c1329620khk, c1329360khK.LJII, this.LIZJ);
            c1329650khn.LJFF = c1329360khK.LJIIJ;
        } else {
            c1329660kho = null;
            c1329650khn = null;
        }
        C1329630khl c1329630khl = new C1329630khl(this.LJ, frescoFrameCache, new C1329980kiK(c1329590khhLIZ), c1329620khk, c1329660kho, c1329650khn, c1329380khM.LLILLJJLI);
        c1329630khl.LJIIJ = c1329380khM.LLILLJJLI.LJII;
        c1329630khl.LJIIJJI = c1329380khM.getImageFormat();
        c1329630khl.LJIIL = c1329380khM.LLILLJJLI.LJIILJJIL;
        InterfaceC1329600khi interfaceC1329600khiLIZ = c1329380khM.LIZ();
        if (interfaceC1329600khiLIZ != null) {
            imageFormat = interfaceC1329600khiLIZ.getImageFormat();
        }
        return new AnimatedDrawable2(new C1330940kjs(imageFormat, c1329630khl, c1329630khl, this.LIZLLL, this.LIZIZ), c1329380khM.LLILLJJLI.LJIIJ, frescoFrameCache, decodeStatus, c1329440khSLIZIZ.LIZ.getImageFormat());
    }

    @Override // X.InterfaceC1320130kSR
    public final Drawable LIZ(AbstractC1327750kej abstractC1327750kej, Drawable drawable) {
        C1329440khS c1329440khSLIZJ;
        InterfaceC1329600khi interfaceC1329600khi;
        C1329660kho c1329660kho;
        C1329650khn c1329650khn;
        C1329380khM c1329380khM = (C1329380khM) abstractC1327750kej;
        C1329440khS c1329440khSLIZIZ = c1329380khM.LIZIZ();
        int decodeStatus = c1329440khSLIZIZ.LIZ.getDecodeStatus();
        if (c1329440khSLIZIZ.LIZ.getFrameCount() <= 0) {
            return drawable;
        }
        if ((drawable instanceof AnimatedDrawable2) && (decodeStatus == 2 || decodeStatus == 3)) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) drawable;
            InterfaceC1329690khr interfaceC1329690khr = animatedDrawable2.LLILZIL;
            InterfaceC1329600khi interfaceC1329600khi2 = c1329440khSLIZIZ.LIZ;
            InterfaceC1330960kju interfaceC1330960kju = animatedDrawable2.LLILLL;
            if (interfaceC1330960kju instanceof C1330930kjr) {
                T t = ((C1330930kjr) interfaceC1330960kju).LIZIZ;
                if ((t instanceof C1329630khl) && (c1329440khSLIZJ = ((C1329980kiK) ((C1329630khl) t).LIZJ).LIZ.LIZJ()) != null && (interfaceC1329600khi = c1329440khSLIZJ.LIZ) != null && interfaceC1329600khi2 != null && interfaceC1329600khi2 != interfaceC1329600khi) {
                    InterfaceC1329600khi interfaceC1329600khi3 = c1329440khSLIZIZ.LIZ;
                    C1329590khh c1329590khhLIZ = this.LIZ.LIZ(c1329440khSLIZIZ, new Rect(0, 0, interfaceC1329600khi3.getWidth(), interfaceC1329600khi3.getHeight()));
                    C1329620khk c1329620khk = new C1329620khk(interfaceC1329690khr, c1329590khhLIZ);
                    int iIntValue = this.LJIIIIZZ.get().intValue();
                    if (iIntValue > 0 && !C1328580kg4.LIZIZ(abstractC1327750kej.getImageFormat())) {
                        c1329660kho = new C1329660kho(iIntValue);
                        C1329360khK c1329360khK = c1329380khM.LLILLJJLI;
                        c1329650khn = new C1329650khn(this.LJ, c1329620khk, c1329360khK.LJII, this.LIZJ);
                        c1329650khn.LJFF = c1329360khK.LJIIJ;
                    } else {
                        c1329660kho = null;
                        c1329650khn = null;
                    }
                    C1329630khl c1329630khl = new C1329630khl(this.LJ, interfaceC1329690khr, new C1329980kiK(c1329590khhLIZ), c1329620khk, c1329660kho, c1329650khn, c1329380khM.LLILLJJLI);
                    c1329630khl.LJIIJ = c1329380khM.LLILLJJLI.LJII;
                    c1329630khl.LJIIJJI = c1329380khM.getImageFormat();
                    c1329630khl.LJIIL = c1329380khM.LLILLJJLI.LJIILJJIL;
                    C1330940kjs c1330940kjs = new C1330940kjs(c1329630khl, c1329630khl, this.LIZLLL, this.LIZIZ);
                    Object obj = c1329380khM.LLILLJJLI.LJIIJ;
                    animatedDrawable2.LLILLL = c1330940kjs;
                    if (animatedDrawable2.LLILZ != null) {
                        InterfaceC1330990kjx interfaceC1330990kjxLIZIZ = AnimatedDrawable2.LIZIZ(decodeStatus, c1330940kjs, animatedDrawable2.LLILZLL, obj);
                        InterfaceC1330990kjx interfaceC1330990kjxLJ = animatedDrawable2.LLILZ.LJ(interfaceC1330990kjxLIZIZ);
                        if (interfaceC1330990kjxLJ != null) {
                            interfaceC1330990kjxLIZIZ = interfaceC1330990kjxLJ;
                        }
                        animatedDrawable2.LLILZ = interfaceC1330990kjxLIZIZ;
                    }
                    return animatedDrawable2;
                }
            }
            return animatedDrawable2;
        }
        return LIZJ(abstractC1327750kej);
    }

    public C1329330khH(InterfaceC1330360kiw interfaceC1330360kiw, C822690WPb c822690WPb, ExecutorServiceC1329930kiF executorServiceC1329930kiF, RealtimeSinceBootClock realtimeSinceBootClock, AbstractC1301670jyf abstractC1301670jyf, C1329310khF c1329310khF, C1325080kaQ c1325080kaQ, C1329550khd c1329550khd, C1329720khu c1329720khu) {
        this.LIZ = interfaceC1330360kiw;
        this.LIZIZ = c822690WPb;
        this.LIZJ = executorServiceC1329930kiF;
        this.LIZLLL = realtimeSinceBootClock;
        this.LJ = abstractC1301670jyf;
        this.LJFF = c1329310khF;
        this.LJI = c1325080kaQ;
        this.LJII = c1329550khd;
        this.LJIIIIZZ = c1329720khu;
    }
}
