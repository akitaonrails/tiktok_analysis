package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.service.ILynxImageService;
import com.lynx.tasm.service.ILynxImageServiceExtension;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0kHR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1313310kHR implements Drawable.Callback {
    public final List<AbstractC1313950kIT> LL = new ArrayList();
    public final List<C1314490kJL> LLILLJJLI = new ArrayList();
    public final List<Integer> LLILLL = new ArrayList();
    public final List<Integer> LLILZ = new ArrayList();
    public final List<EnumC1314080kIg> LLILZIL = new ArrayList();
    public final List<C1314500kJM> LLILZLL = new ArrayList();
    public final s LLIZ;
    public final Drawable LLIZLLLIL;
    public Bitmap.Config LLJ;
    public boolean LLJI;
    public final ILynxImageService LLJIJIL;
    public final ILynxImageServiceExtension LLJILJIL;

    public abstract boolean LIZJ();

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int LIZIZ() {
        if (((ArrayList) this.LLILZ).isEmpty()) {
            return 1;
        }
        List<Integer> list = this.LLILZ;
        return ((Integer) ListProtector.get(list, ((ArrayList) list).size() - 1)).intValue();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.LLIZLLLIL.invalidateSelf();
    }

    public AbstractC1313310kHR(s sVar, Drawable drawable) {
        ILynxImageServiceExtension iLynxImageServiceExtension;
        this.LLIZ = sVar;
        this.LLIZLLLIL = drawable;
        ILynxImageService iLynxImageService = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        this.LLJIJIL = iLynxImageService;
        if (iLynxImageService instanceof ILynxImageServiceExtension) {
            iLynxImageServiceExtension = (ILynxImageServiceExtension) iLynxImageService;
        } else {
            iLynxImageServiceExtension = null;
        }
        this.LLJILJIL = iLynxImageServiceExtension;
    }

    public void LIZLLL(ReadableArray readableArray, LynxBaseUI lynxBaseUI) {
        AbstractC1313950kIT abstractC1313950kITCreateBackgroundImageDrawable;
        Iterator it2 = ((ArrayList) this.LL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1313950kIT) it2.next()).LJ();
        }
        ((ArrayList) this.LL).clear();
        if (readableArray == null) {
            return;
        }
        Rect bounds = this.LLIZLLLIL.getBounds();
        int size = readableArray.size();
        int i = 0;
        while (i < size) {
            int i2 = (int) readableArray.getLong(i);
            if (i2 == 1) {
                i++;
                ILynxImageServiceExtension iLynxImageServiceExtension = this.LLJILJIL;
                if (iLynxImageServiceExtension != null) {
                    s sVar = this.LLIZ;
                    if (!sVar.LLLIILIL && (abstractC1313950kITCreateBackgroundImageDrawable = iLynxImageServiceExtension.createBackgroundImageDrawable(sVar, readableArray.getString(i))) != null) {
                        abstractC1313950kITCreateBackgroundImageDrawable.LJIIIZ(lynxBaseUI);
                        abstractC1313950kITCreateBackgroundImageDrawable.setCallback(this);
                        ((ArrayList) this.LL).add(abstractC1313950kITCreateBackgroundImageDrawable);
                    }
                }
                i++;
            } else if (i2 == 2) {
                i++;
                ((ArrayList) this.LL).add(new C1315150kKP(readableArray.getArray(i)));
            } else if (i2 == 3) {
                i++;
                ((ArrayList) this.LL).add(new C1315130kKN(readableArray.getArray(i)));
            } else if (i2 == 4) {
                i++;
                ((ArrayList) this.LL).add(new C1315140kKO(readableArray.getArray(i)));
            } else if (i2 == 0) {
                i++;
                ((ArrayList) this.LL).add(new AbstractC1313950kIT() { // from class: X.0kJV
                    @Override // X.AbstractC1313950kIT
                    public final int LIZ() {
                        return 0;
                    }

                    @Override // X.AbstractC1313950kIT
                    public final int LIZIZ() {
                        return 0;
                    }

                    @Override // X.AbstractC1313950kIT
                    public final boolean LIZJ() {
                        return false;
                    }

                    @Override // X.AbstractC1313950kIT
                    public final void LIZLLL() {
                    }

                    @Override // X.AbstractC1313950kIT
                    public final void LJ() {
                    }

                    @Override // X.AbstractC1313950kIT
                    public final void LJI(int i3, int i4) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                    }
                });
            }
            if (!bounds.isEmpty()) {
                List<AbstractC1313950kIT> list = this.LL;
                ((AbstractC1313950kIT) ListProtector.get(list, ((ArrayList) list).size() - 1)).LJI(bounds.width(), bounds.height());
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a8 A[PHI: r21
      0x02a8: PHI (r21v9 float) = (r21v8 float), (r21v11 float) binds: [B:105:0x02a4, B:40:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(android.graphics.Canvas r25, android.graphics.RectF r26, android.graphics.RectF r27, android.graphics.RectF r28, android.graphics.RectF r29, android.graphics.Path r30, android.graphics.Path r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1313310kHR.LIZ(android.graphics.Canvas, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF, android.graphics.Path, android.graphics.Path, boolean):void");
    }
}
