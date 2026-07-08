package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [ITEM, S] */
/* JADX INFO: renamed from: X.0SxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738060SxI<ITEM, S> extends C09AY implements Function2<ITEM, S, ITEM> {
    public final /* synthetic */ InterfaceC738070SxJ<S, ITEM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738060SxI(InterfaceC738070SxJ<S, ITEM> interfaceC738070SxJ) {
        super(2);
        this.LL = interfaceC738070SxJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        this.LL.state2ItemAccept((InterfaceC0148002o) obj2, obj);
        return obj;
    }
}
