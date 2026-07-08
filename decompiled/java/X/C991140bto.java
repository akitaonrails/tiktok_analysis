package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991140bto {
    public final EnumC992060bvI LIZ;
    public final WeakReference<View> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991140bto)) {
            return false;
        }
        C991140bto c991140bto = (C991140bto) obj;
        return this.LIZ == c991140bto.LIZ && Intrinsics.LJFF(this.LIZIZ, c991140bto.LIZIZ);
    }

    public C991140bto(EnumC992060bvI enumC992060bvI, WeakReference<View> weakReference) {
        this.LIZ = enumC992060bvI;
        this.LIZIZ = weakReference;
    }
}
