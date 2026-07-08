package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS274S0300000_30;

/* JADX INFO: renamed from: X.13ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20087613ik implements InterfaceC20085513iP {
    public static final C20087613ik LIZIZ = new C20087613ik();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.13in, java.lang.Object] */
    @Override // X.InterfaceC20085513iP
    public final Function0<Unit> LIZ(final AbstractC20085213iM abstractC20085213iM) {
        ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1 = new ViewOnAttachStateChangeListenerC20306914d1(abstractC20085213iM, 1);
        abstractC20085213iM.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20306914d1);
        ?? r2 = new InterfaceC20088013io() { // from class: X.13in
            @Override // X.InterfaceC20088013io
            public final void onRelease() {
                abstractC20085213iM.LIZLLL();
            }
        };
        C20087713il.LIZIZ(abstractC20085213iM).LIZ.add((InterfaceC20088013io) r2);
        return new AwS274S0300000_30(abstractC20085213iM, viewOnAttachStateChangeListenerC20306914d1, (C20087913in) r2, 0);
    }
}
