package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kLL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315730kLL extends AbstractC1313950kIT implements InterfaceC1316210kM7, Drawable.Callback {
    public final C1315750kLN LLILLJJLI;
    public Drawable LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public final Context LLIZLLLIL;
    public WeakReference<LynxBaseUI> LLJ;
    public final String LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    @Override // X.AbstractC1313950kIT
    public final boolean LIZJ() {
        return this.LLILLL != null;
    }

    @Override // X.AbstractC1313950kIT
    public final void LIZLLL() {
        int i;
        if (!this.LLILZ) {
            this.LLILLJJLI.LJIILJJIL();
            this.LLILZ = true;
            this.LLILLJJLI.LJIIIIZZ = true;
        }
        int i2 = this.LLJIJIL;
        if (i2 <= 0 || (i = this.LLJILJIL) <= 0) {
            return;
        }
        this.LLILLJJLI.LJIILIIL(i2, i, 0, 0, 0, 0);
    }

    @Override // X.AbstractC1313950kIT
    public final void LJ() {
        this.LLILLJJLI.LJIILL();
        this.LLILZ = false;
    }

    @Override // X.AbstractC1313950kIT
    public final void LJFF() {
        int i;
        WeakReference<LynxBaseUI> weakReference = this.LLJ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        LynxBaseUI lynxBaseUI = this.LLJ.get();
        C1298160jt0 c1298160jt0LIZIZ = C1298150jsz.LIZIZ(lynxBaseUI.mUseLocalCache);
        if (lynxBaseUI.mSkipRedirection) {
            this.LLILLJJLI.LJJIIZI.LJJ(this.LLJI, false);
        } else {
            this.LLILLJJLI.LJJIIZI.LJJIII(this.LLJI, null, true, false);
            this.LLILLJJLI.LJJIIZI.LJJ(this.LLJI, true);
        }
        if (lynxBaseUI.mDisableDefaultResize) {
            C1315750kLN c1315750kLN = this.LLILLJJLI;
            EnumC1316020kLo enumC1316020kLo = EnumC1316020kLo.SCALE;
            C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
            c1315720kLK.LJIIZILJ = enumC1316020kLo;
            c1315720kLK.LJJII.LIZ();
        }
        C1315750kLN c1315750kLN2 = this.LLILLJJLI;
        boolean z = c1298160jt0LIZIZ.LIZ;
        C1315720kLK c1315720kLK2 = c1315750kLN2.LJJIIZI;
        c1315720kLK2.LJIJI = z;
        c1315720kLK2.LJIJJ = c1298160jt0LIZIZ.LIZIZ;
        int i2 = this.LLJIJIL;
        if (i2 <= 0 || (i = this.LLJILJIL) <= 0) {
            return;
        }
        c1315750kLN2.LJIILIIL(i2, i, 0, 0, 0, 0);
    }

    @Override // X.AbstractC1313950kIT
    public final int LIZ() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1313950kIT
    public final int LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1313950kIT
    public final void LJII(Bitmap.Config config) {
        C1315720kLK c1315720kLK = this.LLILLJJLI.LJJIIZI;
        c1315720kLK.LJIILL = config;
        c1315720kLK.LJJII.LIZ();
    }

    @Override // X.AbstractC1313950kIT
    public final void LJIIIZ(LynxBaseUI lynxBaseUI) {
        this.LLJ = new WeakReference<>(lynxBaseUI);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LLILLL != null) {
            C1315750kLN c1315750kLN = this.LLILLJJLI;
            if (c1315750kLN.LJJJJJ && c1315750kLN.LJIIL()) {
                return;
            }
            this.LLILLL.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 68));
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // X.InterfaceC1316210kM7
    public final void onCloseableRefReady(C1323050kX9<?> c1323050kX9) {
        Bitmap underlyingBitmap;
        if (c1323050kX9 != null && c1323050kX9.LJIILLIIL()) {
            Object obj = c1323050kX9.get();
            if (obj instanceof AbstractC1325130kaV) {
                underlyingBitmap = ((AbstractC1325130kaV) obj).getUnderlyingBitmap();
            } else if (!(obj instanceof Bitmap)) {
                return;
            } else {
                underlyingBitmap = (Bitmap) obj;
            }
            if (underlyingBitmap != null) {
                this.LLIZ = true;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LLIZLLLIL.getResources(), underlyingBitmap.copy(underlyingBitmap.getConfig(), true));
                this.LLILLL = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
                this.LLILLL.setCallback(this);
                this.LLILZIL = underlyingBitmap.getWidth();
                this.LLILZLL = underlyingBitmap.getHeight();
                invalidateSelf();
            }
        }
    }

    @Override // X.InterfaceC1316210kM7
    public final void onDrawableReady(Drawable drawable) {
        LynxBaseUI lynxBaseUI;
        if (!this.LLIZ) {
            this.LLILLL = drawable;
            drawable.setBounds(getBounds());
            this.LLILLL.setCallback(this);
            WeakReference<LynxBaseUI> weakReference = this.LLJ;
            if (weakReference != null && (lynxBaseUI = weakReference.get()) != null) {
                int i = lynxBaseUI.mImageRendering;
                if (i == 2) {
                    this.LLILLL.setFilterBitmap(false);
                } else if (i == 1 || i == 0) {
                    this.LLILLL.setFilterBitmap(true);
                }
            }
            invalidateSelf();
        }
    }

    public C1315730kLL(final Context context, final String str) {
        this.LLIZLLLIL = context;
        this.LLJI = str;
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        if (context instanceof s) {
            context.getClass();
        }
        C1315750kLN c1315750kLN = new C1315750kLN(context, c1320810kTXLIZJ, this, true);
        this.LLILLJJLI = c1315750kLN;
        EnumC1316020kLo enumC1316020kLo = EnumC1316020kLo.AUTO;
        C1315720kLK c1315720kLK = c1315750kLN.LJJIIZI;
        c1315720kLK.LJIIZILJ = enumC1316020kLo;
        c1315720kLK.LJJII.LIZ();
        c1315750kLN.LJJIIZI.LJJIFFI = new InterfaceC1316380kMO() { // from class: X.0kLp
            @Override // X.InterfaceC1316380kMO
            public final void LIZ() {
                int i;
                int i2;
                C1315730kLL c1315730kLL = this.LIZ;
                C1315750kLN c1315750kLN2 = c1315730kLL.LLILLJJLI;
                if (c1315750kLN2 == null || (i = c1315730kLL.LLJIJIL) <= 0 || (i2 = c1315730kLL.LLJILJIL) <= 0) {
                    return;
                }
                c1315750kLN2.LJIILIIL(i, i2, 0, 0, 0, 0);
            }
        };
        c1315750kLN.LJIJ = new C1315960kLi() { // from class: X.0jwK
            @Override // X.C1315960kLi
            public final void LJ(int i, int i2) {
                WeakReference<LynxBaseUI> weakReference;
                C1315730kLL c1315730kLL = this.LIZJ;
                c1315730kLL.LLILZIL = i;
                c1315730kLL.LLILZLL = i2;
                if ((context instanceof s) && (weakReference = c1315730kLL.LLJ) != null && weakReference.get() != null) {
                    LynxBaseUI lynxBaseUI = this.LIZJ.LLJ.get();
                    if (lynxBaseUI.getEvents() != null && lynxBaseUI.getEvents().containsKey("bgload")) {
                        C1289960jfm c1289960jfm = new C1289960jfm(lynxBaseUI.getSign(), "bgload");
                        c1289960jfm.LIZIZ(Integer.valueOf(i2), "height");
                        c1289960jfm.LIZIZ(Integer.valueOf(i), "width");
                        c1289960jfm.LIZIZ(str, "url");
                        ((s) context).LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }

            @Override // X.C1315960kLi
            public final void LIZLLL(LynxError lynxError, int i, int i2) {
                Context context2 = context;
                if (context2 instanceof s) {
                    ((s) context2).LJJIFFI(str, "image", lynxError);
                    WeakReference<LynxBaseUI> weakReference = this.LIZJ.LLJ;
                    if (weakReference != null && weakReference.get() != null) {
                        LynxBaseUI lynxBaseUI = this.LIZJ.LLJ.get();
                        if (lynxBaseUI.getEvents() != null && lynxBaseUI.getEvents().containsKey("bgerror")) {
                            C1289960jfm c1289960jfm = new C1289960jfm(lynxBaseUI.getSign(), "bgerror");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(lynxError.LJ());
                            sbLIZ.append(": ");
                            sbLIZ.append(lynxError.LIZLLL());
                            c1289960jfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "errMsg");
                            c1289960jfm.LIZIZ(str, "url");
                            c1289960jfm.LIZIZ(Integer.valueOf(i), "lynx_categorized_code");
                            c1289960jfm.LIZIZ(Integer.valueOf(i2), "error_code");
                            ((s) context).LLIZ.LIZIZ(c1289960jfm);
                        }
                    }
                }
            }
        };
    }

    @Override // X.AbstractC1313950kIT
    public final void LJI(int i, int i2) {
        if (!this.LLILZ) {
            this.LLILLJJLI.LJIILJJIL();
            this.LLILZ = true;
            this.LLILLJJLI.LJIIIIZZ = true;
        }
        this.LLJIJIL = i;
        this.LLJILJIL = i2;
        this.LLILLJJLI.LJIILIIL(i, i2, 0, 0, 0, 0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C1289620jfE.LIZ().removeCallbacks(runnable, drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C786410Ut5.LJLIIIL(C1289620jfE.LIZ(), runnable, drawable, j);
    }
}
