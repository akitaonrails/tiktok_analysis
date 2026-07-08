package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.01UP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01UP implements InterfaceC951240arS<Object> {
    public final GuestShowdownUser LIZ;

    public C01UP(GuestShowdownUser guestShowdownUser) {
        this.LIZ = guestShowdownUser;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C01UP) {
            return Intrinsics.LJFF(this.LIZ, ((C01UP) obj).LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C01UP;
    }
}
