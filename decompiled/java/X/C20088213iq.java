package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20088213iq implements InterfaceC20085513iP {
    public static final C20088213iq LIZIZ = new C20088213iq();

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.AwS431S0200000_30] */
    @Override // X.InterfaceC20085513iP
    public final Function0<Unit> LIZ(AbstractC20085213iM abstractC20085213iM) {
        if (abstractC20085213iM.isAttachedToWindow()) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractC20085213iM);
            if (lifecycleOwner != null) {
                return C1558660qfA.LIZ(abstractC20085213iM, lifecycleOwner.getLifecycle());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("View tree for ");
            sbLIZ.append(abstractC20085213iM);
            sbLIZ.append(" has no ViewTreeLifecycleOwner");
            C1696250uF5.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            throw new C2197108jB();
        }
        C259800zU c259800zU = new C259800zU();
        ViewOnAttachStateChangeListenerC20306614cy viewOnAttachStateChangeListenerC20306614cy = new ViewOnAttachStateChangeListenerC20306614cy(abstractC20085213iM, c259800zU, 0);
        abstractC20085213iM.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20306614cy);
        c259800zU.element = new AwS431S0200000_30(abstractC20085213iM, viewOnAttachStateChangeListenerC20306614cy, 7);
        return new AwS574S0100000_30(c259800zU, (C259800zU<Function0<Unit>>) 7);
    }
}
