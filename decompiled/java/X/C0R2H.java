package X;

import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R2H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C0R2H extends C2217421BqW implements Function1<LoadMoreResponse, Unit> {
    public final /* synthetic */ C14NX LL;
    public final /* synthetic */ List<List<Map<String, Object>>> LLILLJJLI;
    public final /* synthetic */ TakoNimbleVM LLILLL;
    public final /* synthetic */ C329020Cv6 LLILZ;
    public final /* synthetic */ C0R2E LLILZIL;
    public final /* synthetic */ Map<Integer, List<String>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0R2H(C14NX c14nx, List<List<Map<String, Object>>> list, TakoNimbleVM takoNimbleVM, C329020Cv6 c329020Cv6, C0R2E c0r2e, Map<Integer, ? extends List<String>> map) {
        super(1, C1449605lu.class, "onSuccess", "queryAwemes$onSuccess(Lcom/ss/android/ugc/aweme/nimblecard/tako/element/INimbleViewManager;Ljava/util/List;Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/vm/TakoNimbleVM;Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/vm/LoadMoreMeta;Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/action/ExperienceCardShowAction;Ljava/util/Map;Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/vm/LoadMoreResponse;)V", 0);
        this.LL = c14nx;
        this.LLILLJJLI = list;
        this.LLILLL = takoNimbleVM;
        this.LLILZ = c329020Cv6;
        this.LLILZIL = c0r2e;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoadMoreResponse loadMoreResponse) {
        C0R2E.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, loadMoreResponse);
        return Unit.LIZ;
    }
}
