package X;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rtc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710300Rtc {
    public final String LIZ;
    public final Layout LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C710300Rtc)) {
            return false;
        }
        C710300Rtc c710300Rtc = (C710300Rtc) obj;
        return Intrinsics.LJFF(this.LIZ, c710300Rtc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c710300Rtc.LIZIZ) && this.LIZJ == c710300Rtc.LIZJ && this.LIZLLL == c710300Rtc.LIZLLL;
    }

    public C710300Rtc(String str, Layout layout, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = layout;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
