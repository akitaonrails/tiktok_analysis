package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20743816Fg extends AbstractC20736516Cl implements C16FX {
    public float LL = 1.0f;
    public float LLILLJJLI = 1.0f;
    public float LLILLL = 1.0f;
    public final InterfaceC20744516Fn LLILZ;

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        return R$styleable.StateAlphaStyleableHelper;
    }

    public C20743816Fg(InterfaceC20744516Fn interfaceC20744516Fn) {
        this.LLILZ = interfaceC20744516Fn;
    }

    public final boolean LJFF(Canvas canvas) {
        float f;
        float f2;
        if (!this.LLILZ.isEnabled()) {
            f = 255;
            f2 = this.LLILLJJLI;
        } else if (this.LLILZ.LIZ()) {
            f = 255;
            f2 = this.LL;
        } else {
            f = 255;
            f2 = this.LLILLL;
        }
        int i = (int) (f * f2);
        if (i < 255) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.LLILZ.getWidth(), this.LLILZ.getHeight(), i, 31);
            return true;
        }
        return false;
    }

    public final void LJ(Context context, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == R$styleable.StateAlphaStyleableHelper_pressedAlpha) {
                TypedValue typedValue = new TypedValue();
                typedArray.getValue(R$styleable.StateAlphaStyleableHelper_pressedAlpha, typedValue);
                this.LL = typedValue.getFloat();
            } else if (index == R$styleable.StateAlphaStyleableHelper_disabledAlpha) {
                TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(R$styleable.StateAlphaStyleableHelper_disabledAlpha, typedValue2);
                this.LLILLJJLI = typedValue2.getFloat();
            } else if (index == R$styleable.StateAlphaStyleableHelper_alpha) {
                TypedValue typedValue3 = new TypedValue();
                typedArray.getValue(R$styleable.StateAlphaStyleableHelper_alpha, typedValue3);
                this.LLILLL = typedValue3.getFloat();
            }
        }
        this.LLILZ.invalidate();
    }
}
