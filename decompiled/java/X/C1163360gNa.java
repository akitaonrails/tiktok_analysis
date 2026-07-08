package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163360gNa {
    public static final C1163430gNh LIZ = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0gNb
        @Override // X.InterfaceC201986141o
        public final void LIZ(Context context, int i, View view, Function1 function1) {
            ViewGroup viewGroup;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            function1.invoke(C21146717pB.LIZIZ(context, i, viewGroup, false));
        }
    });
    public static final boolean LIZIZ = C7832034c.LIZLLL();

    public static final void LIZ(BPEAHandler bPEAHandler, Function0 function0, Long l) {
        if (l != null && l.longValue() > 0) {
            C786410Ut5.LJLIIL(l.longValue(), bPEAHandler, new RunnableC514801zW(function0, (Function0<Unit>) 139));
        } else {
            function0.invoke();
        }
    }
}
