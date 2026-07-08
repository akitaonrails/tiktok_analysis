package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC549040Lg6 implements AIGC<String> {
    public static final EnumC549040Lg6 EDIT_NOW;
    public static final /* synthetic */ EnumC549040Lg6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC549040Lg6 MANUAL;
    public static final EnumC549040Lg6 PRESET;
    public static final EnumC549040Lg6 PRESET_MODIFIED;
    public static final EnumC549040Lg6 PROMPT;
    public static final EnumC549040Lg6 SERVER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC549040Lg6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC549040Lg6 enumC549040Lg6 = new EnumC549040Lg6("EDIT_NOW", 0, "edit_now");
        EDIT_NOW = enumC549040Lg6;
        EnumC549040Lg6 enumC549040Lg62 = new EnumC549040Lg6("SERVER", 1, "server");
        SERVER = enumC549040Lg62;
        EnumC549040Lg6 enumC549040Lg63 = new EnumC549040Lg6("PRESET", 2, "preset");
        PRESET = enumC549040Lg63;
        EnumC549040Lg6 enumC549040Lg64 = new EnumC549040Lg6("MANUAL", 3, "manual");
        MANUAL = enumC549040Lg64;
        EnumC549040Lg6 enumC549040Lg65 = new EnumC549040Lg6("PRESET_MODIFIED", 4, "preset_modified");
        PRESET_MODIFIED = enumC549040Lg65;
        EnumC549040Lg6 enumC549040Lg66 = new EnumC549040Lg6("PROMPT", 5, "prompt");
        PROMPT = enumC549040Lg66;
        EnumC549040Lg6[] enumC549040Lg6Arr = {enumC549040Lg6, enumC549040Lg62, enumC549040Lg63, enumC549040Lg64, enumC549040Lg65, enumC549040Lg66};
        LLILLJJLI = enumC549040Lg6Arr;
        LLILLL = new C2254308sP(enumC549040Lg6Arr);
    }

    public static EnumC549040Lg6[] values() {
        return (EnumC549040Lg6[]) LLILLJJLI.clone();
    }

    @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
    public String getValue() {
        return this.LL;
    }

    public static EnumC549040Lg6 valueOf(String str) {
        return (EnumC549040Lg6) C08FF.LIZ(EnumC549040Lg6.class, str);
    }

    public boolean isFromChat(AIGC.AICreationSceneName aICreationSceneName) {
        return C549110LgD.LIZ(aICreationSceneName);
    }

    public EnumC549040Lg6(String str, int i, String str2) {
        this.LL = str2;
    }
}
