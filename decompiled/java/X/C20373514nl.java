package X;

import com.bytedance.android.live.design.view.sheet.SheetOptions;

/* JADX INFO: renamed from: X.14nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20373514nl {
    public static final SheetOptions LIZ(boolean z) {
        if (!z) {
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.draggable = false;
            sheetOptions.LIZ(1, null);
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(8.0f);
            return sheetOptions;
        }
        SheetOptions sheetOptions2 = new SheetOptions();
        sheetOptions2.draggable = false;
        sheetOptions2.LIZ(6, null);
        sheetOptions2.dimBehindType = 2;
        sheetOptions2.cornerRadius = (int) C497740JfY.LIZIZ(0.0f);
        return sheetOptions2;
    }
}
