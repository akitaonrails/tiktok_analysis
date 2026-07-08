package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Kzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535750Kzl implements InterfaceC534840KyI {
    public final C534910KyP LIZ;

    public C535750Kzl(C534910KyP c534910KyP) {
        this.LIZ = c534910KyP;
    }

    @Override // X.InterfaceC534840KyI
    public final AbstractC19484711Kz<C535020Kya> LIZ(final C535020Kya c535020Kya) {
        final ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ == null) {
            return AbstractC19484711Kz.LJIILLIIL(new RuntimeException("failed to get creationAsyncTaskManager"));
        }
        final C259800zU c259800zU = new C259800zU();
        return C538760LBa.LIZJ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Kzk
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C535020Kya> interfaceC2329309At) {
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C786410Ut5.u3());
                sbLIZ.append(": resolve begin: ");
                sbLIZ.append(c535020Kya);
                sbLIZ.append(' ');
                C201955140j.LIZLLL(c552700Lm0, "AiAliveCRR", C2188811AlT.LIZIZ(sbLIZ));
                C581270Mqz c581270Mqz = new C581270Mqz(CoroutineExceptionHandler.LJJLIL, (C11KT) interfaceC2329309At, 4);
                c259800zU.element = (T) C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), c581270Mqz, null, new C535730Kzj(iCreationAsyncTaskManagerLIZ, c535020Kya, interfaceC2329309At, this, null), 2);
            }
        }).LJJIJIIJIL(30000L, TimeUnit.MILLISECONDS).LJIIJJI(new C581090Mqh(c259800zU, 3)), "AiAliveCRR", "resolve");
    }
}
