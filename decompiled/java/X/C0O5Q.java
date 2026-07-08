package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O5Q extends C09AY implements Function2<String, Boolean, Unit> {
    public final /* synthetic */ Function2<String, Boolean, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AwemeCollectionAgent LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C09AE LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O5Q(Function2 function2, String str, AwemeCollectionAgent awemeCollectionAgent, boolean z, AnonymousClass0956 anonymousClass0956) {
        super(2);
        this.LL = function2;
        this.LLILLJJLI = str;
        this.LLILLL = awemeCollectionAgent;
        this.LLILZ = z;
        this.LLILZIL = anonymousClass0956;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        Function2<String, Boolean, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke(this.LLILLJJLI, Boolean.valueOf(zBooleanValue));
        }
        if (!zBooleanValue) {
            AwemeCollectionAgent awemeCollectionAgent = this.LLILLL;
            boolean z = this.LLILZ;
            awemeCollectionAgent.getClass();
            if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false)) {
                Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
            }
            Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str2);
            if (awemeLLILZ == null || AwemeExtKt.isCollected(awemeLLILZ) != z) {
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(z ? 1 : 0, str2);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("is_success", "1");
            C20684815ws.LJIILLIIL("collection_request_result", c2344009Gk.LIZ);
            this.LLILZIL.LIZIZ(null);
        }
        return Unit.LIZ;
    }
}
