package X;

import android.graphics.Color;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0EbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367740EbM {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new Regex("^#[0-9A-Fa-f]{6}$");
        new Regex("^#[0-9A-Fa-f]{8}$");
    }

    public static int LIZ(float f, int i) {
        return Color.argb((int) (Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
