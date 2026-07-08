package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042550dEj {
    public static final EnumC1042550dEj DEFAULT;
    public static final /* synthetic */ EnumC1042550dEj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1042550dEj OTHERS;
    public static final EnumC1042550dEj PURE;

    public static InterfaceC2044707zh<EnumC1042550dEj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1042550dEj enumC1042550dEj = new EnumC1042550dEj(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1042550dEj;
        EnumC1042550dEj enumC1042550dEj2 = new EnumC1042550dEj("PURE", 1);
        PURE = enumC1042550dEj2;
        EnumC1042550dEj enumC1042550dEj3 = new EnumC1042550dEj("OTHERS", 2);
        OTHERS = enumC1042550dEj3;
        EnumC1042550dEj[] enumC1042550dEjArr = {enumC1042550dEj, enumC1042550dEj2, enumC1042550dEj3};
        LL = enumC1042550dEjArr;
        LLILLJJLI = new C2254308sP(enumC1042550dEjArr);
    }

    public static EnumC1042550dEj[] values() {
        return (EnumC1042550dEj[]) LL.clone();
    }

    public static EnumC1042550dEj valueOf(String str) {
        return (EnumC1042550dEj) C08FF.LIZ(EnumC1042550dEj.class, str);
    }

    public EnumC1042550dEj(String str, int i) {
    }
}
