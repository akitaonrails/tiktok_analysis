package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.16Ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20736416Ck<T extends View> extends AbstractC20736516Cl {
    public final T LL;

    public abstract void LJFF(TypedArray typedArray);

    public AbstractC20736416Ck(T t) {
        this.LL = t;
    }

    public final void LJI(int i) {
        Context context = this.LL.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, LIZLLL());
        LJ(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LJ(Context context, TypedArray typedArray) {
        LJFF(typedArray);
    }

    public void LJII(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.LL.getContext().obtainStyledAttributes(attributeSet, LIZLLL(), i, i2);
        LJFF(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
