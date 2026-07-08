package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.MinimalBoardEditPageAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1145404dw extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MinimalBoardEditPageAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145404dw(MinimalBoardEditPageAssem minimalBoardEditPageAssem) {
        super(1);
        this.LL = minimalBoardEditPageAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.QQ2(this.LL, new C1145504dx());
        assembler2.QQ2(this.LL, new C1145604dy());
        return Unit.LIZ;
    }
}
