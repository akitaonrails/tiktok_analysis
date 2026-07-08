package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846900XKe {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC847160XLe enumC847160XLe, String str) {
        if (C0XKT.LIZ) {
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                C823050WQl.LIZLLL().execute(new ARunnableS113S0100000_13(enumC847160XLe, str, 231));
            } else {
                C846870XKb.LIZ.getClass();
                C846870XKb.LIZ(enumC847160XLe);
            }
        }
    }
}
