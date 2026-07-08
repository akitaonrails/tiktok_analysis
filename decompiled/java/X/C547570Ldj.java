package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaCache;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaRequestParam;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Ldj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547570Ldj implements AIQuotaService {
    public static final C547570Ldj LIZ = new C547570Ldj();

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final boolean LIZ(Source source) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LIZJ(Source source, AITheaterCreationRootScene aITheaterCreationRootScene, AwS587S0100000_8 awS587S0100000_8) {
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LJ(Source source, Integer num, Integer num2) {
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LJFF(Source source, Function1<? super Integer, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final void LJI(Map<Source, QuotaRequestParam> map) {
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final QuotaCache LIZIZ(Source source) {
        return new QuotaCache(null, null, null, null, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService
    public final Object LIZLLL(Source source, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return C2286608xc.LJ(0);
    }
}
