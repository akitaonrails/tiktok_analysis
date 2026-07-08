package X;

import android.R;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D4D, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D4D {
    public static final C1D4D Autofill;
    public static final C1D4D Copy;
    public static final C1D4D Cut;
    public static final /* synthetic */ C1D4D[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C1D4D Paste;
    public static final C1D4D SelectAll;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C1D4D> getEntries() {
        return LLILZ;
    }

    public static C1D4D valueOf(String str) {
        return (C1D4D) C08FF.LIZ(C1D4D.class, str);
    }

    public static C1D4D[] values() {
        return (C1D4D[]) LLILLL.clone();
    }

    static {
        C1D4D c1d4d = new C1D4D("Copy", 0, 0);
        Copy = c1d4d;
        C1D4D c1d4d2 = new C1D4D("Paste", 1, 1);
        Paste = c1d4d2;
        C1D4D c1d4d3 = new C1D4D("Cut", 2, 2);
        Cut = c1d4d3;
        C1D4D c1d4d4 = new C1D4D("SelectAll", 3, 3);
        SelectAll = c1d4d4;
        C1D4D c1d4d5 = new C1D4D("Autofill", 4, 4);
        Autofill = c1d4d5;
        C1D4D[] c1d4dArr = {c1d4d, c1d4d2, c1d4d3, c1d4d4, c1d4d5};
        LLILLL = c1d4dArr;
        LLILZ = new C2254308sP(c1d4dArr);
    }

    public final int getTitleResource() {
        int i = C1D4E.LIZ[ordinal()];
        if (i == 1) {
            return R.string.copy;
        }
        if (i == 2) {
            return R.string.paste;
        }
        if (i == 3) {
            return R.string.cut;
        }
        if (i == 4) {
            return R.string.selectAll;
        }
        if (i != 5) {
            throw new C1954807lC();
        }
        if (Build.VERSION.SDK_INT <= 26) {
            return 2131826936;
        }
        return R.string.autofill;
    }

    public final int getId() {
        return this.LL;
    }

    public final int getOrder() {
        return this.LLILLJJLI;
    }

    public C1D4D(String str, int i, int i2) {
        this.LL = i2;
        this.LLILLJJLI = i2;
    }
}
