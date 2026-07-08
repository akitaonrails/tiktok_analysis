package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.SceneryLayoutSelectorAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1134904cF extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SceneryLayoutSelectorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134904cF(SceneryLayoutSelectorAssem sceneryLayoutSelectorAssem) {
        super(1);
        this.LL = sceneryLayoutSelectorAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.QQ2(this.LL, new C1134704cD());
        assembler2.QQ2(this.LL, new C1134804cE());
        return Unit.LIZ;
    }
}
