package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.content.CustomizedBoardTextEditContentAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1584906Il extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ CustomizedBoardTextEditContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584906Il(CustomizedBoardTextEditContentAssem customizedBoardTextEditContentAssem) {
        super(1);
        this.LL = customizedBoardTextEditContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1585006Im());
        return Unit.LIZ;
    }
}
