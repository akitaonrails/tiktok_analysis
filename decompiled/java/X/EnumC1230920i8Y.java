package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1230920i8Y {
    public static final EnumC1230920i8Y DEFAULT;
    public static final EnumC1230920i8Y LIVE_MANAGEMENT;
    public static final EnumC1230920i8Y LIVE_ROOM;
    public static final EnumC1230920i8Y LIVE_TOOLS;
    public static final /* synthetic */ EnumC1230920i8Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1230920i8Y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1230920i8Y enumC1230920i8Y = new EnumC1230920i8Y(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1230920i8Y;
        EnumC1230920i8Y enumC1230920i8Y2 = new EnumC1230920i8Y("LIVE_ROOM", 1, 1);
        LIVE_ROOM = enumC1230920i8Y2;
        EnumC1230920i8Y enumC1230920i8Y3 = new EnumC1230920i8Y("LIVE_MANAGEMENT", 2, 2);
        LIVE_MANAGEMENT = enumC1230920i8Y3;
        EnumC1230920i8Y enumC1230920i8Y4 = new EnumC1230920i8Y("LIVE_TOOLS", 3, 4);
        LIVE_TOOLS = enumC1230920i8Y4;
        EnumC1230920i8Y[] enumC1230920i8YArr = {enumC1230920i8Y, enumC1230920i8Y2, enumC1230920i8Y3, enumC1230920i8Y4};
        LLILLJJLI = enumC1230920i8YArr;
        LLILLL = new C2254308sP(enumC1230920i8YArr);
    }

    public static EnumC1230920i8Y[] values() {
        return (EnumC1230920i8Y[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1230920i8Y valueOf(String str) {
        return (EnumC1230920i8Y) C08FF.LIZ(EnumC1230920i8Y.class, str);
    }

    public EnumC1230920i8Y(String str, int i, int i2) {
        this.LL = i2;
    }
}
