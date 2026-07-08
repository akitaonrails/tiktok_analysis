package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994307rZ {
    public static final /* synthetic */ EnumC1994307rZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1994307rZ NORMAL;
    public static final EnumC1994307rZ NUMBER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1994307rZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994307rZ enumC1994307rZ = new EnumC1994307rZ("NORMAL", 0, CardStruct.IStatusCode.DEFAULT);
        NORMAL = enumC1994307rZ;
        EnumC1994307rZ enumC1994307rZ2 = new EnumC1994307rZ("NUMBER", 1, "1");
        NUMBER = enumC1994307rZ2;
        EnumC1994307rZ[] enumC1994307rZArr = {enumC1994307rZ, enumC1994307rZ2};
        LLILLJJLI = enumC1994307rZArr;
        LLILLL = new C2254308sP(enumC1994307rZArr);
    }

    public static EnumC1994307rZ[] values() {
        return (EnumC1994307rZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1994307rZ valueOf(String str) {
        return (EnumC1994307rZ) C08FF.LIZ(EnumC1994307rZ.class, str);
    }

    public EnumC1994307rZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
