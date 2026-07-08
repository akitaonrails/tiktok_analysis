package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.1Ck0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2238861Ck0<TYPE, EXTRA> extends AbstractC2238911Ck5<TYPE, EXTRA> {
    public abstract List<AbstractC2238921Ck6<TYPE, EXTRA>> LIZIZ();

    @Override // X.AbstractC2238911Ck5
    public final void LIZ(C2238881Ck2<TYPE> c2238881Ck2, EXTRA extra, C1576580r84<?> c1576580r84) {
        if (!(c2238881Ck2 instanceof C2238891Ck3) || c1576580r84 == null) {
            return;
        }
        List<AbstractC2238921Ck6<TYPE, EXTRA>> listLIZIZ = LIZIZ();
        synchronized (c2238881Ck2) {
            try {
                for (AbstractC2238921Ck6<TYPE, EXTRA> abstractC2238921Ck6 : listLIZIZ) {
                    if (!((C2238891Ck3) c2238881Ck2).LJIIIZ.contains(abstractC2238921Ck6.getClass())) {
                        c1576580r84.LIZIZ();
                        if (abstractC2238921Ck6.LIZIZ()) {
                            abstractC2238921Ck6.LIZ(c2238881Ck2, extra, c1576580r84);
                            ((C2238891Ck3) c2238881Ck2).LJIIIZ.add(AbstractC2238921Ck6.class);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
