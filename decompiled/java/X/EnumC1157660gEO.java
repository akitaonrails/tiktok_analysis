package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157660gEO {
    public static final EnumC1157660gEO HAS_APPLIED_EFFECT;
    public static final /* synthetic */ EnumC1157660gEO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1157660gEO NOT_APPLIED_EFFECT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1157660gEO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1157660gEO enumC1157660gEO = new EnumC1157660gEO("HAS_APPLIED_EFFECT", 0, "1");
        HAS_APPLIED_EFFECT = enumC1157660gEO;
        EnumC1157660gEO enumC1157660gEO2 = new EnumC1157660gEO("NOT_APPLIED_EFFECT", 1, CardStruct.IStatusCode.DEFAULT);
        NOT_APPLIED_EFFECT = enumC1157660gEO2;
        EnumC1157660gEO[] enumC1157660gEOArr = {enumC1157660gEO, enumC1157660gEO2};
        LLILLJJLI = enumC1157660gEOArr;
        LLILLL = new C2254308sP(enumC1157660gEOArr);
    }

    public static EnumC1157660gEO[] values() {
        return (EnumC1157660gEO[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static EnumC1157660gEO valueOf(String str) {
        return (EnumC1157660gEO) C08FF.LIZ(EnumC1157660gEO.class, str);
    }

    public EnumC1157660gEO(String str, int i, String str2) {
        this.LL = str2;
    }
}
