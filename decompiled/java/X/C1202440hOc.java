package X;

import com.ss.android.ugc.aweme.poi.experiment.LsComplianceGlobalConfig;
import com.ss.android.ugc.aweme.poi.experiment.LsComplianceSceneConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.compliance.PoiComplianceToastManager", f = "PoiComplianceToastManager.kt", l = {115, 116}, m = "awaitCheck")
public final class C1202440hOc extends AbstractC23140094w {
    public LsComplianceGlobalConfig LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Function1 LLILZIL;
    public LsComplianceSceneConfig LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1202430hOb LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202440hOc(C1202430hOb c1202430hOb, InterfaceC1364105Vn<? super C1202440hOc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c1202430hOb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiComplianceToastManager@7490.awaitCheck$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, null, null, null, this);
        C1C7U.LIZIZ("PoiComplianceToastManager@7490.awaitCheck$1");
        return objLIZ;
    }
}
