package X;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS15S1100100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558530qex {
    public final Function0<String> LIZ;

    public C1558530qex(Function0<String> function0) {
        this.LIZ = function0;
    }

    public final void LIZ(AbstractC1561970qkV<?> abstractC1561970qkV) {
        String strInvoke = this.LIZ.invoke();
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(abstractC1561970qkV);
                }
            }
            if (C725480Sd0.LIZ(abstractC1561970qkV)) {
                C725430Scv.LIZ(new AwS15S1100100_24(abstractC1561970qkV, strInvoke, SystemClock.elapsedRealtimeNanos(), 0));
            }
        }
    }

    public final void LIZIZ(AbstractC1561970qkV abstractC1561970qkV, Function0 function0) {
        String strInvoke = this.LIZ.invoke();
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventEnd(abstractC1561970qkV);
                }
            }
            if (C725480Sd0.LIZ(abstractC1561970qkV)) {
                C725430Scv.LIZ(new C1558640qf8(abstractC1561970qkV, strInvoke, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), function0, this));
            }
        }
    }
}
