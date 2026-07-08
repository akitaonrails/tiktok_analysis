package X;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0951, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0951<T> implements C05YD<T>, InterfaceC346201Wa, InterfaceC23142094y<T> {
    public final C09AE LL;
    public final /* synthetic */ C05YD<T> LLILLJJLI;

    @Override // X.C01S9
    public final List<T> LIZ() {
        return this.LLILLJJLI.LIZ();
    }

    @Override // X.C01S9, X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return this.LLILLJJLI.collect(interfaceC346701Wf, interfaceC1364105Vn);
    }

    @Override // X.C05YD
    public final T getValue() {
        return this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0951(C05YD<? extends T> c05yd, C09AE c09ae) {
        this.LL = c09ae;
        this.LLILLJJLI = c05yd;
    }

    @Override // X.InterfaceC23142094y
    public final InterfaceC346201Wa<T> fuse(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        if (i < 0 ? i == -2 : i < 2) {
            if (enumC2252401DDy == EnumC2252401DDy.DROP_OLDEST) {
                return this;
            }
        }
        if ((i == 0 || i == -3) && enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
            return this;
        }
        return new C23125094h(i, coroutineContext, enumC2252401DDy, this);
    }
}
