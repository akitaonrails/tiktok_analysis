package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.List;

/* JADX INFO: renamed from: X.08nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2225608nm implements IFetchFavoriteList {
    public final /* synthetic */ InterfaceC1364105Vn<List<? extends Effect>> LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
    public final void onFailed(ExceptionResult exceptionResult) {
        Exception runtimeException;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            runtimeException = new RuntimeException("unknown error");
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modify panel favorites failed, panel: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason: ");
        sbLIZ.append(runtimeException.getMessage());
        C201955140j.LJIIIIZZ(c563650M8t, "Favorite", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn<List<? extends Effect>> interfaceC1364105Vn = this.LIZ;
        C098200Yq c098200Yq = new C098200Yq(runtimeException);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
        List<Effect> effects;
        FetchFavoriteListResponse fetchFavoriteListResponse2 = fetchFavoriteListResponse;
        if (fetchFavoriteListResponse2 == null || (effects = fetchFavoriteListResponse2.getEffects()) == null) {
            effects = C13BV.INSTANCE;
        }
        InterfaceC1364105Vn<List<? extends Effect>> interfaceC1364105Vn = this.LIZ;
        List listLJLJJLL = C13LP.LJLJJLL(effects);
        C189200o6.m2constructorimpl(listLJLJJLL);
        interfaceC1364105Vn.resumeWith(listLJLJJLL);
    }

    public C2225608nm(String str, C23260099m c23260099m) {
        this.LIZ = c23260099m;
        this.LIZIZ = str;
    }
}
