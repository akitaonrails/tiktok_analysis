package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671580QVw {
    public static final EnumC671580QVw DEFAULT;
    public static final /* synthetic */ EnumC671580QVw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC671580QVw NO_RESULT;
    public static final EnumC671580QVw NO_SUG;
    public static final EnumC671580QVw ONLY_RESULT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC671580QVw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC671580QVw enumC671580QVw = new EnumC671580QVw(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 1);
        DEFAULT = enumC671580QVw;
        EnumC671580QVw enumC671580QVw2 = new EnumC671580QVw("NO_SUG", 1, 2);
        NO_SUG = enumC671580QVw2;
        EnumC671580QVw enumC671580QVw3 = new EnumC671580QVw("NO_RESULT", 2, 3);
        NO_RESULT = enumC671580QVw3;
        EnumC671580QVw enumC671580QVw4 = new EnumC671580QVw("ONLY_RESULT", 3, 4);
        ONLY_RESULT = enumC671580QVw4;
        EnumC671580QVw[] enumC671580QVwArr = {enumC671580QVw, enumC671580QVw2, enumC671580QVw3, enumC671580QVw4};
        LLILLJJLI = enumC671580QVwArr;
        LLILLL = new C2254308sP(enumC671580QVwArr);
    }

    public static EnumC671580QVw[] values() {
        return (EnumC671580QVw[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC671580QVw valueOf(String str) {
        return (EnumC671580QVw) C08FF.LIZ(EnumC671580QVw.class, str);
    }

    public EnumC671580QVw(String str, int i, int i2) {
        this.LL = i2;
    }
}
