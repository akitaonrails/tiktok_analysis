package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.bytedance.android.live.base.model.user.StretchableBackgroundImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521160KcE extends AbstractC498550Jgr<C1113930f5r> {
    public final int LIZLLL;
    public final Context LJ;
    public final C521100Kc8 LJFF;
    public final C521150KcD LJI;
    public final Runnable LJII;
    public Bitmap LJIIIIZZ;
    public Bitmap LJIIIZ;
    public Bitmap LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public C11NJ LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;

    @Override // X.AbstractC498550Jgr
    public final void LJFF() {
        this.LJIIJJI = false;
        this.LJIIL = false;
        C11NJ c11nj = this.LJIIZILJ;
        if (c11nj != null) {
            c11nj.LJ();
        }
        this.LJIIZILJ = null;
    }

    public void LJI(C521100Kc8 c521100Kc8) {
    }

    public void LJII(C521100Kc8 c521100Kc8) {
    }

    public final void LJIIIZ() {
        C11NJ c11nj;
        C11NJ c11nj2;
        C11NJ c11nj3;
        this.LJIJI = false;
        if (((!this.LJIILJJIL && !this.LJIIJJI) || ((!this.LJIILL && !this.LJIIL) || (!this.LJIILLIIL && !this.LJIILIIL))) && this.LJIIZILJ == null) {
            this.LJIIZILJ = new C11NJ();
        }
        if (!this.LJIILJJIL && !this.LJIIJJI) {
            this.LJIIJJI = true;
            C11JF c11jfLIZ = C1121700fIO.LIZ(this.LJI.LIZ, new InterfaceC1121710fIP() { // from class: X.0KcH
                @Override // X.InterfaceC1121710fIP
                public final void onFail() {
                    C521160KcE c521160KcE = this.LIZ;
                    c521160KcE.LJIIJJI = false;
                    c521160KcE.LJIILJJIL = true;
                    c521160KcE.LJIIIIZZ();
                    C521160KcE c521160KcE2 = this.LIZ;
                    c521160KcE2.LJI(c521160KcE2.LJFF);
                }

                @Override // X.InterfaceC1121710fIP
                public final void LIZIZ(Bitmap bitmap) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        C521160KcE c521160KcE = this.LIZ;
                        c521160KcE.LJIIIIZZ = bitmap;
                        c521160KcE.LJIILJJIL = true;
                        c521160KcE.LJIIJJI = false;
                        c521160KcE.LJIIIIZZ();
                    }
                    C521160KcE c521160KcE2 = this.LIZ;
                    c521160KcE2.LJII(c521160KcE2.LJFF);
                }
            });
            if (c11jfLIZ != null && (c11nj3 = this.LJIIZILJ) != null) {
                c11nj3.LIZ(c11jfLIZ);
            }
        }
        if (!this.LJIILL && !this.LJIIL) {
            this.LJIIL = true;
            C521100Kc8 c521100Kc8 = this.LJFF;
            if (c521100Kc8 == null || !c521100Kc8.LJJIFFI) {
                C11JF c11jfLIZ2 = C1121700fIO.LIZ(this.LJI.LIZLLL, new InterfaceC1121710fIP() { // from class: X.0KcG
                    @Override // X.InterfaceC1121710fIP
                    public final void onFail() {
                        C521160KcE c521160KcE = this.LIZ;
                        c521160KcE.LJIIL = false;
                        c521160KcE.LJIILL = true;
                        c521160KcE.LJIIIIZZ();
                        C521160KcE c521160KcE2 = this.LIZ;
                        c521160KcE2.LJI(c521160KcE2.LJFF);
                    }

                    @Override // X.InterfaceC1121710fIP
                    public final void LIZIZ(Bitmap bitmap) {
                        byte[] ninePatchChunk;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            this.LIZ.LJIIIZ = bitmap;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onCreateBadge. BgBitmap ninePatchChunk = ");
                            Bitmap bitmap2 = this.LIZ.LJIIIZ;
                            if (bitmap2 != null) {
                                ninePatchChunk = bitmap2.getNinePatchChunk();
                            } else {
                                ninePatchChunk = null;
                            }
                            sbLIZ.append(ninePatchChunk);
                            C20441214yg.LIZIZ("CombineBaseHolder", C2188811AlT.LIZIZ(sbLIZ));
                            C521160KcE c521160KcE = this.LIZ;
                            c521160KcE.LJIILL = true;
                            c521160KcE.LJIIL = false;
                            c521160KcE.LJIIIIZZ();
                        }
                        C521160KcE c521160KcE2 = this.LIZ;
                        c521160KcE2.LJII(c521160KcE2.LJFF);
                    }
                });
                if (c11jfLIZ2 != null && (c11nj2 = this.LJIIZILJ) != null) {
                    c11nj2.LIZ(c11jfLIZ2);
                }
            } else {
                InterfaceC1091290eVL interfaceC1091290eVL = new InterfaceC1091290eVL() { // from class: X.0KcF
                    @Override // X.InterfaceC1091290eVL
                    public final void LIZ(Exception exc) {
                        C521160KcE c521160KcE = this.LIZ;
                        c521160KcE.LJIIL = false;
                        c521160KcE.LJIILL = true;
                        c521160KcE.LJIIIIZZ();
                        C521160KcE c521160KcE2 = this.LIZ;
                        c521160KcE2.LJI(c521160KcE2.LJFF);
                    }

                    @Override // X.InterfaceC1091290eVL
                    public final void LIZIZ(Bitmap bitmap) {
                        byte[] ninePatchChunk;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            this.LIZ.LJIIIZ = bitmap;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onCreateBadge. BgBitmap ninePatchChunk = ");
                            Bitmap bitmap2 = this.LIZ.LJIIIZ;
                            if (bitmap2 != null) {
                                ninePatchChunk = bitmap2.getNinePatchChunk();
                            } else {
                                ninePatchChunk = null;
                            }
                            sbLIZ.append(ninePatchChunk);
                            C20441214yg.LIZIZ("CombineBaseHolder", C2188811AlT.LIZIZ(sbLIZ));
                            C521160KcE c521160KcE = this.LIZ;
                            c521160KcE.LJIILL = true;
                            c521160KcE.LJIIL = false;
                            c521160KcE.LJIIIIZZ();
                        }
                        C521160KcE c521160KcE2 = this.LIZ;
                        c521160KcE2.LJII(c521160KcE2.LJFF);
                    }
                };
                StretchableBackgroundImage stretchableBackgroundImage = this.LJI.LJFF;
                C1121670fIL.LJIIJJI(null, stretchableBackgroundImage != null ? stretchableBackgroundImage.image : null, true, interfaceC1091290eVL);
            }
        }
        if (!this.LJIILLIIL && !this.LJIILIIL) {
            this.LJIILIIL = true;
            C11JF c11jfLIZ3 = C1121700fIO.LIZ(this.LJI.LJ, new InterfaceC1121710fIP() { // from class: X.0KcI
                @Override // X.InterfaceC1121710fIP
                public final void onFail() {
                    C521160KcE c521160KcE = this.LIZ;
                    c521160KcE.LJIILIIL = false;
                    c521160KcE.LJIILLIIL = true;
                    c521160KcE.LJIIIIZZ();
                    C521160KcE c521160KcE2 = this.LIZ;
                    c521160KcE2.LJI(c521160KcE2.LJFF);
                }

                @Override // X.InterfaceC1121710fIP
                public final void LIZIZ(Bitmap bitmap) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        C521160KcE c521160KcE = this.LIZ;
                        c521160KcE.LJIIJ = bitmap;
                        c521160KcE.LJIILIIL = false;
                        c521160KcE.LJIILLIIL = true;
                        c521160KcE.LJIIIIZZ();
                    }
                    C521160KcE c521160KcE2 = this.LIZ;
                    c521160KcE2.LJII(c521160KcE2.LJFF);
                }
            });
            if (c11jfLIZ3 != null && (c11nj = this.LJIIZILJ) != null) {
                c11nj.LIZ(c11jfLIZ3);
            }
        }
        LJIIIIZZ();
        this.LJIJI = true;
    }

    @Override // X.AbstractC498530Jgp
    public final AbstractC521080Kc6 LJ() {
        String string;
        CharSequence charSequence = this.LJI.LIZIZ;
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = this.LJI.LIZJ;
        }
        Context context = this.LJ;
        Bitmap bitmap = this.LJIIIIZZ;
        Bitmap bitmap2 = this.LJIIIZ;
        Bitmap bitmap3 = this.LJIIJ;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        C1113930f5r c1113930f5r = new C1113930f5r(context, bitmap, bitmap2, bitmap3, string, this.LJFF);
        Runnable runnable = this.LJII;
        if (runnable != null) {
            c1113930f5r.LJ = runnable;
        }
        return c1113930f5r;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.0KcE for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void LJIIIIZZ() {
        /*
            r2 = this;
            boolean r0 = r2.LJIILJJIL
            if (r0 == 0) goto L20
            boolean r0 = r2.LJIILL
            if (r0 == 0) goto L20
            boolean r0 = r2.LJIILLIIL
            if (r0 == 0) goto L20
            boolean r0 = r2.LJIJ
            if (r0 != 0) goto L20
            r0 = 1
            r2.LJIJ = r0
            kotlin.jvm.functions.Function2<X.0Jgr<T extends X.0Kc6>, java.lang.Boolean, kotlin.Unit> r1 = r2.LIZJ
            if (r1 == 0) goto L20
            boolean r0 = r2.LJIJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r2, r0)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C521160KcE.LJIIIIZZ():void");
    }

    @Override // X.AbstractC498530Jgp
    public final int LIZLLL() {
        return this.LIZLLL;
    }

    public C521160KcE(int i, Handler handler, Function2<? super AbstractC498550Jgr<C1113930f5r>, ? super Boolean, Unit> function2, Context context, C521100Kc8 c521100Kc8, C521150KcD c521150KcD, Runnable runnable) {
        boolean z;
        boolean z2;
        super(handler, function2);
        this.LIZLLL = i;
        this.LJ = context;
        this.LJFF = c521100Kc8;
        this.LJI = c521150KcD;
        this.LJII = runnable;
        if (!c521100Kc8.LIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILJJIL = z;
        if (!c521100Kc8.LIZLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILL = z2;
        this.LJIILLIIL = c521100Kc8.LIZJ ? false : true;
    }
}
