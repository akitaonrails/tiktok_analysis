package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20395114rF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20395414rI LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20395114rF(C20395414rI c20395414rI, Function0<Unit> function0, Long l) {
        super(0);
        this.LL = c20395414rI;
        this.LLILLJJLI = function0;
        this.LLILLL = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<?> list = this.LL.LLILLJJLI.LL;
        Long l = this.LLILLL;
        Iterator<?> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C980060bbw) {
                long j = ((C20390914qZ) next).LIZ.playbookId;
                if (l != null && j == l.longValue()) {
                    if (i >= 0 && i < this.LL.LLILLJJLI.LL.size()) {
                        this.LL.LLILLJJLI.notifyItemChanged(i);
                    }
                }
            }
            i++;
        }
        this.LL.LL.SX0(C168A.class, Boolean.TRUE);
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
