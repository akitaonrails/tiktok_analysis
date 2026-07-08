package X;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324560kZa {
    public static final Layout.Alignment LIZ;
    public static final Layout.Alignment LIZIZ;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (Intrinsics.LJFF(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.LJFF(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        LIZ = alignment;
        LIZIZ = alignment2;
    }
}
