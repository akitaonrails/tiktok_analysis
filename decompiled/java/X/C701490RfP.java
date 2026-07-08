package X;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701490RfP implements InterfaceC696030RRx {
    public InterfaceC702000RgE LL;
    public C616040OEg LLILLJJLI;
    public boolean LLILZ;
    public InterfaceC700020Rd2<?> LLILZIL;
    public C704830Rkn LLILZLL;
    public final C701500RfQ LLILLL = new InterfaceC702380Rgq<WeakReference<C704830Rkn>>() { // from class: X.0RfQ
        public final Map<String, InterfaceC702540Rh6> LIZ = new ConcurrentHashMap();

        @Override // X.InterfaceC702380Rgq
        public final void clear() {
            ((ConcurrentHashMap) this.LIZ).clear();
        }

        @Override // X.InterfaceC702380Rgq
        public final InterfaceC702540Rh6 LIZ(Object obj, String str) {
            C701510RfR.LIZ.getClass();
            Function1 function1 = (Function1) ((ConcurrentHashMap) C701510RfR.LIZIZ).get(str);
            if (function1 != null) {
                return (InterfaceC702540Rh6) function1.invoke(obj);
            }
            return null;
        }
    };
    public final C01GW LLIZ = C452501pT.LIZIZ(new C702070RgL());

    @Override // X.InterfaceC696030RRx
    public final InterfaceC695090ROh s0() {
        InterfaceC702000RgE interfaceC702000RgE = this.LL;
        if (interfaceC702000RgE != null) {
            return interfaceC702000RgE.LJFF();
        }
        return null;
    }
}
