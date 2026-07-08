package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19890512s3 extends AbstractC19890312s1<Object> {
    public final /* synthetic */ Iterable LLILLJJLI;
    public final /* synthetic */ InterfaceC1394580mOW LLILLL;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it2 = this.LLILLJJLI.iterator();
        InterfaceC1394580mOW interfaceC1394580mOW = this.LLILLL;
        it2.getClass();
        interfaceC1394580mOW.getClass();
        return new C19853012m0(it2, interfaceC1394580mOW);
    }

    public C19890512s3(Iterable iterable, InterfaceC1394580mOW interfaceC1394580mOW) {
        this.LLILLJJLI = iterable;
        this.LLILLL = interfaceC1394580mOW;
    }
}
