package X;

import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;

/* JADX INFO: renamed from: X.15iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20598415iw extends C2217421BqW implements InterfaceC1631620sYq<String, String, String, C15O7<EffectFetchApiResBean>> {
    public C20598415iw(C20598915j1 c20598915j1) {
        super(3, c20598915j1, C20598915j1.class, "fetchWithoutLogin", "fetchWithoutLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C15O7<EffectFetchApiResBean> invoke(String str, String str2, String str3) {
        return ((EffectFetchApi) C0CHQ.LIZ().getNetworkService().createRetrofit(str, true, EffectFetchApi.class)).getEffectMetaWithoutLogin(str2, str3, "android");
    }
}
