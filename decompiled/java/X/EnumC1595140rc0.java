package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1595140rc0 {
    public static final EnumC1595140rc0 DEFAULT;
    public static final EnumC1595140rc0 EXIT_DETAIL;
    public static final /* synthetic */ EnumC1595140rc0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1595140rc0 TAB_CHANGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1595140rc0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1595140rc0 enumC1595140rc0 = new EnumC1595140rc0(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1595140rc0;
        EnumC1595140rc0 enumC1595140rc02 = new EnumC1595140rc0("EXIT_DETAIL", 1, 1);
        EXIT_DETAIL = enumC1595140rc02;
        EnumC1595140rc0 enumC1595140rc03 = new EnumC1595140rc0("TAB_CHANGE", 2, 2);
        TAB_CHANGE = enumC1595140rc03;
        EnumC1595140rc0[] enumC1595140rc0Arr = {enumC1595140rc0, enumC1595140rc02, enumC1595140rc03};
        LLILLJJLI = enumC1595140rc0Arr;
        LLILLL = new C2254308sP(enumC1595140rc0Arr);
    }

    public static EnumC1595140rc0[] values() {
        return (EnumC1595140rc0[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1595140rc0 valueOf(String str) {
        return (EnumC1595140rc0) C08FF.LIZ(EnumC1595140rc0.class, str);
    }

    public EnumC1595140rc0(String str, int i, int i2) {
        this.LL = i2;
    }
}
