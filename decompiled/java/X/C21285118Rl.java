package X;

import Y.ARunnableS50S0110000_32;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21285118Rl implements C0O4M {
    public final /* synthetic */ C21285518Rp LIZ;

    public C21285118Rl(C21285518Rp c21285518Rp) {
        this.LIZ = c21285518Rp;
    }

    @Override // X.C0O4M
    public final void LIZ(String str, boolean z) {
        if (Intrinsics.LJFF(str, this.LIZ.getId())) {
            C21285518Rp c21285518Rp = this.LIZ;
            HandlerHook.viewPost(c21285518Rp, new ARunnableS50S0110000_32(c21285518Rp, z, 4));
        }
    }
}
