package X;

/* JADX INFO: renamed from: X.0Mgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public enum EnumC574990Mgr {
    ComposeType_Default(0),
    ComposeType_Simple_Concat_Video(1),
    ComposeType_Image_Album(2),
    ComposeType_Share_Music_To_story(3);

    public final int LL;

    public static EnumC574990Mgr valueOf(String str) {
        return (EnumC574990Mgr) C08FF.LIZ(EnumC574990Mgr.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC574990Mgr(int i) {
        this.LL = i;
    }
}
