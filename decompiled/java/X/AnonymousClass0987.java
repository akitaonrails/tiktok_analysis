package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0987, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0987 {
    public final Bitmap LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0987)) {
            return false;
        }
        AnonymousClass0987 anonymousClass0987 = (AnonymousClass0987) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0987.LIZ) && this.LIZIZ == anonymousClass0987.LIZIZ;
    }

    public AnonymousClass0987(Bitmap bitmap, boolean z) {
        this.LIZ = bitmap;
        this.LIZIZ = z;
    }
}
