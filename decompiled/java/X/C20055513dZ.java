package X;

import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20055513dZ implements InterfaceC20062213ee {
    public static final C20055513dZ LIZ = new C20055513dZ();
    public static Boolean LIZIZ;

    @Override // X.InterfaceC20062213ee
    public final /* synthetic */ void LIZIZ(AwS609S0100000_30 awS609S0100000_30) {
    }

    @Override // X.InterfaceC20062213ee
    public final /* synthetic */ void LIZLLL(AwS609S0100000_30 awS609S0100000_30) {
    }

    @Override // X.InterfaceC20062213ee
    public final boolean LIZ() {
        Boolean bool = LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        C1696250uF5.LIZJ("canFocus is read before it is written");
        throw new C2197108jB();
    }

    @Override // X.InterfaceC20062213ee
    public final void LIZJ(boolean z) {
        LIZIZ = Boolean.valueOf(z);
    }
}
