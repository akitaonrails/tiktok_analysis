package X;

import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.ComponentTypeAdapter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09CS(ComponentTypeAdapter.class)
public final class EnumC125100dl {
    public static final EnumC125100dl BATTLE_RESULT_ANIMATION;
    public static final EnumC125100dl BATTLE_START_ANIMATION;
    public static final /* synthetic */ EnumC125100dl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC125100dl TITLE_BAR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC125100dl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC125100dl enumC125100dl = new EnumC125100dl("BATTLE_RESULT_ANIMATION", 0, 7);
        BATTLE_RESULT_ANIMATION = enumC125100dl;
        EnumC125100dl enumC125100dl2 = new EnumC125100dl("BATTLE_START_ANIMATION", 1, 8);
        BATTLE_START_ANIMATION = enumC125100dl2;
        EnumC125100dl enumC125100dl3 = new EnumC125100dl("TITLE_BAR", 2, 18);
        TITLE_BAR = enumC125100dl3;
        EnumC125100dl[] enumC125100dlArr = {enumC125100dl, enumC125100dl2, enumC125100dl3};
        LLILLJJLI = enumC125100dlArr;
        LLILLL = new C2254308sP(enumC125100dlArr);
    }

    public static EnumC125100dl[] values() {
        return (EnumC125100dl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC125100dl valueOf(String str) {
        return (EnumC125100dl) C08FF.LIZ(EnumC125100dl.class, str);
    }

    public EnumC125100dl(String str, int i, int i2) {
        this.LL = i2;
    }
}
