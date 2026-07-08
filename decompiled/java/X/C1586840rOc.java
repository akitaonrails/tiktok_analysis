package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0rOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586840rOc implements InterfaceC1006670cIr<C1602200rnO> {
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final int LLILLJJLI = 5;
    public final C603820NmG<String, C1586830rOb> LLILLL = new C603820NmG<>(5);

    public final void LIZ() {
        Collection<C1586830rOb> collectionValues = ((LinkedHashMap) this.LLILLL.LJIIIIZZ()).values();
        if (collectionValues != null) {
            for (C1586830rOb c1586830rOb : collectionValues) {
                C1586820rOa c1586820rOa = C1586820rOa.LIZ;
                int i = c1586830rOb.LIZ;
                Aweme aweme = c1586830rOb.LIZIZ;
                String str = c1586830rOb.LIZJ;
                c1586820rOa.getClass();
                try {
                    C823050WQl.LIZLLL().execute(new RunnableC314550CUr(i, aweme, str));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.getMessage();
                }
            }
        }
        this.LLILLL.LJIIIZ(-1);
    }

    @Override // X.InterfaceC1006670cIr
    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
        if (c1602200rnO2.LIZJ()) {
            LIZ();
            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
        }
    }
}
