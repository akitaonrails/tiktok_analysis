package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19391010tg<VM extends ViewModel> implements C01GW<VM> {
    public final C13IQ<VM> LL;
    public final C01GW<C194451115t> LLILLJJLI;
    public VM LLILLL;
    public final Map<String, VM> LLILZ = new LinkedHashMap();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, (C19391010tg<ViewModel>) 1084));

    @Override // X.C01GW
    public final Object getValue() {
        VM vm = (VM) ((ViewModelProvider) this.LLILZIL.getValue()).get(C09R7.LIZ(this.LL));
        this.LLILLL = vm;
        return vm;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return (this.LLILLL == null && this.LLILZ.isEmpty()) ? false : true;
    }

    public C19391010tg(C01GW c01gw, C19719912Dl c19719912Dl) {
        this.LL = c19719912Dl;
        this.LLILLJJLI = c01gw;
    }
}
