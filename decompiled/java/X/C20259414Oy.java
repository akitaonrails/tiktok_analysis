package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20259414Oy {
    public static final EnumC429060Gs4 LIZ(String str) {
        String string;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "last_on_top")) {
            return EnumC429060Gs4.LAST_ON_TOP;
        }
        if (Intrinsics.LJFF(string, "first_on_top")) {
            return EnumC429060Gs4.FIRST_ON_TOP;
        }
        return EnumC429060Gs4.LAST_ON_TOP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC428930Grr LIZIZ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null) {
            switch (string.hashCode()) {
                case -1078030475:
                    if (string.equals("medium")) {
                        return EnumC428930Grr.MEDIUM;
                    }
                    break;
                case 102742843:
                    if (string.equals("large")) {
                        return EnumC428930Grr.LARGE;
                    }
                    break;
                case 109548807:
                    if (string.equals("small")) {
                        return EnumC428930Grr.SMALL;
                    }
                    break;
                case 1955577472:
                    if (string.equals("x_small")) {
                        return EnumC428930Grr.X_SMALL;
                    }
                    break;
            }
        }
        return EnumC428930Grr.LARGE;
    }
}
