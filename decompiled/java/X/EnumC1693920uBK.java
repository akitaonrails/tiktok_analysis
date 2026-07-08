package X;

import android.R;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1693920uBK {
    public static final EnumC1693920uBK Autofill;
    public static final EnumC1693920uBK Copy;
    public static final EnumC1693920uBK Cut;
    public static final /* synthetic */ EnumC1693920uBK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1693920uBK Paste;
    public static final EnumC1693920uBK SelectAll;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1693920uBK> getEntries() {
        return LLILLL;
    }

    public static EnumC1693920uBK valueOf(String str) {
        return (EnumC1693920uBK) C08FF.LIZ(EnumC1693920uBK.class, str);
    }

    public static EnumC1693920uBK[] values() {
        return (EnumC1693920uBK[]) LLILLJJLI.clone();
    }

    static {
        EnumC1693920uBK enumC1693920uBK = new EnumC1693920uBK("Cut", 0, R.string.cut);
        Cut = enumC1693920uBK;
        EnumC1693920uBK enumC1693920uBK2 = new EnumC1693920uBK("Copy", 1, R.string.copy);
        Copy = enumC1693920uBK2;
        EnumC1693920uBK enumC1693920uBK3 = new EnumC1693920uBK("Paste", 2, R.string.paste);
        Paste = enumC1693920uBK3;
        EnumC1693920uBK enumC1693920uBK4 = new EnumC1693920uBK("SelectAll", 3, R.string.selectAll);
        SelectAll = enumC1693920uBK4;
        EnumC1693920uBK enumC1693920uBK5 = new EnumC1693920uBK("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? 2131826936 : R.string.autofill);
        Autofill = enumC1693920uBK5;
        EnumC1693920uBK[] enumC1693920uBKArr = {enumC1693920uBK, enumC1693920uBK2, enumC1693920uBK3, enumC1693920uBK4, enumC1693920uBK5};
        LLILLJJLI = enumC1693920uBKArr;
        LLILLL = new C2254308sP(enumC1693920uBKArr);
    }

    public final String resolvedString(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        return C0MBB.LIZIZ(this.LL, interfaceC1680500tpg);
    }

    public EnumC1693920uBK(String str, int i, int i2) {
        this.LL = i2;
    }
}
