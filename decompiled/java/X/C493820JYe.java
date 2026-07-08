package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: renamed from: X.0JYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493820JYe implements InterfaceC1891350zJl {
    public final int LL;
    public final boolean LLILLJJLI;
    public final VIPSubOnlyLiveSettingInfo.Category LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C493820JYe(int i, boolean z, VIPSubOnlyLiveSettingInfo.Category category) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = category;
    }
}
