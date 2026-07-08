package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Y6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y6Z implements InterfaceC868710Y6b {
    public final Function0<C0YED> LIZ;
    public final C868780Y6i LIZIZ;
    public final CopyOnWriteArraySet<C0YG2> LIZJ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC868710Y6b
    public final void LIZLLL() {
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null) {
            C868780Y6i.LJ(this.LIZIZ, "MessageRequestManagerProxy", "refreshWhenColdStart: no active session, skipping", 4);
        } else {
            c0yedInvoke.LJIIIIZZ.LJI.LJI().LIZLLL();
        }
    }

    @Override // X.InterfaceC868710Y6b
    public final List<String> LJII() {
        C0YED c0yedInvoke = this.LIZ.invoke();
        return c0yedInvoke == null ? C13BV.INSTANCE : c0yedInvoke.LJIIIIZZ.LJI.LJI().LJII();
    }

    @Override // X.InterfaceC868710Y6b
    public final void LIZJ(C0YG2 c0yg2) {
        boolean z;
        C0YDJ c0ydj;
        C0Y6R c0y6r;
        C0Y66 c0y66LJI;
        this.LIZJ.add(c0yg2);
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke != null && (c0ydj = c0yedInvoke.LJIIIIZZ) != null && (c0y6r = c0ydj.LJI) != null && (c0y66LJI = c0y6r.LJI()) != null) {
            c0y66LJI.LIZJ(c0yg2);
        }
        C868780Y6i c868780Y6i = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerMessageRequestDataObserver: total=");
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(", sessionActive=");
        if (this.LIZ.invoke() != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C868780Y6i.LJ(c868780Y6i, "MessageRequestManagerProxy", C2188811AlT.LIZIZ(sbLIZ), 4);
    }

    @Override // X.InterfaceC868710Y6b
    public final boolean LJI(C869590Y9l c869590Y9l) {
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null) {
            return false;
        }
        return c0yedInvoke.LJIIIIZZ.LJI.LJI().LJI(c869590Y9l);
    }

    @Override // X.InterfaceC868710Y6b
    public final List<C0Y9G> LJIJI(EnumC871430YGn enumC871430YGn) {
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null) {
            return C13BV.INSTANCE;
        }
        return c0yedInvoke.LJIIIIZZ.LJI.LJI().LJIJI(enumC871430YGn);
    }

    public C0Y6Z(AwS558S0100000_14 awS558S0100000_14, C868780Y6i c868780Y6i) {
        this.LIZ = awS558S0100000_14;
        this.LIZIZ = c868780Y6i;
    }

    @Override // X.InterfaceC868710Y6b
    public final void LJ(InterfaceC1719106oH interfaceC1719106oH, boolean z) {
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null) {
            C868780Y6i.LJ(this.LIZIZ, "MessageRequestManagerProxy", "refreshLocalStranger: no active session, skipping", 4);
        } else {
            c0yedInvoke.LJIIIIZZ.LJI.LJI().LJ(interfaceC1719106oH, z);
        }
    }

    @Override // X.InterfaceC868710Y6b
    public final void LJIIL(List list, EnumC1477205qM enumC1477205qM, Function1 function1) {
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null) {
            C868780Y6i.LJ(this.LIZIZ, "MessageRequestManagerProxy", "handleMessageRequestBatchTransfer: no active session", 4);
            if (function1 != null) {
                function1.invoke(new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, "No active session", (Integer) null, 12));
                return;
            }
            return;
        }
        c0yedInvoke.LJIIIIZZ.LJI.LJI().LJIIL(list, enumC1477205qM, function1);
    }
}
