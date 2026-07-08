package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0d72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037780d72 implements InterfaceC1010530cP5 {
    public final C01GW LL = C452501pT.LIZIZ(new C1037790d73());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1037800d74(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1037810d75(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1037860d7A(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1037900d7E());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C1037840d78());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1037880d7C());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1037830d77());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1037850d79());
    public final C01GW LLJI = C452501pT.LIZIZ(new C1037770d71(this));
    public final C1037870d7B LLJIJIL = new Object() { // from class: X.0d7B
    };

    public final List<InterfaceC1037760d70> LIZ() {
        return (List) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        Iterator<InterfaceC1037760d70> it2 = LIZ().iterator();
        while (it2.hasNext()) {
            it2.next().initialize();
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LLJIJIL;
    }
}
