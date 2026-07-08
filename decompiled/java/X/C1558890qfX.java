package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558890qfX extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558890qfX(SaveAssem saveAssem) {
        super(1);
        this.LL = saveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SaveAssem saveAssem = this.LL;
        assembler.QQ2(saveAssem, new C1558880qfW(saveAssem));
        return Unit.LIZ;
    }
}
