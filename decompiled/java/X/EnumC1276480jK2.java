package X;

/* JADX INFO: renamed from: X.0jK2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276480jK2 {
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_NORMAL(0),
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_MEDIUM(1),
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_HIGH(2),
    DOWN_LINK_AUDIO_SELECTION_PRIORITY_CRITICAL(3);

    public final int LL;

    public int value() {
        return this.LL;
    }

    public static EnumC1276480jK2 fromId(int i) {
        for (EnumC1276480jK2 enumC1276480jK2 : values()) {
            if (enumC1276480jK2.value() == i) {
                return enumC1276480jK2;
            }
        }
        return DOWN_LINK_AUDIO_SELECTION_PRIORITY_NORMAL;
    }

    public static EnumC1276480jK2 valueOf(String str) {
        return (EnumC1276480jK2) C08FF.LIZ(EnumC1276480jK2.class, str);
    }

    EnumC1276480jK2(int i) {
        this.LL = i;
    }
}
