package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0EIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362280EIg implements C0EIS {
    public final C0E48 LIZ;
    public final LifecycleOwner LIZIZ;

    @Override // X.C0EIS
    public final Function1<C0EIO, Boolean> LIZIZ() {
        return AFwS234S0000000_5.get$arr$(596);
    }

    public C362280EIg(C0E48 c0e48, LifecycleOwner lifecycleOwner) {
        this.LIZ = c0e48;
        this.LIZIZ = lifecycleOwner;
    }

    @Override // X.C0EIS
    public final void LIZ(C0EFH c0efh, AwS406S0200000_5 awS406S0200000_5) {
        if (C363750ENx.LIZIZ("multi_music_guide_has_shown_in_root")) {
            return;
        }
        C01TT.LIZLLL(new AwS249S0300000_5(c0efh, this, awS406S0200000_5, 36));
    }
}
