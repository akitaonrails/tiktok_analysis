package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r5T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1574970r5T {
    public static final EnumC1574970r5T COMPLTETE;
    public static final EnumC1574970r5T DEFAULT;
    public static final EnumC1574970r5T FAILED;
    public static final /* synthetic */ EnumC1574970r5T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1574970r5T LOADING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1574970r5T> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1574970r5T enumC1574970r5T = new EnumC1574970r5T(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1574970r5T;
        EnumC1574970r5T enumC1574970r5T2 = new EnumC1574970r5T("LOADING", 1, 1);
        LOADING = enumC1574970r5T2;
        EnumC1574970r5T enumC1574970r5T3 = new EnumC1574970r5T("COMPLTETE", 2, 2);
        COMPLTETE = enumC1574970r5T3;
        EnumC1574970r5T enumC1574970r5T4 = new EnumC1574970r5T("FAILED", 3, 3);
        FAILED = enumC1574970r5T4;
        EnumC1574970r5T[] enumC1574970r5TArr = {enumC1574970r5T, enumC1574970r5T2, enumC1574970r5T3, enumC1574970r5T4};
        LLILLJJLI = enumC1574970r5TArr;
        LLILLL = new C2254308sP(enumC1574970r5TArr);
    }

    public static EnumC1574970r5T[] values() {
        return (EnumC1574970r5T[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1574970r5T valueOf(String str) {
        return (EnumC1574970r5T) C08FF.LIZ(EnumC1574970r5T.class, str);
    }

    public EnumC1574970r5T(String str, int i, int i2) {
        this.LL = i2;
    }
}
