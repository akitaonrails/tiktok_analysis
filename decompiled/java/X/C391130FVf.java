package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0FVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391130FVf {
    public static final Pair<Integer, Integer> LIZ(int i, int i2, int i3) {
        if (i >= i3) {
            return new Pair<>(0, 0);
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(Math.min(i2, i3)));
    }
}
