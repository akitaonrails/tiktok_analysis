package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377100EqS {
    public static h0 LIZ(final h0 h0Var, final h0 h0Var2) {
        final h0 h0Var3 = new h0(Boolean.FALSE);
        final C013C c013c = new C013C();
        InterfaceC1441305kZ<Boolean> interfaceC1441305kZ = new InterfaceC1441305kZ<Boolean>() { // from class: X.0EqR
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(obj, bool) && !c013c.element) {
                    h0Var3.LJII(bool);
                    c013c.element = true;
                    h0Var.LIZIZ(this);
                    h0Var2.LIZIZ(this);
                }
            }
        };
        LIZIZ(h0Var, null, interfaceC1441305kZ);
        LIZIZ(h0Var2, null, interfaceC1441305kZ);
        return h0Var3;
    }

    public static final void LIZIZ(h0 h0Var, LifecycleOwner lifecycleOwner, InterfaceC1441305kZ interfaceC1441305kZ) {
        if (lifecycleOwner != null) {
            h0Var.LIZ(lifecycleOwner, interfaceC1441305kZ);
        } else {
            h0Var.LIZLLL(interfaceC1441305kZ);
        }
    }
}
