package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20744816Fq extends AbstractC20736416Ck<CompoundButton> {
    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        return R$styleable.CompoundButtonStyleableHelper;
    }

    public C20744816Fq(CompoundButton compoundButton) {
        super(compoundButton);
    }

    @Override // X.AbstractC20736416Ck
    public final void LJFF(TypedArray typedArray) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        if (typedArray.getIndexCount() > 0) {
            if (typedArray.hasValue(0) && (resourceId4 = typedArray.getResourceId(0, 0)) != 0) {
                T t = this.LL;
                ((CompoundButton) t).setButtonDrawable(C14MI.LIZ(t.getContext(), resourceId4));
            }
            ((CompoundButton) this.LL).setButtonDrawable(typedArray.getDrawable(0));
        }
        if (typedArray.hasValue(R$styleable.CompoundButtonStyleableHelper_liveButtonCompat) && (resourceId3 = typedArray.getResourceId(R$styleable.CompoundButtonStyleableHelper_liveButtonCompat, 0)) != 0) {
            try {
                T t2 = this.LL;
                ((CompoundButton) t2).setButtonDrawable(C14MI.LIZ(t2.getContext(), resourceId3));
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                if (typedArray.hasValue(R$styleable.CompoundButtonStyleableHelper_android_button)) {
                    T t3 = this.LL;
                    ((CompoundButton) t3).setButtonDrawable(C14MI.LIZ(t3.getContext(), resourceId));
                }
            }
        } else if (typedArray.hasValue(R$styleable.CompoundButtonStyleableHelper_android_button) && (resourceId = typedArray.getResourceId(R$styleable.CompoundButtonStyleableHelper_android_button, 0)) != 0) {
            T t32 = this.LL;
            ((CompoundButton) t32).setButtonDrawable(C14MI.LIZ(t32.getContext(), resourceId));
        }
        if (typedArray.hasValue(R$styleable.CompoundButtonStyleableHelper_buttonTint) && (resourceId2 = typedArray.getResourceId(R$styleable.CompoundButtonStyleableHelper_buttonTint, 0)) != 0) {
            ColorStateList colorStateListLIZIZ = C838410Wul.LIZIZ(resourceId2, this.LL.getContext());
            if (colorStateListLIZIZ == null) {
                colorStateListLIZIZ = typedArray.getColorStateList(R$styleable.CompoundButtonStyleableHelper_buttonTint);
            }
            C20744916Fr.LIZJ((CompoundButton) this.LL, colorStateListLIZIZ);
        }
        if (typedArray.hasValue(R$styleable.CompoundButtonStyleableHelper_buttonTintMode)) {
            C20744916Fr.LIZLLL((CompoundButton) this.LL, C418940Gbk.LIZ(typedArray.getInt(R$styleable.CompoundButtonStyleableHelper_buttonTintMode, -1), null));
        }
    }
}
