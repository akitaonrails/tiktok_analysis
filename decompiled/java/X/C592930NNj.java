package X;

import com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper", f = "IntelligentPopupHelper.kt", l = {168, 173, 184, 189, 195}, m = "doProcessPopupByIntelligence")
public final class C592930NNj extends AbstractC23140094w {
    public UnifiedAuthPopupConfig LL;
    public Function2 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IntelligentPopupHelper LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592930NNj(IntelligentPopupHelper intelligentPopupHelper, InterfaceC1364105Vn<? super C592930NNj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = intelligentPopupHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IntelligentPopupHelper@f5e9.doProcessPopupByIntelligence$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, this);
        C1C7U.LIZIZ("IntelligentPopupHelper@f5e9.doProcessPopupByIntelligence$1");
        return objLIZ;
    }
}
