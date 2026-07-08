package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Y6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868730Y6d implements InterfaceC871620YHg {
    public final Function0<C0YED> LIZ;
    public final C868780Y6i LIZIZ;
    public final CopyOnWriteArraySet<InterfaceC868770Y6h> LIZJ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC871620YHg
    public final int LIZ() {
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null) {
            return 0;
        }
        return c0yedInvoke.LJIIIIZZ.LJI.LIZLLL.LIZ();
    }

    @Override // X.InterfaceC871620YHg
    public final Map<String, C06SQ> LIZIZ() {
        C0YED c0yedInvoke = this.LIZ.invoke();
        return c0yedInvoke == null ? C2097608Jq.LJ() : c0yedInvoke.LJIIIIZZ.LJI.LIZLLL.LIZIZ();
    }

    @Override // X.InterfaceC871620YHg
    public final Map<String, Long> LIZJ() {
        C0YED c0yedInvoke = this.LIZ.invoke();
        return c0yedInvoke == null ? C2097608Jq.LJ() : c0yedInvoke.LJIIIIZZ.LJI.LIZLLL.LIZJ();
    }

    public C868730Y6d(AwS558S0100000_14 awS558S0100000_14, C868780Y6i c868780Y6i) {
        this.LIZ = awS558S0100000_14;
        this.LIZIZ = c868780Y6i;
    }
}
