package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0alL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC947450alL {
    public static final C947490alP Companion;
    public static final /* synthetic */ EnumC947450alL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC947450alL SOCIAL_GAME_TYPE_LETS_DANCE;
    public static final EnumC947450alL SOCIAL_GAME_TYPE_NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC947450alL> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0alP] */
    static {
        EnumC947450alL enumC947450alL = new EnumC947450alL("SOCIAL_GAME_TYPE_NONE", 0, 0);
        SOCIAL_GAME_TYPE_NONE = enumC947450alL;
        EnumC947450alL enumC947450alL2 = new EnumC947450alL("SOCIAL_GAME_TYPE_LETS_DANCE", 1, LSPassThroughRecordSizeConfig.DEFAULT);
        SOCIAL_GAME_TYPE_LETS_DANCE = enumC947450alL2;
        EnumC947450alL[] enumC947450alLArr = {enumC947450alL, enumC947450alL2};
        LLILLJJLI = enumC947450alLArr;
        LLILLL = new C2254308sP(enumC947450alLArr);
        Companion = new Object() { // from class: X.0alP
        };
    }

    public static EnumC947450alL[] values() {
        return (EnumC947450alL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC947450alL valueOf(String str) {
        return (EnumC947450alL) C08FF.LIZ(EnumC947450alL.class, str);
    }

    public EnumC947450alL(String str, int i, int i2) {
        this.LL = i2;
    }
}
