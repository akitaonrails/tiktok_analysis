package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [ITEM] */
/* JADX INFO: renamed from: X.0SZM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZM<ITEM> extends C09AY implements Function1<ITEM, Unit> {
    public final /* synthetic */ C0SZS<R, ITEM> LL;
    public final /* synthetic */ List<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SZM(C0SZS<R, ITEM> c0szs, int i, List<? extends Object> list) {
        super(1);
        this.LL = c0szs;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C0SZS<R, ITEM> c0szs = this.LL;
        List<Object> list = this.LLILLJJLI;
        C0SZU<R, ITEM> c0szu = c0szs.LIZIZ;
        if (c0szu != 0) {
            c0szu.LIZJ(list, obj);
        }
        return Unit.LIZ;
    }
}
