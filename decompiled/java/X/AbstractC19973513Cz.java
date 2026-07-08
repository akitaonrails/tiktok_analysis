package X;

import androidx.compose.runtime.s;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19973513Cz<T> {
    public final InterfaceC19973313Cx<T> LIZ;

    public AbstractC19973513Cz() {
        throw null;
    }

    public abstract InterfaceC19973313Cx<T> LIZIZ(C13DO<T> c13do, InterfaceC19973313Cx<T> interfaceC19973313Cx);

    public InterfaceC19973313Cx<T> LIZ() {
        return this.LIZ;
    }

    public AbstractC19973513Cz(final Function0 function0) {
        this.LIZ = new InterfaceC19973313Cx<T>(function0) { // from class: X.13D0
            public static final int $stable = 8;
            public final C01GW current$delegate;

            private final T getCurrent() {
                return (T) this.current$delegate.getValue();
            }

            {
                this.current$delegate = C452501pT.LIZIZ(function0);
            }

            @Override // X.InterfaceC19973313Cx
            public T readValue(C13D2 c13d2) {
                return getCurrent();
            }

            public C13DO<T> toProvided(AbstractC19973513Cz<T> abstractC19973513Cz) {
                s.LIZLLL("Cannot produce a provider from a lazy value holder");
                throw new C2197108jB();
            }
        };
    }
}
