package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.106P, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106P {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2) {
        String str3;
        if (i != 1) {
            if (i != 2) {
                str3 = "";
            } else {
                str3 = "off";
            }
        } else {
            str3 = "on";
        }
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
        c191969108h.LIZLLL("to_status", str3);
        c191969108h.LIZLLL("target", str);
        if (!Intrinsics.LJFF(str, "business_allowance")) {
            c191969108h.LIZJ("action_source", str2);
        }
        C1163504gr.LIZIZ.onEventV3("change_message_preference_permission", c191969108h.LIZ);
    }
}
