package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19853012m0 extends AbstractC19852912lz<Object> {
    public final /* synthetic */ Iterator LLILLL;
    public final /* synthetic */ InterfaceC1394580mOW LLILZ;

    @Override // X.AbstractC19852912lz
    public final Object LIZ() {
        while (this.LLILLL.hasNext()) {
            Object next = this.LLILLL.next();
            if (this.LLILZ.apply(next)) {
                return next;
            }
        }
        this.LL = EnumC19852812ly.DONE;
        return null;
    }

    public C19853012m0(Iterator it2, InterfaceC1394580mOW interfaceC1394580mOW) {
        this.LLILLL = it2;
        this.LLILZ = interfaceC1394580mOW;
    }
}
