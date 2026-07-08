package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1012720cSc {
    public static final EnumC1012720cSc DEFAULT;
    public static final EnumC1012720cSc FOLLOWER;
    public static final EnumC1012720cSc LIKE;
    public static final /* synthetic */ EnumC1012720cSc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1012720cSc SALES;
    public static final EnumC1012720cSc STAR;
    public static final EnumC1012720cSc TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1012720cSc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1012720cSc enumC1012720cSc = new EnumC1012720cSc(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1012720cSc;
        EnumC1012720cSc enumC1012720cSc2 = new EnumC1012720cSc("STAR", 1, 1);
        STAR = enumC1012720cSc2;
        EnumC1012720cSc enumC1012720cSc3 = new EnumC1012720cSc("SALES", 2, 2);
        SALES = enumC1012720cSc3;
        EnumC1012720cSc enumC1012720cSc4 = new EnumC1012720cSc("FOLLOWER", 3, 3);
        FOLLOWER = enumC1012720cSc4;
        EnumC1012720cSc enumC1012720cSc5 = new EnumC1012720cSc("LIKE", 4, 4);
        LIKE = enumC1012720cSc5;
        EnumC1012720cSc enumC1012720cSc6 = new EnumC1012720cSc("TEXT", 5, 5);
        TEXT = enumC1012720cSc6;
        EnumC1012720cSc[] enumC1012720cScArr = {enumC1012720cSc, enumC1012720cSc2, enumC1012720cSc3, enumC1012720cSc4, enumC1012720cSc5, enumC1012720cSc6};
        LLILLJJLI = enumC1012720cScArr;
        LLILLL = new C2254308sP(enumC1012720cScArr);
    }

    public static EnumC1012720cSc[] values() {
        return (EnumC1012720cSc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1012720cSc valueOf(String str) {
        return (EnumC1012720cSc) C08FF.LIZ(EnumC1012720cSc.class, str);
    }

    public EnumC1012720cSc(String str, int i, int i2) {
        this.LL = i2;
    }
}
