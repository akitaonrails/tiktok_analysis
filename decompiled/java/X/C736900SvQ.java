package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: renamed from: X.0SvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736900SvQ<S> extends C09AY implements Function1<S, S> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<Object> LLILLL;
    public final /* synthetic */ Function2<Object, List<? extends Object>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736900SvQ(Object obj, List list, Object obj2, Function2 function2) {
        super(1);
        this.LL = obj;
        this.LLILLJJLI = obj2;
        this.LLILLL = list;
        this.LLILZ = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.LL;
        C19719512Dh.LJ(3, obj2);
        Object objInvoke = ((InterfaceC1631620sYq) obj2).invoke(obj, this.LLILLJJLI, this.LLILLL);
        Function2<Object, List<? extends Object>, Unit> function2 = this.LLILZ;
        if (function2 != null) {
            function2.invoke(this.LLILLJJLI, this.LLILLL);
        }
        return objInvoke;
    }
}
