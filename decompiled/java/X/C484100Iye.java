package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484100Iye implements InterfaceC474800Ije {
    public static final C484100Iye LIZ = new C484100Iye();

    @Override // X.InterfaceC474800Ije
    public void onEvent(String str) {
        if (!C157W.LIZ().LJ()) {
            return;
        }
        if (Intrinsics.LJFF(str, "livesdk_live_duration")) {
            C157W.LIZ().LIZJ(false);
        } else {
            if (!Intrinsics.LJFF(str, "livesdk_enter_room_duration")) {
                return;
            }
            C157W.LIZ().LIZJ(true);
        }
    }
}
