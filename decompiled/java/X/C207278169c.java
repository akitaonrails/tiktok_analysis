package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.169c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207278169c implements C169R {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.C169R
    public final void LIZ() {
    }

    @Override // X.C169R
    public final void LIZIZ() {
    }

    public C207278169c() {
        if (((Number) C0BB5.LIZ.getValue()).intValue() != 0) {
            C1BCA.LJIILLIIL(new C1BC1() { // from class: X.169d
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1512930pTP c1512930pTP, C1512930pTP c1512930pTP2) {
                    C1512930pTP c1512930pTP3 = c1512930pTP2;
                    if (!c1512930pTP3.LJ && c1512930pTP3.LIZ != EnumC1006810cJ5.Low) {
                        this.LL.LIZ.set(false);
                    } else {
                        this.LL.LIZ.set(true);
                    }
                }
            });
        }
    }

    @Override // X.C169R
    public final void LIZJ() {
        if (C207291169p.LIZ() > 0) {
            C169Q c169q = C169Q.LLILLJJLI;
            C05E5 c05e5 = new C05E5(C169Z.COMMON_OPEN_NEW_PAGE_TASK, new AwS610S0100000_31(this, 442));
            c169q.getClass();
            C169Q.LJIIJJI("open_new_page", c05e5);
            C169Q.LJIIJJI("leave_new_page", new C05E5(C169Z.COMMON_LEAVE_NEW_PAGE_TASK, AFwS276S0000000_31.get$arr$(313)));
        }
    }
}
