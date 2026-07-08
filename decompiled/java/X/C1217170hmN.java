package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217170hmN extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ DecorationEditAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217170hmN(DecorationEditAssem decorationEditAssem, View view) {
        super(1);
        this.LL = decorationEditAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.QQ2(this.LL, new C1217160hmM(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
