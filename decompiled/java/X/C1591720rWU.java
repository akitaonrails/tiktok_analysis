package X;

import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591720rWU extends C09AY implements Function0<IMFToolBarAbility> {
    public final /* synthetic */ C1591700rWS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591720rWU(C1591700rWS c1591700rWS) {
        super(0);
        this.LL = c1591700rWS;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IMFToolBarAbility invoke() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.LIZJ);
        if (c19egLIZIZ != null) {
            return C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), IMFToolBarAbility.class, null);
        }
        return null;
    }
}
