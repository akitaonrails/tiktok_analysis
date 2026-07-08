package X;

import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422620n7k extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1422560n7e LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1419590n2r LLILLL;
    public final /* synthetic */ CutsameDataItem LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ITemplateConsumeService LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422620n7k(C1422560n7e c1422560n7e, int i, C1419590n2r c1419590n2r, CutsameDataItem cutsameDataItem, boolean z, ITemplateConsumeService iTemplateConsumeService) {
        super(1);
        this.LL = c1422560n7e;
        this.LLILLJJLI = i;
        this.LLILLL = c1419590n2r;
        this.LLILZ = cutsameDataItem;
        this.LLILZIL = z;
        this.LLILZLL = iTemplateConsumeService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C1422560n7e.R5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        }
        return Unit.LIZ;
    }
}
