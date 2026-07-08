package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS43S0310000_26;

/* JADX INFO: renamed from: X.0v7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730260v7w extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ TemplateEditFragment LL;
    public final /* synthetic */ TemplateItem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C13IQ<? extends Object> LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730260v7w(TemplateEditFragment templateEditFragment, TemplateItem templateItem, boolean z, C19719912Dl c19719912Dl, long j, long j2) {
        super(1);
        this.LL = templateEditFragment;
        this.LLILLJJLI = templateItem;
        this.LLILLL = z;
        this.LLILZ = c19719912Dl;
        this.LLILZIL = j;
        this.LLILZLL = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        TemplateEditFragment templateEditFragment = this.LL;
        assembler2.RQ2(templateEditFragment, new AwS43S0310000_26(assembler2, templateEditFragment, this.LLILLJJLI, this.LLILLL, 2));
        TemplateEditFragment templateEditFragment2 = this.LL;
        assembler2.RQ2(templateEditFragment2, new C1731090v9H(this.LLILZ, assembler2, templateEditFragment2, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLILLL));
        return Unit.LIZ;
    }
}
