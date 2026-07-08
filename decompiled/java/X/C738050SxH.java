package X;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [ITEM, S] */
/* JADX INFO: renamed from: X.0SxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738050SxH<ITEM, S> extends C09AY implements InterfaceC1631620sYq<S, ITEM, List<? extends Object>, S> {
    public final /* synthetic */ InterfaceC738070SxJ<S, ITEM> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738050SxH(InterfaceC738070SxJ<S, ITEM> interfaceC738070SxJ) {
        super(3);
        this.LL = interfaceC738070SxJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, List<? extends Object> list) {
        return this.LL.itemSync2StateAccept((InterfaceC0148002o) obj, obj2, list);
    }
}
