package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC980470bcb {
    public static final EnumC980470bcb AI_COMMENTARY_ICON;
    public static final EnumC980470bcb ANCHOR_AI_COMMENTARY_CAPSULE;
    public static final EnumC980470bcb ANCHOR_DURING_MATCH_SETTING_PANEL;
    public static final EnumC980470bcb ANCHOR_PRE_MATCH_SETTING_PANEL;
    public static final EnumC980470bcb AUDIENCE_BATTLE_NOTICE_FROM_ANCHOR;
    public static final EnumC980470bcb AUDIENCE_SHARE_SETTING_SWITCH;
    public static final /* synthetic */ EnumC980470bcb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC980470bcb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC980470bcb enumC980470bcb = new EnumC980470bcb("ANCHOR_PRE_MATCH_SETTING_PANEL", 0);
        ANCHOR_PRE_MATCH_SETTING_PANEL = enumC980470bcb;
        EnumC980470bcb enumC980470bcb2 = new EnumC980470bcb("ANCHOR_DURING_MATCH_SETTING_PANEL", 1);
        ANCHOR_DURING_MATCH_SETTING_PANEL = enumC980470bcb2;
        EnumC980470bcb enumC980470bcb3 = new EnumC980470bcb("AI_COMMENTARY_ICON", 2);
        AI_COMMENTARY_ICON = enumC980470bcb3;
        EnumC980470bcb enumC980470bcb4 = new EnumC980470bcb("ANCHOR_AI_COMMENTARY_CAPSULE", 3);
        ANCHOR_AI_COMMENTARY_CAPSULE = enumC980470bcb4;
        EnumC980470bcb enumC980470bcb5 = new EnumC980470bcb("AUDIENCE_SHARE_SETTING_SWITCH", 4);
        AUDIENCE_SHARE_SETTING_SWITCH = enumC980470bcb5;
        EnumC980470bcb enumC980470bcb6 = new EnumC980470bcb("AUDIENCE_BATTLE_NOTICE_FROM_ANCHOR", 5);
        AUDIENCE_BATTLE_NOTICE_FROM_ANCHOR = enumC980470bcb6;
        EnumC980470bcb[] enumC980470bcbArr = {enumC980470bcb, enumC980470bcb2, enumC980470bcb3, enumC980470bcb4, enumC980470bcb5, enumC980470bcb6};
        LL = enumC980470bcbArr;
        LLILLJJLI = new C2254308sP(enumC980470bcbArr);
    }

    public static EnumC980470bcb[] values() {
        return (EnumC980470bcb[]) LL.clone();
    }

    public static EnumC980470bcb valueOf(String str) {
        return (EnumC980470bcb) C08FF.LIZ(EnumC980470bcb.class, str);
    }

    public EnumC980470bcb(String str, int i) {
    }
}
