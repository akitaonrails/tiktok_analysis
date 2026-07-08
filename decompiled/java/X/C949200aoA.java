package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C949200aoA implements InterfaceC949280aoI, InterfaceC1635506an {
    public final /* synthetic */ C949070anx LL;

    public C949200aoA(C949070anx c949070anx) {
        this.LL = c949070anx;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC949280aoI) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(2, this.LL, C949070anx.class, "resolveGameTransition", "resolveGameTransition(Lcom/tiktok/kmp/live/socialgamebusinessapi/model/GameSnapshot;Lcom/tiktok/kmp/live/socialgamebusinessapi/event/GameEvent;)Lcom/tiktok/kmp/live/socialgamebusinessapi/model/GameSnapshot;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC949280aoI
    public final Object LIZ(Object obj, Object obj2) {
        return this.LL.LIZJ((C947420alI) obj, (InterfaceC949240aoE) obj2);
    }
}
