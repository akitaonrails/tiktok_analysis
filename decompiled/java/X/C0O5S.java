package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeFavoriteCache;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0O5S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O5S extends C09AY implements InterfaceC1631620sYq<String, C0O3E, Boolean, List<? extends IMotaCache>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AwemeCollectionAgent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O5S(String str, AwemeCollectionAgent awemeCollectionAgent) {
        super(3);
        this.LL = str;
        this.LLILLJJLI = awemeCollectionAgent;
    }

    @Override // X.InterfaceC1631620sYq
    public final List<? extends IMotaCache> invoke(String str, C0O3E c0o3e, Boolean bool) {
        Object objCurrentState;
        boolean zBooleanValue = bool.booleanValue();
        String str2 = this.LL;
        if (zBooleanValue) {
            AwemeCollectionAgent awemeCollectionAgent = this.LLILLJJLI;
            objCurrentState = awemeCollectionAgent.LJ(awemeCollectionAgent.currentState(str2, awemeCollectionAgent.defaultState()));
        } else {
            AwemeCollectionAgent awemeCollectionAgent2 = this.LLILLJJLI;
            objCurrentState = awemeCollectionAgent2.currentState(str2, awemeCollectionAgent2.defaultState());
        }
        return Collections.singletonList(new AwemeFavoriteCache(str2, ((Boolean) objCurrentState).booleanValue()));
    }
}
