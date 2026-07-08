package X;

import Y.ALAdapterS16S0100000_20;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.text.a0;
import tikcast.api.anchor_data.FinishEncourageRanking;

/* JADX INFO: renamed from: X.0ku3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337250ku3 extends AbstractC1337430kuL {
    public FinishEncourageRanking LJIJ;
    public C16F5 LJIJI;
    public C1295960jpS LJIJJ;

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final long LJFF() {
        return 1750L;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LJI() {
        try {
            C1295960jpS c1295960jpS = this.LJIJJ;
            if (c1295960jpS != null) {
                c1295960jpS.pauseAnimation();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.LJI();
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILIIL() {
        C1295960jpS c1295960jpS = this.LJIJJ;
        if (c1295960jpS != null) {
            C1296260jpw.LIZ(c1295960jpS);
        }
        C16F5 c16f5 = this.LJIJI;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
    }

    @Override // X.AbstractC1337430kuL
    public final void LJIILJJIL() {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        AnimatorSet animatorSetLJIIJ = AbstractC1337430kuL.LJIIJ(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorSetLJIIJ);
        animatorSet.addListener(new ALAdapterS16S0100000_20(this, 6));
        this.LIZIZ = animatorSet;
        animatorSet.start();
    }

    @Override // X.InterfaceC20482815Cw
    public final AbstractC1337320kuA getContainerType() {
        return C1337390kuH.LIZJ;
    }

    @Override // X.InterfaceC20482815Cw
    public final View LJIIIIZZ(Context context, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ght, viewGroup, false);
        this.LJIJI = (C16F5) viewTd.findViewById(R.id.tv_ranking_mini);
        this.LJIJJ = (C1295960jpS) viewTd.findViewById(R.id.ns1);
        this.LIZ = viewTd;
        C786410Ut5.T4(viewTd, 0.0f);
        return viewTd;
    }

    public static Bitmap LJIILL(int i, int i2, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float f = i;
        float f2 = i2;
        float fMax = Math.max(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        matrix.postTranslate((f - (bitmap.getWidth() * fMax)) / 2.0f, (f2 - (bitmap.getHeight() * fMax)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f / 2.0f, f2 / 2.0f, Math.min(i, i2) / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    @Override // X.AbstractC1337430kuL, X.InterfaceC20482815Cw
    public final void LIZIZ(int i, int i2, Object obj) {
        FinishEncourageRanking finishEncourageRanking;
        String str;
        super.LIZIZ(i, i2, obj);
        if ((obj instanceof FinishEncourageRanking) && (finishEncourageRanking = (FinishEncourageRanking) obj) != null) {
            this.LJIJ = finishEncourageRanking;
            C1295960jpS c1295960jpS = this.LJIJJ;
            if (c1295960jpS != null) {
                C1143680frq.LJIILL(c1295960jpS, "tiktok_live_broadcast_demand_12", "ttlive_finish_encourage_ranking_weak.zip", false, new C1339340kxQ(c1295960jpS, this, 1));
            }
            FinishEncourageRanking finishEncourageRanking2 = this.LJIJ;
            if (finishEncourageRanking2 == null || (str = finishEncourageRanking2.finishTitle) == null) {
                str = "";
            }
            C16F5 c16f5 = this.LJIJI;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            C16F5 c16f52 = this.LJIJI;
            if (c16f52 != null) {
                c16f52.setTextSize(1, this.LJI);
            }
            Typeface typefaceLJIIJJI = LJIIJJI();
            C16F5 c16f53 = this.LJIJI;
            if (c16f53 != null) {
                c16f53.setTypeface(typefaceLJIIJJI);
            }
            C16F5 c16f54 = this.LJIJI;
            if (c16f54 != null) {
                c16f54.setText(str);
            }
        }
    }

    public final Object LJIIZILJ(final int i, final int i2, String str, C445950HeD c445950HeD) {
        boolean z = true;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c445950HeD));
        c2252611DEt.LJIJJ();
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        }
        if (z) {
            c2252611DEt.LJJIFFI(AFwS258S0000000_20.get$arr$(13), null);
        } else {
            ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(C1325700kbQ.LIZLLL(UriProtector.parse(str)).LIZ(), null)).LIZJ(new AbstractC447090Hg3() { // from class: X.0ku4
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    c2252611DEt.LJJIFFI(AFwS258S0000000_20.get$arr$(14), null);
                }

                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    Bitmap bitmapLJIILL;
                    if (bitmap != null) {
                        try {
                            C1337250ku3 c1337250ku3 = this;
                            int i3 = i;
                            int i4 = i2;
                            c1337250ku3.getClass();
                            bitmapLJIILL = C1337250ku3.LJIILL(i3, i4, bitmap);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            bitmapLJIILL = null;
                        }
                    } else {
                        bitmapLJIILL = null;
                    }
                    c2252611DEt.LJJIFFI(AFwS258S0000000_20.get$arr$(15), bitmapLJIILL);
                }
            }, C822690WPb.LIZ());
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c445950HeD);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(android.content.Context r7, java.lang.String r8, int r9, int r10, X.InterfaceC1364105Vn r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C445950HeD
            if (r0 == 0) goto L29
            r5 = r11
            X.0HeD r5 = (X.C445950HeD) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r4 = r5.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILZLL
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L37
            if (r1 != r0) goto L2f
            int r10 = r5.LLILLL
            int r9 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            android.content.Context r7 = (android.content.Context) r7
            goto L49
        L29:
            X.0HeD r5 = new X.0HeD
            r5.<init>(r6, r11)
            goto L12
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r7     // Catch: java.lang.Throwable -> L4f
            r5.LLILLJJLI = r9     // Catch: java.lang.Throwable -> L4f
            r5.LLILLL = r10     // Catch: java.lang.Throwable -> L4f
            r5.LLILZLL = r0     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r6.LJIIZILJ(r9, r10, r8, r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 != r3) goto L4c
            return r3
        L49:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L4f
        L4c:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = r2
        L54:
            if (r4 == 0) goto L5d
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L5d
            return r4
        L5d:
            android.content.res.Resources r1 = r7.getResources()     // Catch: java.lang.Throwable -> L69
            r0 = 2130974001(0x7f041531, float:1.7556813E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r2
        L6e:
            if (r0 == 0) goto L74
            android.graphics.Bitmap r2 = LJIILL(r9, r10, r0)
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1337250ku3.LJIILLIIL(android.content.Context, java.lang.String, int, int, X.05Vn):java.lang.Object");
    }
}
