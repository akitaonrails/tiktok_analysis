package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1Bxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222051Bxz implements InterfaceC2222251ByJ {
    public final C2221981Bxs LIZ;
    public final Map<Class<? extends AbstractC2222301ByO>, Pair<Long, AbstractC2222301ByO>> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        this.LIZ.LIZIZ().log("MessagePortal", "onStart: MessageEffectRegistry cleared");
        ((LinkedHashMap) this.LIZIZ).clear();
    }

    public C2222051Bxz(C2221981Bxs c2221981Bxs) {
        this.LIZ = c2221981Bxs;
    }

    public final <T extends AbstractC2222301ByO> void LIZIZ(T t) {
        if (t.LIZ < 0) {
            return;
        }
        this.LIZIZ.put((Class<? extends AbstractC2222301ByO>) t.getClass(), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), t));
    }

    public final <T extends AbstractC2222301ByO> T LIZLLL(Class<T> cls) {
        Pair pair = (Pair) ((LinkedHashMap) this.LIZIZ).get(cls);
        if (pair != null) {
            if (((AbstractC2222301ByO) pair.getSecond()).LIZ != 0 && ((Number) pair.getFirst()).longValue() + ((AbstractC2222301ByO) pair.getSecond()).LIZ <= SystemClock.elapsedRealtime()) {
                this.LIZIZ.remove(cls);
                return null;
            }
            return (T) pair.getSecond();
        }
        return null;
    }
}
