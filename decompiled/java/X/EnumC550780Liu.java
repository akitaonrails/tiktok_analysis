package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Liu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC550780Liu implements AIGC<String> {
    public static final EnumC550780Liu CHANGE_CHAT;
    public static final EnumC550780Liu ELSE;
    public static final EnumC550780Liu ENTER;
    public static final /* synthetic */ EnumC550780Liu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC550780Liu RESUME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC550780Liu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC550780Liu enumC550780Liu = new EnumC550780Liu("ENTER", 0, "enter");
        ENTER = enumC550780Liu;
        EnumC550780Liu enumC550780Liu2 = new EnumC550780Liu("RESUME", 1, "resume");
        RESUME = enumC550780Liu2;
        EnumC550780Liu enumC550780Liu3 = new EnumC550780Liu("CHANGE_CHAT", 2, "change_chat");
        CHANGE_CHAT = enumC550780Liu3;
        EnumC550780Liu enumC550780Liu4 = new EnumC550780Liu("ELSE", 3, "else");
        ELSE = enumC550780Liu4;
        EnumC550780Liu[] enumC550780LiuArr = {enumC550780Liu, enumC550780Liu2, enumC550780Liu3, enumC550780Liu4};
        LLILLJJLI = enumC550780LiuArr;
        LLILLL = new C2254308sP(enumC550780LiuArr);
    }

    public static EnumC550780Liu[] values() {
        return (EnumC550780Liu[]) LLILLJJLI.clone();
    }

    @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
    public String getValue() {
        return this.LL;
    }

    public static EnumC550780Liu valueOf(String str) {
        return (EnumC550780Liu) C08FF.LIZ(EnumC550780Liu.class, str);
    }

    public boolean isFromChat(AIGC.AICreationSceneName aICreationSceneName) {
        return C549110LgD.LIZ(aICreationSceneName);
    }

    public EnumC550780Liu(String str, int i, String str2) {
        this.LL = str2;
    }
}
