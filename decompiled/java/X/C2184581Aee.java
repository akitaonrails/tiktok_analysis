package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Aee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184581Aee {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, final Function0 function0, Function1 function1) {
        C2184591Aef c2184591Aef = new C2184591Aef(view.getContext(), function1);
        c2184591Aef.LLIZ = new InterfaceC2184611Aeh() { // from class: X.1Aeg
            @Override // X.InterfaceC2184611Aeh
            public final void LIZ() {
                function0.invoke();
            }
        };
        c2184591Aef.LLIZLLLIL = new View.OnTouchListener() { // from class: X.10sO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 1) {
                    view2.performClick();
                    return false;
                }
                return false;
            }
        };
        view.setOnTouchListener(c2184591Aef);
    }
}
