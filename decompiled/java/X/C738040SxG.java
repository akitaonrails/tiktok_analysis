package X;

import java.util.List;

/* JADX INFO: renamed from: X.0SxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738040SxG extends C09AY implements InterfaceC1631620sYq<InterfaceC0148002o, Object, List<? extends Object>, InterfaceC0148002o> {
    public final /* synthetic */ InterfaceC738070SxJ<InterfaceC0148002o, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738040SxG(InterfaceC738070SxJ<InterfaceC0148002o, Object> interfaceC738070SxJ) {
        super(3);
        this.LL = interfaceC738070SxJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final InterfaceC0148002o invoke(InterfaceC0148002o interfaceC0148002o, Object obj, List<? extends Object> list) {
        return this.LL.itemSync2StateAccept(interfaceC0148002o, obj, list);
    }
}
