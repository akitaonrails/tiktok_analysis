package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: X.16Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20744916Fr {
    public static ColorStateList LIZ(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static PorterDuff.Mode LIZIZ(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void LIZJ(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void LIZLLL(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
