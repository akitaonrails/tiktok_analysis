package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C411201io extends C09AY implements InterfaceC1631620sYq<Boolean, Boolean, String, Unit> {
    public final /* synthetic */ Function2<Boolean, String, Unit> LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C411201io(Function0 function0, Function2 function2) {
        super(3);
        this.LL = function2;
        this.LLILLJJLI = function0;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Boolean bool2, String str) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        if (zBooleanValue) {
            this.LL.invoke(Boolean.valueOf(zBooleanValue2), str);
        }
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
