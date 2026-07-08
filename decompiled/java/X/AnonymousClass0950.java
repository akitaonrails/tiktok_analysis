package X;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0950, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0950<T> implements C01S9<T>, InterfaceC346201Wa, InterfaceC23142094y<T> {
    public final C09AE LL;
    public final /* synthetic */ C01S9<T> LLILLJJLI;

    @Override // X.C01S9
    public final List<T> LIZ() {
        return this.LLILLJJLI.LIZ();
    }

    @Override // X.C01S9, X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return this.LLILLJJLI.collect(interfaceC346701Wf, interfaceC1364105Vn);
    }

    public AnonymousClass0950(C01S9 c01s9, AnonymousClass0956 anonymousClass0956) {
        this.LL = anonymousClass0956;
        this.LLILLJJLI = c01s9;
    }

    @Override // X.InterfaceC23142094y
    public final InterfaceC346201Wa<T> fuse(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        if ((i == 0 || i == -3) && enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
            return this;
        }
        return new C23125094h(i, coroutineContext, enumC2252401DDy, this);
    }
}
