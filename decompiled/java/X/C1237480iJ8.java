package X;

import android.os.Bundle;
import java.util.Stack;

/* JADX INFO: renamed from: X.0iJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237480iJ8 implements InterfaceC851850XbL {
    public final InterfaceC1237490iJ9 LIZ;
    public final Bundle LIZIZ;
    public final Stack<InterfaceC1237470iJ7> LIZJ;

    public final InterfaceC1237470iJ7 LIZ() {
        return this.LIZJ.isEmpty() ^ true ? this.LIZJ.peek() : new InterfaceC1237470iJ7(this) { // from class: X.0iJ6
            public final InterfaceC851850XbL LIZ;

            @Override // X.InterfaceC1237470iJ7
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1237470iJ7
            public final void LJ() {
            }

            @Override // X.InterfaceC1237470iJ7
            public final String getId() {
                return "unknown_step";
            }

            @Override // X.InterfaceC1237470iJ7
            public final InterfaceC851850XbL LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1237470iJ7
            public final void LIZIZ(InterfaceC853790XeT interfaceC853790XeT, C1237330iIt c1237330iIt) {
                c1237330iIt.LIZIZ(null, true);
            }
        };
    }

    @Override // X.InterfaceC851850XbL
    public final Bundle getData() {
        return this.LIZIZ;
    }

    public C1237480iJ8(InterfaceC1237490iJ9 interfaceC1237490iJ9, Bundle bundle) {
        this.LIZ = interfaceC1237490iJ9;
        this.LIZIZ = bundle;
        Stack<InterfaceC1237470iJ7> stack = new Stack<>();
        this.LIZJ = stack;
        InterfaceC1237470iJ7 interfaceC1237470iJ7LIZ = C853850XeZ.LIZ(interfaceC1237490iJ9.getFirstStepId(), this);
        if (interfaceC1237470iJ7LIZ != null) {
            interfaceC1237470iJ7LIZ.LIZLLL();
        }
        stack.push(interfaceC1237470iJ7LIZ);
    }
}
