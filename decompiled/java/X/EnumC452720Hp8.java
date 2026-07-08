package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452720Hp8 {
    public static final C452790HpF Companion;
    public static final /* synthetic */ EnumC452720Hp8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC452720Hp8 THIRD_PARTY_TENOR;
    public static final EnumC452720Hp8 VIDEO_STICKER;
    public static final C01GW<Map<Integer, EnumC452720Hp8>> valueMap$delegate;
    public final int LL;

    public static InterfaceC2044707zh<EnumC452720Hp8> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0HpF] */
    static {
        EnumC452720Hp8 enumC452720Hp8 = new EnumC452720Hp8("VIDEO_STICKER", 0, 0);
        VIDEO_STICKER = enumC452720Hp8;
        EnumC452720Hp8 enumC452720Hp82 = new EnumC452720Hp8("THIRD_PARTY_TENOR", 1, 1);
        THIRD_PARTY_TENOR = enumC452720Hp82;
        EnumC452720Hp8[] enumC452720Hp8Arr = {enumC452720Hp8, enumC452720Hp82};
        LLILLJJLI = enumC452720Hp8Arr;
        LLILLL = new C2254308sP(enumC452720Hp8Arr);
        Companion = new Object() { // from class: X.0HpF
        };
        valueMap$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(454));
    }

    public static EnumC452720Hp8[] values() {
        return (EnumC452720Hp8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC452720Hp8 valueOf(String str) {
        return (EnumC452720Hp8) C08FF.LIZ(EnumC452720Hp8.class, str);
    }

    public EnumC452720Hp8(String str, int i, int i2) {
        this.LL = i2;
    }
}
