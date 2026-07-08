package X;

import Y.ARunnableS103S0100000_3;
import Y.AkS468S0100000_3;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.09MI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MI extends C09MA {
    public String LIZLLL;
    public final String LJ;
    public final BitmapFactory.Options LJFF;
    public C09AK<Integer> LJI;
    public int LJII;
    public final Set<String> LJIIIIZZ;
    public final boolean LJIIIZ;
    public BitmapRegionDecoder LJIIJ;
    public C11OP LJIIJJI;
    public C11LR LJIIL;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.09MK] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.11Pk] */
    public final void LIZIZ() {
        if (this.LJIIJJI == null || this.LJI == null) {
            final ?? r2 = new C09ML() { // from class: X.09MK
                @Override // X.C09ML
                public final void LIZ(AbstractC19495811Pg abstractC19495811Pg) {
                    this.LIZ.LJI = abstractC19495811Pg;
                }
            };
            final EnumC19496911Pr enumC19496911Pr = EnumC19496911Pr.LATEST;
            int i = C11NN.LL;
            C1701890uOB.LIZ(enumC19496911Pr, "mode is null");
            final ?? r3 = new C11NN<T>(r2, enumC19496911Pr) { // from class: X.11Pk
                public final C09ML<T> LLILLJJLI;
                public final EnumC19496911Pr LLILLL;

                @Override // X.C11NN
                public final void LJIILLIIL(final C11M9<? super T> c11m9) throws Throwable {
                    AbstractC19495811Pg abstractC19495811Pg;
                    int i2 = C19496711Pp.LIZ[this.LLILLL.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    final int i3 = C11NN.LL;
                                    abstractC19495811Pg = new AbstractC19495811Pg<T>(c11m9, i3) { // from class: X.11Pj
                                        public static final long serialVersionUID = 2427151001689639875L;
                                        public final C19500111Qx<T> LLILLL;
                                        public Throwable LLILZ;
                                        public volatile boolean LLILZIL;
                                        public final AtomicInteger LLILZLL = new AtomicInteger();

                                        @Override // X.AbstractC19495811Pg, X.InterfaceC947803nA
                                        public final void onComplete() {
                                            this.LLILZIL = true;
                                            LJ();
                                        }

                                        @Override // X.AbstractC19495811Pg
                                        public final void LIZLLL() {
                                            if (this.LLILZLL.getAndIncrement() == 0) {
                                                this.LLILLL.clear();
                                            }
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
                                        
                                            if (r2 == 0) goto L38;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
                                        
                                            X.C19492311Nx.LIZJ(r12, r2);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
                                        
                                            r7 = r12.LLILZLL.addAndGet(-r7);
                                         */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void LJ() {
                                            /*
                                                r12 = this;
                                                java.util.concurrent.atomic.AtomicInteger r0 = r12.LLILZLL
                                                int r0 = r0.getAndIncrement()
                                                if (r0 == 0) goto L9
                                                return
                                            L9:
                                                X.11M9<? super T> r6 = r12.LL
                                                X.11Qx<T> r5 = r12.LLILLL
                                                r7 = 1
                                            Le:
                                                long r10 = r12.get()
                                                r8 = 0
                                                r2 = 0
                                            L16:
                                                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                                                if (r0 == 0) goto L3b
                                                boolean r0 = r12.isCancelled()
                                                if (r0 == 0) goto L24
                                                r5.clear()
                                                return
                                            L24:
                                                boolean r4 = r12.LLILZIL
                                                java.lang.Object r1 = r5.poll()
                                                if (r1 != 0) goto L39
                                                r0 = 1
                                            L2d:
                                                if (r4 == 0) goto L57
                                                if (r0 == 0) goto L6a
                                                java.lang.Throwable r0 = r12.LLILZ
                                                if (r0 == 0) goto L71
                                                r12.LIZIZ(r0)
                                                return
                                            L39:
                                                r0 = 0
                                                goto L2d
                                            L3b:
                                                boolean r0 = r12.isCancelled()
                                                if (r0 == 0) goto L45
                                                r5.clear()
                                                return
                                            L45:
                                                boolean r1 = r12.LLILZIL
                                                boolean r0 = r5.isEmpty()
                                                if (r1 == 0) goto L59
                                                if (r0 == 0) goto L59
                                                java.lang.Throwable r0 = r12.LLILZ
                                                if (r0 == 0) goto L75
                                                r12.LIZIZ(r0)
                                                return
                                            L57:
                                                if (r0 == 0) goto L6a
                                            L59:
                                                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                                                if (r0 == 0) goto L60
                                                X.C19492311Nx.LIZJ(r12, r2)
                                            L60:
                                                java.util.concurrent.atomic.AtomicInteger r1 = r12.LLILZLL
                                                int r0 = -r7
                                                int r7 = r1.addAndGet(r0)
                                                if (r7 != 0) goto Le
                                                return
                                            L6a:
                                                r6.onNext(r1)
                                                r0 = 1
                                                long r2 = r2 + r0
                                                goto L16
                                            L71:
                                                r12.LIZ()
                                                return
                                            L75:
                                                r12.LIZ()
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C19496111Pj.LJ():void");
                                        }

                                        @Override // X.AbstractC19495811Pg
                                        public final void LIZJ() {
                                            LJ();
                                        }

                                        @Override // X.AbstractC19495811Pg, X.InterfaceC947803nA
                                        public final void onNext(T t) {
                                            if (!this.LLILZIL && !isCancelled()) {
                                                if (t == null) {
                                                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                                                } else {
                                                    this.LLILLL.offer(t);
                                                    LJ();
                                                }
                                            }
                                        }

                                        @Override // X.AbstractC19495811Pg
                                        public final boolean tryOnError(Throwable th) {
                                            if (!this.LLILZIL && !isCancelled()) {
                                                if (th == null) {
                                                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                                                }
                                                this.LLILZ = th;
                                                this.LLILZIL = true;
                                                LJ();
                                                return true;
                                            }
                                            return false;
                                        }

                                        {
                                            this.LLILLL = new C19500111Qx<>(i3);
                                        }
                                    };
                                } else {
                                    abstractC19495811Pg = new AbstractC19495811Pg<T>(c11m9) { // from class: X.11Pi
                                        public static final long serialVersionUID = 4023437720691792495L;
                                        public Throwable LLILZ;
                                        public volatile boolean LLILZIL;
                                        public final AtomicReference<T> LLILLL = new AtomicReference<>();
                                        public final AtomicInteger LLILZLL = new AtomicInteger();

                                        @Override // X.AbstractC19495811Pg, X.InterfaceC947803nA
                                        public final void onComplete() {
                                            this.LLILZIL = true;
                                            LJ();
                                        }

                                        @Override // X.AbstractC19495811Pg
                                        public final void LIZLLL() {
                                            if (this.LLILZLL.getAndIncrement() == 0) {
                                                this.LLILLL.lazySet(null);
                                            }
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
                                        
                                            if (r2 == 0) goto L40;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
                                        
                                            X.C19492311Nx.LIZJ(r12, r2);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
                                        
                                            r7 = r12.LLILZLL.addAndGet(-r7);
                                         */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void LJ() {
                                            /*
                                                r12 = this;
                                                java.util.concurrent.atomic.AtomicInteger r0 = r12.LLILZLL
                                                int r0 = r0.getAndIncrement()
                                                if (r0 == 0) goto L9
                                                return
                                            L9:
                                                X.11M9<? super T> r6 = r12.LL
                                                java.util.concurrent.atomic.AtomicReference<T> r5 = r12.LLILLL
                                                r7 = 1
                                            Le:
                                                long r10 = r12.get()
                                                r8 = 0
                                                r2 = 0
                                            L16:
                                                int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                                                r4 = 0
                                                r1 = 0
                                                if (r0 == 0) goto L3d
                                                boolean r0 = r12.isCancelled()
                                                if (r0 == 0) goto L26
                                                r5.lazySet(r1)
                                                return
                                            L26:
                                                boolean r4 = r12.LLILZIL
                                                java.lang.Object r1 = r5.getAndSet(r1)
                                                if (r1 != 0) goto L3b
                                                r0 = 1
                                            L2f:
                                                if (r4 == 0) goto L5c
                                                if (r0 == 0) goto L6f
                                                java.lang.Throwable r0 = r12.LLILZ
                                                if (r0 == 0) goto L76
                                                r12.LIZIZ(r0)
                                                return
                                            L3b:
                                                r0 = 0
                                                goto L2f
                                            L3d:
                                                boolean r0 = r12.isCancelled()
                                                if (r0 == 0) goto L47
                                                r5.lazySet(r1)
                                                return
                                            L47:
                                                boolean r1 = r12.LLILZIL
                                                java.lang.Object r0 = r5.get()
                                                if (r0 != 0) goto L50
                                                r4 = 1
                                            L50:
                                                if (r1 == 0) goto L5e
                                                if (r4 == 0) goto L5e
                                                java.lang.Throwable r0 = r12.LLILZ
                                                if (r0 == 0) goto L7a
                                                r12.LIZIZ(r0)
                                                return
                                            L5c:
                                                if (r0 == 0) goto L6f
                                            L5e:
                                                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                                                if (r0 == 0) goto L65
                                                X.C19492311Nx.LIZJ(r12, r2)
                                            L65:
                                                java.util.concurrent.atomic.AtomicInteger r1 = r12.LLILZLL
                                                int r0 = -r7
                                                int r7 = r1.addAndGet(r0)
                                                if (r7 != 0) goto Le
                                                return
                                            L6f:
                                                r6.onNext(r1)
                                                r0 = 1
                                                long r2 = r2 + r0
                                                goto L16
                                            L76:
                                                r12.LIZ()
                                                return
                                            L7a:
                                                r12.LIZ()
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C19496011Pi.LJ():void");
                                        }

                                        @Override // X.AbstractC19495811Pg
                                        public final void LIZJ() {
                                            LJ();
                                        }

                                        @Override // X.AbstractC19495811Pg, X.InterfaceC947803nA
                                        public final void onNext(T t) {
                                            if (!this.LLILZIL && !isCancelled()) {
                                                if (t == null) {
                                                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                                                } else {
                                                    this.LLILLL.set(t);
                                                    LJ();
                                                }
                                            }
                                        }

                                        @Override // X.AbstractC19495811Pg
                                        public final boolean tryOnError(Throwable th) {
                                            if (!this.LLILZIL && !isCancelled()) {
                                                if (th == null) {
                                                    onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                                                }
                                                this.LLILZ = th;
                                                this.LLILZIL = true;
                                                LJ();
                                                return true;
                                            }
                                            return false;
                                        }
                                    };
                                }
                            } else {
                                abstractC19495811Pg = new AbstractC19496411Pm<T>(c11m9) { // from class: X.11Po
                                    public static final long serialVersionUID = 8360058422307496563L;

                                    @Override // X.AbstractC19496411Pm
                                    public final void LJ() {
                                    }
                                };
                            }
                        } else {
                            abstractC19495811Pg = new AbstractC19496411Pm<T>(c11m9) { // from class: X.11Pn
                                public static final long serialVersionUID = 338953216916120960L;

                                @Override // X.AbstractC19496411Pm
                                public final void LJ() {
                                    onError(new C11MF("create: could not emit value due to lack of requests"));
                                }
                            };
                        }
                    } else {
                        abstractC19495811Pg = new AbstractC19495811Pg<T>(c11m9) { // from class: X.11Pl
                            public static final long serialVersionUID = 3776720187248809713L;

                            @Override // X.AbstractC19495811Pg, X.InterfaceC947803nA
                            public final void onNext(T t) {
                                long j;
                                if (isCancelled()) {
                                    return;
                                }
                                if (t != null) {
                                    this.LL.onNext(t);
                                    do {
                                        j = get();
                                        if (j == 0) {
                                            return;
                                        }
                                    } while (!compareAndSet(j, j - 1));
                                    return;
                                }
                                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                            }
                        };
                    }
                    c11m9.onSubscribe(abstractC19495811Pg);
                    try {
                        this.LLILLJJLI.LIZ(abstractC19495811Pg);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C11SP.LIZ(th);
                        abstractC19495811Pg.onError(th);
                    }
                }

                {
                    this.LLILLJJLI = r2;
                    this.LLILLL = enumC19496911Pr;
                }
            };
            final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            final C11RO c11ro = C11S5.LIZIZ;
            C1701890uOB.LIZ(timeUnit, "unit is null");
            C1701890uOB.LIZ(c11ro, "scheduler is null");
            C11OP c11opLJIIJ = new C11M6<T, T>(r3, timeUnit, c11ro) { // from class: X.11OZ
                public final TimeUnit LLILZ;
                public final C11RO LLILZIL;
                public final long LLILLL = 100;
                public final boolean LLILZLL = false;

                @Override // X.C11NN
                public final void LJIILLIIL(C11M9<? super T> c11m9) {
                    final C11PH c11ph = new C11PH(c11m9);
                    if (this.LLILZLL) {
                        C11NN<T> c11nn = this.LLILLJJLI;
                        final long j = this.LLILLL;
                        final TimeUnit timeUnit2 = this.LLILZ;
                        final C11RO c11ro2 = this.LLILZIL;
                        c11nn.LJIILL(new AbstractRunnableC19492711Ob<T>(c11ph, j, timeUnit2, c11ro2) { // from class: X.11Oa
                            public static final long serialVersionUID = -7139995637533111443L;
                            public final AtomicInteger LLIZLLLIL = new AtomicInteger(1);

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                try {
                                    if (this.LLIZLLLIL.incrementAndGet() == 2) {
                                        LIZIZ();
                                        if (this.LLIZLLLIL.decrementAndGet() == 0) {
                                            this.LL.onComplete();
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                            }

                            @Override // X.AbstractRunnableC19492711Ob
                            public final void LIZ() {
                                LIZIZ();
                                if (this.LLIZLLLIL.decrementAndGet() == 0) {
                                    this.LL.onComplete();
                                }
                            }
                        });
                        return;
                    }
                    C11NN<T> c11nn2 = this.LLILLJJLI;
                    final long j2 = this.LLILLL;
                    final TimeUnit timeUnit3 = this.LLILZ;
                    final C11RO c11ro3 = this.LLILZIL;
                    c11nn2.LJIILL(new AbstractRunnableC19492711Ob<T>(c11ph, j2, timeUnit3, c11ro3) { // from class: X.11Oc
                        public static final long serialVersionUID = -7139995637533111443L;

                        @Override // X.AbstractRunnableC19492711Ob
                        public final void LIZ() {
                            this.LL.onComplete();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                LIZIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    });
                }

                {
                    this.LLILZ = timeUnit;
                    this.LLILZIL = c11ro;
                }
            }.LJIIJ(c11ro).LJIIIZ(new AkS468S0100000_3(this, 9)).LJIIIZ(new AkS468S0100000_3(this, 10)).LJIIJJI(3L, C19487811Me.LJI).LJIIJ(C1701940uOG.LIZIZ());
            this.LJIIJJI = c11opLJIIJ;
            c11opLJIIJ.subscribe(new C11M9<Object>() { // from class: X.09MJ
                @Override // X.C11M9
                public final void onComplete() {
                }

                @Override // X.C11M9
                public final void onError(Throwable th) {
                }

                @Override // X.C11M9
                public final void onNext(Object obj) {
                    if (obj instanceof Bitmap) {
                        this.LL.LIZIZ.setImageBitmap((Bitmap) obj);
                    }
                }

                @Override // X.C11M9
                public final void onSubscribe(C11LR c11lr) {
                    if (c11lr != null) {
                        c11lr.request(Long.MAX_VALUE);
                    }
                    this.LL.LJIIL = c11lr;
                }
            });
        }
    }

    public final void LIZLLL() {
        this.LIZIZ.setImageBitmap(null);
        this.LJII = 0;
        C810560Vqw.LJ(new ARunnableS103S0100000_3(this, 80));
        if (this.LJIIIZ) {
            this.LJIIIIZZ.clear();
        }
        if (LIZ()) {
            LIZIZ();
        }
    }

    public final Bitmap.CompressFormat LJFF() {
        if (TextUtils.equals(this.LIZLLL, "webp")) {
            return Bitmap.CompressFormat.WEBP;
        }
        if (TextUtils.equals(this.LIZLLL, "png")) {
            return Bitmap.CompressFormat.PNG;
        }
        if (TextUtils.equals(this.LIZLLL, "jpg") || TextUtils.equals(this.LIZLLL, "jpeg")) {
            return Bitmap.CompressFormat.JPEG;
        }
        return null;
    }

    public final void LJI(int i) {
        Video video;
        List<BigThumb> bigThumbs;
        int i2;
        if (!LIZ()) {
            return;
        }
        if (this.LJIIJJI == null || this.LJI == null) {
            LIZIZ();
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && (video = aweme.getVideo()) != null && (bigThumbs = video.getBigThumbs()) != null && (!bigThumbs.isEmpty()) && this.LJII != (i2 = (int) (((double) (i / 10000.0f)) * ((BigThumb) ListProtector.get(bigThumbs, 0)).duration))) {
            this.LJII = i2;
            C09AK<Integer> c09ak = this.LJI;
            if (c09ak != null) {
                c09ak.onNext(Integer.valueOf(i2));
            }
        }
    }

    public static Rect LIZJ(float f, BigThumb bigThumb) {
        long j = ((int) f) / ((int) bigThumb.interval);
        long j2 = bigThumb.imgXLen;
        Rect rect = new Rect();
        long j3 = bigThumb.imgYSize;
        int i = (int) ((j / j2) * j3);
        rect.top = i;
        long j4 = bigThumb.imgXSize;
        int i2 = (int) ((j % j2) * j4);
        rect.left = i2;
        rect.bottom = (int) (((long) i) + j3);
        rect.right = (int) (((long) i2) + j4);
        return rect;
    }

    public final String LJ(int i, BigThumb bigThumb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        sbLIZ.append("/thumbs/");
        sbLIZ.append(((String) ListProtector.get(bigThumb.imgUris, i)).hashCode());
        sbLIZ.append('.');
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C09MI(android.content.Context r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, android.widget.ImageView r5) {
        /*
            r2 = this;
            r2.<init>(r4, r5)
            java.lang.String r0 = "jpg"
            r2.LIZLLL = r0
            java.io.File r0 = X.C786410Ut5.w2(r3)
            if (r0 != 0) goto L11
            java.io.File r0 = X.C2354709Kn.LJIIIZ(r3)
        L11:
            java.lang.String r0 = r0.getAbsolutePath()
            r2.LJ = r0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r0
            r2.LJFF = r1
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r2.LJIIIIZZ = r0
            X.01GW r0 = X.C1867340yh2.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.experiment.SeekBarThumbnailExperimentV2Data r0 = (com.ss.android.ugc.aweme.feed.experiment.SeekBarThumbnailExperimentV2Data) r0
            if (r0 == 0) goto L42
            boolean r1 = r0.avoidMultiTimeDownload
            r0 = 1
            if (r1 != r0) goto L42
        L3c:
            r2.LJIIIZ = r0
            r2.LIZLLL()
            return
        L42:
            r0 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09MI.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.widget.ImageView):void");
    }
}
