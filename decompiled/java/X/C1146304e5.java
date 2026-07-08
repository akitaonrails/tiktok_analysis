package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.CustomizedBoardTextEditBottomAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04e5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1146304e5 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ CustomizedBoardTextEditBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146304e5(CustomizedBoardTextEditBottomAssem customizedBoardTextEditBottomAssem) {
        super(1);
        this.LL = customizedBoardTextEditBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.QQ2(this.LL, new C1134604cC());
        if (((C01DP) this.LL.LLIZLLLIL.getValue()).LIZ()) {
            assembler2.RQ2(this.LL, new C1146404e6());
        }
        return Unit.LIZ;
    }
}
