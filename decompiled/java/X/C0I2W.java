package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I2W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2W extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ UIAssem LL;
    public final /* synthetic */ C0RUV<? extends AbstractC738140SxQ> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I2W(UIAssem uIAssem, C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        super(1);
        this.LL = uIAssem;
        this.LLILLJJLI = c0ruv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        UIAssem uIAssem = this.LL;
        List<C0RUV<? extends AbstractC738140SxQ>> list = uIAssem.getConfig().LLIZ;
        assembler.wQ2(uIAssem, list);
        return Unit.LIZ;
    }
}
