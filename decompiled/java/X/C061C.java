package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.061C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061C {
    public static final C061C ACTIVITY_STATUS_TO_PUBLIC_GUIDE;
    public static final C061C B2C_AUTO_TRANSLATION;
    public static final /* synthetic */ C061C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C061C MESSAGE_REQUEST_PUSH_GUIDE_POPUP;
    public static final C061C SMART_REPLY;
    public final String LL;

    public static InterfaceC2044707zh<C061C> getEntries() {
        return LLILLL;
    }

    static {
        C061C c061c = new C061C("SMART_REPLY", 0, "smart_reply");
        SMART_REPLY = c061c;
        C061C c061c2 = new C061C("ACTIVITY_STATUS_TO_PUBLIC_GUIDE", 1, "activity_status_to_public_guide");
        ACTIVITY_STATUS_TO_PUBLIC_GUIDE = c061c2;
        C061C c061c3 = new C061C("MESSAGE_REQUEST_PUSH_GUIDE_POPUP", 2, "message_request_push_guide_popup");
        MESSAGE_REQUEST_PUSH_GUIDE_POPUP = c061c3;
        C061C c061c4 = new C061C("B2C_AUTO_TRANSLATION", 3, "b2c_auto_translation");
        B2C_AUTO_TRANSLATION = c061c4;
        C061C[] c061cArr = {c061c, c061c2, c061c3, c061c4};
        LLILLJJLI = c061cArr;
        LLILLL = new C2254308sP(c061cArr);
    }

    public static C061C[] values() {
        return (C061C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C061C valueOf(String str) {
        return (C061C) C08FF.LIZ(C061C.class, str);
    }

    public C061C(String str, int i, String str2) {
        this.LL = str2;
    }
}
