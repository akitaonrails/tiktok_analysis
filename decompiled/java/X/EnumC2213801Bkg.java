package X;

/* JADX INFO: renamed from: X.1Bkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2213801Bkg {
    CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK(0),
    CAI_ACTION_TYPE_EMIT_EVENT_TO_GLOBAL_STREAM(1),
    CAI_ACTION_TYPE_STORE_VALUE_TO_FEATURE_CENTER(2),
    CAI_ACTION_TYPE_SEND_APPLOG(3),
    CAI_ACTION_TYPE_SCENE_MANAGER(4);

    public final int LL;

    public static EnumC2213801Bkg valueOf(String str) {
        return (EnumC2213801Bkg) C08FF.LIZ(EnumC2213801Bkg.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC2213801Bkg(int i) {
        this.LL = i;
    }
}
