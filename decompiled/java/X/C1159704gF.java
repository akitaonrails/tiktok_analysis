package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1159704gF extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsAudienceDecorationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1159704gF(PcsAudienceDecorationAssem pcsAudienceDecorationAssem) {
        super(1);
        this.LL = pcsAudienceDecorationAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.QQ2(this.LL, new C1159504gD());
        assembler2.QQ2(this.LL, new C1159604gE());
        return Unit.LIZ;
    }
}
