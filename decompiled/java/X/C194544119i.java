package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.119i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194544119i {
    public final FrameLayout LIZ;
    public final InterfaceC194552119q LIZIZ;
    public InterfaceC194555119t LIZJ;
    public Effect LIZLLL;

    public C194544119i(FrameLayout frameLayout) {
        InterfaceC194552119q interfaceC194552119q = new InterfaceC194552119q() { // from class: X.119s
            @Override // X.InterfaceC194552119q
            public final InterfaceC194555119t LIZ(Effect effect) {
                if (effect == null) {
                    return new AnonymousClass1980();
                }
                return new C19457811Aq(effect);
            }
        };
        this.LIZ = frameLayout;
        this.LIZIZ = interfaceC194552119q;
    }

    public final void LIZ(Effect effect) {
        InterfaceC194555119t interfaceC194555119t = this.LIZJ;
        if (interfaceC194555119t != null) {
            interfaceC194555119t.LJJJJLL(false);
        }
        if (effect == null || Intrinsics.LJFF(effect, this.LIZLLL)) {
            return;
        }
        this.LIZLLL = effect;
        InterfaceC194555119t interfaceC194555119tLIZ = this.LIZIZ.LIZ(effect);
        this.LIZJ = interfaceC194555119tLIZ;
        if (interfaceC194555119tLIZ != null) {
            interfaceC194555119tLIZ.LIZ(this.LIZ);
        }
    }
}
