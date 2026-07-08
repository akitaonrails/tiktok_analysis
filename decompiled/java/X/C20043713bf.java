package X;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20043713bf {
    public static final C20043813bg LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        LIZ = Intrinsics.LJFF(Build.FINGERPRINT.toLowerCase(Locale.ROOT), "robolectric") ? new InterfaceC20044013bi() { // from class: X.13bg
            @Override // X.InterfaceC20044013bi
            public final void LIZ(C20044213bk c20044213bk) {
            }
        } : 0;
    }
}
