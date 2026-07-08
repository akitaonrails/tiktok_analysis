package X;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14cZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20304114cZ {
    public static final EnumC20304114cZ CALENDAR;
    public static final EnumC20304114cZ CAMERA;
    public static final C20304414cc Companion;
    public static final EnumC20304114cZ FINE_LOCATION;
    public static final /* synthetic */ EnumC20304114cZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20304114cZ LOCATION;
    public static final EnumC20304114cZ MICROPHONE;
    public static final EnumC20304114cZ NOTIFICATION;
    public static final EnumC20304114cZ PHOTOALBUM;
    public static final EnumC20304114cZ READ_CALENDAR;
    public static final EnumC20304114cZ UNKNOWN;
    public static final EnumC20304114cZ VIBRATE;
    public static final EnumC20304114cZ WRITE_CALENDAR;
    public final List<String> LL;

    public static InterfaceC2044707zh<EnumC20304114cZ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.14cc] */
    static {
        EnumC20304114cZ enumC20304114cZ = new EnumC20304114cZ("CAMERA", 0, Collections.singletonList("android.permission.CAMERA"));
        CAMERA = enumC20304114cZ;
        EnumC20304114cZ enumC20304114cZ2 = new EnumC20304114cZ("MICROPHONE", 1, Collections.singletonList("android.permission.RECORD_AUDIO"));
        MICROPHONE = enumC20304114cZ2;
        EnumC20304114cZ enumC20304114cZ3 = new EnumC20304114cZ("PHOTOALBUM", 2, Arrays.asList(Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"}));
        PHOTOALBUM = enumC20304114cZ3;
        EnumC20304114cZ enumC20304114cZ4 = new EnumC20304114cZ("VIBRATE", 3, Collections.singletonList("android.permission.VIBRATE"));
        VIBRATE = enumC20304114cZ4;
        EnumC20304114cZ enumC20304114cZ5 = new EnumC20304114cZ("READ_CALENDAR", 4, Collections.singletonList("android.permission.READ_CALENDAR"));
        READ_CALENDAR = enumC20304114cZ5;
        EnumC20304114cZ enumC20304114cZ6 = new EnumC20304114cZ("WRITE_CALENDAR", 5, Collections.singletonList("android.permission.WRITE_CALENDAR"));
        WRITE_CALENDAR = enumC20304114cZ6;
        EnumC20304114cZ enumC20304114cZ7 = new EnumC20304114cZ("CALENDAR", 6, C1697810uHb.LJIIJJI("android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"));
        CALENDAR = enumC20304114cZ7;
        EnumC20304114cZ enumC20304114cZ8 = new EnumC20304114cZ("NOTIFICATION", 7, Collections.singletonList(""));
        NOTIFICATION = enumC20304114cZ8;
        EnumC20304114cZ enumC20304114cZ9 = new EnumC20304114cZ("LOCATION", 8, C13LQ.LJJLL(new String[]{"android.permission.ACCESS_COARSE_LOCATION"}));
        LOCATION = enumC20304114cZ9;
        EnumC20304114cZ enumC20304114cZ10 = new EnumC20304114cZ("FINE_LOCATION", 9, C13LQ.LJJLL(new String[]{"android.permission.ACCESS_COARSE_LOCATION"}));
        FINE_LOCATION = enumC20304114cZ10;
        EnumC20304114cZ enumC20304114cZ11 = new EnumC20304114cZ("UNKNOWN", 10, Collections.singletonList(null));
        UNKNOWN = enumC20304114cZ11;
        EnumC20304114cZ[] enumC20304114cZArr = {enumC20304114cZ, enumC20304114cZ2, enumC20304114cZ3, enumC20304114cZ4, enumC20304114cZ5, enumC20304114cZ6, enumC20304114cZ7, enumC20304114cZ8, enumC20304114cZ9, enumC20304114cZ10, enumC20304114cZ11};
        LLILLJJLI = enumC20304114cZArr;
        LLILLL = new C2254308sP(enumC20304114cZArr);
        Companion = new Object() { // from class: X.14cc
        };
    }

    public static EnumC20304114cZ[] values() {
        return (EnumC20304114cZ[]) LLILLJJLI.clone();
    }

    public final List<String> getPermission() {
        return this.LL;
    }

    public static EnumC20304114cZ valueOf(String str) {
        return (EnumC20304114cZ) C08FF.LIZ(EnumC20304114cZ.class, str);
    }

    public EnumC20304114cZ(String str, int i, List list) {
        this.LL = list;
    }
}
