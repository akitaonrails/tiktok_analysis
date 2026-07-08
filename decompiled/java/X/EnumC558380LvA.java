package X;

/* JADX INFO: renamed from: X.0LvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC558380LvA {
    EFFECT_NEW_ENGINE(1),
    EFFECT_NEW_OLD_ENGINE_COEXIST(2);

    public int mode;

    public static EnumC558380LvA valueOf(String str) {
        return (EnumC558380LvA) C08FF.LIZ(EnumC558380LvA.class, str);
    }

    EnumC558380LvA(int i) {
        this.mode = i;
    }
}
