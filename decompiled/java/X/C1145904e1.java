package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.CustomizedBoardEditPageAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1145904e1 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ CustomizedBoardEditPageAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145904e1(CustomizedBoardEditPageAssem customizedBoardEditPageAssem) {
        super(1);
        this.LL = customizedBoardEditPageAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.QQ2(this.LL, new C1145704dz());
        if (((C01DP) this.LL.LLJJI.getValue()).LIZ()) {
            assembler2.QQ2(this.LL, new C1145804e0());
        }
        int i = ((C01DP) this.LL.LLJJI.getValue()).LLILLL;
        if (i != 4 && i != 7) {
            assembler2.QQ2(this.LL, new C1133904c5());
        }
        return Unit.LIZ;
    }
}
