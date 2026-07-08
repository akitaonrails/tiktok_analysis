package X;

import X.C0S5Q;
import X.InterfaceC710780RuO;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.164W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C164W<T extends C0S5Q, E extends InterfaceC710780RuO> {
    public C19719912Dl LIZ;
    public final List<C164T<T, E>> LIZIZ = new ArrayList();

    public final void onEvent(Function1<? super C164X<T, E>, Unit> function1) {
        C19719912Dl c19719912Dl = this.LIZ;
        C164X c164x = new C164X(c19719912Dl);
        function1.invoke(c164x);
        if (c19719912Dl != null) {
            C19719912Dl c19719912Dl2 = c164x.LIZIZ;
            if (c19719912Dl2 == null) {
                c19719912Dl2 = c19719912Dl;
            }
            AbstractC207157164l abstractC207157164l = c164x.LIZJ;
            if (abstractC207157164l != null) {
                ((ArrayList) this.LIZIZ).add(new C164T(c19719912Dl, c19719912Dl2, abstractC207157164l, c164x.LJFF, c164x.LIZLLL, c164x.LJ));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
