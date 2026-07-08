package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675370QeN implements InterfaceC660330PvD {
    public final DynamicPatch LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C675370QeN(DynamicPatch dynamicPatch) {
        this.LL = dynamicPatch;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
