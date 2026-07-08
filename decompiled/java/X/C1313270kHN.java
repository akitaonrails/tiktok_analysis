package X;

import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import j27.s;

/* JADX INFO: renamed from: X.0kHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313270kHN extends AbstractC1313300kHQ<BackgroundDrawable> {
    public int LJ;

    @Override // X.AbstractC1313300kHQ
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public BackgroundDrawable LIZ() {
        return new BackgroundDrawable(this.LIZ, this.LIZLLL);
    }

    public final C1313900kIO LJIIL() {
        T t = this.LIZIZ;
        if (t == 0) {
            return null;
        }
        return ((BackgroundDrawable) t).LJJII;
    }

    public C1313270kHN(s sVar) {
        super(sVar);
    }

    public final void LJIILIIL(int i) {
        this.LJ = i;
        if (i == 0 && this.LIZIZ == 0) {
            return;
        }
        LIZIZ().setColor(i);
    }

    public final void LJIILL(int i, Integer num) {
        float fIntValue;
        float fIntValue2 = 1.0E21f;
        if (num == null) {
            fIntValue = 1.0E21f;
        } else {
            fIntValue = num.intValue() & 16777215;
            fIntValue2 = num.intValue() >>> 24;
        }
        LJIILJJIL(fIntValue, fIntValue2, i);
    }

    public final boolean LJIILLIIL(int i, ReadableArray readableArray) {
        boolean z;
        boolean z2;
        int i2;
        int i3 = 0;
        if (readableArray != null && readableArray.size() > 0) {
            if (i == 0) {
                if (readableArray.size() == 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LynxLog.DCHECK(z2);
                do {
                    i2 = i3 + 1;
                    LJIIZILJ(i2, C1314110kIj.LIZ(i3 * 4, readableArray));
                    i3 = i2;
                } while (i2 < 4);
            } else {
                if (readableArray.size() == 4) {
                    z = true;
                } else {
                    z = false;
                }
                LynxLog.DCHECK(z);
                LJIIZILJ(i, C1314110kIj.LIZ(0, readableArray));
            }
            return true;
        }
        if (i == 0) {
            int i4 = 0;
            do {
                i4++;
                LJIIZILJ(i4, new C1314110kIj());
            } while (i4 < 4);
        } else {
            LJIIZILJ(i, new C1314110kIj());
        }
        return false;
    }

    public final void LJIIZILJ(int i, C1314110kIj c1314110kIj) {
        BackgroundDrawable backgroundDrawableLIZIZ = LIZIZ();
        backgroundDrawableLIZIZ.getClass();
        if (i > 0 && i <= 8) {
            C1313900kIO c1313900kIO = backgroundDrawableLIZIZ.LJJII;
            if (c1313900kIO == null) {
                backgroundDrawableLIZIZ.LJJII = new C1313900kIO();
                Rect bounds = backgroundDrawableLIZIZ.getBounds();
                backgroundDrawableLIZIZ.LJJII.LIZLLL(bounds.width(), bounds.height());
            } else {
                c1313900kIO.LIZLLL = null;
            }
            if (backgroundDrawableLIZIZ.LJJII.LIZJ(i - 1, c1314110kIj)) {
                backgroundDrawableLIZIZ.LJIL = true;
                backgroundDrawableLIZIZ.invalidateSelf();
            }
        }
    }

    public final void LJIJ(int i, int i2) {
        BackgroundDrawable backgroundDrawableLIZIZ = LIZIZ();
        backgroundDrawableLIZIZ.getClass();
        if (i <= 8 && i >= 0) {
            if (backgroundDrawableLIZIZ.LJIIJJI == null) {
                backgroundDrawableLIZIZ.LJIIJJI = new EnumC1313350kHV[9];
            }
            try {
                EnumC1313350kHV enumC1313350kHV = EnumC1313350kHV.parse(i2);
                EnumC1313350kHV[] enumC1313350kHVArr = backgroundDrawableLIZIZ.LJIIJJI;
                if (enumC1313350kHVArr[i] != enumC1313350kHV) {
                    enumC1313350kHVArr[i] = enumC1313350kHV;
                    backgroundDrawableLIZIZ.invalidateSelf();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIILJJIL(float f, float f2, int i) {
        BackgroundDrawable backgroundDrawableLIZIZ = LIZIZ();
        if (backgroundDrawableLIZIZ.LJIIIZ == null) {
            backgroundDrawableLIZIZ.LJIIIZ = new C1314260kIy(0.0f);
        }
        backgroundDrawableLIZIZ.LJIIIZ.LIZIZ(f, i);
        if (backgroundDrawableLIZIZ.LJIIJ == null) {
            backgroundDrawableLIZIZ.LJIIJ = new C1314260kIy(255.0f);
        }
        backgroundDrawableLIZIZ.LJIIJ.LIZIZ(f2, i);
    }
}
