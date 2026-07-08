package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1982707ph {
    public static final EnumC1982707ph DEFAULT;
    public static final /* synthetic */ EnumC1982707ph[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1982707ph US;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1982707ph> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1982707ph enumC1982707ph = new EnumC1982707ph(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1982707ph;
        EnumC1982707ph enumC1982707ph2 = new EnumC1982707ph("US", 1, 1);
        US = enumC1982707ph2;
        EnumC1982707ph[] enumC1982707phArr = {enumC1982707ph, enumC1982707ph2};
        LLILLJJLI = enumC1982707phArr;
        LLILLL = new C2254308sP(enumC1982707phArr);
    }

    public static EnumC1982707ph[] values() {
        return (EnumC1982707ph[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1982707ph valueOf(String str) {
        return (EnumC1982707ph) C08FF.LIZ(EnumC1982707ph.class, str);
    }

    public EnumC1982707ph(String str, int i, int i2) {
        this.LL = i2;
    }
}
