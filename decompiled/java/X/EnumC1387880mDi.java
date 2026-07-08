package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1387880mDi {
    public static final EnumC1387880mDi DEFAULT;
    public static final EnumC1387880mDi DIGG;
    public static final /* synthetic */ EnumC1387880mDi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1387880mDi REPLY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1387880mDi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1387880mDi enumC1387880mDi = new EnumC1387880mDi(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1387880mDi;
        EnumC1387880mDi enumC1387880mDi2 = new EnumC1387880mDi("DIGG", 1, 1);
        DIGG = enumC1387880mDi2;
        EnumC1387880mDi enumC1387880mDi3 = new EnumC1387880mDi("REPLY", 2, 2);
        REPLY = enumC1387880mDi3;
        EnumC1387880mDi[] enumC1387880mDiArr = {enumC1387880mDi, enumC1387880mDi2, enumC1387880mDi3};
        LLILLJJLI = enumC1387880mDiArr;
        LLILLL = new C2254308sP(enumC1387880mDiArr);
    }

    public static EnumC1387880mDi[] values() {
        return (EnumC1387880mDi[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1387880mDi valueOf(String str) {
        return (EnumC1387880mDi) C08FF.LIZ(EnumC1387880mDi.class, str);
    }

    public EnumC1387880mDi(String str, int i, int i2) {
        this.LL = i2;
    }
}
