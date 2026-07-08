package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514870KHd extends C09AY implements Function2<UIAssem, C0KIP, Unit> {
    public final /* synthetic */ C259800zU<Function1<C0KIP, Unit>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514870KHd(C259800zU<Function1<C0KIP, Unit>> c259800zU) {
        super(2);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C0KIP c0kip) {
        Function1<C0KIP, Unit> function1 = this.LL.element;
        if (function1 != null) {
            function1.invoke(c0kip);
        }
        return Unit.LIZ;
    }
}
