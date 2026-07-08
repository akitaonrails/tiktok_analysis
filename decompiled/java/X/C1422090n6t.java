package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0n6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422090n6t extends C09AY implements Function1<ShortVideoContext, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1419590n2r LLILLJJLI;
    public final /* synthetic */ TemplateCategoryData LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C1422180n72 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422090n6t(int i, C1419590n2r c1419590n2r, TemplateCategoryData templateCategoryData, long j, C1422180n72 c1422180n72) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c1419590n2r;
        this.LLILLL = templateCategoryData;
        this.LLILZ = j;
        this.LLILZIL = c1422180n72;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ShortVideoContext shortVideoContext) {
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        int i = this.LL;
        C1419590n2r c1419590n2r = this.LLILLJJLI;
        TemplateCategoryData templateCategoryData = this.LLILLL;
        long j = this.LLILZ;
        boolean zLIZ = C1610140s0C.LIZ();
        InterfaceC1422310n7F interfaceC1422310n7F = this.LLILZIL.LIZJ;
        c1419580n2q.getClass();
        C1419580n2q.LJII(shortVideoContext, "mv_shoot_page", i, c1419590n2r, templateCategoryData, j, zLIZ, interfaceC1422310n7F);
        return Unit.LIZ;
    }
}
