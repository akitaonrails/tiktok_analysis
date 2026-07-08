package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestDecorationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLayoutMigrationSetting;

/* JADX INFO: renamed from: X.0aR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934890aR5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        return !C931780aM4.LJFF(null) || C500260Jjc.LJJIJLIJ();
    }

    public static boolean LIZ() {
        return MultiGuestDecorationSetting.INSTANCE.getValue() > 0 && LIZJ();
    }

    public static boolean LIZIZ() {
        return MultiGuestLayoutMigrationSetting.INSTANCE.getValue() > 0 && LIZJ();
    }
}
