package X;

import Y.AUListenerS269S0100000_20;
import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0ji9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291430ji9 extends Drawable implements Drawable.Callback, Animatable {
    public final Matrix LL = new Matrix();
    public C1291600jiQ LLILLJJLI;
    public final ChoreographerFrameCallbackC1291420ji8 LLILLL;
    public float LLILZ;
    public final ArrayList<InterfaceC1291540jiK> LLILZIL;
    public C1290760jh4 LLILZLL;
    public String LLIZ;
    public InterfaceC1291560jiM LLIZLLLIL;
    public C1292850jkR LLJ;
    public boolean LLJI;
    public C1292510jjt LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final AUListenerS269S0100000_20 LLJJ;
    public final Object LLJJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0jjt] */
    public final void LIZIZ() {
        final C1292540jjw c1292540jjwLIZIZ = C1292940jka.LIZIZ(this.LLILLJJLI);
        final C1291600jiQ c1291600jiQ = this.LLILLJJLI;
        final List<C1292540jjw> list = c1291600jiQ.LJII;
        this.LLJIJIL = new AbstractC1292630jk5(this, c1292540jjwLIZIZ, list, c1291600jiQ) { // from class: X.0jjt
            public AbstractC1293310jlB<Float, Float> LJIL;
            public final List<AbstractC1292630jk5> LJJ;
            public final RectF LJJI;
            public final RectF LJJIFFI;

            @Override // X.AbstractC1292630jk5
            public final void LJIILJJIL(float f) {
                super.LJIILJJIL(f);
                if (this.LJIL != null) {
                    f = ((long) (this.LJIL.LJ().floatValue() * 1000.0f)) / this.LJIIL.LLILLJJLI.LIZIZ();
                }
                C1292540jjw c1292540jjw = this.LJIILIIL;
                float f2 = c1292540jjw.LJIIL;
                if (f2 != 0.0f) {
                    f /= f2;
                }
                float f3 = c1292540jjw.LJIILIIL;
                C1291600jiQ c1291600jiQ2 = c1292540jjw.LIZIZ;
                float f4 = f - (f3 / (c1291600jiQ2.LJIIJ - c1291600jiQ2.LJIIIZ));
                int size = ((ArrayList) this.LJJ).size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((AbstractC1292630jk5) ListProtector.get(this.LJJ, size)).LJIILJJIL(f4);
                    } else {
                        return;
                    }
                }
            }

            public final void LJIILL(RectF rectF) {
                this.LJJI.set(0.0f, 0.0f, 0.0f, 0.0f);
                int size = ((ArrayList) this.LJJ).size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((AbstractC1292630jk5) ListProtector.get(this.LJJ, size)).LJ(this.LJJI, this.LJIIJJI);
                        if (rectF.isEmpty()) {
                            rectF.set(this.LJJI);
                        } else {
                            rectF.set(Math.min(rectF.left, this.LJJI.left), Math.min(rectF.top, this.LJJI.top), Math.max(rectF.right, this.LJJI.right), Math.max(rectF.bottom, this.LJJI.bottom));
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // X.AbstractC1292630jk5, X.InterfaceC1292580jk0
            public final void LJ(RectF rectF, Matrix matrix) {
                super.LJ(rectF, matrix);
                LJIILL(rectF);
            }

            @Override // X.AbstractC1292630jk5, X.InterfaceC1291570jiN
            public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
                super.LJI(t, c1292420jjk);
                if (t == InterfaceC1292740jkG.LJIL) {
                    if (c1292420jjk == null) {
                        this.LJIL = null;
                        return;
                    }
                    C1293360jlG c1293360jlG = new C1293360jlG(c1292420jjk);
                    this.LJIL = c1293360jlG;
                    LIZIZ(c1293360jlG);
                }
            }

            @Override // X.AbstractC1292630jk5
            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                canvas.save();
                RectF rectF = this.LJJIFFI;
                C1292540jjw c1292540jjw = this.LJIILIIL;
                rectF.set(0.0f, 0.0f, c1292540jjw.LJIILJJIL, c1292540jjw.LJIILL);
                matrix.mapRect(this.LJJIFFI);
                for (int size = ((ArrayList) this.LJJ).size() - 1; size >= 0; size--) {
                    if (this.LJJIFFI.isEmpty() || canvas.clipRect(this.LJJIFFI)) {
                        ((AbstractC1292630jk5) ListProtector.get(this.LJJ, size)).LIZ(canvas, matrix, i);
                    }
                }
                canvas.restore();
                C1291650jiV.LIZ();
            }

            {
                AbstractC1292630jk5 abstractC1292630jk5;
                AbstractC1292630jk5 abstractC1292630jk52;
                super(this, c1292540jjwLIZIZ);
                this.LJJ = new ArrayList();
                this.LJJI = new RectF();
                this.LJJIFFI = new RectF();
                C1292960jkc c1292960jkc = c1292540jjwLIZIZ.LJIJ;
                if (c1292960jkc != null) {
                    AbstractC1293310jlB<Float, Float> abstractC1293310jlBLIZ = c1292960jkc.LIZ();
                    this.LJIL = abstractC1293310jlBLIZ;
                    LIZIZ(abstractC1293310jlBLIZ);
                    this.LJIL.LIZ(this);
                } else {
                    this.LJIL = null;
                }
                C20066713fN c20066713fN = new C20066713fN(c1291600jiQ.LJII.size());
                int size = list.size() - 1;
                AbstractC1292630jk5 abstractC1292630jk53 = null;
                while (true) {
                    if (size >= 0) {
                        final C1292540jjw c1292540jjw = (C1292540jjw) ListProtector.get(list, size);
                        switch (C1292670jk9.LIZ[c1292540jjw.LJ.ordinal()]) {
                            case 1:
                                abstractC1292630jk52 = new AbstractC1292630jk5(this, c1292540jjw) { // from class: X.0jjx
                                    public final C1292570jjz LJIL;

                                    {
                                        super(this, c1292540jjw);
                                        C1292570jjz c1292570jjz = new C1292570jjz(this, this, new C1292560jjy("__container", c1292540jjw.LIZ));
                                        this.LJIL = c1292570jjz;
                                        c1292570jjz.LIZLLL(Collections.emptyList(), Collections.emptyList());
                                    }

                                    @Override // X.AbstractC1292630jk5, X.InterfaceC1292580jk0
                                    public final void LJ(RectF rectF, Matrix matrix) {
                                        super.LJ(rectF, matrix);
                                        this.LJIL.LJ(rectF, this.LJIIJJI);
                                    }

                                    @Override // X.AbstractC1292630jk5
                                    public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                                        this.LJIL.LIZ(canvas, matrix, i);
                                    }

                                    @Override // X.AbstractC1292630jk5
                                    public final void LJIILIIL(C1291740jie c1291740jie, int i, List<C1291740jie> list2, C1291740jie c1291740jie2) {
                                        this.LJIL.LJFF(c1291740jie, i, list2, c1291740jie2);
                                    }
                                };
                                break;
                            case 2:
                                abstractC1292630jk52 = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: IPUT 
                                      (wrap:??:0x000c: CONSTRUCTOR 
                                      (r4v0 'this' X.0ji9 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
                                      (r2v0 'c1292540jjwLIZIZ' X.0jjw A[DONT_INLINE])
                                      (r0v1 'list' java.util.List<X.0jjw> A[DONT_INLINE])
                                      (r1v0 'c1291600jiQ' X.0jiQ A[DONT_INLINE])
                                     A[MD:(X.0ji9, X.0jjw, java.util.List<X.0jjw>, X.0jiQ):void (m), WRAPPED] (LINE:12) call: X.0jjt.<init>(X.0ji9, X.0jjw, java.util.List, X.0jiQ):void type: CONSTRUCTOR)
                                      (r4v0 'this' X.0ji9 A[IMMUTABLE_TYPE, THIS])
                                     (LINE:15) X.0ji9.LLJIJIL X.0jjt in method: X.0ji9.LIZIZ():void, file: classes21.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:340)
                                    	... 5 more
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008f: CONSTRUCTOR (r2v3 'abstractC1292630jk52' X.0jk5) = 
                                      (r11v0 'this' X.0ji9)
                                      (r9v1 'c1292540jjw' X.0jjw)
                                      (wrap:java.util.List<X.0jjw>:0x0089: INVOKE 
                                      (wrap:java.util.Map<java.lang.String, java.util.List<X.0jjw>>:0x0087: IGET (r14v0 'c1291600jiQ' X.0jiQ) A[WRAPPED] (LINE:67108999) X.0jiQ.LIZJ java.util.Map)
                                      (wrap:java.lang.String:0x0085: IGET (r9v1 'c1292540jjw' X.0jjw) A[WRAPPED] (LINE:67108997) X.0jjw.LJI java.lang.String)
                                     INTERFACE call: java.util.Map.get(java.lang.Object):java.lang.Object A[MD:(java.lang.Object):V (c), WRAPPED] (LINE:67109001))
                                      (r14v0 'c1291600jiQ' X.0jiQ)
                                     A[MD:(X.0ji9, X.0jjw, java.util.List<X.0jjw>, X.0jiQ):void (m)] (LINE:67109007) call: X.0jjt.<init>(X.0ji9, X.0jjw, java.util.List, X.0jiQ):void type: CONSTRUCTOR in method: X.0jjt.<init>(X.0ji9, X.0jjw, java.util.List<X.0jjw>, X.0jiQ):void, file: classes21.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                    	... 5 more
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: X.0jjt
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 33 more
                                    */
                                /*
                                    this = this;
                                    X.0jjt r3 = new X.0jjt
                                    X.0jiQ r0 = r4.LLILLJJLI
                                    X.0jjw r2 = X.C1292940jka.LIZIZ(r0)
                                    X.0jiQ r1 = r4.LLILLJJLI
                                    java.util.List<X.0jjw> r0 = r1.LJII
                                    r3.<init>(r4, r2, r0, r1)
                                    r4.LLJIJIL = r3
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1291430ji9.LIZIZ():void");
                            }

                            public final void LIZLLL() {
                                boolean z = C1291380ji4.LIZ;
                                if (this.LLJIJIL == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiG
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZ.LIZLLL();
                                        }
                                    });
                                    return;
                                }
                                ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL;
                                choreographerFrameCallbackC1291420ji8.LLJIJIL = true;
                                boolean zLJFF = choreographerFrameCallbackC1291420ji8.LJFF();
                                for (Animator.AnimatorListener animatorListener : (CopyOnWriteArraySet) choreographerFrameCallbackC1291420ji8.LLILLJJLI) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        animatorListener.onAnimationStart(choreographerFrameCallbackC1291420ji8, zLJFF);
                                    } else {
                                        animatorListener.onAnimationStart(choreographerFrameCallbackC1291420ji8);
                                    }
                                }
                                choreographerFrameCallbackC1291420ji8.LJII((int) (choreographerFrameCallbackC1291420ji8.LJFF() ? choreographerFrameCallbackC1291420ji8.LIZLLL() : choreographerFrameCallbackC1291420ji8.LJ()));
                                choreographerFrameCallbackC1291420ji8.LLILZIL = System.nanoTime();
                                choreographerFrameCallbackC1291420ji8.LLIZ = 0;
                                if (choreographerFrameCallbackC1291420ji8.LLJIJIL) {
                                    choreographerFrameCallbackC1291420ji8.LJI(false);
                                    C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC1291420ji8);
                                }
                            }

                            public final void LJ() {
                                boolean z = C1291380ji4.LIZ;
                                if (this.LLJIJIL == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiH
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZ.LJ();
                                        }
                                    });
                                    return;
                                }
                                ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL;
                                choreographerFrameCallbackC1291420ji8.LLJIJIL = true;
                                choreographerFrameCallbackC1291420ji8.LJI(false);
                                C786410Ut5.v2().postFrameCallback(choreographerFrameCallbackC1291420ji8);
                                choreographerFrameCallbackC1291420ji8.LLILZIL = System.nanoTime();
                                if (choreographerFrameCallbackC1291420ji8.LJFF() && choreographerFrameCallbackC1291420ji8.LLILZLL == choreographerFrameCallbackC1291420ji8.LJ()) {
                                    choreographerFrameCallbackC1291420ji8.LLILZLL = choreographerFrameCallbackC1291420ji8.LIZLLL();
                                } else {
                                    if (choreographerFrameCallbackC1291420ji8.LJFF() || choreographerFrameCallbackC1291420ji8.LLILZLL != choreographerFrameCallbackC1291420ji8.LIZLLL()) {
                                        return;
                                    }
                                    choreographerFrameCallbackC1291420ji8.LLILZLL = choreographerFrameCallbackC1291420ji8.LJ();
                                }
                            }

                            public final void LJFF() {
                                ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL;
                                C1291600jiQ c1291600jiQ = this.LLILLJJLI;
                                boolean z = choreographerFrameCallbackC1291420ji8.LLJI == null;
                                choreographerFrameCallbackC1291420ji8.LLJI = c1291600jiQ;
                                if (z) {
                                    choreographerFrameCallbackC1291420ji8.LJIIIIZZ((int) Math.max(choreographerFrameCallbackC1291420ji8.LLIZLLLIL, c1291600jiQ.LJIIIZ), (int) Math.min(choreographerFrameCallbackC1291420ji8.LLJ, c1291600jiQ.LJIIJ));
                                } else {
                                    choreographerFrameCallbackC1291420ji8.LJIIIIZZ((int) c1291600jiQ.LJIIIZ, (int) c1291600jiQ.LJIIJ);
                                }
                                choreographerFrameCallbackC1291420ji8.LJII((int) choreographerFrameCallbackC1291420ji8.LLILZLL);
                                choreographerFrameCallbackC1291420ji8.LLILZIL = System.nanoTime();
                                LJIIJJI(this.LLILLL.getAnimatedFraction());
                                this.LLILZ = this.LLILZ;
                                LJIIL();
                                LJIIL();
                                Iterator it2 = new ArrayList(this.LLILZIL).iterator();
                                while (it2.hasNext()) {
                                    InterfaceC1291540jiK interfaceC1291540jiK = (InterfaceC1291540jiK) it2.next();
                                    if (interfaceC1291540jiK != null) {
                                        interfaceC1291540jiK.run();
                                    }
                                    it2.remove();
                                }
                                this.LLILZIL.clear();
                                this.LLILLJJLI.LIZ.LIZIZ = this.LLJILJILJ;
                            }

                            public final void LJIIL() {
                                if (this.LLILLJJLI == null) {
                                    return;
                                }
                                float f = this.LLILZ;
                                setBounds(0, 0, (int) (r0.LJIIIIZZ.width() * f), (int) (this.LLILLJJLI.LJIIIIZZ.height() * f));
                            }

                            @Override // android.graphics.drawable.Drawable
                            public final int getIntrinsicHeight() {
                                if (this.LLILLJJLI == null) {
                                    return -1;
                                }
                                return (int) (r0.LJIIIIZZ.height() * this.LLILZ);
                            }

                            @Override // android.graphics.drawable.Drawable
                            public final int getIntrinsicWidth() {
                                if (this.LLILLJJLI == null) {
                                    return -1;
                                }
                                return (int) (r0.LJIIIIZZ.width() * this.LLILZ);
                            }

                            @Override // android.graphics.drawable.Animatable
                            public final boolean isRunning() {
                                ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL;
                                if (choreographerFrameCallbackC1291420ji8 == null) {
                                    return false;
                                }
                                return choreographerFrameCallbackC1291420ji8.LLJIJIL;
                            }

                            @Override // android.graphics.drawable.Animatable
                            public final void stop() {
                                boolean z = C1291380ji4.LIZ;
                                this.LLILZIL.clear();
                                this.LLILLL.LIZIZ();
                            }

                            public C1291430ji9() {
                                ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = new ChoreographerFrameCallbackC1291420ji8();
                                this.LLILLL = choreographerFrameCallbackC1291420ji8;
                                this.LLILZ = 1.0f;
                                new HashSet();
                                this.LLILZIL = new ArrayList<>();
                                this.LLJILJIL = 255;
                                this.LLJILLL = false;
                                AUListenerS269S0100000_20 aUListenerS269S0100000_20 = new AUListenerS269S0100000_20(this, 3);
                                this.LLJJ = aUListenerS269S0100000_20;
                                this.LLJJI = new Object();
                                choreographerFrameCallbackC1291420ji8.addUpdateListener(aUListenerS269S0100000_20);
                                boolean z = C1291380ji4.LIZ;
                            }

                            @Override // android.graphics.drawable.Drawable
                            public final void invalidateSelf() {
                                Drawable.Callback callback = getCallback();
                                if (callback != null) {
                                    callback.invalidateDrawable(this);
                                    boolean z = C1291380ji4.LIZ;
                                }
                            }

                            @Override // android.graphics.drawable.Drawable
                            public final int getAlpha() {
                                return this.LLJILJIL;
                            }

                            @Override // android.graphics.drawable.Animatable
                            public final void start() {
                                LIZLLL();
                            }

                            public final float LIZJ(Canvas canvas) {
                                return Math.min(canvas.getWidth() / this.LLILLJJLI.LJIIIIZZ.width(), canvas.getHeight() / this.LLILLJJLI.LJIIIIZZ.height());
                            }

                            public final void LJI(final int i) {
                                if (this.LLILLJJLI == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiF
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZIZ.LJI(i);
                                        }
                                    });
                                } else {
                                    this.LLILLL.LJII(i);
                                }
                            }

                            public final void LJII(final int i) {
                                if (this.LLILLJJLI == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiJ
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZIZ.LJII(i);
                                        }
                                    });
                                } else {
                                    ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL;
                                    choreographerFrameCallbackC1291420ji8.LJIIIIZZ((int) choreographerFrameCallbackC1291420ji8.LLIZLLLIL, i);
                                }
                            }

                            public final void LJIIIIZZ(final float f) {
                                C1291600jiQ c1291600jiQ = this.LLILLJJLI;
                                if (c1291600jiQ == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiE
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZIZ.LJIIIIZZ(f);
                                        }
                                    });
                                } else {
                                    float f2 = c1291600jiQ.LJIIIZ;
                                    LJII((int) (f2 + (f * (c1291600jiQ.LJIIJ - f2))));
                                }
                            }

                            public final void LJIIIZ(final int i) {
                                if (this.LLILLJJLI == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiI
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZIZ.LJIIIZ(i);
                                        }
                                    });
                                } else {
                                    ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL;
                                    choreographerFrameCallbackC1291420ji8.LJIIIIZZ(i, (int) choreographerFrameCallbackC1291420ji8.LLJ);
                                }
                            }

                            public final void LJIIJ(final float f) {
                                C1291600jiQ c1291600jiQ = this.LLILLJJLI;
                                if (c1291600jiQ == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiD
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZIZ.LJIIJ(f);
                                        }
                                    });
                                } else {
                                    float f2 = c1291600jiQ.LJIIIZ;
                                    LJIIIZ((int) (f2 + (f * (c1291600jiQ.LJIIJ - f2))));
                                }
                            }

                            public final void LJIIJJI(final float f) {
                                C1291600jiQ c1291600jiQ = this.LLILLJJLI;
                                if (c1291600jiQ == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiC
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZIZ.LJIIJJI(f);
                                        }
                                    });
                                } else {
                                    float f2 = c1291600jiQ.LJIIIZ;
                                    LJI((int) (f2 + (f * (c1291600jiQ.LJIIJ - f2))));
                                }
                            }

                            @Override // android.graphics.drawable.Drawable
                            public final void draw(Canvas canvas) {
                                float f;
                                if (this.LLJIJIL != null) {
                                    float f2 = this.LLILZ;
                                    float fLIZJ = LIZJ(canvas);
                                    if (f2 > fLIZJ) {
                                        f = this.LLILZ / fLIZJ;
                                    } else {
                                        fLIZJ = f2;
                                        f = 1.0f;
                                    }
                                    if (f > 1.0f) {
                                        canvas.save();
                                        float fWidth = this.LLILLJJLI.LJIIIIZZ.width() / 2.0f;
                                        float fHeight = this.LLILLJJLI.LJIIIIZZ.height() / 2.0f;
                                        float f3 = fWidth * fLIZJ;
                                        float f4 = fHeight * fLIZJ;
                                        float f5 = this.LLILZ;
                                        canvas.translate((fWidth * f5) - f3, (f5 * fHeight) - f4);
                                        canvas.scale(f, f, f3, f4);
                                    }
                                    this.LL.reset();
                                    this.LL.preScale(fLIZJ, fLIZJ);
                                    this.LLJIJIL.LIZ(canvas, this.LL, this.LLJILJIL);
                                    C1291650jiV.LIZ();
                                    if (f > 1.0f) {
                                        canvas.restore();
                                    }
                                }
                            }

                            @Override // android.graphics.drawable.Drawable.Callback
                            public final void invalidateDrawable(Drawable drawable) {
                                Drawable.Callback callback = getCallback();
                                if (callback == null) {
                                    return;
                                }
                                callback.invalidateDrawable(this);
                            }

                            @Override // android.graphics.drawable.Drawable
                            public final void setAlpha(int i) {
                                this.LLJILJIL = i;
                            }

                            @Override // android.graphics.drawable.Drawable.Callback
                            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                                Drawable.Callback callback = getCallback();
                                if (callback == null) {
                                    return;
                                }
                                callback.unscheduleDrawable(this, runnable);
                            }

                            public final <T> void LIZ(final C1291740jie c1291740jie, final T t, final C1292420jjk<T> c1292420jjk) {
                                if (this.LLJIJIL == null) {
                                    this.LLILZIL.add(new InterfaceC1291540jiK() { // from class: X.0jiB
                                        @Override // X.InterfaceC1291540jiK
                                        public final void run() {
                                            this.LIZLLL.LIZ(c1291740jie, t, c1292420jjk);
                                        }
                                    });
                                    return;
                                }
                                InterfaceC1291570jiN interfaceC1291570jiN = c1291740jie.LIZIZ;
                                if (interfaceC1291570jiN != null) {
                                    interfaceC1291570jiN.LJI(t, c1292420jjk);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    this.LLJIJIL.LJFF(c1291740jie, 0, arrayList, new C1291740jie(new String[0]));
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        ((C1291740jie) ListProtector.get(arrayList, i)).LIZIZ.LJI(t, c1292420jjk);
                                    }
                                    if (!(true ^ arrayList.isEmpty())) {
                                        return;
                                    }
                                }
                                invalidateSelf();
                                if (t == InterfaceC1292740jkG.LJIL) {
                                    LJIIJJI(this.LLILLL.LIZJ());
                                }
                            }

                            @Override // android.graphics.drawable.Drawable.Callback
                            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                                Drawable.Callback callback = getCallback();
                                if (callback == null) {
                                    return;
                                }
                                callback.scheduleDrawable(this, runnable, j);
                            }
                        }
