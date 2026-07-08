package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

/* JADX INFO: renamed from: X.0a7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922770a7X {
    public static boolean LIZ() {
        return (C924230a9t.LIZ(16) || LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_gifter_priority_v2") != 1 || C930540aK4.LJJIJ()) ? false : true;
    }

    public static boolean LIZIZ() {
        Integer numLJ;
        return (C924230a9t.LIZ(16) || (numLJ = C931820aM8.LJ("multi_guest_gifter_priority_v2")) == null || numLJ.intValue() != 1 || C930540aK4.LJJIJ()) ? false : true;
    }
}
