package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C427870Gq9 extends SmartImageView {
    public final Paint LLIZLLLIL;
    public Bitmap LLJ;
    public Drawable LLJI;
    public Canvas LLJIJIL;
    public volatile boolean LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    public final void LJIIIZ() {
        if (this.LLJILLL) {
            Drawable drawable = getDrawable();
            this.LLJI = drawable;
            if (drawable != null && getWidth() > 0 && getHeight() > 0) {
                Bitmap.Config config = this.LLJI.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                int intrinsicWidth = this.LLJI.getIntrinsicWidth();
                int intrinsicHeight = this.LLJI.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                Bitmap bitmap = this.LLJ;
                if (bitmap != null) {
                    if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.LLJ.getHeight()) {
                        Canvas canvas = this.LLJIJIL;
                        if (canvas != null) {
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            return;
                        }
                        return;
                    }
                    if (!this.LLJ.isRecycled()) {
                        C786410Ut5.LJJJJ(this.LLJ);
                    }
                }
                this.LLJILJILJ = Math.min(intrinsicWidth, intrinsicHeight) / 2;
                this.LLJ = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                Canvas canvas2 = new Canvas(this.LLJ);
                this.LLJIJIL = canvas2;
                this.LLJI.setBounds(0, 0, canvas2.getWidth(), this.LLJIJIL.getHeight());
                Bitmap bitmap2 = this.LLJ;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                this.LLIZLLLIL.setAntiAlias(true);
                this.LLIZLLLIL.setShader(bitmapShader);
            }
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public void LIZJ() {
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        if (c1331100kk8 == null) {
            c1331100kk8 = new C1331100kk8();
        }
        c1331100kk8.LIZIZ = true;
        getHierarchy().LJJIII(c1331100kk8);
        getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
        LJIIIZ();
    }

    public C427870Gq9(Context context) {
        super(context);
        this.LLIZLLLIL = new Paint();
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public final void LIZ(final C1331510kkn c1331510kkn) {
        int i = C2187451AjH.LIZ;
        C1330590kjJ.LJII(c1331510kkn.hashCode(), "SmartCircleImageView", "display");
        if (C1331660kl2.LIZLLL().LJIILL()) {
            this.LLJJ = c1331510kkn.LJJIL;
        } else {
            this.LLJILLL = c1331510kkn.LJJIL;
        }
        if (C1331660kl2.LIZLLL().LJIILL()) {
            final InterfaceC427850Gq7 interfaceC427850Gq7 = c1331510kkn.LJJIJIIJIL;
            if (interfaceC427850Gq7 == null) {
                c1331510kkn.LJJIJIIJIL = new AbstractC1335900krs() { // from class: X.0GqA
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onFailed :");
                        sbLIZ.append(th);
                        C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "SmartCircleImageView", "wrapListenerIfNeed", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        int i2 = C2187451AjH.LIZ;
                        C1330590kjJ.LIZ(c1331510kkn.hashCode(), "SmartCircleImageView", "wrapListenerIfNeed", "onComplete");
                        if (animatable != null) {
                            this.LLILLJJLI.LLJILJIL = true;
                            this.LLILLJJLI.LLJILLL = true;
                        } else {
                            this.LLILLJJLI.LLJILJIL = false;
                            this.LLILLJJLI.LLJILLL = false;
                        }
                    }
                };
            } else {
                c1331510kkn.LJJIJIIJIL = new InterfaceC427850Gq7() { // from class: X.0GqB
                    @Override // X.InterfaceC427850Gq7
                    public final void e1(Uri uri) {
                        interfaceC427850Gq7.e1(uri);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onRelease", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void A3(Uri uri, C428600GrK c428600GrK) {
                        interfaceC427850Gq7.A3(uri, c428600GrK);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onIntermediateImageSet", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Bh(Uri uri, View view) {
                        interfaceC427850Gq7.Bh(uri, view);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onStart", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void lg(Uri uri, Throwable th) {
                        interfaceC427850Gq7.lg(uri, th);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        sbLIZ.append("  throwable");
                        sbLIZ.append(th);
                        C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "SmartCircleImageView", "onIntermediateImageFailed", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        interfaceC427850Gq7.cm(uri, view, th);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "SmartCircleImageView", "onFailed", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        if (animatable != null) {
                            this.LLILLL.LLJILJIL = true;
                            this.LLILLL.LLJILLL = true;
                        } else {
                            this.LLILLL.LLJILJIL = false;
                            this.LLILLL.LLJILLL = false;
                        }
                        interfaceC427850Gq7.Ad(uri, view, c428600GrK, animatable);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LIZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onComplete", C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
        } else if (this.LLJILLL) {
            final InterfaceC427850Gq7 interfaceC427850Gq72 = c1331510kkn.LJJIJIIJIL;
            if (interfaceC427850Gq72 == null) {
                c1331510kkn.LJJIJIIJIL = new C0ID1(c1331510kkn, this, 1);
            } else {
                c1331510kkn.LJJIJIIJIL = new InterfaceC427850Gq7() { // from class: X.0GqC
                    @Override // X.InterfaceC427850Gq7
                    public final void e1(Uri uri) {
                        interfaceC427850Gq72.e1(uri);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onRelease", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void A3(Uri uri, C428600GrK c428600GrK) {
                        interfaceC427850Gq72.A3(uri, c428600GrK);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onIntermediateImageSet", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Bh(Uri uri, View view) {
                        interfaceC427850Gq72.Bh(uri, view);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LJIIIIZZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onStart", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void lg(Uri uri, Throwable th) {
                        interfaceC427850Gq72.lg(uri, th);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        sbLIZ.append("  throwable: ");
                        sbLIZ.append(th);
                        C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "SmartCircleImageView", "onIntermediateImageFailed", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        interfaceC427850Gq72.cm(uri, view, th);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        sbLIZ.append("  throwable: ");
                        sbLIZ.append(th);
                        C1330590kjJ.LIZLLL(c1331510kkn.hashCode(), "SmartCircleImageView", "onFailed", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        this.LLILLL.LLJILJIL = true;
                        interfaceC427850Gq72.Ad(uri, view, c428600GrK, animatable);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("uri :");
                        sbLIZ.append(uri);
                        C1330590kjJ.LIZ(c1331510kkn.hashCode(), "SmartCircleImageView", "onComplete", C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
        }
        super.LIZ(c1331510kkn);
    }

    public final void LJIIIIZZ(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        if (C1331660kl2.LIZLLL().LJIILL()) {
            if (this.LLJILLL && this.LLJJ) {
                if (this.LLJILJIL) {
                    LJIIIZ();
                    this.LLJILJIL = false;
                }
                Drawable drawable = this.LLJI;
                if (drawable != null && (canvas3 = this.LLJIJIL) != null) {
                    drawable.draw(canvas3);
                }
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LLJILJILJ, this.LLIZLLLIL);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        if (this.LLJILLL) {
            if (this.LLJILJIL) {
                LJIIIZ();
                this.LLJILJIL = false;
            }
            Drawable drawable2 = this.LLJI;
            if (drawable2 != null && (canvas2 = this.LLJIJIL) != null) {
                drawable2.draw(canvas2);
            }
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LLJILJILJ, this.LLIZLLLIL);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            LJIIIIZZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C1322090kVb
    public void setController(InterfaceC1320850kTb interfaceC1320850kTb) {
        if (this.LLJILLL) {
            this.LLJILJIL = true;
            setImageDrawable(null);
        }
        super.setController(interfaceC1320850kTb);
    }

    public C427870Gq9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = new Paint();
        this.LLJILJIL = true;
    }

    public C427870Gq9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = new Paint();
        this.LLJILJIL = true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJIIIZ();
    }
}
