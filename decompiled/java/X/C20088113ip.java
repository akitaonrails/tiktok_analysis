package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20088113ip implements InterfaceC20085513iP {
    public static final C20088113ip LIZIZ = new C20088113ip();

    @Override // X.InterfaceC20085513iP
    public final Function0<Unit> LIZ(AbstractC20085213iM abstractC20085213iM) {
        ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1 = new ViewOnAttachStateChangeListenerC20306914d1(abstractC20085213iM, 0);
        abstractC20085213iM.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20306914d1);
        return new AwS431S0200000_30(abstractC20085213iM, viewOnAttachStateChangeListenerC20306914d1, 6);
    }
}
