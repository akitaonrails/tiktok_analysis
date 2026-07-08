package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.05Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1322105Fj implements InterfaceC497601wk {
    public static final C1322105Fj LLILLJJLI = new C1322105Fj();
    public static final ConcurrentHashMap<String, Long> LLILLL = new ConcurrentHashMap<>();
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C1322405Fm());
    public static final C01GW LLILZIL = C452501pT.LIZIZ(new C1322205Fk());
    public final /* synthetic */ C054G LL = C2296808zG.LIZ(C0PEM.LIZ);

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play_list_keva_");
        sbLIZ.append(((IAccountUserService) LLILZ.getValue()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
